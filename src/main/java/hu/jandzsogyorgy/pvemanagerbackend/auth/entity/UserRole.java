package hu.jandzsogyorgy.pvemanagerbackend.auth.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class UserRole {
    @Id
    private Long id;
    private Long userId;
    private Long roleId;
}
