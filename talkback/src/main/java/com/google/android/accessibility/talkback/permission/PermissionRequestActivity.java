/*
 * Copyright (C) 2011 The Android Open Source Project
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

package com.google.android.accessibility.talkback.permission;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.TextUtils;
import androidx.core.app.ActivityCompat;
import com.google.android.accessibility.talkback.R;
import com.google.android.accessibility.talkback.utils.MaterialComponentUtils;

public class PermissionRequestActivity extends Activity {
    public static final String ACTION_DONE;
    public static final String ACTION_REJECTED;
    public static final String GRANT_RESULTS;
    public static final String PERMISSIONS;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
        String[] permissions = getIntent().getStringArrayExtra(PERMISSIONS);
        if (permissions != null && permissions.length != 0) {
            if (!TextUtils.equals(permissions[0], Permissions.READ_PHONE_STATE) || permissions.length != 1 || !shouldShowRequestPermissionRationale(Permissions.READ_PHONE_STATE)) {
                ActivityCompat.requestPermissions(this, permissions, 1);
                return;
            }
            AlertDialog alertDialog = MaterialComponentUtils.alertDialogBuilder(this).setTitle(R.string.title_request_phone_permission).setMessage(R.string.message_request_phone_permission).setPositiveButton(R.string.continue_button, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    PermissionRequestActivity.this.lambda$onResume$0$PermissionRequestActivity(dialogInterface, i);
                }
            }).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
            alertDialog.setCanceledOnTouchOutside(true);
            alertDialog.show();
        }
    }

    public void lambda$onResume$0$PermissionRequestActivity(DialogInterface dialog, int buttonClicked) {
        requestPermission(Permissions.READ_PHONE_STATE);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intent broadcastIntent = new Intent();
        finish();
        broadcastIntent.setAction(ACTION_DONE);
        broadcastIntent.putExtra(PERMISSIONS, permissions);
        broadcastIntent.putExtra(GRANT_RESULTS, grantResults);
        sendBroadcast(broadcastIntent);
    }

    private void requestPermission(String permission) {
        ActivityCompat.requestPermissions(this, new String[]{permission}, 1);
    }
}
