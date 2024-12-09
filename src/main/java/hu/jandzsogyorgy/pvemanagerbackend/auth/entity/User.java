package hu.jandzsogyorgy.pvemanagerbackend.auth.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;

@Table("appuser")
@Data
public class User {
    @Id
    private Long id;
    private String username;
    private String password;

    @MappedCollection(keyColumn = "id", idColumn = "id")
    private List<Role> roles;
}