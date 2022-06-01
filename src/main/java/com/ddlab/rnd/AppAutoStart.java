package com.ddlab.rnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.mapping.Many2ManyBidMapping;
import com.ddlab.rnd.mapping.Many2ManyUniMapping;
import com.ddlab.rnd.mapping.One2ManyBidMapping;
import com.ddlab.rnd.mapping.One2ManyUniMapping;
import com.ddlab.rnd.mapping.One2OneBiMapping;
import com.ddlab.rnd.mapping.One2OneUniMapping;

@Component
public class AppAutoStart {
	
//	@Autowired
//	private One2OneUniMapping mapping;
	
//	@Autowired
//	private One2OneBiMapping mapping;
	
//	@Autowired
//	private One2ManyUniMapping mapping;
	
//	@Autowired
//	private One2ManyBidMapping mapping;
	
//	@Autowired
//	private Many2ManyUniMapping mapping;
	
	@Autowired
	private Many2ManyBidMapping mapping;
	

	@EventListener(ApplicationReadyEvent.class)
	public void afterStartup() {
		
		// Save One To One Unidirectional
		mapping.save();
	}
}
