package com.zh;

public class AT {
    private int age;
    private String name;
    private double height;
    private BT b;
//使用setter方法注入
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public AT(){}

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public BT getBT() {
        return b;
    }
    public void setBT(BT b){
       this.b=b;
    }
    public void callbyMethod(){
        System.out.println(b.saySomething("good"));
    }
}

