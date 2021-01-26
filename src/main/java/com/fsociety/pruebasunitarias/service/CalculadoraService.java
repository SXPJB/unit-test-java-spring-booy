package com.fsociety.pruebasunitarias.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {


    public Double suma(Double a,Double b){
        return a+b+5;
    }

    public Double resta(Double a,Double b){
        return a-b;
    }

    public Double multipliacion(Double a,Double b){
        return a*b;
    }

    public Double divicion(Double a,Double b){
        return a/b;
    }

    public Double modulo(Double a,Double b){
        return a%b;
    }

    public Double raizQuatrada(Double numero){
        return Math.sqrt(numero);
    }

    public Double potencia(Double numero,Double potencia){
        return Math.pow(numero,potencia);
    }
}
