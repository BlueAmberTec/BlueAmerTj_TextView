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
 * @date 2016/7/22 16:30
 * @update (date)
 */
public class KaitiTextView extends TextView {


    public KaitiTextView(Context context) {
        super(context);
        init(context);
    }

    public KaitiTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public KaitiTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context)
    {
        Typeface roboto= Typeface.createFromAsset(context.getAssets(),"STKAITI.TTF");
        this.setTypeface(roboto);
    }
}
