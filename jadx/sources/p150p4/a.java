package p150p4;

import p034d4.c;

/* JADX INFO: loaded from: classes.dex */
public enum a implements c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14227s;

    a(int i10) {
        this.f14227s = i10;
    }

    @Override // p034d4.c
    public final int getNumber() {
        return this.f14227s;
    }
}
