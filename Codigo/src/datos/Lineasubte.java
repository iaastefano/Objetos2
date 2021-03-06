package datos;
// Generated 29/05/2018 01:28:13 by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Lineasubte generated by hbm2java
 */
public class Lineasubte implements java.io.Serializable {

	private Integer idLineaSubte;
	private String nombre;
	private Set estacionsubtes = new HashSet(0);

	public Lineasubte() {
	}

	public Lineasubte(String nombre) {
		this.nombre = nombre;
	}

	public Lineasubte(String nombre, Set estacionsubtes) {
		this.nombre = nombre;
		this.estacionsubtes = estacionsubtes;
	}

	public Integer getIdLineaSubte() {
		return this.idLineaSubte;
	}

	public void setIdLineaSubte(Integer idLineaSubte) {
		this.idLineaSubte = idLineaSubte;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getEstacionsubtes() {
		return this.estacionsubtes;
	}

	public void setEstacionsubtes(Set estacionsubtes) {
		this.estacionsubtes = estacionsubtes;
	}

}
