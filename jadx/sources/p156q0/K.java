package p156q0;

import androidx.fragment.app.b;
import androidx.fragment.app.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class K implements J {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f14261c;

    public K(e eVar, String str, int i10) {
        this.f14261c = eVar;
        this.a = str;
        this.f14260b = i10;
    }

    @Override // p156q0.J
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        b bVar = this.f14261c.f6699z;
        if (bVar == null || this.f14260b >= 0 || this.a != null || !bVar.l().T(-1, 0)) {
            return this.f14261c.U(arrayList, arrayList2, this.a, this.f14260b, 1);
        }
        return false;
    }
}
