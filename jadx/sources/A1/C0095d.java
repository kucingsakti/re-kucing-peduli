package A1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: A1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0095d extends WeakReference {
    public final y a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f89b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F f90c;

    public C0095d(y yVar, z zVar, ReferenceQueue referenceQueue) {
        super(zVar, referenceQueue);
        U1.f.c(yVar, "Argument must not be null");
        this.a = yVar;
        boolean z6 = zVar.f213s;
        this.f90c = null;
        this.f89b = z6;
    }
}
