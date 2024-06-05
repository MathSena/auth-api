package org.mathsena.authapi.models.user;

public record RegisterDTO(String login, String password, UserRole role) {
}