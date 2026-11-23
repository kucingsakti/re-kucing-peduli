package p104k9;

import U1.k;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* JADX INFO: renamed from: k9.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0673b implements u {
    static {
        int i10 = C0678g.f12805b;
    }

    public final AbstractC0672a b(ByteArrayInputStream byteArrayInputStream, C0678g c0678g) throws InvalidProtocolBufferException {
        AbstractC0672a abstractC0672a;
        try {
            int i10 = byteArrayInputStream.read();
            if (i10 == -1) {
                abstractC0672a = null;
            } else {
                if ((i10 & 128) != 0) {
                    i10 &= 127;
                    int i11 = 7;
                    while (true) {
                        if (i11 < 32) {
                            int i12 = byteArrayInputStream.read();
                            if (i12 == -1) {
                                throw InvalidProtocolBufferException.a();
                            }
                            i10 |= (i12 & 127) << i11;
                            if ((i12 & 128) == 0) {
                                break;
                            }
                            i11 += 7;
                        } else {
                            while (true) {
                                if (i11 >= 64) {
                                    throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                                }
                                int i13 = byteArrayInputStream.read();
                                if (i13 == -1) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                if ((i13 & 128) == 0) {
                                    break;
                                }
                                i11 += 7;
                            }
                        }
                    }
                }
                C0676e c0676e = new C0676e(new k(byteArrayInputStream, i10));
                AbstractC0672a abstractC0672a2 = (AbstractC0672a) a(c0676e, c0678g);
                try {
                    c0676e.a(0);
                    abstractC0672a = abstractC0672a2;
                } catch (InvalidProtocolBufferException e10) {
                    e10.f12841s = abstractC0672a2;
                    throw e10;
                }
            }
            if (abstractC0672a == null || abstractC0672a.isInitialized()) {
                return abstractC0672a;
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.f12841s = abstractC0672a;
            throw invalidProtocolBufferException;
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        }
    }
}
