package com.tpBD.Plateformedehakathon.service;

import com.tpBD.Plateformedehakathon.Entity.UserDto;
import com.tpBD.Plateformedehakathon.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public ResponseEntity<?> Instription(UserDto userDto ) {
        return ResponseEntity.ok().body(userRepository.save(userDto));
    }

}

