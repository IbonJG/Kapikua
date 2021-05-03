package pruebafinal;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int edad;
	private boolean enfermo = false;
	private float notamedia;

	// constructor superclass
	public Alumno() {
		super();
		this.nombre = "";
		this.apellidos = "";
		this.edad = 0;
		this.enfermo = false;
		this.notamedia = 0;

	}

	// contructor using fields
	public Alumno(String nombre, String apellidos, int edad, boolean enfermo, float notamedia) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.enfermo = enfermo;
		this.notamedia = notamedia;
	}

	// getters and setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isEnfermo() {
		return enfermo;
	}

	public void setEnfermo(boolean enfermo) {
		this.enfermo = enfermo;
	}

	public float getNotamedia() {
		return notamedia;
	}

	public void setNotamedia(float notamedia) {
		this.notamedia = notamedia;
	}

	@Override
	public String toString() {
		return "Alumno [Nombre Completo: " + nombre + ", " + apellidos + ", edad: " + edad + ", enfermo: " + enfermo
				+ ", notamedia: " + notamedia + "]";
	}

}
