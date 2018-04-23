import java.util.Map;

import java.util.Set;
import java.util.TreeMap;
import java.util.*;


public class GestionTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Articulo articulos[] = new Articulo[5]; 
		/*int acumVentas;*/


		TreeMap<String, Integer> mapArticulosDescripcion = new TreeMap<String, Integer>();
		// mapArticulosStock
		TreeMap<Integer,ArrayList<Integer>> mapArticulosStock = new TreeMap<Integer, ArrayList<Integer>>();
		List<Integer> listaIndicesArticuloDelNodo=null;
		crearArticulos(articulos);
		visualizarArticulos(articulos);
		menu(articulos);

	


	}




	private static void totalVentas(Articulo[] articulos) {
		Integer totalVentas=0;
		 System.out.println(articulos[0].getAcumVentas());
		System.out.println( articulos[1].getAcumVentas());
		System.out.println( articulos[2].getAcumVentas());
		System.out.println( articulos[3].getAcumVentas());
		System.out.println( articulos[4].getAcumVentas());
		
		
		

	

































}//end main

private static void menu(Articulo[] articulos) {//MENU
	int opcion=Leer.pedirEntero("elija una opcion \n1.- Venta cliente \n2.- Comprar al proveedor \n3.- Listado de articulos bajo stock minimo "
			+ "\n4.- Listado de ventas acumuladas por articulo \n5.- Listado articulos \n0.- Salir");

	while (opcion !=0){
		switch (opcion) {

		case 1:
			vender(articulos);
			break;

		case 2:
			comprar(articulos);
			break;
		case 3:
			comprar(articulos);
			break;
		case 4:
			totalVentas(articulos);
			break;
		case 5:
			visualizarArticulos(articulos);
			break;
		default:
			break;
		}//end switch
		opcion=Leer.pedirEntero("elija una opcion \n1.- Venta cliente \n2.- Comprar al proveedor \n3.- Listado de articulos bajo stock minimo "
				+ "\n4.- Listado de ventas acumuladas por articulo \n5.- Listado articulos \n0.- Salir");
	}//end while
}//MENU




private static void visualizarArticulos(Articulo[] articulos) {
	for (int i = 0; i < articulos.length; i++) {
		System.out.println(articulos[i]);


	}// visualizar articulo 
}

private static void crearArticulos(Articulo[] articulos) {//CREAR 
	String[] descripcion = { "Peine", "Lapiz", "Libro", "Tenedor", "Tijeras" };


	for (int i = 0; i < articulos.length; i++) {
		articulos[i] = new Articulo(descripcion[i], (int) (Math.random() * 50 + 0),
				(int) (Math.random() * 300 + 51), ((int) (Math.random() * (20))));
	}//CREAR

}

private static void vender(Articulo[] articulos) {//VENDER 
	Integer numeroArticulo;
	Integer ventaUnidades;
	Integer i=0;

	do{

		numeroArticulo=Leer.pedirEntero("escriba el articulo a vender:\n 1.Peine \n 2.Lapiz  \n 3.Libro  \n 4.Tenedor  \n 5.Tijeras");


	} while (numeroArticulo < 1 || numeroArticulo > 5);
	System.out.println(articulos[numeroArticulo-1]);

	ventaUnidades = Leer.pedirEntero("¿Cuantas unidades quieres vender?:\n 1.Peine \n 2.Lapiz  \n 3.Libro  \n 4.Tenedor  \n 5.Tijeras");

	articulos[numeroArticulo-1].vender(ventaUnidades);
	System.out.println(articulos[numeroArticulo-1]);//VENDER 




}

private static void comprar(Articulo[] articulos) {//comprar
	Integer compraUnidades=0;
	Integer numeroArticuloComprar=0;
	do{
		numeroArticuloComprar=Leer.pedirEntero("escriba el numero del articulo a comprar\n 1.Peine \n 2.Lapiz  \n 3.Libro  \n 4.Tenedor  \n 5.Tijeras");

	}while(numeroArticuloComprar<1 ||numeroArticuloComprar>5);
	System.out.println(articulos[numeroArticuloComprar-1]);
	compraUnidades=Leer.pedirEntero("¿cuantas unidades quiere comprar?");
	articulos[numeroArticuloComprar-1].comprar(compraUnidades);
	System.out.println(articulos[numeroArticuloComprar-1]);
}//comprar


public static void ordenarArticulosDescripcion(Articulo [] articulos, TreeMap<String, Integer> mapArticulosDescripcion){
	int indice;
	Integer posicion; // Tiene que ser objeto no puede ser dato primitivo.

	// 1ڠGuardamos en el mapa los nodos.
	for (indice=0;indice<articulos.length;indice++){	
		mapArticulosDescripcion.put(articulos[indice].getDescripcion(), indice);
	}

	//2ڠRecorremos el conjunto generado por keySet que contiene las claves en orden de a-z.
	for (String descripcion: mapArticulosDescripcion.keySet() ) {
		//3º Obtenemos la posicion asociada a cada descripcion.
		posicion=mapArticulosDescripcion.get(descripcion);
		//4º Leer.mostrarEnPantalla tiene que recibir un string como parametro.
		Leer.mostrarEnPantalla(articulos[posicion].muestraArticulo());
	}
}




}
