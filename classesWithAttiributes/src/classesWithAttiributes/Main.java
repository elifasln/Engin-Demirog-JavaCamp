package classesWithAttiributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(1,"Laptop","asus laptop",5000,3);
		
		
	ProductManager productManager=new ProductManager();
	productManager.Add(product);
	


	}

}
