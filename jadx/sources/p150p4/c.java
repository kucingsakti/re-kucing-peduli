package p150p4;

/* JADX INFO: loaded from: classes.dex */
public enum c implements p034d4.c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f14234s;

    c(int i10) {
        this.f14234s = i10;
    }

    @Override // p034d4.c
    public final int getNumber() {
        return this.f14234s;
    }
}
