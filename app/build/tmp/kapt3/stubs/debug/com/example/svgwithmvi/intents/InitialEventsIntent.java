package com.example.svgwithmvi.intents;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent;", "", "()V", "ActionSelect", "ShapeSelect", "TouchEvents", "intialState", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$intialState;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ShapeSelect;", "app_debug"})
public abstract class InitialEventsIntent {
    
    private InitialEventsIntent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$intialState;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent;", "()V", "app_debug"})
    public static final class intialState extends com.example.svgwithmvi.intents.InitialEventsIntent {
        public static final com.example.svgwithmvi.intents.InitialEventsIntent.intialState INSTANCE = null;
        
        private intialState() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent;", "()V", "DoubleTap", "OnActionUp", "OnDrag", "Pinch", "SingleTap", "onDown", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$OnDrag;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$OnActionUp;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$onDown;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$Pinch;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$SingleTap;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$DoubleTap;", "app_debug"})
    public static abstract class TouchEvents extends com.example.svgwithmvi.intents.InitialEventsIntent {
        
        private TouchEvents() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u001c"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$OnDrag;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents;", "event1", "Landroid/view/MotionEvent;", "event2", "distanceX", "", "distanceY", "(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)V", "getDistanceX", "()F", "getDistanceY", "getEvent1", "()Landroid/view/MotionEvent;", "getEvent2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class OnDrag extends com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents {
            @org.jetbrains.annotations.NotNull()
            private final android.view.MotionEvent event1 = null;
            @org.jetbrains.annotations.NotNull()
            private final android.view.MotionEvent event2 = null;
            private final float distanceX = 0.0F;
            private final float distanceY = 0.0F;
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.MotionEvent getEvent1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.MotionEvent getEvent2() {
                return null;
            }
            
            public final float getDistanceX() {
                return 0.0F;
            }
            
            public final float getDistanceY() {
                return 0.0F;
            }
            
            public OnDrag(@org.jetbrains.annotations.NotNull()
            android.view.MotionEvent event1, @org.jetbrains.annotations.NotNull()
            android.view.MotionEvent event2, float distanceX, float distanceY) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.MotionEvent component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.MotionEvent component2() {
                return null;
            }
            
            public final float component3() {
                return 0.0F;
            }
            
            public final float component4() {
                return 0.0F;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents.OnDrag copy(@org.jetbrains.annotations.NotNull()
            android.view.MotionEvent event1, @org.jetbrains.annotations.NotNull()
            android.view.MotionEvent event2, float distanceX, float distanceY) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$OnActionUp;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents;", "()V", "app_debug"})
        public static final class OnActionUp extends com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents {
            public static final com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents.OnActionUp INSTANCE = null;
            
            private OnActionUp() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$onDown;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents;", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class onDown extends com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents {
            private final float x = 0.0F;
            private final float y = 0.0F;
            
            public final float getX() {
                return 0.0F;
            }
            
            public final float getY() {
                return 0.0F;
            }
            
            public onDown(float x, float y) {
                super();
            }
            
            public final float component1() {
                return 0.0F;
            }
            
            public final float component2() {
                return 0.0F;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents.onDown copy(float x, float y) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$Pinch;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents;", "()V", "UpdateHeight", "UpdateWidth", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$Pinch$UpdateHeight;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$Pinch$UpdateWidth;", "app_debug"})
        public static abstract class Pinch extends com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents {
            
            private Pinch() {
                super();
            }
            
            @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$Pinch$UpdateHeight;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$Pinch;", "scaleFactor", "", "isLocked", "", "(FZ)V", "()Z", "getScaleFactor", "()F", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_debug"})
            public static final class UpdateHeight extends com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents.Pinch {
                private final float scaleFactor = 0.0F;
                private final boolean isLocked = false;
                
                public final float getScaleFactor() {
                    return 0.0F;
                }
                
                public final boolean isLocked() {
                    return false;
                }
                
                public UpdateHeight(float scaleFactor, boolean isLocked) {
                    super();
                }
                
                public final float component1() {
                    return 0.0F;
                }
                
                public final boolean component2() {
                    return false;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents.Pinch.UpdateHeight copy(float scaleFactor, boolean isLocked) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                    return false;
                }
            }
            
            @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$Pinch$UpdateWidth;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$Pinch;", "scaleFactor", "", "(F)V", "getScaleFactor", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
            public static final class UpdateWidth extends com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents.Pinch {
                private final float scaleFactor = 0.0F;
                
                public final float getScaleFactor() {
                    return 0.0F;
                }
                
                public UpdateWidth(float scaleFactor) {
                    super();
                }
                
                public final float component1() {
                    return 0.0F;
                }
                
                @org.jetbrains.annotations.NotNull()
                public final com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents.Pinch.UpdateWidth copy(float scaleFactor) {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull()
                @java.lang.Override()
                public java.lang.String toString() {
                    return null;
                }
                
                @java.lang.Override()
                public int hashCode() {
                    return 0;
                }
                
                @java.lang.Override()
                public boolean equals(@org.jetbrains.annotations.Nullable()
                java.lang.Object p0) {
                    return false;
                }
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$SingleTap;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents;", "event", "Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;)V", "getEvent", "()Landroid/view/MotionEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class SingleTap extends com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents {
            @org.jetbrains.annotations.NotNull()
            private final android.view.MotionEvent event = null;
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.MotionEvent getEvent() {
                return null;
            }
            
            public SingleTap(@org.jetbrains.annotations.NotNull()
            android.view.MotionEvent event) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.MotionEvent component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents.SingleTap copy(@org.jetbrains.annotations.NotNull()
            android.view.MotionEvent event) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents$DoubleTap;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$TouchEvents;", "event", "Landroid/view/MotionEvent;", "(Landroid/view/MotionEvent;)V", "getEvent", "()Landroid/view/MotionEvent;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
        public static final class DoubleTap extends com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents {
            @org.jetbrains.annotations.NotNull()
            private final android.view.MotionEvent event = null;
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.MotionEvent getEvent() {
                return null;
            }
            
            public DoubleTap(@org.jetbrains.annotations.NotNull()
            android.view.MotionEvent event) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final android.view.MotionEvent component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.example.svgwithmvi.intents.InitialEventsIntent.TouchEvents.DoubleTap copy(@org.jetbrains.annotations.NotNull()
            android.view.MotionEvent event) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object p0) {
                return false;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0006\t\n\u000b\f\r\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent;", "()V", "Attach", "DeAttach", "Delete", "Duplicate", "Group", "UnGroup", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect$Delete;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect$Attach;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect$DeAttach;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect$Group;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect$UnGroup;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect$Duplicate;", "app_debug"})
    public static abstract class ActionSelect extends com.example.svgwithmvi.intents.InitialEventsIntent {
        
        private ActionSelect() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect$Delete;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect;", "()V", "app_debug"})
        public static final class Delete extends com.example.svgwithmvi.intents.InitialEventsIntent.ActionSelect {
            public static final com.example.svgwithmvi.intents.InitialEventsIntent.ActionSelect.Delete INSTANCE = null;
            
            private Delete() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect$Attach;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect;", "()V", "app_debug"})
        public static final class Attach extends com.example.svgwithmvi.intents.InitialEventsIntent.ActionSelect {
            public static final com.example.svgwithmvi.intents.InitialEventsIntent.ActionSelect.Attach INSTANCE = null;
            
            private Attach() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect$DeAttach;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect;", "()V", "app_debug"})
        public static final class DeAttach extends com.example.svgwithmvi.intents.InitialEventsIntent.ActionSelect {
            public static final com.example.svgwithmvi.intents.InitialEventsIntent.ActionSelect.DeAttach INSTANCE = null;
            
            private DeAttach() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect$Group;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect;", "()V", "app_debug"})
        public static final class Group extends com.example.svgwithmvi.intents.InitialEventsIntent.ActionSelect {
            public static final com.example.svgwithmvi.intents.InitialEventsIntent.ActionSelect.Group INSTANCE = null;
            
            private Group() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect$UnGroup;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect;", "()V", "app_debug"})
        public static final class UnGroup extends com.example.svgwithmvi.intents.InitialEventsIntent.ActionSelect {
            public static final com.example.svgwithmvi.intents.InitialEventsIntent.ActionSelect.UnGroup INSTANCE = null;
            
            private UnGroup() {
                super();
            }
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect$Duplicate;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent$ActionSelect;", "()V", "app_debug"})
        public static final class Duplicate extends com.example.svgwithmvi.intents.InitialEventsIntent.ActionSelect {
            public static final com.example.svgwithmvi.intents.InitialEventsIntent.ActionSelect.Duplicate INSTANCE = null;
            
            private Duplicate() {
                super();
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/svgwithmvi/intents/InitialEventsIntent$ShapeSelect;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent;", "shapeName", "", "(Ljava/lang/String;)V", "getShapeName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ShapeSelect extends com.example.svgwithmvi.intents.InitialEventsIntent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String shapeName = null;
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getShapeName() {
            return null;
        }
        
        public ShapeSelect(@org.jetbrains.annotations.NotNull()
        java.lang.String shapeName) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.svgwithmvi.intents.InitialEventsIntent.ShapeSelect copy(@org.jetbrains.annotations.NotNull()
        java.lang.String shapeName) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}