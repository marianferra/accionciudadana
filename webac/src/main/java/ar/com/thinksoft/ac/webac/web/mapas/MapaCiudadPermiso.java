package ar.com.thinksoft.ac.webac.web.mapas;

import ar.com.thinksoft.ac.intac.IPermiso;
import ar.com.thinksoft.ac.webac.seguridad.Permiso;

public class MapaCiudadPermiso extends Permiso implements IPermiso {

	@Override
	public String getCodigoSeguridad() {
		return "mapaCiudad";
	}

}
