package com.meteorastorebackend.persistence.repositories;

import com.meteorastorebackend.persistence.entites.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {
}
