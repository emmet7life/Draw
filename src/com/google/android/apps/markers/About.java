/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.apps.markers;

import android.app.Activity;
import android.app.AlertDialog;

class About {
	static void show(final Activity activity) {
		final AlertDialog.Builder builder = new AlertDialog.Builder(activity);
		builder.setTitle(R.string.about_title);
		builder.setCancelable(false);
//		builder.setPositiveButton(R.string.about_dismiss_button,
//				new DialogInterface.OnClickListener() {
//					public void onClick(DialogInterface dialog, int which) {
//					}
//				});
		builder.setMessage(R.string.about_body);
		builder.create().show();
	}
}