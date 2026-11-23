package p090j2;

import K3.d;
import V.h;
import android.content.Context;
import k2.b;
import p148p2.i;

/* JADX INFO: loaded from: classes.dex */
public final class e implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12366s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final h f12367t;

    public /* synthetic */ e(h hVar, int i10) {
        this.f12366s = i10;
        this.f12367t = hVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        switch (this.f12366s) {
            case 0:
                return new d((Context) this.f12367t.f5078t, new p053f4.e(26), new d(26));
            default:
                return new i(Integer.valueOf(i.f14216v).intValue(), (Context) this.f12367t.f5078t, "com.google.android.datatransport.events");
        }
    }
}
