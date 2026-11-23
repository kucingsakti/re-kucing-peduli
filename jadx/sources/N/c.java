package N;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final Signature a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Cipher f3259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Mac f3260c;

    public c(Signature signature) {
        this.a = signature;
        this.f3259b = null;
        this.f3260c = null;
    }

    public c(Cipher cipher) {
        this.f3259b = cipher;
        this.a = null;
        this.f3260c = null;
    }

    public c(Mac mac) {
        this.f3260c = mac;
        this.f3259b = null;
        this.a = null;
    }
}
