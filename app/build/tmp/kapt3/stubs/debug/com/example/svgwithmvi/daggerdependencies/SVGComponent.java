package com.example.svgwithmvi.daggerdependencies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/svgwithmvi/daggerdependencies/SVGComponent;", "", "getSVGModul", "Lcom/example/svgwithmvi/model/SVGModel;", "getShapeProvider", "Lcom/example/testproject/shapehandler/ShapeManager;", "app_debug"})
@dagger.Component(modules = {com.example.svgwithmvi.daggerdependencies.SVGShapeProviderModule.class, com.example.svgwithmvi.daggerdependencies.SVGConverterModule.class})
@javax.inject.Singleton()
public abstract interface SVGComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.testproject.shapehandler.ShapeManager getShapeProvider();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.svgwithmvi.model.SVGModel getSVGModul();
}