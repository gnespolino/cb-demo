package com.example.cbdemo;

import com.example.cbdemo.model.MyDoc;
import org.springframework.data.repository.CrudRepository;

public interface MyDocRepo extends CrudRepository<MyDoc, String> {
    MyDoc findByValue(String aString);
}
