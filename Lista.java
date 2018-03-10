import java.util.*;


public class Lista {

	public static ArrayList<Persona> personitas = new ArrayList<Persona>();
	
		
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
	
	public static void eliminarPosicion(int pos) {
		
		personitas.remove(pos);
		
	}

	public static void eliminaNombre (Persona P) {
		
		if (personitas.contains(P)) {
			
			personitas.remove(P);
			
		}
	}
	
	public static void contar() {
		
		
		System.out.println("La lista tiene " + personitas.size()+" personas");
		
	}

	public static String size() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
