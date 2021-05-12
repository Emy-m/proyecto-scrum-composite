package modelo;

import java.util.ArrayList;

public class ProyectoDeScrum implements ItemDeTrabajo {

	private ArrayList<ItemDeTrabajo> itemsDeTrabajo = new ArrayList<ItemDeTrabajo>();
	private String nombreProyecto;

	public ProyectoDeScrum(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	@Override
	public void agregarItem(ItemDeTrabajo item) {
		this.itemsDeTrabajo.add(item);
	}

	@Override
	public int tiempoNecesario() {
		int tiempo = 0;
		for (ItemDeTrabajo item : itemsDeTrabajo) {
			tiempo += item.tiempoNecesario();
		}

		return tiempo;
	}

}
