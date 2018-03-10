import java.util.*;

public class MainArrayList {
	
static Scanner teclado = new Scanner(System.in);
	
	static Byte opcion;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		ejecutaMenu();
		
		
	}
	
	// Métodos útiles
	
	public static void imprime(String mensaje) {

		System.out.println(mensaje);

	}
	
	public static void iniciaMenu() {
		
		

	
		
		imprime("\n1 - Carga una lista");
		imprime("2 - Listar");
		imprime("3 - Inserta una persona al final de la lista");
		imprime("4 - Elimina a una persona");
		imprime("5 - Cuenta el numero de personas en la lista");
		imprime("\nElige una opción");
		
	}
	
	public static void ejecutaMenu() {
		
do {
			
			iniciaMenu();

			opcion = teclado.nextByte();
			
			switch (opcion) {
			case 1:
				
				cargaLista();
				
						
		
				break;
				
			case 2:
				
				Lista.listar();
				
				break;
				
			case 3:
				
				insertaPersona();
				
				break;
				
			case 4:
				
		
				
				break;
				
			case 5:
				
				Lista.contar();
			
				
				break;
				
			default:
				break;
			}
			
			
			
		} while (opcion!=0);
		
		
	}
	
	public static void insertaPersona() {
		
		imprime("Nombre :");
		String nombre = teclado.next();
		
		imprime("Apellidos :");
		String apellidos = teclado.next();
		
		imprime("Edad:");
		int edad = teclado.nextInt();
		
		imprime("DNI:");
		String DNI = teclado.next();
		
		imprime("Calle :");
		String calle = teclado.next();
		
		imprime("Código Postal");
		int cp = teclado.nextInt();
		
		imprime("Provincia :");
		String pronvincia = teclado.next();
		
		Lista.insertar(new Persona(nombre, apellidos, DNI, edad, calle, cp, pronvincia));
		
		
		ejecutaMenu();
	}
	
	public static void cargaLista() {
		
		Lista.insertar(new Persona("Joselito", "Anchoa", "78230212C", 25, "Pachanga", 38200, "Teruel"));
		Lista.insertar(new Persona("Ana", "Paciencia", "43323400H", 30, "Hartura", 38100, "Tenerife"));
		Lista.insertar(new Persona("Juan", "Gonzalo", "78271823C", 30, "Los Dolores de Cabeza", 38109, "Tenerife"));
	}
}

