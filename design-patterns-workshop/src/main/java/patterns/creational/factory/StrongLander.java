package patterns.creational.factory;

import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import space.Planet;

@Slf4j
class StrongLander extends Lander {

  public void doLand(Planet planet) {
    if (planet.hasStrongGravity()) {
      log.info("{} is landing on {}", this, planet);
      return;
    }
    throw new IllegalArgumentException("%s cannot land on %s!".formatted(this, planet));
  }
}