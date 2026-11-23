package M2;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zznl;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {
    public Boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f3161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Long f3162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f3163d;

    public static Boolean b(long j, zzff.zzd zzdVar) {
        try {
            return e(new BigDecimal(j), zzdVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean c(Boolean bool, boolean z6) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z6);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, zzff.zzf zzfVar, zzfw zzfwVar) {
        List listE;
        Preconditions.i(zzfVar);
        if (str != null && zzfVar.I() && zzfVar.A() != zzff.zzf.zza.UNKNOWN_MATCH_TYPE) {
            zzff.zzf.zza zzaVarA = zzfVar.A();
            zzff.zzf.zza zzaVar = zzff.zzf.zza.IN_LIST;
            if (zzaVarA != zzaVar ? zzfVar.H() : zzfVar.z() != 0) {
                zzff.zzf.zza zzaVarA2 = zzfVar.A();
                boolean zF = zzfVar.F();
                zzff.zzf.zza zzaVar2 = zzff.zzf.zza.REGEXP;
                String strD = (zF || zzaVarA2 == zzaVar2 || zzaVarA2 == zzaVar) ? zzfVar.D() : zzfVar.D().toUpperCase(Locale.ENGLISH);
                if (zzfVar.z() == 0) {
                    listE = null;
                } else {
                    listE = zzfVar.E();
                    if (!zF) {
                        ArrayList arrayList = new ArrayList(listE.size());
                        Iterator it = listE.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                        }
                        listE = Collections.unmodifiableList(arrayList);
                    }
                }
                String str2 = zzaVarA2 == zzaVar2 ? strD : null;
                if (zzaVarA2 != zzaVar ? strD != null : listE != null && !listE.isEmpty()) {
                    if (!zF && zzaVarA2 != zzaVar2) {
                        str = str.toUpperCase(Locale.ENGLISH);
                    }
                    switch (u0.a[zzaVarA2.ordinal()]) {
                        case 1:
                            if (str2 != null) {
                                try {
                                    return Boolean.valueOf(Pattern.compile(str2, zF ? 0 : 66).matcher(str).matches());
                                } catch (PatternSyntaxException unused) {
                                    zzfwVar.f9047A.a(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                }
                            }
                            break;
                        case 2:
                            return Boolean.valueOf(str.startsWith(strD));
                        case 3:
                            return Boolean.valueOf(str.endsWith(strD));
                        case 4:
                            return Boolean.valueOf(str.contains(strD));
                        case 5:
                            return Boolean.valueOf(str.equals(strD));
                        case 6:
                            if (listE != null) {
                                return Boolean.valueOf(listE.contains(str));
                            }
                            break;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x0098  */
    /* JADX WARN: Code duplicated, block: B:44:0x009d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:71:0x0105  */
    /* JADX WARN: Code duplicated, block: B:74:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x010d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0113  */
    public static Boolean e(BigDecimal bigDecimal, zzff.zzd zzdVar, double d3) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        int i10;
        boolean z6;
        Preconditions.i(zzdVar);
        if (zzdVar.G() && zzdVar.z() != zzff.zzd.zza.UNKNOWN_COMPARISON_TYPE) {
            zzff.zzd.zza zzaVarZ = zzdVar.z();
            zzff.zzd.zza zzaVar = zzff.zzd.zza.BETWEEN;
            if (zzaVarZ != zzaVar ? zzdVar.H() : zzdVar.K() && zzdVar.J()) {
                zzff.zzd.zza zzaVarZ2 = zzdVar.z();
                try {
                    if (zzdVar.z() == zzaVar) {
                        if (zznl.H1(zzdVar.E()) && zznl.H1(zzdVar.D())) {
                            BigDecimal bigDecimal5 = new BigDecimal(zzdVar.E());
                            bigDecimal4 = new BigDecimal(zzdVar.D());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                            if (zzaVarZ2 == zzaVar ? bigDecimal2 != null : bigDecimal3 != null) {
                                i10 = u0.f3121b[zzaVarZ2.ordinal()];
                                z6 = false;
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 != 3) {
                                            if (i10 == 4 && bigDecimal3 != null) {
                                                if (bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0) {
                                                    z6 = true;
                                                }
                                                return Boolean.valueOf(z6);
                                            }
                                        } else if (bigDecimal2 != null) {
                                            if (d3 == 0.0d) {
                                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                            }
                                            if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d3).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d3).multiply(new BigDecimal(2)))) < 0) {
                                                z6 = true;
                                            }
                                            return Boolean.valueOf(z6);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                                }
                            }
                        }
                    } else if (zznl.H1(zzdVar.C())) {
                        bigDecimal2 = new BigDecimal(zzdVar.C());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                        if (zzaVarZ2 == zzaVar) {
                            i10 = u0.f3121b[zzaVarZ2.ordinal()];
                            z6 = false;
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        if (i10 == 4) {
                                            if (bigDecimal.compareTo(bigDecimal3) >= 0) {
                                                z6 = true;
                                            }
                                            return Boolean.valueOf(z6);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d3 == 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d3).multiply(new BigDecimal(2)))) > 0) {
                                            z6 = true;
                                        }
                                        return Boolean.valueOf(z6);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        } else {
                            i10 = u0.f3121b[zzaVarZ2.ordinal()];
                            z6 = false;
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 != 3) {
                                        if (i10 == 4) {
                                            if (bigDecimal.compareTo(bigDecimal3) >= 0) {
                                                z6 = true;
                                            }
                                            return Boolean.valueOf(z6);
                                        }
                                    } else if (bigDecimal2 != null) {
                                        if (d3 == 0.0d) {
                                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                        }
                                        if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d3).multiply(new BigDecimal(2)))) > 0) {
                                            z6 = true;
                                        }
                                        return Boolean.valueOf(z6);
                                    }
                                } else if (bigDecimal2 != null) {
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    public abstract int a();

    public abstract boolean f();

    public abstract boolean g();
}
