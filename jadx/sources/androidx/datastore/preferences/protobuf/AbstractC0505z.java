package androidx.datastore.preferences.protobuf;

import com.rollbar.notifier.sender.SyncSender;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0505z {
    public static final Charset a = Charset.forName(SyncSender.UTF_8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6524b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6524b = bArr;
        ByteBuffer.wrap(bArr);
        if (0 + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw InvalidProtocolBufferException.f();
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static AbstractC0502w c(Object obj, Object obj2) {
        AbstractC0502w abstractC0502w = (AbstractC0502w) ((AbstractC0478a) obj);
        AbstractC0500u abstractC0500u = (AbstractC0500u) abstractC0502w.d(5);
        abstractC0500u.d();
        AbstractC0500u.e(abstractC0500u.f6521t, abstractC0502w);
        AbstractC0478a abstractC0478a = (AbstractC0478a) obj2;
        if (!abstractC0500u.f6520s.getClass().isInstance(abstractC0478a)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        abstractC0500u.d();
        AbstractC0500u.e(abstractC0500u.f6521t, (AbstractC0502w) abstractC0478a);
        return abstractC0500u.c();
    }
}
