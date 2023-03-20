package in.bank.cards.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cards {

	
    @Column(name = "customer_id")
	private int customerId;
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "card_id")
	private int cardId;
    
    @Column(name = "card_number")
	private String cardNumber;
    
    @Column(name = "card_type")
	private String cardType;
    
    @Column(name = "expir_date")
	
	int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getCardId() {
		return cardId;
	}

	public void setCardId(int cardId) {
		this.cardId = cardId;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public LocalDate getExpirDate() {
		return expirDate;
	}

	public void setExpirDate(LocalDate expiryDate) {
		this.expirDate = expiryDate;
	}

	
	private LocalDate expirDate;
}
