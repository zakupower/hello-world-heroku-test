package com.tomov.helloworldapp.controllers;

import com.tomov.helloworldapp.services.HelloMessageService;
import com.tomov.helloworldapp.entites.HelloMessage;
import com.tomov.helloworldapp.dtos.HelloMessageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloMessageController {
    private HelloMessageService helloMessageService;

    @Autowired
    public HelloMessageController(HelloMessageService helloMessageService) {
        this.helloMessageService = helloMessageService;
    }

    @GetMapping("/hellos")
    public List<HelloMessage> getAll() {
        return helloMessageService.getAll();
    }

    @GetMapping("/hellos/{helloId}")
    public HelloMessage getById(@PathVariable Integer helloId) {
        return helloMessageService.getById(helloId);
    }

    @PostMapping("/hellos")
    public HelloMessage create(@RequestBody HelloMessageRequest helloMessageRequest) {
        return helloMessageService.create(helloMessageRequest);
    }

    @DeleteMapping("/hellos/{helloId}")
    public void deleteById(@PathVariable Integer helloId) {
        helloMessageService.deleteById(helloId);
    }
}
