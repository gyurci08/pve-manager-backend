package hu.jandzsogyorgy.pvemanagerbackend.auth.repository;

import hu.jandzsogyorgy.pvemanagerbackend.auth.entity.User;
import hu.jandzsogyorgy.pvemanagerbackend.auth.entity.UserRole;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRoleRepository extends ListCrudRepository<UserRole, Long> {
}
