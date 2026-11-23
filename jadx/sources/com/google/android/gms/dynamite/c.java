package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class c implements DynamiteModule.VersionPolicy {
    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult a(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.a = iVersions.a(context, str);
        int i10 = 1;
        int iB = iVersions.b(context, str, true);
        selectionResult.f8303b = iB;
        int i11 = selectionResult.a;
        if (i11 == 0) {
            i11 = 0;
            if (iB == 0) {
                i10 = 0;
            } else if (i11 >= iB) {
                i10 = -1;
            }
        } else if (i11 >= iB) {
            i10 = -1;
        }
        selectionResult.f8304c = i10;
        return selectionResult;
    }
}
