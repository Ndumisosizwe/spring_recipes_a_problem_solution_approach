package com.apress.springrecipes;

import com.apress.springrecipes.entity.Cashier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRecipes2ndEditionApplication implements
        CommandLineRunner {

    private final Cashier cashier;

    @Autowired
    public SpringRecipes2ndEditionApplication(Cashier cashier) {
        this.cashier = cashier;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringRecipes2ndEditionApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        System.out.println(cashier.getPath());
    }
}

