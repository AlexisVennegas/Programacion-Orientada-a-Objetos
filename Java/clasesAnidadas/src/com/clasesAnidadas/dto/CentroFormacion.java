package com.clasesAnidadas.dto;

public class CentroFormacion {
	
	private int id;
	private String name;
	
	public CentroFormacion() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public class Aula{
		private int id;
		private String codigo;
		public Aula() {
			super();
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getCodigo() {
			return codigo;
		}
		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		
	}

}
