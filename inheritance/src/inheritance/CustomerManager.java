package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber+"kaydedildi");
	}
	//bulk insert=birden çok ticari,bireysel müþteri ekleme
	
	public void addMultiple(Customer[] customers) {
		for(Customer customer:customers)//bütün müþterileri dolaþacak {
			add(customer); //yukarýdaki add çalýþacak
		}
		
	}

