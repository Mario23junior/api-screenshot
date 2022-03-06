package com.br.project.printscreen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.br.project.printscreen.service.ServicePrintscreen;

@RestController
@RequestMapping("/project/api/v1/print/")
public class ControllerPrintscreen {

    private ServicePrintscreen service;
    
    public ControllerPrintscreen(ServicePrintscreen service) {
		this.service = service;
	}
    
    @GetMapping
    private void print(@RequestParam Integer x, @RequestParam Integer y,  
    		@RequestParam Integer f,  @RequestParam Integer t, @RequestParam String format) {
				service.printscreean(x, y, f, t,format);
    	
    }
}
