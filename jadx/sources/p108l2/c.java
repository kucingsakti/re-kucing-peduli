package p108l2;

/* JADX INFO: loaded from: classes.dex */
public enum c implements p034d4.c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f12908s;

    c(int i10) {
        this.f12908s = i10;
    }

    @Override // p034d4.c
    public final int getNumber() {
        return this.f12908s;
    }
}
