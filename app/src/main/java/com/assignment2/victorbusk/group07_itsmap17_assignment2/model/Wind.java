package com.assignment2.victorbusk.group07_itsmap17_assignment2.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// Created by http://www.jsonschema2pojo.org/
public class Wind {

    @SerializedName("speed")
    @Expose
    public Double speed;
    @SerializedName("deg")
    @Expose
    public Double deg;

}
