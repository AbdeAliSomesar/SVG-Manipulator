package com.example.svgwithmvi.daggerdependencies;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/svgwithmvi/daggerdependencies/SVGShapeHolderComponent;", "", "getBasicShapeFactory", "Lcom/example/svgwithmvi/shapehandler/ShapeFactory;", "getSVGShapeHolder", "Lcom/example/testproject/shapehandler/ShapeHolder;", "app_debug"})
@dagger.Component(modules = {com.example.svgwithmvi.daggerdependencies.SVGShapeHolderModule.class, com.example.svgwithmvi.daggerdependencies.BaseShapeFactoryModule.class})
public abstract interface SVGShapeHolderComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.testproject.shapehandler.ShapeHolder getSVGShapeHolder();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.svgwithmvi.shapehandler.ShapeFactory getBasicShapeFactory();
}