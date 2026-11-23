package p047e9;

import p104k9.o;

/* JADX INFO: loaded from: classes.dex */
public enum b0 implements o {
    WARNING(0),
    ERROR(1),
    HIDDEN(2);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10989s;

    b0(int i10) {
        this.f10989s = i10;
    }

    @Override // p104k9.o
    public final int getNumber() {
        return this.f10989s;
    }
}
