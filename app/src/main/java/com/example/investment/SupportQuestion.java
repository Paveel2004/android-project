package com.example.investment;

public class SupportQuestion {
    private String name;
    private String email;
    private String question;

    public SupportQuestion(String name, String email, String question){
        this.name = name;
        this.email = email;
        this.question = question;
    }
    //Set
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setQuestion(String question){
        this.name = question;
    }
    //Get
    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getQuestion() {
        return question;
    }

}

