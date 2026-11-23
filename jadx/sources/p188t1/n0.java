package p188t1;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends k0 {
    @Override // p188t1.i0, p188t1.f0
    public final boolean a() {
        return g();
    }

    @Override // p188t1.i0, p188t1.f0
    public final boolean b() {
        int securityLevel = j().getSecurityLevel();
        return securityLevel == -1 || securityLevel == 1 || securityLevel == 2;
    }
}
