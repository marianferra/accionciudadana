package ar.com.thinksoft.ac.webac.usuario;

import ar.com.thinksoft.ac.intac.IUsuario;
import ar.com.thinksoft.ac.webac.HomePagePermiso;
import ar.com.thinksoft.ac.webac.web.mapas.MapaCiudadPermiso;

/**
 * 
 * @author Wilson
 * 
 *         Objeto encargado de crear un nuevo usuario con los permisos standards
 * 
 */
public class UsuarioFactory {

	public IUsuario construirCiudadano() {
		IUsuario usuario = this.construirUsuarioComun();
		return usuario;
	}

	public IUsuario construirOperador() {
		IUsuario usuario = this.construirAdministrativo();
		return usuario;
	}

	public IUsuario construirAdministrador() {
		IUsuario usuario = this.construirAdministrativo();
		return usuario;
	}

	// ********************** METODOS PRIVADOS *********************

	/**
	 * Construye un administrativo que es un usuario comun con los permisos
	 * propios de un administrativo
	 */
	private IUsuario construirAdministrativo() {
		IUsuario usuario = this.construirUsuarioAdministrativo();
		return usuario;
	}

	private IUsuario crearUsuario() {
		return new Usuario();
	}

	/**
	 * Construye un usuario base con los permisos comunes
	 */
	private IUsuario construirUsuarioComun() {

		IUsuario usuario = this.crearUsuario();

		usuario.addPermiso(new HomePagePermiso());

		return usuario;
	}
	
	/**
	 * Construye un usuario administrativo con los permisos correspondientes
	 */
	private IUsuario construirUsuarioAdministrativo() {

		IUsuario usuario = this.construirUsuarioComun();

		usuario.addPermiso(new MapaCiudadPermiso());

		return usuario;
	}
}
