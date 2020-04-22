// Generated by Dagger (https://google.github.io/dagger).
package com.example.svgwithmvi.shapehandler.SVG;

import dagger.internal.Factory;
import javax.inject.Provider;

public final class PathShape_Factory implements Factory<PathShape> {
  private final Provider<Float[]> movesAndXCoordinatesAndYCoordinatesProvider;

  private final Provider<String> pathTagAndSvgAttributesProvider;

  public PathShape_Factory(
      Provider<Float[]> movesAndXCoordinatesAndYCoordinatesProvider,
      Provider<String> pathTagAndSvgAttributesProvider) {
    this.movesAndXCoordinatesAndYCoordinatesProvider = movesAndXCoordinatesAndYCoordinatesProvider;
    this.pathTagAndSvgAttributesProvider = pathTagAndSvgAttributesProvider;
  }

  @Override
  public PathShape get() {
    return provideInstance(
        movesAndXCoordinatesAndYCoordinatesProvider, pathTagAndSvgAttributesProvider);
  }

  public static PathShape provideInstance(
      Provider<Float[]> movesAndXCoordinatesAndYCoordinatesProvider,
      Provider<String> pathTagAndSvgAttributesProvider) {
    return new PathShape(
        movesAndXCoordinatesAndYCoordinatesProvider.get(),
        movesAndXCoordinatesAndYCoordinatesProvider.get(),
        movesAndXCoordinatesAndYCoordinatesProvider.get(),
        pathTagAndSvgAttributesProvider.get(),
        pathTagAndSvgAttributesProvider.get());
  }

  public static PathShape_Factory create(
      Provider<Float[]> movesAndXCoordinatesAndYCoordinatesProvider,
      Provider<String> pathTagAndSvgAttributesProvider) {
    return new PathShape_Factory(
        movesAndXCoordinatesAndYCoordinatesProvider, pathTagAndSvgAttributesProvider);
  }

  public static PathShape newPathShape(
      Float[] moves,
      Float[] xCoordinates,
      Float[] yCoordinates,
      String pathTag,
      String svgAttributes) {
    return new PathShape(moves, xCoordinates, yCoordinates, pathTag, svgAttributes);
  }
}