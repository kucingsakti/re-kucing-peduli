package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class zzbc extends zzay {
    public zzbc() {
        this.a.add(zzbv.APPLY);
        this.a.add(zzbv.BLOCK);
        this.a.add(zzbv.BREAK);
        this.a.add(zzbv.CASE);
        this.a.add(zzbv.DEFAULT);
        this.a.add(zzbv.CONTINUE);
        this.a.add(zzbv.DEFINE_FUNCTION);
        this.a.add(zzbv.FN);
        this.a.add(zzbv.IF);
        this.a.add(zzbv.QUOTE);
        this.a.add(zzbv.RETURN);
        this.a.add(zzbv.SWITCH);
        this.a.add(zzbv.TERNARY);
    }

    public static zzar c(zzh zzhVar, ArrayList arrayList) {
        zzg.j(zzbv.FN, 2, arrayList);
        zzaq zzaqVarA = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
        zzaq zzaqVarA2 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
        if (!(zzaqVarA2 instanceof zzaf)) {
            throw new IllegalArgumentException(E0.a.h("FN requires an ArrayValue of parameter names found ", zzaqVarA2.getClass().getCanonicalName()));
        }
        ArrayList arrayListZ = ((zzaf) zzaqVarA2).z();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new zzar(zzaqVarA.f(), arrayListZ, arrayList2, zzhVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:98:0x00ab A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq a(String str, zzh zzhVar, ArrayList arrayList) {
        zzaq zzaqVarA;
        switch (AbstractC0570g.a[zzg.b(str).ordinal()]) {
            case 1:
                zzg.e(zzbv.APPLY, 3, arrayList);
                zzaq zzaqVarA2 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                String strF = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1)).f();
                zzaq zzaqVarA3 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(2));
                if (!(zzaqVarA3 instanceof zzaf)) {
                    throw new IllegalArgumentException(E0.a.h("Function arguments for Apply are not a list found ", zzaqVarA3.getClass().getCanonicalName()));
                }
                if (strF.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                return zzaqVarA2.o(strF, zzhVar, ((zzaf) zzaqVarA3).z());
            case 2:
                return zzhVar.d().a(new zzaf(arrayList));
            case 3:
                zzg.e(zzbv.BREAK, 0, arrayList);
                return zzaq.f8467l;
            case 4:
            case 5:
                if (!arrayList.isEmpty()) {
                    zzaq zzaqVarA4 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                    if (zzaqVarA4 instanceof zzaf) {
                        return zzhVar.a((zzaf) zzaqVarA4);
                    }
                }
                return zzaq.f8465i;
            case 6:
                zzg.e(zzbv.BREAK, 0, arrayList);
                return zzaq.f8466k;
            case 7:
                zzg.j(zzbv.DEFINE_FUNCTION, 2, arrayList);
                zzar zzarVarC = c(zzhVar, arrayList);
                String str2 = zzarVarC.f8462s;
                if (str2 == null) {
                    zzhVar.g("", zzarVarC);
                    return zzarVarC;
                }
                zzhVar.g(str2, zzarVarC);
                return zzarVarC;
            case 8:
                return c(zzhVar, arrayList);
            case 9:
                zzg.j(zzbv.IF, 2, arrayList);
                zzaq zzaqVarA5 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                zzaq zzaqVarA6 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
                zzaq zzaqVarA7 = arrayList.size() > 2 ? zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(2)) : null;
                zzaq zzaqVar = zzaq.f8465i;
                zzaq zzaqVarA8 = zzaqVarA5.d().booleanValue() ? zzhVar.a((zzaf) zzaqVarA6) : zzaqVarA7 != null ? zzhVar.a((zzaf) zzaqVarA7) : zzaqVar;
                return zzaqVarA8 instanceof zzaj ? zzaqVarA8 : zzaqVar;
            case 10:
                return new zzaf(arrayList);
            case 11:
                if (arrayList.isEmpty()) {
                    return zzaq.f8468m;
                }
                zzg.e(zzbv.RETURN, 1, arrayList);
                return new zzaj("return", zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)));
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                zzg.e(zzbv.SWITCH, 3, arrayList);
                zzaq zzaqVarA9 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                zzaq zzaqVarA10 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
                zzaq zzaqVarA11 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(2));
                if (!(zzaqVarA10 instanceof zzaf)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                }
                if (!(zzaqVarA11 instanceof zzaf)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
                zzaf zzafVar = (zzaf) zzaqVarA10;
                zzaf zzafVar2 = (zzaf) zzaqVarA11;
                boolean z6 = false;
                for (int i10 = 0; i10 < zzafVar.s(); i10++) {
                    if (z6) {
                        zzaqVarA = zzhVar.f8658b.a(zzhVar, zzafVar2.q(i10));
                        if (zzaqVarA instanceof zzaj) {
                            if (!((zzaj) zzaqVarA).f8461t.equals("break")) {
                                return zzaqVarA;
                            }
                            return zzaq.f8465i;
                        }
                        z6 = true;
                    } else if (zzaqVarA9.equals(zzhVar.f8658b.a(zzhVar, zzafVar.q(i10)))) {
                        zzaqVarA = zzhVar.f8658b.a(zzhVar, zzafVar2.q(i10));
                        if (zzaqVarA instanceof zzaj) {
                            if (!((zzaj) zzaqVarA).f8461t.equals("break")) {
                                return zzaqVarA;
                            }
                            return zzaq.f8465i;
                        }
                        z6 = true;
                    } else {
                        continue;
                    }
                }
                if (zzafVar.s() + 1 == zzafVar2.s()) {
                    zzaq zzaqVarA12 = zzhVar.f8658b.a(zzhVar, zzafVar2.q(zzafVar.s()));
                    if (zzaqVarA12 instanceof zzaj) {
                        String str3 = ((zzaj) zzaqVarA12).f8461t;
                        if (str3.equals("return") || str3.equals("continue")) {
                            return zzaqVarA12;
                        }
                    }
                }
                return zzaq.f8465i;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                zzg.e(zzbv.TERNARY, 3, arrayList);
                if (zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0)).d().booleanValue()) {
                    return zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
                }
                return zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(2));
            default:
                b(str);
                throw null;
        }
    }
}
