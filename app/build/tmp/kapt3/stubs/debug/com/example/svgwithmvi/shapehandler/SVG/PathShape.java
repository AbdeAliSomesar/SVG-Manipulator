package com.example.svgwithmvi.shapehandler.SVG;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001BC\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\u0018\u0010&\u001a\u00020\'2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0016J\u0010\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\u0004H\u0002J\u0010\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020\u0004H\u0002J\u0018\u0010,\u001a\u00020\'2\u0006\u0010-\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001b\u0010.\u001a\u00020\'2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016\u00a2\u0006\u0002\u00100J\n\u00101\u001a\u0004\u0018\u00010\u0001H\u0016J\u001c\u00102\u001a\b\u0012\u0004\u0012\u000204032\f\u00105\u001a\b\u0012\u0004\u0012\u00020403H\u0016J\b\u00106\u001a\u00020\u000fH\u0016J\b\u00107\u001a\u00020\bH\u0016J\u0018\u00108\u001a\u00020\'2\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004H\u0016J\u0010\u0010;\u001a\u00020\'2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010<\u001a\u00020\'2\u0006\u0010=\u001a\u00020\u0004H\u0016J\u0010\u0010>\u001a\u00020\'2\u0006\u0010=\u001a\u00020\u0004H\u0016J\u0010\u0010?\u001a\u00020\'2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010@\u001a\u00020\'H\u0002J\u0018\u0010A\u001a\u00020\'2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0004H\u0016J\u0010\u0010C\u001a\u00020\'2\u0006\u0010D\u001a\u00020\u000fH\u0016J\b\u0010E\u001a\u00020\'H\u0002J\u0018\u0010F\u001a\u00020\'2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0004H\u0016R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001fR\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001f\u00a8\u0006G"}, d2 = {"Lcom/example/svgwithmvi/shapehandler/SVG/PathShape;", "Lcom/example/svgdemo/shapehandler/Shape;", "moves", "", "", "xCoordinates", "yCoordinates", "pathTag", "", "svgAttributes", "([Ljava/lang/Float;[Ljava/lang/Float;[Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "body", "constantX", "constantY", "id", "", "mainTag", "maxX", "getMaxX", "()F", "setMaxX", "(F)V", "maxY", "getMaxY", "setMaxY", "minX", "getMinX", "setMinX", "minY", "getMinY", "setMinY", "[Ljava/lang/Float;", "myShape", "getMyShape", "()Lcom/example/svgdemo/shapehandler/Shape;", "setMyShape", "(Lcom/example/svgdemo/shapehandler/Shape;)V", "svgFile", "addConstant", "", "addConstantX", "width", "addConstantY", "height", "addShape", "shape", "getMinMax", "minMax", "([Ljava/lang/Float;)V", "getShape", "getShapeData", "", "Lcom/example/svgwithmvi/shapehandler/SVG/SVGSharedData;", "svgSharedDataList", "getShapeId", "getShapeSvg", "moveShape", "x", "y", "rearrangeId", "removeConstantFromHeight", "diff", "removeConstantFromWidth", "removeShape", "updateBody", "updateHeightBy", "def", "updateRotation", "value", "updateSvgFile", "updateWidthBy", "app_debug"})
public final class PathShape implements com.example.svgdemo.shapehandler.Shape {
    @org.jetbrains.annotations.Nullable()
    private com.example.svgdemo.shapehandler.Shape myShape;
    private int id;
    private float constantX;
    private float constantY;
    private float minX;
    private float minY;
    private float maxX;
    private float maxY;
    private final java.lang.String mainTag = "<svg height = \"height?\" width = \"width?\" > body? </svg>";
    private java.lang.String svgFile;
    private java.lang.String body;
    private java.lang.Float[] moves;
    private java.lang.Float[] xCoordinates;
    private java.lang.Float[] yCoordinates;
    private java.lang.String pathTag;
    private java.lang.String svgAttributes;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.svgdemo.shapehandler.Shape getMyShape() {
        return null;
    }
    
    public final void setMyShape(@org.jetbrains.annotations.Nullable()
    com.example.svgdemo.shapehandler.Shape p0) {
    }
    
    public final float getMinX() {
        return 0.0F;
    }
    
    public final void setMinX(float p0) {
    }
    
    public final float getMinY() {
        return 0.0F;
    }
    
    public final void setMinY(float p0) {
    }
    
    public final float getMaxX() {
        return 0.0F;
    }
    
    public final void setMaxX(float p0) {
    }
    
    public final float getMaxY() {
        return 0.0F;
    }
    
    public final void setMaxY(float p0) {
    }
    
    @java.lang.Override()
    public void removeConstantFromHeight(float diff) {
    }
    
    @java.lang.Override()
    public void removeConstantFromWidth(float diff) {
    }
    
    @java.lang.Override()
    public void addShape(@org.jetbrains.annotations.NotNull()
    com.example.svgdemo.shapehandler.Shape shape, int id) {
    }
    
    @java.lang.Override()
    public void removeShape(int id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.example.svgdemo.shapehandler.Shape getShape() {
        return null;
    }
    
    @java.lang.Override()
    public int getShapeId() {
        return 0;
    }
    
    @java.lang.Override()
    public void updateHeightBy(float height, float def) {
    }
    
    @java.lang.Override()
    public void updateWidthBy(float width, float def) {
    }
    
    private final void addConstantX(float width) {
    }
    
    private final void addConstantY(float height) {
    }
    
    @java.lang.Override()
    public void rearrangeId(int id) {
    }
    
    @java.lang.Override()
    public void updateRotation(int value) {
    }
    
    @java.lang.Override()
    public void getMinMax(@org.jetbrains.annotations.NotNull()
    java.lang.Float[] minMax) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getShapeSvg() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<com.example.svgwithmvi.shapehandler.SVG.SVGSharedData> getShapeData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.svgwithmvi.shapehandler.SVG.SVGSharedData> svgSharedDataList) {
        return null;
    }
    
    @java.lang.Override()
    public void moveShape(float x, float y) {
    }
    
    @java.lang.Override()
    public void addConstant(float minX, float minY) {
    }
    
    private final void updateBody() {
    }
    
    private final void updateSvgFile() {
    }
    
    @javax.inject.Inject()
    public PathShape(@org.jetbrains.annotations.NotNull()
    java.lang.Float[] moves, @org.jetbrains.annotations.NotNull()
    java.lang.Float[] xCoordinates, @org.jetbrains.annotations.NotNull()
    java.lang.Float[] yCoordinates, @org.jetbrains.annotations.NotNull()
    java.lang.String pathTag, @org.jetbrains.annotations.Nullable()
    java.lang.String svgAttributes) {
        super();
    }
}