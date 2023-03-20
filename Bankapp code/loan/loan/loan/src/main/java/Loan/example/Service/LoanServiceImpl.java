package Loan.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Loan.example.Repository.LoanRepository;
import Loan.example.model.Loans;

@Service
@Transactional
public class LoanServiceImpl implements LoanService {

	@Autowired
	private LoanRepository loanRepository;
	
	@Override
	public List<Loans> getAllLoans() {
		return this.loanRepository.findAll();
	}

	@Override
	public List<Loans> getLoansByCustomerId(int customerId) {
		return this.loanRepository.searchByCustomerId(customerId);
	}

}
