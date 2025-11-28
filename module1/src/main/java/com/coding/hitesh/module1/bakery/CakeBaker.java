package com.coding.hitesh.module1.bakery;

import org.springframework.beans.factory.annotation.Autowired;
import com.coding.hitesh.module1.material.Syrup;
import com.coding.hitesh.module1.material.Frosting;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker
{
    @Autowired
    @Qualifier("chocolateSyrup")
    private Syrup syrup;

    @Autowired
    @Qualifier("chocolateFrosting")
    private Frosting frosting;


    public void bakeCake()
    {
        System.out.println("Cake is baked using "+frosting.getFrostingType("chocolate")+" and "+syrup.getSyrupType("chocolate"));

    }
}
