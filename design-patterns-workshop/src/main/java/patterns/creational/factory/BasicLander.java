package patterns.creational.factory;

import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import space.Planet;

@Slf4j
public class BasicLander extends Lander {

    public void doLand(Planet planet) {
        if (Stream.of(Planet.values()).anyMatch(planet::equals)) {
            log.info("Basic Lander {} is landing on {}", this, planet);
        }
        throw new IllegalArgumentException("Unsupported planet: %s".formatted(planet));
    }

}
