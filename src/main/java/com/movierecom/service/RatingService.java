package com.movierecom.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class RatingService {

    public String greeting(String name){
        return "hello "+ name;
    }
}
