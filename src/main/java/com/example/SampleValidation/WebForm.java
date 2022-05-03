package com.example.SampleValidation;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


import lombok.Data;

@Data
public class WebForm {
    /** 氏名 */
    @NotEmpty(message = "氏名を入力してください")
    private String name;

    /** 年齢 */
    @NotNull(message = "年齢を入力してください")
    @Min(value=0, message = "生後の年齢を入力してください")
    private Integer age;

    /** 郵便番号 */
    @NotNull(message = "郵便番号を入力してください")
    @Pattern(regexp = "[0-9]{3}[-]?[0-9]{4}", message = "郵便番号の形式で入力してください")
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