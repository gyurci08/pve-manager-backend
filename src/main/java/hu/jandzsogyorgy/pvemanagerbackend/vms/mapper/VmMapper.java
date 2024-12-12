package hu.jandzsogyorgy.pvemanagerbackend.vms.mapper;

import hu.jandzsogyorgy.pvemanagerbackend.common.generic.dto.GenericMapper;
import hu.jandzsogyorgy.pvemanagerbackend.config.MappingConfig;
import hu.jandzsogyorgy.pvemanagerbackend.vms.dto.VmDto;
import hu.jandzsogyorgy.pvemanagerbackend.vms.entity.Vm;
import org.mapstruct.Mapper;

@Mapper(config = MappingConfig.class)
public interface VmMapper extends GenericMapper<Vm, VmDto> {
}
