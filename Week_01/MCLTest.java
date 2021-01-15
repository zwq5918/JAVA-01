package com.bestway.tools;

public class MCLTest {
    public static void main(String[] args) {
        MyClassLoader myClassLoader = new MyClassLoader("D://Hello/");
        try {
            Class clazz = myClassLoader.findClass("Hello");
            System.out.println(clazz);
            System.out.println(clazz.getConstructor().newInstance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
