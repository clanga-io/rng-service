package io.clanga.rngservice;

import org.springframework.stereotype.Repository;

import io.clanga.gamesshared.rng.RandomDraw;

import java.util.Random;

@Repository
public class RngRepository {
    public Integer getDraws(final RandomDraw request) {
        return new Random().nextInt(request.getMaximum() - request.getMinimum()) + request.getMinimum();
    }
}
