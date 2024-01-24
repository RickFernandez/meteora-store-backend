package com.meteorastorebackend.persistence.repositories;

import com.meteorastorebackend.persistence.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
