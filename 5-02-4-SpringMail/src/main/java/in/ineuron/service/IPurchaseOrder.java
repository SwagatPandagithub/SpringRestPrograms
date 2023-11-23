package in.ineuron.service;

public interface IPurchaseOrder {

	
	public String purchase(String[] items, double[] price, String[] toEmails) throws Exception;
}
