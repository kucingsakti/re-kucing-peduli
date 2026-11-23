package p138o2;

import E4.B;
import E4.C0187a;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.rollbar.notifier.sender.SyncSender;
import h2.G;
import h2.H;
import h2.J;
import h2.m;
import h2.o;
import h2.p;
import h2.q;
import h2.r;
import h2.s;
import h2.t;
import h2.v;
import h2.z;
import i2.i;
import i2.l;
import i2.n;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p090j2.f;
import p090j2.g;
import p148p2.c;
import p148p2.d;
import p158q2.b;
import p169r2.a;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f13696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f13697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f13698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f13699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f13700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f13701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f13702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f13703i;

    public h(Context context, f fVar, d dVar, c cVar, Executor executor, b bVar, a aVar, a aVar2, c cVar2) {
        this.a = context;
        this.f13696b = fVar;
        this.f13697c = dVar;
        this.f13698d = cVar;
        this.f13699e = executor;
        this.f13700f = bVar;
        this.f13701g = aVar;
        this.f13702h = aVar2;
        this.f13703i = cVar2;
    }

    /* JADX WARN: Code duplicated, block: B:138:0x0441  */
    /* JADX WARN: Code duplicated, block: B:140:0x0451  */
    /* JADX WARN: Code duplicated, block: B:142:0x0459  */
    /* JADX WARN: Code duplicated, block: B:144:0x0467  */
    /* JADX WARN: Code duplicated, block: B:146:0x046a  */
    /* JADX WARN: Code duplicated, block: B:149:0x0479  */
    /* JADX WARN: Code duplicated, block: B:176:0x0429 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0493 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0489 A[SYNTHETIC] */
    public final void a(i iVar, int i10) {
        byte[] bArr;
        g gVar;
        p090j2.a aVar;
        String str;
        int i11;
        g2.b bVarG;
        p090j2.a aVar2;
        String str2;
        Integer numValueOf;
        Iterator it;
        g gVar2;
        V3.b bVar;
        int i12;
        HashMap map;
        Iterator it2;
        int i13;
        String str3;
        final h hVar = this;
        final i iVar2 = iVar;
        final int i14 = 1;
        final int i15 = 0;
        g gVarA = hVar.f13696b.a(iVar2.a);
        long jMax = 0;
        while (true) {
            p158q2.a aVar3 = new p158q2.a(hVar) { // from class: o2.g

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ h f13694t;

                {
                    this.f13694t = hVar;
                }

                @Override // p158q2.a
                public final Object b() {
                    Boolean bool;
                    switch (i15) {
                        case 0:
                            i iVar3 = iVar2;
                            p148p2.g gVar3 = (p148p2.g) this.f13694t.f13697c;
                            SQLiteDatabase sQLiteDatabaseA = gVar3.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lB = p148p2.g.b(sQLiteDatabaseA, iVar3);
                                if (lB == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = gVar3.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            p148p2.g gVar4 = (p148p2.g) this.f13694t.f13697c;
                            gVar4.getClass();
                            return (Iterable) gVar4.c(new B(gVar4, 9, iVar2));
                    }
                }
            };
            p148p2.g gVar3 = (p148p2.g) hVar.f13700f;
            if (!((Boolean) gVar3.i(aVar3)).booleanValue()) {
                gVar3.i(new L3.a(jMax, hVar, iVar2));
                return;
            }
            Iterable iterable = (Iterable) gVar3.i(new p158q2.a(hVar) { // from class: o2.g

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ h f13694t;

                {
                    this.f13694t = hVar;
                }

                @Override // p158q2.a
                public final Object b() {
                    Boolean bool;
                    switch (i14) {
                        case 0:
                            i iVar3 = iVar2;
                            p148p2.g gVar4 = (p148p2.g) this.f13694t.f13697c;
                            SQLiteDatabase sQLiteDatabaseA = gVar4.a();
                            sQLiteDatabaseA.beginTransaction();
                            try {
                                Long lB = p148p2.g.b(sQLiteDatabaseA, iVar3);
                                if (lB == null) {
                                    bool = Boolean.FALSE;
                                } else {
                                    Cursor cursorRawQuery = gVar4.a().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lB.toString()});
                                    try {
                                        Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                                        cursorRawQuery.close();
                                        bool = boolValueOf;
                                    } catch (Throwable th) {
                                        cursorRawQuery.close();
                                        throw th;
                                    }
                                }
                                sQLiteDatabaseA.setTransactionSuccessful();
                                sQLiteDatabaseA.endTransaction();
                                return bool;
                            } catch (Throwable th2) {
                                sQLiteDatabaseA.endTransaction();
                                throw th2;
                            }
                        default:
                            p148p2.g gVar5 = (p148p2.g) this.f13694t.f13697c;
                            gVar5.getClass();
                            return (Iterable) gVar5.c(new B(gVar5, 9, iVar2));
                    }
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            byte[] bArr2 = iVar2.f12181b;
            if (gVarA == null) {
                com.bumptech.glide.d.i("Uploader", "Unknown backend for %s, deleting event batch for it...", iVar2);
                aVar = new p090j2.a(3, -1L);
                bArr = bArr2;
                gVar = gVarA;
            } else {
                ArrayList<i2.h> arrayList = new ArrayList();
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList.add(((p148p2.b) it3.next()).f14207c);
                }
                if ((bArr2 != null ? 1 : i15) != 0) {
                    c cVar = hVar.f13703i;
                    Objects.requireNonNull(cVar);
                    p108l2.a aVar4 = (p108l2.a) gVar3.i(new C0187a(cVar, 17));
                    Q6.b bVar2 = new Q6.b();
                    bVar2.f4335f = new HashMap();
                    bVar2.f4333d = Long.valueOf(hVar.f13701g.k());
                    bVar2.f4334e = Long.valueOf(hVar.f13702h.k());
                    bVar2.a = "GDT_CLIENT_METRICS";
                    p051f2.c cVar2 = new p051f2.c("proto");
                    aVar4.getClass();
                    Y1.c cVar3 = n.a;
                    cVar3.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        cVar3.s(aVar4, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    bVar2.f4332c = new l(cVar2, byteArrayOutputStream.toByteArray());
                    arrayList.add(((g2.c) gVarA).a(bVar2.b()));
                }
                g2.c cVar4 = (g2.c) gVarA;
                HashMap map2 = new HashMap();
                for (i2.h hVar2 : arrayList) {
                    String str4 = hVar2.a;
                    if (map2.containsKey(str4)) {
                        ((List) map2.get(str4)).add(hVar2);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(hVar2);
                        map2.put(str4, arrayList2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it4 = map2.entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry entry = (Map.Entry) it4.next();
                    i2.h hVar3 = (i2.h) ((List) entry.getValue()).get(0);
                    J j = J.f11659s;
                    long jK = cVar4.f11536f.k();
                    long jK2 = cVar4.f11535e.k();
                    h2.n nVar = new h2.n(new h2.l(Integer.valueOf(hVar3.b("sdk-version")), hVar3.a("model"), hVar3.a("hardware"), hVar3.a("device"), hVar3.a("product"), hVar3.a("os-uild"), hVar3.a("manufacturer"), hVar3.a("fingerprint"), hVar3.a("locale"), hVar3.a("country"), hVar3.a("mcc_mnc"), hVar3.a("application_build")));
                    try {
                        numValueOf = Integer.valueOf(Integer.parseInt((String) entry.getKey()));
                        str2 = null;
                    } catch (NumberFormatException unused2) {
                        str2 = (String) entry.getKey();
                        numValueOf = null;
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it5 = ((List) entry.getValue()).iterator();
                    while (it5.hasNext()) {
                        byte[] bArr3 = bArr2;
                        i2.h hVar4 = (i2.h) it5.next();
                        l lVar = hVar4.f12174c;
                        p051f2.c cVar5 = lVar.a;
                        Iterator it6 = it4;
                        boolean zEquals = cVar5.equals(new p051f2.c("proto"));
                        byte[] bArr4 = lVar.f12190b;
                        if (zEquals) {
                            bVar = new V3.b();
                            bVar.f5175e = bArr4;
                            it = it5;
                        } else {
                            it = it5;
                            if (cVar5.equals(new p051f2.c("json"))) {
                                String str5 = new String(bArr4, Charset.forName(SyncSender.UTF_8));
                                V3.b bVar3 = new V3.b();
                                bVar3.f5176f = str5;
                                bVar = bVar3;
                            } else {
                                gVar2 = gVarA;
                                String strQ = com.bumptech.glide.d.q("CctTransportBackend");
                                if (Log.isLoggable(strQ, 5)) {
                                    Log.w(strQ, "Received event of unsupported encoding " + cVar5 + ". Skipping...");
                                }
                            }
                            gVarA = gVar2;
                            it5 = it;
                            bArr2 = bArr3;
                            it4 = it6;
                        }
                        gVar2 = gVarA;
                        bVar.a = Long.valueOf(hVar4.f12175d);
                        bVar.f5174d = Long.valueOf(hVar4.f12176e);
                        String str6 = (String) hVar4.f12177f.get("tz-offset");
                        bVar.f5177g = Long.valueOf(str6 == null ? 0L : Long.valueOf(str6).longValue());
                        bVar.f5178h = new v((H) H.f11657s.get(hVar4.b("net-type")), (G) G.f11655s.get(hVar4.b("mobile-subtype")));
                        Integer num = hVar4.f12173b;
                        if (num != null) {
                            bVar.f5172b = num;
                        }
                        Integer num2 = hVar4.f12178g;
                        if (num2 != null) {
                            r rVar = new r(new q(num2));
                            z zVar = z.f11725s;
                            bVar.f5173c = new o(rVar);
                        }
                        byte[] bArr5 = hVar4.j;
                        byte[] bArr6 = hVar4.f12180i;
                        if (bArr6 != null || bArr5 != null) {
                            if (bArr6 == null) {
                                bArr6 = null;
                            }
                            if (bArr5 == null) {
                                bArr5 = null;
                            }
                            bVar.f5179i = new p(bArr6, bArr5);
                        }
                        String strC = ((Long) bVar.a) == null ? " eventTimeMs" : "";
                        if (((Long) bVar.f5174d) == null) {
                            strC = strC.concat(" eventUptimeMs");
                        }
                        if (((Long) bVar.f5177g) == null) {
                            strC = p231y.a.c(strC, " timezoneOffsetSeconds");
                        }
                        if (!strC.isEmpty()) {
                            throw new IllegalStateException("Missing required properties:".concat(strC));
                        }
                        arrayList4.add(new s(((Long) bVar.a).longValue(), (Integer) bVar.f5172b, (o) bVar.f5173c, ((Long) bVar.f5174d).longValue(), (byte[]) bVar.f5175e, (String) bVar.f5176f, ((Long) bVar.f5177g).longValue(), (v) bVar.f5178h, (p) bVar.f5179i));
                        gVarA = gVar2;
                        it5 = it;
                        bArr2 = bArr3;
                        it4 = it6;
                    }
                    arrayList3.add(new t(jK, jK2, nVar, numValueOf, str2, arrayList4));
                    gVarA = gVarA;
                    bArr2 = bArr2;
                    it4 = it4;
                }
                bArr = bArr2;
                gVar = gVarA;
                m mVar = new m(arrayList3);
                URL urlB = cVar4.f11534d;
                if (bArr != null) {
                    try {
                        g2.a aVarA = g2.a.a(bArr);
                        str = aVarA.f11529b;
                        if (str == null) {
                            str = null;
                        }
                        String str7 = aVarA.a;
                        if (str7 != null) {
                            urlB = g2.c.b(str7);
                        }
                    } catch (IllegalArgumentException unused3) {
                        aVar = new p090j2.a(3, -1L);
                        i11 = 2;
                    }
                } else {
                    str = null;
                }
                try {
                    try {
                        Y1.c cVar6 = new Y1.c(urlB, mVar, str, 9);
                        C0187a c0187a = new C0187a(cVar4, 16);
                        int i16 = 5;
                        do {
                            bVarG = c0187a.g(cVar6);
                            URL url = bVarG.f11530b;
                            if (url != null) {
                                com.bumptech.glide.d.i("CctTransportBackend", "Following redirect to: %s", url);
                                try {
                                    cVar6 = new Y1.c(url, (m) cVar6.f5671u, (String) cVar6.f5672v, 9);
                                } catch (IOException unused4) {
                                    Log.isLoggable(com.bumptech.glide.d.q("CctTransportBackend"), 6);
                                    i11 = 2;
                                    aVar = new p090j2.a(2, -1L);
                                    i12 = aVar.a;
                                    if (i12 == i11) {
                                        gVar3.i(new J3.b(this, iterable, iVar, jMax));
                                        this.f13698d.a(iVar, i10 + 1, true);
                                        return;
                                    }
                                    iVar2 = iVar;
                                    gVar3.i(new B(this, 5, iterable));
                                    if (i12 == 1) {
                                        jMax = Math.max(jMax, aVar.f12360b);
                                        if (bArr != null) {
                                            gVar3.i(new C0187a(this, 19));
                                        }
                                    } else {
                                        if (i12 == 4) {
                                            map = new HashMap();
                                            it2 = iterable.iterator();
                                            while (it2.hasNext()) {
                                                str3 = ((p148p2.b) it2.next()).f14207c.a;
                                                if (map.containsKey(str3)) {
                                                    map.put(str3, Integer.valueOf(((Integer) map.get(str3)).intValue() + 1));
                                                } else {
                                                    map.put(str3, 1);
                                                }
                                            }
                                            i13 = 1;
                                            gVar3.i(new B(this, 6, map));
                                        }
                                        gVarA = gVar;
                                        hVar = this;
                                        i14 = i13;
                                        i15 = 0;
                                    }
                                    i13 = 1;
                                    gVarA = gVar;
                                    hVar = this;
                                    i14 = i13;
                                    i15 = 0;
                                }
                            } else {
                                cVar6 = null;
                            }
                            if (cVar6 == null) {
                                break;
                            } else {
                                i16--;
                            }
                        } while (i16 >= 1);
                        int i17 = bVarG.a;
                        if (i17 == 200) {
                            aVar2 = new p090j2.a(1, bVarG.f11531c);
                        } else if (i17 >= 500 || i17 == 404) {
                            aVar2 = new p090j2.a(2, -1L);
                        } else if (i17 == 400) {
                            try {
                                aVar2 = new p090j2.a(4, -1L);
                            } catch (IOException unused5) {
                                Log.isLoggable(com.bumptech.glide.d.q("CctTransportBackend"), 6);
                                i11 = 2;
                                aVar = new p090j2.a(2, -1L);
                            }
                        } else {
                            aVar2 = new p090j2.a(3, -1L);
                        }
                        aVar = aVar2;
                        i11 = 2;
                    } catch (IOException unused6) {
                    }
                } catch (IOException unused7) {
                }
                i12 = aVar.a;
                if (i12 == i11) {
                    gVar3.i(new J3.b(this, iterable, iVar, jMax));
                    this.f13698d.a(iVar, i10 + 1, true);
                    return;
                }
                iVar2 = iVar;
                gVar3.i(new B(this, 5, iterable));
                if (i12 == 1) {
                    jMax = Math.max(jMax, aVar.f12360b);
                    if (bArr != null) {
                        gVar3.i(new C0187a(this, 19));
                    }
                } else {
                    if (i12 == 4) {
                        map = new HashMap();
                        it2 = iterable.iterator();
                        while (it2.hasNext()) {
                            str3 = ((p148p2.b) it2.next()).f14207c.a;
                            if (map.containsKey(str3)) {
                                map.put(str3, 1);
                            } else {
                                map.put(str3, Integer.valueOf(((Integer) map.get(str3)).intValue() + 1));
                            }
                        }
                        i13 = 1;
                        gVar3.i(new B(this, 6, map));
                    }
                    gVarA = gVar;
                    hVar = this;
                    i14 = i13;
                    i15 = 0;
                }
                i13 = 1;
                gVarA = gVar;
                hVar = this;
                i14 = i13;
                i15 = 0;
            }
            i11 = 2;
            i12 = aVar.a;
            if (i12 == i11) {
                gVar3.i(new J3.b(this, iterable, iVar, jMax));
                this.f13698d.a(iVar, i10 + 1, true);
                return;
            }
            iVar2 = iVar;
            gVar3.i(new B(this, 5, iterable));
            if (i12 == 1) {
                jMax = Math.max(jMax, aVar.f12360b);
                if (bArr != null) {
                    gVar3.i(new C0187a(this, 19));
                }
            } else {
                if (i12 == 4) {
                    map = new HashMap();
                    it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        str3 = ((p148p2.b) it2.next()).f14207c.a;
                        if (map.containsKey(str3)) {
                            map.put(str3, 1);
                        } else {
                            map.put(str3, Integer.valueOf(((Integer) map.get(str3)).intValue() + 1));
                        }
                    }
                    i13 = 1;
                    gVar3.i(new B(this, 6, map));
                }
                gVarA = gVar;
                hVar = this;
                i14 = i13;
                i15 = 0;
            }
            i13 = 1;
            gVarA = gVar;
            hVar = this;
            i14 = i13;
            i15 = 0;
        }
    }
}
