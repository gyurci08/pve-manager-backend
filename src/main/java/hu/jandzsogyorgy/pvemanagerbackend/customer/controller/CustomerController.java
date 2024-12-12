package hu.jandzsogyorgy.pvemanagerbackend.customer.controller;

import hu.jandzsogyorgy.pvemanagerbackend.customer.dto.CustomerDto;
import hu.jandzsogyorgy.pvemanagerbackend.customer.service.CustomerService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/customer", produces = MediaType.APPLICATION_JSON_VALUE)
@ApiResponse(responseCode = "200", description = "Successful request")
@ApiResponse(responseCode = "500", description = "Internal server error")
@AllArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public List<CustomerDto> listAllCustomer() {
        return customerService.listAllCustomer();
    }

    @GetMapping("/{id}")
    public CustomerDto loadCustomer(@PathVariable Long id) {
        return customerService.loadCustomer(id);
    }
}
