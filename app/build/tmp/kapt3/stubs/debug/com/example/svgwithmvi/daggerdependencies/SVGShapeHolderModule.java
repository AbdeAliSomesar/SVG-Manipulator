package com.example.svgwithmvi.daggerdependencies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/svgwithmvi/daggerdependencies/SVGShapeHolderModule;", "", "converter", "Lcom/example/testproject/shapehandler/Converter;", "(Lcom/example/testproject/shapehandler/Converter;)V", "provideSVGShapeHolder", "Lcom/example/testproject/shapehandler/ShapeHolder;", "app_debug"})
@dagger.Module()
public final class SVGShapeHolderModule {
    private final com.example.testproject.shapehandler.Converter converter = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.testproject.shapehandler.ShapeHolder provideSVGShapeHolder() {
        return null;
    }
    
    public SVGShapeHolderModule(@org.jetbrains.annotations.NotNull()
    com.example.testproject.shapehandler.Converter converter) {
        super();
    }
}