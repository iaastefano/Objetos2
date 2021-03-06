package datos;
// Generated 29/05/2018 01:28:13 by Hibernate Tools 5.3.0.Beta2

import java.util.HashSet;
import java.util.Set;

/**
 * Lineatren generated by hbm2java
 */
public class Lineatren implements java.io.Serializable {

	private Integer idLineaTren;
	private String nombre;
	private Set ramaltrens = new HashSet(0);

	public Lineatren() {
	}

	public Lineatren(String nombre) {
		this.nombre = nombre;
	}

	public Lineatren(String nombre, Set ramaltrens) {
		this.nombre = nombre;
		this.ramaltrens = ramaltrens;
	}

	public Integer getIdLineaTren() {
		return this.idLineaTren;
	}

	public void setIdLineaTren(Integer idLineaTren) {
		this.idLineaTren = idLineaTren;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set getRamaltrens() {
		return this.ramaltrens;
	}

	public void setRamaltrens(Set ramaltrens) {
		this.ramaltrens = ramaltrens;
	}

}
