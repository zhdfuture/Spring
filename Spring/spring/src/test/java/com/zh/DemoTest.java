package com.zh;
import com.zh.bean.Bean1;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import com.zh.AT;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest {
    private ApplicationContext context=null;
    @Before
    public void initMethod() {
       // context = new ClassPathXmlApplicationContext(new String[]{"applicationContext-first.xml"});
        context = new ClassPathXmlApplicationContext(new String[]{"applicationContext-beans.xml"});
    }
    @Test
        public void testRelevantAAndB(){
//            AT a=(AT)context.getBean("a");
//            System.out.println(a.getBT().saySomething("good"));
        Bean1 bean1=(Bean1)context.getBean("bean1");
        System.out.println("bean1.strValue = " + bean1.getStrValue());

        System.out.println("bean1.intValue = " + bean1.getIntValue());
        System.out.println("bean1.listValue = " + bean1.getListValue());
        System.out.println("bean1.setValue = " + bean1.getSetValue());
        System.out.println("bean1.mapValue = " + bean1.getMapValue());
        System.out.println("bean1.arrayValue = " + bean1.getArrayStr());
        //date
        System.out.println("bean1.date = " + bean1.getDate());
    }
    }
