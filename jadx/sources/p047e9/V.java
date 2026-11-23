package p047e9;

import p104k9.o;

/* JADX INFO: loaded from: classes.dex */
public enum V implements o {
    IN(0),
    OUT(1),
    INV(2);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10925s;

    V(int i10) {
        this.f10925s = i10;
    }

    @Override // p104k9.o
    public final int getNumber() {
        return this.f10925s;
    }
}
