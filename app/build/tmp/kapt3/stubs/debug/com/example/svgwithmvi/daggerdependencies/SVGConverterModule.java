package com.example.svgwithmvi.daggerdependencies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0007R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/svgwithmvi/daggerdependencies/SVGConverterModule;", "", "width", "", "height", "(II)V", "provideSVGConverter", "Lcom/example/testproject/shapehandler/Converter;", "app_debug"})
@dagger.Module()
public final class SVGConverterModule {
    private final int width = 0;
    private final int height = 0;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.testproject.shapehandler.Converter provideSVGConverter() {
        return null;
    }
    
    public SVGConverterModule(int width, int height) {
        super();
    }
}