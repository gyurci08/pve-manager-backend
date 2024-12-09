package hu.jandzsogyorgy.pvemanagerbackend.auth.mapping;

import hu.jandzsogyorgy.pvemanagerbackend.auth.dto.UserDto;
import hu.jandzsogyorgy.pvemanagerbackend.auth.dto.UserRoleDto;
import hu.jandzsogyorgy.pvemanagerbackend.auth.entity.User;
import hu.jandzsogyorgy.pvemanagerbackend.auth.entity.UserRole;
import hu.jandzsogyorgy.pvemanagerbackend.common.dto.GenericMapper;
import hu.jandzsogyorgy.pvemanagerbackend.config.MappingConfig;
import org.mapstruct.Mapper;

@Mapper(config = MappingConfig.class)
public interface UserRoleMapper extends GenericMapper<UserRole, UserRoleDto> {
}
