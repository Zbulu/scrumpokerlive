package com.zbulu.scumpokerlive.backend.model;

import java.util.UUID;

public class Person {
    private String name;
    private final String id;

    Person(String name) {
        this.name = name;
        id = UUID.randomUUID().toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return com.google.common.base.Objects.equal(id, person.id);
    }

    @Override
    public int hashCode() {
        return com.google.common.base.Objects.hashCode(id);
    }
}
