package com.registration.springboot.controller;

import com.registration.springboot.exception.ResourceNotFoundException;
import com.registration.springboot.model.Login;
import com.registration.springboot.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v2")
public class LoginController {
    @Autowired
    private LoginRepository loginRepository;

    @GetMapping("/login")
    public List<Login> getAllLoginDetails() {
        return loginRepository.findAll();
    }

    @GetMapping("/login/{id}")
    public ResponseEntity<Login> getLoginById(@PathVariable(value = "id") Long ccsuId)
            throws ResourceNotFoundException {
        Login login = loginRepository.findById(ccsuId)
                .orElseThrow(() -> new ResourceNotFoundException("Login not found for this id : " + ccsuId));
        return ResponseEntity.ok().body(login);
    }

    @PostMapping("/login")
    public Login createLogin(@Valid @RequestBody Login login) {
        return loginRepository.save(login);
    }

}
