package com.zhongjh.viewxyexample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.view.MotionEvent.ACTION_DOWN;

public class MainActivity extends AppCompatActivity {

    MyFrameLayout layoutExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        layoutExample = findViewById(R.id.layoutExample2);
    }

    @SuppressLint("NonConstantResourceId")
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnGetX:
                Toast.makeText(this, layoutExample.getX() + "", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGetY:
                Toast.makeText(this, layoutExample.getY() + "", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGetWidth:
                Toast.makeText(this, layoutExample.getWidth() + "", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGetHeight:
                Toast.makeText(this, layoutExample.getHeight() + "", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGetLeft:
                Toast.makeText(this, layoutExample.getLeft() + "", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGetRight:
                Toast.makeText(this, layoutExample.getRight() + "", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGetTop:
                Toast.makeText(this, layoutExample.getTop() + "", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnGetBottom:
                Toast.makeText(this, layoutExample.getBottom() + "", Toast.LENGTH_SHORT).show();
                break;
            case R.id.getGlobalVisibleRect:
                Rect globalRect = new Rect();
                layoutExample.getGlobalVisibleRect(globalRect);
                Toast.makeText(this,  "left:" + globalRect.left + " right:" + globalRect.right + " top:" + globalRect.top + " bottom:" + globalRect.bottom,
                        Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnDialog:
                MyDialog.Builder builder = new MyDialog.Builder(MainActivity.this);
                builder.create().show();
                break;
            default:
                break;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == ACTION_DOWN) {
            Toast.makeText(this, event.getX() + "", Toast.LENGTH_SHORT).show();
        }
        return super.onTouchEvent(event);
    }
}