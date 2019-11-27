package com.trilochan.newrecycleview;

public class Students {

private String name;
private  String address;
private int age;
private int gender;
private int imageid;

    public Students(String name, String address, int age, int gender) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
        this.imageid = imageid;
    }

    public int getImageid() {
        return imageid;
    }

    public void setImageid(int imageid) {
        this.imageid = imageid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }


}
