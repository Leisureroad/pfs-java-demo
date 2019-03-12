package com.example.pfsjavademo;

import java.util.function.Function;

public class HelloFunction implements Function<String, String> {
    @Override
    public String apply(String s) {
        String result = "Hello" + s + ", !";
        System.out.println(result);
        return result;
    }
}
