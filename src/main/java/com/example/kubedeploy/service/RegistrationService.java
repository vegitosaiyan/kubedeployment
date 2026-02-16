package com.example.kubedeploy.service;

import com.example.kubedeploy.entity.Registration;
import com.example.kubedeploy.repository.RegistrationRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RegistrationService {

    private final RegistrationRepo registrationRepository;

    public Registration registerUser(Registration registration) {
        if (registrationRepository.existsByEmail(registration.getEmail())) {
            throw new RuntimeException("Email already exists: " + registration.getEmail());
        }
        return registrationRepository.save(registration);
    }

    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    public Registration getRegistrationById(Long id) {
        return registrationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Registration not found with id: " + id));
    }
}