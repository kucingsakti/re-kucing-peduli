package M2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzff;
import com.google.android.gms.internal.measurement.zzfn;
import com.google.android.gms.internal.measurement.zzjq;
import com.google.android.gms.internal.measurement.zzjt;
import com.google.android.gms.internal.measurement.zznk;
import com.google.android.gms.internal.measurement.zzoc;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzhj;
import com.google.android.gms.measurement.internal.zznl;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends m0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f3124v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public HashSet f3125w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p212w.e f3126x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Long f3127y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Long f3128z;

    @Override // M2.m0
    public final boolean c1() {
        return false;
    }

    public final w0 d1(Integer num) {
        if (this.f3126x.containsKey(num)) {
            return (w0) this.f3126x.get(num);
        }
        w0 w0Var = new w0(this, this.f3124v);
        this.f3126x.put(num, w0Var);
        return w0Var;
    }

    public final ArrayList e1(String str, List list, List list2, Long l4, Long l10) {
        return f1(str, list, list2, l4, l10, false);
    }

    /* JADX WARN: Code duplicated, block: B:241:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:58:0x0171  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final ArrayList f1(String str, List list, List list2, Long l4, Long l10, boolean z6) throws Throwable {
        boolean z10;
        ?? r12;
        Cursor cursorQuery;
        Map map;
        Map map2;
        boolean z11;
        Map map3;
        List<zzff.zzb> list3;
        boolean z12;
        ?? r13;
        Cursor cursorRawQuery;
        Map map4;
        Map map5;
        boolean z13;
        ?? r14;
        Cursor cursorQuery2;
        Preconditions.e(str);
        Preconditions.i(list);
        Preconditions.i(list2);
        this.f3124v = str;
        this.f3125w = new HashSet();
        int i10 = 0;
        this.f3126x = new p212w.e(0);
        this.f3127y = l4;
        this.f3128z = l10;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            if ("_s".equals(((zzfn.zzf) it.next()).O())) {
                z10 = true;
                break;
            }
        }
        zzoc.a();
        zzhj zzhjVar = (zzhj) this.f577s;
        boolean zH1 = zzhjVar.f9146y.h1(this.f3124v, zzbf.f8992k0);
        zzoc.a();
        boolean zH2 = zzhjVar.f9146y.h1(this.f3124v, zzbf.f8990j0);
        if (z10) {
            C0298g c0298gY0 = Y0();
            String str2 = this.f3124v;
            c0298gY0.a1();
            c0298gY0.W0();
            Preconditions.e(str2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                c0298gY0.d1().update("events", contentValues, "app_id = ?", new String[]{str2});
            } catch (SQLiteException e10) {
                c0298gY0.i().f9056x.c("Error resetting session-scoped event counts. appId", zzfw.a1(str2), e10);
            }
        }
        Map map6 = Collections.EMPTY_MAP;
        if (zH2 && zH1) {
            C0298g c0298gY1 = Y0();
            String str3 = this.f3124v;
            Preconditions.e(str3);
            p212w.e eVar = new p212w.e(0);
            try {
                try {
                    cursorQuery2 = c0298gY1.d1().query("event_filters", new String[]{"audience_id", JsonStorageKeyNames.DATA_KEY}, "app_id=?", new String[]{str3}, null, null, null);
                    try {
                        if (cursorQuery2.moveToFirst()) {
                            while (true) {
                                try {
                                    zzff.zzb zzbVar = (zzff.zzb) ((zzff.zzb.zza) zznl.k1(zzff.zzb.E(), cursorQuery2.getBlob(1))).o();
                                    if (zzbVar.M()) {
                                        int i11 = cursorQuery2.getInt(i10);
                                        List arrayList = (List) eVar.get(Integer.valueOf(i11));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            eVar.put(Integer.valueOf(i11), arrayList);
                                        }
                                        arrayList.add(zzbVar);
                                    }
                                } catch (IOException e11) {
                                    c0298gY1.i().f9056x.c("Failed to merge filter. appId", zzfw.a1(str3), e11);
                                }
                                try {
                                    if (!cursorQuery2.moveToNext()) {
                                        break;
                                    }
                                    z10 = z10;
                                    i10 = 0;
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    c0298gY1.i().f9056x.c("Database error querying filters. appId", zzfw.a1(str3), e);
                                    map6 = Collections.EMPTY_MAP;
                                    if (cursorQuery2 != null) {
                                        cursorQuery2.close();
                                    }
                                }
                            }
                            cursorQuery2.close();
                            map6 = eVar;
                        } else {
                            cursorQuery2.close();
                            z10 = z10;
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                        z10 = z10;
                    }
                } catch (Throwable th) {
                    th = th;
                    r14 = "app_id = ?";
                    if (r14 != 0) {
                        r14.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e14) {
                e = e14;
                z10 = z10;
                cursorQuery2 = null;
            } catch (Throwable th2) {
                th = th2;
                r14 = 0;
                if (r14 != 0) {
                    r14.close();
                }
                throw th;
            }
        } else {
            z10 = z10;
        }
        Map map7 = map6;
        C0298g c0298gY2 = Y0();
        String str4 = this.f3124v;
        c0298gY2.a1();
        c0298gY2.W0();
        Preconditions.e(str4);
        try {
            try {
                cursorQuery = c0298gY2.d1().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str4}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i12 = 0;
                        p212w.e eVar2 = new p212w.e(0);
                        while (true) {
                            int i13 = cursorQuery.getInt(i12);
                            try {
                                eVar2.put(Integer.valueOf(i13), (zzfn.zzm) ((zzfn.zzm.zza) zznl.k1(zzfn.zzm.L(), cursorQuery.getBlob(1))).o());
                            } catch (IOException e15) {
                                c0298gY2.i().f9056x.d("Failed to merge filter results. appId, audienceId, error", zzfw.a1(str4), Integer.valueOf(i13), e15);
                            }
                            try {
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                }
                                c0298gY2 = c0298gY2;
                                i12 = 0;
                            } catch (SQLiteException e16) {
                                e = e16;
                                c0298gY2.i().f9056x.c("Database error querying filter results. appId", zzfw.a1(str4), e);
                                map = Collections.EMPTY_MAP;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                map2 = map;
                            }
                        }
                        cursorQuery.close();
                        map2 = eVar2;
                    } else {
                        map = Collections.EMPTY_MAP;
                        cursorQuery.close();
                        map2 = map;
                    }
                } catch (SQLiteException e17) {
                    e = e17;
                    c0298gY2 = c0298gY2;
                }
            } catch (Throwable th3) {
                th = th3;
                r12 = "audience_id";
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e18) {
            e = e18;
            c0298gY2 = c0298gY2;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            r12 = 0;
            if (r12 != 0) {
                r12.close();
            }
            throw th;
        }
        if (!map2.isEmpty()) {
            HashSet<Integer> hashSet = new HashSet(map2.keySet());
            if (z10) {
                String str5 = this.f3124v;
                C0298g c0298gY3 = Y0();
                String str6 = this.f3124v;
                c0298gY3.a1();
                c0298gY3.W0();
                Preconditions.e(str6);
                p212w.e eVar3 = new p212w.e(0);
                try {
                    try {
                        cursorRawQuery = c0298gY3.d1().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str6, str6});
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                do {
                                    int i14 = cursorRawQuery.getInt(0);
                                    List arrayList2 = (List) eVar3.get(Integer.valueOf(i14));
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                        eVar3.put(Integer.valueOf(i14), arrayList2);
                                    }
                                    arrayList2.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                } while (cursorRawQuery.moveToNext());
                                cursorRawQuery.close();
                                map4 = eVar3;
                            } else {
                                Map map8 = Collections.EMPTY_MAP;
                                cursorRawQuery.close();
                                map4 = map8;
                            }
                        } catch (SQLiteException e19) {
                            e = e19;
                            c0298gY3.i().f9056x.c("Database error querying scoped filters. appId", zzfw.a1(str6), e);
                            Map map9 = Collections.EMPTY_MAP;
                            map4 = map9;
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                                map4 = map9;
                            }
                        }
                    } catch (SQLiteException e20) {
                        e = e20;
                        cursorRawQuery = null;
                    } catch (Throwable th5) {
                        th = th5;
                        r13 = 0;
                        if (r13 != 0) {
                            r13.close();
                        }
                        throw th;
                    }
                    Preconditions.e(str5);
                    p212w.e eVar4 = new p212w.e(0);
                    if (!map2.isEmpty()) {
                        Iterator it2 = map2.keySet().iterator();
                        while (it2.hasNext()) {
                            Integer num = (Integer) it2.next();
                            num.getClass();
                            zzfn.zzm zzmVar = (zzfn.zzm) map2.get(num);
                            List list4 = (List) map4.get(num);
                            if (list4 == null || list4.isEmpty()) {
                                map5 = map4;
                                z13 = zH1;
                                eVar4.put(num, zzmVar);
                                map4 = map5;
                                it2 = it2;
                                zH1 = z13;
                            } else {
                                Map map10 = map4;
                                List listR1 = X0().r1((zzjq) zzmVar.P(), list4);
                                if (listR1.isEmpty()) {
                                    map4 = map10;
                                } else {
                                    zzfn.zzm.zza zzaVar = (zzfn.zzm.zza) zzmVar.v();
                                    zzaVar.m();
                                    zzfn.zzm.E((zzfn.zzm) zzaVar.f8681t);
                                    zzaVar.m();
                                    zzfn.zzm.D((zzfn.zzm) zzaVar.f8681t, listR1);
                                    List listR2 = X0().r1((zzjq) zzmVar.R(), list4);
                                    zzaVar.m();
                                    zzfn.zzm.B((zzfn.zzm) zzaVar.f8681t);
                                    zzaVar.m();
                                    zzfn.zzm.A((zzfn.zzm) zzaVar.f8681t, listR2);
                                    ArrayList arrayList3 = new ArrayList();
                                    Iterator it3 = zzmVar.O().iterator();
                                    while (it3.hasNext()) {
                                        Iterator it4 = it3;
                                        zzfn.zze zzeVar = (zzfn.zze) it3.next();
                                        boolean z14 = zH1;
                                        if (!list4.contains(Integer.valueOf(zzeVar.z()))) {
                                            arrayList3.add(zzeVar);
                                        }
                                        it3 = it4;
                                        zH1 = z14;
                                    }
                                    z13 = zH1;
                                    zzaVar.m();
                                    zzfn.zzm.G((zzfn.zzm) zzaVar.f8681t);
                                    zzaVar.m();
                                    zzfn.zzm.H((zzfn.zzm) zzaVar.f8681t, arrayList3);
                                    ArrayList arrayList4 = new ArrayList();
                                    for (zzfn.zzn zznVar : zzmVar.Q()) {
                                        if (!list4.contains(Integer.valueOf(zznVar.D()))) {
                                            arrayList4.add(zznVar);
                                        }
                                    }
                                    zzaVar.m();
                                    zzfn.zzm.J((zzfn.zzm) zzaVar.f8681t);
                                    zzaVar.m();
                                    zzfn.zzm.K((zzfn.zzm) zzaVar.f8681t, arrayList4);
                                    eVar4.put(num, (zzfn.zzm) zzaVar.o());
                                    map5 = map10;
                                    map4 = map5;
                                    it2 = it2;
                                    zH1 = z13;
                                }
                            }
                        }
                    }
                    z11 = zH1;
                    map3 = eVar4;
                } catch (Throwable th6) {
                    th = th6;
                    r13 = hashSet;
                }
            } else {
                z11 = zH1;
                map3 = map2;
            }
            for (Integer num2 : hashSet) {
                num2.getClass();
                zzfn.zzm zzmVar2 = (zzfn.zzm) map3.get(num2);
                BitSet bitSet = new BitSet();
                BitSet bitSet2 = new BitSet();
                p212w.e eVar5 = new p212w.e(0);
                if (zzmVar2 != null && zzmVar2.z() != 0) {
                    for (zzfn.zze zzeVar2 : zzmVar2.O()) {
                        if (zzeVar2.G()) {
                            eVar5.put(Integer.valueOf(zzeVar2.z()), zzeVar2.F() ? Long.valueOf(zzeVar2.C()) : null);
                        }
                        zzmVar2 = zzmVar2;
                    }
                }
                zzfn.zzm zzmVar3 = zzmVar2;
                p212w.e eVar6 = new p212w.e(0);
                if (zzmVar3 != null && zzmVar3.F() != 0) {
                    Iterator it5 = zzmVar3.Q().iterator();
                    while (it5.hasNext()) {
                        zzfn.zzn zznVar2 = (zzfn.zzn) it5.next();
                        if (zznVar2.H() && zznVar2.z() > 0) {
                            eVar6.put(Integer.valueOf(zznVar2.D()), Long.valueOf(zznVar2.A(zznVar2.z() - 1)));
                        }
                        it5 = it5;
                        map3 = map3;
                    }
                }
                Map map11 = map3;
                if (zzmVar3 != null) {
                    int i15 = 0;
                    while (i15 < (zzmVar3.I() << 6)) {
                        if (zznl.F1((zzjq) zzmVar3.R(), i15)) {
                            z12 = zH2;
                            i().f9052F.c("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i15));
                            bitSet2.set(i15);
                            if (zznl.F1((zzjq) zzmVar3.P(), i15)) {
                                bitSet.set(i15);
                            }
                            i15++;
                            zH2 = z12;
                        } else {
                            z12 = zH2;
                        }
                        eVar5.remove(Integer.valueOf(i15));
                        i15++;
                        zH2 = z12;
                    }
                }
                boolean z15 = zH2;
                zzfn.zzm zzmVar4 = (zzfn.zzm) map2.get(num2);
                if (z15 && z11 && (list3 = (List) map7.get(num2)) != null && this.f3128z != null && this.f3127y != null) {
                    for (zzff.zzb zzbVar2 : list3) {
                        int iD = zzbVar2.D();
                        Integer num3 = num2;
                        long jLongValue = this.f3128z.longValue() / 1000;
                        if (zzbVar2.K()) {
                            jLongValue = this.f3127y.longValue() / 1000;
                        }
                        if (eVar5.containsKey(Integer.valueOf(iD))) {
                            eVar5.put(Integer.valueOf(iD), Long.valueOf(jLongValue));
                        }
                        if (eVar6.containsKey(Integer.valueOf(iD))) {
                            eVar6.put(Integer.valueOf(iD), Long.valueOf(jLongValue));
                        }
                        num2 = num3;
                    }
                }
                this.f3126x.put(num2, new w0(this, this.f3124v, zzmVar4, bitSet, bitSet2, eVar5, eVar6));
                zH2 = z15;
                map3 = map11;
            }
        }
        zznk.a();
        if (!zzhjVar.f9146y.h1(null, zzbf.f8968V0)) {
            g1(list, true);
            h1(list2);
            return i1();
        }
        g1(list, z6);
        if (z6) {
            return new ArrayList();
        }
        h1(list2);
        return i1();
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0269  */
    /* JADX WARN: Code duplicated, block: B:115:0x027f  */
    /* JADX WARN: Code duplicated, block: B:116:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:119:0x0309 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:122:0x0311  */
    /* JADX WARN: Code duplicated, block: B:124:0x031d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0359 A[Catch: all -> 0x0362, SQLiteException -> 0x0366, TRY_LEAVE, TryCatch #1 {all -> 0x0362, blocks: (B:126:0x0353, B:128:0x0359, B:136:0x036e, B:137:0x0372, B:139:0x0383, B:141:0x0393, B:143:0x039a, B:147:0x03a6, B:152:0x03c0, B:162:0x03db, B:149:0x03ad, B:151:0x03b9), top: B:377:0x0353 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x036d A[LOOP:7: B:135:0x036d->B:155:0x03cb, LOOP_START, PHI: r7 r8
      0x036d: PHI (r7v52 M2.g) = (r7v50 M2.g), (r7v54 M2.g) binds: [B:127:0x0357, B:155:0x03cb] A[DONT_GENERATE, DONT_INLINE]
      0x036d: PHI (r8v34 com.google.android.gms.internal.measurement.zzfn$zzf) = 
      (r8v6 com.google.android.gms.internal.measurement.zzfn$zzf)
      (r8v36 com.google.android.gms.internal.measurement.zzfn$zzf)
     binds: [B:127:0x0357, B:155:0x03cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:141:0x0393 A[Catch: all -> 0x0362, SQLiteException -> 0x0366, TRY_LEAVE, TryCatch #1 {all -> 0x0362, blocks: (B:126:0x0353, B:128:0x0359, B:136:0x036e, B:137:0x0372, B:139:0x0383, B:141:0x0393, B:143:0x039a, B:147:0x03a6, B:152:0x03c0, B:162:0x03db, B:149:0x03ad, B:151:0x03b9), top: B:377:0x0353 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x03a4  */
    /* JADX WARN: Code duplicated, block: B:155:0x03cb A[LOOP:7: B:135:0x036d->B:155:0x03cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:164:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:169:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:173:0x040b  */
    /* JADX WARN: Code duplicated, block: B:179:0x0439  */
    /* JADX WARN: Code duplicated, block: B:181:0x0460  */
    /* JADX WARN: Code duplicated, block: B:182:0x0462  */
    /* JADX WARN: Code duplicated, block: B:185:0x047b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0483  */
    /* JADX WARN: Code duplicated, block: B:190:0x0496  */
    /* JADX WARN: Code duplicated, block: B:192:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:194:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:197:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:198:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:201:0x0517  */
    /* JADX WARN: Code duplicated, block: B:204:0x0522  */
    /* JADX WARN: Code duplicated, block: B:207:0x0532  */
    /* JADX WARN: Code duplicated, block: B:210:0x0545 A[LOOP:3: B:208:0x053f->B:210:0x0545, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:212:0x0565  */
    /* JADX WARN: Code duplicated, block: B:215:0x0574  */
    /* JADX WARN: Code duplicated, block: B:240:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:243:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:246:0x060c A[LOOP:4: B:241:0x05e4->B:246:0x060c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:250:0x0628  */
    /* JADX WARN: Code duplicated, block: B:256:0x0648  */
    /* JADX WARN: Code duplicated, block: B:257:0x0651  */
    /* JADX WARN: Code duplicated, block: B:263:0x0666  */
    /* JADX WARN: Code duplicated, block: B:264:0x066f  */
    /* JADX WARN: Code duplicated, block: B:268:0x067a  */
    /* JADX WARN: Code duplicated, block: B:273:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:278:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:282:0x06e3  */
    /* JADX WARN: Code duplicated, block: B:284:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:287:0x070a  */
    /* JADX WARN: Code duplicated, block: B:290:0x071c  */
    /* JADX WARN: Code duplicated, block: B:294:0x0729  */
    /* JADX WARN: Code duplicated, block: B:296:0x072d  */
    /* JADX WARN: Code duplicated, block: B:299:0x074c  */
    /* JADX WARN: Code duplicated, block: B:305:0x0769  */
    /* JADX WARN: Code duplicated, block: B:308:0x0773  */
    /* JADX WARN: Code duplicated, block: B:310:0x0777  */
    /* JADX WARN: Code duplicated, block: B:312:0x077d  */
    /* JADX WARN: Code duplicated, block: B:313:0x078c  */
    /* JADX WARN: Code duplicated, block: B:315:0x0792  */
    /* JADX WARN: Code duplicated, block: B:317:0x079a  */
    /* JADX WARN: Code duplicated, block: B:319:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:323:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:329:0x07f2 A[EDGE_INSN: B:329:0x07f2->B:332:0x0827 BREAK  A[LOOP:4: B:241:0x05e4->B:246:0x060c]] */
    /* JADX WARN: Code duplicated, block: B:330:0x080c  */
    /* JADX WARN: Code duplicated, block: B:359:0x087a  */
    /* JADX WARN: Code duplicated, block: B:361:0x0888  */
    /* JADX WARN: Code duplicated, block: B:362:0x0891  */
    /* JADX WARN: Code duplicated, block: B:365:0x08a0 A[LOOP:2: B:177:0x0433->B:365:0x08a0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:369:0x08cb  */
    /* JADX WARN: Code duplicated, block: B:372:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:383:0x07a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:0x0428 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x041c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:413:0x08b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:414:0x08bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:416:0x0614 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x05fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:418:0x06a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0638 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:420:0x0656 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:421:0x0674 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:422:0x063e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:423:0x065c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0686 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:426:0x0622 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:430:0x0825 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x06d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x06f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:433:0x05ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0722 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x0733 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x05ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x076f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x07f0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x07d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x07be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x05ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x07bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x0726 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:444:0x0726 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x0726 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x03c6 A[EDGE_INSN: B:446:0x03c6->B:154:0x03c6 BREAK  A[LOOP:7: B:135:0x036d->B:155:0x03cb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0138  */
    /* JADX WARN: Code duplicated, block: B:72:0x013e  */
    /* JADX WARN: Code duplicated, block: B:97:0x01f2  */
    public final void g1(List list, boolean z6) throws Throwable {
        Iterator it;
        zzfn.zzf zzfVar;
        Iterable iterable;
        zzfn.zzf zzfVar2;
        C0298g c0298gY0;
        String str;
        String strO;
        C0302k c0302kM1;
        C0302k c0302k;
        zzhj zzhjVar;
        String strO2;
        Map map;
        Iterator it2;
        Integer num;
        Iterator it3;
        boolean z10;
        p212w.i iVar;
        Map map2;
        p212w.i iVar2;
        zzff.zzb zzbVar;
        C0294c c0294c;
        String str2;
        int iD;
        p212w.i iVar3;
        w0 w0Var;
        boolean z11;
        long j;
        Iterator it4;
        boolean z12;
        Integer numValueOf;
        HashSet hashSet;
        Iterator<E> it5;
        p212w.e eVar;
        boolean z13;
        Iterator<E> it6;
        Iterator<E> it7;
        Boolean bool;
        zzff.zzc zzcVar;
        boolean z14;
        String strE;
        Object obj;
        String str3;
        zzff.zzd zzdVarC;
        Boolean boolE;
        Boolean boolE2;
        Boolean boolB;
        zzfn.zzh zzhVar;
        Long lValueOf;
        Double dValueOf;
        zzff.zzc zzcVar2;
        Integer numValueOf2;
        zznl zznlVarX0;
        StringBuilder sbC;
        int i10;
        String strO1;
        Iterator<E> it8;
        C0298g c0298gY1;
        String str4;
        p212w.e eVar2;
        Cursor cursor;
        C0298g c0298g;
        Cursor cursorQuery;
        int i11;
        List arrayList;
        Cursor cursor2;
        Cursor cursorRawQuery;
        Pair pairCreate;
        Object obj2;
        Cursor cursor3;
        Iterable iterable2;
        if (list.isEmpty()) {
            return;
        }
        boolean z15 = false;
        p212w.e eVar3 = new p212w.e(0);
        Iterator it9 = list.iterator();
        zzfn.zzf zzfVar3 = null;
        Long l4 = null;
        long jLongValue = 0;
        p212w.i iVar4 = eVar3;
        while (it9.hasNext()) {
            zzfn.zzf zzfVar4 = (zzfn.zzf) it9.next();
            String str5 = this.f3124v;
            String strO3 = zzfVar4.O();
            zzjt zzjtVarP = zzfVar4.P();
            X0();
            Long l10 = (Long) zznl.G1(zzfVar4, "_eid");
            boolean z16 = l10 != null ? true : z15;
            if (z16 && strO3.equals("_ep")) {
                Preconditions.i(l10);
                X0();
                String str6 = (String) zznl.G1(zzfVar4, "_en");
                if (TextUtils.isEmpty(str6)) {
                    i().f9057y.a(l10, "Extra parameter without an event name. eventId");
                    it = it9;
                } else {
                    if (zzfVar3 == null || l4 == null || l10.longValue() != l4.longValue()) {
                        C0298g c0298gY2 = Y0();
                        c0298gY2.W0();
                        c0298gY2.a1();
                        try {
                            cursorRawQuery = c0298gY2.d1().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str5, String.valueOf(l10)});
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    cursor3 = cursorRawQuery;
                                    try {
                                        try {
                                            try {
                                                pairCreate = Pair.create((zzfn.zzf) ((zzfn.zzf.zza) zznl.k1(zzfn.zzf.M(), cursorRawQuery.getBlob(0))).o(), Long.valueOf(cursorRawQuery.getLong(1)));
                                                cursor3.close();
                                                it = it9;
                                            } catch (SQLiteException e10) {
                                                e = e10;
                                                it = it9;
                                                cursorRawQuery = cursor3;
                                                c0298gY2.i().f9056x.a(e, "Error selecting main event");
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                pairCreate = null;
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor2 = cursor3;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (IOException e11) {
                                        try {
                                            it = it9;
                                            try {
                                                c0298gY2.i().f9056x.d("Failed to merge main event. appId, eventId", zzfw.a1(str5), l10, e11);
                                                cursor3.close();
                                            } catch (SQLiteException e12) {
                                                e = e12;
                                                cursorRawQuery = cursor3;
                                                c0298gY2.i().f9056x.a(e, "Error selecting main event");
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                            }
                                        } catch (SQLiteException e13) {
                                            e = e13;
                                            it = it9;
                                            cursorRawQuery = cursor3;
                                            c0298gY2.i().f9056x.a(e, "Error selecting main event");
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            pairCreate = null;
                                            if (pairCreate != null) {
                                            }
                                            i().f9057y.c("Extra parameter without existing main event. eventName, eventId", str6, l10);
                                            zzfVar = zzfVar4;
                                            zzfVar2 = null;
                                            if (zzfVar2 != null) {
                                                c0298gY0 = Y0();
                                                str = this.f3124v;
                                                strO = zzfVar2.O();
                                                c0302kM1 = c0298gY0.M1("events", str, zzfVar.O());
                                                if (c0302kM1 == null) {
                                                    c0298gY0.i().f9047A.c("Event aggregate wasn't created during raw event logging. appId, event", zzfw.a1(str), ((zzhj) c0298gY0.f577s).f9119E.c(strO));
                                                    c0302k = new C0302k(str, zzfVar.O(), 1L, 1L, 1L, zzfVar.L(), 0L, null, null, null, null);
                                                } else {
                                                    c0302k = new C0302k(c0302kM1.a, c0302kM1.f3034b, c0302kM1.f3035c + 1, c0302kM1.f3036d + 1, c0302kM1.f3037e + 1, c0302kM1.f3038f, c0302kM1.f3039g, c0302kM1.f3040h, c0302kM1.f3041i, c0302kM1.j, c0302kM1.f3042k);
                                                }
                                                Y0().t1("events", c0302k);
                                                zznk.a();
                                                zzhjVar = (zzhj) this.f577s;
                                                if (zzhjVar.f9146y.h1(null, zzbf.f8968V0)) {
                                                    strO2 = zzfVar2.O();
                                                    map = (Map) iVar4.get(strO2);
                                                    if (map == null) {
                                                        c0298gY1 = Y0();
                                                        str4 = this.f3124v;
                                                        c0298gY1.a1();
                                                        c0298gY1.W0();
                                                        Preconditions.e(str4);
                                                        Preconditions.e(strO2);
                                                        eVar2 = new p212w.e(0);
                                                        try {
                                                            cursorQuery = c0298gY1.d1().query("event_filters", new String[]{"audience_id", JsonStorageKeyNames.DATA_KEY}, "app_id=? AND event_name=?", new String[]{str4, strO2}, null, null, null);
                                                            try {
                                                                try {
                                                                    if (cursorQuery.moveToFirst()) {
                                                                        while (true) {
                                                                            try {
                                                                                zzff.zzb zzbVar2 = (zzff.zzb) ((zzff.zzb.zza) zznl.k1(zzff.zzb.E(), cursorQuery.getBlob(1))).o();
                                                                                i11 = cursorQuery.getInt(0);
                                                                                arrayList = (List) eVar2.get(Integer.valueOf(i11));
                                                                                if (arrayList == null) {
                                                                                    arrayList = new ArrayList();
                                                                                    c0298g = c0298gY1;
                                                                                    try {
                                                                                        eVar2.put(Integer.valueOf(i11), arrayList);
                                                                                    } catch (SQLiteException e14) {
                                                                                        e = e14;
                                                                                        zzfVar3 = zzfVar3;
                                                                                        c0298g.i().f9056x.c("Database error querying filters. appId", zzfw.a1(str4), e);
                                                                                        map = Collections.EMPTY_MAP;
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                        }
                                                                                        iVar4.put(strO2, map);
                                                                                        it2 = map.keySet().iterator();
                                                                                        while (it2.hasNext()) {
                                                                                            num = (Integer) it2.next();
                                                                                            num.getClass();
                                                                                            if (this.f3125w.contains(num)) {
                                                                                                i().f9052F.a(num, "Skipping failed audience ID");
                                                                                            } else {
                                                                                                it3 = ((List) map.get(num)).iterator();
                                                                                                z10 = true;
                                                                                                iVar = iVar4;
                                                                                                while (true) {
                                                                                                    if (it3.hasNext()) {
                                                                                                        map2 = map;
                                                                                                        iVar2 = iVar;
                                                                                                        c0302k = c0302k;
                                                                                                        it2 = it2;
                                                                                                        l4 = l4;
                                                                                                        jLongValue = jLongValue;
                                                                                                        break;
                                                                                                    }
                                                                                                    zzbVar = (zzff.zzb) it3.next();
                                                                                                    str2 = this.f3124v;
                                                                                                    c0294c = new C0294c();
                                                                                                    c0294c.f2976e = zzbVar;
                                                                                                    Long l11 = this.f3127y;
                                                                                                    map2 = map;
                                                                                                    Long l12 = this.f3128z;
                                                                                                    iD = zzbVar.D();
                                                                                                    iVar3 = iVar;
                                                                                                    w0Var = (w0) this.f3126x.get(num);
                                                                                                    if (w0Var == null) {
                                                                                                        z11 = false;
                                                                                                    } else {
                                                                                                        z11 = w0Var.f3155d.get(iD);
                                                                                                    }
                                                                                                    zzoc.a();
                                                                                                    boolean z17 = z11;
                                                                                                    boolean zH1 = zzhjVar.f9146y.h1(str2, zzbf.f8992k0);
                                                                                                    if (zzbVar.L()) {
                                                                                                        j = c0302k.f3037e;
                                                                                                    } else {
                                                                                                        j = c0302k.f3035c;
                                                                                                    }
                                                                                                    it4 = it3;
                                                                                                    if (i().e1(2)) {
                                                                                                        zzfw zzfwVarI = i();
                                                                                                        if (zzbVar.N()) {
                                                                                                            numValueOf2 = Integer.valueOf(zzbVar.D());
                                                                                                        } else {
                                                                                                            numValueOf2 = null;
                                                                                                        }
                                                                                                        zzfwVarI.f9052F.d("Evaluating filter. audience, filter, event", num, numValueOf2, zzhjVar.f9119E.c(zzbVar.H()));
                                                                                                        zzfw zzfwVarI2 = i();
                                                                                                        zznlVarX0 = X0();
                                                                                                        sbC = p239z.e.c("\nevent_filter {\n");
                                                                                                        if (zzbVar.N()) {
                                                                                                            i10 = 0;
                                                                                                            zznl.C1(sbC, 0, "filter_id", Integer.valueOf(zzbVar.D()));
                                                                                                        } else {
                                                                                                            i10 = 0;
                                                                                                        }
                                                                                                        zznl.C1(sbC, i10, "event_name", ((zzhj) zznlVarX0.f577s).f9119E.c(zzbVar.H()));
                                                                                                        strO1 = zznl.o1(zzbVar.J(), zzbVar.K(), zzbVar.L());
                                                                                                        if (!strO1.isEmpty()) {
                                                                                                            zznl.C1(sbC, i10, "filter_type", strO1);
                                                                                                        }
                                                                                                        if (zzbVar.M()) {
                                                                                                            zznl.B1(sbC, 1, "event_count_filter", zzbVar.G());
                                                                                                        }
                                                                                                        if (zzbVar.z() > 0) {
                                                                                                            sbC.append("  filters {\n");
                                                                                                            it8 = zzbVar.I().iterator();
                                                                                                            while (it8.hasNext()) {
                                                                                                                zznlVarX0.z1(sbC, 2, (zzff.zzc) it8.next());
                                                                                                            }
                                                                                                        }
                                                                                                        z12 = true;
                                                                                                        zznl.y1(sbC, 1);
                                                                                                        sbC.append("}\n}\n");
                                                                                                        zzfwVarI2.f9052F.a(sbC.toString(), "Filter definition");
                                                                                                    } else {
                                                                                                        l4 = l4;
                                                                                                        jLongValue = jLongValue;
                                                                                                        z12 = true;
                                                                                                    }
                                                                                                    if (!zzbVar.N()) {
                                                                                                        zzfw zzfwVarI3 = i();
                                                                                                        r rVarA1 = zzfw.a1(str2);
                                                                                                        if (zzbVar.N()) {
                                                                                                            numValueOf = Integer.valueOf(zzbVar.D());
                                                                                                        } else {
                                                                                                            numValueOf = null;
                                                                                                        }
                                                                                                        zzfwVarI3.f9047A.c("Invalid event filter ID. appId, id", rVarA1, String.valueOf(numValueOf));
                                                                                                        z10 = false;
                                                                                                    } else {
                                                                                                        zzfw zzfwVarI4 = i();
                                                                                                        r rVarA2 = zzfw.a1(str2);
                                                                                                        if (zzbVar.N()) {
                                                                                                            numValueOf = Integer.valueOf(zzbVar.D());
                                                                                                        } else {
                                                                                                            numValueOf = null;
                                                                                                        }
                                                                                                        zzfwVarI4.f9047A.c("Invalid event filter ID. appId, id", rVarA2, String.valueOf(numValueOf));
                                                                                                        z10 = false;
                                                                                                    }
                                                                                                    if (!z10) {
                                                                                                        this.f3125w.add(num);
                                                                                                        iVar2 = iVar3;
                                                                                                        break;
                                                                                                    }
                                                                                                    d1(num).a(c0294c);
                                                                                                    map = map2;
                                                                                                    iVar = iVar3;
                                                                                                    it3 = it4;
                                                                                                    c0302k = c0302k;
                                                                                                    it2 = it2;
                                                                                                    l4 = l4;
                                                                                                    jLongValue = jLongValue;
                                                                                                }
                                                                                                if (!z10) {
                                                                                                    this.f3125w.add(num);
                                                                                                }
                                                                                                map = map2;
                                                                                                iVar4 = iVar2;
                                                                                                c0302k = c0302k;
                                                                                                it2 = it2;
                                                                                                l4 = l4;
                                                                                                jLongValue = jLongValue;
                                                                                            }
                                                                                        }
                                                                                        zzfVar3 = zzfVar3;
                                                                                        it9 = it;
                                                                                        z15 = false;
                                                                                        iVar4 = iVar4;
                                                                                    }
                                                                                } else {
                                                                                    c0298g = c0298gY1;
                                                                                }
                                                                                arrayList.add(zzbVar2);
                                                                            } catch (IOException e15) {
                                                                                c0298g = c0298gY1;
                                                                                c0298g.i().f9056x.c("Failed to merge filter. appId", zzfw.a1(str4), e15);
                                                                            }
                                                                            try {
                                                                                if (!cursorQuery.moveToNext()) {
                                                                                    break;
                                                                                }
                                                                                zzfVar3 = zzfVar3;
                                                                                c0298gY1 = c0298g;
                                                                            } catch (SQLiteException e16) {
                                                                                e = e16;
                                                                                c0298g.i().f9056x.c("Database error querying filters. appId", zzfw.a1(str4), e);
                                                                                map = Collections.EMPTY_MAP;
                                                                                if (cursorQuery != null) {
                                                                                    cursorQuery.close();
                                                                                }
                                                                            }
                                                                        }
                                                                        cursorQuery.close();
                                                                        map = eVar2;
                                                                    } else {
                                                                        map = Collections.EMPTY_MAP;
                                                                        cursorQuery.close();
                                                                        zzfVar3 = zzfVar3;
                                                                    }
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                    cursor = cursorQuery;
                                                                    if (cursor != null) {
                                                                        cursor.close();
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (SQLiteException e17) {
                                                                e = e17;
                                                                c0298g = c0298gY1;
                                                            }
                                                        } catch (SQLiteException e18) {
                                                            e = e18;
                                                            c0298g = c0298gY1;
                                                            zzfVar3 = zzfVar3;
                                                            cursorQuery = null;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            cursor = null;
                                                        }
                                                        iVar4.put(strO2, map);
                                                    } else {
                                                        zzfVar3 = zzfVar3;
                                                    }
                                                    it2 = map.keySet().iterator();
                                                    while (it2.hasNext()) {
                                                        num = (Integer) it2.next();
                                                        num.getClass();
                                                        if (this.f3125w.contains(num)) {
                                                            i().f9052F.a(num, "Skipping failed audience ID");
                                                        } else {
                                                            it3 = ((List) map.get(num)).iterator();
                                                            z10 = true;
                                                            iVar = iVar4;
                                                            while (true) {
                                                                if (it3.hasNext()) {
                                                                    map2 = map;
                                                                    iVar2 = iVar;
                                                                    c0302k = c0302k;
                                                                    it2 = it2;
                                                                    l4 = l4;
                                                                    jLongValue = jLongValue;
                                                                    break;
                                                                }
                                                                zzbVar = (zzff.zzb) it3.next();
                                                                str2 = this.f3124v;
                                                                c0294c = new C0294c();
                                                                c0294c.f2976e = zzbVar;
                                                                Long l13 = this.f3127y;
                                                                map2 = map;
                                                                Long l14 = this.f3128z;
                                                                iD = zzbVar.D();
                                                                iVar3 = iVar;
                                                                w0Var = (w0) this.f3126x.get(num);
                                                                if (w0Var == null) {
                                                                    z11 = false;
                                                                } else {
                                                                    z11 = w0Var.f3155d.get(iD);
                                                                }
                                                                zzoc.a();
                                                                boolean z18 = z11;
                                                                boolean zH2 = zzhjVar.f9146y.h1(str2, zzbf.f8992k0);
                                                                if (zzbVar.L()) {
                                                                    j = c0302k.f3037e;
                                                                } else {
                                                                    j = c0302k.f3035c;
                                                                }
                                                                it4 = it3;
                                                                if (i().e1(2)) {
                                                                    zzfw zzfwVarI5 = i();
                                                                    if (zzbVar.N()) {
                                                                        numValueOf2 = Integer.valueOf(zzbVar.D());
                                                                    } else {
                                                                        numValueOf2 = null;
                                                                    }
                                                                    zzfwVarI5.f9052F.d("Evaluating filter. audience, filter, event", num, numValueOf2, zzhjVar.f9119E.c(zzbVar.H()));
                                                                    zzfw zzfwVarI6 = i();
                                                                    zznlVarX0 = X0();
                                                                    sbC = p239z.e.c("\nevent_filter {\n");
                                                                    if (zzbVar.N()) {
                                                                        i10 = 0;
                                                                        zznl.C1(sbC, 0, "filter_id", Integer.valueOf(zzbVar.D()));
                                                                    } else {
                                                                        i10 = 0;
                                                                    }
                                                                    zznl.C1(sbC, i10, "event_name", ((zzhj) zznlVarX0.f577s).f9119E.c(zzbVar.H()));
                                                                    strO1 = zznl.o1(zzbVar.J(), zzbVar.K(), zzbVar.L());
                                                                    if (!strO1.isEmpty()) {
                                                                        zznl.C1(sbC, i10, "filter_type", strO1);
                                                                    }
                                                                    if (zzbVar.M()) {
                                                                        zznl.B1(sbC, 1, "event_count_filter", zzbVar.G());
                                                                    }
                                                                    if (zzbVar.z() > 0) {
                                                                        sbC.append("  filters {\n");
                                                                        it8 = zzbVar.I().iterator();
                                                                        while (it8.hasNext()) {
                                                                            zznlVarX0.z1(sbC, 2, (zzff.zzc) it8.next());
                                                                        }
                                                                    }
                                                                    z12 = true;
                                                                    zznl.y1(sbC, 1);
                                                                    sbC.append("}\n}\n");
                                                                    zzfwVarI6.f9052F.a(sbC.toString(), "Filter definition");
                                                                } else {
                                                                    l4 = l4;
                                                                    jLongValue = jLongValue;
                                                                    z12 = true;
                                                                }
                                                                if (!zzbVar.N()) {
                                                                    zzfw zzfwVarI7 = i();
                                                                    r rVarA3 = zzfw.a1(str2);
                                                                    if (zzbVar.N()) {
                                                                        numValueOf = Integer.valueOf(zzbVar.D());
                                                                    } else {
                                                                        numValueOf = null;
                                                                    }
                                                                    zzfwVarI7.f9047A.c("Invalid event filter ID. appId, id", rVarA3, String.valueOf(numValueOf));
                                                                    z10 = false;
                                                                } else {
                                                                    zzfw zzfwVarI8 = i();
                                                                    r rVarA4 = zzfw.a1(str2);
                                                                    if (zzbVar.N()) {
                                                                        numValueOf = Integer.valueOf(zzbVar.D());
                                                                    } else {
                                                                        numValueOf = null;
                                                                    }
                                                                    zzfwVarI8.f9047A.c("Invalid event filter ID. appId, id", rVarA4, String.valueOf(numValueOf));
                                                                    z10 = false;
                                                                }
                                                                if (!z10) {
                                                                    this.f3125w.add(num);
                                                                    iVar2 = iVar3;
                                                                    break;
                                                                }
                                                                d1(num).a(c0294c);
                                                                map = map2;
                                                                iVar = iVar3;
                                                                it3 = it4;
                                                                c0302k = c0302k;
                                                                it2 = it2;
                                                                l4 = l4;
                                                                jLongValue = jLongValue;
                                                            }
                                                            if (!z10) {
                                                                this.f3125w.add(num);
                                                            }
                                                            map = map2;
                                                            iVar4 = iVar2;
                                                            c0302k = c0302k;
                                                            it2 = it2;
                                                            l4 = l4;
                                                            jLongValue = jLongValue;
                                                        }
                                                    }
                                                    zzfVar3 = zzfVar3;
                                                } else {
                                                    strO2 = zzfVar2.O();
                                                    map = (Map) iVar4.get(strO2);
                                                    if (map == null) {
                                                        c0298gY1 = Y0();
                                                        str4 = this.f3124v;
                                                        c0298gY1.a1();
                                                        c0298gY1.W0();
                                                        Preconditions.e(str4);
                                                        Preconditions.e(strO2);
                                                        eVar2 = new p212w.e(0);
                                                        cursorQuery = c0298gY1.d1().query("event_filters", new String[]{"audience_id", JsonStorageKeyNames.DATA_KEY}, "app_id=? AND event_name=?", new String[]{str4, strO2}, null, null, null);
                                                        if (cursorQuery.moveToFirst()) {
                                                            map = Collections.EMPTY_MAP;
                                                            cursorQuery.close();
                                                            zzfVar3 = zzfVar3;
                                                        } else {
                                                            while (true) {
                                                                zzff.zzb zzbVar3 = (zzff.zzb) ((zzff.zzb.zza) zznl.k1(zzff.zzb.E(), cursorQuery.getBlob(1))).o();
                                                                i11 = cursorQuery.getInt(0);
                                                                arrayList = (List) eVar2.get(Integer.valueOf(i11));
                                                                if (arrayList == null) {
                                                                    arrayList = new ArrayList();
                                                                    c0298g = c0298gY1;
                                                                    eVar2.put(Integer.valueOf(i11), arrayList);
                                                                } else {
                                                                    c0298g = c0298gY1;
                                                                }
                                                                arrayList.add(zzbVar3);
                                                                if (!cursorQuery.moveToNext()) {
                                                                    break;
                                                                    break;
                                                                } else {
                                                                    zzfVar3 = zzfVar3;
                                                                    c0298gY1 = c0298g;
                                                                }
                                                            }
                                                            cursorQuery.close();
                                                            map = eVar2;
                                                        }
                                                        iVar4.put(strO2, map);
                                                    } else {
                                                        zzfVar3 = zzfVar3;
                                                    }
                                                    it2 = map.keySet().iterator();
                                                    while (it2.hasNext()) {
                                                        num = (Integer) it2.next();
                                                        num.getClass();
                                                        if (this.f3125w.contains(num)) {
                                                            i().f9052F.a(num, "Skipping failed audience ID");
                                                        } else {
                                                            it3 = ((List) map.get(num)).iterator();
                                                            z10 = true;
                                                            iVar = iVar4;
                                                            while (true) {
                                                                if (it3.hasNext()) {
                                                                    map2 = map;
                                                                    iVar2 = iVar;
                                                                    c0302k = c0302k;
                                                                    it2 = it2;
                                                                    l4 = l4;
                                                                    jLongValue = jLongValue;
                                                                    break;
                                                                }
                                                                zzbVar = (zzff.zzb) it3.next();
                                                                str2 = this.f3124v;
                                                                c0294c = new C0294c();
                                                                c0294c.f2976e = zzbVar;
                                                                Long l15 = this.f3127y;
                                                                map2 = map;
                                                                Long l16 = this.f3128z;
                                                                iD = zzbVar.D();
                                                                iVar3 = iVar;
                                                                w0Var = (w0) this.f3126x.get(num);
                                                                if (w0Var == null) {
                                                                    z11 = false;
                                                                } else {
                                                                    z11 = w0Var.f3155d.get(iD);
                                                                }
                                                                zzoc.a();
                                                                boolean z19 = z11;
                                                                boolean zH3 = zzhjVar.f9146y.h1(str2, zzbf.f8992k0);
                                                                if (zzbVar.L()) {
                                                                    j = c0302k.f3037e;
                                                                } else {
                                                                    j = c0302k.f3035c;
                                                                }
                                                                it4 = it3;
                                                                if (i().e1(2)) {
                                                                    zzfw zzfwVarI9 = i();
                                                                    if (zzbVar.N()) {
                                                                        numValueOf2 = Integer.valueOf(zzbVar.D());
                                                                    } else {
                                                                        numValueOf2 = null;
                                                                    }
                                                                    zzfwVarI9.f9052F.d("Evaluating filter. audience, filter, event", num, numValueOf2, zzhjVar.f9119E.c(zzbVar.H()));
                                                                    zzfw zzfwVarI10 = i();
                                                                    zznlVarX0 = X0();
                                                                    sbC = p239z.e.c("\nevent_filter {\n");
                                                                    if (zzbVar.N()) {
                                                                        i10 = 0;
                                                                        zznl.C1(sbC, 0, "filter_id", Integer.valueOf(zzbVar.D()));
                                                                    } else {
                                                                        i10 = 0;
                                                                    }
                                                                    zznl.C1(sbC, i10, "event_name", ((zzhj) zznlVarX0.f577s).f9119E.c(zzbVar.H()));
                                                                    strO1 = zznl.o1(zzbVar.J(), zzbVar.K(), zzbVar.L());
                                                                    if (!strO1.isEmpty()) {
                                                                        zznl.C1(sbC, i10, "filter_type", strO1);
                                                                    }
                                                                    if (zzbVar.M()) {
                                                                        zznl.B1(sbC, 1, "event_count_filter", zzbVar.G());
                                                                    }
                                                                    if (zzbVar.z() > 0) {
                                                                        sbC.append("  filters {\n");
                                                                        it8 = zzbVar.I().iterator();
                                                                        while (it8.hasNext()) {
                                                                            zznlVarX0.z1(sbC, 2, (zzff.zzc) it8.next());
                                                                        }
                                                                    }
                                                                    z12 = true;
                                                                    zznl.y1(sbC, 1);
                                                                    sbC.append("}\n}\n");
                                                                    zzfwVarI10.f9052F.a(sbC.toString(), "Filter definition");
                                                                } else {
                                                                    l4 = l4;
                                                                    jLongValue = jLongValue;
                                                                    z12 = true;
                                                                }
                                                                if (!zzbVar.N()) {
                                                                    zzfw zzfwVarI11 = i();
                                                                    r rVarA5 = zzfw.a1(str2);
                                                                    if (zzbVar.N()) {
                                                                        numValueOf = Integer.valueOf(zzbVar.D());
                                                                    } else {
                                                                        numValueOf = null;
                                                                    }
                                                                    zzfwVarI11.f9047A.c("Invalid event filter ID. appId, id", rVarA5, String.valueOf(numValueOf));
                                                                    z10 = false;
                                                                } else {
                                                                    zzfw zzfwVarI12 = i();
                                                                    r rVarA6 = zzfw.a1(str2);
                                                                    if (zzbVar.N()) {
                                                                        numValueOf = Integer.valueOf(zzbVar.D());
                                                                    } else {
                                                                        numValueOf = null;
                                                                    }
                                                                    zzfwVarI12.f9047A.c("Invalid event filter ID. appId, id", rVarA6, String.valueOf(numValueOf));
                                                                    z10 = false;
                                                                }
                                                                if (!z10) {
                                                                    this.f3125w.add(num);
                                                                    iVar2 = iVar3;
                                                                    break;
                                                                }
                                                                d1(num).a(c0294c);
                                                                map = map2;
                                                                iVar = iVar3;
                                                                it3 = it4;
                                                                c0302k = c0302k;
                                                                it2 = it2;
                                                                l4 = l4;
                                                                jLongValue = jLongValue;
                                                            }
                                                            if (!z10) {
                                                                this.f3125w.add(num);
                                                            }
                                                            map = map2;
                                                            iVar4 = iVar2;
                                                            c0302k = c0302k;
                                                            it2 = it2;
                                                            l4 = l4;
                                                            jLongValue = jLongValue;
                                                        }
                                                    }
                                                    zzfVar3 = zzfVar3;
                                                }
                                            }
                                            it9 = it;
                                            z15 = false;
                                            iVar4 = iVar4;
                                        }
                                        pairCreate = null;
                                    }
                                    if (pairCreate != null || (obj2 = pairCreate.first) == null) {
                                        i().f9057y.c("Extra parameter without existing main event. eventName, eventId", str6, l10);
                                    } else {
                                        zzfVar3 = (zzfn.zzf) obj2;
                                        jLongValue = ((Long) pairCreate.second).longValue();
                                        X0();
                                        l4 = (Long) zznl.G1(zzfVar3, "_eid");
                                    }
                                } else {
                                    try {
                                        try {
                                            c0298gY2.i().f9052F.b("Main event not found");
                                            cursorRawQuery.close();
                                            it = it9;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            cursor2 = cursorRawQuery;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e19) {
                                        e = e19;
                                        it = it9;
                                        c0298gY2.i().f9056x.a(e, "Error selecting main event");
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                    }
                                }
                            } catch (SQLiteException e20) {
                                e = e20;
                            } catch (Throwable th5) {
                                th = th5;
                                cursor3 = cursorRawQuery;
                            }
                        } catch (SQLiteException e21) {
                            e = e21;
                            it = it9;
                            cursorRawQuery = null;
                        } catch (Throwable th6) {
                            th = th6;
                            cursor2 = null;
                        }
                        pairCreate = null;
                        if (pairCreate != null) {
                        }
                        i().f9057y.c("Extra parameter without existing main event. eventName, eventId", str6, l10);
                    } else {
                        it = it9;
                    }
                    zzfn.zzf zzfVar5 = zzfVar3;
                    long j10 = jLongValue - 1;
                    if (j10 <= 0) {
                        C0298g c0298gY3 = Y0();
                        c0298gY3.W0();
                        c0298gY3.i().f9052F.a(str5, "Clearing complex main event info. appId");
                        try {
                            c0298gY3.d1().execSQL("delete from main_event_params where app_id=?", new String[]{str5});
                        } catch (SQLiteException e22) {
                            c0298gY3.i().f9056x.a(e22, "Error clearing complex main event");
                        }
                    } else {
                        Y0().w1(str5, l10, j10, zzfVar5);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (zzfn.zzh zzhVar2 : zzfVar5.P()) {
                        X0();
                        if (zznl.j1(zzfVar4, zzhVar2.P()) == null) {
                            arrayList2.add(zzhVar2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        i().f9057y.a(str6, "No unique parameters in main event. eventName");
                        iterable2 = zzjtVarP;
                    } else {
                        arrayList2.addAll(zzjtVarP);
                        iterable2 = arrayList2;
                    }
                    strO3 = str6;
                    jLongValue = j10;
                    zzfVar3 = zzfVar5;
                    zzfVar = zzfVar4;
                    iterable = iterable2;
                }
                zzfVar = zzfVar4;
                zzfVar2 = null;
                if (zzfVar2 != null) {
                    c0298gY0 = Y0();
                    str = this.f3124v;
                    strO = zzfVar2.O();
                    c0302kM1 = c0298gY0.M1("events", str, zzfVar.O());
                    if (c0302kM1 == null) {
                        c0298gY0.i().f9047A.c("Event aggregate wasn't created during raw event logging. appId, event", zzfw.a1(str), ((zzhj) c0298gY0.f577s).f9119E.c(strO));
                        c0302k = new C0302k(str, zzfVar.O(), 1L, 1L, 1L, zzfVar.L(), 0L, null, null, null, null);
                    } else {
                        c0302k = new C0302k(c0302kM1.a, c0302kM1.f3034b, c0302kM1.f3035c + 1, c0302kM1.f3036d + 1, c0302kM1.f3037e + 1, c0302kM1.f3038f, c0302kM1.f3039g, c0302kM1.f3040h, c0302kM1.f3041i, c0302kM1.j, c0302kM1.f3042k);
                    }
                    Y0().t1("events", c0302k);
                    zznk.a();
                    zzhjVar = (zzhj) this.f577s;
                    if (zzhjVar.f9146y.h1(null, zzbf.f8968V0) || !z6) {
                        strO2 = zzfVar2.O();
                        map = (Map) iVar4.get(strO2);
                        if (map == null) {
                            c0298gY1 = Y0();
                            str4 = this.f3124v;
                            c0298gY1.a1();
                            c0298gY1.W0();
                            Preconditions.e(str4);
                            Preconditions.e(strO2);
                            eVar2 = new p212w.e(0);
                            cursorQuery = c0298gY1.d1().query("event_filters", new String[]{"audience_id", JsonStorageKeyNames.DATA_KEY}, "app_id=? AND event_name=?", new String[]{str4, strO2}, null, null, null);
                            if (cursorQuery.moveToFirst()) {
                                map = Collections.EMPTY_MAP;
                                cursorQuery.close();
                                zzfVar3 = zzfVar3;
                            } else {
                                while (true) {
                                    zzff.zzb zzbVar4 = (zzff.zzb) ((zzff.zzb.zza) zznl.k1(zzff.zzb.E(), cursorQuery.getBlob(1))).o();
                                    i11 = cursorQuery.getInt(0);
                                    arrayList = (List) eVar2.get(Integer.valueOf(i11));
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        c0298g = c0298gY1;
                                        eVar2.put(Integer.valueOf(i11), arrayList);
                                    } else {
                                        c0298g = c0298gY1;
                                    }
                                    arrayList.add(zzbVar4);
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                        break;
                                    } else {
                                        zzfVar3 = zzfVar3;
                                        c0298gY1 = c0298g;
                                    }
                                }
                                cursorQuery.close();
                                map = eVar2;
                            }
                            iVar4.put(strO2, map);
                        } else {
                            zzfVar3 = zzfVar3;
                        }
                        it2 = map.keySet().iterator();
                        while (it2.hasNext()) {
                            num = (Integer) it2.next();
                            num.getClass();
                            if (this.f3125w.contains(num)) {
                                i().f9052F.a(num, "Skipping failed audience ID");
                            } else {
                                it3 = ((List) map.get(num)).iterator();
                                z10 = true;
                                iVar = iVar4;
                                while (true) {
                                    if (it3.hasNext()) {
                                        map2 = map;
                                        iVar2 = iVar;
                                        c0302k = c0302k;
                                        it2 = it2;
                                        l4 = l4;
                                        jLongValue = jLongValue;
                                        break;
                                    }
                                    zzbVar = (zzff.zzb) it3.next();
                                    str2 = this.f3124v;
                                    c0294c = new C0294c();
                                    c0294c.f2976e = zzbVar;
                                    Long l17 = this.f3127y;
                                    map2 = map;
                                    Long l18 = this.f3128z;
                                    iD = zzbVar.D();
                                    iVar3 = iVar;
                                    w0Var = (w0) this.f3126x.get(num);
                                    if (w0Var == null) {
                                        z11 = false;
                                    } else {
                                        z11 = w0Var.f3155d.get(iD);
                                    }
                                    zzoc.a();
                                    boolean z110 = z11;
                                    boolean zH4 = zzhjVar.f9146y.h1(str2, zzbf.f8992k0);
                                    if (zzbVar.L()) {
                                        j = c0302k.f3037e;
                                    } else {
                                        j = c0302k.f3035c;
                                    }
                                    it4 = it3;
                                    if (i().e1(2)) {
                                        zzfw zzfwVarI13 = i();
                                        if (zzbVar.N()) {
                                            numValueOf2 = Integer.valueOf(zzbVar.D());
                                        } else {
                                            numValueOf2 = null;
                                        }
                                        zzfwVarI13.f9052F.d("Evaluating filter. audience, filter, event", num, numValueOf2, zzhjVar.f9119E.c(zzbVar.H()));
                                        zzfw zzfwVarI14 = i();
                                        zznlVarX0 = X0();
                                        sbC = p239z.e.c("\nevent_filter {\n");
                                        if (zzbVar.N()) {
                                            i10 = 0;
                                            zznl.C1(sbC, 0, "filter_id", Integer.valueOf(zzbVar.D()));
                                        } else {
                                            i10 = 0;
                                        }
                                        zznl.C1(sbC, i10, "event_name", ((zzhj) zznlVarX0.f577s).f9119E.c(zzbVar.H()));
                                        strO1 = zznl.o1(zzbVar.J(), zzbVar.K(), zzbVar.L());
                                        if (!strO1.isEmpty()) {
                                            zznl.C1(sbC, i10, "filter_type", strO1);
                                        }
                                        if (zzbVar.M()) {
                                            zznl.B1(sbC, 1, "event_count_filter", zzbVar.G());
                                        }
                                        if (zzbVar.z() > 0) {
                                            sbC.append("  filters {\n");
                                            it8 = zzbVar.I().iterator();
                                            while (it8.hasNext()) {
                                                zznlVarX0.z1(sbC, 2, (zzff.zzc) it8.next());
                                            }
                                        }
                                        z12 = true;
                                        zznl.y1(sbC, 1);
                                        sbC.append("}\n}\n");
                                        zzfwVarI14.f9052F.a(sbC.toString(), "Filter definition");
                                    } else {
                                        l4 = l4;
                                        jLongValue = jLongValue;
                                        z12 = true;
                                    }
                                    if (!zzbVar.N() && zzbVar.D() <= 256) {
                                        boolean z20 = (zzbVar.J() || zzbVar.K() || zzbVar.L()) ? z12 : false;
                                        if (!z110 || z20) {
                                            String strO4 = zzfVar2.O();
                                            if (!zzbVar.M()) {
                                                hashSet = new HashSet();
                                                it5 = zzbVar.I().iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        z13 = false;
                                                        eVar = new p212w.e(0);
                                                        it6 = zzfVar2.P().iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                it7 = zzbVar.I().iterator();
                                                                while (true) {
                                                                    if (it7.hasNext()) {
                                                                        bool = Boolean.TRUE;
                                                                        break;
                                                                    }
                                                                    zzcVar = (zzff.zzc) it7.next();
                                                                    if (zzcVar.G() || !zzcVar.F()) {
                                                                        z14 = z13;
                                                                    } else {
                                                                        z14 = z12;
                                                                    }
                                                                    strE = zzcVar.E();
                                                                    if (strE.isEmpty()) {
                                                                        i().f9047A.a(zzhjVar.f9119E.c(strO4), "Event has empty param name. event");
                                                                    } else {
                                                                        obj = eVar.get(strE);
                                                                        if (obj instanceof Long) {
                                                                            if (zzcVar.H()) {
                                                                                boolB = x0.b(((Long) obj).longValue(), zzcVar.C());
                                                                                if (boolB == null) {
                                                                                    if (boolB.booleanValue() == z14) {
                                                                                        bool = Boolean.FALSE;
                                                                                        break;
                                                                                    } else {
                                                                                        z13 = false;
                                                                                        z12 = true;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i().f9047A.c("No number filter for long param. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(strE));
                                                                            }
                                                                        } else if (obj instanceof Double) {
                                                                            if (zzcVar.H()) {
                                                                                double dDoubleValue = ((Double) obj).doubleValue();
                                                                                try {
                                                                                    boolE2 = x0.e(new BigDecimal(dDoubleValue), zzcVar.C(), Math.ulp(dDoubleValue));
                                                                                } catch (NumberFormatException unused) {
                                                                                    boolE2 = null;
                                                                                }
                                                                                if (boolE2 == null) {
                                                                                    if (boolE2.booleanValue() == z14) {
                                                                                        bool = Boolean.FALSE;
                                                                                        break;
                                                                                    } else {
                                                                                        z13 = false;
                                                                                        z12 = true;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i().f9047A.c("No number filter for double param. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(strE));
                                                                            }
                                                                        } else if (obj instanceof String) {
                                                                            if (zzcVar.J()) {
                                                                                boolE = x0.d((String) obj, zzcVar.D(), i());
                                                                            } else if (zzcVar.H()) {
                                                                                str3 = (String) obj;
                                                                                if (zznl.H1(str3)) {
                                                                                    zzdVarC = zzcVar.C();
                                                                                    if (zznl.H1(str3)) {
                                                                                        try {
                                                                                            boolE = x0.e(new BigDecimal(str3), zzdVarC, 0.0d);
                                                                                        } catch (NumberFormatException unused2) {
                                                                                            boolE = null;
                                                                                        }
                                                                                    } else {
                                                                                        boolE = null;
                                                                                    }
                                                                                } else {
                                                                                    i().f9047A.c("Invalid param value for number filter. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(strE));
                                                                                }
                                                                            } else {
                                                                                i().f9047A.c("No filter for String param. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(strE));
                                                                            }
                                                                            if (boolE == null) {
                                                                                if (boolE.booleanValue() == z14) {
                                                                                    bool = Boolean.FALSE;
                                                                                    break;
                                                                                } else {
                                                                                    z13 = false;
                                                                                    z12 = true;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (obj == null) {
                                                                                i().f9052F.c("Missing param for filter. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(strE));
                                                                                bool = Boolean.FALSE;
                                                                                break;
                                                                            }
                                                                            i().f9047A.c("Unknown param type. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(strE));
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                zzhVar = (zzfn.zzh) it6.next();
                                                                if (!hashSet.contains(zzhVar.P())) {
                                                                    if (zzhVar.U()) {
                                                                        String strP = zzhVar.P();
                                                                        if (zzhVar.U()) {
                                                                            lValueOf = Long.valueOf(zzhVar.L());
                                                                        } else {
                                                                            lValueOf = null;
                                                                        }
                                                                        eVar.put(strP, lValueOf);
                                                                    } else if (zzhVar.S()) {
                                                                        String strP2 = zzhVar.P();
                                                                        if (zzhVar.S()) {
                                                                            dValueOf = Double.valueOf(zzhVar.z());
                                                                        } else {
                                                                            dValueOf = null;
                                                                        }
                                                                        eVar.put(strP2, dValueOf);
                                                                    } else if (zzhVar.W()) {
                                                                        eVar.put(zzhVar.P(), zzhVar.Q());
                                                                    } else {
                                                                        i().f9047A.c("Unknown value for param. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(zzhVar.P()));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        zzcVar2 = (zzff.zzc) it5.next();
                                                        if (zzcVar2.E().isEmpty()) {
                                                            i().f9047A.a(zzhjVar.f9119E.c(strO4), "null or empty param name in filter. event");
                                                        } else {
                                                            hashSet.add(zzcVar2.E());
                                                        }
                                                    }
                                                    bool = null;
                                                    break;
                                                }
                                            }
                                            Boolean boolB2 = x0.b(j, zzbVar.G());
                                            if (boolB2 == null) {
                                                bool = null;
                                                break;
                                            }
                                            if (boolB2.booleanValue()) {
                                                hashSet = new HashSet();
                                                it5 = zzbVar.I().iterator();
                                                while (true) {
                                                    if (it5.hasNext()) {
                                                        z13 = false;
                                                        eVar = new p212w.e(0);
                                                        it6 = zzfVar2.P().iterator();
                                                        while (true) {
                                                            if (it6.hasNext()) {
                                                                it7 = zzbVar.I().iterator();
                                                                while (true) {
                                                                    if (it7.hasNext()) {
                                                                        bool = Boolean.TRUE;
                                                                        break;
                                                                    }
                                                                    zzcVar = (zzff.zzc) it7.next();
                                                                    if (zzcVar.G()) {
                                                                        z14 = z13;
                                                                    } else {
                                                                        z14 = z13;
                                                                    }
                                                                    strE = zzcVar.E();
                                                                    if (strE.isEmpty()) {
                                                                        i().f9047A.a(zzhjVar.f9119E.c(strO4), "Event has empty param name. event");
                                                                    } else {
                                                                        obj = eVar.get(strE);
                                                                        if (obj instanceof Long) {
                                                                            if (zzcVar.H()) {
                                                                                i().f9047A.c("No number filter for long param. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(strE));
                                                                            } else {
                                                                                boolB = x0.b(((Long) obj).longValue(), zzcVar.C());
                                                                                if (boolB == null) {
                                                                                    if (boolB.booleanValue() == z14) {
                                                                                        bool = Boolean.FALSE;
                                                                                        break;
                                                                                    } else {
                                                                                        z13 = false;
                                                                                        z12 = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (obj instanceof Double) {
                                                                            if (zzcVar.H()) {
                                                                                i().f9047A.c("No number filter for double param. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(strE));
                                                                            } else {
                                                                                double dDoubleValue2 = ((Double) obj).doubleValue();
                                                                                boolE2 = x0.e(new BigDecimal(dDoubleValue2), zzcVar.C(), Math.ulp(dDoubleValue2));
                                                                                if (boolE2 == null) {
                                                                                    if (boolE2.booleanValue() == z14) {
                                                                                        bool = Boolean.FALSE;
                                                                                        break;
                                                                                    } else {
                                                                                        z13 = false;
                                                                                        z12 = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (obj instanceof String) {
                                                                            if (zzcVar.J()) {
                                                                                boolE = x0.d((String) obj, zzcVar.D(), i());
                                                                            } else if (zzcVar.H()) {
                                                                                str3 = (String) obj;
                                                                                if (zznl.H1(str3)) {
                                                                                    zzdVarC = zzcVar.C();
                                                                                    if (zznl.H1(str3)) {
                                                                                        boolE = null;
                                                                                    } else {
                                                                                        boolE = x0.e(new BigDecimal(str3), zzdVarC, 0.0d);
                                                                                    }
                                                                                } else {
                                                                                    i().f9047A.c("Invalid param value for number filter. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(strE));
                                                                                }
                                                                            } else {
                                                                                i().f9047A.c("No filter for String param. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(strE));
                                                                            }
                                                                            if (boolE == null) {
                                                                                if (boolE.booleanValue() == z14) {
                                                                                    bool = Boolean.FALSE;
                                                                                    break;
                                                                                } else {
                                                                                    z13 = false;
                                                                                    z12 = true;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            if (obj == null) {
                                                                                i().f9052F.c("Missing param for filter. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(strE));
                                                                                bool = Boolean.FALSE;
                                                                                break;
                                                                            }
                                                                            i().f9047A.c("Unknown param type. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(strE));
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                zzhVar = (zzfn.zzh) it6.next();
                                                                if (!hashSet.contains(zzhVar.P())) {
                                                                    if (zzhVar.U()) {
                                                                        String strP3 = zzhVar.P();
                                                                        if (zzhVar.U()) {
                                                                            lValueOf = Long.valueOf(zzhVar.L());
                                                                        } else {
                                                                            lValueOf = null;
                                                                        }
                                                                        eVar.put(strP3, lValueOf);
                                                                    } else if (zzhVar.S()) {
                                                                        String strP4 = zzhVar.P();
                                                                        if (zzhVar.S()) {
                                                                            dValueOf = Double.valueOf(zzhVar.z());
                                                                        } else {
                                                                            dValueOf = null;
                                                                        }
                                                                        eVar.put(strP4, dValueOf);
                                                                    } else if (zzhVar.W()) {
                                                                        eVar.put(zzhVar.P(), zzhVar.Q());
                                                                    } else {
                                                                        i().f9047A.c("Unknown value for param. event, param", zzhjVar.f9119E.c(strO4), zzhjVar.f9119E.f(zzhVar.P()));
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        zzcVar2 = (zzff.zzc) it5.next();
                                                        if (zzcVar2.E().isEmpty()) {
                                                            i().f9047A.a(zzhjVar.f9119E.c(strO4), "null or empty param name in filter. event");
                                                        } else {
                                                            hashSet.add(zzcVar2.E());
                                                        }
                                                    }
                                                    bool = null;
                                                    break;
                                                }
                                            }
                                            bool = Boolean.FALSE;
                                            i().f9052F.a(bool == null ? "null" : bool, "Event filter result");
                                            if (bool != null) {
                                                Boolean bool2 = Boolean.TRUE;
                                                c0294c.a = bool2;
                                                if (bool.booleanValue()) {
                                                    c0294c.f3161b = bool2;
                                                    if (z20 && zzfVar2.S()) {
                                                        Long lValueOf2 = Long.valueOf(zzfVar2.L());
                                                        if (zzbVar.K()) {
                                                            if (!zH4 || !zzbVar.M()) {
                                                                l17 = lValueOf2;
                                                            }
                                                            c0294c.f3163d = l17;
                                                        } else {
                                                            if (zH4 && zzbVar.M()) {
                                                                lValueOf2 = l18;
                                                            }
                                                            c0294c.f3162c = lValueOf2;
                                                        }
                                                    }
                                                }
                                                z10 = true;
                                            }
                                        } else {
                                            i().f9052F.c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", num, zzbVar.N() ? Integer.valueOf(zzbVar.D()) : null);
                                            z10 = z12;
                                        }
                                        if (!z10) {
                                            this.f3125w.add(num);
                                            iVar2 = iVar3;
                                            break;
                                        }
                                        d1(num).a(c0294c);
                                        map = map2;
                                        iVar = iVar3;
                                        it3 = it4;
                                        c0302k = c0302k;
                                        it2 = it2;
                                        l4 = l4;
                                        jLongValue = jLongValue;
                                    } else {
                                        zzfw zzfwVarI15 = i();
                                        r rVarA7 = zzfw.a1(str2);
                                        if (zzbVar.N()) {
                                            numValueOf = Integer.valueOf(zzbVar.D());
                                        } else {
                                            numValueOf = null;
                                        }
                                        zzfwVarI15.f9047A.c("Invalid event filter ID. appId, id", rVarA7, String.valueOf(numValueOf));
                                    }
                                    z10 = false;
                                    if (!z10) {
                                        this.f3125w.add(num);
                                        iVar2 = iVar3;
                                        break;
                                    }
                                    d1(num).a(c0294c);
                                    map = map2;
                                    iVar = iVar3;
                                    it3 = it4;
                                    c0302k = c0302k;
                                    it2 = it2;
                                    l4 = l4;
                                    jLongValue = jLongValue;
                                }
                                if (!z10) {
                                    this.f3125w.add(num);
                                }
                                map = map2;
                                iVar4 = iVar2;
                                c0302k = c0302k;
                                it2 = it2;
                                l4 = l4;
                                jLongValue = jLongValue;
                            }
                        }
                        zzfVar3 = zzfVar3;
                    }
                }
                it9 = it;
                z15 = false;
                iVar4 = iVar4;
            } else {
                it = it9;
                if (z16) {
                    X0();
                    Serializable serializableG1 = zznl.G1(zzfVar4, "_epc");
                    long jLongValue2 = ((Long) (serializableG1 != null ? serializableG1 : 0L)).longValue();
                    if (jLongValue2 <= 0) {
                        i().f9057y.a(strO3, "Complex event with zero extra param count. eventName");
                        zzfVar3 = zzfVar4;
                        zzfVar = zzfVar3;
                        l4 = l10;
                        jLongValue = jLongValue2;
                    } else {
                        zzfVar = zzfVar4;
                        C0298g c0298gY4 = Y0();
                        Preconditions.i(l10);
                        c0298gY4.w1(str5, l10, jLongValue2, zzfVar);
                        l4 = l10;
                        jLongValue = jLongValue2;
                        zzfVar3 = zzfVar;
                    }
                } else {
                    zzfVar = zzfVar4;
                }
                iterable = zzjtVarP;
            }
            zzfn.zzf.zza zzaVar = (zzfn.zzf.zza) zzfVar.v();
            zzaVar.m();
            zzfn.zzf.H((zzfn.zzf) zzaVar.f8681t, strO3);
            zzaVar.m();
            zzfn.zzf.D((zzfn.zzf) zzaVar.f8681t);
            zzaVar.m();
            zzfn.zzf.G((zzfn.zzf) zzaVar.f8681t, iterable);
            zzfVar2 = (zzfn.zzf) zzaVar.o();
            if (zzfVar2 != null) {
                c0298gY0 = Y0();
                str = this.f3124v;
                strO = zzfVar2.O();
                c0302kM1 = c0298gY0.M1("events", str, zzfVar.O());
                if (c0302kM1 == null) {
                    c0298gY0.i().f9047A.c("Event aggregate wasn't created during raw event logging. appId, event", zzfw.a1(str), ((zzhj) c0298gY0.f577s).f9119E.c(strO));
                    c0302k = new C0302k(str, zzfVar.O(), 1L, 1L, 1L, zzfVar.L(), 0L, null, null, null, null);
                } else {
                    c0302k = new C0302k(c0302kM1.a, c0302kM1.f3034b, c0302kM1.f3035c + 1, c0302kM1.f3036d + 1, c0302kM1.f3037e + 1, c0302kM1.f3038f, c0302kM1.f3039g, c0302kM1.f3040h, c0302kM1.f3041i, c0302kM1.j, c0302kM1.f3042k);
                }
                Y0().t1("events", c0302k);
                zznk.a();
                zzhjVar = (zzhj) this.f577s;
                if (zzhjVar.f9146y.h1(null, zzbf.f8968V0)) {
                    strO2 = zzfVar2.O();
                    map = (Map) iVar4.get(strO2);
                    if (map == null) {
                        c0298gY1 = Y0();
                        str4 = this.f3124v;
                        c0298gY1.a1();
                        c0298gY1.W0();
                        Preconditions.e(str4);
                        Preconditions.e(strO2);
                        eVar2 = new p212w.e(0);
                        cursorQuery = c0298gY1.d1().query("event_filters", new String[]{"audience_id", JsonStorageKeyNames.DATA_KEY}, "app_id=? AND event_name=?", new String[]{str4, strO2}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            map = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            zzfVar3 = zzfVar3;
                        } else {
                            while (true) {
                                zzff.zzb zzbVar5 = (zzff.zzb) ((zzff.zzb.zza) zznl.k1(zzff.zzb.E(), cursorQuery.getBlob(1))).o();
                                i11 = cursorQuery.getInt(0);
                                arrayList = (List) eVar2.get(Integer.valueOf(i11));
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    c0298g = c0298gY1;
                                    eVar2.put(Integer.valueOf(i11), arrayList);
                                } else {
                                    c0298g = c0298gY1;
                                }
                                arrayList.add(zzbVar5);
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                } else {
                                    zzfVar3 = zzfVar3;
                                    c0298gY1 = c0298g;
                                }
                            }
                            cursorQuery.close();
                            map = eVar2;
                        }
                        iVar4.put(strO2, map);
                    } else {
                        zzfVar3 = zzfVar3;
                    }
                    it2 = map.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        if (this.f3125w.contains(num)) {
                            i().f9052F.a(num, "Skipping failed audience ID");
                        } else {
                            it3 = ((List) map.get(num)).iterator();
                            z10 = true;
                            iVar = iVar4;
                            while (true) {
                                if (it3.hasNext()) {
                                    map2 = map;
                                    iVar2 = iVar;
                                    c0302k = c0302k;
                                    it2 = it2;
                                    l4 = l4;
                                    jLongValue = jLongValue;
                                    break;
                                }
                                zzbVar = (zzff.zzb) it3.next();
                                str2 = this.f3124v;
                                c0294c = new C0294c();
                                c0294c.f2976e = zzbVar;
                                Long l19 = this.f3127y;
                                map2 = map;
                                Long l110 = this.f3128z;
                                iD = zzbVar.D();
                                iVar3 = iVar;
                                w0Var = (w0) this.f3126x.get(num);
                                if (w0Var == null) {
                                    z11 = false;
                                } else {
                                    z11 = w0Var.f3155d.get(iD);
                                }
                                zzoc.a();
                                boolean z111 = z11;
                                boolean zH5 = zzhjVar.f9146y.h1(str2, zzbf.f8992k0);
                                if (zzbVar.L()) {
                                    j = c0302k.f3037e;
                                } else {
                                    j = c0302k.f3035c;
                                }
                                it4 = it3;
                                if (i().e1(2)) {
                                    zzfw zzfwVarI16 = i();
                                    if (zzbVar.N()) {
                                        numValueOf2 = Integer.valueOf(zzbVar.D());
                                    } else {
                                        numValueOf2 = null;
                                    }
                                    zzfwVarI16.f9052F.d("Evaluating filter. audience, filter, event", num, numValueOf2, zzhjVar.f9119E.c(zzbVar.H()));
                                    zzfw zzfwVarI17 = i();
                                    zznlVarX0 = X0();
                                    sbC = p239z.e.c("\nevent_filter {\n");
                                    if (zzbVar.N()) {
                                        i10 = 0;
                                        zznl.C1(sbC, 0, "filter_id", Integer.valueOf(zzbVar.D()));
                                    } else {
                                        i10 = 0;
                                    }
                                    zznl.C1(sbC, i10, "event_name", ((zzhj) zznlVarX0.f577s).f9119E.c(zzbVar.H()));
                                    strO1 = zznl.o1(zzbVar.J(), zzbVar.K(), zzbVar.L());
                                    if (!strO1.isEmpty()) {
                                        zznl.C1(sbC, i10, "filter_type", strO1);
                                    }
                                    if (zzbVar.M()) {
                                        zznl.B1(sbC, 1, "event_count_filter", zzbVar.G());
                                    }
                                    if (zzbVar.z() > 0) {
                                        sbC.append("  filters {\n");
                                        it8 = zzbVar.I().iterator();
                                        while (it8.hasNext()) {
                                            zznlVarX0.z1(sbC, 2, (zzff.zzc) it8.next());
                                        }
                                    }
                                    z12 = true;
                                    zznl.y1(sbC, 1);
                                    sbC.append("}\n}\n");
                                    zzfwVarI17.f9052F.a(sbC.toString(), "Filter definition");
                                } else {
                                    l4 = l4;
                                    jLongValue = jLongValue;
                                    z12 = true;
                                }
                                if (!zzbVar.N()) {
                                    zzfw zzfwVarI18 = i();
                                    r rVarA8 = zzfw.a1(str2);
                                    if (zzbVar.N()) {
                                        numValueOf = Integer.valueOf(zzbVar.D());
                                    } else {
                                        numValueOf = null;
                                    }
                                    zzfwVarI18.f9047A.c("Invalid event filter ID. appId, id", rVarA8, String.valueOf(numValueOf));
                                    z10 = false;
                                } else {
                                    zzfw zzfwVarI19 = i();
                                    r rVarA9 = zzfw.a1(str2);
                                    if (zzbVar.N()) {
                                        numValueOf = Integer.valueOf(zzbVar.D());
                                    } else {
                                        numValueOf = null;
                                    }
                                    zzfwVarI19.f9047A.c("Invalid event filter ID. appId, id", rVarA9, String.valueOf(numValueOf));
                                    z10 = false;
                                }
                                if (!z10) {
                                    this.f3125w.add(num);
                                    iVar2 = iVar3;
                                    break;
                                }
                                d1(num).a(c0294c);
                                map = map2;
                                iVar = iVar3;
                                it3 = it4;
                                c0302k = c0302k;
                                it2 = it2;
                                l4 = l4;
                                jLongValue = jLongValue;
                            }
                            if (!z10) {
                                this.f3125w.add(num);
                            }
                            map = map2;
                            iVar4 = iVar2;
                            c0302k = c0302k;
                            it2 = it2;
                            l4 = l4;
                            jLongValue = jLongValue;
                        }
                    }
                    zzfVar3 = zzfVar3;
                } else {
                    strO2 = zzfVar2.O();
                    map = (Map) iVar4.get(strO2);
                    if (map == null) {
                        c0298gY1 = Y0();
                        str4 = this.f3124v;
                        c0298gY1.a1();
                        c0298gY1.W0();
                        Preconditions.e(str4);
                        Preconditions.e(strO2);
                        eVar2 = new p212w.e(0);
                        cursorQuery = c0298gY1.d1().query("event_filters", new String[]{"audience_id", JsonStorageKeyNames.DATA_KEY}, "app_id=? AND event_name=?", new String[]{str4, strO2}, null, null, null);
                        if (cursorQuery.moveToFirst()) {
                            map = Collections.EMPTY_MAP;
                            cursorQuery.close();
                            zzfVar3 = zzfVar3;
                        } else {
                            while (true) {
                                zzff.zzb zzbVar6 = (zzff.zzb) ((zzff.zzb.zza) zznl.k1(zzff.zzb.E(), cursorQuery.getBlob(1))).o();
                                i11 = cursorQuery.getInt(0);
                                arrayList = (List) eVar2.get(Integer.valueOf(i11));
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    c0298g = c0298gY1;
                                    eVar2.put(Integer.valueOf(i11), arrayList);
                                } else {
                                    c0298g = c0298gY1;
                                }
                                arrayList.add(zzbVar6);
                                if (!cursorQuery.moveToNext()) {
                                    break;
                                    break;
                                } else {
                                    zzfVar3 = zzfVar3;
                                    c0298gY1 = c0298g;
                                }
                            }
                            cursorQuery.close();
                            map = eVar2;
                        }
                        iVar4.put(strO2, map);
                    } else {
                        zzfVar3 = zzfVar3;
                    }
                    it2 = map.keySet().iterator();
                    while (it2.hasNext()) {
                        num = (Integer) it2.next();
                        num.getClass();
                        if (this.f3125w.contains(num)) {
                            i().f9052F.a(num, "Skipping failed audience ID");
                        } else {
                            it3 = ((List) map.get(num)).iterator();
                            z10 = true;
                            iVar = iVar4;
                            while (true) {
                                if (it3.hasNext()) {
                                    map2 = map;
                                    iVar2 = iVar;
                                    c0302k = c0302k;
                                    it2 = it2;
                                    l4 = l4;
                                    jLongValue = jLongValue;
                                    break;
                                }
                                zzbVar = (zzff.zzb) it3.next();
                                str2 = this.f3124v;
                                c0294c = new C0294c();
                                c0294c.f2976e = zzbVar;
                                Long l111 = this.f3127y;
                                map2 = map;
                                Long l112 = this.f3128z;
                                iD = zzbVar.D();
                                iVar3 = iVar;
                                w0Var = (w0) this.f3126x.get(num);
                                if (w0Var == null) {
                                    z11 = false;
                                } else {
                                    z11 = w0Var.f3155d.get(iD);
                                }
                                zzoc.a();
                                boolean z112 = z11;
                                boolean zH6 = zzhjVar.f9146y.h1(str2, zzbf.f8992k0);
                                if (zzbVar.L()) {
                                    j = c0302k.f3037e;
                                } else {
                                    j = c0302k.f3035c;
                                }
                                it4 = it3;
                                if (i().e1(2)) {
                                    zzfw zzfwVarI110 = i();
                                    if (zzbVar.N()) {
                                        numValueOf2 = Integer.valueOf(zzbVar.D());
                                    } else {
                                        numValueOf2 = null;
                                    }
                                    zzfwVarI110.f9052F.d("Evaluating filter. audience, filter, event", num, numValueOf2, zzhjVar.f9119E.c(zzbVar.H()));
                                    zzfw zzfwVarI111 = i();
                                    zznlVarX0 = X0();
                                    sbC = p239z.e.c("\nevent_filter {\n");
                                    if (zzbVar.N()) {
                                        i10 = 0;
                                        zznl.C1(sbC, 0, "filter_id", Integer.valueOf(zzbVar.D()));
                                    } else {
                                        i10 = 0;
                                    }
                                    zznl.C1(sbC, i10, "event_name", ((zzhj) zznlVarX0.f577s).f9119E.c(zzbVar.H()));
                                    strO1 = zznl.o1(zzbVar.J(), zzbVar.K(), zzbVar.L());
                                    if (!strO1.isEmpty()) {
                                        zznl.C1(sbC, i10, "filter_type", strO1);
                                    }
                                    if (zzbVar.M()) {
                                        zznl.B1(sbC, 1, "event_count_filter", zzbVar.G());
                                    }
                                    if (zzbVar.z() > 0) {
                                        sbC.append("  filters {\n");
                                        it8 = zzbVar.I().iterator();
                                        while (it8.hasNext()) {
                                            zznlVarX0.z1(sbC, 2, (zzff.zzc) it8.next());
                                        }
                                    }
                                    z12 = true;
                                    zznl.y1(sbC, 1);
                                    sbC.append("}\n}\n");
                                    zzfwVarI111.f9052F.a(sbC.toString(), "Filter definition");
                                } else {
                                    l4 = l4;
                                    jLongValue = jLongValue;
                                    z12 = true;
                                }
                                if (!zzbVar.N()) {
                                    zzfw zzfwVarI112 = i();
                                    r rVarA10 = zzfw.a1(str2);
                                    if (zzbVar.N()) {
                                        numValueOf = Integer.valueOf(zzbVar.D());
                                    } else {
                                        numValueOf = null;
                                    }
                                    zzfwVarI112.f9047A.c("Invalid event filter ID. appId, id", rVarA10, String.valueOf(numValueOf));
                                    z10 = false;
                                } else {
                                    zzfw zzfwVarI113 = i();
                                    r rVarA11 = zzfw.a1(str2);
                                    if (zzbVar.N()) {
                                        numValueOf = Integer.valueOf(zzbVar.D());
                                    } else {
                                        numValueOf = null;
                                    }
                                    zzfwVarI113.f9047A.c("Invalid event filter ID. appId, id", rVarA11, String.valueOf(numValueOf));
                                    z10 = false;
                                }
                                if (!z10) {
                                    this.f3125w.add(num);
                                    iVar2 = iVar3;
                                    break;
                                }
                                d1(num).a(c0294c);
                                map = map2;
                                iVar = iVar3;
                                it3 = it4;
                                c0302k = c0302k;
                                it2 = it2;
                                l4 = l4;
                                jLongValue = jLongValue;
                            }
                            if (!z10) {
                                this.f3125w.add(num);
                            }
                            map = map2;
                            iVar4 = iVar2;
                            c0302k = c0302k;
                            it2 = it2;
                            l4 = l4;
                            jLongValue = jLongValue;
                        }
                    }
                    zzfVar3 = zzfVar3;
                }
            }
            it9 = it;
            z15 = false;
            iVar4 = iVar4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:165:0x03fb A[LOOP:3: B:49:0x0121->B:165:0x03fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x040d A[SYNTHETIC] */
    public final void h1(List list) throws Throwable {
        Map map;
        Iterator it;
        zzfn.zzo zzoVar;
        Boolean boolC;
        Boolean boolE;
        Boolean boolE2;
        Cursor cursor;
        Cursor cursorQuery;
        if (list.isEmpty()) {
            return;
        }
        int i10 = 0;
        p212w.e eVar = new p212w.e(0);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            zzfn.zzo zzoVar2 = (zzfn.zzo) it2.next();
            String strN = zzoVar2.N();
            Map map2 = (Map) eVar.get(strN);
            boolean z6 = true;
            if (map2 == null) {
                C0298g c0298gY0 = Y0();
                String str = this.f3124v;
                c0298gY0.a1();
                c0298gY0.W0();
                Preconditions.e(str);
                Preconditions.e(strN);
                p212w.e eVar2 = new p212w.e(i10);
                try {
                    cursorQuery = c0298gY0.d1().query("property_filters", new String[]{"audience_id", JsonStorageKeyNames.DATA_KEY}, "app_id=? AND property_name=?", new String[]{str, strN}, null, null, null);
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                do {
                                    try {
                                        zzff.zze zzeVar = (zzff.zze) ((zzff.zze.zza) zznl.k1(zzff.zze.C(), cursorQuery.getBlob(1))).o();
                                        int i11 = cursorQuery.getInt(i10);
                                        List arrayList = (List) eVar2.get(Integer.valueOf(i11));
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            eVar2.put(Integer.valueOf(i11), arrayList);
                                        }
                                        arrayList.add(zzeVar);
                                    } catch (IOException e10) {
                                        c0298gY0.i().f9056x.c("Failed to merge filter", zzfw.a1(str), e10);
                                    }
                                } while (cursorQuery.moveToNext());
                                cursorQuery.close();
                                map2 = eVar2;
                            } else {
                                map2 = Collections.EMPTY_MAP;
                                cursorQuery.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    } catch (SQLiteException e11) {
                        e = e11;
                        c0298gY0.i().f9056x.c("Database error querying filters. appId", zzfw.a1(str), e);
                        map2 = Collections.EMPTY_MAP;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                } catch (SQLiteException e12) {
                    e = e12;
                    cursorQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                }
                eVar.put(strN, map2);
            }
            Iterator it3 = map2.keySet().iterator();
            while (it3.hasNext()) {
                Integer num = (Integer) it3.next();
                num.getClass();
                if (this.f3125w.contains(num)) {
                    i().f9052F.a(num, "Skipping failed audience ID");
                    break;
                }
                Iterator it4 = ((List) map2.get(num)).iterator();
                boolean z10 = z6;
                while (true) {
                    if (!it4.hasNext()) {
                        map = map2;
                        it = it2;
                        zzoVar = zzoVar2;
                        it3 = it3;
                        break;
                    }
                    zzff.zze zzeVar2 = (zzff.zze) it4.next();
                    boolean zE1 = i().e1(2);
                    zzhj zzhjVar = (zzhj) this.f577s;
                    if (zE1) {
                        zzfw zzfwVarI = i();
                        zzfwVarI.f9052F.d("Evaluating filter. audience, filter, property", num, zzeVar2.I() ? Integer.valueOf(zzeVar2.z()) : null, zzhjVar.f9119E.g(zzeVar2.E()));
                        zzfw zzfwVarI2 = i();
                        zznl zznlVarX0 = X0();
                        StringBuilder sbC = p239z.e.c("\nproperty_filter {\n");
                        if (zzeVar2.I()) {
                            zznl.C1(sbC, i10, "filter_id", Integer.valueOf(zzeVar2.z()));
                        }
                        zznl.C1(sbC, i10, "property_name", ((zzhj) zznlVarX0.f577s).f9119E.g(zzeVar2.E()));
                        String strO1 = zznl.o1(zzeVar2.F(), zzeVar2.G(), zzeVar2.H());
                        if (!strO1.isEmpty()) {
                            zznl.C1(sbC, 0, "filter_type", strO1);
                        }
                        zznlVarX0.z1(sbC, 1, zzeVar2.B());
                        sbC.append("}\n");
                        zzfwVarI2.f9052F.a(sbC.toString(), "Filter definition");
                    }
                    if (zzeVar2.I() && zzeVar2.z() <= 256) {
                        String str2 = this.f3124v;
                        C0295d c0295d = new C0295d();
                        c0295d.f2980e = zzeVar2;
                        Long l4 = this.f3127y;
                        Long l10 = this.f3128z;
                        int iZ = zzeVar2.z();
                        w0 w0Var = (w0) this.f3126x.get(num);
                        boolean z11 = w0Var == null ? false : w0Var.f3155d.get(iZ);
                        zzoc.a();
                        map = map2;
                        boolean zH1 = zzhjVar.f9146y.h1(str2, zzbf.f8989i0);
                        boolean zF = zzeVar2.F();
                        boolean zG = zzeVar2.G();
                        boolean zH = zzeVar2.H();
                        boolean z12 = zF || zG || zH;
                        if (!z11 || z12) {
                            zzff.zzc zzcVarB = zzeVar2.B();
                            boolean zF2 = zzcVarB.F();
                            if (!zzoVar2.R()) {
                                it = it2;
                                zzoVar = zzoVar2;
                                if (!zzoVar.P()) {
                                    if (!zzoVar.T()) {
                                        i().f9047A.a(zzhjVar.f9119E.g(zzoVar.N()), "User property has no value, property");
                                    } else if (zzcVarB.J()) {
                                        it3 = it3;
                                        z12 = z12;
                                        boolC = x0.c(x0.d(zzoVar.O(), zzcVarB.D(), i()), zF2);
                                    } else if (!zzcVarB.H()) {
                                        i().f9047A.a(zzhjVar.f9119E.g(zzoVar.N()), "No string or number filter defined. property");
                                    } else if (zznl.H1(zzoVar.O())) {
                                        String strO = zzoVar.O();
                                        zzff.zzd zzdVarC = zzcVarB.C();
                                        if (zznl.H1(strO)) {
                                            try {
                                                BigDecimal bigDecimal = new BigDecimal(strO);
                                                it3 = it3;
                                                z12 = z12;
                                                try {
                                                    boolE = x0.e(bigDecimal, zzdVarC, 0.0d);
                                                } catch (NumberFormatException unused) {
                                                    boolE = null;
                                                }
                                            } catch (NumberFormatException unused2) {
                                                it3 = it3;
                                                z12 = z12;
                                            }
                                        } else {
                                            it3 = it3;
                                            z12 = z12;
                                            boolE = null;
                                        }
                                        boolC = x0.c(boolE, zF2);
                                    } else {
                                        i().f9047A.c("Invalid user property value for Numeric number filter. property, value", zzhjVar.f9119E.g(zzoVar.N()), zzoVar.O());
                                    }
                                    boolC = null;
                                } else if (zzcVarB.H()) {
                                    double dZ = zzoVar.z();
                                    try {
                                        boolE2 = x0.e(new BigDecimal(dZ), zzcVarB.C(), Math.ulp(dZ));
                                    } catch (NumberFormatException unused3) {
                                        boolE2 = null;
                                    }
                                    boolC = x0.c(boolE2, zF2);
                                    it3 = it3;
                                    z12 = z12;
                                } else {
                                    i().f9047A.a(zzhjVar.f9119E.g(zzoVar.N()), "No number filter for double property. property");
                                }
                                boolC = null;
                            } else if (zzcVarB.H()) {
                                it = it2;
                                zzoVar = zzoVar2;
                                boolC = x0.c(x0.b(zzoVar.I(), zzcVarB.C()), zF2);
                                it3 = it3;
                                z12 = z12;
                            } else {
                                i().f9047A.a(zzhjVar.f9119E.g(zzoVar2.N()), "No number filter for long property. property");
                                it = it2;
                                zzoVar = zzoVar2;
                                boolC = null;
                            }
                            i().f9052F.a(boolC == null ? "null" : boolC, "Property filter result");
                            if (boolC == null) {
                                z10 = false;
                            } else {
                                c0295d.a = Boolean.TRUE;
                                if (!zH || boolC.booleanValue()) {
                                    if (!z11 || zzeVar2.F()) {
                                        c0295d.f3161b = boolC;
                                    }
                                    if (boolC.booleanValue() && z12 && zzoVar.S()) {
                                        long jK = zzoVar.K();
                                        if (l4 != null) {
                                            jK = l4.longValue();
                                        }
                                        if (zH1 && zzeVar2.F() && !zzeVar2.G() && l10 != null) {
                                            jK = l10.longValue();
                                        }
                                        if (zzeVar2.G()) {
                                            c0295d.f3163d = Long.valueOf(jK);
                                        } else {
                                            c0295d.f3162c = Long.valueOf(jK);
                                        }
                                    }
                                }
                            }
                            if (z10) {
                                this.f3125w.add(num);
                                break;
                            }
                            d1(num).a(c0295d);
                            it3 = it3;
                            map2 = map;
                            it2 = it;
                            zzoVar2 = zzoVar;
                            i10 = 0;
                        } else {
                            i().f9052F.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", num, zzeVar2.I() ? Integer.valueOf(zzeVar2.z()) : null);
                            it = it2;
                            zzoVar = zzoVar2;
                            it3 = it3;
                        }
                        z10 = true;
                        if (z10) {
                            this.f3125w.add(num);
                            break;
                        }
                        d1(num).a(c0295d);
                        it3 = it3;
                        map2 = map;
                        it2 = it;
                        zzoVar2 = zzoVar;
                        i10 = 0;
                    } else {
                        map = map2;
                        it = it2;
                        zzoVar = zzoVar2;
                        it3 = it3;
                        zzfw zzfwVarI3 = i();
                        zzfwVarI3.f9047A.c("Invalid property filter ID. appId, id", zzfw.a1(this.f3124v), String.valueOf(zzeVar2.I() ? Integer.valueOf(zzeVar2.z()) : null));
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    this.f3125w.add(num);
                }
                it3 = it3;
                map2 = map;
                it2 = it;
                zzoVar2 = zzoVar;
                i10 = 0;
                z6 = true;
            }
        }
    }

    public final ArrayList i1() {
        ArrayList arrayList;
        List list;
        ArrayList arrayList2 = new ArrayList();
        p212w.b<Integer> bVar = (p212w.b) this.f3126x.keySet();
        bVar.removeAll(this.f3125w);
        for (Integer num : bVar) {
            int iIntValue = num.intValue();
            w0 w0Var = (w0) this.f3126x.get(num);
            Preconditions.i(w0Var);
            zzfn.zzd.zza zzaVarD = zzfn.zzd.D();
            zzaVarD.m();
            zzfn.zzd.A((zzfn.zzd) zzaVarD.f8681t, iIntValue);
            zzaVarD.m();
            zzfn.zzd.C((zzfn.zzd) zzaVarD.f8681t, w0Var.f3153b);
            zzfn.zzm zzmVar = w0Var.f3154c;
            if (zzmVar != null) {
                zzaVarD.m();
                zzfn.zzd.E((zzfn.zzd) zzaVarD.f8681t, zzmVar);
            }
            zzfn.zzm.zza zzaVarL = zzfn.zzm.L();
            ArrayList arrayListP1 = zznl.p1(w0Var.f3155d);
            zzaVarL.m();
            zzfn.zzm.D((zzfn.zzm) zzaVarL.f8681t, arrayListP1);
            ArrayList arrayListP2 = zznl.p1(w0Var.f3156e);
            zzaVarL.m();
            zzfn.zzm.A((zzfn.zzm) zzaVarL.f8681t, arrayListP2);
            p212w.e eVar = w0Var.f3157f;
            if (eVar == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(eVar.f15506u);
                for (Integer num2 : (p212w.b) eVar.keySet()) {
                    int iIntValue2 = num2.intValue();
                    Long l4 = (Long) eVar.get(num2);
                    if (l4 != null) {
                        zzfn.zze.zza zzaVarD2 = zzfn.zze.D();
                        zzaVarD2.m();
                        zzfn.zze.A((zzfn.zze) zzaVarD2.f8681t, iIntValue2);
                        long jLongValue = l4.longValue();
                        zzaVarD2.m();
                        zzfn.zze.B((zzfn.zze) zzaVarD2.f8681t, jLongValue);
                        arrayList.add((zzfn.zze) zzaVarD2.o());
                    }
                }
            }
            if (arrayList != null) {
                zzaVarL.m();
                zzfn.zzm.H((zzfn.zzm) zzaVarL.f8681t, arrayList);
            }
            p212w.e eVar2 = w0Var.f3158g;
            if (eVar2 == null) {
                list = Collections.EMPTY_LIST;
            } else {
                ArrayList arrayList3 = new ArrayList(eVar2.f15506u);
                Iterator it = ((p212w.b) eVar2.keySet()).iterator();
                while (true) {
                    p212w.a aVar = (p212w.a) it;
                    if (!aVar.hasNext()) {
                        break;
                    }
                    Integer num3 = (Integer) aVar.next();
                    zzfn.zzn.zza zzaVarE = zzfn.zzn.E();
                    int iIntValue3 = num3.intValue();
                    zzaVarE.m();
                    zzfn.zzn.B((zzfn.zzn) zzaVarE.f8681t, iIntValue3);
                    List list2 = (List) eVar2.get(num3);
                    if (list2 != null) {
                        Collections.sort(list2);
                        zzaVarE.m();
                        zzfn.zzn.C((zzfn.zzn) zzaVarE.f8681t, list2);
                    }
                    arrayList3.add((zzfn.zzn) zzaVarE.o());
                }
                list = arrayList3;
            }
            zzaVarL.m();
            zzfn.zzm.K((zzfn.zzm) zzaVarL.f8681t, list);
            zzaVarD.m();
            zzfn.zzd.B((zzfn.zzd) zzaVarD.f8681t, (zzfn.zzm) zzaVarL.o());
            zzfn.zzd zzdVar = (zzfn.zzd) zzaVarD.o();
            arrayList2.add(zzdVar);
            C0298g c0298gY0 = Y0();
            String str = this.f3124v;
            zzfn.zzm zzmVarG = zzdVar.G();
            c0298gY0.a1();
            c0298gY0.W0();
            Preconditions.e(str);
            Preconditions.i(zzmVarG);
            byte[] bArrL = zzmVarG.l();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("audience_id", num);
            contentValues.put("current_results", bArrL);
            try {
                if (c0298gY0.d1().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                    c0298gY0.i().f9056x.a(zzfw.a1(str), "Failed to insert filter results (got -1). appId");
                }
            } catch (SQLiteException e10) {
                c0298gY0.i().f9056x.c("Error storing filter results. appId", zzfw.a1(str), e10);
            }
        }
        return arrayList2;
    }
}
