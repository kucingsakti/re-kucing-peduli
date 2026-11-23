package p182s4;

import p024c4.f;

/* JADX INFO: loaded from: classes.dex */
public enum r implements f {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14713s;

    r(int i10) {
        this.f14713s = i10;
    }

    @Override // p024c4.f
    public final int getNumber() {
        return this.f14713s;
    }
}
