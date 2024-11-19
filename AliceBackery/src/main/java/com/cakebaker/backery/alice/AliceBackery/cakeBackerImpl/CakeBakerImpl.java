package com.cakebaker.backery.alice.AliceBackery.cakeBackerImpl;

import com.cakebaker.backery.alice.AliceBackery.cakeBaker.CakeBaker;
import com.cakebaker.backery.alice.AliceBackery.frostingAndSyrup.Frosting;
import com.cakebaker.backery.alice.AliceBackery.frostingAndSyrup.Syrup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeBakerImpl implements CakeBaker {

    @Autowired
    Frosting frosting;
    @Autowired
    Syrup syrup;

    public void bakeCake() {

        System.out.println("Welcome to Alice Cake Bakery");
        System.out.println("Frosting used "+ frosting.getFrostingType());
        System.out.println("Syrup used "+ syrup.getSyrupType());

    }
}
