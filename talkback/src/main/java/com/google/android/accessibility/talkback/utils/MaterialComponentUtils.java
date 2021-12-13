/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.android.accessibility.talkback.utils;

import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.view.ContextThemeWrapper;
import android.widget.Button;
import com.google.android.accessibility.talkback.R;
import com.google.android.accessibility.utils.FeatureSupport;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class MaterialComponentUtils {

  public enum ButtonStyle {
    FILLED_BUTTON,
    OUTLINED_BUTTON,
    DEFAULT_BUTTON
  }

  public static boolean supportMaterialComponent() {
    return FeatureSupport.supportSettingsTheme();
  }

  public static AlertDialog.Builder alertDialogBuilder(Context context) {
    if (supportMaterialComponent()) {
      return new MaterialAlertDialogBuilder(new ContextThemeWrapper(context, R.style.MaterialComponentsTheme), R.style.MaterialAlertDialogStyle);
    }
    return AlertDialogAdaptiveContrastUtil.v7AlertDialogAdaptiveContrastBuilder(context, R.style.AlertDialogTheme);
  }

  public static Button createButton(Context context, ButtonStyle buttonStyle) {
    if (supportMaterialComponent()) {
      if (buttonStyle == ButtonStyle.FILLED_BUTTON) {
        return new MaterialButton(new ContextThemeWrapper(context, R.style.MaterialComponentsTheme), null, R.attr.materialButtonStyle);
      }
      if (buttonStyle == ButtonStyle.OUTLINED_BUTTON) {
        return new MaterialButton(new ContextThemeWrapper(context, R.style.MaterialComponentsTheme), null, R.attr.materialButtonOutlinedStyle);
      }
    }
    return new Button(context);
  }
}
