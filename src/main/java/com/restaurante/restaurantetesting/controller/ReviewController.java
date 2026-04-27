package com.restaurante.restaurantetesting.controller;

import com.restaurante.restaurantetesting.repository.ReviewRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class ReviewController {
    private final ReviewRepository reviewRepository; //una vez se crea el repositorio no va a cambiar por eso el final

    //@GetMapping("reviews") // Alomejor para un ADMIN si le sirve ver todas las reviews
    //@GetMapping("reviews/{id}")
    //Meter lo del formulario tenemos que aprender aun
}
