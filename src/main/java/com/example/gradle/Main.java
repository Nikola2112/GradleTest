package com.example.gradle;

import com.example.gradle.Person;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Nikolai","Vynohradov");
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json);
    }
}
