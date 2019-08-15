package com.nienjan.izura.chatreader.utils;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

public class CommonUtility {
    public static void makeToast (Context context, String message) {
        Toast.makeText(context,message,Toast.LENGTH_LONG).show();
    }

    public static void info (String message) {
        Log.i(getCallerCallerClassName(),message);
    }

    public static void error (String message) {
        Log.e(getCallerCallerClassName(),message);
    }

    public static void data (String message) {
        Log.d(getCallerCallerClassName(),message);
    }


    /**
     * TODO: understand this function from:
     * https://stackoverflow.com/questions/11306811/how-to-get-the-caller-class-in-java
     */
    @Nullable
    private static String getCallerCallerClassName() {
        StackTraceElement[] stElements = Thread.currentThread().getStackTrace();
        String callerClassName = null;
        for (int i=1; i<stElements.length; i++) {
            StackTraceElement ste = stElements[i];
            if (!ste.getClassName().equals(CommonUtility.class.getName())&& ste.getClassName().indexOf("java.lang.Thread")!=0) {
                if (callerClassName == null) {
                    callerClassName = ste.getClassName();
                } else if (!callerClassName.equals(ste.getClassName())) {
                    return ste.getClassName();
                }
            }
        }
        return null;
    }
}
