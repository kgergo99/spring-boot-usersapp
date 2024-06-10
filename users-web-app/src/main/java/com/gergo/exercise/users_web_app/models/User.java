package com.gergo.exercise.users_web_app.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String name;
    private String language;
    private String id;
    private String bio;
    private String version;
}
