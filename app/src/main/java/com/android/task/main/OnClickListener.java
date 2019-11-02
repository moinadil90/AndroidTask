package com.android.task.main;

import android.view.View;

import androidx.annotation.NonNull;


/**
 * Used to propagate click events from all views within DialogPlus.
 * <p>
 * <p>DialogPlus recursively traverse all views and listens on click by default when
 * holder is ViewHolder. </p>
 */
public interface OnClickListener {

  /**
   * Invoked when any view within ViewHolder is clicked.
   *
   * @param view is the clicked view
   */
  void onClick(@NonNull DialogPlus dialog, @NonNull View view);

}
