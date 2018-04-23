import java.util.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Alumno>arrayAlumnos = new ArrayList<Alumno>();


		TreeMap<Integer, LinkedList<Integer>> mapaNota1 = new TreeMap<Integer, LinkedList<Integer>>();
		TreeMap<Integer, LinkedList<Integer>> mapaNota2 = new TreeMap<Integer, LinkedList<Integer>>();
		TreeMap<Integer, LinkedList<Integer>> mapaNota3 = new TreeMap<Integer, LinkedList<Integer>>();



		String[] nombres = { "Rafa", "Jesus", "Raul", "Diego", "Cristian", "Pepe", "Luis", "Jose Antonio", "Eric",
		"German" };
		String[] apellidos = { "Garcia", "Perez", "Brey", "Losantos", "Cifuentes", "Casado", "Ba�ez", "Franco",
				"Blanco", "Jimenez" };


		Alumno unAlumno;
		for (int i = 0;i< 50; i++) {
			Random rand = new Random();
			unAlumno = new Alumno(nombres[rand.nextInt(nombres.length)], apellidos[rand.nextInt(apellidos.length)],
					rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1);
			arrayAlumnos.add(unAlumno);


		}


		System.out.println("Listado de alumnos:\n");
		for (Alumno alumno : arrayAlumnos) {
			System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " " + alumno.getNota1() + " "
					+ alumno.getNota2() + " " + alumno.getNota3());
		}
//		creacionMapa(arrayAlumnos,mapaNota1, 1);










	}

	private static void creacionMapa(ArrayList<Alumno> arrayAlumnos, TreeMap<Integer, ArrayList<Integer>> mapaNota,
			int trimestre) {
		TreeMap<Integer, LinkedList<Integer>> mapa = null;
		
		int i;
		LinkedList<Integer> listaIndices;
		Integer nota = 0;
		for (i = 0; i < arrayAlumnos.size(); i++) {
			switch (trimestre) {
			case 1:
				nota = (Integer) arrayAlumnos.get(i).getNota1();
				break;
			case 2:
				nota = (Integer) arrayAlumnos.get(i).getNota2();
				break;
			case 3:
				nota = (Integer) arrayAlumnos.get(i).getNota3();
			}
			// vemos si la nota ya esta insertada en algun nodo del mapa
			if (!mapa.containsKey(nota)) {// si no esta insertada
				listaIndices = new LinkedList<Integer>();
				listaIndices.add(i);
				mapa.put(nota, listaIndices);
			} else {
				listaIndices = mapa.get(nota);
				listaIndices.add(i);
				// mapa.get(nota).add(i);// o se puede poner solamente esta sentencia
			}
		}
	}






}
