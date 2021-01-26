package com.fsociety.pruebasunitarias;

import com.fsociety.pruebasunitarias.service.CalculadoraService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PruebasUnitariasApplicationTests {

    @Autowired
    private CalculadoraService service;

    @Test
    void sumaTest(){
        //Prueba de datos de entrada
        /*
        * que no sea entero
        * que no sea una cadena
        * que no sea un caracter
        * ...
        * */

        //Ejecutar metodo
        Double res= service.suma(1.00,1.00);
        assertThat(res).isNotNull();
        assertThat(res).isNotNaN();
        assertThat(res).isEqualTo(2);
    }
}
