package com.example.springboot.test;


import org.junit.Test;

import java.util.Date;

/**
 * @Author zhouguanya
 * @Date 2018/2/12
 * @Description
 */
public class TestDemo {

    private Date createdate = new Date();

    @Test
    public void test() {
        System.out.println(createdate);
    }
}
