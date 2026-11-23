package com.google.android.gms.internal.measurement;

import com.rollbar.notifier.sender.SyncSender;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class zzjm {
    public static final Charset a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f8682b;

    static {
        Charset.forName("US-ASCII");
        a = Charset.forName(SyncSender.UTF_8);
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f8682b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C0567e0(0, bArr).c(0);
        } catch (zzjs e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
