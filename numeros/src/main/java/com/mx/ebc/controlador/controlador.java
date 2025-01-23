package com.mx.ebc.controlador;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.ebc.servicio.SecuenciaService;

@RestController
@RequestMapping("/api/secuence")
public class controlador {
	 @Autowired
	    private SecuenciaService secuenceService;
	 
	    @PutMapping("/collatz/{input}")
	    public ResponseEntity<Map<String, Object>> getCollatzSequence(@PathVariable int input) {
	        List<Integer> sequence = secuenceService.generarCollatzSequence(input);
	        return ResponseEntity.ok(Map.of("input", input, "sequence", sequence));
	    }

	    @PostMapping("/fizzbuzz/{input}")
	    public ResponseEntity<Map<String, Object>> getFizzBuzz(@PathVariable int input) {
	        List<String> fizzBuzzResult = secuenceService.generarFizzBuzz(input);
	        return ResponseEntity.ok(Map.of("input", input, "fizzBuzz", fizzBuzzResult));
	    }
}
