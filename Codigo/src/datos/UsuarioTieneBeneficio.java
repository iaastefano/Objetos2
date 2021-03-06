package datos;
// Generated 29/05/2018 01:28:13 by Hibernate Tools 5.3.0.Beta2

import java.util.Date;

/**
 * UsuarioTieneBeneficio generated by hbm2java
 */
public class UsuarioTieneBeneficio implements java.io.Serializable {

	private UsuarioTieneBeneficioId id;
	private Beneficio beneficio;
	private Usuario usuario;
	private Date ultimaFechaCobro;

	public UsuarioTieneBeneficio() {
	}

	public UsuarioTieneBeneficio(UsuarioTieneBeneficioId id, Beneficio beneficio, Usuario usuario,
			Date ultimaFechaCobro) {
		this.id = id;
		this.beneficio = beneficio;
		this.usuario = usuario;
		this.ultimaFechaCobro = ultimaFechaCobro;
	}

	public UsuarioTieneBeneficioId getId() {
		return this.id;
	}

	public void setId(UsuarioTieneBeneficioId id) {
		this.id = id;
	}

	public Beneficio getBeneficio() {
		return this.beneficio;
	}

	public void setBeneficio(Beneficio beneficio) {
		this.beneficio = beneficio;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getUltimaFechaCobro() {
		return this.ultimaFechaCobro;
	}

	public void setUltimaFechaCobro(Date ultimaFechaCobro) {
		this.ultimaFechaCobro = ultimaFechaCobro;
	}

}
