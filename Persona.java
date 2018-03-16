
public class Persona  {

	//Atributos 
	
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	
	Domicilio casa;
	
	
	public Persona (String nombre, String apellidos, String dni, int edad, String calles, int codigoPostales, String provincias) {
			
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		
		casa = new Domicilio(calles,codigoPostales,provincias);
	
		
	}

	public String toString() {
		
		String mensaje;

		mensaje = ("El ciudadano "+nombre+" "+apellidos+" con DNI "+dni+", residiendo en la calle "+casa.getCalle()+" de la provincia " + casa.getProvincia()  );
		return mensaje;
		
	}
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	
}
