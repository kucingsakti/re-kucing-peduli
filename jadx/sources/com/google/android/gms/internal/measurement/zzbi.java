package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zzbi extends zzay {
    public zzbi() {
        this.a.add(zzbv.FOR_IN);
        this.a.add(zzbv.FOR_IN_CONST);
        this.a.add(zzbv.FOR_IN_LET);
        this.a.add(zzbv.FOR_LET);
        this.a.add(zzbv.FOR_OF);
        this.a.add(zzbv.FOR_OF_CONST);
        this.a.add(zzbv.FOR_OF_LET);
        this.a.add(zzbv.WHILE);
    }

    public static zzaq c(InterfaceC0578k interfaceC0578k, Iterator it, zzaq zzaqVar) {
        if (it != null) {
            while (it.hasNext()) {
                zzaq zzaqVarA = interfaceC0578k.h((zzaq) it.next()).a((zzaf) zzaqVar);
                if (zzaqVarA instanceof zzaj) {
                    zzaj zzajVar = (zzaj) zzaqVarA;
                    if ("break".equals(zzajVar.f8461t)) {
                        return zzaq.f8465i;
                    }
                    if ("return".equals(zzajVar.f8461t)) {
                        return zzajVar;
                    }
                }
            }
        }
        return zzaq.f8465i;
    }

    public static zzaq d(InterfaceC0578k interfaceC0578k, zzaq zzaqVar, zzaq zzaqVar2) {
        if (zzaqVar instanceof Iterable) {
            return c(interfaceC0578k, ((Iterable) zzaqVar).iterator(), zzaqVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Code duplicated, block: B:112:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x007e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0089  */
    /* JADX WARN: Code duplicated, block: B:21:0x0093  */
    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq a(String str, zzh zzhVar, ArrayList arrayList) {
        zzaq zzaqVarA;
        zzaj zzajVar;
        switch (AbstractC0576j.a[zzg.b(str).ordinal()]) {
            case 1:
                zzg.e(zzbv.FOR_IN, 3, arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                String strF = ((zzaq) arrayList.get(0)).f();
                zzaq zzaqVarA2 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
                zzaq zzaqVarA3 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(2));
                Iterator itG = zzaqVarA2.g();
                if (itG != null) {
                    while (itG.hasNext()) {
                        zzhVar.e(strF, (zzaq) itG.next());
                        zzaq zzaqVarA4 = zzhVar.a((zzaf) zzaqVarA3);
                        if (zzaqVarA4 instanceof zzaj) {
                            zzaj zzajVar2 = (zzaj) zzaqVarA4;
                            if ("break".equals(zzajVar2.f8461t)) {
                                return zzaq.f8465i;
                            }
                            if ("return".equals(zzajVar2.f8461t)) {
                                return zzajVar2;
                            }
                        }
                    }
                }
                return zzaq.f8465i;
            case 2:
                zzg.e(zzbv.FOR_IN_CONST, 3, arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return c(new o1.r(zzhVar, 12, ((zzaq) arrayList.get(0)).f()), zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).g(), zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(2)));
            case 3:
                zzg.e(zzbv.FOR_IN_LET, 3, arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                String strF2 = ((zzaq) arrayList.get(0)).f();
                zzaq zzaqVarA5 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
                zzaq zzaqVarA6 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(2));
                Iterator itG2 = zzaqVarA5.g();
                if (itG2 != null) {
                    while (itG2.hasNext()) {
                        zzaq zzaqVar = (zzaq) itG2.next();
                        zzh zzhVarD = zzhVar.d();
                        zzhVarD.e(strF2, zzaqVar);
                        zzaq zzaqVarA7 = zzhVarD.a((zzaf) zzaqVarA6);
                        if (zzaqVarA7 instanceof zzaj) {
                            zzaj zzajVar3 = (zzaj) zzaqVarA7;
                            if ("break".equals(zzajVar3.f8461t)) {
                                return zzaq.f8465i;
                            }
                            if ("return".equals(zzajVar3.f8461t)) {
                                return zzajVar3;
                            }
                        }
                    }
                }
                return zzaq.f8465i;
            case 4:
                zzg.e(zzbv.FOR_LET, 4, arrayList);
                zzaq zzaqVarA8 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                if (!(zzaqVarA8 instanceof zzaf)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                zzaf zzafVar = (zzaf) zzaqVarA8;
                zzaq zzaqVar2 = (zzaq) arrayList.get(1);
                zzaq zzaqVar3 = (zzaq) arrayList.get(2);
                zzaq zzaqVarA9 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(3));
                zzh zzhVarD2 = zzhVar.d();
                for (int i10 = 0; i10 < zzafVar.s(); i10++) {
                    String strF3 = zzafVar.q(i10).f();
                    zzhVarD2.g(strF3, zzhVar.c(strF3));
                }
                while (zzhVar.f8658b.a(zzhVar, zzaqVar2).d().booleanValue()) {
                    zzaq zzaqVarA10 = zzhVar.a((zzaf) zzaqVarA9);
                    if (zzaqVarA10 instanceof zzaj) {
                        zzaj zzajVar4 = (zzaj) zzaqVarA10;
                        if ("break".equals(zzajVar4.f8461t)) {
                            return zzaq.f8465i;
                        }
                        if ("return".equals(zzajVar4.f8461t)) {
                            return zzajVar4;
                        }
                    }
                    zzh zzhVarD3 = zzhVar.d();
                    for (int i11 = 0; i11 < zzafVar.s(); i11++) {
                        String strF4 = zzafVar.q(i11).f();
                        zzhVarD3.g(strF4, zzhVarD2.c(strF4));
                    }
                    zzhVarD3.b(zzaqVar3);
                    zzhVarD2 = zzhVarD3;
                }
                return zzaq.f8465i;
            case 5:
                zzg.e(zzbv.FOR_OF, 3, arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return d(new o1.c(zzhVar, 13, ((zzaq) arrayList.get(0)).f()), zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)), zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(2)));
            case 6:
                zzg.e(zzbv.FOR_OF_CONST, 3, arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return d(new o1.r(zzhVar, 12, ((zzaq) arrayList.get(0)).f()), zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)), zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(2)));
            case 7:
                zzg.e(zzbv.FOR_OF_LET, 3, arrayList);
                if (!(arrayList.get(0) instanceof zzas)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return d(new S(zzhVar, ((zzaq) arrayList.get(0)).f(), 13, false), zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)), zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(2)));
            case 8:
                zzg.e(zzbv.WHILE, 4, arrayList);
                zzaq zzaqVar4 = (zzaq) arrayList.get(0);
                zzaq zzaqVar5 = (zzaq) arrayList.get(1);
                zzaq zzaqVar6 = (zzaq) arrayList.get(2);
                zzaq zzaqVarA11 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(3));
                if (zzhVar.f8658b.a(zzhVar, zzaqVar6).d().booleanValue()) {
                    zzaq zzaqVarA12 = zzhVar.a((zzaf) zzaqVarA11);
                    if (zzaqVarA12 instanceof zzaj) {
                        zzaj zzajVar5 = (zzaj) zzaqVarA12;
                        if (!"break".equals(zzajVar5.f8461t)) {
                            if ("return".equals(zzajVar5.f8461t)) {
                                return zzajVar5;
                            }
                            while (zzhVar.f8658b.a(zzhVar, zzaqVar4).d().booleanValue()) {
                                zzaqVarA = zzhVar.a((zzaf) zzaqVarA11);
                                if (zzaqVarA instanceof zzaj) {
                                    zzajVar = (zzaj) zzaqVarA;
                                    if (!"break".equals(zzajVar.f8461t)) {
                                        if ("return".equals(zzajVar.f8461t)) {
                                            return zzajVar;
                                        }
                                    }
                                }
                                zzhVar.b(zzaqVar5);
                            }
                        }
                    } else {
                        while (zzhVar.f8658b.a(zzhVar, zzaqVar4).d().booleanValue()) {
                            zzaqVarA = zzhVar.a((zzaf) zzaqVarA11);
                            if (zzaqVarA instanceof zzaj) {
                                zzajVar = (zzaj) zzaqVarA;
                                if (!"break".equals(zzajVar.f8461t)) {
                                    if ("return".equals(zzajVar.f8461t)) {
                                        return zzajVar;
                                    }
                                }
                            }
                            zzhVar.b(zzaqVar5);
                        }
                    }
                } else {
                    while (zzhVar.f8658b.a(zzhVar, zzaqVar4).d().booleanValue()) {
                        zzaqVarA = zzhVar.a((zzaf) zzaqVarA11);
                        if (zzaqVarA instanceof zzaj) {
                            zzajVar = (zzaj) zzaqVarA;
                            if (!"break".equals(zzajVar.f8461t)) {
                                if ("return".equals(zzajVar.f8461t)) {
                                    return zzajVar;
                                }
                            }
                        }
                        zzhVar.b(zzaqVar5);
                    }
                }
                return zzaq.f8465i;
            default:
                b(str);
                throw null;
        }
    }
}
