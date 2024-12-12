package hu.jandzsogyorgy.pvemanagerbackend.customer.service;

import hu.jandzsogyorgy.pvemanagerbackend.customer.dto.CustomerDto;
import hu.jandzsogyorgy.pvemanagerbackend.customer.entity.Customer;
import hu.jandzsogyorgy.pvemanagerbackend.customer.mapper.CustomerMapper;
import hu.jandzsogyorgy.pvemanagerbackend.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    private Customer findById(Long id){
        return customerRepository.findById(id).orElse(null);
    }


    // List
    public List<CustomerDto> listAllCustomer(){
        return customerMapper.toDto(customerRepository.findAll());
    }

    // Load
    public CustomerDto loadCustomer(Long id){
        return customerMapper.toDto(findById(id));
    }

    // Create
    // Edit
}
