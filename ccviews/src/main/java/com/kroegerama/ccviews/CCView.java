package com.kroegerama.ccviews;

import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;

interface CCView {
    void setDrawableStartCompat(Drawable drawable);

    void setDrawableStartCompat(@DrawableRes int drawableRes);

    void setDrawableEndCompat(Drawable drawable);

    void setDrawableEndCompat(@DrawableRes int drawableRes);

    void setDrawableTopCompat(Drawable drawable);

    void setDrawableTopCompat(@DrawableRes int drawableRes);

    void setDrawableBottomCompat(Drawable drawable);

    void setDrawableBottomCompat(@DrawableRes int drawableRes);
}
