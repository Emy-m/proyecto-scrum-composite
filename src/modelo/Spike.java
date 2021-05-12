package modelo;

public class Spike implements ItemDeTrabajo {

	private int tiempoNecesario;

	public Spike(int tiempoNecesario) {
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
