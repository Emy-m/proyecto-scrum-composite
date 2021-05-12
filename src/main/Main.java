package main;

import modelo.HistoriaDeUsuario;
import modelo.ProyectoDeScrum;
import modelo.Spike;
import modelo.Tarea;

public class Main {

	public static void main(String[] args) {
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

		System.out.println(proyectoAgil.tiempoNecesario());
	}

}
