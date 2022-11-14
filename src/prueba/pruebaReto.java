package prueba;

import java.util.Scanner;

public class pruebaReto {
	public static void main(String[]args){
		System.out.println("Texto en la clase pruebaReto");
		int num1, num2, operar, sumas, restas; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese el número 1: ");
		num1= sc.nextInt();
		
		System.out.print("Ingrese el número 2: ");
		num2= sc.nextInt();
		
		System.out.print("Seleccione la operación que desea realizar: ");
		System.out.print("1.Suma ");
		System.out.print("2.Resta ");
		operar = sc.nextInt();
		
		if(operar == 1) {
			sumas = num1 + num2;
			System.out.println("El resultado es: " + sumas);
		}
		else{
			restas = num1 - num2;
			System.out.println("El resultado es: " + restas);
		}
	}
}
