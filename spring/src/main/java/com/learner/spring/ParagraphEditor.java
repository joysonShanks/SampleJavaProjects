package com.learner.spring;

/**
 * @author Jaison
 *
 */
public class ParagraphEditor {

	private ParagraphChecker paragraphChecker;
	private String name;

	public ParagraphEditor(ParagraphChecker paragraphChecker, String name) {
		this.paragraphChecker = paragraphChecker;
		this.name = name;
	}
	
	public ParagraphChecker getParagraphChecker() {
		return paragraphChecker;
	}

	/*public void setParagraphChecker(ParagraphChecker paragraphChecker) {
		this.paragraphChecker = paragraphChecker;
	}*/

	public String getName() {
		return name;
	}

	/*public void setName(String name) {
		this.name = name;
	}*/

}
