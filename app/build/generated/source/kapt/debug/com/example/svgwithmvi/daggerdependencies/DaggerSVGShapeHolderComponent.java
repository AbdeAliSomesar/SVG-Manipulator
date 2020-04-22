// Generated by Dagger (https://google.github.io/dagger).
package com.example.svgwithmvi.daggerdependencies;

import com.example.svgwithmvi.shapehandler.SVG.BaseShapeFactory;
import com.example.svgwithmvi.shapehandler.ShapeFactory;
import com.example.testproject.shapehandler.ShapeHolder;
import dagger.internal.Preconditions;

public final class DaggerSVGShapeHolderComponent implements SVGShapeHolderComponent {
  private SVGShapeHolderModule sVGShapeHolderModule;

  private DaggerSVGShapeHolderComponent(Builder builder) {
    this.sVGShapeHolderModule = builder.sVGShapeHolderModule;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public ShapeHolder getSVGShapeHolder() {
    return SVGShapeHolderModule_ProvideSVGShapeHolderFactory.proxyProvideSVGShapeHolder(
        sVGShapeHolderModule);
  }

  @Override
  public ShapeFactory getBasicShapeFactory() {
    return new BaseShapeFactory();
  }

  public static final class Builder {
    private SVGShapeHolderModule sVGShapeHolderModule;

    private Builder() {}

    public SVGShapeHolderComponent build() {
      Preconditions.checkBuilderRequirement(sVGShapeHolderModule, SVGShapeHolderModule.class);
      return new DaggerSVGShapeHolderComponent(this);
    }

    public Builder sVGShapeHolderModule(SVGShapeHolderModule sVGShapeHolderModule) {
      this.sVGShapeHolderModule = Preconditions.checkNotNull(sVGShapeHolderModule);
      return this;
    }
  }
}