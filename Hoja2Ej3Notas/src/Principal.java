
import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Integer opcion;
		ArrayList<Alumno> arrListAlumnos = new ArrayList<Alumno>();
		creacionAlumnos(arrListAlumnos);

		TreeMap<Integer, ArrayList<Integer>> mapaNota1 = new TreeMap<Integer, ArrayList<Integer>>();
		TreeMap<Integer, ArrayList<Integer>> mapaNota2 = new TreeMap<Integer, ArrayList<Integer>>();
		TreeMap<Integer, ArrayList<Integer>> mapaNota3 = new TreeMap<Integer, ArrayList<Integer>>();

		System.out.println("Listado de alumnos:\n");
		for (Alumno alumno : arrListAlumnos) {
			System.out.println(alumno.getNombre() + " " + alumno.getApellido() + " " + alumno.getNota1() + " "
					+ alumno.getNota2() + " " + alumno.getNota3());
		}
		creacionMapa(arrListAlumnos, mapaNota1, 1);
		creacionMapa(arrListAlumnos, mapaNota2, 2);
		creacionMapa(arrListAlumnos, mapaNota3, 3);

		opcion = Leer.pedirEntero("1-Listar clase por nota 1\n2-Listar clase por nota 2\n3-Listar clase por nota 3");
		while (opcion != 0) {
			switch (opcion) {
			case 1:
				visualizarAlumnosPorNota(arrListAlumnos, mapaNota1);
				break;
			case 2:
				visualizarAlumnosPorNota(arrListAlumnos, mapaNota2);
				break;
			case 3:
				visualizarAlumnosPorNota(arrListAlumnos, mapaNota3);
			}// switch
			opcion = Leer
					.pedirEntero("1-Listar clase por nota 1\n2-Listar clase por nota 2\n3-Listar clase por nota 3");
		} // while

	}

	private static void visualizarAlumnosPorNota(ArrayList<Alumno> arrListAlumnos,
			TreeMap<Integer, ArrayList<Integer>> mapaNota)
	{
		for (Integer nota : mapaNota.keySet()) {
			System.out.println("\nLos alumnos con la nota: " + nota + " son:");
			ArrayList<Integer> listaIndicesPorNota = new ArrayList<>();
			listaIndicesPorNota = mapaNota.get(nota);
			for (int i = 0; i < listaIndicesPorNota.size(); i++) {
				Integer indice = listaIndicesPorNota.get(i);
				System.out.println(arrListAlumnos.get(indice));
			}
		}
	}// visualizarAlumnosPorNota

	private static void creacionMapa(ArrayList<Alumno> arrListAlumnos, TreeMap<Integer, ArrayList<Integer>> mapaNota,
			int trimestre) {
		Integer nota = null;
		for (int i = 0; i < arrListAlumnos.size(); i++) {
			switch (trimestre) {
			case 1:
				nota = (Integer) arrListAlumnos.get(i).getNota1();
				break;
			case 2:
				nota = (Integer) arrListAlumnos.get(i).getNota2();
				break;
			case 3:
				nota = (Integer) arrListAlumnos.get(i).getNota3();
			}

			if (mapaNota.containsKey(nota)) {
				mapaNota.get(nota).add(i);
			} else {
				ArrayList<Integer> listaIndices = new ArrayList<>();
				listaIndices.add(i);
				mapaNota.put(nota, listaIndices);
			}
		}
	}// creacionMapa

	private static void creacionAlumnos(ArrayList<Alumno> arrListAlumnos) {
		String[] nombres = { "Rafa", "Jesus", "Raul", "Diego", "Cristian", "Pepe", "Luis", "Jose Antonio", "Eric",
				"German" };
		String[] apellidos = { "Garcia", "Perez", "Brey", "Losantos", "Cifuentes", "Casado", "Bañez", "Franco",
				"Blanco", "Jimenez" };
		for (int i = 0; i < 50; i++) {
			Alumno unAlumno;
			Random rand = new Random();
			unAlumno = new Alumno(nombres[rand.nextInt(nombres.length)], apellidos[rand.nextInt(apellidos.length)],
					rand.nextInt(100) + 1, rand.nextInt(100) + 1, rand.nextInt(100) + 1);
			arrListAlumnos.add(unAlumno);
		}
	}// creacionAlumnos

}