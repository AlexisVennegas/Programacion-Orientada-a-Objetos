Practica 1 – Impresora 3D

Nuestro amigo Printacio Tresdedos se ha comprado una impresora 3D y para amortizarla ha
decidido vender piezas impresas con la impresora. Para imprimir dichas piezas usará
filamentos. De cada filamento deberá almacenar una referencia (String), un color (String), el
peso en kg que tiene de dicho filamento y el precio del kilo de filamento.

Dispone de dos tipos de filamento: filamento PLA (usado para figuras decorativas) y filamento
PETG (usado para piezas técnicas que requieren de mayor resistencia).
Se deberá implementar la clase Filamento, la clase PLA (que hereda de Filamento) y la clase
PETG (que hereda de Filamento).

Todos los filamentos implementarán un método calcularPrecio(double peso) que recibirá el
peso en gramos de la pieza que se va a imprimir y devolverá el precio de venta de esa pieza que
será el peso (en kg) multiplicado por el precio por Kg e incrementado un 30% (costes de
producción).

En la clase Printacio que contendrá el método main tendremos una lista con los filamentos que
se tiene en stock.

Al iniciar la aplicación se cargará la lista de filamentos que se habrá guardado al finalizar la
última ejecución del programa en un fichero binario. Si no existe dicho fichero o no puede
abrirse se comenzará con la lista de filamentos vacía. A continuación se mostrará el siguiente
menú:

1. Añadir filamento: se le pedirá al usuario la referencia del filamento a añadir. Si ya existe
en la lista un filamento con dicha referencia lo indicará con un mensaje que indique el
color y la cantidad de la que se dispone y, a continuación, preguntará cuántos kilos se
desea añadir e incrementará los kilos de dicho filamento. Si no se encuentra ningún
filamento con dicha referencia, se preguntará si es filamento PLA o PETG, por el color y
los kilos y se añadirá el nuevo filamento a la lista.

2. Mostrar filamentos: mostrará un listado con todos los filamentos disponibles
(referencia, tipo, color y precio por kilo)

3. Encargar pieza: En primer lugar se le pregunta al usuario si la pieza va a ser puramente
decorativa, en cuyo caso usaremos PLA o si va a necesitar mayor resistencia, y en ese
caso usaremos PETG. A continuación le preguntamos en qué color la quiere y cuántos
gramos pesa la pieza y buscamos en la lista si tenemos filamento suficiente del tipo
indicado y el color adecuado (puede haber varios filamentos del mismo tipo y el mismo
color, pero no podemos combinarlos entre sí, es decir, no podemos sumar sus pesos).
Si no disponemos del filamento necesario se lo indicamos al usuario. Si disponemos del
filamento emitimos una factura con los datos del filamento, el peso de la pieza y el
precio total de venta que será mostrada por pantalla y guardada en un fichero de texto
cuyo nombre indicará el usuario. Una vez emitida la factura se restará la cantidad de
filamento utilizado del peso de filamento disponible.

4. Salir: terminará el programa

Mientras no se seleccione la opción Salir se volverá a mostrar el menú.
Además de las clases indicadas se podrá añadir aquellas que se considere oportuno.
