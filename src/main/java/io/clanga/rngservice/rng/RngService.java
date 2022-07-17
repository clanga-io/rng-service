package io.clanga.rngservice.rng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.clanga.gamesshared.rng.RngResponse;
import io.clanga.gamesshared.rng.RngRequest;

@Service
public class RngService {
    @Autowired
    private RngRepository rngRepository;

    public RngResponse getDraws(final RngRequest request) {
        return rngRepository.getDraws(request);
    }
}
