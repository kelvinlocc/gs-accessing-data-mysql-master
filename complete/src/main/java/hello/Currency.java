package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Currency {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String currencyCode;
    private String exchangeCurrencyCode;
    private String rate;

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getExchangeCurrencyCode() {
		return exchangeCurrencyCode;
	}

	public void setExchangeCurrencyCode(String exchangeCurrencyCode) {
		this.exchangeCurrencyCode = exchangeCurrencyCode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


    
}

