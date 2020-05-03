package com.tomov.helloworldapp.services;

import com.tomov.helloworldapp.data.HelloMessage;
import com.tomov.helloworldapp.data.HelloMessageRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HelloMessageServiceImpl implements HelloMessageService {
    private static Integer lastId = 0;
    private static final Map<Integer, HelloMessage> HELLO_MESSAGE_MAP = new HashMap<>();

    @Override
    public List<HelloMessage> getAll() {
        return new ArrayList<>(HELLO_MESSAGE_MAP.values());
    }

    @Override
    public HelloMessage getById(Integer helloId) {
        return HELLO_MESSAGE_MAP.get(helloId);
    }

    @Override
    public HelloMessage create(HelloMessageRequest helloMessageRequest) {
        HelloMessage helloMessage = new HelloMessage(lastId++
                ,helloMessageRequest.getGreeting()
                ,helloMessageRequest.getName()
                ,helloMessageRequest.isPersonal());
        HELLO_MESSAGE_MAP.put(helloMessage.getId(),helloMessage);
        return helloMessage;
    }

    @Override
    public void deleteById(Integer helloId) {
        HELLO_MESSAGE_MAP.remove(helloId);
    }
}
