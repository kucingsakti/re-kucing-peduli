package h9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p104k9.AbstractC0672a;
import p104k9.AbstractC0680i;
import p104k9.C0676e;
import p104k9.C0678g;
import p104k9.n;
import p104k9.t;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC0680i implements t {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11844t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11845u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11846v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f11847w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f11848x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f11849y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public List f11850z;

    public static g h() {
        g gVar = new g();
        gVar.f11845u = 1;
        gVar.f11847w = "";
        gVar.f11848x = h.NONE;
        List list = Collections.EMPTY_LIST;
        gVar.f11849y = list;
        gVar.f11850z = list;
        return gVar;
    }

    @Override // p104k9.AbstractC0680i
    public final AbstractC0672a c() {
        i iVarF = f();
        iVarF.isInitialized();
        return iVarF;
    }

    public final Object clone() {
        g gVarH = h();
        gVarH.i(f());
        return gVarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // p104k9.AbstractC0680i
    public final AbstractC0680i d(C0676e c0676e, C0678g c0678g) throws Throwable {
        i iVar = null;
        try {
            try {
                i.f11857F.getClass();
                i(new i(c0676e));
                return this;
            } catch (InvalidProtocolBufferException e10) {
                i iVar2 = (i) e10.f12841s;
                try {
                    throw e10;
                } catch (Throwable th) {
                    th = th;
                    iVar = iVar2;
                    if (iVar != null) {
                        i(iVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (iVar != null) {
                i(iVar);
            }
            throw th;
        }
    }

    @Override // p104k9.AbstractC0680i
    public final /* bridge */ /* synthetic */ AbstractC0680i e(n nVar) {
        i((i) nVar);
        return this;
    }

    public final i f() {
        i iVar = new i(this);
        int i10 = this.f11844t;
        int i11 = (i10 & 1) != 1 ? 0 : 1;
        iVar.f11864u = this.f11845u;
        if ((i10 & 2) == 2) {
            i11 |= 2;
        }
        iVar.f11865v = this.f11846v;
        if ((i10 & 4) == 4) {
            i11 |= 4;
        }
        iVar.f11866w = this.f11847w;
        if ((i10 & 8) == 8) {
            i11 |= 8;
        }
        iVar.f11867x = this.f11848x;
        if ((i10 & 16) == 16) {
            this.f11849y = Collections.unmodifiableList(this.f11849y);
            this.f11844t &= -17;
        }
        iVar.f11868y = this.f11849y;
        if ((this.f11844t & 32) == 32) {
            this.f11850z = Collections.unmodifiableList(this.f11850z);
            this.f11844t &= -33;
        }
        iVar.f11858A = this.f11850z;
        iVar.f11863t = i11;
        return iVar;
    }

    public final void i(i iVar) {
        if (iVar == i.f11856E) {
            return;
        }
        int i10 = iVar.f11863t;
        if ((i10 & 1) == 1) {
            int i11 = iVar.f11864u;
            this.f11844t = 1 | this.f11844t;
            this.f11845u = i11;
        }
        if ((i10 & 2) == 2) {
            int i12 = iVar.f11865v;
            this.f11844t = 2 | this.f11844t;
            this.f11846v = i12;
        }
        if ((i10 & 4) == 4) {
            this.f11844t |= 4;
            this.f11847w = iVar.f11866w;
        }
        if ((i10 & 8) == 8) {
            h hVar = iVar.f11867x;
            hVar.getClass();
            this.f11844t = 8 | this.f11844t;
            this.f11848x = hVar;
        }
        if (!iVar.f11868y.isEmpty()) {
            if (this.f11849y.isEmpty()) {
                this.f11849y = iVar.f11868y;
                this.f11844t &= -17;
            } else {
                if ((this.f11844t & 16) != 16) {
                    this.f11849y = new ArrayList(this.f11849y);
                    this.f11844t |= 16;
                }
                this.f11849y.addAll(iVar.f11868y);
            }
        }
        if (!iVar.f11858A.isEmpty()) {
            if (this.f11850z.isEmpty()) {
                this.f11850z = iVar.f11858A;
                this.f11844t &= -33;
            } else {
                if ((this.f11844t & 32) != 32) {
                    this.f11850z = new ArrayList(this.f11850z);
                    this.f11844t |= 32;
                }
                this.f11850z.addAll(iVar.f11858A);
            }
        }
        this.f12808s = this.f12808s.e(iVar.f11862s);
    }
}
