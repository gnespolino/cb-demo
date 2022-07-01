package com.example.cbdemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;

@Document
public class MyDoc {
    @Id
    private String id;

    private String value;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MyDoc{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
