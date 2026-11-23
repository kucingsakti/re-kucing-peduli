package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class e implements DynamiteModule.VersionPolicy.IVersions {
    public final int a;

    public e(int i10) {
        this.a = i10;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int a(Context context, String str) {
        return this.a;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy.IVersions
    public final int b(Context context, String str, boolean z6) {
        return 0;
    }
}
