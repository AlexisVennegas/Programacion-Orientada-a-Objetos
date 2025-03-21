package contruccion_singleton;

public class Singleton {
	
	private static Singleton singleton;
	private String nombre;
	
	// El constructor es privado, no permite que se genere un constructor por defecto.
    private Singleton(String nombre) {
        this.nombre = nombre;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static Singleton getSingletonInstance(String nombre) {
        if (singleton == null){
        	singleton = new Singleton(nombre);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase SoyUnico");
        }
        
        return singleton;
    }

	

}
