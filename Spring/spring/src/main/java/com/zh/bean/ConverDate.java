package com.zh.bean;

import com.sun.javafx.scene.layout.region.Margins;
import org.springframework.core.convert.converter.Converter;

import java.beans.PropertyEditorSupport;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConverDate extends PropertyEditorSupport{
    public String pattern ="yyyy-MM-dd";

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("text="+text);
        try{
            SimpleDateFormat simpleDateFormat=new SimpleDateFormat(pattern);
            Date date=simpleDateFormat.parse(text);
            this.setValue(date);
    }catch(Exception e){
            e.printStackTrace();
        }
}
}
