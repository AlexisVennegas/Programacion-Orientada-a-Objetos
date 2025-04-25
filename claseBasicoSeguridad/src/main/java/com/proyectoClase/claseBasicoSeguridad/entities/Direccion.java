package com.proyectoClase.claseBasicoSeguridad.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="LOCATIONS")
public class Direccion {

    @Id
    @Column(name="LOCATION_ID")
    private  int id;
    @Column(name="STREET_ADDRESS")
    private String calle;
    @Column(name="POSTAL_CODE")
    private String codigoPostal;
    @Column(name="CITY",nullable = false)
    private String ciudad;
    @Column(name="STATE_PROVINCE")
    private String provincia;

    @ManyToOne(optional = true)
    @JoinColumn(name="COUNTRY_ID")
    private Pais pais;

	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [id=" + id + ", calle=" + calle + ", codigoPostal=" + codigoPostal + ", ciudad=" + ciudad
				+ ", provincia=" + provincia + ", pais=" + pais + "]";
	}




}
