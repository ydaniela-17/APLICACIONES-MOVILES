package com.example.listadinamicaheroes;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/listadinamicaheroes/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/listadinamicaheroes/OnClickListener;", "()V", "heroeAdapter", "Lcom/example/listadinamicaheroes/HeroeAdapter;", "linearLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "viewBinding", "Lcom/example/listadinamicaheroes/databinding/ActivityMainBinding;", "getHeroes", "", "Lcom/example/listadinamicaheroes/Heroe;", "onClick", "", "heroe", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.listadinamicaheroes.OnClickListener {
    private com.example.listadinamicaheroes.HeroeAdapter heroeAdapter;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager linearLayoutManager;
    private com.example.listadinamicaheroes.databinding.ActivityMainBinding viewBinding;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final java.util.List<com.example.listadinamicaheroes.Heroe> getHeroes() {
        return null;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    com.example.listadinamicaheroes.Heroe heroe) {
    }
    
    public MainActivity() {
        super();
    }
}