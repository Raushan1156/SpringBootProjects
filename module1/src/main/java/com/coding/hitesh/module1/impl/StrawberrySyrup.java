package com.coding.hitesh.module1.impl;

import com.coding.hitesh.module1.material.Syrup;
import org.springframework.stereotype.Component;

@Component
public class StrawberrySyrup implements Syrup {

    public String getSyrupType(String syrupType)
    {
        return "Strawberry Syrup";
    }
}
