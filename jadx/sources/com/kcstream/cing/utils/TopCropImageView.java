package com.kcstream.cing.utils;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import kotlin.Metadata;
import p.C0732v;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/kcstream/cing/utils/TopCropImageView;", "Lp/v;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TopCropImageView extends C0732v {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopCropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        i.c(context);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void a() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        Matrix imageMatrix = getImageMatrix();
        i.e(imageMatrix, "getImageMatrix(...)");
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float f10 = intrinsicWidth * height > intrinsicHeight * width ? height / intrinsicHeight : width / intrinsicWidth;
        imageMatrix.setScale(f10, f10);
        setImageMatrix(imageMatrix);
    }

    @Override // android.view.View
    public final void onLayout(boolean z6, int i10, int i11, int i12, int i13) {
        super.onLayout(z6, i10, i11, i12, i13);
        a();
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i10, int i11, int i12, int i13) {
        a();
        return super.setFrame(i10, i11, i12, i13);
    }
}
