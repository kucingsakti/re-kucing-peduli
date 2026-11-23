package com.google.android.gms.measurement.internal;

import A1.C0099h;
import J0.M;
import K3.d;
import M2.AbstractC0316z;
import M2.C0298g;
import M2.C0314x;
import M2.InterfaceC0296e;
import M2.m0;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzjs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p019b9.o;
import p040e1.j;
import p210v8.i;
import p212w.e;

/* JADX INFO: loaded from: classes.dex */
public final class zzgt extends m0 implements InterfaceC0296e {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final e f9085A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C0314x f9086B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final j f9087C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final e f9088D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final e f9089E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final e f9090F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final e f9091v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e f9092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f9093x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f9094y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e f9095z;

    public zzgt(zznc zzncVar) {
        super(zzncVar);
        this.f9091v = new e(0);
        this.f9092w = new e(0);
        this.f9093x = new e(0);
        this.f9094y = new e(0);
        this.f9095z = new e(0);
        this.f9088D = new e(0);
        this.f9089E = new e(0);
        this.f9090F = new e(0);
        this.f9085A = new e(0);
        this.f9086B = new C0314x(this);
        this.f9087C = new j(this, 18);
    }

    public static zzin.zza g1(com.google.android.gms.internal.measurement.zzfi.zza.zze zzeVar) {
        int i10 = AbstractC0316z.f3169b[zzeVar.ordinal()];
        if (i10 == 1) {
            return zzin.zza.AD_STORAGE;
        }
        if (i10 == 2) {
            return zzin.zza.ANALYTICS_STORAGE;
        }
        if (i10 == 3) {
            return zzin.zza.AD_USER_DATA;
        }
        if (i10 != 4) {
            return null;
        }
        return zzin.zza.AD_PERSONALIZATION;
    }

    public static e h1(com.google.android.gms.internal.measurement.zzfi.zzd zzdVar) {
        e eVar = new e(0);
        for (com.google.android.gms.internal.measurement.zzfi.zzg zzgVar : zzdVar.P()) {
            eVar.put(zzgVar.A(), zzgVar.B());
        }
        return eVar;
    }

    @Override // M2.InterfaceC0296e
    public final String H(String str, String str2) {
        W0();
        u1(str);
        Map map = (Map) this.f9091v.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // M2.m0
    public final boolean c1() {
        return false;
    }

    public final long d1(String str) {
        String strH = H(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strH)) {
            return 0L;
        }
        try {
            return Long.parseLong(strH);
        } catch (NumberFormatException e10) {
            zzfw zzfwVarI = i();
            zzfwVarI.f9047A.c("Unable to parse timezone offset. appId", zzfw.a1(str), e10);
            return 0L;
        }
    }

    public final com.google.android.gms.internal.measurement.zzfi.zzd e1(String str, byte[] bArr) {
        if (bArr == null) {
            return com.google.android.gms.internal.measurement.zzfi.zzd.I();
        }
        try {
            com.google.android.gms.internal.measurement.zzfi.zzd zzdVar = (com.google.android.gms.internal.measurement.zzfi.zzd) ((com.google.android.gms.internal.measurement.zzfi.zzd.zza) zznl.k1(com.google.android.gms.internal.measurement.zzfi.zzd.G(), bArr)).o();
            i().f9052F.c("Parsed config. version, gmp_app_id", zzdVar.U() ? Long.valueOf(zzdVar.E()) : null, zzdVar.S() ? zzdVar.K() : null);
            return zzdVar;
        } catch (zzjs e10) {
            i().f9047A.c("Unable to merge remote config. appId", zzfw.a1(str), e10);
            return com.google.android.gms.internal.measurement.zzfi.zzd.I();
        } catch (RuntimeException e11) {
            i().f9047A.c("Unable to merge remote config. appId", zzfw.a1(str), e11);
            return com.google.android.gms.internal.measurement.zzfi.zzd.I();
        }
    }

    public final zzim f1(String str, zzin.zza zzaVar) {
        W0();
        u1(str);
        com.google.android.gms.internal.measurement.zzfi.zza zzaVarM1 = m1(str);
        zzim zzimVar = zzim.UNINITIALIZED;
        if (zzaVarM1 != null) {
            for (com.google.android.gms.internal.measurement.zzfi.zza.C0004zza c0004zza : zzaVarM1.E()) {
                if (g1(c0004zza.B()) == zzaVar) {
                    int i10 = AbstractC0316z.f3170c[c0004zza.A().ordinal()];
                    if (i10 == 1) {
                        return zzim.DENIED;
                    }
                    if (i10 != 2) {
                        break;
                    }
                    return zzim.GRANTED;
                }
            }
        }
        return zzimVar;
    }

