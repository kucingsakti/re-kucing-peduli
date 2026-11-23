package com.onesignal.inAppMessages.internal.display.impl;

import android.content.Context;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class g extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context) {
        super(context);
        p210v8.i.c(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.view.View
    public boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z6) {
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
    }
}
