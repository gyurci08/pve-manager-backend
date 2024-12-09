package hu.jandzsogyorgy.pvemanagerbackend.auth.dto;

import java.util.List;

public record UserDto(
        Long id,
        String username,
        String password,

        List<UserRoleDto> roles
) {
}
