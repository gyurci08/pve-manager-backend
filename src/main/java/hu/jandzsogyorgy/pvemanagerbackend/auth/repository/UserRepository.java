package hu.jandzsogyorgy.pvemanagerbackend.auth.repository;

import hu.jandzsogyorgy.pvemanagerbackend.auth.entity.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, Long> {
}
