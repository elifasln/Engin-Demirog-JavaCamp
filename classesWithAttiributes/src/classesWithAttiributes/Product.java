package classesWithAttiributes;

public class Product {
	
	//attribute || field
	
	
	public Product(int id,String name,String description,double price, int stockAmount) {
		
		System.out.println("yap�c� blok �al��t�");
		this.id=id;
		this.name=name;
		this.description=description;
		this.price=price;
		this.stockAmount=stockAmount;
	}
	int id;
	String name;
	String description;
	double price;
	int stockAmount;

}
