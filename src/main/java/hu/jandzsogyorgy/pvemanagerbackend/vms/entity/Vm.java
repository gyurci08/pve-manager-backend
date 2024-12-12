package hu.jandzsogyorgy.pvemanagerbackend.vms.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("vms")
public class Vm {
    @Id
    private Long id;
    private Long customerId;
    private String name;
    private int flavorId;
    private int applicationId;
    private String proxmoxId;
    private String status;
}
