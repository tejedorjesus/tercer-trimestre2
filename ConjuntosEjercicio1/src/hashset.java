import java.util.Random;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escribe un programa en Java que genere un número aleatorio de datos (entre 1 y 15 números) los valores de
		dichos números estarán comprendidos entre 1000 y 8000:*/
		
		
		HashSet<Integer> conjuntoHashset=new HashSet<Integer>();	
		LinkedHashSet<Integer> conjuntoLinkedHashset=new LinkedHashSet<Integer>();		
		TreeSet<Integer> conjuntoTreeset=new TreeSet<Integer>();		
		int n;
		Random azar = new Random();
		int numeros = azar.nextInt(15)+1;
		int [] numero = new  int [15];

		for (int j = 0; j <numeros; j++) {
			numero[j] = azar.nextInt(7001) +1000;
			conjuntoHashset.add(numero[j]);
			conjuntoLinkedHashset.add(numero[j]);
			conjuntoTreeset.add(numero[j]);
			System.out.print(numero[j] + "* "  );
			
		
			
		
	
		}
		System.out.println();
		System.out.println(conjuntoHashset);
		System.out.println(conjuntoLinkedHashset);
		System.out.println(conjuntoTreeset);
		
		
		
		
	}

}



/*
 * do { n=Leer.pedirEntero("Introduce el elemento "+(conjunto.size()+1)+":"); if
 * (!conjunto.add(n)){
 * System.out.println("Número ya en la lista. Debes introducir otro."); } }
 * while (conjunto.size()<5); // Calcular la suma Integer suma=new Integer(0);
 * for (Integer i: conjunto) { Leer.mostrarEnPantalla("" + i); suma=suma+i; }
 * Leer.mostrarEnPantalla("La suma es:"+suma);
 * 
 * 
 * }
 * 
 * }
 */
