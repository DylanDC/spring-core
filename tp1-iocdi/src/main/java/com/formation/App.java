package com.formation;

import com.formation.service.FeedbackFactory;
import com.formation.user.UserInteraction;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		UserInteraction afficher = new UserInteraction();
		afficher.setFactory(new FeedbackFactory());
		afficher.sayHello("toto");
		afficher.sayGoodBye("toto");

		System.out.println("et la c'est le bug!");
	}
}
