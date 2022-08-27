package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

//@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoApplication.class, args);
		Task1 t1= new Task1("Recordar P00",false, LocalDate.of(2022,8,19));
		Task1 t2= new Task1("Conocer Intellij IDEA",false, LocalDate.of(2022,8,20));
		Task1 t3= new Task1("Conocer Spring Boot",false, LocalDate.of(2022,8,22));
		Task1 t4= new Task1("Finalizando tareas ...",false, LocalDate.of(2022,8,25));
		Task1 t5= new Task1("Recuperar Finalizando Tareas",false, LocalDate.of(2022,8,20));
		/*
		System.out.println("descripcion de la tarea:");
		System.out.println(t1.getDescription());
		System.out.println("fecha de la tarea:");
		System.out.println(t1.getDueDate());
		System.out.println("estado de la tarea realizada:");
		System.out.println(t1.getDone());

		t1.setDescription("Recordando P00");
*/
	TaskList1 metas=new TaskList1("Tareas iniciales");

	metas.addTaskList(t1);
	metas.addTaskList(t2);
	metas.addTaskList(t3);
	metas.addTaskList(t4);

/*	System.out.println("nueva descripcion de la tarea 1:");
	System.out.println(t1.getDescription());
 */

/*	System.out.println("Tareas iniciales:");
	metas.printTask();
*/
	metas.removeTask("Recordar P00");
	System.out.println("Tareas pendientesss:");
	metas.printTask();
	}


}
