package com.google.android.gms.common;

import M.a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zaaa;
import com.google.android.gms.common.internal.zaz;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.dynamic.RemoteCreator;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7840s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7841t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f7842u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View.OnClickListener f7843v;

    @Retention(RetentionPolicy.SOURCE)
    public @interface ButtonSize {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorScheme {
    }

    public final void a(int i10, int i11) {
        this.f7840s = i10;
        this.f7841t = i11;
        Context context = getContext();
        View view = this.f7842u;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f7842u = zaz.c(context, this.f7840s, this.f7841t);
        } catch (RemoteCreator.RemoteCreatorException unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i12 = this.f7840s;
            int i13 = this.f7841t;
            zaaa zaaaVar = new zaaa(context, null, android.R.attr.buttonStyle);
            Resources resources = context.getResources();
            zaaaVar.setTypeface(Typeface.DEFAULT_BOLD);
            zaaaVar.setTextSize(14.0f);
            int i14 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
            zaaaVar.setMinHeight(i14);
            zaaaVar.setMinWidth(i14);
            int iA = zaaa.a(i13, com.kcstream.cing.R.drawable.common_google_signin_btn_icon_dark, com.kcstream.cing.R.drawable.common_google_signin_btn_icon_light, com.kcstream.cing.R.drawable.common_google_signin_btn_icon_light);
            int iA2 = zaaa.a(i13, com.kcstream.cing.R.drawable.common_google_signin_btn_text_dark, com.kcstream.cing.R.drawable.common_google_signin_btn_text_light, com.kcstream.cing.R.drawable.common_google_signin_btn_text_light);
            if (i12 == 0 || i12 == 1) {
                iA = iA2;
            } else if (i12 != 2) {
                throw new IllegalStateException(AbstractC0487g.g(i12, "Unknown button size: "));
            }
            Drawable drawable = resources.getDrawable(iA);
            a.h(drawable, resources.getColorStateList(com.kcstream.cing.R.color.common_google_signin_btn_tint));
            a.i(drawable, PorterDuff.Mode.SRC_ATOP);
            zaaaVar.setBackgroundDrawable(drawable);
            ColorStateList colorStateList = resources.getColorStateList(zaaa.a(i13, com.kcstream.cing.R.color.common_google_signin_btn_text_dark, com.kcstream.cing.R.color.common_google_signin_btn_text_light, com.kcstream.cing.R.color.common_google_signin_btn_text_light));
            Preconditions.i(colorStateList);
            zaaaVar.setTextColor(colorStateList);
            if (i12 == 0) {
                zaaaVar.setText(resources.getString(com.kcstream.cing.R.string.common_signin_button_text));
            } else if (i12 == 1) {
                zaaaVar.setText(resources.getString(com.kcstream.cing.R.string.common_signin_button_text_long));
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException(AbstractC0487g.g(i12, "Unknown button size: "));
                }
                zaaaVar.setText((CharSequence) null);
            }
            zaaaVar.setTransformationMethod(null);
            if (DeviceProperties.a(zaaaVar.getContext())) {
                zaaaVar.setGravity(19);
            }
            this.f7842u = zaaaVar;
        }
        addView(this.f7842u);
        this.f7842u.setEnabled(isEnabled());
        this.f7842u.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f7843v;
        if (onClickListener == null || view != this.f7842u) {
            return;
        }
        onClickListener.onClick(this);
    }

    public void setColorScheme(int i10) {
        a(this.f7840s, i10);
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        this.f7842u.setEnabled(z6);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f7843v = onClickListener;
        View view = this.f7842u;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        a(this.f7840s, this.f7841t);
    }

    public void setSize(int i10) {
        a(i10, this.f7841t);
    }
}
