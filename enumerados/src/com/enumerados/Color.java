package com.enumerados;

public enum Color { ROJO("FF0000"), VERDE("000FFF"), AZUL("00FF00"), AMARILLO("FFFF00");
	String codigo;

	
	 Color(String codigo) {
		this.codigo = codigo;
	}
	

	public String getCodigo() {
		// TODO Auto-generated method stub
		return codigo;
	}
	
	public Color init(String param) {
		return (Color(param));
	}
}
