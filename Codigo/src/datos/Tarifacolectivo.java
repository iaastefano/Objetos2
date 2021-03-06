package datos;
// Generated 29/05/2018 01:28:13 by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Tarifacolectivo generated by hbm2java
 */
public class Tarifacolectivo implements java.io.Serializable {

	private Integer idTarifaColectivo;
	private String descripcion;
	private String precio;
	private Set boletocolectivos = new HashSet(0);

	public Tarifacolectivo() {
	}

	public Tarifacolectivo(String descripcion, String precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Tarifacolectivo(String descripcion, String precio, Set boletocolectivos) {
		this.descripcion = descripcion;
		this.precio = precio;
		this.boletocolectivos = boletocolectivos;
	}

	public Integer getIdTarifaColectivo() {
		return this.idTarifaColectivo;
	}

	public void setIdTarifaColectivo(Integer idTarifaColectivo) {
		this.idTarifaColectivo = idTarifaColectivo;
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

	public Set getBoletocolectivos() {
		return this.boletocolectivos;
	}

	public void setBoletocolectivos(Set boletocolectivos) {
		this.boletocolectivos = boletocolectivos;
	}

}
