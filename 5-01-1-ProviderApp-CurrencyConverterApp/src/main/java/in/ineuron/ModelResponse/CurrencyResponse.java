package in.ineuron.ModelResponse;


public class CurrencyResponse {
	
	
	private Integer currencyId;
	private String currencyFrom;
	private String currencyTo;
	private Integer currencyValue;
	
	
	public Integer getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
	}
	public String getCurrencyFrom() {
		return currencyFrom;
	}
	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}
	public String getCurrencyTo() {
		return currencyTo;
	}
	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}
	public Integer getCurrencyValue() {
		return currencyValue;
	}
	public void setCurrencyValue(Integer currencyValue) {
		this.currencyValue = currencyValue;
	}
	
	@Override
	public String toString() {
		return "CurrencyConverterApp [currencyId=" + currencyId + ", currencyFrom=" + currencyFrom + ", currencyTo="
				+ currencyTo + ", currencyValue=" + currencyValue + "]";
	}
	public CurrencyResponse(Integer currencyId, String currencyFrom, String currencyTo, Integer currencyValue) {
		super();
		this.currencyId = currencyId;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.currencyValue = currencyValue;
	}
	public CurrencyResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
