package A9;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public class N {
    public final boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B9.b f344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B9.e f345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B9.f f346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayDeque f348g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public J9.i f349h;

    public N(boolean z6, boolean z10, B9.b bVar, B9.e eVar, B9.f fVar) {
        p210v8.i.f(bVar, "typeSystemContext");
        p210v8.i.f(eVar, "kotlinTypePreparator");
        p210v8.i.f(fVar, "kotlinTypeRefiner");
        this.a = z6;
        this.f343b = z10;
        this.f344c = bVar;
        this.f345d = eVar;
        this.f346e = fVar;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f348g;
        p210v8.i.c(arrayDeque);
        arrayDeque.clear();
        J9.i iVar = this.f349h;
        p210v8.i.c(iVar);
        iVar.clear();
    }

    public final void b() {
        if (this.f348g == null) {
            this.f348g = new ArrayDeque(4);
        }
        if (this.f349h == null) {
            this.f349h = new J9.i();
        }
    }

    public final d0 c(D9.c cVar) {
        p210v8.i.f(cVar, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        return this.f345d.c(cVar);
    }

    public final AbstractC0151y d(D9.c cVar) {
        p210v8.i.f(cVar, com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY);
        this.f346e.getClass();
        return (AbstractC0151y) cVar;
    }
}
