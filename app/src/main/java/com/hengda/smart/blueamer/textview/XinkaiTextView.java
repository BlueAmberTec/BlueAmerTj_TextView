package com.hengda.smart.blueamer.textview;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * @author WZQ
 * @version V1.0
 * @Description ${todo}
 * @Email :wzq_steady@126.com
 * @date 2016/7/22 16:37
 * @update (date)
 */
public class XinkaiTextView extends TextView {

    public XinkaiTextView(Context context) {
        super(context);
        init(context);
    }

    public XinkaiTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public XinkaiTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context)
    {
        Typeface roboto= Typeface.createFromAsset(context.getAssets(),"STXINGKA.TTF");
        this.setTypeface(roboto);
    }
}
