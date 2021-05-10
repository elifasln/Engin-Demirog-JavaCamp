package oopIntro;

public class Catogery {
	private int id;
	private String name;
	
	//constructor parametresiz
	public Catogery() {
		
	}
//constructor parametreli
	public Catogery(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	//getter ve setter
	public int getId() {
		return this.id;
		
	}
	public void setId(int id) {
		this.id=id;
		
	}
	
	public String getName() {
		return this.name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	
}
