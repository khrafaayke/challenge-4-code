package Loan.example.Service;

import java.util.List;

import Loan.example.model.Loans;

public interface LoanService {

	List <Loans> getAllLoans();
	List<Loans> getLoansByCustomerId(int customerId);
}
