package main;

import models.Menu;
import models.Product;
import models.Food;
import models.Electronic;


import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Food food = new Food(0, null, null, 0, 0, null);
		Product product = new Product(0, null, null, 0, 0);
		Electronic electronic = new Electronic(0, null, null, 0, 0, null, null);

		
		boolean main = true;
		
		do {
		Menu.menu();
		
		int option;
		
			option = sc.nextInt();
		
			switch(option) {
			
			case 1:{
				product.Create();
				continue;
			}
			case 2:{
				electronic.Create();
				continue;
			}
			case 3:{
				food.Create();
				continue;
			}
			case 4:{
				product.displayDetails();
				continue;
			}
			case 9:{
				System.out.println("OBRIGADO POR USAR MEU SISTEMA!!");
				main = false;
				break;
			}
			default:{
				System.err.println("Digito inválido");
			}
				
		
			}
		}while (main != false);
	}
}