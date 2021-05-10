package inheritance2;

public class logManager {
	public void log(int logType) {
		if(logType==1) {
			System.out.println("veritanýna loglandý");
		}
		else if(logType==2) {
			System.out.println("dosyaya loglandý");

		}
		else {
			System.out.println("email loglandý");

		}
		
	}

}
//1-database
//2-file
//3-email