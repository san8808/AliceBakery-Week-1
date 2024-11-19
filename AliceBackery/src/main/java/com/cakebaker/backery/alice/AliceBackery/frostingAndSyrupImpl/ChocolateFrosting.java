package com.cakebaker.backery.alice.AliceBackery.frostingAndSyrupImpl;

import com.cakebaker.backery.alice.AliceBackery.frostingAndSyrup.Frosting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(name = "cake.flavour", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting {

    public String getFrostingType() {
        return "Chocolate Frosting";
    }
}
