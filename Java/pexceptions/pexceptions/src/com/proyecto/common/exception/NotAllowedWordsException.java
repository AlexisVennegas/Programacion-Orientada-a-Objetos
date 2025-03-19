package com.proyecto.common.exception;

import com.proyecto.common.NotAllowedWord;

//Paso 1. Identificar esta clase commo hija de StringNotValidException
@SuppressWarnings("serial")
public class NotAllowedWordsException extends StringNotValidException {

	// Paso 2. Indicar un atributo tipo NotAllowedWord llamado "word"
	
	public NotAllowedWord word;
	//Paso 3. Implementar un constructor que tenga los parametros  necesarios
	public NotAllowedWordsException(String code, String message, NotAllowedWord word) {
		super(code, message);
		this.word = word;
	}
	//Paso 3 para invocar al constructor padre y asignar/establecer el valor de word.
	 
   



	//Paso 4. Implementar el método get para devolver el valor de word
	 public NotAllowedWord getWord() {
	        return word;
	    }
	
}
