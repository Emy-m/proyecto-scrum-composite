package modelo;

import java.util.ArrayList;

public class HistoriaDeUsuario implements ItemDeTrabajo {

	private ArrayList<ItemDeTrabajo> itemsDeTrabajo = new ArrayList<ItemDeTrabajo>();

	public HistoriaDeUsuario() {
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
