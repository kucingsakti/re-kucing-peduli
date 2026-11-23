package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class zzhd {
    public final Resources a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9112b;

    public zzhd(Context context, String str) {
        String packageName;
        Preconditions.i(context);
        this.a = context.getResources();
        if (!TextUtils.isEmpty(str)) {
            this.f9112b = str;
            return;
        }
        try {
            packageName = context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            packageName = context.getPackageName();
        }
        this.f9112b = packageName;
    }

    public final String a(String str) {
        Resources resources = this.a;
        int identifier = resources.getIdentifier(str, "string", this.f9112b);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
