package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.chromium.net.UrlRequest;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0581l0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0581l0 f8391d = new C0581l0(0);
    public final F0 a = new F0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8393c;

    public C0581l0() {
    }

    public static int a(zzjf zzjfVar, Object obj) {
        zzmn zzmnVarA = zzjfVar.a();
        int iB = zzjfVar.b();
        if (!zzjfVar.e()) {
            return b(zzmnVarA, iB, obj);
        }
        List list = (List) obj;
        int iB2 = 0;
        if (!zzjfVar.d()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iB2 += b(zzmnVarA, iB, it.next());
            }
            return iB2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iB2 += c(zzmnVarA, it2.next());
        }
        return zzit.g(iB2) + zzit.f(iB) + iB2;
    }

    public static int b(zzmn zzmnVar, int i10, Object obj) {
        int iF = zzit.f(i10);
        if (zzmnVar == zzmn.f8709C) {
            Charset charset = zzjm.a;
            boolean z6 = ((zzkt) obj) instanceof zzhs;
            iF <<= 1;
        }
        return c(zzmnVar, obj) + iF;
    }

    public static int c(zzmn zzmnVar, Object obj) {
        int iA;
        int iG;
        switch (AbstractC0579k0.f8390b[zzmnVar.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = zzit.f8671b;
                return 8;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = zzit.f8671b;
                return 4;
            case 3:
                return zzit.e(((Long) obj).longValue());
            case 4:
                return zzit.e(((Long) obj).longValue());
            case 5:
                return zzit.e(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                Logger logger3 = zzit.f8671b;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                Logger logger4 = zzit.f8671b;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger5 = zzit.f8671b;
                return 1;
            case 9:
                Logger logger6 = zzit.f8671b;
                return ((zzkt) obj).a();
            case 10:
                if (obj instanceof zzjx) {
                    return zzit.a((zzjx) obj);
                }
                Logger logger7 = zzit.f8671b;
                iA = ((zzkt) obj).a();
                iG = zzit.g(iA);
                break;
            case 11:
                if (!(obj instanceof zzia)) {
                    return zzit.c((String) obj);
                }
                Logger logger8 = zzit.f8671b;
                iA = ((zzia) obj).n();
                iG = zzit.g(iA);
                break;
                break;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                if (!(obj instanceof zzia)) {
                    Logger logger9 = zzit.f8671b;
                    iA = ((byte[]) obj).length;
                    iG = zzit.g(iA);
                } else {
                    Logger logger10 = zzit.f8671b;
                    iA = ((zzia) obj).n();
                    iG = zzit.g(iA);
                }
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                return zzit.g(((Integer) obj).intValue());
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((Integer) obj).getClass();
                Logger logger11 = zzit.f8671b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = zzit.f8671b;
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return zzit.g((iIntValue >> 31) ^ (iIntValue << 1));
            case 17:
                long jLongValue = ((Long) obj).longValue();
                return zzit.e((jLongValue >> 63) ^ (jLongValue << 1));
            case 18:
                return obj instanceof zzjp ? zzit.e(((zzjp) obj).b()) : zzit.e(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iG + iA;
    }

    public static int d(Map.Entry entry) {
        zzjf zzjfVar = (zzjf) entry.getKey();
        Object value = entry.getValue();
        if (zzjfVar.c() != zzmx.f8727A || zzjfVar.e() || zzjfVar.d()) {
            return a(zzjfVar, value);
        }
        if (value instanceof zzjx) {
            int iB = ((zzjf) entry.getKey()).b();
            int iH = zzit.h(2, iB) + (zzit.g(8) << 1);
            int iG = zzit.g(24);
            int iA = ((zzjx) value).a();
            return zzit.g(iA) + iA + iG + iH;
        }
        int iB2 = ((zzjf) entry.getKey()).b();
        int iH2 = zzit.h(2, iB2) + (zzit.g(8) << 1);
        int iG2 = zzit.g(24);
        int iA2 = ((zzkt) value).a();
        return zzit.g(iA2) + iA2 + iG2 + iH2;
    }

    public static Object e(Object obj) {
        if (obj instanceof zzky) {
            ((zzky) obj).b();
            throw null;
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public static void h(zzjf zzjfVar, Object obj) {
        boolean z6;
        zzmn zzmnVarA = zzjfVar.a();
        Charset charset = zzjm.a;
        obj.getClass();
        switch (AbstractC0579k0.a[zzmnVarA.f8726s.ordinal()]) {
            case 1:
                z6 = obj instanceof Integer;
                break;
            case 2:
                z6 = obj instanceof Long;
                break;
            case 3:
                z6 = obj instanceof Float;
                break;
            case 4:
                z6 = obj instanceof Double;
                break;
            case 5:
                z6 = obj instanceof Boolean;
                break;
            case 6:
                z6 = obj instanceof String;
                break;
            case 7:
                if ((obj instanceof zzia) || (obj instanceof byte[])) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                break;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof zzjp)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                break;
            case 9:
                if ((obj instanceof zzkt) || (obj instanceof zzjx)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                break;
            default:
                z6 = false;
                break;
        }
        if (!z6) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjfVar.b()), zzjfVar.a().f8726s, obj.getClass().getName()));
        }
    }

    public static boolean i(Map.Entry entry) {
        boolean zH;
        zzjf zzjfVar = (zzjf) entry.getKey();
        if (zzjfVar.c() == zzmx.f8727A) {
            if (!zzjfVar.e()) {
                Object value = entry.getValue();
                if (value instanceof zzkv) {
                    return ((zzkv) value).h();
                }
                if (value instanceof zzjx) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            for (Object obj : (List) entry.getValue()) {
                if (obj instanceof zzkv) {
                    zH = ((zzkv) obj).h();
                } else {
                    if (!(obj instanceof zzjx)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                    zH = true;
                }
                if (!zH) {
                    return false;
                }
            }
        }
        return true;
    }

    public final Object clone() {
        F0 f0;
        C0581l0 c0581l0 = new C0581l0();
        int i10 = 0;
        while (true) {
            f0 = this.a;
            if (i10 >= f0.f8339s.size()) {
                break;
            }
            Map.Entry entryC = f0.c(i10);
            c0581l0.f((zzjf) entryC.getKey(), entryC.getValue());
            i10++;
        }
        for (Map.Entry entry : f0.f()) {
            c0581l0.f((zzjf) entry.getKey(), entry.getValue());
        }
        c0581l0.f8393c = this.f8393c;
        return c0581l0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0581l0) {
            return this.a.equals(((C0581l0) obj).a);
        }
        return false;
    }

    public final void f(zzjf zzjfVar, Object obj) {
        if (!zzjfVar.e()) {
            h(zzjfVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                h(zzjfVar, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzjx) {
            this.f8393c = true;
        }
        this.a.put(zzjfVar, obj);
    }

    public final void g(Map.Entry entry) {
        Object objO;
        zzjf zzjfVar = (zzjf) entry.getKey();
        Object value = entry.getValue();
        boolean z6 = value instanceof zzjx;
        boolean zE = zzjfVar.e();
        F0 f0 = this.a;
        if (zE) {
            if (z6) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object arrayList = f0.get(zzjfVar);
            if (arrayList instanceof zzjx) {
                throw new NoSuchMethodError();
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) arrayList).add(e(it.next()));
            }
            f0.put(zzjfVar, arrayList);
            return;
        }
        if (zzjfVar.c() != zzmx.f8727A) {
            if (z6) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            f0.put(zzjfVar, e(value));
            return;
        }
        Object obj = f0.get(zzjfVar);
        if (obj instanceof zzjx) {
            throw new NoSuchMethodError();
        }
        if (obj == null) {
            f0.put(zzjfVar, e(value));
            if (z6) {
                this.f8393c = true;
                return;
            }
            return;
        }
        if (z6) {
            throw new NoSuchMethodError();
        }
        if (obj instanceof zzky) {
            objO = zzjfVar.m2b();
        } else {
            ((zzkt) obj).c();
            objO = zzjfVar.m1b().o();
        }
        f0.put(zzjfVar, objO);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final Iterator j() {
        F0 f0 = this.a;
        if (f0.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (!this.f8393c) {
            return ((androidx.datastore.preferences.protobuf.i0) f0.entrySet()).iterator();
        }
        Iterator it = ((androidx.datastore.preferences.protobuf.i0) f0.entrySet()).iterator();
        C0592r0 c0592r0 = new C0592r0();
        c0592r0.f8411s = it;
        return c0592r0;
    }

    public final void k() {
        F0 f0;
        if (this.f8392b) {
            return;
        }
        int i10 = 0;
        while (true) {
            f0 = this.a;
            if (i10 >= f0.f8339s.size()) {
                break;
            }
            Map.Entry entryC = f0.c(i10);
            if (entryC.getValue() instanceof zzjk) {
                ((zzjk) entryC.getValue()).w();
            }
            i10++;
        }
        if (!f0.f8341u) {
            for (int i11 = 0; i11 < f0.f8339s.size(); i11++) {
                Map.Entry entryC2 = f0.c(i11);
                if (((zzjf) entryC2.getKey()).e()) {
                    entryC2.setValue(Collections.unmodifiableList((List) entryC2.getValue()));
                }
            }
            for (Map.Entry entry : f0.f()) {
                if (((zzjf) entry.getKey()).e()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        if (!f0.f8341u) {
            f0.f8340t = f0.f8340t.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(f0.f8340t);
            f0.f8343w = f0.f8343w.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(f0.f8343w);
            f0.f8341u = true;
        }
        this.f8392b = true;
    }

    public final boolean l() {
        int i10 = 0;
        while (true) {
            F0 f0 = this.a;
            if (i10 >= f0.f8339s.size()) {
                Iterator it = f0.f().iterator();
                while (it.hasNext()) {
                    if (!i((Map.Entry) it.next())) {
                        break;
                    }
                }
                return true;
            }
            if (!i(f0.c(i10))) {
                break;
            }
            i10++;
        }
        return false;
    }

    public C0581l0(int i10) {
        k();
        k();
    }
}
