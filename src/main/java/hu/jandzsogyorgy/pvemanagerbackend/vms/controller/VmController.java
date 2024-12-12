package hu.jandzsogyorgy.pvemanagerbackend.vms.controller;

import hu.jandzsogyorgy.pvemanagerbackend.vms.dto.VmDto;
import hu.jandzsogyorgy.pvemanagerbackend.vms.service.VmService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@ApiResponse(responseCode = "200", description = "Successful request")
@ApiResponse(responseCode = "500", description = "Internal server error")
@AllArgsConstructor
public class VmController {
    private final VmService vmService;

    // List, Load


    @GetMapping("/vm")
    public List<VmDto> listAllVm() {
        return vmService.listAllVm();
    }
    @GetMapping("/vm/{vmId}")
    public VmDto loadVm(@PathVariable Long vmId) {
        return vmService.loadVm(vmId);
    }


    @GetMapping("/customer/{id}/vm")
    public List<VmDto> listAllVmByCustomer(@PathVariable Long id) {
        return vmService.listAllVmByCustomer(id);
    }
    @GetMapping("/customer/{customerId}/vm/{vmId}")
    public List<VmDto> loadVmByCustomer(@PathVariable Long customerId, @PathVariable Long vmId) {
        return vmService.listAllVmByCustomer(customerId);
    }



    // Create
    @PostMapping("/vm")
    public VmDto createVm(@RequestBody VmDto VmDto) {
        return vmService.createVm(VmDto);
    }

}
