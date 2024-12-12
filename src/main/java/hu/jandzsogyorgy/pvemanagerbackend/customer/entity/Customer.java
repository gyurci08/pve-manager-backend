package hu.jandzsogyorgy.pvemanagerbackend.customer.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("customers")
public class Customer {
    @Id
    Long id;
    String name;
    String email;
}
