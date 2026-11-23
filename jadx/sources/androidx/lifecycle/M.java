package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class M implements N0.d {
    public final N0.e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f6736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p076h8.j f6737d;

    public M(N0.e eVar, W w2) {
        p210v8.i.f(eVar, "savedStateRegistry");
        this.a = eVar;
        this.f6737d = D3.b.s(new A0.r(w2, 28));
    }

    @Override // N0.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f6736c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((N) this.f6737d.getValue()).f6738b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((J) entry.getValue()).f6729e.a();
            if (!p210v8.i.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f6735b = false;
        return bundle;
    }

    public final void b() {
        if (this.f6735b) {
            return;
        }
        Bundle bundleC = this.a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f6736c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleC != null) {
            bundle.putAll(bundleC);
        }
        this.f6736c = bundle;
        this.f6735b = true;
    }
}
