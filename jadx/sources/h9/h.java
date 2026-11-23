package h9;

import p104k9.o;

/* JADX INFO: loaded from: classes.dex */
public enum h implements o {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11855s;

    h(int i10) {
        this.f11855s = i10;
    }

    @Override // p104k9.o
    public final int getNumber() {
        return this.f11855s;
    }
}
