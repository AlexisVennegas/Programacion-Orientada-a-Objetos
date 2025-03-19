package com.proyecto.common.exception;


//Paso 1. Identificar esta clase commo hija de StringNotValidException
@SuppressWarnings("serial")
public class StringTooShortException extends StringNotValidException {

	/**
	 * 
	 */
	// private final int tamano = Constantes.TAMAÑO_MIN;
	private String message;
	private String code;
	private String cadena;
	


	// Paso 2. Indicar un atributo inmutable tipo int llamado "tamanyo"
	
	// Paso 3. Implementar el constructor adecuado para asignar valor a todos
	public StringTooShortException(String code, String message, String cadena) {
		super(code, message);
		
		this.cadena = cadena;
	}
	
	// los atributos de esta clase incluidos los heredados

	
	// Paso 4. Implementar un metodo para conseguir el valor del atributo "tamanyo"
	public int getTamaño() {
		return(this.cadena.length());
	}
}
