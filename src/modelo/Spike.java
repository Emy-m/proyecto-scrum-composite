package modelo;

import java.util.ArrayList;

public class Spike implements ItemDeTrabajo {

	private ArrayList<ItemDeTrabajo> itemsDeTrabajo = new ArrayList<ItemDeTrabajo>();

	public Spike() {
	}

	@Override
	public void agregarItem(ItemDeTrabajo item) {
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
