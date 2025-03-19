package com.proyecto.common.util;

import com.proyecto.common.Constantes;
import com.proyecto.common.NotAllowedWord;
import com.proyecto.common.exception.CodeErrors;
import com.proyecto.common.exception.NotAllowedWordsException;
import com.proyecto.common.exception.StringNotValidException;
import com.proyecto.common.exception.StringTooLongException;
import com.proyecto.common.exception.StringTooShortException;

public class ValidationString {

	NotAllowedWord words;
	// Paso 1. Implementar un método estático "validLenght"que valide
	// si una cadena tiene mas tamañano de 25 posiciones y menos de 1 posición
	// El método tiene que devolver void, utilizar excepciones, declarar las
	// necesarias
		// Paso 1.1. Validar si la cadena no es nula y no esta vacía
		// Paso 1.2 Validar si es mayor que el tamaño maximo (Constantes)
		// Paso 1.3 Validar si es menor que el tamaño minimo (Constantes)
		
		// Paso 1.4 Validar si no contiene palabras no permitidas;
	
	public static void validLenght(String cadena) {
		try {
 			if("".equals(cadena) || cadena == null) throw new StringNotValidException(CodeErrors.NO_STRING, "cadena vacia");
			if(cadena.length() >= Constantes.TAMANO_MAX) throw new StringTooLongException(CodeErrors.STRING_TOO_LONG, "La cadena es demasiado larga.");
			if(cadena.length() <= Constantes.TAMANO_MIN) throw new StringTooShortException(CodeErrors.STRING_TOO_SHORT, "la cadena es demasiado corta", cadena);
			  // Paso 1.4: Validar si la cadena contiene palabras no permitidas
            for (NotAllowedWord word : NotAllowedWord.values()) {
            	if (cadena.toLowerCase().equals(word.name().toLowerCase())) throw new NotAllowedWordsException(CodeErrors.WORD_NOT_ALLOWED_FOUND, "error palabra no valida", word);
            }
		}catch (StringNotValidException e) {
            //
            System.out.println(e.getMessage()); 
        }
	}
	

	// Paso 2: Sobrecargar el método anterior para que realize las
	// validaciones con dos valores máximo y mínimo pasados por parámetros

		public static void validLenght(String cadena, int maximo, int minimo) {
		try {
			validar(cadena, maximo, minimo);
		}catch (StringNotValidException e) {
            //
            System.out.println(e.getMessage()); 
        }
	}


		private static void validar(String cadena, int maximo, int minimo)
			throws StringNotValidException, StringTooLongException, StringTooShortException {
			if("".equals(cadena) || cadena == null) throw new StringNotValidException(CodeErrors.NO_STRING, "Error");
			//if(cadena.length() < maximo || cadena.length() < minimo) throw new StringNotValidException(CodeErrors.NO_STRING, "error");
			if(cadena.length() >maximo) throw new StringTooLongException(CodeErrors.STRING_TOO_LONG, "La cadena es demasiado larga.");
			if(cadena.length() < minimo) throw new StringTooShortException(CodeErrors.STRING_TOO_SHORT, "String corta", cadena);
		}
	

	// Paso 3. Si alguna funcionalidad se repitiese extraerla en un método privado
	

}
