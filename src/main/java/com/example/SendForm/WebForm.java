package com.example.SendForm;

public class WebForm {
    /** 氏名 */
    private String name;

    /** 年齢 */
    private Integer age;

    /** 郵便番号 */
    private String postal;

    public WebForm(){

    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(Integer age){
        this.age = age;
    }

    public String getPostal(){
        return postal;
    }

    public void setPostal(String postal){
        this.postal = postal;
    }
}