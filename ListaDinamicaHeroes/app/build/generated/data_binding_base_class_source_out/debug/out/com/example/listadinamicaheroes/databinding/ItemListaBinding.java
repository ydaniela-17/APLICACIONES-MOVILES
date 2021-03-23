// Generated by view binder compiler. Do not edit!
package com.example.listadinamicaheroes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.listadinamicaheroes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemListaBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView ivImageHeroe;

  @NonNull
  public final TextView tvAlterEgo;

  @NonNull
  public final TextView tvName;

  private ItemListaBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView ivImageHeroe,
      @NonNull TextView tvAlterEgo, @NonNull TextView tvName) {
    this.rootView = rootView;
    this.ivImageHeroe = ivImageHeroe;
    this.tvAlterEgo = tvAlterEgo;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemListaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemListaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_lista, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemListaBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivImageHeroe;
      ImageView ivImageHeroe = rootView.findViewById(id);
      if (ivImageHeroe == null) {
        break missingId;
      }

      id = R.id.tvAlterEgo;
      TextView tvAlterEgo = rootView.findViewById(id);
      if (tvAlterEgo == null) {
        break missingId;
      }

      id = R.id.tvName;
      TextView tvName = rootView.findViewById(id);
      if (tvName == null) {
        break missingId;
      }

      return new ItemListaBinding((ConstraintLayout) rootView, ivImageHeroe, tvAlterEgo, tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
