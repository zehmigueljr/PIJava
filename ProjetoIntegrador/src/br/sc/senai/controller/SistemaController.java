package br.sc.senai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sistema")
public class SistemaController {
	
	@RequestMapping(value = "Home/Index", method = RequestMethod.GET)
	public ModelAndView boasVindas(@RequestParam(value = "nome", required = false, defaultValue = "Jos� Miguel") String nome) {

			ModelAndView modelAndView = new ModelAndView("boasVindas");
			modelAndView.addObject("mensagem", "Ol� " + nome);

			return modelAndView;
	}
}