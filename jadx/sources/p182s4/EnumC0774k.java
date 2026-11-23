package p182s4;

import p024c4.f;

/* JADX INFO: renamed from: s4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0774k implements f {
    /* JADX INFO: Fake field, exist only in values array */
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14699s;

    EnumC0774k(int i10) {
        this.f14699s = i10;
    }

    @Override // p024c4.f
    public final int getNumber() {
        return this.f14699s;
    }
}
