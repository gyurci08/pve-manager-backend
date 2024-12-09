package hu.jandzsogyorgy.pvemanagerbackend.auth.dto;

public record UserRoleDto(
        Long id,
        Long userId,
        Long roleId
) {

}
