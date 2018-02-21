package org.ldevos77.azlant.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PortfolioController {
	
	private static final Logger logger = LoggerFactory.getLogger(PortfolioController.class);
	
	@Autowired
	private MessageSource messageSource;

	@RequestMapping(value = "/portfolio", method = RequestMethod.GET)
	public String portfolio(Locale locale, Model model) {
		logger.info(messageSource.getMessage("controler.portfolio.log", null, locale));
		return "portfolio";
	}
	
}
