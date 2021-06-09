/*package com.cg.cms.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.cms.entities.Customer;

	

	@Repository
	public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	}*/

package com.cg.cms.repository;

/*import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.cms.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}*/


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.cms.dto.OrderResponse;
import com.cg.cms.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public Customer findByLastName(String lastName);

	public Customer findByFirstName(String firstName);

	@Query("SELECT new com.cg.cms.dto.OrderResponse(c.firstName, p.pName) FROM Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInfo();
}

