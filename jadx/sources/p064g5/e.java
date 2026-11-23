package p064g5;

import p123m8.d;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static /* synthetic */ void enqueue$default(f fVar, g gVar, boolean z6, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueue");
        }
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        fVar.enqueue(gVar, z6);
    }

    public static /* synthetic */ Object enqueueAndWait$default(f fVar, g gVar, boolean z6, d dVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: enqueueAndWait");
        }
        if ((i10 & 2) != 0) {
            z6 = false;
        }
        return fVar.enqueueAndWait(gVar, z6, dVar);
    }
}
