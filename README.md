[![Release](https://jitpack.io/v/kroegerama/ccviews.svg)](https://jitpack.io/#kroegerama/ccviews)

# Compound Compat Views

A set of Views which support any drawable supported by the support library (e.g. **VectorDrawable**) to be set as
- drawableTop
- drawableBottom
- drawableStart
- drawableEnd

### Usage:

#### 1. Add jitpack to your **toplevel** gradle file:

```gradle
allprojects {
  repositories {
    ...
    
    /* ADD THE FOLLOWING LINE */
    maven { url 'https://jitpack.io' }
  }
}
```

#### 2. Add the library to your **local** gradle file:

```gradle
dependencies {
  implementation 'com.github.kroegerama:ccviews:1.0.0'
}
```

#### 3. Add CCViews to your layout xml:

```xml
<com.kroegerama.ccviews.CCButton
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:text="@string/button_text"
  app:drawableTopCompat="@drawable/button_top_drawable"
  app:drawableBottomCompat="@drawable/button_top_drawable" />

<com.kroegerama.ccviews.CCTextView
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:text="@string/hello_world"
  app:drawableStartCompat="@drawable/vec_hello"
  app:drawableEndCompat="@drawable/vec_world" />
```
