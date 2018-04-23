public class Alumno {
	private String nombre;
	private String apellido;
	private Integer nota1;
	private Integer nota2;
	private Integer nota3;

	public Alumno(String nombre, String apellido, Integer nota1, Integer nota2, Integer nota3) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}

	
	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public Integer getNota1() {
		return nota1;
	}


	public Integer getNota2() {
		return nota2;
	}


	public Integer getNota3() {
		return nota3;
	}


	@Override
	public String toString() {
		return  nombre + " " + apellido + ", nota1: " + nota1 + ", nota2: " + nota2
				+ ", nota3: " + nota3 ;
	}

}





