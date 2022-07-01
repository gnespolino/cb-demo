package com.example.cbdemo;

import com.example.cbdemo.model.MyDoc;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyDocService {

    private final MyDocRepo myDocRepo;


    public MyDocService(MyDocRepo myDocRepo) {
        this.myDocRepo = myDocRepo;
    }

    public MyDoc save(MyDoc myDoc) {
        return myDocRepo.save(myDoc);
    }

    public Optional<MyDoc> findById(String id) {
        return myDocRepo.findById(id);
    }


}
