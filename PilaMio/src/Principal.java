
public class Principal {

	public static void main(String[] args) {
		Pila unaPila=new Pila();
		int op=0;
		Integer elemento=0;

		op=Leer.pedirEntero("\n1 Apilar un elemento"
				+ "\n2 Desapilar un elemento"
				+"\n3 Mostrar numero de elementos"
				+ "\n4 Mostrar todos los elementos sin borrarlos"
				+ "\n5 Desapilar todos los elementos (mostrar y borrar)"
				+ "\n0 Salir");
		while (op!=0){
			switch (op) {
			case 1:
				elemento=Leer.pedirEntero("dime un numero para a�adir a la pila");
				unaPila.apilar(new Integer (elemento));
				break;
			case 2:
				unaPila.desapilar();;
				break;
			case 3:
				System.out.println(unaPila.tama�o());
				break;
			case 4:

				System.out.println("Datos en la pila (no los desapilamos):");
				unaPila.visualizar();
				System.out.println("usando  el toString  :");
				
				System.out.println(unaPila);
				break;
			case 5:
				unaPila.visualizarYEliminar();;
				break;
			default:
				break;


			}//end switch 

			op=Leer.pedirEntero("\n1 Apilar un elemento"
					+ "\n2 Desapilar un elemento"
					+"\n3 Mostrar numero de elementos"
					+ "\n4 Mostrar todos los elementos sin borrarlos"
					+ "\n5 Desapilar todos los elementos (mostrar y borrar)"
					+ "\n0 Salir");
		}//end while 

	}


}

