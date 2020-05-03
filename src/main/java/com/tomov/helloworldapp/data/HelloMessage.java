package com.tomov.helloworldapp.data;

public class HelloMessage {
    private Integer id;
    private String greeting;
    private String name;
    private boolean isPersonal;

    public HelloMessage(Integer id, String greeting, String name, boolean isPersonal) {
        this.id = id;
        this.greeting = greeting;
        this.name = name;
        this.isPersonal = isPersonal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPersonal() {
        return isPersonal;
    }

    public void setPersonal(boolean personal) {
        isPersonal = personal;
    }
}
