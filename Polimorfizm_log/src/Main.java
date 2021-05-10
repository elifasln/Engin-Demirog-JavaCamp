
public class Main {

	public static void main(String[] args) {
		//BaseLogger[] loggers=new BaseLogger[] {new EmailLogger(),new DatabaseLogger(),new FileLogger(),new ConsoleLogger()};
     //for(BaseLogger logger:loggers) {
    	// logger.Log("log mesajý");
   //  }
		
		
		
	
		CustomerManager customerManager=new CustomerManager(new FileLogger());
	 customerManager.Add();
	
	}
	
	
	

}
