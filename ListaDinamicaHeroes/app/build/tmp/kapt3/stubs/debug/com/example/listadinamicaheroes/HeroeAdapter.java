package com.example.listadinamicaheroes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0015B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/listadinamicaheroes/HeroeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/listadinamicaheroes/HeroeAdapter$ViewHolder;", "dataSetHeroes", "", "Lcom/example/listadinamicaheroes/Heroe;", "listener", "Lcom/example/listadinamicaheroes/OnClickListener;", "(Ljava/util/List;Lcom/example/listadinamicaheroes/OnClickListener;)V", "context", "Landroid/content/Context;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class HeroeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.listadinamicaheroes.HeroeAdapter.ViewHolder> {
    private android.content.Context context;
    private final java.util.List<com.example.listadinamicaheroes.Heroe> dataSetHeroes = null;
    private final com.example.listadinamicaheroes.OnClickListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.listadinamicaheroes.HeroeAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.listadinamicaheroes.HeroeAdapter.ViewHolder holder, int position) {
    }
    
    public HeroeAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.listadinamicaheroes.Heroe> dataSetHeroes, @org.jetbrains.annotations.NotNull()
    com.example.listadinamicaheroes.OnClickListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lcom/example/listadinamicaheroes/HeroeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/listadinamicaheroes/HeroeAdapter;Landroid/view/View;)V", "viewBinding", "Lcom/example/listadinamicaheroes/databinding/ItemListaBinding;", "getViewBinding", "()Lcom/example/listadinamicaheroes/databinding/ItemListaBinding;", "setListener", "", "heroe", "Lcom/example/listadinamicaheroes/Heroe;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.listadinamicaheroes.databinding.ItemListaBinding viewBinding = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.listadinamicaheroes.databinding.ItemListaBinding getViewBinding() {
            return null;
        }
        
        public final void setListener(@org.jetbrains.annotations.NotNull()
        com.example.listadinamicaheroes.Heroe heroe) {
        }
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}