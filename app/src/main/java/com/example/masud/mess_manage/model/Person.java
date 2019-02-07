package com.example.masud.mess_manage.model;

public class Person {
    private int image ;
    private String name;
    private int cost;


    public Person(int image,String name,int cost){
        this.image=image;
        this.name = name;
       this.image=cost;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
