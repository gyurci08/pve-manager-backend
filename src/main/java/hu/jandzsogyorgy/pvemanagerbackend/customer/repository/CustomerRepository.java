package hu.jandzsogyorgy.pvemanagerbackend.customer.repository;

import hu.jandzsogyorgy.pvemanagerbackend.customer.entity.Customer;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends ListCrudRepository<Customer, Long> {
}
