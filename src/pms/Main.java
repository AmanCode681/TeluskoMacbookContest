package pms;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ProductService ps=new ProductService();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Product Management System");
			System.out.println("1 for add product");
			System.out.println("2 for get all products");
			System.out.println("3 for get all products by name");
			System.out.println("4 for get all products by type");
			System.out.println("5 for get all products by place");
			System.out.println("6 for get all products by text");
			System.out.println("7 for get all products out of waranty");
			System.out.println("0 for exit");
			
			System.out.println("Enter your choice");
			int ch=sc.nextInt();
			if(ch==0)
			{
				System.out.println("Exited");
				break;
			}
			if(ch<0 || ch>7)
			{
				System.out.println("Invalid Choice......Try Again");
				continue;
			}
			switch(ch)
			{
					case 1:
					{
						ps.addProduct();
						break;
					}
					case 2:
					{
						ps.getAllProducts();
						break;
					}
					case 3:
					{
						System.out.println("Enter the name of the products to be searched");
						String name=sc.nextLine();
						sc.nextLine();
						ps.getProductByName(name);
						break;
					}
					case 4:
					{
						System.out.println("Enter the type of the products to be searched");
						String type=sc.nextLine();
						sc.nextLine();
						ps.getProductByType(type);
						break;
					}
					case 5:
					{
						System.out.println("Enter the place of the products to be searched");
						String place=sc.nextLine();
						sc.nextLine();
						ps.getProductByPlace(place);
						break;
					}
					case 6:
					{
						System.out.println("Enter the text of the products to be searched");
						String text=sc.nextLine();
						sc.nextLine();
						ps.getProductByText(text);
						break;
					}
					case 7:
					{
						ps.getProductOutOfWaranty();
						break;
						
					}
					default:
					{
						System.out.println("Invalid Choice");
					}
				
			}
			
		}
	}
}
