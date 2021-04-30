package com.zhongjh.viewxyexample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import static android.view.MotionEvent.ACTION_DOWN;

/**
 * @author zhongjh
 * @date 2021/4/30
 */
public class MyFrameLayout extends FrameLayout {

    public MyFrameLayout(@NonNull Context context) {
        super(context);
    }

    public MyFrameLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == ACTION_DOWN) {
            Toast.makeText(getContext(), "FrameLayout:getX() " + event.getX() +
                    "\nFrameLayout:getRawX() " + event.getRawX(), Toast.LENGTH_SHORT).show();

        }
        return true;
    }

}
