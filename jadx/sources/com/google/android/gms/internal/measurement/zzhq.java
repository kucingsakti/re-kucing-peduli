package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzhp;
import com.google.android.gms.internal.measurement.zzhq;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzhq<MessageType extends zzhq<MessageType, BuilderType>, BuilderType extends zzhp<MessageType, BuilderType>> implements zzkt {
    protected int zza = 0;

    public static void j(Iterable iterable, List list) {
        Charset charset = zzjm.a;
        iterable.getClass();
        if (!(iterable instanceof zzka)) {
            if (iterable instanceof z0) {
                list.addAll((Collection) iterable);
                return;
            }
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String strG = E0.a.g("Element at index ", list.size() - size, " is null.");
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(strG);
                }
                list.add(obj);
            }
            return;
        }
        List listM3b = ((zzka) iterable).m3b();
        zzka zzkaVar = (zzka) list;
        int size3 = list.size();
        for (Object obj2 : listM3b) {
            if (obj2 == null) {
                String strG2 = E0.a.g("Element at index ", zzkaVar.size() - size3, " is null.");
                for (int size4 = zzkaVar.size() - 1; size4 >= size3; size4--) {
                    zzkaVar.remove(size4);
                }
                throw new NullPointerException(strG2);
            }
            if (obj2 instanceof zzia) {
                zzkaVar.m4b();
            } else if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                zzia.g(bArr, 0, bArr.length);
                zzkaVar.m4b();
            } else {
                zzkaVar.add((String) obj2);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final C0565d0 f() {
        try {
            int iG = ((zzjk) this).g(null);
            C0565d0 c0565d0 = zzia.f8668t;
            byte[] bArr = new byte[iG];
            Logger logger = zzit.f8671b;
            C0569f0 c0569f0 = new C0569f0(iG, bArr);
            ((zzjk) this).d(c0569f0);
            if (c0569f0.i() == 0) {
                return new C0565d0(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(E0.a.i("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e10);
        }
    }

    public int g(D0 d3) {
        int iK = k();
        if (iK != -1) {
            return iK;
        }
        int i10 = d3.i(this);
        m(i10);
        return i10;
    }

    public int k() {
        throw new UnsupportedOperationException();
    }

    public final byte[] l() {
        try {
            int iG = ((zzjk) this).g(null);
            byte[] bArr = new byte[iG];
            Logger logger = zzit.f8671b;
            C0569f0 c0569f0 = new C0569f0(iG, bArr);
            ((zzjk) this).d(c0569f0);
            if (c0569f0.i() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(E0.a.i("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e10);
        }
    }

    public void m(int i10) {
        throw new UnsupportedOperationException();
    }
}
