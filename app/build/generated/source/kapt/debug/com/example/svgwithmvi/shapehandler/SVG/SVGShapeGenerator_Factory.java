// Generated by Dagger (https://google.github.io/dagger).
package com.example.svgwithmvi.shapehandler.SVG;

import dagger.internal.Factory;

public final class SVGShapeGenerator_Factory implements Factory<SVGShapeGenerator> {
  private static final SVGShapeGenerator_Factory INSTANCE = new SVGShapeGenerator_Factory();

  @Override
  public SVGShapeGenerator get() {
    return provideInstance();
  }

  public static SVGShapeGenerator provideInstance() {
    return new SVGShapeGenerator();
  }

  public static SVGShapeGenerator_Factory create() {
    return INSTANCE;
  }

  public static SVGShapeGenerator newSVGShapeGenerator() {
    return new SVGShapeGenerator();
  }
}
