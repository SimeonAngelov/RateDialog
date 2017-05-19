package com.simeonangelov.ratedialog;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class CustomDialog extends Dialog implements  View.OnClickListener{
    private Activity c;
    private Button rate, later;

    public CustomDialog(Context context) {
        super(context);
        c = (Activity) context;
    }

    public CustomDialog(Context context, int themeResId) {
        super(context, themeResId);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.custom_dialog);
        rate = (Button) findViewById(R.id.rate);
        later = (Button) findViewById(R.id.later);
        rate.setOnClickListener(this);
        later.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.rate)
            c.finish();
        else if (id == R.id.later)
            dismiss();
    }
}
