package in.ineuron.request;


public class PassengerInfo {
	
	private String firstName;
	private String lastName;
	private String from;
	private String to;
	private String journeyDate;
	private String trainNumber;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getJourneyDate() {
		return journeyDate;
	}
	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public PassengerInfo(String firstName, String lastName, String from, String to, String journeyDate,
			String trainNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.from = from;
		this.to = to;
		this.journeyDate = journeyDate;
		this.trainNumber = trainNumber;
	}
	public PassengerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PassengerInfo [firstName=" + firstName + ", lastName=" + lastName + ", from=" + from + ", to=" + to
				+ ", journeyDate=" + journeyDate + ", trainNumber=" + trainNumber + "]";
	}
	

}
