package com.example.SampleAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class BooksService {
    private RestTemplate restTemplate;

    @Autowired
    public BooksService(RestTemplateBuilder builder){
        // RestTemplateの初期化
        this.restTemplate = builder.build();
    }

    //通信先URL
    private static final String URL ="http://private-bde553-bookmanagementapi.apiary-mock.com/books";

    public BooksDto[] getBooks() {
        //リクエストパラメータ(?name=Angularの部分)構成
        Map<String, String> params = new HashMap<String,String>();
        params.put("name", "Angular");
        return restTemplate.getForObject(URL,BooksDto[].class, params);
    }
}
