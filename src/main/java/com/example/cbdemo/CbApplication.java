package com.example.cbdemo;

import com.example.cbdemo.model.MyDoc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.couchbase.repository.config.EnableCouchbaseRepositories;

@SpringBootApplication
@EnableCouchbaseRepositories
public class CbApplication {

    private final MyDocService myDocService;

    public CbApplication(MyDocService myDocService) {
        this.myDocService = myDocService;
    }

    public static void main(String[] args) {
        SpringApplication.run(CbApplication.class, args);
    }

    @EventListener(ApplicationStartedEvent.class)
    public void postStartup() {
        MyDoc myDoc = new MyDoc();
        myDoc.setValue("aString");
        String id = myDocService.save(myDoc).getId();

        System.out.println(myDocService.findById(id).map(MyDoc::toString).orElse("DocumentNotFound"));
    }

}
