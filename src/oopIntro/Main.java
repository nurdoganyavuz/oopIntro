package oopIntro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product();
		product1.id = 1;
		product1.name = "Lenovo";
		product1.unitPrice = 15000;
		product1.detail = "16 GB Ram";
		
		Product product2 = new Product();
		product2.id = 1;
		product2.name = "HP";
		product2.unitPrice = 15000;
		product2.detail = "16 GB Ram";
		
		Product product3 = new Product();
		product3.id = 1;
		product3.name = "Monster";
		product3.unitPrice = 15000;
		product3.detail = "16 GB Ram";
		
		Product[] products = {product1, product2, product3};
		
		for (Product product : products) {
			System.out.println(product.name);
		}
		System.out.println(products.length);
		

	}

}
