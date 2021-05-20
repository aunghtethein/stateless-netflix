package com.example.counterservice.ds;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CounterServiceRequest {

    private Integer number;

    public CounterServiceRequest(@JsonProperty("number")int number){
        this.number=number;
    }

    public Integer getNumber() {
        return number;
    }
}
