
public class Persona extends Domicilio implements Comparable<Persona> {

	//Atributos 
	
	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;
	
	public Persona (String nombre, String apellidos, String dni, int edad, String calle, int codigoPostal, String provincia) {
		
		super(calle, codigoPostal, provincia);
			
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		
	
		
	}

	public String toString() {
		
		String mensaje;
		mensaje = ("El ciudadano "+nombre+" "+apellidos+" con DNI "+dni+" ,residiendo en calle "+getCalle()+" de la provincia "+getProvincia());
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

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
