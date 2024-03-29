package com.android.task.main;

import android.view.View;

import androidx.annotation.NonNull;

/**
 * It is used to propagate click events for {@link ListHolder}}
 *
 * <p>For each item click, {@link #onItemClick(DialogPlus, Object, View, int)} will be invoked</p>
 */
public interface OnItemClickListener {

  void onItemClick(@NonNull DialogPlus dialog, @NonNull Object item, @NonNull View view, int position);

}
