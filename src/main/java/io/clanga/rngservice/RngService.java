package io.clanga.rngservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.clanga.gamesshared.rng.RandomDraw;

@Service
public class RngService {
    @Autowired
    private RngRepository rngRepository;

    public Integer getDraws(final RandomDraw request) {
        return rngRepository.getDraws(request);
    }
}
