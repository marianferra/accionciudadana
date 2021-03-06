package ar.com.thinksoft.ac.andrac.adapter;

import java.util.StringTokenizer;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import ar.com.thinksoft.ac.andrac.R;
import ar.com.thinksoft.ac.andrac.dominio.Reclamo;

/**
 * Se encarga de representar un item dentro del listado de reclamos guardados.
 * 
 * @since 31-10-2011
 * @author Paul
 */
public class ReclamoGuardadoAdapter extends ArrayAdapter<Reclamo> {

	// Almacena acceso a la Activity padre
	Activity context = null;
	// Almacena la coleccion de reclamos
	Reclamo[] reclamos;

	public ReclamoGuardadoAdapter(Activity context, Reclamo[] reclamos) {
		super(context, R.layout.lista_reclamos_guardados_item, reclamos);
		this.context = context;
		this.reclamos = reclamos;
	}

	/**
	 * Asigna los valores de Reclamo a un item de la ListView
	 * 
	 * @author Paul
	 * @since 11-08-2011
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup padre) {
		LayoutInflater inflater = this.context.getLayoutInflater();
		View item = inflater.inflate(R.layout.lista_reclamos_guardados_item,
				null);
		// Obtiene el control
		ImageView icono = (ImageView) item.findViewById(R.id.item_estado);
		// Muestra el icono del estado de reclamo
		icono.setImageResource(R.drawable.alert_dialog_icon);
		// Asigna el tipo de incidente
		TextView titulo = (TextView) item.findViewById(R.id.item_tipo);
		titulo.setText(this.reclamos[position].getTipoIncidente());
		Log.d(this.getClass().getName(),
				"Tipo:" + this.reclamos[position].getTipoIncidente());
		// Asigna la barrio y fecha
		TextView subTitulo = (TextView) item.findViewById(R.id.item_barrio);
		subTitulo.setText(this.reclamos[position].getBarrioIncidente() + " "
				+ this.reclamos[position].getFechaReclamo());
		return (item);
	}

}
