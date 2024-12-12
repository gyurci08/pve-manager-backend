package hu.jandzsogyorgy.pvemanagerbackend.customer.mapper;

import hu.jandzsogyorgy.pvemanagerbackend.common.generic.dto.GenericMapper;
import hu.jandzsogyorgy.pvemanagerbackend.config.MappingConfig;
import hu.jandzsogyorgy.pvemanagerbackend.customer.dto.CustomerDto;
import hu.jandzsogyorgy.pvemanagerbackend.customer.entity.Customer;
import org.mapstruct.Mapper;

@Mapper(config = MappingConfig.class)
public interface CustomerMapper extends GenericMapper<Customer, CustomerDto> {
}
