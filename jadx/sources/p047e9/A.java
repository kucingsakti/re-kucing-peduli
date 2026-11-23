package p047e9;

import p104k9.o;

/* JADX INFO: loaded from: classes.dex */
public enum A implements o {
    /* JADX INFO: Fake field, exist only in values array */
    FINAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN(1),
    /* JADX INFO: Fake field, exist only in values array */
    ABSTRACT(2),
    /* JADX INFO: Fake field, exist only in values array */
    SEALED(3);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10736s;

    A(int i10) {
        this.f10736s = i10;
    }

    @Override // p104k9.o
    public final int getNumber() {
        return this.f10736s;
    }
}
