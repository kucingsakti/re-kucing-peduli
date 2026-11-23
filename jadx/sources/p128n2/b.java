package p128n2;

import android.app.ActivityManager;
import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.aheaditec.talsec_security.security.Natives;
import com.bumptech.glide.d;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.kcstream.cing.MainApp;
import com.unity3d.ads.metadata.MediationMetaData;
import i2.h;
import i2.i;
import i2.l;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o1.m;
import p086i8.C;
import p108l2.f;
import p140o4.j;
import p140o4.s;
import p148p2.e;
import p148p2.g;
import p158q2.a;
import p188t1.AbstractC0860x;
import p188t1.B;
import p188t1.C0850m;
import p188t1.C0857u;
import p188t1.E;
import p188t1.F;
import p204v1.c;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements a, SuccessContinuation, e, c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13318s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13319t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f13320u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f13321v;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i10) {
        this.f13318s = i10;
        this.f13319t = obj;
        this.f13320u = obj2;
        this.f13321v = obj3;
    }

    @Override // p148p2.e
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        int i10;
        p108l2.c cVar;
        p108l2.c cVar2;
        int i11 = 5;
        int i12 = 4;
        int i13 = 3;
        p108l2.c cVar3 = p108l2.c.CACHE_FULL;
        int i14 = 2;
        Object obj2 = this.f13321v;
        int i15 = 0;
        Object obj3 = this.f13320u;
        Object obj4 = this.f13319t;
        int i16 = 1;
        switch (this.f13318s) {
            case 2:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                g gVar = (g) obj4;
                long jSimpleQueryForLong = gVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong();
                p148p2.a aVar = gVar.f14213v;
                long j = aVar.a;
                h hVar = (h) obj2;
                String str = hVar.a;
                if (jSimpleQueryForLong >= j) {
                    gVar.h(1L, cVar3, str);
                    return -1L;
                }
                i iVar = (i) obj3;
                Long lB = g.b(sQLiteDatabase, iVar);
                if (lB != null) {
                    jInsert = lB.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", iVar.a);
                    contentValues.put("priority", Integer.valueOf(p180s2.a.a(iVar.f12182c)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = iVar.f12181b;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                l lVar = hVar.f12174c;
                byte[] bArr2 = lVar.f12190b;
                int length = bArr2.length;
                int i17 = aVar.f14205e;
                boolean z6 = length <= i17;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(hVar.f12175d));
                contentValues2.put("uptime_ms", Long.valueOf(hVar.f12176e));
                contentValues2.put("payload_encoding", lVar.a.a);
                contentValues2.put("code", hVar.f12173b);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z6));
                contentValues2.put("payload", z6 ? bArr2 : new byte[0]);
                contentValues2.put("product_id", hVar.f12178g);
                contentValues2.put("pseudonymous_id", hVar.f12179h);
                contentValues2.put("experiment_ids_clear_blob", hVar.f12180i);
                contentValues2.put("experiment_ids_encrypted_blob", hVar.j);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z6) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i17));
                    for (int i18 = 1; i18 <= iCeil; i18++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i18 - 1) * i17, Math.min(i18 * i17, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i18));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : Collections.unmodifiableMap(hVar.f12177f).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put(MediationMetaData.KEY_NAME, (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 3:
                Cursor cursor2 = (Cursor) obj;
                g gVar2 = (g) obj4;
                gVar2.getClass();
                while (cursor2.moveToNext()) {
                    long j10 = cursor2.getLong(0);
                    int i19 = cursor2.getInt(7) != 0 ? i16 : 0;
                    Q6.b bVar = new Q6.b();
                    bVar.f4335f = new HashMap();
                    String string = cursor2.getString(i16);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    bVar.a = string;
                    bVar.f4333d = Long.valueOf(cursor2.getLong(i14));
                    bVar.f4334e = Long.valueOf(cursor2.getLong(3));
                    if (i19 != 0) {
                        String string2 = cursor2.getString(4);
                        bVar.f4332c = new l(string2 == null ? g.f14209x : new p051f2.c(string2), cursor2.getBlob(5));
                        i10 = i16;
                    } else {
                        String string3 = cursor2.getString(4);
                        p051f2.c cVar4 = string3 == null ? g.f14209x : new p051f2.c(string3);
                        Cursor cursorQuery = gVar2.a().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int length2 = 0;
                            while (cursorQuery.moveToNext()) {
                                int i20 = i16;
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList.add(blob);
                                length2 += blob.length;
                                i16 = i20;
                            }
                            i10 = i16;
                            byte[] bArr3 = new byte[length2];
                            int i21 = 0;
                            int length3 = 0;
                            while (i21 < arrayList.size()) {
                                byte[] bArr4 = (byte[]) arrayList.get(i21);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList2 = arrayList;
                                    System.arraycopy(bArr4, 0, bArr3, length3, bArr4.length);
                                    length3 += bArr4.length;
                                    i21++;
                                    cursorQuery = cursor;
                                    arrayList = arrayList2;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            bVar.f4332c = new l(cVar4, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        bVar.f4331b = Integer.valueOf(cursor2.getInt(6));
                    }
                    if (!cursor2.isNull(8)) {
                        bVar.f4336g = Integer.valueOf(cursor2.getInt(8));
                    }
                    if (!cursor2.isNull(9)) {
                        bVar.f4337h = cursor2.getString(9);
                    }
                    if (!cursor2.isNull(10)) {
                        bVar.f4338i = cursor2.getBlob(10);
                    }
                    if (!cursor2.isNull(11)) {
                        bVar.j = cursor2.getBlob(11);
                    }
                    ((ArrayList) obj2).add(new p148p2.b(j10, (i) obj3, bVar.b()));
                    i16 = i10;
                    i14 = 2;
                }
                return null;
            default:
                Cursor cursor3 = (Cursor) obj;
                g gVar3 = (g) obj4;
                gVar3.getClass();
                while (true) {
                    HashMap map = (HashMap) obj3;
                    if (cursor3.moveToNext()) {
                        String string4 = cursor3.getString(i15);
                        int i22 = cursor3.getInt(1);
                        p108l2.c cVar5 = p108l2.c.REASON_UNKNOWN;
                        if (i22 != 0) {
                            if (i22 == 1) {
                                cVar5 = p108l2.c.MESSAGE_TOO_OLD;
                            } else if (i22 == 2) {
                                cVar = cVar3;
                                cVar2 = cVar;
                            } else if (i22 == i13) {
                                cVar5 = p108l2.c.PAYLOAD_TOO_BIG;
                            } else if (i22 == i12) {
                                cVar5 = p108l2.c.MAX_RETRIES_REACHED;
                            } else if (i22 == i11) {
                                cVar5 = p108l2.c.INVALID_PAYLOD;
                            } else if (i22 == 6) {
                                cVar5 = p108l2.c.SERVER_ERROR;
                            } else {
                                d.i("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i22));
                            }
                            cVar2 = cVar3;
                            cVar = cVar5;
                        } else {
                            cVar2 = cVar3;
                            cVar = cVar5;
                        }
                        long j11 = cursor3.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new p108l2.d(j11, cVar));
                        cVar3 = cVar2;
                        i11 = 5;
                        i12 = 4;
                        i13 = 3;
                        i15 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            m mVar = (m) obj2;
                            if (!it.hasNext()) {
                                long jK = gVar3.f14211t.k();
                                SQLiteDatabase sQLiteDatabaseA = gVar3.a();
                                sQLiteDatabaseA.beginTransaction();
                                try {
                                    Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                    try {
                                        cursorRawQuery.moveToNext();
                                        p108l2.g gVar4 = new p108l2.g(cursorRawQuery.getLong(0), jK);
                                        cursorRawQuery.close();
                                        sQLiteDatabaseA.setTransactionSuccessful();
                                        sQLiteDatabaseA.endTransaction();
                                        mVar.f13641s = gVar4;
                                        mVar.f13643u = new p108l2.b(new f(gVar3.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * gVar3.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), p148p2.a.f14201f.a));
                                        mVar.f13644v = (String) gVar3.f14214w.get();
                                        return new p108l2.a((p108l2.g) mVar.f13641s, Collections.unmodifiableList((ArrayList) mVar.f13642t), (p108l2.b) mVar.f13643u, (String) mVar.f13644v);
                                    } catch (Throwable th3) {
                                        cursorRawQuery.close();
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    sQLiteDatabaseA.endTransaction();
                                    throw th4;
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i23 = p108l2.e.f12910c;
                            new ArrayList();
                            ((ArrayList) mVar.f13642t).add(new p108l2.e((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
                break;
        }
    }

    @Override // p158q2.a
    public Object b() {
        c cVar = (c) this.f13319t;
        g gVar = (g) cVar.f13325d;
        gVar.getClass();
        i iVar = (i) this.f13320u;
        h hVar = (h) this.f13321v;
        if (Log.isLoggable(d.q("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(iVar.f12182c);
        }
        ((Long) gVar.c(new b(gVar, (Object) hVar, iVar, 2))).getClass();
        cVar.a.a(iVar, 1, false);
        return null;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task m(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f13319t;
        String str = (String) this.f13320u;
        s sVar = (s) this.f13321v;
        String str2 = (String) obj;
        p081i3.b bVarC = FirebaseMessaging.c(firebaseMessaging.f9987b);
        D3.g gVar = firebaseMessaging.a;
        gVar.a();
        String strD = "[DEFAULT]".equals(gVar.f1049b) ? "" : gVar.d();
        String strA = firebaseMessaging.f9993h.a();
        synchronized (bVarC) {
            String strA2 = s.a(str2, strA, System.currentTimeMillis());
            if (strA2 != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) bVarC.f12212t).edit();
                editorEdit.putString(strD + "|T|" + str + "|*", strA2);
                editorEdit.commit();
            }
        }
        if (sVar == null || !str2.equals(sVar.a)) {
            D3.g gVar2 = firebaseMessaging.a;
            gVar2.a();
            if ("[DEFAULT]".equals(gVar2.f1049b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    gVar2.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new j(firebaseMessaging.f9987b).b(intent);
            }
        }
        return Tasks.e(str2);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:140:0x039d  */
    /* JADX WARN: Code duplicated, block: B:141:0x039e A[Catch: Exception -> 0x03cb, TryCatch #2 {Exception -> 0x03cb, blocks: (B:138:0x0386, B:141:0x039e, B:142:0x03a2, B:144:0x03a8, B:146:0x03b2, B:149:0x03b7, B:151:0x03bd), top: B:209:0x0386 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x03a8 A[Catch: Exception -> 0x03cb, TryCatch #2 {Exception -> 0x03cb, blocks: (B:138:0x0386, B:141:0x039e, B:142:0x03a2, B:144:0x03a8, B:146:0x03b2, B:149:0x03b7, B:151:0x03bd), top: B:209:0x0386 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x03cb A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204v1.c
    public F run() {
        boolean z6;
        int i10;
        int i11;
        int i12;
        int i13;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int i14;
        Natives natives;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        List<ResolveInfo> listQueryIntentActivities;
        Iterator<ResolveInfo> it;
        ActivityInfo activityInfo;
        String str;
        C0857u c0857u;
        String strE;
        String strB;
        B b3 = (B) this.f13319t;
        b3.getClass();
        String str2 = Build.TAGS;
        int i26 = (str2 == null || !str2.contains(C.a(C.c("1467A7DD47EEC0BE95")))) ? 0 : 1;
        if (i26 != 0) {
            b3.l(C.a(C.c("0170B1FD0FF6D18C836E1C2D954C7638C6CD")), str2);
        }
        Natives natives2 = Natives.a;
        String[] strArrH = natives2.h();
        MainApp mainApp = (MainApp) this.f13320u;
        if (strArrH == null) {
            z6 = 0;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str3 : strArrH) {
                ApplicationInfo applicationInfoN = B.n(mainApp, str3);
                if (applicationInfoN != null) {
                    arrayList.add(applicationInfoN.sourceDir);
                }
            }
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            p210v8.i.f(strArr, C.a(C.c("0172BFDA")));
            boolean zD = natives2.d(strArr);
            z6 = zD;
            if (zD) {
                b3.l(C.a(C.c("0170B1E81AEED686907606049A4F7831")), C.a(C.c("0E63A0C01CE0")));
                z6 = zD;
            }
        }
        int i27 = i26 | z6 | (b3.p(C.a(C.c("126DFADA0FE6D0B583")), C.a(C.c("50"))) ? 1 : 0);
        String[] strArr2 = AbstractC0860x.f15133c;
        int length = strArr2.length;
        int i28 = 0;
        while (true) {
            if (i28 >= length) {
                i10 = 0;
                break;
            }
            String str4 = strArr2[i28];
            if (new File(str4).exists()) {
                b3.l(C.a(C.c("0170B1EF03E9C0B4B6650A1B9E4360")), str4);
                i10 = 1;
                break;
            }
            i28++;
        }
        int i29 = i27 | i10;
        String[] strArr3 = AbstractC0860x.a;
        int length2 = strArr3.length;
        int i30 = 0;
        while (true) {
            if (i30 >= length2) {
                i11 = 0;
                break;
            }
            if (b3.r(strArr3[i30])) {
                i11 = 1;
                break;
            }
            i30++;
        }
        int i31 = i29 | i11;
        String[] strArrSplit = System.getenv(C.a(C.c("304380E1"))).split(C.a(C.c("5A")));
        int length3 = strArrSplit.length;
        int i32 = 0;
        while (true) {
            if (i32 >= length3) {
                i12 = 0;
                break;
            }
            String str5 = strArrSplit[i32];
            if (new File(str5, C.a(C.c("1377"))).exists()) {
                b3.l(C.a(C.c("097187DC25EBF5A6927F")), str5);
                i12 = 1;
                break;
            }
            i32++;
        }
        int i33 = i31 | i12;
        boolean zExists = new File(C.a(C.c("4F67A0CA45F6C0A49365061C82027B20C2CAABF247C57C0753F2"))).exists();
        int i34 = !zExists ? 1 : 0;
        if (!zExists) {
            b3.l(C.a(C.c("09719BDD0BC6C0B5927E0901984C6031EEC0BDF35AD835")), C.a(C.c("4F67A0CA45F6C0A49365061C82027B20C2CAABF247C57C0753F2")));
        }
        int i35 = i33 | i34;
        String[] strArr4 = AbstractC0860x.f15135e;
        int length4 = strArr4.length;
        int i36 = 0;
        while (true) {
            if (i36 >= length4) {
                i13 = 0;
                break;
            }
            String str6 = strArr4[i36];
            if (new File(str6).canWrite()) {
                b3.l(C.a(C.c("0170B1EF05E9C1A29464381A92597536CFCC")), str6);
                i13 = 1;
                break;
            }
            i36++;
        }
        int i37 = i35 | i13;
        String strA = C.a(C.c("097186DC04EBCCA981441A3889427731D0DAABF372D526144CEBB12D12E4375D0767A6"));
        ActivityManager activityManager = (ActivityManager) mainApp.getSystemService(C.a(C.c("0161A0C01CECD1BE")));
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            i14 = 0;
        } else {
            Iterator<ActivityManager.RunningAppProcessInfo> it2 = runningAppProcesses.iterator();
            while (true) {
                if (it2.hasNext()) {
                    String str7 = it2.next().processName;
                    if (str7 != null) {
                        String[] strArr5 = AbstractC0860x.f15136f;
                        int length5 = strArr5.length;
                        int i38 = 0;
                        while (true) {
                            if (i38 < length5) {
                                if (str7.contains(strArr5[i38])) {
                                    b3.l(strA, C.a(C.c("1470A1CC")));
                                } else {
                                    i38++;
                                }
                            } else if (str7.contains(C.a(C.c("0D63B3C019EE")))) {
                                b3.l(strA, C.a(C.c("1470A1CC")));
                            }
                            i14 = 1;
                        }
                    }
                } else {
                    i14 = 0;
                }
            }
        }
        int i39 = i14 | i37;
        String strA2 = C.a(C.c("097186DC04EBCCA981441A3889427731D0DAABF363E5"));
        String[] strArr6 = {C.a(C.c("1071")), C.a(C.c("1071F4842B")), C.a(C.c("1071F4840F"))};
        int i40 = 0;
        loop4: while (true) {
            if (i40 >= 3) {
                natives = natives2;
                i15 = 1;
                i16 = 0;
                break;
            }
            String str8 = strArr6[i40];
            try {
                strB = com.bumptech.glide.e.b(str8);
            } catch (Exception unused) {
                strB = null;
            }
            if (strB != null) {
                String[] strArr7 = AbstractC0860x.f15136f;
                i15 = 1;
                int length6 = strArr7.length;
                int i41 = 0;
                while (true) {
                    if (i41 < length6) {
                        natives = natives2;
                        if (strB.contains(strArr7[i41])) {
                            b3.l(strA2, str8);
                        } else {
                            i41++;
                            natives2 = natives;
                        }
                    } else {
                        natives = natives2;
                        if (strB.contains(C.a(C.c("0D63B3C019EE")))) {
                            b3.l(strA2, str8);
                        }
                    }
                    i16 = 1;
                    break loop4;
                }
            }
            natives = natives2;
            i40++;
            natives2 = natives;
        }
        int i42 = i16 | i39;
        String strA3 = C.a(C.c("0863A7FB05EAD1AE88703F0998467533C6DA87EE40C2331156E7A1"));
        String[] strArr8 = AbstractC0860x.f15136f;
        int length7 = strArr8.length;
        int i43 = 0;
        while (true) {
            if (i43 >= length7) {
                i17 = 0;
                break;
            }
            if (B.n(mainApp, strArr8[i43]) != null) {
                b3.l(strA3, C.a(C.c("1470A1CC")));
                i17 = i15;
                break;
            }
            i43++;
        }
        int i44 = i42 | i17;
        String strA4 = C.a(C.c("097186DC04EBCCA981441A3889427731D0DAABF360C2330949CFA43A3EE23C4E"));
        UsageStatsManager usageStatsManager = (UsageStatsManager) mainApp.getSystemService(C.a(C.c("1571B5CE0FF6D1A69264")));
        if (usageStatsManager == null) {
            i18 = 0;
        } else {
            long jCurrentTimeMillis = System.currentTimeMillis();
            List<UsageStats> listQueryUsageStats = usageStatsManager.queryUsageStats(0, jCurrentTimeMillis - 100000000, jCurrentTimeMillis);
            if (listQueryUsageStats == null) {
                i18 = 0;
            } else {
                Iterator<UsageStats> it3 = listQueryUsageStats.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        String packageName = it3.next().getPackageName();
                        if (packageName != null) {
                            String[] strArr9 = AbstractC0860x.f15136f;
                            int length8 = strArr9.length;
                            int i45 = 0;
                            while (true) {
                                if (i45 < length8) {
                                    if (packageName.contains(strArr9[i45])) {
                                        b3.l(strA4, C.a(C.c("1470A1CC")));
                                    } else {
                                        i45++;
                                    }
                                } else if (packageName.contains(C.a(C.c("0D63B3C019EE")))) {
                                    b3.l(strA4, C.a(C.c("1470A1CC")));
                                }
                                i18 = i15;
                            }
                        }
                    } else {
                        i18 = 0;
                    }
                }
            }
        }
        int i46 = i44 | i18;
        if (natives.o()) {
            b3.l(C.a(C.c("136AB5C403EECA8F8F730A1AB54C603DD5CC")), C.a(C.c("1470A1CC")));
            i19 = i15;
        } else {
            i19 = 0;
        }
        int i47 = i46 | i19;
        if (AbstractC0487g.s("0263A7C009", C.a(C.c("0263A7C009")))) {
            PackageManager packageManager = (PackageManager) this.f13321v;
            E e10 = b3.f14970i;
            if (e10 == null || (strE = (c0857u = e10.a).e(C.a(C.c("126DBBDD35F5C4A48D76080D")))) == null) {
                try {
                    listQueryIntentActivities = packageManager.queryIntentActivities(new Intent(C.a(C.c("016CB0DB05ECC1E98F791B0D95593A35C0DDA7EF5D981F3C73CC"))), 131072);
                    if (listQueryIntentActivities == null) {
                        it = listQueryIntentActivities.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                activityInfo = it.next().activityInfo;
                                if (activityInfo != null && (str = activityInfo.packageName) != null && b3.o(packageManager, str)) {
                                    e10.a.f(C.a(C.c("126DBBDD35F5C4A48D76080D")), str);
                                    i25 = i15;
                                }
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
                i25 = 0;
            } else if (b3.o(packageManager, strE)) {
                i25 = i15;
            } else {
                String strA5 = C.a(C.c("126DBBDD35F5C4A48D76080D"));
                SharedPreferences.Editor editorEdit = c0857u.a.edit();
                editorEdit.remove(strA5);
                editorEdit.apply();
                listQueryIntentActivities = packageManager.queryIntentActivities(new Intent(C.a(C.c("016CB0DB05ECC1E98F791B0D95593A35C0DDA7EF5D981F3C73CC"))), 131072);
                if (listQueryIntentActivities == null) {
                    it = listQueryIntentActivities.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            activityInfo = it.next().activityInfo;
                            if (activityInfo != null) {
                                e10.a.f(C.a(C.c("126DBBDD35F5C4A48D76080D")), str);
                                i25 = i15;
                            }
                        }
                    }
                }
                i25 = 0;
            }
            i47 |= i25;
        }
        if (natives.j()) {
            b3.l(C.a(C.c("126DBBDD24E4D1AE9072")), C.a(C.c("1470A1CC")));
            i20 = i15;
        } else {
            i20 = 0;
        }
        int i48 = i20 | (b3.q(C.a(C.c("1377"))) ? 1 : 0) | ((b3.p(C.a(C.c("096CBDDD44F6D3A4C87A0E0F925E7F0BD3CFBD")), C.a(C.c("1376BBD91AE0C1"))) || b3.p(C.a(C.c("096CBDDD44F6D3A4C87A0E0F925E7F0BD3CFBDE4")), C.a(C.c("1376BBD91AE0C1"))) || b3.p(C.a(C.c("096CBDDD44F6D3A4C87A0E0F925E7F0BD0CCBCF65AD537")), C.a(C.c("1376BBD91AE0C1"))) || b3.p(C.a(C.c("1067A6DA03F6D1E98B76080188463A3CCACDAB")), C.a(C.c("51")))) ? i15 : 0);
        if (AbstractC0487g.s("0263A7C009", C.a(C.c("0263A7C009")))) {
            boolean zR = b3.r(C.a(C.c("0277A7D008EADD")));
            String strA6 = C.a(C.c("0277A7D008EADD"));
            try {
                Process processExec = Runtime.getRuntime().exec(strA6);
                i23 = (processExec == null ? null : processExec.getInputStream()) != null ? i15 : 0;
            } catch (Exception unused3) {
            }
            if (i23 != 0) {
                b3.l(C.a(C.c("0363BAEC12E0C6B292722C079640753AC7")), strA6);
            }
            int i49 = (b3.q(C.a(C.c("0277A7D008EADD"))) ? 1 : 0) | (zR ? 1 : 0) | i23;
            if (com.bumptech.glide.e.e(C.a(C.c("126DFACD0FE7D0A081760D049E"))).equals(Integer.valueOf(i15))) {
                b3.l(C.a(C.c("036AB1CA01D5D7A896721D1C82697136D6CEA9E151DA37")), C.a(C.c("1470A1CC")));
                i24 = i15;
            } else {
                i24 = 0;
            }
            i21 = i49 | i24;
        } else {
            i21 = 0;
        }
        if (AbstractC0487g.s("0263A7C009", C.a(C.c("0263A7C009")))) {
            int[] iArrI = natives.i();
            if (iArrI.length > 0) {
                if (AbstractC0487g.s("0467B6DC0D", C.a(C.c("1267B8CC0BF6C0")))) {
                    AbstractC0487g.r("296CB7C00EE0CBB3AA7808", "236AB1CA01CBC4AA832D4F009A5E5231C2DDBBF256E2370E4EEBAB331BE42D5D4C22BDC70CEA9FE7");
                }
                b3.a.add(new C0850m(iArrI));
                i22 = i15;
            } else {
                i22 = 0;
            }
            String strA7 = C.a(C.c("1367A6DF03E6C0E987730D4689427B20"));
            Integer numE = com.bumptech.glide.e.e(strA7);
            if (numE.equals(Integer.valueOf(i15))) {
                String strA8 = C.a(C.c("097187D019F1C0AAB66500189E5F602DE6D8BBE15FE23D"));
                StringBuilder sbC = p239z.e.c(strA7);
                sbC.append(C.a(C.c("4038F4")));
                sbC.append(numE);
                b3.j(strA8, sbC.toString());
                i22 = i15;
            }
            i21 |= i22;
        }
        return new F(i47 ^ 1, i48 ^ 1, i21 ^ 1);
    }

    public /* synthetic */ b(g gVar, Object obj, i iVar, int i10) {
        this.f13318s = i10;
        this.f13319t = gVar;
        this.f13321v = obj;
        this.f13320u = iVar;
    }
}
