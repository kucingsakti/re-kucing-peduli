package I;

import L8.C0289x;
import L8.InterfaceC0277k;
import L8.P;
import android.app.Notification;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class D implements X8.d {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f1940e;

    public D(Fa.e eVar, InterfaceC0277k interfaceC0277k, p009a9.e eVar2, int i10) {
        p210v8.i.f(eVar, "c");
        p210v8.i.f(eVar2, "typeParameterOwner");
        this.f1937b = eVar;
        this.f1938c = interfaceC0277k;
        this.a = i10;
        ArrayList arrayListZ = eVar2.z();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayListZ.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i11));
            i11++;
        }
        this.f1939d = linkedHashMap;
        this.f1940e = ((p247z9.l) ((I4.a) ((Fa.e) this.f1937b).f1659t).a).c(new A0.m(this, 21));
    }

    public static void b(String str) {
        if (str.equalsIgnoreCase(":memory:")) {
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z6 = false;
        while (i10 <= length) {
            boolean z10 = p210v8.i.h(str.charAt(!z6 ? i10 : length), 32) <= 0;
            if (z6) {
                if (!z10) {
                    break;
                } else {
                    length--;
                }
            } else if (z10) {
                i10++;
            } else {
                z6 = true;
            }
        }
        if (str.subSequence(i10, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e10) {
            Log.w("SupportSQLite", "delete failed: ", e10);
        }
    }

    public static void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override // X8.d
    public P a(R8.B b3) {
        p210v8.i.f(b3, "javaTypeParameter");
        Y8.F f10 = (Y8.F) ((p247z9.j) this.f1940e).invoke(b3);
        return f10 != null ? f10 : ((X8.d) ((Fa.e) this.f1937b).f1660u).a(b3);
    }

    public void d(P0.c cVar) throws IOException {
        Cursor cursorN = cVar.n("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z6 = false;
            if (cursorN.moveToFirst() && cursorN.getInt(0) == 0) {
                z6 = true;
            }
            cursorN.close();
            K0.n nVar = (K0.n) this.f1938c;
            nVar.a(cVar);
            if (!z6) {
                A1.J jP = nVar.p(cVar);
                if (!jP.f75t) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) jP.f76u));
                }
            }
            h(cVar);
            nVar.m(cVar);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                com.bumptech.glide.c.c(cursorN, th);
                throw th2;
            }
        }
    }

    public void e(P0.c cVar) throws IOException {
        Cursor cursorN = cVar.n("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z6 = cursorN.moveToFirst() && cursorN.getInt(0) != 0;
            cursorN.close();
            K0.n nVar = (K0.n) this.f1938c;
            if (z6) {
                Cursor cursorL = cVar.l(new C0289x("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorL.moveToFirst() ? cursorL.getString(0) : null;
                    cursorL.close();
                    String str = (String) this.f1939d;
                    if (!str.equals(string) && !((String) this.f1940e).equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + str + ", found: " + string);
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        com.bumptech.glide.c.c(cursorL, th);
                        throw th2;
                    }
                }
            } else {
                A1.J jP = nVar.p(cVar);
                if (!jP.f75t) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) jP.f76u));
                }
                h(cVar);
            }
            nVar.n(cVar);
            this.f1937b = null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                com.bumptech.glide.c.c(cursorN, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:19:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:? A[LOOP:1: B:12:0x0022->B:76:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0059 A[SYNTHETIC] */
    public void f(P0.c cVar, int i10, int i11) {
        LinkedHashSet linkedHashSet;
        Iterable iterable;
        TreeMap treeMap;
        Set setKeySet;
        Iterator it;
        boolean z6;
        Integer num;
        int i12;
        int iIntValue;
        int iIntValue2;
        K0.b bVar = (K0.b) this.f1937b;
        K0.n nVar = (K0.n) this.f1938c;
        if (bVar != null) {
            A1.r rVar = bVar.f2514d;
            rVar.getClass();
            if (i10 == i11) {
                iterable = p086i8.s.f12328s;
            } else {
                boolean z10 = i11 > i10;
                ArrayList arrayList = new ArrayList();
                int iIntValue3 = i10;
                while (true) {
                    if (z10) {
                        if (iIntValue3 < i11) {
                            treeMap = (TreeMap) ((LinkedHashMap) rVar.f167t).get(Integer.valueOf(iIntValue3));
                            if (treeMap != null) {
                                if (z10) {
                                    setKeySet = treeMap.descendingKeySet();
                                } else {
                                    setKeySet = treeMap.keySet();
                                }
                                it = setKeySet.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        z6 = false;
                                        break;
                                    }
                                    num = (Integer) it.next();
                                    if (!z10) {
                                        p210v8.i.e(num, "targetVersion");
                                        iIntValue2 = num.intValue();
                                        if (i11 <= iIntValue2 && iIntValue2 < iIntValue3) {
                                            Object obj = treeMap.get(num);
                                            p210v8.i.c(obj);
                                            arrayList.add(obj);
                                            iIntValue3 = num.intValue();
                                            z6 = true;
                                            break;
                                            break;
                                        }
                                    } else {
                                        i12 = iIntValue3 + 1;
                                        p210v8.i.e(num, "targetVersion");
                                        iIntValue = num.intValue();
                                        if (i12 <= iIntValue && iIntValue <= i11) {
                                            Object obj2 = treeMap.get(num);
                                            p210v8.i.c(obj2);
                                            arrayList.add(obj2);
                                            iIntValue3 = num.intValue();
                                            z6 = true;
                                            break;
                                        }
                                    }
                                }
                                if (!z6) {
                                }
                            }
                            iterable = null;
                        } else {
                            iterable = arrayList;
                        }
                    } else if (iIntValue3 > i11) {
                        treeMap = (TreeMap) ((LinkedHashMap) rVar.f167t).get(Integer.valueOf(iIntValue3));
                        if (treeMap != null) {
                            if (z10) {
                                setKeySet = treeMap.descendingKeySet();
                            } else {
                                setKeySet = treeMap.keySet();
                            }
                            it = setKeySet.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z6 = false;
                                    break;
                                    break;
                                }
                                num = (Integer) it.next();
                                if (!z10) {
                                    i12 = iIntValue3 + 1;
                                    p210v8.i.e(num, "targetVersion");
                                    iIntValue = num.intValue();
                                    if (i12 <= iIntValue) {
                                        continue;
                                    }
                                } else {
                                    p210v8.i.e(num, "targetVersion");
                                    iIntValue2 = num.intValue();
                                    if (i11 <= iIntValue2) {
                                        continue;
                                    }
                                }
                            }
                            if (!z6) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                }
            }
            if (iterable != null) {
                nVar.o(cVar);
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((L0.a) it2.next()).a(cVar);
                }
                A1.J jP = nVar.p(cVar);
                if (jP.f75t) {
                    h(cVar);
                    return;
                } else {
                    throw new IllegalStateException("Migration didn't properly handle: " + ((String) jP.f76u));
                }
            }
        }
        K0.b bVar2 = (K0.b) this.f1937b;
        if (bVar2 != null) {
            if (!((i10 <= i11 || !bVar2.f2520k) && bVar2.j && ((linkedHashSet = bVar2.f2521l) == null || !linkedHashSet.contains(Integer.valueOf(i10))))) {
                nVar.b(cVar);
                nVar.a(cVar);
                return;
            }
        }
        throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public void h(P0.c cVar) {
        cVar.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) this.f1939d) + "')");
    }

    public D(K0.b bVar, K0.n nVar, String str, String str2) {
        this.a = nVar.a;
        this.f1937b = bVar;
        this.f1938c = nVar;
        this.f1939d = str;
        this.f1940e = str2;
    }

    public D(s sVar) {
        Bundle bundle;
        int i10;
        ArrayList arrayList;
        Bundle bundle2;
        int i11;
        new ArrayList();
        this.f1940e = new Bundle();
        this.f1939d = sVar;
        Context context = sVar.a;
        this.f1937b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.f1938c = z.a(context, sVar.f2004v);
        } else {
            this.f1938c = new Notification.Builder(sVar.a);
        }
        Notification notification = sVar.f2008z;
        int i12 = 0;
        ((Notification.Builder) this.f1938c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(sVar.f1988e).setContentText(sVar.f1989f).setContentInfo(null).setContentIntent(sVar.f1990g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(sVar.f1992i).setProgress(sVar.f1995m, sVar.f1996n, sVar.f1997o);
        Notification.Builder builder = (Notification.Builder) this.f1938c;
        IconCompat iconCompat = sVar.f1991h;
        x.b(builder, iconCompat == null ? null : M.c.c(iconCompat, context));
        ((Notification.Builder) this.f1938c).setSubText(null).setUsesChronometer(false).setPriority(sVar.j);
        for (C0249m c0249m : sVar.f1985b) {
            if (c0249m.f1973b == null && (i11 = c0249m.f1976e) != 0) {
                c0249m.f1973b = IconCompat.b(i11);
            }
            IconCompat iconCompat2 = c0249m.f1973b;
            Notification.Action.Builder builderA = x.a(iconCompat2 != null ? M.c.c(iconCompat2, null) : null, c0249m.f1977f, c0249m.f1978g);
            Bundle bundle3 = c0249m.a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z6 = c0249m.f1974c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z6);
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 24) {
                y.a(builderA, z6);
            }
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i13 >= 28) {
                A.b(builderA, 0);
            }
            if (i13 >= 29) {
                B.c(builderA, false);
            }
            if (i13 >= 31) {
                C.a(builderA, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c0249m.f1975d);
            v.b(builderA, bundle2);
            v.a((Notification.Builder) this.f1938c, v.d(builderA));
        }
        Bundle bundle4 = sVar.f2001s;
        if (bundle4 != null) {
            ((Bundle) this.f1940e).putAll(bundle4);
        }
        int i14 = Build.VERSION.SDK_INT;
        ((Notification.Builder) this.f1938c).setShowWhen(sVar.f1993k);
        v.i((Notification.Builder) this.f1938c, sVar.f2000r);
        v.g((Notification.Builder) this.f1938c, sVar.f1998p);
        v.j((Notification.Builder) this.f1938c, null);
        v.h((Notification.Builder) this.f1938c, sVar.f1999q);
        this.a = sVar.f2006x;
        w.b((Notification.Builder) this.f1938c, null);
        w.c((Notification.Builder) this.f1938c, sVar.f2002t);
        w.f((Notification.Builder) this.f1938c, sVar.f2003u);
        w.d((Notification.Builder) this.f1938c, null);
        w.e((Notification.Builder) this.f1938c, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = sVar.f1984A;
        ArrayList arrayList3 = sVar.f1986c;
        if (i14 < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    throw E0.a.e(it);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    p212w.f fVar = new p212w.f(arrayList2.size() + arrayList.size());
                    fVar.addAll(arrayList);
                    fVar.addAll(arrayList2);
                    arrayList2 = new ArrayList(fVar);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                w.a((Notification.Builder) this.f1938c, (String) it2.next());
            }
        }
        ArrayList arrayList4 = sVar.f1987d;
        if (arrayList4.size() > 0) {
            if (sVar.f2001s == null) {
                sVar.f2001s = new Bundle();
            }
            Bundle bundle5 = sVar.f2001s.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i15 = 0;
            while (i15 < arrayList4.size()) {
                String string = Integer.toString(i15);
                C0249m c0249m2 = (C0249m) arrayList4.get(i15);
                Bundle bundle8 = new Bundle();
                if (c0249m2.f1973b == null && (i10 = c0249m2.f1976e) != 0) {
                    c0249m2.f1973b = IconCompat.b(i10);
                }
                IconCompat iconCompat3 = c0249m2.f1973b;
                bundle8.putInt("icon", iconCompat3 != null ? iconCompat3.c() : i12);
                bundle8.putCharSequence("title", c0249m2.f1977f);
                bundle8.putParcelable("actionIntent", c0249m2.f1978g);
                Bundle bundle9 = c0249m2.a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", c0249m2.f1974c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c0249m2.f1975d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
                i15++;
                i12 = 0;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (sVar.f2001s == null) {
                sVar.f2001s = new Bundle();
            }
            sVar.f2001s.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.f1940e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 24) {
            ((Notification.Builder) this.f1938c).setExtras(sVar.f2001s);
            y.e((Notification.Builder) this.f1938c, null);
        }
        if (i16 >= 26) {
            z.b((Notification.Builder) this.f1938c, 0);
            z.e((Notification.Builder) this.f1938c, null);
            z.f((Notification.Builder) this.f1938c, null);
            z.g((Notification.Builder) this.f1938c, sVar.f2005w);
            z.d((Notification.Builder) this.f1938c, sVar.f2006x);
            if (!TextUtils.isEmpty(sVar.f2004v)) {
                ((Notification.Builder) this.f1938c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i16 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                throw E0.a.e(it3);
            }
        }
        if (i16 >= 29) {
            B.a((Notification.Builder) this.f1938c, sVar.f2007y);
            B.b((Notification.Builder) this.f1938c, null);
        }
    }

    public void c(P0.c cVar) {
    }
}
