package C1;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class i implements V1.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final MessageDigest f938s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final V1.e f939t = new V1.e();

    public i(MessageDigest messageDigest) {
        this.f938s = messageDigest;
    }

    @Override // V1.b
    public final V1.e g() {
        return this.f939t;
    }
}
