package com.example.svgdemo.shapehandler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\nH&J\u001b\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH&\u00a2\u0006\u0002\u0010\u000eJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u0000H&J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&J\b\u0010\u0014\u001a\u00020\nH&J\b\u0010\u0015\u001a\u00020\u0016H&J\u0018\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0005H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0005H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0018\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\nH&J\u0018\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005H&\u00a8\u0006&"}, d2 = {"Lcom/example/svgdemo/shapehandler/Shape;", "", "addConstant", "", "minX", "", "minY", "addShape", "shape", "id", "", "getMinMax", "minMax", "", "([Ljava/lang/Float;)V", "getShape", "getShapeData", "", "Lcom/example/svgwithmvi/shapehandler/svg/SVGSharedData;", "svgSharedDataList", "getShapeId", "getShapeSvg", "", "moveShape", "x", "y", "rearrangeId", "removeConstantFromHeight", "diff", "removeConstantFromWidth", "removeShape", "updateHeightBy", "height", "def", "updateRotation", "value", "updateWidthBy", "width", "app_debug"})
public abstract interface Shape {
    
    public abstract void addShape(@org.jetbrains.annotations.NotNull()
    com.example.svgdemo.shapehandler.Shape shape, int id);
    
    public abstract int getShapeId();
    
    public abstract void removeShape(int id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.svgdemo.shapehandler.Shape getShape();
    
    public abstract void updateHeightBy(float height, float def);
    
    public abstract void updateWidthBy(float width, float def);
    
    public abstract void rearrangeId(int id);
    
    public abstract void updateRotation(int value);
    
    public abstract void getMinMax(@org.jetbrains.annotations.NotNull()
    java.lang.Float[] minMax);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getShapeSvg();
    
    public abstract void moveShape(float x, float y);
    
    public abstract void addConstant(float minX, float minY);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.svgwithmvi.shapehandler.svg.SVGSharedData> getShapeData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.svgwithmvi.shapehandler.svg.SVGSharedData> svgSharedDataList);
    
    public abstract void removeConstantFromHeight(float diff);
    
    public abstract void removeConstantFromWidth(float diff);
}