package main;

import modelo.HistoriaDeUsuario;
import modelo.ProyectoDeScrum;
import modelo.Spike;
import modelo.Tarea;

public class Main {

	public static void main(String[] args) {
		ProyectoDeScrum proyectoAgil = new ProyectoDeScrum("Campestre");

		HistoriaDeUsuario historiaDeUsuario1 = new HistoriaDeUsuario();
		HistoriaDeUsuario historiaDeUsuario2 = new HistoriaDeUsuario();
		HistoriaDeUsuario historiaDeUsuario3 = new HistoriaDeUsuario();

		Tarea unaTarea = new Tarea(5);
		Spike unSpike = new Spike(5);

		Tarea unicaTarea = new Tarea(10);

		Tarea masTareas = new Tarea(2);
		Tarea otraTareaMas = new Tarea(5);
		Spike ultimoSpike = new Spike(3);

		historiaDeUsuario1.agregarItem(unaTarea);
		historiaDeUsuario1.agregarItem(unSpike);

		historiaDeUsuario2.agregarItem(unicaTarea);

		historiaDeUsuario3.agregarItem(masTareas);
		historiaDeUsuario3.agregarItem(otraTareaMas);
		historiaDeUsuario3.agregarItem(ultimoSpike);

		proyectoAgil.agregarItem(historiaDeUsuario1);
		proyectoAgil.agregarItem(historiaDeUsuario2);
		proyectoAgil.agregarItem(historiaDeUsuario3);

		System.out.println(proyectoAgil.tiempoNecesario());
	}

}
