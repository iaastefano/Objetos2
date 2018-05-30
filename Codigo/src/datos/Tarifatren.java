package datos;
// Generated 29/05/2018 01:28:13 by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Tarifatren generated by hbm2java
 */
public class Tarifatren implements java.io.Serializable {

	private Integer idTarifaTren;
	private int cantEstaciones;
	private String descripcion;
	private float precio;
	private Set boletotrens = new HashSet(0);

	public Tarifatren() {
	}

	public Tarifatren(int cantEstaciones, String descripcion, float precio) {
		this.cantEstaciones = cantEstaciones;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public Tarifatren(int cantEstaciones, String descripcion, float precio, Set boletotrens) {
		this.cantEstaciones = cantEstaciones;
		this.descripcion = descripcion;
		this.precio = precio;
		this.boletotrens = boletotrens;
	}

	public Integer getIdTarifaTren() {
		return this.idTarifaTren;
	}

	public void setIdTarifaTren(Integer idTarifaTren) {
		this.idTarifaTren = idTarifaTren;
	}

	public int getCantEstaciones() {
		return this.cantEstaciones;
	}

	public void setCantEstaciones(int cantEstaciones) {
		this.cantEstaciones = cantEstaciones;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Set getBoletotrens() {
		return this.boletotrens;
	}

	public void setBoletotrens(Set boletotrens) {
		this.boletotrens = boletotrens;
	}

}