package interfaces;

public class CustomerManager {
	//neye baðýmlýysan onun private deðiþkenini ya	
		//cusomermanager logg lamaya baðýmlý
			//iki türlü baðýmlýlýk var
			//loosly-gevþek baðlý ve tightly-katý baðlý
	
	
	private  Logger[] loggers;
		
		
		public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}
		
		public void add(Customer customer) {
		
		System.out.println("müþteri eklendi"+customer.getFirstName());
	Utils.runLoggers(loggers,customer.getFirstName());
	}
		



public void delete(Customer customer) {
		
		System.out.println("müþteri silindi"+customer.getFirstName());
		Utils.runLoggers(loggers,customer.getFirstName());

		
			}


}
