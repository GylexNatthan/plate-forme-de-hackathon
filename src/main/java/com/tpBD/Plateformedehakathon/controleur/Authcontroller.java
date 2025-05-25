package com.tpBD.Plateformedehakathon.controleur;

import com.tpBD.Plateformedehakathon.Entity.UserDto;
import com.tpBD.Plateformedehakathon.repositories.UserRepository;
import com.tpBD.Plateformedehakathon.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserDto userDto) {
        return authService.Instription(userDto);
    }
}
