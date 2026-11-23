package Q1;

import A1.C0099h;
import A1.F;
import A1.p;
import A1.t;
import A1.x;
import G4.i;
import U1.h;
import U1.n;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f implements c, R1.b {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final boolean f3960z = Log.isLoggable("GlideRequest", 2);
    public final V1.e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bumptech.glide.f f3963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f3964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f3965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f3966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f3967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f3968i;
    public final com.bumptech.glide.g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final R1.c f3969k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f3970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final S1.d f3971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final F3.c f3972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public F f3973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0099h f3974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile t f3975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f3976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f3977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f3978t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f3979u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f3980v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3981w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final RuntimeException f3982x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3983y;

    public f(Context context, com.bumptech.glide.f fVar, Object obj, Object obj2, Class cls, a aVar, int i10, int i11, com.bumptech.glide.g gVar, R1.c cVar, ArrayList arrayList, d dVar, t tVar, S1.d dVar2) {
        F3.c cVar2 = U1.f.a;
        if (f3960z) {
            String.valueOf(hashCode());
        }
        this.a = new V1.e();
        this.f3961b = obj;
        this.f3963d = fVar;
        this.f3964e = obj2;
        this.f3965f = cls;
        this.f3966g = aVar;
        this.f3967h = i10;
        this.f3968i = i11;
        this.j = gVar;
        this.f3969k = cVar;
        this.f3970l = arrayList;
        this.f3962c = dVar;
        this.f3975q = tVar;
        this.f3971m = dVar2;
        this.f3972n = cVar2;
        this.f3983y = 1;
        if (this.f3982x == null && ((Map) fVar.f7601h.f3811t).containsKey(com.bumptech.glide.d.class)) {
            this.f3982x = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // Q1.c
    public final boolean a() {
        boolean z6;
        synchronized (this.f3961b) {
            z6 = this.f3983y == 4;
        }
        return z6;
    }

    @Override // Q1.c
    public final boolean b(c cVar) {
        int i10;
        int i11;
        Object obj;
        Class cls;
        a aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class cls2;
        a aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        boolean zEquals;
        if (!(cVar instanceof f)) {
            return false;
        }
        synchronized (this.f3961b) {
            try {
                i10 = this.f3967h;
                i11 = this.f3968i;
                obj = this.f3964e;
                cls = this.f3965f;
                aVar = this.f3966g;
                gVar = this.j;
                ArrayList arrayList = this.f3970l;
                size = arrayList != null ? arrayList.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        f fVar = (f) cVar;
        synchronized (fVar.f3961b) {
            try {
                i12 = fVar.f3967h;
                i13 = fVar.f3968i;
                obj2 = fVar.f3964e;
                cls2 = fVar.f3965f;
                aVar2 = fVar.f3966g;
                gVar2 = fVar.j;
                ArrayList arrayList2 = fVar.f3970l;
                size2 = arrayList2 != null ? arrayList2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i10 != i12 || i11 != i13) {
            return false;
        }
        char[] cArr = n.a;
        if (obj == null) {
            zEquals = obj2 == null;
        } else {
            zEquals = obj.equals(obj2);
        }
        return zEquals && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2;
    }

    public final void c() {
        if (this.f3981w) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.a.a();
        this.f3969k.a(this);
        C0099h c0099h = this.f3974p;
        if (c0099h != null) {
            synchronized (((t) c0099h.f105v)) {
                ((x) c0099h.f103t).j((f) c0099h.f104u);
            }
            this.f3974p = null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [Q1.d, java.lang.Object] */
    @Override // Q1.c
    public final void clear() {
        synchronized (this.f3961b) {
            try {
                if (this.f3981w) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                if (this.f3983y == 6) {
                    return;
                }
                c();
                F f10 = this.f3973o;
                if (f10 != null) {
                    this.f3973o = null;
                } else {
                    f10 = null;
                }
                ?? r10 = this.f3962c;
                if (r10 == 0 || r10.c(this)) {
                    this.f3969k.j(d());
                }
                this.f3983y = 6;
                if (f10 != null) {
                    this.f3975q.getClass();
                    t.f(f10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Drawable d() {
        if (this.f3977s == null) {
            this.f3966g.getClass();
            this.f3977s = null;
        }
        return this.f3977s;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [Q1.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [Q1.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [Q1.d, java.lang.Object] */
    public final void e(GlideException glideException, int i10) {
        Drawable drawableD;
        this.a.a();
        synchronized (this.f3961b) {
            try {
                glideException.getClass();
                int i11 = this.f3963d.f7602i;
                if (i11 <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f3964e + "] with dimensions [" + this.f3979u + "x" + this.f3980v + "]", glideException);
                    if (i11 <= 4) {
                        glideException.d();
                    }
                }
                this.f3974p = null;
                this.f3983y = 5;
                ?? r10 = this.f3962c;
                if (r10 != 0) {
                    r10.f(this);
                }
                boolean z6 = true;
                this.f3981w = true;
                try {
                    ArrayList<i> arrayList = this.f3970l;
                    if (arrayList != null) {
                        for (i iVar : arrayList) {
                            ?? r11 = this.f3962c;
                            if (r11 != 0) {
                                r11.h().a();
                            }
                            iVar.getClass();
                        }
                    }
                    ?? r12 = this.f3962c;
                    if (r12 != 0 && !r12.d(this)) {
                        z6 = false;
                    }
                    if (z6) {
                        if (this.f3964e == null) {
                            if (this.f3978t == null) {
                                this.f3966g.getClass();
                                this.f3978t = null;
                            }
                            drawableD = this.f3978t;
                        } else {
                            drawableD = null;
                        }
                        if (drawableD == null) {
                            if (this.f3976r == null) {
                                this.f3966g.getClass();
                                this.f3976r = null;
                            }
                            drawableD = this.f3976r;
                        }
                        if (drawableD == null) {
                            drawableD = d();
                        }
                        this.f3969k.b(drawableD);
                    }
                    this.f3981w = false;
                } catch (Throwable th) {
                    this.f3981w = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v14, types: [Q1.d, java.lang.Object] */
    public final void f(F f10, int i10, boolean z6) {
        this.a.a();
        F f11 = null;
        try {
            synchronized (this.f3961b) {
                try {
                    this.f3974p = null;
                    if (f10 == null) {
                        e(new GlideException("Expected to receive a Resource<R> with an object of " + this.f3965f + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = f10.get();
                    try {
                        if (obj == null || !this.f3965f.isAssignableFrom(obj.getClass())) {
                            this.f3973o = null;
                            StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                            sb.append(this.f3965f);
                            sb.append(" but instead got ");
                            sb.append(obj != null ? obj.getClass() : "");
                            sb.append("{");
                            sb.append(obj);
                            sb.append("} inside Resource{");
                            sb.append(f10);
                            sb.append("}.");
                            sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            e(new GlideException(sb.toString()), 5);
                        } else {
                            ?? r10 = this.f3962c;
                            if (r10 == 0 || r10.j(this)) {
                                h(f10, obj, i10);
                                return;
                            } else {
                                this.f3973o = null;
                                this.f3983y = 4;
                            }
                        }
                        this.f3975q.getClass();
                        t.f(f10);
                    } catch (Throwable th) {
                        f11 = f10;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (f11 != null) {
                this.f3975q.getClass();
                t.f(f11);
            }
            throw th3;
        }
    }

    @Override // Q1.c
    public final boolean g() {
        boolean z6;
        synchronized (this.f3961b) {
            z6 = this.f3983y == 6;
        }
        return z6;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q1.d, java.lang.Object] */
    public final void h(F f10, Object obj, int i10) {
        ?? r10 = this.f3962c;
        if (r10 != 0) {
            r10.h().a();
        }
        this.f3983y = 4;
        this.f3973o = f10;
        if (this.f3963d.f7602i <= 3) {
            Objects.toString(this.f3964e);
            int i11 = h.a;
            SystemClock.elapsedRealtimeNanos();
        }
        if (r10 != 0) {
            r10.e(this);
        }
        this.f3981w = true;
        try {
            ArrayList arrayList = this.f3970l;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).getClass();
                }
            }
            this.f3969k.g(obj, this.f3971m.e(i10));
        } finally {
            this.f3981w = false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [Q1.d, java.lang.Object] */
    @Override // Q1.c
    public final void i() {
        synchronized (this.f3961b) {
            try {
                if (this.f3981w) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                int i10 = h.a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f3964e == null) {
                    if (n.j(this.f3967h, this.f3968i)) {
                        this.f3979u = this.f3967h;
                        this.f3980v = this.f3968i;
                    }
                    if (this.f3978t == null) {
                        this.f3966g.getClass();
                        this.f3978t = null;
                    }
                    e(new GlideException("Received null model"), this.f3978t == null ? 5 : 3);
                    return;
                }
                int i11 = this.f3983y;
                if (i11 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i11 == 4) {
                    f(this.f3973o, 5, false);
                    return;
                }
                ArrayList<i> arrayList = this.f3970l;
                if (arrayList != null) {
                    for (i iVar : arrayList) {
                    }
                }
                this.f3983y = 3;
                if (n.j(this.f3967h, this.f3968i)) {
                    j(this.f3967h, this.f3968i);
                } else {
                    this.f3969k.d(this);
                }
                int i12 = this.f3983y;
                if (i12 == 2 || i12 == 3) {
                    ?? r10 = this.f3962c;
                    if (r10 == 0 || r10.d(this)) {
                        this.f3969k.h(d());
                    }
                }
                if (f3960z) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q1.c
    public final boolean isRunning() {
        boolean z6;
        synchronized (this.f3961b) {
            int i10 = this.f3983y;
            z6 = i10 == 2 || i10 == 3;
        }
        return z6;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void j(int i10, int i11) {
        Object obj;
        f fVar = this;
        int iRound = i10;
        fVar.a.a();
        Object obj2 = fVar.f3961b;
        synchronized (obj2) {
            try {
                try {
                    boolean z6 = f3960z;
                    if (z6) {
                        int i12 = h.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (fVar.f3983y == 3) {
                        fVar.f3983y = 2;
                        fVar.f3966g.getClass();
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * 1.0f);
                        }
                        fVar.f3979u = iRound;
                        fVar.f3980v = i11 == Integer.MIN_VALUE ? i11 : Math.round(1.0f * i11);
                        if (z6) {
                            int i13 = h.a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        t tVar = fVar.f3975q;
                        try {
                            com.bumptech.glide.f fVar2 = fVar.f3963d;
                            Object obj3 = fVar.f3964e;
                            a aVar = fVar.f3966g;
                            try {
                                p232y1.e eVar = aVar.f3953y;
                                int i14 = fVar.f3979u;
                                try {
                                    int i15 = fVar.f3980v;
                                    Class cls = aVar.f3942C;
                                    try {
                                        Class cls2 = fVar.f3965f;
                                        com.bumptech.glide.g gVar = fVar.j;
                                        try {
                                            p pVar = aVar.f3948t;
                                            U1.c cVar = aVar.f3941B;
                                            try {
                                                boolean z10 = aVar.f3954z;
                                                boolean z11 = aVar.f3945F;
                                                try {
                                                    p232y1.h hVar = aVar.f3940A;
                                                    boolean z12 = aVar.f3950v;
                                                    boolean z13 = aVar.f3946G;
                                                    F3.c cVar2 = fVar.f3972n;
                                                    Object obj4 = obj2;
                                                    try {
                                                        fVar.f3974p = tVar.a(fVar2, obj3, eVar, i14, i15, cls, cls2, gVar, pVar, cVar, z10, z11, hVar, z12, z13, fVar, cVar2);
                                                        if (fVar.f3983y != 2) {
                                                            fVar.f3974p = null;
                                                        }
                                                        if (z6) {
                                                            int i16 = h.a;
                                                            SystemClock.elapsedRealtimeNanos();
                                                        }
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        obj = obj4;
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    obj = obj2;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                obj = obj2;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            obj = obj2;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        obj = obj2;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    obj = obj2;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                obj = obj2;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    obj = fVar;
                }
            } catch (Throwable th10) {
                th = th10;
                obj = obj2;
            }
        }
    }

    @Override // Q1.c
    public final boolean k() {
        boolean z6;
        synchronized (this.f3961b) {
            z6 = this.f3983y == 4;
        }
        return z6;
    }

    @Override // Q1.c
    public final void pause() {
        synchronized (this.f3961b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.f3961b) {
            obj = this.f3964e;
            cls = this.f3965f;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
