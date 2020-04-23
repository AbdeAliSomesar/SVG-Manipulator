package com.example.svgwithmvi.daggerdependencies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/example/svgwithmvi/daggerdependencies/SVGShapeProviderModule;", "", "()V", "bindsSVGShapeGenerator", "Lcom/example/testproject/shapehandler/ShapeGenerator;", "shapeGenerator", "Lcom/example/svgwithmvi/shapehandler/svg/SVGShapeGenerator;", "shapeProvider", "Lcom/example/testproject/shapehandler/ShapeManager;", "Lcom/example/svgwithmvi/shapehandler/svg/SVGShapeManager;", "app_debug"})
@dagger.Module()
public abstract class SVGShapeProviderModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.testproject.shapehandler.ShapeGenerator bindsSVGShapeGenerator(@org.jetbrains.annotations.NotNull()
    com.example.svgwithmvi.shapehandler.svg.SVGShapeGenerator shapeGenerator);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.example.testproject.shapehandler.ShapeManager shapeProvider(@org.jetbrains.annotations.NotNull()
    com.example.svgwithmvi.shapehandler.svg.SVGShapeManager shapeProvider);
    
    public SVGShapeProviderModule() {
        super();
    }
}