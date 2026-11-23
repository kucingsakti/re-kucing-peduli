package p113l8;

import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k f12967s;

    /* JADX WARN: Multi-variable type inference failed */
    public a(p200u8.a aVar) {
        this.f12967s = (k) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [u8.a, v8.k] */
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f12967s.invoke();
    }
}
