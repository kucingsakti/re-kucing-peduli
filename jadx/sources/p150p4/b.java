package p150p4;

import p034d4.c;

/* JADX INFO: loaded from: classes.dex */
public enum b implements c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14231s;

    b(int i10) {
        this.f14231s = i10;
    }

    @Override // p034d4.c
    public final int getNumber() {
        return this.f14231s;
    }
}
