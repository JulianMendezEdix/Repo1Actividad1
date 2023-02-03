package julian;

public class Julian {

	public static void main(String[] args) {
		
		imprimirNombre ();
		imprimirHobbies();
		imprimirComidas();

	}

	public static void imprimirNombre() {
	
		System.out.println("Hola, soy Julián");
	
	}
	
	public static void imprimirHobbies() {
		
		System.out.println("Me gusta pasear, leer y ver pelis");
	
	} 	
	
	public static void imprimirComidas() {
		
// <<<<<<< HEAD
		//System.out.println("Mis comidas favoritas son la pasta, las pizzas y las hamburguesas");
// =======
		System.out.println("Mis comidas favoritas son la fabada litoral, la pasta y "
				+ "las hamburguesas. Una curiosidad: la pasta y las hambuerguesas también "
				+ "son las comidas favoritas de mi compañero de grupo Diego.");
// >>>>>>> develop
	
	} 	
	
}
