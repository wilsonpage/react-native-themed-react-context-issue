package com.myproject;

import android.content.Intent;
import android.os.Handler;
import android.view.View;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

public class MyUIComponent extends SimpleViewManager<View> {

    @Override
    public String getName() {
        return "MyUIComponent";
    }

    @Override
    protected View createViewInstance(final ThemedReactContext reactContext) {

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                Intent contentSelectionIntent = new Intent(Intent.ACTION_GET_CONTENT);
                contentSelectionIntent.addCategory(Intent.CATEGORY_OPENABLE);
                contentSelectionIntent.setType("image/*");
                Intent chooserIntent = new Intent(Intent.ACTION_CHOOSER);
                chooserIntent.putExtra(Intent.EXTRA_INTENT, contentSelectionIntent);
                reactContext.startActivityForResult(chooserIntent, 1, null);
            }
        }, 3000);

        return new View(reactContext);
    }
}