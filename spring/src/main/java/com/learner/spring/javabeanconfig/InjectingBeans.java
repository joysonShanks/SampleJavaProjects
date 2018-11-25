package com.learner.spring.javabeanconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.learner.spring.SpellChecker;
import com.learner.spring.TextEditor;

@Configuration
public class InjectingBeans {

	@Bean
	public SpellChecker spellChecker() {
		return new SpellChecker();
	}

	@Bean
	@Scope("prototype")
	public TextEditor textEditor() {
		TextEditor textEditor = new TextEditor();
		textEditor.setSpellChecker(spellChecker());
		textEditor.setName("Joyson");
		return textEditor;
	}
}
