package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import p104k9.AbstractC0672a;

/* JADX INFO: loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AbstractC0672a f12841s;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f12841s = null;
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
