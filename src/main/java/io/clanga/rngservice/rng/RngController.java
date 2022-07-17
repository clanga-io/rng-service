package io.clanga.rngservice.rng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.clanga.gamesshared.rng.RngResponse;
import io.clanga.gamesshared.rng.RngRequest;

@RestController
@RequestMapping("/rng/v1")
public class RngController {
    @Autowired
    private RngService rngService;

    @GetMapping("")
    public RngResponse getDraws(@RequestBody final RngRequest request) {
        return rngService.getDraws(request);
    }
}
