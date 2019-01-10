package com.apress.springrecipes.chapter2.enviromentsandprofiles.entity;

import com.apress.springrecipes.entity.Cashier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("global")
@ComponentScan("com.apress.springrecipes")
public class ShopConfigurationGlobal {

    @Bean
    public Cashier cashier() {
        final String path = System.getProperty("java.io.tmpdir") + " cashier";
        Cashier cashier = new Cashier();
        cashier.setFileName("checkout");
        cashier.setPath(path);
        return cashier;
    }

}
