package hu.jandzsogyorgy.pvemanagerbackend.auth.entity;

import org.springframework.data.annotation.Id;

public class Role {
    @Id
    private Long id;
    private String name;
}
