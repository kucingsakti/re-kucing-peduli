package p224x2;

import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zabw;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class i extends zabw {
    public final WeakReference a;

    public i(zabe zabeVar) {
        this.a = new WeakReference(zabeVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabw
    public final void a() {
        zabe zabeVar = (zabe) this.a.get();
        if (zabeVar == null) {
            return;
        }
        zabe.c(zabeVar);
    }
}
