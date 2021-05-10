package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber+"kaydedildi");
	}
	//bulk insert=birden �ok ticari,bireysel m��teri ekleme
	
	public void addMultiple(Customer[] customers) {
		for(Customer customer:customers)//b�t�n m��terileri dola�acak {
			add(customer); //yukar�daki add �al��acak
		}
		
	}

