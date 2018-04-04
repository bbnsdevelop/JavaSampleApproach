package br.com.JavaSampleApproach.repósitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.JavaSampleApproach.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	List<Customer> findByLastName(String lastName);

}