    public final void i1(String str, com.google.android.gms.internal.measurement.zzfi.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        e eVar = new e(0);
        e eVar2 = new e(0);
        e eVar3 = new e(0);
        Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.f8681t).N()).iterator();
        while (it.hasNext()) {
            hashSet.add(((com.google.android.gms.internal.measurement.zzfi.zzb) it.next()).A());
        }
        for (int i10 = 0; i10 < ((com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.f8681t).D(); i10++) {
            com.google.android.gms.internal.measurement.zzfi.zzc.zza zzaVar2 = (com.google.android.gms.internal.measurement.zzfi.zzc.zza) ((com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.f8681t).A(i10).v();
            if (zzaVar2.r().isEmpty()) {
                i().f9047A.b("EventConfig contained null event name");
            } else {
                String strR = zzaVar2.r();
                String strA = zzkq.a(zzaVar2.r(), zziq.a, zziq.f9180c);
                if (!TextUtils.isEmpty(strA)) {
                    zzaVar2.m();
                    com.google.android.gms.internal.measurement.zzfi.zzc.A((com.google.android.gms.internal.measurement.zzfi.zzc) zzaVar2.f8681t, strA);
                    zzaVar.m();
                    com.google.android.gms.internal.measurement.zzfi.zzd.C((com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.f8681t, i10, (com.google.android.gms.internal.measurement.zzfi.zzc) zzaVar2.o());
                }
                if (((com.google.android.gms.internal.measurement.zzfi.zzc) zzaVar2.f8681t).F() && ((com.google.android.gms.internal.measurement.zzfi.zzc) zzaVar2.f8681t).D()) {
                    eVar.put(strR, Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.zzfi.zzc) zzaVar2.f8681t).G() && ((com.google.android.gms.internal.measurement.zzfi.zzc) zzaVar2.f8681t).E()) {
                    eVar2.put(zzaVar2.r(), Boolean.TRUE);
                }
                if (((com.google.android.gms.internal.measurement.zzfi.zzc) zzaVar2.f8681t).H()) {
                    if (((com.google.android.gms.internal.measurement.zzfi.zzc) zzaVar2.f8681t).z() < 2 || ((com.google.android.gms.internal.measurement.zzfi.zzc) zzaVar2.f8681t).z() > 65535) {
                        zzfw zzfwVarI = i();
                        zzfwVarI.f9047A.c("Invalid sampling rate. Event name, sample rate", zzaVar2.r(), Integer.valueOf(((com.google.android.gms.internal.measurement.zzfi.zzc) zzaVar2.f8681t).z()));
                    } else {
                        eVar3.put(zzaVar2.r(), Integer.valueOf(((com.google.android.gms.internal.measurement.zzfi.zzc) zzaVar2.f8681t).z()));
                    }
                }
            }
        }
        this.f9092w.put(str, hashSet);
        this.f9093x.put(str, eVar);
        this.f9094y.put(str, eVar2);
        this.f9085A.put(str, eVar3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j1(String str, com.google.android.gms.internal.measurement.zzfi.zzd zzdVar) {
        if (zzdVar.z() == 0) {
            C0314x c0314x = this.f9086B;
            c0314x.getClass();
            i.f(str, "key");
            synchronized (((d) c0314x.f2260g)) {
                o oVar = (o) c0314x.f2259f;
                oVar.getClass();
                Object objRemove = oVar.a.remove(str);
                if (objRemove != null) {
                    int i10 = c0314x.f2256c;
                    M.l(str, objRemove);
                    c0314x.f2256c = i10 - 1;
                }
            }
            return;
        }
        i().f9052F.a(Integer.valueOf(zzdVar.z()), "EES programs found");
        com.google.android.gms.internal.measurement.zzft.zzc zzcVar = (com.google.android.gms.internal.measurement.zzft.zzc) zzdVar.O().get(0);
        try {
            com.google.android.gms.internal.measurement.zzb zzbVar = new com.google.android.gms.internal.measurement.zzb();
            zzgu zzguVar = new zzgu();
            zzguVar.f9096s = this;
            zzguVar.f9097t = str;
            zzbVar.a.f8575d.a.put("internal.remoteConfig", zzguVar);
            zzgx zzgxVar = new zzgx();
            zzgxVar.f9101s = this;
            zzgxVar.f9102t = str;
            zzbVar.a.f8575d.a.put("internal.appMetadata", zzgxVar);
            zzgw zzgwVar = new zzgw();
            zzgwVar.f9100s = this;
            zzbVar.a.f8575d.a.put("internal.logger", zzgwVar);
            zzbVar.a(zzcVar);
            this.f9086B.k(str, zzbVar);
            i().f9052F.c("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.z().z()));
            Iterator it = zzcVar.z().C().iterator();
            while (it.hasNext()) {
                i().f9052F.a(((com.google.android.gms.internal.measurement.zzft.zzb) it.next()).A(), "EES program activity");
            }
        } catch (zzc unused) {
            i().f9056x.a(str, "Failed to load EES program. appId");
        }
    }

    public final void k1(String str, byte[] bArr, String str2, String str3) {
        byte[] bArrL;
        boolean z6;
        boolean z10;
        a1();
        W0();
        Preconditions.e(str);
        com.google.android.gms.internal.measurement.zzfi.zzd.zza zzaVar = (com.google.android.gms.internal.measurement.zzfi.zzd.zza) e1(str, bArr).v();
        i1(str, zzaVar);
        j1(str, (com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.o());
        e eVar = this.f9095z;
        eVar.put(str, (com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.o());
        this.f9088D.put(str, ((com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.f8681t).L());
        this.f9089E.put(str, str2);
        this.f9090F.put(str, str3);
        this.f9091v.put(str, h1((com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.o()));
        C0298g c0298gY0 = Y0();
        ArrayList<com.google.android.gms.internal.measurement.zzff.zza> arrayList = new ArrayList(Collections.unmodifiableList(((com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.f8681t).M()));
        int i10 = 0;
        while (i10 < arrayList.size()) {
            com.google.android.gms.internal.measurement.zzff.zza.C0003zza c0003zza = (com.google.android.gms.internal.measurement.zzff.zza.C0003zza) ((com.google.android.gms.internal.measurement.zzff.zza) arrayList.get(i10)).v();
            if (((com.google.android.gms.internal.measurement.zzff.zza) c0003zza.f8681t).D() != 0) {
                int i11 = 0;
                while (i11 < ((com.google.android.gms.internal.measurement.zzff.zza) c0003zza.f8681t).D()) {
                    com.google.android.gms.internal.measurement.zzff.zzb.zza zzaVar2 = (com.google.android.gms.internal.measurement.zzff.zzb.zza) ((com.google.android.gms.internal.measurement.zzff.zza) c0003zza.f8681t).A(i11).v();
                    com.google.android.gms.internal.measurement.zzff.zzb.zza zzaVar3 = (com.google.android.gms.internal.measurement.zzff.zzb.zza) ((zzjk.zzb) zzaVar2.clone());
                    e eVar2 = eVar;
                    String strA = zzkq.a(((com.google.android.gms.internal.measurement.zzff.zzb) zzaVar2.f8681t).H(), zziq.a, zziq.f9180c);
                    if (strA != null) {
                        zzaVar3.m();
                        com.google.android.gms.internal.measurement.zzff.zzb.C((com.google.android.gms.internal.measurement.zzff.zzb) zzaVar3.f8681t, strA);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int i12 = 0;
                    while (i12 < ((com.google.android.gms.internal.measurement.zzff.zzb) zzaVar2.f8681t).z()) {
                        com.google.android.gms.internal.measurement.zzff.zzc zzcVarA = ((com.google.android.gms.internal.measurement.zzff.zzb) zzaVar2.f8681t).A(i12);
                        boolean z11 = z10;
                        com.google.android.gms.internal.measurement.zzff.zzb.zza zzaVar4 = zzaVar2;
                        String strA2 = zzkq.a(zzcVarA.E(), zzip.a, zzip.f9176b);
                        if (strA2 != null) {
                            com.google.android.gms.internal.measurement.zzff.zzc.zza zzaVar5 = (com.google.android.gms.internal.measurement.zzff.zzc.zza) zzcVarA.v();
                            zzaVar5.m();
                            com.google.android.gms.internal.measurement.zzff.zzc.A((com.google.android.gms.internal.measurement.zzff.zzc) zzaVar5.f8681t, strA2);
                            com.google.android.gms.internal.measurement.zzff.zzc zzcVar = (com.google.android.gms.internal.measurement.zzff.zzc) zzaVar5.o();
                            zzaVar3.m();
                            com.google.android.gms.internal.measurement.zzff.zzb.B((com.google.android.gms.internal.measurement.zzff.zzb) zzaVar3.f8681t, i12, zzcVar);
                            z10 = true;
                        } else {
                            z10 = z11;
                        }
                        i12++;
                        zzaVar2 = zzaVar4;
                    }
                    if (z10) {
                        c0003zza.m();
                        com.google.android.gms.internal.measurement.zzff.zza.B((com.google.android.gms.internal.measurement.zzff.zza) c0003zza.f8681t, i11, (com.google.android.gms.internal.measurement.zzff.zzb) zzaVar3.o());
                        arrayList.set(i10, (com.google.android.gms.internal.measurement.zzff.zza) c0003zza.o());
                    }
                    i11++;
                    eVar = eVar2;
                }
            }
            e eVar3 = eVar;
            if (((com.google.android.gms.internal.measurement.zzff.zza) c0003zza.f8681t).F() != 0) {
                for (int i13 = 0; i13 < ((com.google.android.gms.internal.measurement.zzff.zza) c0003zza.f8681t).F(); i13++) {
                    com.google.android.gms.internal.measurement.zzff.zze zzeVarE = ((com.google.android.gms.internal.measurement.zzff.zza) c0003zza.f8681t).E(i13);
                    String strA3 = zzkq.a(zzeVarE.E(), zzis.a, zzis.f9182b);
                    if (strA3 != null) {
                        com.google.android.gms.internal.measurement.zzff.zze.zza zzaVar6 = (com.google.android.gms.internal.measurement.zzff.zze.zza) zzeVarE.v();
                        zzaVar6.m();
                        com.google.android.gms.internal.measurement.zzff.zze.A((com.google.android.gms.internal.measurement.zzff.zze) zzaVar6.f8681t, strA3);
                        c0003zza.m();
                        com.google.android.gms.internal.measurement.zzff.zza.C((com.google.android.gms.internal.measurement.zzff.zza) c0003zza.f8681t, i13, (com.google.android.gms.internal.measurement.zzff.zze) zzaVar6.o());
                        arrayList.set(i10, (com.google.android.gms.internal.measurement.zzff.zza) c0003zza.o());
                    }
                }
            }
            i10++;
            eVar = eVar3;
        }
        e eVar4 = eVar;
        c0298gY0.a1();
        c0298gY0.W0();
        Preconditions.e(str);
        SQLiteDatabase sQLiteDatabaseD1 = c0298gY0.d1();
        sQLiteDatabaseD1.beginTransaction();
        try {
            c0298gY0.a1();
            c0298gY0.W0();
            Preconditions.e(str);
            SQLiteDatabase sQLiteDatabaseD2 = c0298gY0.d1();
            sQLiteDatabaseD2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseD2.delete("event_filters", "app_id=?", new String[]{str});
            for (com.google.android.gms.internal.measurement.zzff.zza zzaVar7 : arrayList) {
                c0298gY0.a1();
                c0298gY0.W0();
                Preconditions.e(str);
                Preconditions.i(zzaVar7);
                if (zzaVar7.J()) {
                    int iZ = zzaVar7.z();
                    Iterator it = zzaVar7.H().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!((com.google.android.gms.internal.measurement.zzff.zzb) it.next()).N()) {
                                c0298gY0.i().f9047A.c("Event filter with no ID. Audience definition ignored. appId, audienceId", zzfw.a1(str), Integer.valueOf(iZ));
                                break;
                            }
                        } else {
                            Iterator it2 = zzaVar7.I().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    Iterator it3 = zzaVar7.H().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!c0298gY0.C1(str, iZ, (com.google.android.gms.internal.measurement.zzff.zzb) it3.next())) {
                                                z6 = false;
                                                break;
                                            }
                                        } else {
                                            z6 = true;
                                            break;
                                        }
                                    }
                                    if (z6) {
                                        Iterator it4 = zzaVar7.I().iterator();
                                        while (it4.hasNext()) {
                                            if (!c0298gY0.D1(str, iZ, (com.google.android.gms.internal.measurement.zzff.zze) it4.next())) {
                                                z6 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z6) {
                                        c0298gY0.a1();
                                        c0298gY0.W0();
                                        Preconditions.e(str);
                                        SQLiteDatabase sQLiteDatabaseD3 = c0298gY0.d1();
                                        sQLiteDatabaseD3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZ)});
                                        sQLiteDatabaseD3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iZ)});
                                        break;
                                    }
                                    break;
                                }
                                if (!((com.google.android.gms.internal.measurement.zzff.zze) it2.next()).I()) {
                                    c0298gY0.i().f9047A.c("Property filter with no ID. Audience definition ignored. appId, audienceId", zzfw.a1(str), Integer.valueOf(iZ));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    c0298gY0.i().f9047A.a(zzfw.a1(str), "Audience with no ID. appId");
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (com.google.android.gms.internal.measurement.zzff.zza zzaVar8 : arrayList) {
                arrayList2.add(zzaVar8.J() ? Integer.valueOf(zzaVar8.z()) : null);
            }
            c0298gY0.J1(str, arrayList2);
            sQLiteDatabaseD1.setTransactionSuccessful();
            sQLiteDatabaseD1.endTransaction();
            try {
                zzaVar.m();
                com.google.android.gms.internal.measurement.zzfi.zzd.B((com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.f8681t);
                bArrL = ((com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.o()).l();
            } catch (RuntimeException e10) {
                i().f9047A.c("Unable to serialize reduced-size config. Storing full config instead. appId", zzfw.a1(str), e10);
                bArrL = bArr;
            }
            C0298g c0298gY1 = Y0();
            Preconditions.e(str);
            c0298gY1.W0();
            c0298gY1.a1();
            ContentValues contentValues = new ContentValues();
            contentValues.put("remote_config", bArrL);
            contentValues.put("config_last_modified_time", str2);
            contentValues.put("e_tag", str3);
            try {
                if (c0298gY1.d1().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                    c0298gY1.i().f9056x.a(zzfw.a1(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e11) {
                c0298gY1.i().f9056x.c("Error storing remote config. appId", zzfw.a1(str), e11);
            }
            eVar4.put(str, (com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.o());
        } catch (Throwable th) {
            sQLiteDatabaseD1.endTransaction();
            throw th;
        }
    }

    public final int l1(String str, String str2) {
        Integer num;
        W0();
        u1(str);
        Map map = (Map) this.f9085A.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final com.google.android.gms.internal.measurement.zzfi.zza m1(String str) {
        W0();
        u1(str);
        com.google.android.gms.internal.measurement.zzfi.zzd zzdVarO1 = o1(str);
        if (zzdVarO1 == null || !zzdVarO1.R()) {
            return null;
        }
        return zzdVarO1.F();
    }

    public final zzin.zza n1(String str) {
        zzin.zza zzaVar = zzin.zza.AD_USER_DATA;
        W0();
        u1(str);
        com.google.android.gms.internal.measurement.zzfi.zza zzaVarM1 = m1(str);
        if (zzaVarM1 == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.zzfi.zza.zzc zzcVar : zzaVarM1.D()) {
            if (zzaVar == g1(zzcVar.B())) {
                return g1(zzcVar.A());
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.measurement.zzfi.zzd o1(String str) {
        a1();
        W0();
        Preconditions.e(str);
        u1(str);
        return (com.google.android.gms.internal.measurement.zzfi.zzd) this.f9095z.get(str);
    }

    public final boolean p1(String str, zzin.zza zzaVar) {
        W0();
        u1(str);
        com.google.android.gms.internal.measurement.zzfi.zza zzaVarM1 = m1(str);
        if (zzaVarM1 == null) {
            return false;
        }
        for (com.google.android.gms.internal.measurement.zzfi.zza.C0004zza c0004zza : zzaVarM1.C()) {
            if (zzaVar == g1(c0004zza.B())) {
                return c0004zza.A() == com.google.android.gms.internal.measurement.zzfi.zza.zzd.GRANTED;
            }
        }
        return false;
    }

    public final boolean q1(String str, String str2) {
        Boolean bool;
        W0();
        u1(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f9094y.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean r1(String str, String str2) {
        Boolean bool;
        W0();
        u1(str);
        if ("1".equals(H(str, "measurement.upload.blacklist_internal")) && zznp.c2(str2)) {
            return true;
        }
        if ("1".equals(H(str, "measurement.upload.blacklist_public")) && zznp.e2(str2)) {
            return true;
        }
        Map map = (Map) this.f9093x.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean s1(String str) {
        W0();
        u1(str);
        e eVar = this.f9092w;
        return eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id");
    }

    public final boolean t1(String str) {
        W0();
        u1(str);
        e eVar = this.f9092w;
        if (eVar.get(str) != null) {
            return ((Set) eVar.get(str)).contains("os_version") || ((Set) eVar.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x0119  */
    /* JADX WARN: Code duplicated, block: B:44:? A[SYNTHETIC] */
    public final void u1(String str) {
        Throwable th;
        Cursor cursorQuery;
        C0099h c0099h;
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        a1();
        W0();
        Preconditions.e(str);
        e eVar5 = this.f9095z;
        if (eVar5.get(str) == null) {
            C0298g c0298gY0 = Y0();
            Preconditions.e(str);
            c0298gY0.W0();
            c0298gY0.a1();
            Cursor cursor = null;
            try {
                cursorQuery = c0298gY0.d1().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            String string = cursorQuery.getString(1);
                            String string2 = cursorQuery.getString(2);
                            if (cursorQuery.moveToNext()) {
                                c0298gY0.i().f9056x.a(zzfw.a1(str), "Got multiple records for app config, expected one. appId");
                            }
                            if (blob == null) {
                                cursorQuery.close();
                            } else {
                                c0099h = new C0099h(blob, string, string2, 20);
                                cursorQuery.close();
                            }
                            eVar = this.f9090F;
                            eVar2 = this.f9089E;
                            eVar3 = this.f9088D;
                            eVar4 = this.f9091v;
                            if (c0099h == null) {
                                com.google.android.gms.internal.measurement.zzfi.zzd.zza zzaVar = (com.google.android.gms.internal.measurement.zzfi.zzd.zza) e1(str, (byte[]) c0099h.f103t).v();
                                i1(str, zzaVar);
                                eVar4.put(str, h1((com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.o()));
                                eVar5.put(str, (com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.o());
                                j1(str, (com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.o());
                                eVar3.put(str, ((com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar.f8681t).L());
                                eVar2.put(str, (String) c0099h.f104u);
                                eVar.put(str, (String) c0099h.f105v);
                                return;
                            }
                            eVar4.put(str, null);
                            this.f9093x.put(str, null);
                            this.f9092w.put(str, null);
                            this.f9094y.put(str, null);
                            eVar5.put(str, null);
                            eVar3.put(str, null);
                            eVar2.put(str, null);
                            eVar.put(str, null);
                            this.f9085A.put(str, null);
                        }
                        cursorQuery.close();
                    } catch (SQLiteException e10) {
                        e = e10;
                        c0298gY0.i().f9056x.c("Error querying remote config. appId", zzfw.a1(str), e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
                cursorQuery = null;
            } catch (Throwable th3) {
                th = th3;
                if (cursor != null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
            c0099h = null;
            eVar = this.f9090F;
            eVar2 = this.f9089E;
            eVar3 = this.f9088D;
            eVar4 = this.f9091v;
            if (c0099h == null) {
                com.google.android.gms.internal.measurement.zzfi.zzd.zza zzaVar2 = (com.google.android.gms.internal.measurement.zzfi.zzd.zza) e1(str, (byte[]) c0099h.f103t).v();
                i1(str, zzaVar2);
                eVar4.put(str, h1((com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar2.o()));
                eVar5.put(str, (com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar2.o());
                j1(str, (com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar2.o());
                eVar3.put(str, ((com.google.android.gms.internal.measurement.zzfi.zzd) zzaVar2.f8681t).L());
                eVar2.put(str, (String) c0099h.f104u);
                eVar.put(str, (String) c0099h.f105v);
                return;
            }
            eVar4.put(str, null);
            this.f9093x.put(str, null);
            this.f9092w.put(str, null);
            this.f9094y.put(str, null);
            eVar5.put(str, null);
            eVar3.put(str, null);
            eVar2.put(str, null);
            eVar.put(str, null);
            this.f9085A.put(str, null);
        }
    }
}
