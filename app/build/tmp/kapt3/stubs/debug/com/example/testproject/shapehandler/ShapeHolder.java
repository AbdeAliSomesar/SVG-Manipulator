package com.example.testproject.shapehandler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\nH&J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\nH&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\nH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\nH&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0012H&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u000eH&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\nH&\u00a8\u0006#"}, d2 = {"Lcom/example/testproject/shapehandler/ShapeHolder;", "", "addShape", "", "shape", "Lcom/example/svgdemo/shapehandler/Shape;", "getBitmap", "Landroid/graphics/Bitmap;", "getMinMax", "", "", "()[Ljava/lang/Float;", "getShape", "id", "", "getSvgBody", "", "isEmpty", "", "moveShape", "x", "y", "rearrangeShape", "oldId", "newId", "removeConstantFromHeight", "diff", "removeConstantFromWidth", "updateHeightBy", "percent", "updateLockStatus", "status", "updateRotation", "degree", "updateWidthBy", "app_debug"})
public abstract interface ShapeHolder {
    
    public abstract void addShape(@org.jetbrains.annotations.NotNull()
    com.example.svgdemo.shapehandler.Shape shape);
    
    public abstract void updateHeightBy(float percent);
    
    public abstract void updateWidthBy(float percent);
    
    public abstract void updateLockStatus(boolean status);
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.graphics.Bitmap getBitmap();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Float[] getMinMax();
    
    public abstract void moveShape(float x, float y);
    
    public abstract void rearrangeShape(int oldId, int newId);
    
    @org.jetbrains.annotations.Nullable()
    public abstract com.example.svgdemo.shapehandler.Shape getShape(int id);
    
    public abstract void updateRotation(int degree);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getSvgBody();
    
    public abstract boolean isEmpty();
    
    public abstract void removeConstantFromHeight(float diff);
    
    public abstract void removeConstantFromWidth(float diff);
}