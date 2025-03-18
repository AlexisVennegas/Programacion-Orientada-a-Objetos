package com.ejercicios.Restaurante.RestauranteCoreccion;


/*
 * 
 * 
 	* En un restaurante especializado en huevos fritos con chorizo necesitan un
	programa que les calcule cuántos platos de huevos con chorizo pueden
	preparar con la cantidad de existencias disponibles en la cámara frigorífica.
	Escribe los siguientes métodos:
	constructor(int, double): recibirá el número de docenas de huevos y de
	kilos de chorizo disponible en el frigorífico.
	addHuevos(int): incrementa el número de docenas de huevos.
	addChorizos(double): incrementa el número de kilos de chorizo.
	getNumPlatos(): devuelvel el número de platos de huevos con chorizo
	que se pueden ofrecer con las existencias actuales, teniendo en cuenta
	que cada plato necesita una media de 2 huevos y 200 gramos de chorizo.
	sirvePlato(): disminuye el número de huevos y de kilos de chorizo
	porque se ha servido un plato (2 huevos menos y 200 gramos de chorizo
	menos)
	getHuevos(): devuelve el número de huevos (no de docenas) que quedan
	en la cámara.
	getChorizo(): devuelve el número de kilos de chorizo que quedan en la
	cámara
 */
public class Restaurante {
<<<<<<< HEAD
=======
	
	private  Ingredientes huevos;
	private  Ingredientes gmsChorizo;
	private  Platos platos;
	Restaurante(int docenasHuevos, double kilosChorizo){
		this.huevos = new Ingredientes("Huevo", docenasHuevos * 12);
		this.gmsChorizo = new Ingredientes("Chorizo", kilosChorizo * 1000);
		this.platos = new Platos("huevos", 2);
	}
	
	
	public int getNumPlatos() {
		
		int 	totalPlatos;
		double 	huevosAux,
				chorizoAux;
		
			totalPlatos = 0;
			huevosAux = this.huevos.getCantidad();
			chorizoAux = this.gmsChorizo.getCantidad();
		
		while(huevosAux > platos.getHuevosPorPlato() && chorizoAux > platos.getChorizoPorPlato()) {
			totalPlatos++;
			huevosAux -= platos.getHuevosPorPlato();
			chorizoAux -= platos.getChorizoPorPlato();
		}
		return(totalPlatos);
	}
	
	
	public void sirvePlato() {
		this.huevos.setCantidad(this.huevos.getCantidad()-platos.getHuevosPorPlato()); 
		this.gmsChorizo.setCantidad(this.gmsChorizo.getCantidad()-platos.getChorizoPorPlato());
	}
	
>>>>>>> 3a7a5acc7dcb742c39f1cb0e4b04bedffe157f22
}

