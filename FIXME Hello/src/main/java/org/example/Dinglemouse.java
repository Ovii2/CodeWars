package org.example;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dinglemouse {
    String name;
    int age;
    char sex;

    Set<String> mySet = new LinkedHashSet<>();

    public Dinglemouse() {
    }

    public Dinglemouse setAge(int age) {
        mySet.add("age");
        this.age = age;
        return this;
    }

    public Dinglemouse setSex(char sex) {
        mySet.add("sex");
        this.sex = sex;
        return this;
    }

    public Dinglemouse setName(String name) {
        mySet.add("name");
        this.name = name;
        return this;
    }

    public String hello() {
        StringBuilder result = new StringBuilder();
        result.append("Hello.");
        mySet.forEach(attr -> {
            switch (attr) {
                case "name" -> result.append(" My name is ").append(name).append(".");
                case "age" -> result.append(" I am ").append(age).append(".");
                case "sex" -> result.append(" I am ").append(sex == 'M' ? "male" : "female").append(".");
            }
        });
        return result.toString();
    }
}
