package com.formation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.formation.user.UserInteraction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext conf = new AnnotationConfigApplicationContext(AppConfig.class);
		UserInteraction interaction = conf.getBean(UserInteraction.class);
		// ApplicationContext applicationContext = new
		// ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
		// UserInteraction interaction =
		// applicationContext.getBean(UserInteraction.class);
		// afficher.setFactory(new FeedbackFactory());
		interaction.sayHello("toto");
		interaction.sayGoodBye("toto");

		System.out.println("et la c'est le bug!");

		// close application context
		// ?
	}
}
