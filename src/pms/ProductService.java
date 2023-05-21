package pms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {

	List<Product> products;
	
	public ProductService() {
		products=new ArrayList<>();
	}
	public void addProduct()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the name of the product:");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the type of the product:");
		String type=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the place of the product:");
		String place=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the date(yyyy-mm-dd) of warranty of the product:");
		String dateInString=sc.nextLine();
		sc.nextLine();
		LocalDate date=LocalDate.parse(dateInString);
		
		Product p=new Product();
		p.setName(name);
		p.setPlace(place);
		p.setType(type);
		p.setWaranty(new Waranty(date));
		products.add(p);
		System.out.println("The product has been added successfully: with follwing data/n "+p);
	
	}
	public void getAllProducts()
	{
		products.stream().forEach((p)->System.out.println(p));
	}
	public void getProductByName(String name)
	{
		products.stream().filter((p)->p.getName().equalsIgnoreCase(name)).forEach((p)->{
			System.out.println(p);
		});
	}
	public void getProductByType(String type)
	{
		products.stream().filter((p)->p.getType().equalsIgnoreCase(type)).forEach((p)->{
			System.out.println(p);
		});
	}
	public void getProductByPlace(String place)
	{
		products.stream().filter((p)->p.getPlace().equalsIgnoreCase(place)).forEach((p)->{
			System.out.println(p);
		});
	}
	public void getProductByText(String text)
	{
		products.stream().filter((p)->p.getName().contains(text)||p.getPlace().contains(text) || p.getType().contains(text)).forEach((p)->{
			System.out.println(p);
		});
	}
	public void getProductOutOfWaranty()
	{
		products.stream().filter((p)->p.getWaranty().getDate().isBefore(LocalDate.now())).forEach((p)->{
			System.out.println(p);
		});
	}
}
