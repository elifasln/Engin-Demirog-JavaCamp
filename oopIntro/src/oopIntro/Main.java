package oopIntro;

import java.util.Iterator;
import java.util.Locale.Category;

public class Main {

	public static void main(String[] args) {
		Product product1=new Product(1,"Lenova V14",15000,"16 Gb Ram",10);//örnek oluþturma,referans oluþturma,intance
		
		
		
		Product product2=new Product();//örnek oluþturma,referans oluþturma,intance
		product2.setId(2);
		product2.setName("lenovo v15");
        product2.setDiscount(10);   	
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		
		Category category1=new Catogery()
				category1.setId(1);
		category1.setName("içecek");
		
		
		
		
		
		
		//Product product3=new Product();//örnek oluþturma,referans oluþturma,intance
		
		
		//Product[] products= {product1,product2,product3};
		
		//for (Product product : products) {
			//System.out.println(product.getName());
			
			
		//}
		
		//System.out.println(products.length);
		
		//Category category1=new Catogery();
		//category1.id=1;
		//category1.name="bilgisayar";
		
		//Category category2=new Catogery();
		//category2.id=1;
	    //category2.name="bilgisayar";
	
		ProductManager productManager=new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);

		
		
				
		}
		

	}

