package h9;

import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0680i;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;
import p104k9.t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0680i implements t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f11804t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11805u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11806v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11807w;

    public /* synthetic */ a(int i10) {
        this.f11804t = i10;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        switch (this.f11804t) {
            case 0:
                b bVarF = f();
                bVarF.isInitialized();
                return bVarF;
            default:
                c cVarH = h();
                cVarH.isInitialized();
                return cVarH;
        }
    }

    public final Object clone() {
        switch (this.f11804t) {
            case 0:
                a aVar = new a(0);
                aVar.i(f());
                return aVar;
            default:
                a aVar2 = new a(1);
                aVar2.j(h());
                return aVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        switch (this.f11804t) {
            case 0:
                b bVar = null;
                try {
                    try {
                        b.f11809z.getClass();
                        i(new b(c0676e));
                        return this;
                    } catch (InvalidProtocolBufferException e10) {
                        b bVar2 = (b) e10.f12841s;
                        try {
                            throw e10;
                        } catch (Throwable th) {
                            th = th;
                            bVar = bVar2;
                            if (bVar != null) {
                                i(bVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (bVar != null) {
                        i(bVar);
                    }
                    throw th;
                }
            default:
                c cVar = null;
                try {
                    try {
                        c.f11817z.getClass();
                        j(new c(c0676e));
                        return this;
                    } catch (InvalidProtocolBufferException e11) {
                        c cVar2 = (c) e11.f12841s;
                        try {
                            throw e11;
                        } catch (Throwable th3) {
                            th = th3;
                            cVar = cVar2;
                            if (cVar != null) {
                                j(cVar);
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (cVar != null) {
                        j(cVar);
                    }
                    throw th;
                }
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        switch (this.f11804t) {
            case 0:
                i((b) nVar);
                break;
            default:
                j((c) nVar);
                break;
        }
        return this;
    }

    public b f() {
        b bVar = new b(this);
        int i10 = this.f11805u;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        bVar.f11812u = this.f11806v;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        bVar.f11813v = this.f11807w;
        bVar.f11811t = i11;
        return bVar;
    }

    public c h() {
        c cVar = new c(this);
        int i10 = this.f11805u;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        cVar.f11820u = this.f11806v;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        cVar.f11821v = this.f11807w;
        cVar.f11819t = i11;
        return cVar;
    }

    public void i(b bVar) {
        if (bVar == b.f11808y) {
            return;
        }
        int i10 = bVar.f11811t;
        if ((i10 & 1) == 1) {
            int i11 = bVar.f11812u;
            this.f11805u = 1 | this.f11805u;
            this.f11806v = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = bVar.f11813v;
            this.f11805u = 2 | this.f11805u;
            this.f11807w = i12;
        }
        this.f12808s = this.f12808s.e(bVar.f11810s);
    }

    public void j(c cVar) {
        if (cVar == c.f11816y) {
            return;
        }
        int i10 = cVar.f11819t;
        if ((i10 & 1) == 1) {
            int i11 = cVar.f11820u;
            this.f11805u = 1 | this.f11805u;
            this.f11806v = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = cVar.f11821v;
            this.f11805u = 2 | this.f11805u;
            this.f11807w = i12;
        }
        this.f12808s = this.f12808s.e(cVar.f11818s);
    }
}
