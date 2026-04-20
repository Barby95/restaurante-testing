package com.restaurante.restaurantetesting.controller;

import com.restaurante.restaurantetesting.repository.RestaurantRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest // Esto suele ser lento
@AutoConfigureMockMvc //Para poder usar el objeto mockMvc, lo habilita y configura
class RestaurantControllerTest {
    //restaurant repository
    @Autowired
    RestaurantRepository restaurantRepository;
    //Utilidad de TESTING para lanzar peticiones a controladores en test.
    @Autowired
    MockMvc mockMvc; // hay que hacerle una autowired porque hay que inyectarlo, lanza peticiones al controlador
    @BeforeEach
    void setUp() {
        //Crear datos demo con el setUp que ya hemos visto, tenemos que comentar los datos que pusimos en MAIN
    }

    @Test
    void restaurantsFull() {
        //MOCK es el que te deja hacer peticiones HTTP y testearlas
        //Invocar endpoint http://localhost:8080/restaurantes
        //Este metodo te deja lanzar una peticion, indicarle a donde queremos que apunte la peticion
        //mockMvc.perform();
    }

    @Test
    void restaurantsEmpty(){

    }
}