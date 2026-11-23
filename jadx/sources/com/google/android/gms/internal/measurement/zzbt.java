package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class zzbt extends zzay {
    public zzbt() {
        this.a.add(zzbv.ASSIGN);
        this.a.add(zzbv.CONST);
        this.a.add(zzbv.CREATE_ARRAY);
        this.a.add(zzbv.CREATE_OBJECT);
        this.a.add(zzbv.EXPRESSION_LIST);
        this.a.add(zzbv.GET);
        this.a.add(zzbv.GET_INDEX);
        this.a.add(zzbv.GET_PROPERTY);
        this.a.add(zzbv.NULL);
        this.a.add(zzbv.SET_PROPERTY);
        this.a.add(zzbv.TYPEOF);
        this.a.add(zzbv.UNDEFINED);
        this.a.add(zzbv.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.zzay
    public final zzaq a(String str, zzh zzhVar, ArrayList arrayList) {
        String str2;
        int i10 = 0;
        switch (AbstractC0582m.a[zzg.b(str).ordinal()]) {
            case 1:
                zzg.e(zzbv.ASSIGN, 2, arrayList);
                zzaq zzaqVarA = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                if (!(zzaqVarA instanceof zzas)) {
                    throw new IllegalArgumentException(E0.a.h("Expected string for assign var. got ", zzaqVarA.getClass().getCanonicalName()));
                }
                zzas zzasVar = (zzas) zzaqVarA;
                boolean zF = zzhVar.f(zzasVar.f8475s);
                String str3 = zzasVar.f8475s;
                if (!zF) {
                    throw new IllegalArgumentException(E0.a.h("Attempting to assign undefined value ", str3));
                }
                zzaq zzaqVarA2 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
                zzhVar.g(str3, zzaqVarA2);
                return zzaqVarA2;
            case 2:
                zzg.j(zzbv.CONST, 2, arrayList);
                if (arrayList.size() % 2 != 0) {
                    throw new IllegalArgumentException(AbstractC0487g.g(arrayList.size(), "CONST requires an even number of arguments, found "));
                }
                while (i10 < arrayList.size() - 1) {
                    zzaq zzaqVarA3 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(i10));
                    if (!(zzaqVarA3 instanceof zzas)) {
                        throw new IllegalArgumentException(E0.a.h("Expected string for const name. got ", zzaqVarA3.getClass().getCanonicalName()));
                    }
                    String str4 = ((zzas) zzaqVarA3).f8475s;
                    zzhVar.e(str4, zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(i10 + 1)));
                    zzhVar.f8660d.put(str4, Boolean.TRUE);
                    i10 += 2;
                }
                return zzaq.f8465i;
            case 3:
                if (arrayList.isEmpty()) {
                    return new zzaf();
                }
                zzaf zzafVar = new zzaf();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzaq zzaqVarA4 = zzhVar.f8658b.a(zzhVar, (zzaq) it.next());
                    if (zzaqVarA4 instanceof zzaj) {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                    zzafVar.w(i10, zzaqVarA4);
                    i10++;
                }
                return zzafVar;
            case 4:
                if (arrayList.isEmpty()) {
                    return new zzap();
                }
                if (arrayList.size() % 2 != 0) {
                    throw new IllegalArgumentException(AbstractC0487g.g(arrayList.size(), "CREATE_OBJECT requires an even number of arguments, found "));
                }
                zzap zzapVar = new zzap();
                while (i10 < arrayList.size() - 1) {
                    zzaq zzaqVarA5 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(i10));
                    zzaq zzaqVarA6 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(i10 + 1));
                    if ((zzaqVarA5 instanceof zzaj) || (zzaqVarA6 instanceof zzaj)) {
                        throw new IllegalStateException("Failed to evaluate map entry");
                    }
                    zzapVar.n(zzaqVarA5.f(), zzaqVarA6);
                    i10 += 2;
                }
                return zzapVar;
            case 5:
                zzg.j(zzbv.EXPRESSION_LIST, 1, arrayList);
                zzaq zzaqVarA7 = zzaq.f8465i;
                while (i10 < arrayList.size()) {
                    zzaqVarA7 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(i10));
                    if (zzaqVarA7 instanceof zzaj) {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                    i10++;
                }
                return zzaqVarA7;
            case 6:
                zzg.e(zzbv.GET, 1, arrayList);
                zzaq zzaqVarA8 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                if (zzaqVarA8 instanceof zzas) {
                    return zzhVar.c(((zzas) zzaqVarA8).f8475s);
                }
                throw new IllegalArgumentException(E0.a.h("Expected string for get var. got ", zzaqVarA8.getClass().getCanonicalName()));
            case 7:
            case 8:
                zzg.e(zzbv.GET_PROPERTY, 2, arrayList);
                zzaq zzaqVarA9 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                zzaq zzaqVarA10 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
                if ((zzaqVarA9 instanceof zzaf) && zzg.l(zzaqVarA10)) {
                    return ((zzaf) zzaqVarA9).q(zzaqVarA10.e().intValue());
                }
                if (zzaqVarA9 instanceof zzak) {
                    return ((zzak) zzaqVarA9).k(zzaqVarA10.f());
                }
                if (zzaqVarA9 instanceof zzas) {
                    if ("length".equals(zzaqVarA10.f())) {
                        return new zzai(Double.valueOf(((zzas) zzaqVarA9).f8475s.length()));
                    }
                    if (zzg.l(zzaqVarA10)) {
                        zzas zzasVar2 = (zzas) zzaqVarA9;
                        if (zzaqVarA10.e().doubleValue() < zzasVar2.f8475s.length()) {
                            return new zzas(String.valueOf(zzasVar2.f8475s.charAt(zzaqVarA10.e().intValue())));
                        }
                    }
                }
                return zzaq.f8465i;
            case 9:
                zzg.e(zzbv.NULL, 0, arrayList);
                return zzaq.j;
            case 10:
                zzg.e(zzbv.SET_PROPERTY, 3, arrayList);
                zzaq zzaqVarA11 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                zzaq zzaqVarA12 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(1));
                zzaq zzaqVarA13 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(2));
                if (zzaqVarA11 == zzaq.f8465i || zzaqVarA11 == zzaq.j) {
                    throw new IllegalStateException("Can't set property " + zzaqVarA12.f() + " of " + zzaqVarA11.f());
                }
                if ((zzaqVarA11 instanceof zzaf) && (zzaqVarA12 instanceof zzai)) {
                    ((zzaf) zzaqVarA11).w(((zzai) zzaqVarA12).f8459s.intValue(), zzaqVarA13);
                    return zzaqVarA13;
                }
                if (zzaqVarA11 instanceof zzak) {
                    ((zzak) zzaqVarA11).n(zzaqVarA12.f(), zzaqVarA13);
                }
                return zzaqVarA13;
            case 11:
                zzg.e(zzbv.TYPEOF, 1, arrayList);
                zzaq zzaqVarA14 = zzhVar.f8658b.a(zzhVar, (zzaq) arrayList.get(0));
                if (zzaqVarA14 instanceof zzax) {
                    str2 = "undefined";
                } else if (zzaqVarA14 instanceof zzag) {
                    str2 = "boolean";
                } else if (zzaqVarA14 instanceof zzai) {
                    str2 = "number";
                } else if (zzaqVarA14 instanceof zzas) {
                    str2 = "string";
                } else if (zzaqVarA14 instanceof zzar) {
                    str2 = "function";
                } else {
                    if ((zzaqVarA14 instanceof zzat) || (zzaqVarA14 instanceof zzaj)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", zzaqVarA14));
                    }
                    str2 = "object";
                }
                return new zzas(str2);
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                zzg.e(zzbv.UNDEFINED, 0, arrayList);
                return zzaq.f8465i;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                zzg.j(zzbv.VAR, 1, arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    zzaq zzaqVarA15 = zzhVar.f8658b.a(zzhVar, (zzaq) it2.next());
                    if (!(zzaqVarA15 instanceof zzas)) {
                        throw new IllegalArgumentException(E0.a.h("Expected string for var name. got ", zzaqVarA15.getClass().getCanonicalName()));
                    }
                    zzhVar.e(((zzas) zzaqVarA15).f8475s, zzaq.f8465i);
                }
                return zzaq.f8465i;
            default:
                b(str);
                throw null;
        }
    }
}
