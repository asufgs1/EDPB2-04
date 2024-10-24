package lab_pilas;

import java.util.Random;
import java.util.EmptyStackException;
import java.lang.NullPointerException;

public class MainPilas {

	public static void main(String[] args)throws EmptyStackException, NullPointerException{
	
		PilaMinimo Pila1 = new PilaMinimo();
		PilaMinimo Pila2 = new PilaMinimo();
		
		Random randomNumbers = new Random();
		//variable que crea un número aleatorio entre 0 y 10 para meter en la pila
		float x;
		//variable para que saque de la pila entre 2 y 5 elementos
		int y= randomNumbers.nextInt(4)+2;
		
		/*2 bucles, uno para meter números aletoriamente a las pilas 
		 y otro que quita entre 2 y 5 elementos*/
		for(int i=0;i==15;i++) {
			x= randomNumbers.nextInt(11);
			Pila1.pushPilaMinimo(x);
			System.out.println("num1"+x);
			Pila2.pushPilaMinimo(x);
			System.out.println("num2"+x);
		}
		
		
		for(int i=0;i==y;i++) {
			Pila1.popPilaMinimo();
			Pila2.popPilaMinimo();		
		}
		
		//Aquí se invoca al método partirPila
		Pila1.partirPila();
		Pila2.partirPila();	
		
		
		//Aquí se mostrarán los valóres minimos con min
		float min1= Pila1.min();
		float min2= Pila2.min(); 
		System.out.print("Los valores mínimos actuales de las pilas son "+min1+" y "+min2);	}
	
	

}
