package p182s4;

import p024c4.f;

/* JADX INFO: renamed from: s4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0772i implements f {
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_DISABLED_REMOTE(4),
    /* JADX INFO: Fake field, exist only in values array */
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14694s;

    EnumC0772i(int i10) {
        this.f14694s = i10;
    }

    @Override // p024c4.f
    public final int getNumber() {
        return this.f14694s;
    }
}
