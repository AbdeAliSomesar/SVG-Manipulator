package com.example.svgwithmvi.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001d\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J-\u0010\u0016\u001a\u00020\f2\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011H\u0002\u00a2\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0015J\u0006\u0010\u001c\u001a\u00020\u0015J\u0016\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u0015J\b\u0010\u001f\u001a\u00020\u0015H\u0002J\u0006\u0010 \u001a\u00020\u0015J\u0006\u0010!\u001a\u00020\u0015J6\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0011J\u0016\u0010)\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011J\u0010\u0010*\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010\u0006J\u0016\u0010,\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0011J\u0006\u0010-\u001a\u00020\u0015J\u0016\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\fJ\u000e\u00101\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u0011R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00062"}, d2 = {"Lcom/example/svgwithmvi/model/SVGModel;", "", "shapeProvider", "Lcom/example/testproject/shapehandler/ShapeManager;", "(Lcom/example/testproject/shapehandler/ShapeManager;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "canvas", "Landroid/graphics/Canvas;", "isDoubleTapActive", "", "paint", "Landroid/graphics/Paint;", "previousDistanceFromMoveAction", "", "", "[Ljava/lang/Float;", "selectedArea", "attachSelected", "Landroid/graphics/Bitmap;", "checkInArea", "selectedZone", "x", "y", "([Ljava/lang/Float;FF)Z", "deAttachSelected", "deleteSelected", "doubleTap", "duplicateSelected", "getBitmapWitArea", "groupSelected", "onActionUp", "onDrag", "x1", "y1", "x2", "y2", "distanceX", "distanceY", "onTouchShape", "selectShape", "name", "singleTap", "unGroupSelected", "updateHeightOfSelectedBy", "scaleFactor", "isLocked", "updateWidthOfSelectedBy", "app_debug"})
public final class SVGModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "SVGModel";
    private java.lang.Float[] selectedArea;
    private java.lang.Float[] previousDistanceFromMoveAction;
    private final android.graphics.Canvas canvas = null;
    private final android.graphics.Paint paint = null;
    private boolean isDoubleTapActive;
    private final com.example.testproject.shapehandler.ShapeManager shapeProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap onActionUp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap onDrag(float x1, float y1, float x2, float y2, float distanceX, float distanceY) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap updateHeightOfSelectedBy(float scaleFactor, boolean isLocked) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap updateWidthOfSelectedBy(float scaleFactor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap singleTap(float x, float y) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap onTouchShape(float x, float y) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap doubleTap(float x, float y) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap selectShape(@org.jetbrains.annotations.Nullable()
    java.lang.String name) {
        return null;
    }
    
    private final boolean checkInArea(java.lang.Float[] selectedZone, float x, float y) {
        return false;
    }
    
    private final android.graphics.Bitmap getBitmapWitArea() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap attachSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap deAttachSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap groupSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap unGroupSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap duplicateSelected() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap deleteSelected() {
        return null;
    }
    
    @javax.inject.Inject()
    public SVGModel(@org.jetbrains.annotations.NotNull()
    com.example.testproject.shapehandler.ShapeManager shapeProvider) {
        super();
    }
}