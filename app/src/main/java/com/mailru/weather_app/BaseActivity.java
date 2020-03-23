package com.mailru.weather_app;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(getClass().getSimpleName() + " - LifeCycle", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(getClass().getSimpleName() + " - LifeCycle", "onStart");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(getClass().getSimpleName() + " - LifeCycle", "onRestoreInstanceState");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(getClass().getSimpleName() + " - LifeCycle", "onResume");

    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(getClass().getSimpleName() + " - LifeCycle", "onPause");

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(getClass().getSimpleName() + " - LifeCycle", "onSaveInstanceState");
    }

    /**
     * Должно рабоать при явном прописании в манифесте android:configChanges="orientation"
     * но у меня не вызывается метод =(
     *
     * @Override public void onConfigurationChanged(@NonNull Configuration newConfig) {
     * super.onConfigurationChanged(newConfig);
     * Log.d(getClass().getSimpleName() + " - LifeCycle", "onConfigurationChanged");
     * if (Configuration.ORIENTATION_LANDSCAPE == newConfig.orientation)
     * Toast.makeText(this, "Orientation Landscape", Toast.LENGTH_SHORT).show();
     * else if (Configuration.ORIENTATION_PORTRAIT == newConfig.orientation)
     * Toast.makeText(this, "Orientation Portrait", Toast.LENGTH_SHORT).show();
     * }
     */

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(getClass().getSimpleName() + " - LifeCycle", "onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(getClass().getSimpleName() + " - LifeCycle", "onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(getClass().getSimpleName() + " - LifeCycle", "onDestroy");
    }
}
