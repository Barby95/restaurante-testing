package com.restaurante.restaurantetesting.controller;

import com.restaurante.restaurantetesting.repository.DishRepository;
import org.springframework.web.bind.annotation.GetMapping;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
@Controller
@AllArgsConstructor
public class DishController {
    private final DishRepository dishRepository; //una vez se crea el repositorio no va a cambiar por eso el final

    //@GetMapping("dish/{id}") // Alomejor para un ADMIN si le sirve ver todas las reviews

}



