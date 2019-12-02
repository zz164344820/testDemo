package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastTool {
    public static void showToast(Context context){
        Toast.makeText(context,"文案显示",Toast.LENGTH_LONG).show();
    }
}
