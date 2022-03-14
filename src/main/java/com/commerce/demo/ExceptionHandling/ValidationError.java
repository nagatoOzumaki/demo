package com.commerce.demo.ExceptionHandling;

import java.util.Date;
import java.util.List;

public class ValidationError {
    private String url;
    private List<String> errors;
    private Date date;

    public ValidationError() {

    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getDate() {
        return date;
    }

    public String getUrl() {
        return url;
    }

    public void addErrors(String error) {
        this.errors.add(error);
    }

}
