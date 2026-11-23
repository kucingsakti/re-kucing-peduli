package p144o8;

import p123m8.d;
import p123m8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f13826s = new b();

    @Override // p123m8.d
    public final i getContext() {
        throw new IllegalStateException("This continuation is already complete");
    }

    @Override // p123m8.d
    public final void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete");
    }

    public final String toString() {
        return "This continuation is already complete";
    }
}
