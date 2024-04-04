package main;

import models.Product;
import models.Food;
import models.Electronic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void menu() {
		// Método para exibir o menu principal
        // Lista as opções disponíveis para o usuário
		System.out.println("1 - Criar novo produto");
		System.out.println("2 - Criar novo eletrônico");
		System.out.println("3 - Criar comida");
		System.out.println("4 - Ler produto");
		System.out.println("9 - Sair");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		Food food = new Food(0, null, null, 0, 0, null);
		Product product = new Product(0, null, null, 0, 0);
		Electronic electronic = new Electronic(0, null, null, 0, 0, null, null);

		
		boolean main = true;
		
		do {
		menu();
		
		int option = sc.nextInt();
		
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
				
		
			}
		}while (main != false);
	}
}