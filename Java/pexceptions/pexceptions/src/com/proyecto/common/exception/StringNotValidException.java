package com.proyecto.common.exception;

public class StringNotValidException {

	// Paso 1.Indicar atributo protegido de tipo String llamado "code"
	protected String code;

	// Paso 2. Implementar un contructor, que tenga por parametro un valor para code
	// y un mensaje para el constructor del padre
	public StringNotValidException(String code, String message) {
		super(message);
		this.code = code;
	}

	// Paso 3. Implementar un metodo para conseguir el valor del atributo "code"
	public String getCode() {
		return code;
	}

}
