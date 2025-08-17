package com.geargames.api.dto;

public record LoginRequestDTO(
    String name,
    String email,
    String token,
    String password
) {

}
