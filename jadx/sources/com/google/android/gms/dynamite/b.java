package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class b implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iB = iVersions.b(context, str, true);
        selectionResult.f8303b = iB;
        if (iB != 0) {
            selectionResult.f8304c = 1;
            return selectionResult;
        }
        int iA = iVersions.a(context, str);
        selectionResult.a = iA;
        if (iA != 0) {
            selectionResult.f8304c = -1;
        }
        return selectionResult;
    }
}
