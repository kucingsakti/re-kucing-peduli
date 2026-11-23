package p047e9;

import p104k9.o;

/* JADX INFO: loaded from: classes.dex */
public enum f0 implements o {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11058s;

    f0(int i10) {
        this.f11058s = i10;
    }

    @Override // p104k9.o
    public final int getNumber() {
        return this.f11058s;
    }
}
