package com.commerce.demo.ExceptionHandling;

import java.util.Date;

public class NotFoundExceptionDetails {
    private String message;
    private Date date;
    private String url;

    public NotFoundExceptionDetails() {
        date = new Date(System.currentTimeMillis());
    }

    public NotFoundExceptionDetails(String message) {
        this();
        this.message = message;

    }

    public NotFoundExceptionDetails(String message, String url) {
        this();
        this.message = message;
        this.url = url;

    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public String getUrl() {
        return url;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
