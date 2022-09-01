package io.clanga.rngservice;

import org.springframework.web.bind.annotation.*;

import io.clanga.gamesshared.rng.RandomDraw;

import java.util.Random;

@RestController
@RequestMapping("/rng-service/v1")
public class RngController {

    @PostMapping("/rng")
    public Integer getDraws(@RequestBody final RandomDraw request) {
        return new Random().nextInt(request.getMaximum() - request.getMinimum()) + request.getMinimum();
    }
}
