import java.util.ArrayList;
import java.util.List;

public class pCadenas {
    public static void main(String[] args) {


        //     1.Imprimir la longitud de una cadena
            String cadena = "Hola Mundo";
            System.out.println("La longitud de la cadena es: " + cadena.length());

//        2.Convertir una cadena a mayúsculas
            String cadenaMayusculas = cadena.toUpperCase();
            System.out.println("Cadena en mayúsculas: " + cadenaMayusculas);

//        3.Convertir una cadena a minúsculas
            String cadenaMinusculas = cadena.toLowerCase();
            System.out.println("Cadena en minúsculas: " + cadenaMinusculas);

//        4.Obtener el carácter en una posición específica
            int posicion = 4; // Cambia la posición según lo necesites
            char caracter = cadena.charAt(posicion);
            System.out.println("Carácter en la posición " + posicion + ": " + caracter);
//        5.Concatenar dos cadenas
            String cadena2 = " Bienvenido";
            String cadenaConcatenada = cadena.concat(cadena2);
            System.out.println("Cadena concatenada: " + cadenaConcatenada);

            // o
            String cadenaConcatenada2 = cadena + cadena2;
            System.out.println("Cadena concatenada: " + cadenaConcatenada2);

//        6.Verificar si una cadena contiene otra cadena
            String subcadena = "Mundo";
            boolean contiene = cadena.contains(subcadena);
            System.out.println("¿La cadena contiene '" + subcadena + "'? " + contiene);
//        7.Verificar si una cadena empieza con un prefijo
            String prefijo = "Hola";
            boolean empiezaCon = cadena.startsWith(prefijo);
            System.out.println("¿La cadena empieza con '" + prefijo + "'? " + empiezaCon);
//        8.Verificar si una cadena termina con un sufijo
            String sufijo = "Mundo";
            boolean terminaCon = cadena.endsWith(sufijo);
            System.out.println("¿La cadena termina con '" + sufijo + "'? " + terminaCon);
//        9.Comparar dos cadenas ignorando mayúsculas/minúsculas
            String cadena3 = "hola mundo";
            boolean sonIguales = cadena.equalsIgnoreCase(cadena3);
            System.out.println("¿Las cadenas son iguales (ignorando mayúsculas/minúsculas)? " + sonIguales);
//        10.Eliminar espacios al inicio y al final de una cadena
            String cadenaConEspacios = "   Hola Mundo   ";
            String cadenaSinEspacios = cadenaConEspacios.trim();
            System.out.println("Cadena sin espacios al inicio y al final: '" + cadenaSinEspacios + "'");
//        11.Reemplazar caracteres en una cadena. Cambiar la o por la a, en cualquier cadena
            String cadenaReemplazada = cadena.replace('o', 'a');
            System.out.println("Cadena con 'o' reemplazada por 'a': " + cadenaReemplazada);
//        12.Contar cuántas veces aparece un carácter o cadena
            char caracterContar = 'o';
            int contador = 0;
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == caracterContar) {
                    contador++;
                }
            }
            System.out.println("El carácter '" + caracterContar + "' aparece " + contador + " veces en la cadena.");
//        13.Invertir una cadena
            String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
            System.out.println("Cadena invertida: " + cadenaInvertida);
//        14.Verificar si una cadena es un palíndromo
            String cadenaPalindromo = "anilina";
            String cadenaPalindromoInvertida = new StringBuilder(cadenaPalindromo).reverse().toString();
            boolean esPalindromo = cadenaPalindromo.equals(cadenaPalindromoInvertida);
            System.out.println("¿La cadena '" + cadenaPalindromo + "' es un palíndromo? " + esPalindromo);
//        15.Dada la cadena "Mi casa es grande" quitar primera palabra y la última
//        utilizar el método substring, indexof y lastIndexOf
         String cadenaOriginal = "Mi casa es grande";
            int inicio = cadenaOriginal.indexOf(" ") + 1; // Encuentra el primer espacio
            int fin = cadenaOriginal.lastIndexOf(" "); // Encuentra el último espacio
            String cadenaSinPrimeraYUltima = cadenaOriginal.substring(inicio, fin);
            System.out.println("Cadena sin primera y última palabra: " + cadenaSinPrimeraYUltima);
//        16.Dada la cadena "Mi casa es grande" mostrar con un syso el valor de cada
//        palabra utilizando el método split
            String cadenaPalabras = "Mi casa es grande";
            String[] palabras = cadenaPalabras.split(" ");
            System.out.println("Palabras de la cadena:");
            for (String palabra : palabras) {
                System.out.println(palabra);
            }

//        17.Convertir una cadena a mayusculas sin utilizar toUpperCase
            String cadenaSinMayusculas = "";
            for (int i = 0; i < cadena.length(); i++) {
                char c = cadena.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    c = (char) (c - 32); // Convierte a mayúscula
                }
                cadenaSinMayusculas += c;
            }
//        18.Dada la cadena "Mi casa es grande" mostrar con un syso
//        el valor de entero de cada palabra, utilizar el método split y getBytes
        String cadenaEnteros = "Mi casa es grande";
        String[] palabrasEnteros = cadenaEnteros.split(" ");
        System.out.println("Valores enteros de cada palabra:");
        for (String palabra : palabrasEnteros) {
            byte[] bytes = palabra.getBytes();
            System.out.print("Palabra: " + palabra + " - Valores enteros: ");
            for (byte b : bytes) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
//        19.Dada la cadena "Mi casa es grande" quitar primera palabra y la última
//        utilizar el método substring
        String cadenaOriginal2 = "Mi casa es grande";
        int inicio2 = cadenaOriginal2.indexOf(" ") + 1; // Encuentra el primer espacio
        int fin2 = cadenaOriginal2.lastIndexOf(" "); // Encuentra el último espacio
        String cadenaSinPrimeraYUltima2 = cadenaOriginal2.substring(inicio2, fin2);
        System.out.println("Cadena sin primera y última palabra: " + cadenaSinPrimeraYUltima2);
//        20.Construir un array con todas las palabras de una cadena,
//        Construir una lista con los elementos impares del array,
//                Volver a generar una cadena con los elementos que queden
//        Realizarlo con jdk8 y con jdk17
        String cadenaArray = "Mi casa es grande";
        String[] palabrasArray = cadenaArray.split(" ");
        List<String> listaImpares = new ArrayList<>();
        for (int i = 0; i < palabrasArray.length; i++) {
            if (i % 2 != 0) {
                listaImpares.add(palabrasArray[i]);
            }
        }
        StringBuilder cadenaFinal = new StringBuilder();
        for (String palabra : listaImpares) {
            cadenaFinal.append(palabra).append(" ");
        }
        System.out.println("Cadena con elementos impares: " + cadenaFinal.toString().trim());

    }
    }
