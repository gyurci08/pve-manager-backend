package hu.jandzsogyorgy.pvemanagerbackend.vms.repository;

import hu.jandzsogyorgy.pvemanagerbackend.vms.entity.Vm;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VmRepository extends ListCrudRepository<Vm, Long> {
    List<Vm> findAllByCustomerId(Long id);

    Vm findByCustomerIdAndId(Long customerId, Long vmId);

}
