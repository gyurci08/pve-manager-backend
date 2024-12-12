package hu.jandzsogyorgy.pvemanagerbackend.vms.service;

import hu.jandzsogyorgy.pvemanagerbackend.customer.dto.CustomerDto;
import hu.jandzsogyorgy.pvemanagerbackend.customer.entity.Customer;
import hu.jandzsogyorgy.pvemanagerbackend.vms.dto.VmDto;
import hu.jandzsogyorgy.pvemanagerbackend.vms.entity.Vm;
import hu.jandzsogyorgy.pvemanagerbackend.vms.mapper.VmMapper;
import hu.jandzsogyorgy.pvemanagerbackend.vms.repository.VmRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class VmService {
    private final VmRepository vmRepository;
    private final VmMapper vmMapper;

    private Vm findById(Long id){
        return vmRepository.findById(id).orElse(null);
    }




    // List
    public List<VmDto> listAllVm(){
        return vmMapper.toDto(vmRepository.findAll());
    }

    public List<VmDto> listAllVmByCustomer(Long id){
        return vmMapper.toDto(vmRepository.findAllByCustomerId(id));
    }

    // Load
    public VmDto loadVm(Long id){
        return vmMapper.toDto(findById(id));
    }

    // Create
    // Edit
}
