package p106l0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import p230x9.d;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    @Override // p230x9.d
    public final Signature[] s(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
