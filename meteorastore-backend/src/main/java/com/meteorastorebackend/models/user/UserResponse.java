package com.meteorastorebackend.models.user;

public record UserResponse(
        String firstName,
        String lastName,
        String email
) {
}
