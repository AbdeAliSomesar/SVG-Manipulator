package com.example.svgwithmvi.shapehandler.SVG;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0006H\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016\u00a2\u0006\u0002\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0013H\u0016J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\u0016H\u0016J\u0018\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020 H\u0016J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0016H\u0016J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0016H\u0016J\b\u0010-\u001a\u00020\u0019H\u0002J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u0016H\u0016J\u0010\u00100\u001a\u00020\u00192\u0006\u00101\u001a\u00020#H\u0016J\u0010\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020 H\u0016J\u0010\u00104\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u0016H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0004R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082D\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0017\u00a8\u00065"}, d2 = {"Lcom/example/svgwithmvi/shapehandler/SVG/SVGShapeHolder;", "Lcom/example/testproject/shapehandler/ShapeHolder;", "converter", "Lcom/example/testproject/shapehandler/Converter;", "(Lcom/example/testproject/shapehandler/Converter;)V", "SVGShape", "Lcom/example/svgdemo/shapehandler/Shape;", "bitmap", "Landroid/graphics/Bitmap;", "getConverter", "()Lcom/example/testproject/shapehandler/Converter;", "setConverter", "locked", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getLocked", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setLocked", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "mainTag", "", "minMax", "", "", "[Ljava/lang/Float;", "addShape", "", "shape", "getBitmap", "getMinMax", "()[Ljava/lang/Float;", "getShape", "id", "", "getSvgBody", "isEmpty", "", "moveShape", "x", "y", "rearrangeShape", "oldId", "newId", "removeConstantFromHeight", "diff", "removeConstantFromWidth", "updateBitmap", "updateHeightBy", "percent", "updateLockStatus", "status", "updateRotation", "degree", "updateWidthBy", "app_debug"})
public final class SVGShapeHolder implements com.example.testproject.shapehandler.ShapeHolder {
    private com.example.svgdemo.shapehandler.Shape SVGShape;
    private android.graphics.Bitmap bitmap;
    private java.lang.Float[] minMax;
    @org.jetbrains.annotations.NotNull()
    private java.util.concurrent.atomic.AtomicBoolean locked;
    private final java.lang.String mainTag = "<svg height = \"height?\" width = \"width?\"> body?</svg>";
    @org.jetbrains.annotations.NotNull()
    private com.example.testproject.shapehandler.Converter converter;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.atomic.AtomicBoolean getLocked() {
        return null;
    }
    
    public final void setLocked(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.atomic.AtomicBoolean p0) {
    }
    
    @java.lang.Override()
    public void addShape(@org.jetbrains.annotations.NotNull()
    com.example.svgdemo.shapehandler.Shape shape) {
    }
    
    @java.lang.Override()
    public void updateLockStatus(boolean status) {
    }
    
    @java.lang.Override()
    public void updateHeightBy(float percent) {
    }
    
    @java.lang.Override()
    public void updateWidthBy(float percent) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.graphics.Bitmap getBitmap() {
        return null;
    }
    
    private final void updateBitmap() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Float[] getMinMax() {
        return null;
    }
    
    @java.lang.Override()
    public void moveShape(float x, float y) {
    }
    
    @java.lang.Override()
    public void rearrangeShape(int oldId, int newId) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.example.svgdemo.shapehandler.Shape getShape(int id) {
        return null;
    }
    
    @java.lang.Override()
    public void updateRotation(int degree) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getSvgBody() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isEmpty() {
        return false;
    }
    
    @java.lang.Override()
    public void removeConstantFromHeight(float diff) {
    }
    
    @java.lang.Override()
    public void removeConstantFromWidth(float diff) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.testproject.shapehandler.Converter getConverter() {
        return null;
    }
    
    public final void setConverter(@org.jetbrains.annotations.NotNull()
    com.example.testproject.shapehandler.Converter p0) {
    }
    
    @javax.inject.Inject()
    public SVGShapeHolder(@org.jetbrains.annotations.NotNull()
    com.example.testproject.shapehandler.Converter converter) {
        super();
    }
}