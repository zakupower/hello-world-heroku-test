package com.tomov.helloworldapp.services;

import com.tomov.helloworldapp.data.HelloMessage;
import com.tomov.helloworldapp.data.HelloMessageRequest;

import java.util.List;

public interface HelloMessageService {
    List<HelloMessage> getAll();

    HelloMessage getById(Integer helloId);

    HelloMessage create(HelloMessageRequest helloMessageRequest);

    void deleteById(Integer helloId);
}
