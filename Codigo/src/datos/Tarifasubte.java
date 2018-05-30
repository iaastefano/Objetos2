package datos;
// Generated 29/05/2018 01:28:13 by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Tarifasubte generated by hbm2java
 */
public class Tarifasubte implements java.io.Serializable {

	private Integer idTarifaSubte;
	private String descripcion;
	private String precio;
	private Set boletosubtes = new HashSet(0);

	public Tarifasubte() {
	}

	public Tarifasubte(String descripcion, String precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Tarifasubte(String descripcion, String precio, Set boletosubtes) {
		this.descripcion = descripcion;
		this.precio = precio;
		this.boletosubtes = boletosubtes;
	}

	public Integer getIdTarifaSubte() {
		return this.idTarifaSubte;
	}

	public void setIdTarifaSubte(Integer idTarifaSubte) {
		this.idTarifaSubte = idTarifaSubte;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPrecio() {
		return this.precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public Set getBoletosubtes() {
		return this.boletosubtes;
	}

	public void setBoletosubtes(Set boletosubtes) {
		this.boletosubtes = boletosubtes;
	}

}