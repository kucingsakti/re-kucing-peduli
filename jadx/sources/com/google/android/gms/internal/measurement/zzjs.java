package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class zzjs extends IOException {
    public static zzjv a() {
        return new zzjv("Protocol message tag had invalid wire type.");
    }

    public static zzjs b() {
        return new zzjs("Protocol message had invalid UTF-8.");
    }

    public static zzjs c() {
        return new zzjs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzjs d() {
        return new zzjs("Failed to parse the message.");
    }

    public static zzjs e() {
        return new zzjs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
