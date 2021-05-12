package modelo;

public class Tarea implements ItemDeTrabajo {

	private int tiempoNecesario;

	public Tarea(int tiempoNecesario) {
		this.tiempoNecesario = tiempoNecesario;
	}

	@Override
	public void agregarItem(ItemDeTrabajo item) {
	}

	@Override
	public int tiempoNecesario() {
		return this.tiempoNecesario;
	}

}
