package B6;

import A9.A;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import p156q0.C0757p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LB6/h;", "Landroidx/fragment/app/b;", "<init>", "()V", "permissionx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class h extends androidx.fragment.app.b {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final C0757p f738A0;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public final C0757p f739B0;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final C0757p f740C0;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final C0757p f741D0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Handler f742t0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public i f743u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public b f744v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final C0757p f745w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final C0757p f746x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final C0757p f747y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final C0757p f748z0;

    public h() {
        final int i10 = 0;
        this.f745w0 = U(new p049f.a(this) { // from class: B6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f727b;

            {
                this.f727b = this;
            }

            @Override // p049f.a
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        h hVar = this.f727b;
                        hVar.i0(new A(hVar, 1, (Map) obj));
                        return;
                    case 1:
                        h hVar2 = this.f727b;
                        hVar2.i0(new g(hVar2, (Boolean) obj, 0));
                        return;
                    case 2:
                        h hVar3 = this.f727b;
                        hVar3.i0(new f(hVar3, 7));
                        return;
                    case 3:
                        h hVar4 = this.f727b;
                        hVar4.i0(new f(hVar4, 8));
                        return;
                    case 4:
                        h hVar5 = this.f727b;
                        hVar5.i0(new f(hVar5, 5));
                        return;
                    case 5:
                        h hVar6 = this.f727b;
                        hVar6.i0(new f(hVar6, 4));
                        return;
                    case 6:
                        h hVar7 = this.f727b;
                        hVar7.i0(new f(hVar7, 6));
                        return;
                    case 7:
                        h hVar8 = this.f727b;
                        hVar8.i0(new g(hVar8, (Boolean) obj, 1));
                        return;
                    default:
                        h hVar9 = this.f727b;
                        if (hVar9.g0()) {
                            b bVar = hVar9.f744v0;
                            if (bVar == null) {
                                p210v8.i.n("task");
                                throw null;
                            }
                            i iVar = hVar9.f743u0;
                            if (iVar != null) {
                                bVar.q(new ArrayList(iVar.f756i));
                                return;
                            } else {
                                p210v8.i.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }, new p059g.a(0));
        final int i11 = 1;
        this.f746x0 = U(new p049f.a(this) { // from class: B6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f727b;

            {
                this.f727b = this;
            }

            @Override // p049f.a
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        h hVar = this.f727b;
                        hVar.i0(new A(hVar, 1, (Map) obj));
                        return;
                    case 1:
                        h hVar2 = this.f727b;
                        hVar2.i0(new g(hVar2, (Boolean) obj, 0));
                        return;
                    case 2:
                        h hVar3 = this.f727b;
                        hVar3.i0(new f(hVar3, 7));
                        return;
                    case 3:
                        h hVar4 = this.f727b;
                        hVar4.i0(new f(hVar4, 8));
                        return;
                    case 4:
                        h hVar5 = this.f727b;
                        hVar5.i0(new f(hVar5, 5));
                        return;
                    case 5:
                        h hVar6 = this.f727b;
                        hVar6.i0(new f(hVar6, 4));
                        return;
                    case 6:
                        h hVar7 = this.f727b;
                        hVar7.i0(new f(hVar7, 6));
                        return;
                    case 7:
                        h hVar8 = this.f727b;
                        hVar8.i0(new g(hVar8, (Boolean) obj, 1));
                        return;
                    default:
                        h hVar9 = this.f727b;
                        if (hVar9.g0()) {
                            b bVar = hVar9.f744v0;
                            if (bVar == null) {
                                p210v8.i.n("task");
                                throw null;
                            }
                            i iVar = hVar9.f743u0;
                            if (iVar != null) {
                                bVar.q(new ArrayList(iVar.f756i));
                                return;
                            } else {
                                p210v8.i.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }, new p059g.a(1));
        final int i12 = 2;
        this.f747y0 = U(new p049f.a(this) { // from class: B6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f727b;

            {
                this.f727b = this;
            }

            @Override // p049f.a
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        h hVar = this.f727b;
                        hVar.i0(new A(hVar, 1, (Map) obj));
                        return;
                    case 1:
                        h hVar2 = this.f727b;
                        hVar2.i0(new g(hVar2, (Boolean) obj, 0));
                        return;
                    case 2:
                        h hVar3 = this.f727b;
                        hVar3.i0(new f(hVar3, 7));
                        return;
                    case 3:
                        h hVar4 = this.f727b;
                        hVar4.i0(new f(hVar4, 8));
                        return;
                    case 4:
                        h hVar5 = this.f727b;
                        hVar5.i0(new f(hVar5, 5));
                        return;
                    case 5:
                        h hVar6 = this.f727b;
                        hVar6.i0(new f(hVar6, 4));
                        return;
                    case 6:
                        h hVar7 = this.f727b;
                        hVar7.i0(new f(hVar7, 6));
                        return;
                    case 7:
                        h hVar8 = this.f727b;
                        hVar8.i0(new g(hVar8, (Boolean) obj, 1));
                        return;
                    default:
                        h hVar9 = this.f727b;
                        if (hVar9.g0()) {
                            b bVar = hVar9.f744v0;
                            if (bVar == null) {
                                p210v8.i.n("task");
                                throw null;
                            }
                            i iVar = hVar9.f743u0;
                            if (iVar != null) {
                                bVar.q(new ArrayList(iVar.f756i));
                                return;
                            } else {
                                p210v8.i.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }, new p059g.a(2));
        final int i13 = 3;
        this.f748z0 = U(new p049f.a(this) { // from class: B6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f727b;

            {
                this.f727b = this;
            }

            @Override // p049f.a
            public final void a(Object obj) {
                switch (i13) {
                    case 0:
                        h hVar = this.f727b;
                        hVar.i0(new A(hVar, 1, (Map) obj));
                        return;
                    case 1:
                        h hVar2 = this.f727b;
                        hVar2.i0(new g(hVar2, (Boolean) obj, 0));
                        return;
                    case 2:
                        h hVar3 = this.f727b;
                        hVar3.i0(new f(hVar3, 7));
                        return;
                    case 3:
                        h hVar4 = this.f727b;
                        hVar4.i0(new f(hVar4, 8));
                        return;
                    case 4:
                        h hVar5 = this.f727b;
                        hVar5.i0(new f(hVar5, 5));
                        return;
                    case 5:
                        h hVar6 = this.f727b;
                        hVar6.i0(new f(hVar6, 4));
                        return;
                    case 6:
                        h hVar7 = this.f727b;
                        hVar7.i0(new f(hVar7, 6));
                        return;
                    case 7:
                        h hVar8 = this.f727b;
                        hVar8.i0(new g(hVar8, (Boolean) obj, 1));
                        return;
                    default:
                        h hVar9 = this.f727b;
                        if (hVar9.g0()) {
                            b bVar = hVar9.f744v0;
                            if (bVar == null) {
                                p210v8.i.n("task");
                                throw null;
                            }
                            i iVar = hVar9.f743u0;
                            if (iVar != null) {
                                bVar.q(new ArrayList(iVar.f756i));
                                return;
                            } else {
                                p210v8.i.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }, new p059g.a(2));
        final int i14 = 4;
        this.f738A0 = U(new p049f.a(this) { // from class: B6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f727b;

            {
                this.f727b = this;
            }

            @Override // p049f.a
            public final void a(Object obj) {
                switch (i14) {
                    case 0:
                        h hVar = this.f727b;
                        hVar.i0(new A(hVar, 1, (Map) obj));
                        return;
                    case 1:
                        h hVar2 = this.f727b;
                        hVar2.i0(new g(hVar2, (Boolean) obj, 0));
                        return;
                    case 2:
                        h hVar3 = this.f727b;
                        hVar3.i0(new f(hVar3, 7));
                        return;
                    case 3:
                        h hVar4 = this.f727b;
                        hVar4.i0(new f(hVar4, 8));
                        return;
                    case 4:
                        h hVar5 = this.f727b;
                        hVar5.i0(new f(hVar5, 5));
                        return;
                    case 5:
                        h hVar6 = this.f727b;
                        hVar6.i0(new f(hVar6, 4));
                        return;
                    case 6:
                        h hVar7 = this.f727b;
                        hVar7.i0(new f(hVar7, 6));
                        return;
                    case 7:
                        h hVar8 = this.f727b;
                        hVar8.i0(new g(hVar8, (Boolean) obj, 1));
                        return;
                    default:
                        h hVar9 = this.f727b;
                        if (hVar9.g0()) {
                            b bVar = hVar9.f744v0;
                            if (bVar == null) {
                                p210v8.i.n("task");
                                throw null;
                            }
                            i iVar = hVar9.f743u0;
                            if (iVar != null) {
                                bVar.q(new ArrayList(iVar.f756i));
                                return;
                            } else {
                                p210v8.i.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }, new p059g.a(2));
        final int i15 = 5;
        this.f739B0 = U(new p049f.a(this) { // from class: B6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f727b;

            {
                this.f727b = this;
            }

            @Override // p049f.a
            public final void a(Object obj) {
                switch (i15) {
                    case 0:
                        h hVar = this.f727b;
                        hVar.i0(new A(hVar, 1, (Map) obj));
                        return;
                    case 1:
                        h hVar2 = this.f727b;
                        hVar2.i0(new g(hVar2, (Boolean) obj, 0));
                        return;
                    case 2:
                        h hVar3 = this.f727b;
                        hVar3.i0(new f(hVar3, 7));
                        return;
                    case 3:
                        h hVar4 = this.f727b;
                        hVar4.i0(new f(hVar4, 8));
                        return;
                    case 4:
                        h hVar5 = this.f727b;
                        hVar5.i0(new f(hVar5, 5));
                        return;
                    case 5:
                        h hVar6 = this.f727b;
                        hVar6.i0(new f(hVar6, 4));
                        return;
                    case 6:
                        h hVar7 = this.f727b;
                        hVar7.i0(new f(hVar7, 6));
                        return;
                    case 7:
                        h hVar8 = this.f727b;
                        hVar8.i0(new g(hVar8, (Boolean) obj, 1));
                        return;
                    default:
                        h hVar9 = this.f727b;
                        if (hVar9.g0()) {
                            b bVar = hVar9.f744v0;
                            if (bVar == null) {
                                p210v8.i.n("task");
                                throw null;
                            }
                            i iVar = hVar9.f743u0;
                            if (iVar != null) {
                                bVar.q(new ArrayList(iVar.f756i));
                                return;
                            } else {
                                p210v8.i.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }, new p059g.a(2));
        final int i16 = 6;
        this.f740C0 = U(new p049f.a(this) { // from class: B6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f727b;

            {
                this.f727b = this;
            }

            @Override // p049f.a
            public final void a(Object obj) {
                switch (i16) {
                    case 0:
                        h hVar = this.f727b;
                        hVar.i0(new A(hVar, 1, (Map) obj));
                        return;
                    case 1:
                        h hVar2 = this.f727b;
                        hVar2.i0(new g(hVar2, (Boolean) obj, 0));
                        return;
                    case 2:
                        h hVar3 = this.f727b;
                        hVar3.i0(new f(hVar3, 7));
                        return;
                    case 3:
                        h hVar4 = this.f727b;
                        hVar4.i0(new f(hVar4, 8));
                        return;
                    case 4:
                        h hVar5 = this.f727b;
                        hVar5.i0(new f(hVar5, 5));
                        return;
                    case 5:
                        h hVar6 = this.f727b;
                        hVar6.i0(new f(hVar6, 4));
                        return;
                    case 6:
                        h hVar7 = this.f727b;
                        hVar7.i0(new f(hVar7, 6));
                        return;
                    case 7:
                        h hVar8 = this.f727b;
                        hVar8.i0(new g(hVar8, (Boolean) obj, 1));
                        return;
                    default:
                        h hVar9 = this.f727b;
                        if (hVar9.g0()) {
                            b bVar = hVar9.f744v0;
                            if (bVar == null) {
                                p210v8.i.n("task");
                                throw null;
                            }
                            i iVar = hVar9.f743u0;
                            if (iVar != null) {
                                bVar.q(new ArrayList(iVar.f756i));
                                return;
                            } else {
                                p210v8.i.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }, new p059g.a(2));
        final int i17 = 7;
        this.f741D0 = U(new p049f.a(this) { // from class: B6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f727b;

            {
                this.f727b = this;
            }

            @Override // p049f.a
            public final void a(Object obj) {
                switch (i17) {
                    case 0:
                        h hVar = this.f727b;
                        hVar.i0(new A(hVar, 1, (Map) obj));
                        return;
                    case 1:
                        h hVar2 = this.f727b;
                        hVar2.i0(new g(hVar2, (Boolean) obj, 0));
                        return;
                    case 2:
                        h hVar3 = this.f727b;
                        hVar3.i0(new f(hVar3, 7));
                        return;
                    case 3:
                        h hVar4 = this.f727b;
                        hVar4.i0(new f(hVar4, 8));
                        return;
                    case 4:
                        h hVar5 = this.f727b;
                        hVar5.i0(new f(hVar5, 5));
                        return;
                    case 5:
                        h hVar6 = this.f727b;
                        hVar6.i0(new f(hVar6, 4));
                        return;
                    case 6:
                        h hVar7 = this.f727b;
                        hVar7.i0(new f(hVar7, 6));
                        return;
                    case 7:
                        h hVar8 = this.f727b;
                        hVar8.i0(new g(hVar8, (Boolean) obj, 1));
                        return;
                    default:
                        h hVar9 = this.f727b;
                        if (hVar9.g0()) {
                            b bVar = hVar9.f744v0;
                            if (bVar == null) {
                                p210v8.i.n("task");
                                throw null;
                            }
                            i iVar = hVar9.f743u0;
                            if (iVar != null) {
                                bVar.q(new ArrayList(iVar.f756i));
                                return;
                            } else {
                                p210v8.i.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }, new p059g.a(1));
        final int i18 = 8;
        U(new p049f.a(this) { // from class: B6.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f727b;

            {
                this.f727b = this;
            }

            @Override // p049f.a
            public final void a(Object obj) {
                switch (i18) {
                    case 0:
                        h hVar = this.f727b;
                        hVar.i0(new A(hVar, 1, (Map) obj));
                        return;
                    case 1:
                        h hVar2 = this.f727b;
                        hVar2.i0(new g(hVar2, (Boolean) obj, 0));
                        return;
                    case 2:
                        h hVar3 = this.f727b;
                        hVar3.i0(new f(hVar3, 7));
                        return;
                    case 3:
                        h hVar4 = this.f727b;
                        hVar4.i0(new f(hVar4, 8));
                        return;
                    case 4:
                        h hVar5 = this.f727b;
                        hVar5.i0(new f(hVar5, 5));
                        return;
                    case 5:
                        h hVar6 = this.f727b;
                        hVar6.i0(new f(hVar6, 4));
                        return;
                    case 6:
                        h hVar7 = this.f727b;
                        hVar7.i0(new f(hVar7, 6));
                        return;
                    case 7:
                        h hVar8 = this.f727b;
                        hVar8.i0(new g(hVar8, (Boolean) obj, 1));
                        return;
                    default:
                        h hVar9 = this.f727b;
                        if (hVar9.g0()) {
                            b bVar = hVar9.f744v0;
                            if (bVar == null) {
                                p210v8.i.n("task");
                                throw null;
                            }
                            i iVar = hVar9.f743u0;
                            if (iVar != null) {
                                bVar.q(new ArrayList(iVar.f756i));
                                return;
                            } else {
                                p210v8.i.n("pb");
                                throw null;
                            }
                        }
                        return;
                }
            }
        }, new p059g.a(2));
    }

    @Override // androidx.fragment.app.b
    public final void F() {
        this.f6634a0 = true;
        if (g0() && this.f743u0 == null) {
            p210v8.i.n("pb");
            throw null;
        }
    }

    public final boolean g0() {
        if (this.f743u0 != null && this.f744v0 != null) {
            return true;
        }
        Log.w("PermissionX", "PermissionBuilder and ChainTask should not be null at this time, so we can do nothing in this case.");
        return false;
    }

    public final void h0() {
        if (g0()) {
            if (Settings.canDrawOverlays(X())) {
                b bVar = this.f744v0;
                if (bVar != null) {
                    bVar.f();
                    return;
                } else {
                    p210v8.i.n("task");
                    throw null;
                }
            }
            i iVar = this.f743u0;
            if (iVar == null) {
                p210v8.i.n("pb");
                throw null;
            }
            if (iVar != null) {
                return;
            }
            p210v8.i.n("pb");
            throw null;
        }
    }

    public final void i0(p200u8.a aVar) {
        this.f742t0.post(new d(aVar));
    }
}
