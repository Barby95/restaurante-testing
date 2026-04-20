package com.restaurante.restaurantetesting.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;
//Probar métodos de Restaurant --> Constructor, getter, setter, toString

class RestaurantTest {

    @Test
    @DisplayName("Crear restaurante con constructor vacio")
    void restaurantEmptyConstructor(){
        Restaurant restaurantePrueba = new Restaurant();
        assertNotNull(restaurantePrueba);
    }

    @Test
    void getName(){
        Restaurant restaurante = new Restaurant("Margaretha");
        assertEquals("Margaretha", restaurante.getName());

        Restaurant restaurante2 = new Restaurant("prueba", 15.0);
        assertEquals("prueba", restaurante2.getName());
        assertEquals(15.0, restaurante2.getAveragePrice());
    }

    @Test
    void setNameTest(){
        Restaurant restaurante = new Restaurant();
        restaurante.setName("Roque de los pescadores");
        assertNotNull(restaurante.getName());
        assertEquals("Roque de los pescadores", restaurante.getName());
    }

    @Test
    void checkActiveTrue(){
        Restaurant restaurante = new Restaurant();
        assertTrue(restaurante.getActive());
    }

    @Test
    void toStringTest(){
        Restaurant restaurante = new Restaurant();
        restaurante.setName("La vaca azul");
        System.out.println(restaurante);
    }

    @Test
    void emptyConstructorTest(){
        Restaurant restaurante = new Restaurant();
    }

    @Test
    void allArgsConstructorTest(){
        //Intentar no depender del constructor con todos los parametros para que si cambia no afecte a este codigo
        Restaurant restaurante1 = new Restaurant("Canela", 8.90);
        assertEquals("Canela", restaurante1.getName());
        assertEquals(8.90, restaurante1.getAveragePrice());

        Restaurant restaurante2 = new Restaurant("La Capitana");
        assertEquals("La Capitana", restaurante2.getName());
    }

    @Test
    void builderTest(){
        //Patron que ayuda a construir objetos con la informacion exacta que queremos
        // paso 1 - Empezar con builder()
        // paso 2 - Los atributos que quiera
        // paso 3 - build()

        Restaurant restaurante = Restaurant.builder().name("La Sirena").averagePrice(12.0).build();

        assertEquals("La Sirena", restaurante.getName());
        assertEquals(12.0, restaurante.getAveragePrice());
    }
}