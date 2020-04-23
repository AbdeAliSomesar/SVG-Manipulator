package com.example.svgwithmvi.shapehandler.baseshape;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0016J\u0018\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u001b\u0010\'\u001a\u00020\"2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030)H\u0016\u00a2\u0006\u0002\u0010*J\n\u0010+\u001a\u0004\u0018\u00010\u0001H\u0016J\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0016J\b\u00100\u001a\u00020\u0019H\u0016J\b\u00101\u001a\u00020\bH\u0016J\u0018\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\u00032\u0006\u00104\u001a\u00020\u0003H\u0016J\u0010\u00105\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u00106\u001a\u00020\"2\u0006\u00107\u001a\u00020\u0003H\u0016J\u0010\u00108\u001a\u00020\"2\u0006\u00107\u001a\u00020\u0003H\u0016J\u0010\u00109\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010:\u001a\u00020\"H\u0002J\u0018\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u0003H\u0016J\u0010\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020\u0019H\u0016J\b\u0010@\u001a\u00020\"H\u0002J\u0018\u0010A\u001a\u00020\"2\u0006\u0010B\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u0003H\u0016R\u000e\u0010\n\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR\u000e\u0010\u0017\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, d2 = {"Lcom/example/svgwithmvi/shapehandler/baseshape/Ellipse;", "Lcom/example/svgdemo/shapehandler/Shape;", "radiusX", "", "radiusY", "centerX", "centerY", "svgAttributes", "", "(FFFFLjava/lang/String;)V", "body", "getCenterX", "()F", "setCenterX", "(F)V", "getCenterY", "setCenterY", "constantX", "getConstantX", "setConstantX", "constantY", "getConstantY", "setConstantY", "ellipseTag", "id", "", "mainTag", "myShape", "getMyShape", "()Lcom/example/svgdemo/shapehandler/Shape;", "setMyShape", "(Lcom/example/svgdemo/shapehandler/Shape;)V", "svgFile", "addConstant", "", "minX", "minY", "addShape", "shape", "getMinMax", "minMax", "", "([Ljava/lang/Float;)V", "getShape", "getShapeData", "", "Lcom/example/svgwithmvi/shapehandler/svg/SVGSharedData;", "svgSharedDataList", "getShapeId", "getShapeSvg", "moveShape", "x", "y", "rearrangeId", "removeConstantFromHeight", "diff", "removeConstantFromWidth", "removeShape", "updateBody", "updateHeightBy", "height", "def", "updateRotation", "value", "updateSvgFile", "updateWidthBy", "width", "app_debug"})
public final class Ellipse implements com.example.svgdemo.shapehandler.Shape {
    @org.jetbrains.annotations.Nullable()
    private com.example.svgdemo.shapehandler.Shape myShape;
    private int id;
    private final java.lang.String mainTag = "<svg height = \"height?\" width = \"width?\" > body? </svg>";
    private final java.lang.String ellipseTag = "<ellipse cx = \"cx?\" cy = \"cy?\" rx=\"rx?\" ry=\"ry?\"  r = \"r?\"at? />";
    private java.lang.String svgFile;
    private java.lang.String body;
    private float constantX;
    private float constantY;
    private float radiusX;
    private float radiusY;
    private float centerX;
    private float centerY;
    private java.lang.String svgAttributes;
    
    @java.lang.Override()
    public void removeConstantFromHeight(float diff) {
    }
    
    @java.lang.Override()
    public void removeConstantFromWidth(float diff) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.svgdemo.shapehandler.Shape getMyShape() {
        return null;
    }
    
    public final void setMyShape(@org.jetbrains.annotations.Nullable()
    com.example.svgdemo.shapehandler.Shape p0) {
    }
    
    public final float getConstantX() {
        return 0.0F;
    }
    
    public final void setConstantX(float p0) {
    }
    
    public final float getConstantY() {
        return 0.0F;
    }
    
    public final void setConstantY(float p0) {
    }
    
    @java.lang.Override()
    public void addShape(@org.jetbrains.annotations.NotNull()
    com.example.svgdemo.shapehandler.Shape shape, int id) {
    }
    
    @java.lang.Override()
    public int getShapeId() {
        return 0;
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
    public void updateHeightBy(float height, float def) {
    }
    
    @java.lang.Override()
    public void updateWidthBy(float width, float def) {
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
    public java.util.List<com.example.svgwithmvi.shapehandler.svg.SVGSharedData> getShapeData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.svgwithmvi.shapehandler.svg.SVGSharedData> svgSharedDataList) {
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
    
    public final float getCenterX() {
        return 0.0F;
    }
    
    public final void setCenterX(float p0) {
    }
    
    public final float getCenterY() {
        return 0.0F;
    }
    
    public final void setCenterY(float p0) {
    }
    
    public Ellipse(float radiusX, float radiusY, float centerX, float centerY, @org.jetbrains.annotations.Nullable()
    java.lang.String svgAttributes) {
        super();
    }
}