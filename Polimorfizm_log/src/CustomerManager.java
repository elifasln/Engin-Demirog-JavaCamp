
public class CustomerManager {
	private BaseLogger logger;
	public CustomerManager(BaseLogger logger) {
		
		this.logger=logger;
	}
	
	
	public void Add() {
		System.out.println("m��teri eklendi");
		this.logger.log("log mesaj�");
		
	}

}
