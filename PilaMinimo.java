package lab_pilas;

import java.util.Stack;
import java.util.EmptyStackException;

public class PilaMinimo extends Stack<Float> {

	//Variables
	private Stack<Float> PilaMinimo;


	
	public PilaMinimo(Stack<Float> pilaMinimo) throws EmptyStackException{
		super();
		PilaMinimo = pilaMinimo;
	}

	PilaMinimo(){
		super();
	}

	//Método de push distinto en el que se introduce el valor a la PilaMínimo en caso de ser necesario
	public void pushPilaMinimo(float x){
		super.push(x);
		if(PilaMinimo.empty()){
			PilaMinimo.push(x);
		}
		else if(x<=(PilaMinimo.peek())) {
			PilaMinimo.push(x);
		}




	}
	
	public void popPilaMinimo(){
		if(super.empty()) {
			System.out.print("La pila está vacía");
		}else{
			super.pop();
		if(super.peek()==(PilaMinimo.peek())) {
			PilaMinimo.pop();
		}

		}


	}

	//Muestra el último valor introducido al la PilaMinimo, es decir, el valor minimo
	public float min() {
		if(PilaMinimo.isEmpty()) {
			System.out.print("La pila está vacía");
			return 0;
		}
		else{
			return PilaMinimo.peek();
			}

	}
 
	//Parte la pila por el mínimo
	public void partirPila() {
		int size = super.size();
		
		//si comprueba que el número resultante de la división es entero quita ese número de elemento quitando los de la PilaMinimo que coincidan
		if(size%2==0){
			for(int i=0;i==(size/2);i++){
				popPilaMinimo();
				
				
			}
			
			//si se comprueba que el número nu es entero, coje la parte entera de la división resultando y hace el mismo proceso ese número de veces
		}else if(size%2==1){
			int x = Math.floorDiv(size,2);
			for(int i=0;i==x;i++){
				popPilaMinimo();
				}
				
			}
			
			
		
		
	}


}
