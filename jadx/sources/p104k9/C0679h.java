package p104k9;

import B4.C0154b;
import com.rollbar.notifier.sender.SyncSender;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: k9.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0679h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0679h f12806c = new C0679h(0);
    public final y a = new y(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12807b;

    public C0679h() {
    }

    public static int c(J j, Object obj) {
        switch (j.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return C0154b.g(((Long) obj).longValue());
            case 3:
                return C0154b.g(((Long) obj).longValue());
            case 4:
                return C0154b.c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes(SyncSender.UTF_8);
                    return C0154b.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported.", e10);
                }
            case 9:
                return ((AbstractC0672a) obj).b();
            case 10:
                return C0154b.e((AbstractC0672a) obj);
            case 11:
                if (obj instanceof AbstractC0675d) {
                    AbstractC0675d abstractC0675d = (AbstractC0675d) obj;
                    return abstractC0675d.size() + C0154b.f(abstractC0675d.size());
                }
                byte[] bArr = (byte[]) obj;
                return C0154b.f(bArr.length) + bArr.length;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return C0154b.f(((Integer) obj).intValue());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return obj instanceof o ? C0154b.c(((o) obj).getNumber()) : C0154b.c(((Integer) obj).intValue());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return C0154b.f((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return C0154b.g((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int d(l lVar, Object obj) {
        J j = lVar.f12813t;
        boolean z6 = lVar.f12814u;
        int i10 = lVar.f12812s;
        if (!z6) {
            int iH = C0154b.h(i10);
            if (j == J.f12772w) {
                iH *= 2;
            }
            return c(j, obj) + iH;
        }
        int iC = 0;
        for (Object obj2 : (List) obj) {
            int iH2 = C0154b.h(i10);
            if (j == J.f12772w) {
                iH2 *= 2;
            }
            iC += c(j, obj2) + iH2;
        }
        return iC;
    }

    public static boolean e(Map.Entry entry) {
        l lVar = (l) entry.getKey();
        if (lVar.f12813t.f12776s != K.f12779B) {
            return true;
        }
        if (!lVar.f12814u) {
            Object value = entry.getValue();
            if (value instanceof AbstractC0672a) {
                return ((AbstractC0672a) value).isInitialized();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((AbstractC0672a) it.next()).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    public static Object h(C0676e c0676e, J j) {
        switch (j.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c0676e.j()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c0676e.i()));
            case 2:
                return Long.valueOf(c0676e.l());
            case 3:
                return Long.valueOf(c0676e.l());
            case 4:
                return Integer.valueOf(c0676e.k());
            case 5:
                return Long.valueOf(c0676e.j());
            case 6:
                return Integer.valueOf(c0676e.i());
            case 7:
                return Boolean.valueOf(c0676e.l() != 0);
            case 8:
                int iK = c0676e.k();
                int i10 = c0676e.f12796b;
                int i11 = c0676e.f12798d;
                if (iK > i10 - i11 || iK <= 0) {
                    return iK == 0 ? "" : new String(c0676e.h(iK), SyncSender.UTF_8);
                }
                String str = new String(c0676e.a, i11, iK, SyncSender.UTF_8);
                c0676e.f12798d += iK;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c0676e.e();
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                return Integer.valueOf(c0676e.k());
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return Integer.valueOf(c0676e.i());
            case 15:
                return Long.valueOf(c0676e.j());
            case 16:
                int iK2 = c0676e.k();
                return Integer.valueOf((-(iK2 & 1)) ^ (iK2 >>> 1));
            case 17:
                long jL = c0676e.l();
                return Long.valueOf((-(jL & 1)) ^ (jL >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    public static void j(J j, Object obj) {
        obj.getClass();
        boolean z6 = true;
        boolean z10 = false;
        switch (j.f12776s) {
            case f12781t:
                z10 = obj instanceof Integer;
                break;
            case f12782u:
                z10 = obj instanceof Long;
                break;
            case f12783v:
                z10 = obj instanceof Float;
                break;
            case f12784w:
                z10 = obj instanceof Double;
                break;
            case f12785x:
                z10 = obj instanceof Boolean;
                break;
            case f12786y:
                z10 = obj instanceof String;
                break;
            case f12787z:
                if (!(obj instanceof AbstractC0675d) && !(obj instanceof byte[])) {
                    z6 = false;
                }
                z10 = z6;
                break;
            case f12778A:
                if (!(obj instanceof Integer) && !(obj instanceof o)) {
                    z6 = false;
                }
                z10 = z6;
                break;
            case f12779B:
                z10 = obj instanceof AbstractC0672a;
                break;
        }
        if (!z10) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static void k(C0154b c0154b, J j, Object obj) {
        switch (j.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                c0154b.getClass();
                c0154b.u(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                c0154b.getClass();
                c0154b.t(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                c0154b.w(((Long) obj).longValue());
                break;
            case 3:
                c0154b.w(((Long) obj).longValue());
                break;
            case 4:
                c0154b.n(((Integer) obj).intValue());
                break;
            case 5:
                c0154b.u(((Long) obj).longValue());
                break;
            case 6:
                c0154b.t(((Integer) obj).intValue());
                break;
            case 7:
                c0154b.q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                c0154b.getClass();
                byte[] bytes = ((String) obj).getBytes(SyncSender.UTF_8);
                c0154b.v(bytes.length);
                c0154b.s(bytes);
                break;
            case 9:
                c0154b.getClass();
                ((AbstractC0672a) obj).e(c0154b);
                break;
            case 10:
                c0154b.p((AbstractC0672a) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC0675d)) {
                    byte[] bArr = (byte[]) obj;
                    c0154b.getClass();
                    c0154b.v(bArr.length);
                    c0154b.s(bArr);
                } else {
                    AbstractC0675d abstractC0675d = (AbstractC0675d) obj;
                    c0154b.getClass();
                    c0154b.v(abstractC0675d.size());
                    c0154b.r(abstractC0675d);
                }
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                c0154b.v(((Integer) obj).intValue());
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                if (!(obj instanceof o)) {
                    c0154b.n(((Integer) obj).intValue());
                } else {
                    c0154b.n(((o) obj).getNumber());
                }
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                c0154b.t(((Integer) obj).intValue());
                break;
            case 15:
                c0154b.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c0154b.v((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                c0154b.w((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    public final void a(l lVar, Object obj) {
        List arrayList;
        if (!lVar.f12814u) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        j(lVar.f12813t, obj);
        y yVar = this.a;
        Object obj2 = yVar.get(lVar);
        if (obj2 == null) {
            arrayList = new ArrayList();
            yVar.put(lVar, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0679h clone() {
        y yVar;
        C0679h c0679h = new C0679h();
        int i10 = 0;
        while (true) {
            yVar = this.a;
            if (i10 >= yVar.f12837t.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) yVar.f12837t.get(i10);
            c0679h.i((l) entry.getKey(), entry.getValue());
            i10++;
        }
        for (Map.Entry entry2 : yVar.c()) {
            c0679h.i((l) entry2.getKey(), entry2.getValue());
        }
        return c0679h;
    }

    public final void f() {
        if (this.f12807b) {
            return;
        }
        y yVar = this.a;
        if (!yVar.f12839v) {
            for (int i10 = 0; i10 < yVar.f12837t.size(); i10++) {
                Map.Entry entry = (Map.Entry) yVar.f12837t.get(i10);
                if (((l) entry.getKey()).f12814u) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : yVar.c()) {
                if (((l) entry2.getKey()).f12814u) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!yVar.f12839v) {
            yVar.f12838u = yVar.f12838u.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(yVar.f12838u);
            yVar.f12839v = true;
        }
        this.f12807b = true;
    }

    public final void g(Map.Entry entry) {
        l lVar = (l) entry.getKey();
        Object value = entry.getValue();
        boolean z6 = lVar.f12814u;
        y yVar = this.a;
        if (z6) {
            Object arrayList = yVar.get(lVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            yVar.put(lVar, arrayList);
            return;
        }
        if (lVar.f12813t.f12776s != K.f12779B) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            yVar.put(lVar, value);
            return;
        }
        Object obj2 = yVar.get(lVar);
        if (obj2 != null) {
            yVar.put(lVar, ((AbstractC0672a) obj2).d().e((n) ((AbstractC0672a) value)).c());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        yVar.put(lVar, value);
    }

    public final void i(l lVar, Object obj) {
        boolean z6 = lVar.f12814u;
        J j = lVar.f12813t;
        if (!z6) {
            j(j, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j(j, it.next());
            }
            obj = arrayList;
        }
        this.a.put(lVar, obj);
    }

    public C0679h(int i10) {
        f();
    }
}
