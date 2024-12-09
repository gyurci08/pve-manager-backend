package hu.jandzsogyorgy.pvemanagerbackend.auth.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.List;

@Data
public class User {
    @Id
    private Long id;
    private String username;
    private String password;

    @MappedCollection(idColumn = "role_id", keyColumn = "user_id")
    private List<UserRole> roles;
}