package p027c7;

import java.io.Serializable;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Serializable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Signature f7533s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Cipher f7534t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Mac f7535u;

    public a(Signature signature, Cipher cipher, Mac mac) {
        this.f7533s = signature;
        this.f7534t = cipher;
        this.f7535u = mac;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return i.a(this.f7533s, aVar.f7533s) && i.a(this.f7534t, aVar.f7534t) && i.a(this.f7535u, aVar.f7535u);
    }

    public final int hashCode() {
        Signature signature = this.f7533s;
        int iHashCode = (signature != null ? signature.hashCode() : 0) * 31;
        Cipher cipher = this.f7534t;
        int iHashCode2 = (iHashCode + (cipher != null ? cipher.hashCode() : 0)) * 31;
        Mac mac = this.f7535u;
        return iHashCode2 + (mac != null ? mac.hashCode() : 0);
    }

    public final String toString() {
        return "Crypto(signature=" + this.f7533s + ", cipher=" + this.f7534t + ", mac=" + this.f7535u + ")";
    }
}
