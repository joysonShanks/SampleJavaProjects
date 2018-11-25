package com.learner.spring.annotationbased;

import java.awt.event.WindowStateListener;

import org.springframework.beans.factory.annotation.Autowired;

import com.learner.spring.GrammerChecker;
import com.learner.spring.ParagraphChecker;
import com.learner.spring.SpellChecker;

/**
 * Example for annotation based configuration
 * 
 * @author Jaison
 *
 */
public class WysiwygEditor {

	@Autowired
	private GrammerChecker grammerChecker;
	
	private ParagraphChecker paragraphChecker;
	
	private SpellChecker spellChecker;
	
	@Autowired
	public void setParagraphChecker(ParagraphChecker paragraphChecker) {
		this.paragraphChecker = paragraphChecker;
	}
	
	public ParagraphChecker getParagraphChecker() {
		return this.paragraphChecker;
	}
	
	@Autowired
	public WysiwygEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void initiateWysiwyg() {
		System.out.println("Initiating wysiwyg editor");
		this.spellChecker.checkSpelling();
		this.paragraphChecker.checkParagraph();
		this.grammerChecker.checkGrammer();
	}
	
}
