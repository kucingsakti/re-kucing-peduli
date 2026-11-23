package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y0 implements D0 {
    public final zzkt a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8445b;

    public y0(zzkt zzktVar) {
        this.f8445b = zzktVar instanceof zzjk.zzd;
        this.a = zzktVar;
    }

    @Override // com.google.android.gms.internal.measurement.D0
    public final boolean a(zzjk zzjkVar, zzjk zzjkVar2) {
        if (!zzjkVar.zzb.equals(zzjkVar2.zzb)) {
            return false;
        }
        if (this.f8445b) {
            return ((zzjk.zzd) zzjkVar).zzc.equals(((zzjk.zzd) zzjkVar2).zzc);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.D0
    public final Object b() {
        zzkt zzktVar = this.a;
        return zzktVar instanceof zzjk ? (zzjk) ((zzjk) zzktVar).q(4) : zzktVar.i().l();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094 A[EDGE_INSN: B:52:0x0094->B:34:0x0094 BREAK  A[LOOP:1: B:19:0x0057->B:57:0x0057], SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.D0
    public final void c(Object obj, byte[] bArr, int i10, int i11, X x8) throws zzjs {
        zzjk zzjkVar = (zzjk) obj;
        zzme zzmeVarE = zzjkVar.zzb;
        if (zzmeVarE == zzme.f8702f) {
            zzmeVarE = zzme.e();
            zzjkVar.zzb = zzmeVarE;
        }
        zzme zzmeVar = zzmeVarE;
        ((zzjk.zzd) obj).z();
        int iA = i10;
        zzjk.zzf zzfVar = null;
        while (iA < i11) {
            zzjk.zzf zzfVarA = zzfVar;
            int i12 = Y.i(bArr, iA, x8);
            int i13 = x8.a;
            zzkt zzktVar = this.a;
            zzix zzixVar = x8.f8368d;
            if (i13 == 11) {
                int i14 = 0;
                zzia zziaVar = null;
                while (i12 < i11) {
                    i12 = Y.i(bArr, i12, x8);
                    int i15 = x8.a;
                    int i16 = i15 >>> 3;
                    int i17 = i15 & 7;
                    if (i16 == 2) {
                        if (i17 != 0) {
                            if (i15 != 12) {
                                break;
                                break;
                            }
                            i12 = Y.a(i15, bArr, i12, i11, x8);
                        } else {
                            i12 = Y.i(bArr, i12, x8);
                            i14 = x8.a;
                            zzfVarA = zzixVar.a(zzktVar, i14);
                        }
                    } else {
                        if (i16 == 3) {
                            if (zzfVarA != null) {
                                B0 b3 = B0.f8333c;
                                throw new NoSuchMethodError();
                            }
                            if (i17 == 2) {
                                i12 = Y.g(bArr, i12, x8);
                                zziaVar = (zzia) x8.f8367c;
                            }
                        }
                        if (i15 != 12) {
                            break;
                        } else {
                            i12 = Y.a(i15, bArr, i12, i11, x8);
                        }
                    }
                }
                if (zziaVar != null) {
                    zzmeVar.c((i14 << 3) | 2, zziaVar);
                }
                iA = i12;
            } else if ((i13 & 7) == 2) {
                zzfVarA = zzixVar.a(zzktVar, i13 >>> 3);
                if (zzfVarA != null) {
                    B0 b7 = B0.f8333c;
                    throw new NoSuchMethodError();
                }
                iA = Y.c(i13, bArr, i12, i11, zzmeVar, x8);
            } else {
                iA = Y.a(i13, bArr, i12, i11, x8);
            }
            zzfVar = zzfVarA;
        }
        if (iA != i11) {
            throw zzjs.d();
        }
    }

    @Override // com.google.android.gms.internal.measurement.D0
    public final int d(zzjk zzjkVar) {
        int iHashCode = zzjkVar.zzb.hashCode();
        if (!this.f8445b) {
            return iHashCode;
        }
        return ((zzjk.zzd) zzjkVar).zzc.a.hashCode() + (iHashCode * 53);
    }

    @Override // com.google.android.gms.internal.measurement.D0
    public final boolean e(Object obj) {
        return ((zzjk.zzd) obj).zzc.l();
    }

    @Override // com.google.android.gms.internal.measurement.D0
    public final void f(Object obj, Object obj2) {
        E0.e(obj, obj2);
        if (this.f8445b) {
            E0.d(AbstractC0575i0.a, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.D0
    public final void g(Object obj) {
        zzme zzmeVar = ((zzjk) obj).zzb;
        if (zzmeVar.f8706e) {
            zzmeVar.f8706e = false;
        }
        ((zzjk.zzd) obj).zzc.k();
    }

    @Override // com.google.android.gms.internal.measurement.D0
    public final void h(Object obj, t0 t0Var) {
        Iterator itJ = ((zzjk.zzd) obj).zzc.j();
        while (itJ.hasNext()) {
            Map.Entry entry = (Map.Entry) itJ.next();
            zzjf zzjfVar = (zzjf) entry.getKey();
            if (zzjfVar.c() != zzmx.f8727A || zzjfVar.e() || zzjfVar.d()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C0591q0) {
                t0Var.c(zzjfVar.b(), ((zzjx) ((C0591q0) entry).f8406s.getValue()).b());
            } else {
                t0Var.c(zzjfVar.b(), entry.getValue());
            }
        }
        zzme zzmeVar = ((zzjk) obj).zzb;
        zzmeVar.getClass();
        t0Var.getClass();
        for (int i10 = 0; i10 < zzmeVar.a; i10++) {
            t0Var.c(zzmeVar.f8703b[i10] >>> 3, zzmeVar.f8704c[i10]);
        }
    }

    @Override // com.google.android.gms.internal.measurement.D0
    public final int i(zzhq zzhqVar) {
        F0 f0;
        zzme zzmeVar = ((zzjk) zzhqVar).zzb;
        int iD = zzmeVar.f8705d;
        int i10 = 0;
        if (iD == -1) {
            iD = 0;
            for (int i11 = 0; i11 < zzmeVar.a; i11++) {
                int i12 = zzmeVar.f8703b[i11] >>> 3;
                iD += zzit.d(3, (zzia) zzmeVar.f8704c[i11]) + zzit.h(2, i12) + (zzit.g(8) << 1);
            }
            zzmeVar.f8705d = iD;
        }
        if (!this.f8445b) {
            return iD;
        }
        C0581l0 c0581l0 = ((zzjk.zzd) zzhqVar).zzc;
        int iD2 = 0;
        while (true) {
            f0 = c0581l0.a;
            if (i10 >= f0.f8339s.size()) {
                break;
            }
            iD2 += C0581l0.d(f0.c(i10));
            i10++;
        }
        Iterator it = f0.f().iterator();
        while (it.hasNext()) {
            iD2 += C0581l0.d((Map.Entry) it.next());
        }
        return iD + iD2;
    }
}
