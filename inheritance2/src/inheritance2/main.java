package inheritance2;

import java.util.logging.LogManager;

public class main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new EmailLogger());

	}

}
