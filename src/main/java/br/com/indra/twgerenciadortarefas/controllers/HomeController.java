package br.com.indra.twgerenciadortarefas.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public ModelAndView home() { 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home/home");
		mv.addObject("mensagem", "Mensagem do controller");
		return mv;
	}
        
        @GetMapping("/teste")
	public ModelAndView teste() { 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("teste/teste");
		mv.addObject("mensagem", "Mensagem do tester");
		return mv;
	}
	
	
//	https://stackoverflow.com/questions/40118878/8080-port-already-taken-issue-when-trying-to-redeploy-project-from-spring-tool-s/53628669

}
