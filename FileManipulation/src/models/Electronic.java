package models;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Electronic extends Product {

	private String electronicBrand;
	private String electronicModel;
	
	public Electronic(long code, String name, String description, int quantity, double price, String electronicBrand,
			String electronicModel) {
		super(code, name, description, quantity, price);
		this.electronicBrand = electronicBrand;
		this.electronicModel = electronicModel;
	}
	public String getElectronicBrand() {
		return electronicBrand;
	}
	public void setElectronicBrand(String electronicBrand) {
		this.electronicBrand = electronicBrand;
	}
	public String getElectronicModel() {
		return electronicModel;
	}
	public void setElectronicModel(String electronicModel) {
		this.electronicModel = electronicModel;
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
     
     System.out.println("Qual a marca do produto?");
     setElectronicBrand(sc.next());
     
     System.out.println("Qual o modelo do produto?");
     setElectronicModel(sc.next());
         
      super.Save();
	}
}
