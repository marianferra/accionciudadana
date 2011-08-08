package ar.com.thinksoft.ac.webac.web.mapas;

/*import org.apache.wicket.PageParameters;
import org.apache.wicket.markup.html.CSSPackageResource;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;*/

import ar.com.thinksoft.ac.intac.IPermiso;
import ar.com.thinksoft.ac.webac.web.base.BasePage;
//import ar.com.thinksoft.ac.webac.web.login.LoginPage;

public class MapaCiudadPage extends BasePage{

	@Override
	public IPermiso getPermisoNecesario() {
		
		return new MapaCiudadPermiso();
	}

}
