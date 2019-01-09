package com.apress.springrecipes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {

    private Long id;
    private String author;
    private String title;
    private String body;
}
