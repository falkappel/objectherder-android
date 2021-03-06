/*
 * Copyright (C) 2017 The objectherder-android Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.androidobjectherder;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;

@SuppressLint("ValidFragment")
public class TestFragment extends Fragment {
	private final String theString;

	@SuppressLint("ValidFragment")
	TestFragment(String theString) {
		this.theString = theString;
	}

	@Override
	public String toString() {
		return theString;
	}
}
