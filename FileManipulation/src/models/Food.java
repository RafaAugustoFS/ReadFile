package models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Food extends Product{

	private String expirationDate;

	public Food(long code, String name, String description, int quantity, double price, String expirationDate) {
		super(code, name, description, quantity, price);
		this.expirationDate = expirationDate;
	}
	
	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
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
         
         System.out.println("Qual a data de validade do produto?");
         setExpirationDate(sc.next());
         
         super.Save();
	}
	
}
