package hu.jandzsogyorgy.pvemanagerbackend.api;

import hu.jandzsogyorgy.pvemanagerbackend.customer.dto.CustomerDto;
import hu.jandzsogyorgy.pvemanagerbackend.customer.service.CustomerService;
import hu.jandzsogyorgy.pvemanagerbackend.vms.dto.VmDto;
import hu.jandzsogyorgy.pvemanagerbackend.vms.service.VmService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@ApiResponse(responseCode = "200", description = "Successful request")
@ApiResponse(responseCode = "500", description = "Internal server error")
@AllArgsConstructor
public class ApiController {
    private final CustomerService customerService;
    private final VmService vmService;


    // Customer API
    @GetMapping("customer")
    public List<CustomerDto> listAllCustomer(){
        return customerService.listAllCustomer();
    }

    @GetMapping("customer/{id}")
    public CustomerDto loadCustomer(@PathVariable Long id){
        return customerService.loadCustomer(id);
    }




    // VM API
    @GetMapping("vm")
    public List<VmDto> listAllVm(){
        return vmService.listAllVm();
    }

    @GetMapping("customer/{id}/vm")
    public List<VmDto> listAllVmByCustomer(@PathVariable Long id){
        return vmService.listAllVmByCustomer(id);
    }

    @GetMapping("vm/{id}")
    public VmDto loadVm(@PathVariable Long id){
        return vmService.loadVm(id);
    }



}
