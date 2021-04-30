package com.zhongjh.viewxyexample;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;

/**
 * @author zhongjh
 * @date 2021/4/30
 */
public class MyDialog extends Dialog {

    public MyDialog(@NonNull Context context) {
        super(context);
    }

    public MyDialog(Context context, int theme) {
        super(context, theme);
    }

    public static class Builder {

        private Context context;

        public Builder(Context context) {
            this.context = context;
        }

        public MyDialog create() {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            final MyDialog dialog = new MyDialog(context, R.style.Dialog);
            View layout = inflater.inflate(R.layout.dialog_layout, null);
            dialog.addContentView(layout, new LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            layout.findViewById(R.id.button).setOnClickListener(v -> {
                int[] location = new int[2];
                layout.getLocationInWindow(location);
                Toast.makeText(context, "X:" + location[0] + " Y:" + location[1], Toast.LENGTH_SHORT).show();
            });
            layout.findViewById(R.id.button2).setOnClickListener(v -> {
                int[] location = new int[2];
                layout.getLocationOnScreen(location);
                Toast.makeText(context, "X:" + location[0] + " Y:" + location[1], Toast.LENGTH_SHORT).show();
            });

            return dialog;
        }

    }

}
