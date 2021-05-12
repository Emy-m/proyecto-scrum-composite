package modelo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ProyectoTest {
	@Test
	public void tiempoRequeridoProyecto() {
		ProyectoDeScrum proyectoAgil = new ProyectoDeScrum("Campestre");

		HistoriaDeUsuario unaHistoriaDeUsuario = new HistoriaDeUsuario();
		Tarea unaTarea = new Tarea(5);
		Tarea otraTarea = new Tarea(10);

		Spike unSpike = new Spike();
		Tarea masTareas = new Tarea(2);
		Tarea otraTareaMas = new Tarea(5);

		unaHistoriaDeUsuario.agregarItem(unaTarea);
		unaHistoriaDeUsuario.agregarItem(otraTarea);

		unSpike.agregarItem(masTareas);
		unSpike.agregarItem(otraTareaMas);

		proyectoAgil.agregarItem(unaHistoriaDeUsuario);
		proyectoAgil.agregarItem(unSpike);

		assertEquals(15, proyectoAgil.tiempoNecesario());
	}

	@Test
	public void tiempoRequeridoHistoria() {
		HistoriaDeUsuario historiaDeUsuario1 = new HistoriaDeUsuario();

		Tarea unaTarea = new Tarea(5);

		historiaDeUsuario1.agregarItem(unaTarea);

		assertEquals(5, historiaDeUsuario1.tiempoNecesario());
	}
}
