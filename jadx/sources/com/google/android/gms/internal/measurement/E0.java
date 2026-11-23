package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public abstract class E0 {
    public static void A(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        boolean z10 = list instanceof C0594s0;
        int i11 = 0;
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c0569f0.u(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            c0569f0.x(i10, 2);
            int iE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iE += zzit.e(((Long) list.get(i12)).longValue());
            }
            c0569f0.w(iE);
            while (i11 < list.size()) {
                c0569f0.v(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C0594s0 c0594s0 = (C0594s0) list;
        if (!z6) {
            while (i11 < c0594s0.f8415u) {
                c0569f0.u(i10, c0594s0.G(i11));
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int iE2 = 0;
        for (int i13 = 0; i13 < c0594s0.f8415u; i13++) {
            iE2 += zzit.e(c0594s0.G(i13));
        }
        c0569f0.w(iE2);
        while (i11 < c0594s0.f8415u) {
            c0569f0.v(c0594s0.G(i11));
            i11++;
        }
    }

    public static zzkn a(Object obj, Object obj2) {
        zzkn zzknVarC = (zzkn) obj;
        zzkn zzknVar = (zzkn) obj2;
        if (!zzknVar.isEmpty()) {
            if (!zzknVarC.f8697s) {
                zzknVarC = zzknVarC.c();
            }
            zzknVarC.e();
            if (!zzknVar.isEmpty()) {
                zzknVarC.putAll(zzknVar);
            }
        }
        return zzknVarC;
    }

    public static String b(zzia zziaVar) {
        StringBuilder sb = new StringBuilder(zziaVar.n());
        for (int i10 = 0; i10 < zziaVar.n(); i10++) {
            byte bD = zziaVar.d(i10);
            if (bD == 34) {
                sb.append("\\\"");
            } else if (bD == 39) {
                sb.append("\\'");
            } else if (bD != 92) {
                switch (bD) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                        sb.append("\\f");
                        break;
                    case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                        sb.append("\\r");
                        break;
                    default:
                        if (bD < 32 || bD > 126) {
                            sb.append('\\');
                            sb.append((char) (((bD >>> 6) & 3) + 48));
                            sb.append((char) (((bD >>> 3) & 7) + 48));
                            sb.append((char) ((bD & 7) + 48));
                        } else {
                            sb.append((char) bD);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void c(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        if (list instanceof Z) {
            throw new ClassCastException();
        }
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                c0569f0.p(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = zzit.f8671b;
            i12++;
        }
        c0569f0.w(i12);
        while (i11 < list.size()) {
            c0569f0.j(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void d(C0577j0 c0577j0, Object obj, Object obj2) {
        F0 f0;
        c0577j0.getClass();
        C0581l0 c0581l0 = ((zzjk.zzd) obj2).zzc;
        if (c0581l0.a.isEmpty()) {
            return;
        }
        C0581l0 c0581l0Z = ((zzjk.zzd) obj).z();
        c0581l0Z.getClass();
        int i10 = 0;
        while (true) {
            f0 = c0581l0.a;
            if (i10 >= f0.f8339s.size()) {
                break;
            }
            c0581l0Z.g(f0.c(i10));
            i10++;
        }
        Iterator it = f0.f().iterator();
        while (it.hasNext()) {
            c0581l0Z.g((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void e(Object obj, Object obj2) {
        zzjk zzjkVar = (zzjk) obj;
        zzme zzmeVar = zzjkVar.zzb;
        zzme zzmeVar2 = ((zzjk) obj2).zzb;
        zzme zzmeVar3 = zzme.f8702f;
        if (!zzmeVar3.equals(zzmeVar2)) {
            if (zzmeVar3.equals(zzmeVar)) {
                int i10 = zzmeVar.a + zzmeVar2.a;
                int[] iArrCopyOf = Arrays.copyOf(zzmeVar.f8703b, i10);
                System.arraycopy(zzmeVar2.f8703b, 0, iArrCopyOf, zzmeVar.a, zzmeVar2.a);
                Object[] objArrCopyOf = Arrays.copyOf(zzmeVar.f8704c, i10);
                System.arraycopy(zzmeVar2.f8704c, 0, objArrCopyOf, zzmeVar.a, zzmeVar2.a);
                zzmeVar = new zzme(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                zzmeVar.getClass();
                if (!zzmeVar2.equals(zzmeVar3)) {
                    if (!zzmeVar.f8706e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = zzmeVar.a + zzmeVar2.a;
                    zzmeVar.b(i11);
                    System.arraycopy(zzmeVar2.f8703b, 0, zzmeVar.f8703b, zzmeVar.a, zzmeVar2.a);
                    System.arraycopy(zzmeVar2.f8704c, 0, zzmeVar.f8704c, zzmeVar.a, zzmeVar2.a);
                    zzmeVar.a = i11;
                }
            }
        }
        zzjkVar.zzb = zzmeVar;
    }

    public static boolean f(byte b3) {
        return b3 > -65;
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int h(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0589p0)) {
            int iE = 0;
            while (i10 < size) {
                iE += zzit.e(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iE;
        }
        C0589p0 c0589p0 = (C0589p0) list;
        int iE2 = 0;
        while (i10 < size) {
            iE2 += zzit.e(c0589p0.d(i10));
            i10++;
        }
        return iE2;
    }

    public static void i(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        if (list instanceof AbstractC0571g0) {
            throw new ClassCastException();
        }
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                c0569f0.getClass();
                c0569f0.m(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = zzit.f8671b;
            i12 += 8;
        }
        c0569f0.w(i12);
        while (i11 < list.size()) {
            c0569f0.q(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void j(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        boolean z10 = list instanceof C0589p0;
        int i11 = 0;
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c0569f0.t(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c0569f0.x(i10, 2);
            int iE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iE += zzit.e(((Integer) list.get(i12)).intValue());
            }
            c0569f0.w(iE);
            while (i11 < list.size()) {
                c0569f0.s(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C0589p0 c0589p0 = (C0589p0) list;
        if (!z6) {
            while (i11 < c0589p0.f8401u) {
                c0569f0.t(i10, c0589p0.d(i11));
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int iE2 = 0;
        for (int i13 = 0; i13 < c0589p0.f8401u; i13++) {
            iE2 += zzit.e(c0589p0.d(i13));
        }
        c0569f0.w(iE2);
        while (i11 < c0589p0.f8401u) {
            c0569f0.s(c0589p0.d(i11));
            i11++;
        }
    }

    public static void k(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        boolean z10 = list instanceof C0589p0;
        int i11 = 0;
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c0569f0.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c0569f0.x(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                Logger logger = zzit.f8671b;
                i12 += 4;
            }
            c0569f0.w(i12);
            while (i11 < list.size()) {
                c0569f0.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C0589p0 c0589p0 = (C0589p0) list;
        if (!z6) {
            while (i11 < c0589p0.f8401u) {
                c0569f0.l(i10, c0589p0.d(i11));
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c0589p0.f8401u; i15++) {
            c0589p0.d(i15);
            Logger logger2 = zzit.f8671b;
            i14 += 4;
        }
        c0569f0.w(i14);
        while (i11 < c0589p0.f8401u) {
            c0569f0.k(c0589p0.d(i11));
            i11++;
        }
    }

    public static int l(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0589p0)) {
            int iE = 0;
            while (i10 < size) {
                iE += zzit.e(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iE;
        }
        C0589p0 c0589p0 = (C0589p0) list;
        int iE2 = 0;
        while (i10 < size) {
            iE2 += zzit.e(c0589p0.d(i10));
            i10++;
        }
        return iE2;
    }

    public static void m(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        boolean z10 = list instanceof C0594s0;
        int i11 = 0;
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c0569f0.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            c0569f0.x(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                Logger logger = zzit.f8671b;
                i12 += 8;
            }
            c0569f0.w(i12);
            while (i11 < list.size()) {
                c0569f0.q(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C0594s0 c0594s0 = (C0594s0) list;
        if (!z6) {
            while (i11 < c0594s0.f8415u) {
                c0569f0.m(i10, c0594s0.G(i11));
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c0594s0.f8415u; i15++) {
            c0594s0.G(i15);
            Logger logger2 = zzit.f8671b;
            i14 += 8;
        }
        c0569f0.w(i14);
        while (i11 < c0594s0.f8415u) {
            c0569f0.q(c0594s0.G(i11));
            i11++;
        }
    }

    public static int n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0594s0)) {
            int iE = 0;
            while (i10 < size) {
                iE += zzit.e(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iE;
        }
        C0594s0 c0594s0 = (C0594s0) list;
        int iE2 = 0;
        while (i10 < size) {
            iE2 += zzit.e(c0594s0.G(i10));
            i10++;
        }
        return iE2;
    }

    public static void o(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        if (list instanceof AbstractC0585n0) {
            throw new ClassCastException();
        }
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        int i11 = 0;
        if (!z6) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                c0569f0.getClass();
                c0569f0.l(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = zzit.f8671b;
            i12 += 4;
        }
        c0569f0.w(i12);
        while (i11 < list.size()) {
            c0569f0.k(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static int p(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0589p0)) {
            int iG = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iG += zzit.g((iIntValue >> 31) ^ (iIntValue << 1));
                i10++;
            }
            return iG;
        }
        C0589p0 c0589p0 = (C0589p0) list;
        int iG2 = 0;
        while (i10 < size) {
            int iD = c0589p0.d(i10);
            iG2 += zzit.g((iD >> 31) ^ (iD << 1));
            i10++;
        }
        return iG2;
    }

    public static void q(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        boolean z10 = list instanceof C0589p0;
        int i11 = 0;
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c0569f0.t(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c0569f0.x(i10, 2);
            int iE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iE += zzit.e(((Integer) list.get(i12)).intValue());
            }
            c0569f0.w(iE);
            while (i11 < list.size()) {
                c0569f0.s(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C0589p0 c0589p0 = (C0589p0) list;
        if (!z6) {
            while (i11 < c0589p0.f8401u) {
                c0569f0.t(i10, c0589p0.d(i11));
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int iE2 = 0;
        for (int i13 = 0; i13 < c0589p0.f8401u; i13++) {
            iE2 += zzit.e(c0589p0.d(i13));
        }
        c0569f0.w(iE2);
        while (i11 < c0589p0.f8401u) {
            c0569f0.s(c0589p0.d(i11));
            i11++;
        }
    }

    public static int r(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0594s0)) {
            int iE = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iE += zzit.e((jLongValue >> 63) ^ (jLongValue << 1));
                i10++;
            }
            return iE;
        }
        C0594s0 c0594s0 = (C0594s0) list;
        int iE2 = 0;
        while (i10 < size) {
            long jG = c0594s0.G(i10);
            iE2 += zzit.e((jG >> 63) ^ (jG << 1));
            i10++;
        }
        return iE2;
    }

    public static void s(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        boolean z10 = list instanceof C0594s0;
        int i11 = 0;
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c0569f0.u(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            c0569f0.x(i10, 2);
            int iE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iE += zzit.e(((Long) list.get(i12)).longValue());
            }
            c0569f0.w(iE);
            while (i11 < list.size()) {
                c0569f0.v(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C0594s0 c0594s0 = (C0594s0) list;
        if (!z6) {
            while (i11 < c0594s0.f8415u) {
                c0569f0.u(i10, c0594s0.G(i11));
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int iE2 = 0;
        for (int i13 = 0; i13 < c0594s0.f8415u; i13++) {
            iE2 += zzit.e(c0594s0.G(i13));
        }
        c0569f0.w(iE2);
        while (i11 < c0594s0.f8415u) {
            c0569f0.v(c0594s0.G(i11));
            i11++;
        }
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0589p0)) {
            int iG = 0;
            while (i10 < size) {
                iG += zzit.g(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iG;
        }
        C0589p0 c0589p0 = (C0589p0) list;
        int iG2 = 0;
        while (i10 < size) {
            iG2 += zzit.g(c0589p0.d(i10));
            i10++;
        }
        return iG2;
    }

    public static void u(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        boolean z10 = list instanceof C0589p0;
        int i11 = 0;
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c0569f0.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c0569f0.x(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                Logger logger = zzit.f8671b;
                i12 += 4;
            }
            c0569f0.w(i12);
            while (i11 < list.size()) {
                c0569f0.k(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C0589p0 c0589p0 = (C0589p0) list;
        if (!z6) {
            while (i11 < c0589p0.f8401u) {
                c0569f0.l(i10, c0589p0.d(i11));
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c0589p0.f8401u; i15++) {
            c0589p0.d(i15);
            Logger logger2 = zzit.f8671b;
            i14 += 4;
        }
        c0569f0.w(i14);
        while (i11 < c0589p0.f8401u) {
            c0569f0.k(c0589p0.d(i11));
            i11++;
        }
    }

    public static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0594s0)) {
            int iE = 0;
            while (i10 < size) {
                iE += zzit.e(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iE;
        }
        C0594s0 c0594s0 = (C0594s0) list;
        int iE2 = 0;
        while (i10 < size) {
            iE2 += zzit.e(c0594s0.G(i10));
            i10++;
        }
        return iE2;
    }

    public static void w(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        boolean z10 = list instanceof C0594s0;
        int i11 = 0;
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c0569f0.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            c0569f0.x(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                Logger logger = zzit.f8671b;
                i12 += 8;
            }
            c0569f0.w(i12);
            while (i11 < list.size()) {
                c0569f0.q(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C0594s0 c0594s0 = (C0594s0) list;
        if (!z6) {
            while (i11 < c0594s0.f8415u) {
                c0569f0.m(i10, c0594s0.G(i11));
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c0594s0.f8415u; i15++) {
            c0594s0.G(i15);
            Logger logger2 = zzit.f8671b;
            i14 += 8;
        }
        c0569f0.w(i14);
        while (i11 < c0594s0.f8415u) {
            c0569f0.q(c0594s0.G(i11));
            i11++;
        }
    }

    public static void x(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        boolean z10 = list instanceof C0589p0;
        int i11 = 0;
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    c0569f0.y(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                    i11++;
                }
                return;
            }
            c0569f0.x(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iG += zzit.g((iIntValue2 >> 31) ^ (iIntValue2 << 1));
            }
            c0569f0.w(iG);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                c0569f0.w((iIntValue3 >> 31) ^ (iIntValue3 << 1));
                i11++;
            }
            return;
        }
        C0589p0 c0589p0 = (C0589p0) list;
        if (!z6) {
            while (i11 < c0589p0.f8401u) {
                int iD = c0589p0.d(i11);
                c0569f0.y(i10, (iD >> 31) ^ (iD << 1));
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < c0589p0.f8401u; i13++) {
            int iD2 = c0589p0.d(i13);
            iG2 += zzit.g((iD2 >> 31) ^ (iD2 << 1));
        }
        c0569f0.w(iG2);
        while (i11 < c0589p0.f8401u) {
            int iD3 = c0589p0.d(i11);
            c0569f0.w((iD3 >> 31) ^ (iD3 << 1));
            i11++;
        }
    }

    public static void y(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        boolean z10 = list instanceof C0594s0;
        int i11 = 0;
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    c0569f0.u(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                    i11++;
                }
                return;
            }
            c0569f0.x(i10, 2);
            int iE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iE += zzit.e((jLongValue2 >> 63) ^ (jLongValue2 << 1));
            }
            c0569f0.w(iE);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                c0569f0.v((jLongValue3 >> 63) ^ (jLongValue3 << 1));
                i11++;
            }
            return;
        }
        C0594s0 c0594s0 = (C0594s0) list;
        if (!z6) {
            while (i11 < c0594s0.f8415u) {
                long jG = c0594s0.G(i11);
                c0569f0.u(i10, (jG >> 63) ^ (jG << 1));
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int iE2 = 0;
        for (int i13 = 0; i13 < c0594s0.f8415u; i13++) {
            long jG2 = c0594s0.G(i13);
            iE2 += zzit.e((jG2 >> 63) ^ (jG2 << 1));
        }
        c0569f0.w(iE2);
        while (i11 < c0594s0.f8415u) {
            long jG3 = c0594s0.G(i11);
            c0569f0.v((jG3 >> 63) ^ (jG3 << 1));
            i11++;
        }
    }

    public static void z(int i10, List list, t0 t0Var, boolean z6) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t0Var.getClass();
        boolean z10 = list instanceof C0589p0;
        int i11 = 0;
        C0569f0 c0569f0 = (C0569f0) t0Var.a;
        if (!z10) {
            if (!z6) {
                while (i11 < list.size()) {
                    c0569f0.y(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            c0569f0.x(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG += zzit.g(((Integer) list.get(i12)).intValue());
            }
            c0569f0.w(iG);
            while (i11 < list.size()) {
                c0569f0.w(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C0589p0 c0589p0 = (C0589p0) list;
        if (!z6) {
            while (i11 < c0589p0.f8401u) {
                c0569f0.y(i10, c0589p0.d(i11));
                i11++;
            }
            return;
        }
        c0569f0.x(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < c0589p0.f8401u; i13++) {
            iG2 += zzit.g(c0589p0.d(i13));
        }
        c0569f0.w(iG2);
        while (i11 < c0589p0.f8401u) {
            c0569f0.w(c0589p0.d(i11));
            i11++;
        }
    }
}
