package interfaces;

public class Utils {
	public static void runLoggers(Logger[] loggers,String mesagge) {

		for(Logger logger:loggers) {
			logger.log(mesagge);
		}
	}
}
