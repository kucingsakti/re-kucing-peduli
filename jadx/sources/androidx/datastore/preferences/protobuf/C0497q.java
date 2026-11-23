package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0497q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f6504c = 0;
    public final d0 a = new d0(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6505b;

    static {
        new C0497q(0);
    }

    public C0497q() {
    }

    public static void b(C0491k c0491k, B0 b3, int i10, Object obj) throws CodedOutputStream$OutOfSpaceException {
        if (b3 == B0.f6397v) {
            c0491k.R(i10, 3);
            ((AbstractC0478a) obj).c(c0491k);
            c0491k.R(i10, 4);
        }
        c0491k.R(i10, b3.f6401t);
        switch (b3.ordinal()) {
            case 0:
                c0491k.L(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c0491k.J(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c0491k.V(((Long) obj).longValue());
                break;
            case 3:
                c0491k.V(((Long) obj).longValue());
                break;
            case 4:
                c0491k.N(((Integer) obj).intValue());
                break;
            case 5:
                c0491k.L(((Long) obj).longValue());
                break;
            case 6:
                c0491k.J(((Integer) obj).intValue());
                break;
            case 7:
                c0491k.D(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C0488h)) {
                    c0491k.Q((String) obj);
                } else {
                    c0491k.H((C0488h) obj);
                }
                break;
            case 9:
                ((AbstractC0478a) obj).c(c0491k);
                break;
            case 10:
                AbstractC0478a abstractC0478a = (AbstractC0478a) obj;
                c0491k.getClass();
                c0491k.T(abstractC0478a.a());
                abstractC0478a.c(c0491k);
                break;
            case 11:
                if (!(obj instanceof C0488h)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c0491k.T(length);
                    c0491k.E(bArr, 0, length);
                } else {
                    c0491k.H((C0488h) obj);
                }
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                c0491k.T(((Integer) obj).intValue());
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                c0491k.N(((Integer) obj).intValue());
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                c0491k.J(((Integer) obj).intValue());
                break;
            case 15:
                c0491k.L(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0491k.T((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c0491k.V((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a() {
        if (this.f6505b) {
            return;
        }
        d0 d0Var = this.a;
        if (!d0Var.f6456v) {
            if (d0Var.f6454t.size() > 0) {
                d0Var.c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = d0Var.e().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!d0Var.f6456v) {
            d0Var.f6455u = d0Var.f6455u.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(d0Var.f6455u);
            d0Var.f6458x = d0Var.f6458x.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(d0Var.f6458x);
            d0Var.f6456v = true;
        }
        this.f6505b = true;
    }

    public final Object clone() {
        C0497q c0497q = new C0497q();
        d0 d0Var = this.a;
        if (d0Var.f6454t.size() > 0) {
            Map.Entry entryC = d0Var.c(0);
            if (entryC.getKey() != null) {
                throw new ClassCastException();
            }
            entryC.getValue();
            throw null;
        }
        Iterator it = d0Var.e().iterator();
        if (!it.hasNext()) {
            return c0497q;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0497q) {
            return this.a.equals(((C0497q) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public C0497q(int i10) {
        a();
        a();
    }
}
