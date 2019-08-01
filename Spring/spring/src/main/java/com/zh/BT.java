package com.zh;

public class BT {
    private String name;
//取得值
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public BT(){

    }
    public String saySomething(String something){
        return "zh"+something;
    }
}
