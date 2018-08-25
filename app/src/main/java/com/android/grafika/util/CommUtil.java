package com.android.grafika.util;

import android.app.Activity;
import android.content.Context;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

public class CommUtil {
    public static int getRotation(Activity context) {
        int rotation = Surface.ROTATION_0;//竖直方向
        WindowManager windowManager = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE));
        Display display = null;
        if (windowManager != null) {
            display = windowManager.getDefaultDisplay();
        }
        if (display != null) {
            rotation = display.getRotation();
        }
        return rotation;
    }
}
