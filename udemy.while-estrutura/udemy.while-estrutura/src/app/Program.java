package app;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		var x = sc.nextInt();
		var soma = 0;
		while (x != 0) {
		    soma = soma + x;
		    x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();

	}

}
