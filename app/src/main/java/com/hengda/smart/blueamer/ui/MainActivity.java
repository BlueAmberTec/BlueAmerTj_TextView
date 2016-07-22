package com.hengda.smart.blueamer.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hengda.smart.blueamer.R;
import com.hengda.smart.blueamer.textview.KaitiTextView;
import com.hengda.smart.blueamer.textview.XinkaiTextView;

public class MainActivity extends AppCompatActivity {

    private KaitiTextView    kaitiTextview;
    private XinkaiTextView   xinkaiTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kaitiTextview=(KaitiTextView)this.findViewById(R.id.tv_kaiti);
        xinkaiTextView=(XinkaiTextView)this.findViewById(R.id.tv_xingkai);
        kaitiTextview.setText("窗前明月光");
        xinkaiTextView.setText("疑是地上霜");
    }
}
