package hu.jandzsogyorgy.pvemanagerbackend.auth.repository;

import hu.jandzsogyorgy.pvemanagerbackend.auth.entity.Role;
import hu.jandzsogyorgy.pvemanagerbackend.auth.entity.User;
import org.springframework.data.repository.ListCrudRepository;

public interface RoleRepository extends ListCrudRepository<Role, Long> {
}
