package com.example.springboottest.Exception;

public class DemoApplicationException  extends RuntimeException {
    public DemoApplicationException(String msg) {
        super(msg);
    }
}
