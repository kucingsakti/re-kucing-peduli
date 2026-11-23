package B6;

import I.AbstractC0241e;
import p076h8.m;
import p156q0.C0763w;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f730s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f731t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ h f732u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(boolean z6, h hVar, int i10) {
        super(0);
        this.f730s = i10;
        this.f731t = z6;
        this.f732u = hVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f730s) {
            case 0:
                h hVar = this.f732u;
                if (this.f731t) {
                    i iVar = hVar.f743u0;
                    if (iVar == null) {
                        p210v8.i.n("pb");
                        throw null;
                    }
                    iVar.f753f.add("android.permission.ACCESS_BACKGROUND_LOCATION");
                    i iVar2 = hVar.f743u0;
                    if (iVar2 == null) {
                        p210v8.i.n("pb");
                        throw null;
                    }
                    iVar2.f754g.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                    i iVar3 = hVar.f743u0;
                    if (iVar3 == null) {
                        p210v8.i.n("pb");
                        throw null;
                    }
                    iVar3.f755h.remove("android.permission.ACCESS_BACKGROUND_LOCATION");
                    b bVar = hVar.f744v0;
                    if (bVar == null) {
                        p210v8.i.n("task");
                        throw null;
                    }
                    bVar.f();
                } else {
                    C0763w c0763w = hVar.f6623O;
                    if (c0763w != null) {
                        AbstractC0241e.g(c0763w.f14372w, "android.permission.ACCESS_BACKGROUND_LOCATION");
                    }
                    if (hVar.f743u0 == null) {
                        p210v8.i.n("pb");
                        throw null;
                    }
                    b bVar2 = hVar.f744v0;
                    if (bVar2 == null) {
                        p210v8.i.n("task");
                        throw null;
                    }
                    bVar2.f();
                }
                return m.a;
            default:
                h hVar2 = this.f732u;
                if (this.f731t) {
                    i iVar4 = hVar2.f743u0;
                    if (iVar4 == null) {
                        p210v8.i.n("pb");
                        throw null;
                    }
                    iVar4.f753f.add("android.permission.BODY_SENSORS_BACKGROUND");
                    i iVar5 = hVar2.f743u0;
                    if (iVar5 == null) {
                        p210v8.i.n("pb");
                        throw null;
                    }
                    iVar5.f754g.remove("android.permission.BODY_SENSORS_BACKGROUND");
                    i iVar6 = hVar2.f743u0;
                    if (iVar6 == null) {
                        p210v8.i.n("pb");
                        throw null;
                    }
                    iVar6.f755h.remove("android.permission.BODY_SENSORS_BACKGROUND");
                    b bVar3 = hVar2.f744v0;
                    if (bVar3 == null) {
                        p210v8.i.n("task");
                        throw null;
                    }
                    bVar3.f();
                } else {
                    C0763w c0763w2 = hVar2.f6623O;
                    if (c0763w2 != null) {
                        AbstractC0241e.g(c0763w2.f14372w, "android.permission.BODY_SENSORS_BACKGROUND");
                    }
                    if (hVar2.f743u0 == null) {
                        p210v8.i.n("pb");
                        throw null;
                    }
                    b bVar4 = hVar2.f744v0;
                    if (bVar4 == null) {
                        p210v8.i.n("task");
                        throw null;
                    }
                    bVar4.f();
                }
                return m.a;
        }
    }
}
