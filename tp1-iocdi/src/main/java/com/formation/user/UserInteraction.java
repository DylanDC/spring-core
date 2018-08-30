package com.formation.user;

import java.text.MessageFormat;

import com.formation.service.FeedbackFactory;

public class UserInteraction {

	private FeedbackFactory factory;

	public void setFactory(FeedbackFactory factory) {
		this.factory = factory;
	}

	public UserInteraction() {

	}

	/**
	 * To say hello to the user named <code>name</code>
	 *
	 * @param name
	 */
	public void sayHello(String name) {
		factory.getFeedback().say(MessageFormat.format("Hello {0} !", name));

	}

	/**
	 * To say goodbye to the user named <code>name</code>
	 *
	 * @param name
	 */
	public void sayGoodBye(String name) {
		factory.getFeedback().say(MessageFormat.format("Hello {0} !", name));
	}
}
