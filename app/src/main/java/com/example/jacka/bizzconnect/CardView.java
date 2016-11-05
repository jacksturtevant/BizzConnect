package com.example.jacka.bizzconnect;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Jacka on 11/5/2016.
 */
public class CardView extends View {
    private boolean mShowText;
    private Integer mTextPos;
    private Paint mTextPaint;
    private Paint mPiePaint;
    private Paint mShadowPaint;
    private float mTextHeight;
    private int mTextColor;

    public CardView(Context context, AttributeSet atts) {
        super(context, atts);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                atts,
                R.styleable.CardView,
                0, 0);

        try {
            mShowText = a.getBoolean(R.styleable.CardView_showText, false);
            mTextPos = a.getInteger(R.styleable.CardView_labelPosition, 0);
        } finally {
            a.recycle();
        }

    }

    public boolean isShowText() {
        return mShowText;
    }

    public void setShowText(boolean showText) {
        mShowText = showText;
        invalidate();
        requestLayout();
    }

    private void init() {
        mTextPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mTextPaint.setColor(mTextColor);
        if (mTextHeight == 0) {
            mTextHeight = mTextPaint.getTextSize();
        } else {
            mTextPaint.setTextSize(mTextHeight);
        }

        mPiePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPiePaint.setStyle(Paint.Style.FILL);
        mPiePaint.setTextSize(mTextHeight);

        mShadowPaint = new Paint(0);
        mShadowPaint.setColor(0xff101010);
        mShadowPaint.setMaskFilter(new BlurMaskFilter(8, BlurMaskFilter.Blur.NORMAL));
    }
}