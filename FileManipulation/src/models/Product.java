package models;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Product {

	private long code;
	private String name;
	private String description;
	private int quantity;
	private double price;
	
	public Product(long code, String name, String description, int quantity, double price) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	}
	
	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void displayDetails() {
		
		try {
			FileReader reader = new FileReader("Products.txt");
			int data = reader.read();
			while(data != -1 ) {
				System.out.print((char) + data);
				data = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Save() {
		try {
			FileWriter writer = new FileWriter("Products.txt", true);
			writer.write("Code: " + getCode() + "\n" + "Name: " + getName() + "\n" 
			+ "Description: " + getDescription() + "\n" + "Quantity: " + getQuantity()
			+ "\n" + "Price: R$" + getPrice() + "\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void Create() {
		Scanner sc = new Scanner(System.in);

        
         
         do {
				System.out.println("Qual o código do produto?");
				try {
					setCode(sc.nextInt());
				} catch (Exception e) {
						System.err.println("O código deve ser positivo");
						sc.nextLine();
				}
			} while (getCode() < 1); 
         
         System.out.println("Qual o nome do produto?");
         setName(sc.next());
         
         System.out.println("Qual a descrição do produto?");
         setDescription(sc.next());
         
         do {
         System.out.println("Qual a quantidade do produto?");
         try {
				setQuantity(sc.nextInt());
			} catch (Exception e) {
					System.err.println("A quantidade deve ser positiva");
					sc.nextLine();
			}
		} while (getQuantity() < 1);
         do {
         System.out.println("Qual o preço do produto?");
         try {
				setPrice(sc.nextInt());
			} catch (Exception e) {
					System.err.println("O preço deve ser positivo");
					sc.nextLine();
			}
		} while (getPrice() < 1);
         
         Save();
	}
}
