package com.kroegerama.ccviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v7.content.res.AppCompatResources;
import android.util.AttributeSet;

public class CCButton extends android.support.v7.widget.AppCompatButton implements CCView {

    private Drawable drawableStartCompat;
    private Drawable drawableEndCompat;
    private Drawable drawableTopCompat;
    private Drawable drawableBottomCompat;

    public CCButton(Context context) {
        super(context);
        init(context, null, 0);
    }

    public CCButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public CCButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        if (attrs != null) {
            TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.CCButton, defStyleAttr, 0);
            initAttributes(array);
            array.recycle();
        }
        initControl();
    }

    private void initAttributes(TypedArray array) {
        int id = array.getResourceId(R.styleable.CCButton_drawableStartCompat, 0);
        if (id != 0) {
            drawableStartCompat = AppCompatResources.getDrawable(getContext(), id);
        }

        id = array.getResourceId(R.styleable.CCButton_drawableEndCompat, 0);
        if (id != 0) {
            drawableEndCompat = AppCompatResources.getDrawable(getContext(), id);
        }

        id = array.getResourceId(R.styleable.CCButton_drawableTopCompat, 0);
        if (id != 0) {
            drawableTopCompat = AppCompatResources.getDrawable(getContext(), id);
        }

        id = array.getResourceId(R.styleable.CCButton_drawableBottomCompat, 0);
        if (id != 0) {
            drawableBottomCompat = AppCompatResources.getDrawable(getContext(), id);
        }
    }

    private void initControl() {
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawableStartCompat, drawableTopCompat, drawableEndCompat, drawableBottomCompat);
    }

    @Override
    public void setDrawableStartCompat(Drawable drawable) {
        drawableStartCompat = drawable;
        initControl();
    }

    @Override
    public void setDrawableStartCompat(@DrawableRes int drawableRes) {
        setDrawableStartCompat(AppCompatResources.getDrawable(getContext(), drawableRes));
    }

    @Override
    public void setDrawableEndCompat(Drawable drawable) {
        drawableEndCompat = drawable;
        initControl();
    }

    @Override
    public void setDrawableEndCompat(@DrawableRes int drawableRes) {
        setDrawableEndCompat(AppCompatResources.getDrawable(getContext(), drawableRes));
    }

    @Override
    public void setDrawableTopCompat(Drawable drawable) {
        drawableTopCompat = drawable;
        initControl();
    }

    @Override
    public void setDrawableTopCompat(@DrawableRes int drawableRes) {
        setDrawableTopCompat(AppCompatResources.getDrawable(getContext(), drawableRes));
    }

    @Override
    public void setDrawableBottomCompat(Drawable drawable) {
        drawableBottomCompat = drawable;
        initControl();
    }

    @Override
    public void setDrawableBottomCompat(@DrawableRes int drawableRes) {
        setDrawableBottomCompat(AppCompatResources.getDrawable(getContext(), drawableRes));
    }
}
