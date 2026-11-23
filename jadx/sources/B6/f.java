package B6;

import I.J;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import p076h8.m;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class f extends k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f733s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h f734t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i10) {
        super(0);
        this.f733s = i10;
        this.f734t = hVar;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f733s) {
            case 0:
                int i10 = Build.VERSION.SDK_INT;
                h hVar = this.f734t;
                if (i10 < 26) {
                    b bVar = hVar.f744v0;
                    if (bVar == null) {
                        p210v8.i.n("task");
                        throw null;
                    }
                    bVar.f();
                } else if (hVar.W().getPackageManager().canRequestPackageInstalls()) {
                    b bVar2 = hVar.f744v0;
                    if (bVar2 == null) {
                        p210v8.i.n("task");
                        throw null;
                    }
                    bVar2.f();
                } else if (hVar.f743u0 == null) {
                    p210v8.i.n("pb");
                    throw null;
                }
                return m.a;
            case 1:
                int i11 = Build.VERSION.SDK_INT;
                h hVar2 = this.f734t;
                if (i11 < 30) {
                    b bVar3 = hVar2.f744v0;
                    if (bVar3 == null) {
                        p210v8.i.n("task");
                        throw null;
                    }
                    bVar3.f();
                } else if (Environment.isExternalStorageManager()) {
                    b bVar4 = hVar2.f744v0;
                    if (bVar4 == null) {
                        p210v8.i.n("task");
                        throw null;
                    }
                    bVar4.f();
                } else if (hVar2.f743u0 == null) {
                    p210v8.i.n("pb");
                    throw null;
                }
                return m.a;
            case 2:
                int i12 = Build.VERSION.SDK_INT;
                h hVar3 = this.f734t;
                if (i12 < 26) {
                    b bVar5 = hVar3.f744v0;
                    if (bVar5 == null) {
                        p210v8.i.n("task");
                        throw null;
                    }
                    bVar5.f();
                } else if (new J(hVar3.X()).a()) {
                    b bVar6 = hVar3.f744v0;
                    if (bVar6 == null) {
                        p210v8.i.n("task");
                        throw null;
                    }
                    bVar6.f();
                } else if (hVar3.f743u0 == null) {
                    p210v8.i.n("pb");
                    throw null;
                }
                return m.a;
            case 3:
                h hVar4 = this.f734t;
                if (Settings.System.canWrite(hVar4.X())) {
                    b bVar7 = hVar4.f744v0;
                    if (bVar7 == null) {
                        p210v8.i.n("task");
                        throw null;
                    }
                    bVar7.f();
                } else if (hVar4.f743u0 == null) {
                    p210v8.i.n("pb");
                    throw null;
                }
                return m.a;
            case 4:
                h hVar5 = this.f734t;
                if (hVar5.g0()) {
                    hVar5.i0(new f(hVar5, 0));
                }
                return m.a;
            case 5:
                h hVar6 = this.f734t;
                if (hVar6.g0()) {
                    hVar6.i0(new f(hVar6, 1));
                }
                return m.a;
            case 6:
                h hVar7 = this.f734t;
                if (hVar7.g0()) {
                    hVar7.i0(new f(hVar7, 2));
                }
                return m.a;
            case 7:
                this.f734t.h0();
                return m.a;
            default:
                h hVar8 = this.f734t;
                if (hVar8.g0()) {
                    hVar8.i0(new f(hVar8, 3));
                }
                return m.a;
        }
    }
}
