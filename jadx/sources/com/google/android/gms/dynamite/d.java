package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class d implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        int iB;
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        int iA = iVersions.a(context, str);
        selectionResult.a = iA;
        int i10 = 1;
        int i11 = 0;
        if (iA != 0) {
            iB = iVersions.b(context, str, false);
            selectionResult.f8303b = iB;
        } else {
            iB = iVersions.b(context, str, true);
            selectionResult.f8303b = iB;
        }
        int i12 = selectionResult.a;
        if (i12 == 0) {
            if (iB == 0) {
                i10 = 0;
            }
            selectionResult.f8304c = i10;
            return selectionResult;
        }
        i11 = i12;
        if (i11 >= iB) {
            i10 = -1;
        }
        selectionResult.f8304c = i10;
        return selectionResult;
    }
}
