package com.example.svgwithmvi.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 62\u00020\u0001:\u00016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u0019H\u0002J\u000e\u0010(\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-J\u0010\u0010/\u001a\u0004\u0018\u0001002\u0006\u00101\u001a\u00020-J\b\u00102\u001a\u000203H\u0014J\u0010\u00104\u001a\u0002032\u0006\u00105\u001a\u00020$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\u00190\u00190\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001b\"\u0004\b!\u0010\u001dR\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, d2 = {"Lcom/example/svgwithmvi/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "actionProcessorHolder", "Lcom/example/svgwithmvi/actionprocessor/ActionProcessorHolder;", "actionsFragmentDataList", "Lcom/example/svgwithmvi/View/maintaskrecyclerview/RecyclerViewImageAndTextDataListHolder;", "getActionsFragmentDataList", "()Lcom/example/svgwithmvi/View/maintaskrecyclerview/RecyclerViewImageAndTextDataListHolder;", "setActionsFragmentDataList", "(Lcom/example/svgwithmvi/View/maintaskrecyclerview/RecyclerViewImageAndTextDataListHolder;)V", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "mainImageViewBitmap", "Landroidx/lifecycle/MutableLiveData;", "Landroid/graphics/Bitmap;", "getMainImageViewBitmap", "()Landroidx/lifecycle/MutableLiveData;", "setMainImageViewBitmap", "(Landroidx/lifecycle/MutableLiveData;)V", "mainImagesData", "getMainImagesData", "setMainImagesData", "mainIntentsPublisher", "Lio/reactivex/subjects/PublishSubject;", "Lcom/example/svgwithmvi/intents/InitialEventsIntent;", "getMainIntentsPublisher", "()Lio/reactivex/subjects/PublishSubject;", "setMainIntentsPublisher", "(Lio/reactivex/subjects/PublishSubject;)V", "onTouchImagePublisher", "kotlin.jvm.PlatformType", "getOnTouchImagePublisher", "setOnTouchImagePublisher", "statesObservable", "Lio/reactivex/Observable;", "Lcom/example/svgwithmvi/model/state/ProjectViewState;", "actionFromIntents", "Lcom/example/svgwithmvi/intents/IntentActions;", "intent", "compose", "createInitialList", "", "Lcom/example/svgwithmvi/View/maintaskrecyclerview/RecyclerViewImageAndTextDataListHolder$RecyclerViewData;", "getActionId", "", "position", "getShapeName", "", "resourceId", "onCleared", "", "render", "state", "Companion", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.svgwithmvi.actionprocessor.ActionProcessorHolder actionProcessorHolder = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> mainImageViewBitmap;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.subjects.PublishSubject<com.example.svgwithmvi.intents.InitialEventsIntent> mainIntentsPublisher;
    private io.reactivex.Observable<com.example.svgwithmvi.model.state.ProjectViewState> statesObservable;
    @org.jetbrains.annotations.NotNull()
    private io.reactivex.subjects.PublishSubject<com.example.svgwithmvi.intents.InitialEventsIntent> onTouchImagePublisher;
    @org.jetbrains.annotations.NotNull()
    private com.example.svgwithmvi.View.maintaskrecyclerview.RecyclerViewImageAndTextDataListHolder mainImagesData;
    @org.jetbrains.annotations.NotNull()
    private com.example.svgwithmvi.View.maintaskrecyclerview.RecyclerViewImageAndTextDataListHolder actionsFragmentDataList;
    private final io.reactivex.disposables.CompositeDisposable disposable = null;
    private static final io.reactivex.functions.BiFunction<com.example.svgwithmvi.model.state.ProjectViewState, com.example.svgwithmvi.intents.IntentActionResult, com.example.svgwithmvi.model.state.ProjectViewState> reducer = null;
    public static final com.example.svgwithmvi.viewmodel.MainViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> getMainImageViewBitmap() {
        return null;
    }
    
    public final void setMainImageViewBitmap(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<android.graphics.Bitmap> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<com.example.svgwithmvi.intents.InitialEventsIntent> getMainIntentsPublisher() {
        return null;
    }
    
    public final void setMainIntentsPublisher(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.PublishSubject<com.example.svgwithmvi.intents.InitialEventsIntent> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.subjects.PublishSubject<com.example.svgwithmvi.intents.InitialEventsIntent> getOnTouchImagePublisher() {
        return null;
    }
    
    public final void setOnTouchImagePublisher(@org.jetbrains.annotations.NotNull()
    io.reactivex.subjects.PublishSubject<com.example.svgwithmvi.intents.InitialEventsIntent> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.svgwithmvi.View.maintaskrecyclerview.RecyclerViewImageAndTextDataListHolder getMainImagesData() {
        return null;
    }
    
    public final void setMainImagesData(@org.jetbrains.annotations.NotNull()
    com.example.svgwithmvi.View.maintaskrecyclerview.RecyclerViewImageAndTextDataListHolder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.svgwithmvi.View.maintaskrecyclerview.RecyclerViewImageAndTextDataListHolder getActionsFragmentDataList() {
        return null;
    }
    
    public final void setActionsFragmentDataList(@org.jetbrains.annotations.NotNull()
    com.example.svgwithmvi.View.maintaskrecyclerview.RecyclerViewImageAndTextDataListHolder p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.svgwithmvi.View.maintaskrecyclerview.RecyclerViewImageAndTextDataListHolder.RecyclerViewData> createInitialList() {
        return null;
    }
    
    private final io.reactivex.Observable<com.example.svgwithmvi.model.state.ProjectViewState> compose() {
        return null;
    }
    
    private final com.example.svgwithmvi.intents.IntentActions actionFromIntents(com.example.svgwithmvi.intents.InitialEventsIntent intent) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getShapeName(int resourceId) {
        return null;
    }
    
    public final int getActionId(int position) {
        return 0;
    }
    
    private final void render(com.example.svgwithmvi.model.state.ProjectViewState state) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public MainViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/example/svgwithmvi/viewmodel/MainViewModel$Companion;", "", "()V", "reducer", "Lio/reactivex/functions/BiFunction;", "Lcom/example/svgwithmvi/model/state/ProjectViewState;", "Lcom/example/svgwithmvi/intents/IntentActionResult;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}