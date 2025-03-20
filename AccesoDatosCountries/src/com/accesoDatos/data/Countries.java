package com.accesoDatos.data;

import java.util.Objects;

public class Countries {
	private String countryId;
	private String name;
	private int regionId;
	
	public Countries() {
		super();
	}
	
	public Countries(String country_id, String name, int regionId) {
		super();
		this.countryId = country_id;
		this.name = name;
		this.regionId = regionId;
	}

	public String getCountry_id() {
		return this.countryId;
	}

	public void setCountry_id(String id) {
		this.countryId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

		
	
	@Override
	public String toString() {
		return "Countries [id=" + countryId + ", name=" + name + ", regionId=" + regionId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(countryId, name, regionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Countries other = (Countries) obj;
		return Objects.equals(countryId, other.countryId) && Objects.equals(name, other.name)
				&& Objects.equals(regionId, other.regionId);
	}
	
}
