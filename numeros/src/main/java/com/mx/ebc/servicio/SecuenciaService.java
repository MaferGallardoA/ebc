package com.mx.ebc.servicio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class SecuenciaService {
	public List<Integer>generarCollatzSequence(int input){
		List<Integer>sequence=new ArrayList<>();// guarda secuencia
		if(input <=0) {
			throw new IllegalArgumentException("el numero debe ser mayor a 0");//no.positivos
		}
		while(input !=1) {
			sequence.add(input);
			input=(input %2 ==0)? //si el numero es par que se divida entre2
					input/2:3* input + 1;//si es impar que se nultriplique por 3 y se le sume 1
			//hasta que sea 1
		}
		sequence.add(1);//termianr en 1
		return sequence;
	}
	public List<String>generarFizzBuzz(int input){
		List<String>result = new ArrayList<>();
		for (int i =1; i<=input; i++) {
			if (i %3 ==0 && i% 5==0) {
				result.add("secuencia FizzBuzz");
			}else if (i%3 ==0) {
				result.add("Fizz");
			}else if (i%5==0) {
				result.add("buzz");
			}else {
				result.add(String.valueOf(i));
			}
		}
		return result;	
	}
}
