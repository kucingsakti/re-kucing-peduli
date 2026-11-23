package p047e9;

import p104k9.o;

/* JADX INFO: loaded from: classes.dex */
public enum I implements o {
    CLASS(0),
    PACKAGE(1),
    LOCAL(2);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10813s;

    I(int i10) {
        this.f10813s = i10;
    }

    @Override // p104k9.o
    public final int getNumber() {
        return this.f10813s;
    }
}
