package com.singleton.data;

public class Casa {
	
	private static Casa singleton;
	private String nombre;
	private int m2;
	
	// El constructor es privado, no permite que se genere un constructor por defecto.
    private Casa(String nombre, int m2) {
        this.nombre = nombre;
        this.m2 = m2;
        System.out.println("Mi nombre es: " + this.nombre);
    }

    public static Casa getSingletonInstance(String nombre) {
        if (singleton == null){
        	singleton = new Casa(nombre, 12);
        }
        else{
            System.out.println("No se puede crear el objeto "+ nombre + " porque ya existe un objeto de la clase SoyUnico");
        }
        
        return singleton;
        
        
    }

	public String getName() {
		return this.nombre;
	}

}