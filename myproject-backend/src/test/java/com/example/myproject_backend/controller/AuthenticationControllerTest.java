package com.example.myproject_backend.controller;

import com.example.myproject_backend.entity.User;
import com.example.myproject_backend.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class AuthenticationControllerTest {

    @Mock
    UserRepository userRepository;

    @Mock
    PasswordEncoder encoder;

    @InjectMocks
    AuthenticationController authenticationController;

    @BeforeEach
    void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testingExistingUserwhichTheUserAlreadyExist() {
        User u = new User();
        u.setUsername("alex");
        u.setPassword("123");
        when(userRepository.existsByUsername("alex")).thenReturn(true);
        ResponseEntity<?> res = authenticationController.registerUser(u);
        assertEquals(HttpStatus.BAD_REQUEST, res.getStatusCode());
    }

    @Test
    void TestingRegisteringUser() {
        User user2 = new User();
        user2.setUsername("Alex");
        user2.setPassword("123");

        when(userRepository.existsByUsername("Alex")).thenReturn(false);
        when(encoder.encode("123")).thenReturn("encoded_pass");

        ResponseEntity<?> res = authenticationController.registerUser(user2);

        verify(userRepository, times(1)).save(user2);
        assertEquals(HttpStatus.CREATED, res.getStatusCode());
    }
    @Test
    void testingLoginAPI() {
        ResponseEntity<?> response = authenticationController.loginUser();
        assertEquals(HttpStatus.OK, response.getStatusCode());

    }
}