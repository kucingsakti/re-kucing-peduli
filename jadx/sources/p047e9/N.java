package p047e9;

import p104k9.o;

/* JADX INFO: loaded from: classes.dex */
public enum N implements o {
    IN(0),
    OUT(1),
    INV(2),
    STAR(3);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10844s;

    N(int i10) {
        this.f10844s = i10;
    }

    @Override // p104k9.o
    public final int getNumber() {
        return this.f10844s;
    }
}
