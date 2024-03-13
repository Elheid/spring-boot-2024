package com.students.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Timer;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws InterruptedException {

		SpringApplication.run(Application.class, args);
	}

/*	используется DI через конструктор
	используется DI через поле
	используется DI через сеттеры
	создаются и внедряются два бина разных классов, но реализующих один интерфейс
	при создании и “разрушении” бина в лог выводится сообщение*/
}
