package com.tomov.helloworldapp.repositories;

import com.tomov.helloworldapp.entites.HelloMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloMessageRepository extends JpaRepository<HelloMessage,Integer> {
}
