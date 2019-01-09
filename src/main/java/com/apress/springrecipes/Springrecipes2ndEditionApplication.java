package com.apress.springrecipes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springrecipes2ndEditionApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Springrecipes2ndEditionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        MessageBoardService messageBoardService = new MessageBoardServiceImpl();
        messageBoardService.postMessage(new Message());
    }
}

