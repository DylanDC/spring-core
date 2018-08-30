package com.formation.service;

public class FeedbackFactory {
	private FeedbackFactory factory;

	/**
	 * By default, a {@link FeedbackFactory} return an instance of
	 * {@link FeedbackToConsole}
	 */
	public IFeedback getFeedback() {
		return new FeedbackToConsole();
	}

	public void setFactory(FeedbackFactory factory) {
		this.factory = factory;
	}
}
