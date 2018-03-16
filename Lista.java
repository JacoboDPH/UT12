import java.util.*;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;


public class Lista {

	public static ArrayList<Persona> personitas = new ArrayList<Persona>();
	
	public Lista () {
		
		
	
		
	}
	
	public static void cargarLista() {
		
		personitas.add(new Persona("Joselito", "Anchoa", "78230212C", 25, "Pachanga", 38200, "Teruel"));
		personitas.add(new Persona("Ana", "Paciencia", "43323400H", 30, "Hartura", 38100, "Tenerife"));
		personitas.add(new Persona("Juan", "Gonzalo", "78271823C", 30, "Los Dolores de Cabeza", 38109, "Tenerife"));
	}
	
	public static void insertar(Persona p) {
	    personitas.add(p);
	}
	
	public static void listar() {
		
		for (Persona listado:personitas) {
			
		
			
			if (listado == null) {
				
				System.out.println("La lista está vacía\n");
				
			}
			
			else {
				
				System.out.println(listado);
				
			}
			
		}
		
	}
	
	public  void eliminarPosicion(int pos) {
		
		personitas.remove(pos);
		
	}

	public static void eliminaNombre (String unNombre) {

		ArrayList<String> borrado = new ArrayList<>();

		for (Persona nombresLista : personitas) {

		
			borrado.add(nombresLista.getNombre());
		}

		
		if (borrado.contains(unNombre)) {

			personitas.remove(borrado.indexOf(unNombre));
			
			System.out.println(unNombre+ " ha sido eliminado con exito");

			
		}else {
			System.out.println(unNombre + " no existe en la lista");
		}
		
	}


		
	public static void contar() {
		
		
		System.out.println("La lista tiene " + personitas.size()+" personas");
		
	}

	
}
