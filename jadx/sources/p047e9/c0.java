package p047e9;

import p104k9.o;

/* JADX INFO: loaded from: classes.dex */
public enum c0 implements o {
    LANGUAGE_VERSION(0),
    COMPILER_VERSION(1),
    API_VERSION(2);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11009s;

    c0(int i10) {
        this.f11009s = i10;
    }

    @Override // p104k9.o
    public final int getNumber() {
        return this.f11009s;
    }
}
