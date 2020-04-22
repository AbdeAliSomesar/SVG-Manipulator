package com.example.testproject.shapehandler;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\tH&J\b\u0010\u000f\u001a\u00020\u0010H&J\u0015\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H&\u00a2\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0003H&J\b\u0010\u0016\u001a\u00020\u0017H&J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H&J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001dH&J%\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0013H&\u00a2\u0006\u0002\u0010\u001fJ5\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0013H&\u00a2\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\u0003H&J\u0010\u0010\'\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0013H&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0013H&\u00a8\u0006*"}, d2 = {"Lcom/example/testproject/shapehandler/ShapeManager;", "", "addNewShape", "", "shape", "Lcom/example/svgdemo/shapehandler/Shape;", "attachSelected", "createBasicShape", "shapeName", "", "deAttachSelected", "deleteSelected", "duplicateSelected", "generateFromString", "string", "getBitmap", "Landroid/graphics/Bitmap;", "getSelectedArea", "", "", "()[Ljava/lang/Float;", "groupSelected", "isShapeSelected", "", "moveSelected", "x", "y", "rotateSelected", "degree", "", "selectShape", "(FF)[Ljava/lang/Float;", "selectShapes", "x1", "y1", "x2", "y2", "(FFFF)[Ljava/lang/Float;", "unGroupSelected", "updateHeightOfSelectedBy", "percent", "updateWidthOfSelectedBy", "app_debug"})
public abstract interface ShapeManager {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.graphics.Bitmap getBitmap();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Float[] selectShapes(float x1, float y1, float x2, float y2);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Float[] selectShape(float x, float y);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Float[] getSelectedArea();
    
    public abstract boolean isShapeSelected();
    
    public abstract void moveSelected(float x, float y);
    
    public abstract void deleteSelected();
    
    public abstract void rotateSelected(int degree);
    
    public abstract void addNewShape(@org.jetbrains.annotations.NotNull()
    com.example.svgdemo.shapehandler.Shape shape);
    
    public abstract void groupSelected();
    
    public abstract void unGroupSelected();
    
    public abstract void attachSelected();
    
    public abstract void deAttachSelected();
    
    public abstract void duplicateSelected();
    
    public abstract void updateHeightOfSelectedBy(float percent);
    
    public abstract void updateWidthOfSelectedBy(float percent);
    
    public abstract void generateFromString(@org.jetbrains.annotations.NotNull()
    java.lang.String string);
    
    public abstract void createBasicShape(@org.jetbrains.annotations.NotNull()
    java.lang.String shapeName);
}