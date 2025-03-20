package com.proyecto.common.exception;


@SuppressWarnings("serial")
public class StringNotValidException extends Exception  {
	
	// Paso 1.Indicar atributo protegido de tipo String llamado "code"
	protected String code;

	// Paso 2. Implementar un contructor, que tenga por parametro un valor para code
	// y un mensaje para el constructor del padre
	public StringNotValidException(String code, String message) {
		super(message);
		this.code = code;
		System.out.println(this.code);
	}


	public String getCode() {
		return code;
	}

}
