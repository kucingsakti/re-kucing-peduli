package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public class StringResourceValueReader {
    public final Resources a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8130b;

    public StringResourceValueReader(Context context) {
        Preconditions.i(context);
        Resources resources = context.getResources();
        this.a = resources;
        this.f8130b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public final String a(String str) {
        String str2 = this.f8130b;
        Resources resources = this.a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
