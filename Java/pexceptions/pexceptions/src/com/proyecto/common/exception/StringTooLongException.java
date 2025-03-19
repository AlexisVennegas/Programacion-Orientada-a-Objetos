package com.proyecto.common.exception;

//Paso 1. Identificar esta clase commo hija de StringNotValidException
@SuppressWarnings("serial")
public class StringTooLongException extends StringNotValidException {



	public final int tamano = 0;
	public String message;
	//Paso 2. Indicar un atributo inmutable tipo int llamado "tamanyo"

	//Paso 3. Implementar el constructor adecuado para asignar valor a todos
	public StringTooLongException(String code, String message) {
		super(code, message);
		this.message = message;
	}
	// los atributos de esta clase incluidos los heredados
	
	//Paso 4. Implementar un metodo para conseguir el valor del atributo "tamanyo"
	public int getTamano() {
		return(message.length());
	}
	
	
	
	
}
