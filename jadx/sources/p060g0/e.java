package p060g0;

import androidx.datastore.preferences.protobuf.AbstractC0500u;
import androidx.datastore.preferences.protobuf.AbstractC0502w;
import androidx.datastore.preferences.protobuf.C0489i;
import androidx.datastore.preferences.protobuf.C0490j;
import androidx.datastore.preferences.protobuf.C0494n;
import androidx.datastore.preferences.protobuf.C0501v;
import androidx.datastore.preferences.protobuf.InterfaceC0481b0;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.V;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.Z;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0502w {
    private static final e DEFAULT_INSTANCE;
    private static volatile V PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private L preferences_ = L.f6418t;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        AbstractC0502w.h(e.class, eVar);
    }

    public static L i(e eVar) {
        L l4 = eVar.preferences_;
        if (!l4.f6419s) {
            eVar.preferences_ = l4.c();
        }
        return eVar.preferences_;
    }

    public static c k() {
        return (c) ((AbstractC0500u) DEFAULT_INSTANCE.d(5));
    }

    public static e l(FileInputStream fileInputStream) {
        e eVar = DEFAULT_INSTANCE;
        C0489i c0489i = new C0489i(fileInputStream);
        C0494n c0494nA = C0494n.a();
        AbstractC0502w abstractC0502w = (AbstractC0502w) eVar.d(4);
        try {
            X x8 = X.f6439c;
            x8.getClass();
            InterfaceC0481b0 interfaceC0481b0A = x8.a(abstractC0502w.getClass());
            C0490j c0490j = (C0490j) c0489i.f226b;
            if (c0490j == null) {
                c0490j = new C0490j(c0489i);
            }
            interfaceC0481b0A.a(abstractC0502w, c0490j, c0494nA);
            interfaceC0481b0A.d(abstractC0502w);
            if (abstractC0502w.g()) {
                return (e) abstractC0502w;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw e11;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0502w
    public final Object d(int i10) {
        V c0501v;
        switch (p239z.e.d(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new Z(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", d.a});
            case 3:
                return new e();
            case 4:
                return new c(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                V v4 = PARSER;
                if (v4 != null) {
                    return v4;
                }
                synchronized (e.class) {
                    try {
                        c0501v = PARSER;
                        if (c0501v == null) {
                            c0501v = new C0501v();
                            PARSER = c0501v;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return c0501v;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map j() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
