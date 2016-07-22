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
public class LitiTextView extends TextView {

    public LitiTextView(Context context) {
        super(context);
        init(context);
    }

    public LitiTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public LitiTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context)
    {
        Typeface roboto= Typeface.createFromAsset(context.getAssets(),"STLITI.TTF");
        this.setTypeface(roboto);
    }
}
