import java.util.ArrayList;

public class Pila {
	
	private ArrayList<Integer>pila;
	
	public Pila(){
		pila=new ArrayList<Integer>();
				
	}
	
	public void apilar(Integer num){
		pila.add(num);
		
	}
	
	
	public int  desapilar (){
		int dato;
		int ultimo;
		
		ultimo =pila.size()-1;
		dato=pila.get(ultimo);
		pila.remove(ultimo);
		return dato;
		
	}
	public int tama�o(){
		 return pila.size();
	}
	
	
	
	public void borrar(Integer num){
		pila.remove(num);
	}

	@Override
	public String toString() {
		return "Pila [pila=" + pila + "]";
	}
	
	public void visualizar(){
		System.out.println("Mostramos la pila sin destruirla: ");
		for(int i= pila.size()-1; i>=0;i--){
			System.out.print(pila.get(i)+",");
			
		}
		
		
		
		
	}
	public void visualizarYEliminar(){
		for(int i= pila.size()-1; i>=0;i--){
			System.out.println("se ha borrado el numero "+ pila.get(i) +  " de la pila ");
			pila.remove(i);
			
		}
	
		
		
	}
	
	

}
