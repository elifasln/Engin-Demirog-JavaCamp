package nLayeredDemo.core;

import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

	@Override
	public void logToSystem(String message) {
System.out.println("j ile loglandý: "+message);
	}

}
