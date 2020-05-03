package com.tomov.helloworldapp.services;

import com.tomov.helloworldapp.dtos.HelloMessageRequest;
import com.tomov.helloworldapp.entites.HelloMessage;
import com.tomov.helloworldapp.repositories.HelloMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelloMessageServiceImpl implements HelloMessageService {
    private HelloMessageRepository helloMessageRepository;

    @Autowired
    public HelloMessageServiceImpl(HelloMessageRepository helloMessageRepository) {
        this.helloMessageRepository = helloMessageRepository;
    }

    @Override
    public List<HelloMessage> getAll() {
        return helloMessageRepository.findAll();
    }

    @Override
    public HelloMessage getById(Integer helloId) {
        return helloMessageRepository.findById(helloId)
                .orElse(null);
    }

    @Override
    public HelloMessage create(HelloMessageRequest helloMessageRequest) {
        HelloMessage helloMessage = new HelloMessage();
        helloMessage.setGreeting(helloMessageRequest.getGreeting());
        helloMessage.setName(helloMessageRequest.getName());
        helloMessage.setPersonal(helloMessageRequest.isPersonal());
        return helloMessageRepository.save(helloMessage);
    }

    @Override
    public void deleteById(Integer helloId) {
        helloMessageRepository.deleteById(helloId);
    }
}
