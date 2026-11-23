package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum C0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(C0488h.f6466u),
    ENUM(null),
    MESSAGE(null);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Serializable f6412s;

    C0(Serializable serializable) {
        this.f6412s = serializable;
    }
}
