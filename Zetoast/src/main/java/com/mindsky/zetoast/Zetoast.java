package com.mindsky.zetoast;

import android.content.Context;
import android.widget.Toast;

public class Zetoast {
    public static void singletoast (Context context, String smg){
        Toast.makeText(context, smg, Toast.LENGTH_SHORT).show();
    }
}
