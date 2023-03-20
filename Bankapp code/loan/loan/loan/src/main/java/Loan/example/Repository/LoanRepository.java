package Loan.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import Loan.example.model.Loans;

public interface LoanRepository extends JpaRepository<Loans, Integer>{

	@Query(value = "Select * from loans l Where l.customer_id=1?", nativeQuery = true)
	List<Loans> searchByCustomerId(int customerId);
}
