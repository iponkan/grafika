package com.android.grafika;

import android.os.Environment;

import java.io.File;

public class PathUtil {
    public static File getDir() {
        File file = new File(Environment.getExternalStorageDirectory(), "grafika");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
