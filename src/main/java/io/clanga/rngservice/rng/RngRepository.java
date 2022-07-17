package io.clanga.rngservice.rng;

import org.springframework.stereotype.Repository;

import io.clanga.gamesshared.rng.RngResponse;
import io.clanga.gamesshared.rng.RngRequest;
import io.clanga.gamesshared.rng.RngDraw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class RngRepository {
    public RngResponse getDraws(final RngRequest request) {
        List<List<Integer>> draws = new ArrayList<>();

        for (RngDraw rngDraw : request.getRngDraws()) {
            List<Integer> currentDraws = new Random().ints(rngDraw.getMinimum(), rngDraw.getMaximum()).distinct()
                    .limit(rngDraw.getNumberOfDraws()).boxed().toList();
            draws.add(currentDraws);
        }

        return RngResponse.builder()
                .requestId(request.getRequestId())
                .draws(draws)
                .build();
    }
}
