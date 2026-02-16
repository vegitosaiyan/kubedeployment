package com.example.kubedeploy.repository;

import com.example.kubedeploy.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration,Long> {
    boolean existsByEmail(String email);
}
