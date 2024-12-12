package hu.jandzsogyorgy.pvemanagerbackend.vms.dto;

public record VmDto(
        Long id,
        Long customerId,
        String name,
        int flavorId,
        int applicationId,
        String proxmoxId,
        String status
){

}
