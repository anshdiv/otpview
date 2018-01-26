OTP View
============================
[![Platform](https://img.shields.io/badge/platform-android-green.svg)](http://developer.android.com/index.html)
[![](https://jitpack.io/v/anshdiv/otpview.svg)](https://jitpack.io/#anshdiv/otpview)


 <img src="https://github.com/anshdiv/otpview/blob/master/screener_1516997884769.png" width="350"/>

Usage
-----

Create an PayConfig object and set the values accordingly:
```java
   OtpView otpView= findViewById(R.id.otpview);
        TextInputLayout textInputLayout = findViewById(R.id.textinputlayout);// use this to set error
        otpView.setTextInputLayout(textInputLayout);
        otpView.setOtpViewEventListener(new OtpView.OtpViewEventListener() {
            @Override
            public void onDataEntered(OtpView OtpView, boolean fromUser) {
                // do something here
            }
        });
```

Xml file
```xml
<com.appzgarden.OtpView
        android:id="@+id/otpview"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        app:cursorVisible="false"
        app:forceKeyboard="false"
        app:hint="-"
        app:inputType="number"
        app:password="false"
        app:pinBackground="@drawable/otp_view_background"
        app:pinHeight="40dp"
        app:pinLength="6"
        app:pinWidth="40dp" />

```

Download
-------

1. Add it in your root build.gradle at the end of repositories:

```groovy
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
2. Add the dependency
```groovy
dependencies {
	        compile 'com.github.anshdiv:otpview:1.0.0'
	}
```

License
-------

      Copyright 2018 Anshul Gour
   
      Licensed under the Apache License, Version 2.0 (the "License");
      you may not use this file except in compliance with the License.
      You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

      Unless required by applicable law or agreed to in writing, software
      distributed under the License is distributed on an "AS IS" BASIS,
      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
      See the License for the specific language governing permissions and
      limitations under the License.
