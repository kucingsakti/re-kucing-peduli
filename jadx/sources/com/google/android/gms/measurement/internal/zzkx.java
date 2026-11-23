package com.google.android.gms.measurement.internal;

import B4.I;
import J0.C0252b;
import M2.AbstractC0305n;
import M2.C0313w;
import M2.b0;
import M2.c0;
import M2.d0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Build;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzne;
import com.google.android.gms.internal.measurement.zzpg;
import com.google.android.gms.internal.measurement.zzps;
import com.onesignal.inAppMessages.internal.display.impl.k;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzkx extends AbstractC0305n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final b0 f9241A;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final zzlw f9242u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public zzfl f9243v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile Boolean f9244w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b0 f9245x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0252b f9246y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f9247z;

    public zzkx(zzhj zzhjVar) {
        super(zzhjVar);
        this.f9247z = new ArrayList();
        this.f9246y = new C0252b(zzhjVar.f9120F);
        this.f9242u = new zzlw(this);
        this.f9245x = new b0(this, zzhjVar, 0);
        this.f9241A = new b0(this, zzhjVar, 1);
    }

    @Override // M2.AbstractC0305n
    public final boolean c1() {
        return false;
    }

    public final void d1(zzae zzaeVar) {
        boolean zE1;
        W0();
        a1();
        zzfp zzfpVarP = ((zzhj) this.f577s).p();
        zzfpVarP.V0();
        byte[] bArrM1 = zznp.M1(zzaeVar);
        if (bArrM1.length > 131072) {
            zzfpVarP.i().f9057y.b("Conditional user property too long for local database. Sending directly to service");
            zE1 = false;
        } else {
            zE1 = zzfpVarP.e1(2, bArrM1);
        }
        boolean z6 = zE1;
        f1(new d0(this, p1(true), z6, new zzae(zzaeVar), zzaeVar));
    }

    /* JADX WARN: Code duplicated, block: B:152:0x024b A[Catch: all -> 0x024f, TryCatch #33 {all -> 0x024f, blocks: (B:150:0x0245, B:152:0x024b, B:155:0x0252, B:173:0x028c), top: B:246:0x0245 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x0260  */
    /* JADX WARN: Code duplicated, block: B:159:0x0265  */
    /* JADX WARN: Code duplicated, block: B:166:0x0278  */
    /* JADX WARN: Code duplicated, block: B:168:0x027d  */
    /* JADX WARN: Code duplicated, block: B:175:0x029a  */
    /* JADX WARN: Code duplicated, block: B:177:0x029f  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:182:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:246:0x0245 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x02a2 A[SYNTHETIC] */
    public final void e1(zzfl zzflVar, AbstractSafeParcelable abstractSafeParcelable, zzo zzoVar) throws Throwable {
        int i10;
        Cursor cursor;
        SQLiteDatabase sQLiteDatabaseH1;
        Cursor cursorQuery;
        Cursor cursor2;
        SQLiteDatabase sQLiteDatabase;
        String str;
        String[] strArr;
        Cursor cursor3;
        int i11;
        zzae zzaeVarCreateFromParcel;
        zzno zznoVarCreateFromParcel;
        ArrayList arrayList;
        int size;
        W0();
        a1();
        int i12 = 100;
        int i13 = 0;
        int i14 = 100;
        int i15 = 0;
        while (i15 < 1001 && i14 == i12) {
            ArrayList arrayList2 = new ArrayList();
            zzfp zzfpVarP = ((zzhj) this.f577s).p();
            zzfpVarP.W0();
            if (zzfpVarP.f9029v) {
                i10 = i12;
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                if (((zzhj) zzfpVarP.f577s).f9140s.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i16 = 5;
                    int i17 = i13;
                    int i18 = 5;
                    while (true) {
                        if (i17 < i16) {
                            int i19 = 1;
                            try {
                                sQLiteDatabaseH1 = zzfpVarP.h1();
                                if (sQLiteDatabaseH1 == null) {
                                    try {
                                        try {
                                            try {
                                                zzfpVarP.f9029v = true;
                                                if (sQLiteDatabaseH1 != null) {
                                                    sQLiteDatabaseH1.close();
                                                }
                                                i10 = i12;
                                            } catch (Throwable th) {
                                                th = th;
                                                sQLiteDatabaseH1 = sQLiteDatabaseH1;
                                                cursor = null;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabaseH1 != null) {
                                                    sQLiteDatabaseH1.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteFullException e10) {
                                            e = e10;
                                            i10 = i12;
                                            cursorQuery = null;
                                            zzfpVarP.i().f9056x.a(e, "Error reading entries from local database");
                                            zzfpVarP.f9029v = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseH1 != null) {
                                                sQLiteDatabaseH1.close();
                                            }
                                            i17++;
                                            arrayList3 = arrayList3;
                                            i12 = i10;
                                            i13 = 0;
                                            i16 = 5;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        i10 = i12;
                                        sQLiteDatabase = sQLiteDatabaseH1;
                                        cursor2 = null;
                                        try {
                                            SystemClock.sleep(i18);
                                            i18 += 20;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            i17++;
                                            arrayList3 = arrayList3;
                                            i12 = i10;
                                            i13 = 0;
                                            i16 = 5;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursor2;
                                            sQLiteDatabaseH1 = sQLiteDatabase;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabaseH1 != null) {
                                                sQLiteDatabaseH1.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        i10 = i12;
                                        sQLiteDatabaseH1 = sQLiteDatabaseH1;
                                        cursorQuery = null;
                                        if (sQLiteDatabaseH1 != null) {
                                            try {
                                                if (sQLiteDatabaseH1.inTransaction()) {
                                                    sQLiteDatabaseH1.endTransaction();
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabaseH1 != null) {
                                                    sQLiteDatabaseH1.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        zzfpVarP.i().f9056x.a(e, "Error reading entries from local database");
                                        zzfpVarP.f9029v = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabaseH1 != null) {
                                            sQLiteDatabaseH1.close();
                                        }
                                        arrayList3 = arrayList3;
                                        i17++;
                                        arrayList3 = arrayList3;
                                        i12 = i10;
                                        i13 = 0;
                                        i16 = 5;
                                    }
                                } else {
                                    try {
                                        sQLiteDatabaseH1.beginTransaction();
                                        long jD1 = zzfp.d1(sQLiteDatabaseH1);
                                        long j = -1;
                                        if (jD1 != -1) {
                                            String[] strArr2 = new String[1];
                                            strArr2[i13] = String.valueOf(jD1);
                                            str = "rowid<?";
                                            strArr = strArr2;
                                        } else {
                                            str = null;
                                            strArr = null;
                                        }
                                        i10 = i12;
                                        try {
                                            cursorQuery = sQLiteDatabaseH1.query("messages", new String[]{"rowid", k.EVENT_TYPE_KEY, "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(i10));
                                            sQLiteDatabaseH1 = sQLiteDatabaseH1;
                                            while (cursorQuery.moveToNext()) {
                                                try {
                                                    try {
                                                        j = cursorQuery.getLong(i13);
                                                        int i20 = cursorQuery.getInt(i19);
                                                        try {
                                                            try {
                                                                byte[] blob = cursorQuery.getBlob(2);
                                                                if (i20 == 0) {
                                                                    try {
                                                                        Parcel parcelObtain = Parcel.obtain();
                                                                        try {
                                                                            cursor3 = cursorQuery;
                                                                            try {
                                                                                try {
                                                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                    parcelObtain.setDataPosition(0);
                                                                                    zzbd zzbdVarCreateFromParcel = zzbd.CREATOR.createFromParcel(parcelObtain);
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    parcelObtain.recycle();
                                                                                                    if (zzbdVarCreateFromParcel != null) {
                                                                                                        arrayList3.add(zzbdVarCreateFromParcel);
                                                                                                    }
                                                                                                } catch (Throwable th4) {
                                                                                                    th = th4;
                                                                                                    cursor = cursor3;
                                                                                                    if (cursor != null) {
                                                                                                        cursor.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseH1 != null) {
                                                                                                        sQLiteDatabaseH1.close();
                                                                                                    }
                                                                                                    throw th;
                                                                                                }
                                                                                            } catch (SQLiteException e12) {
                                                                                                e = e12;
                                                                                                cursorQuery = cursor3;
                                                                                                if (sQLiteDatabaseH1 != null) {
                                                                                                    if (sQLiteDatabaseH1.inTransaction()) {
                                                                                                        sQLiteDatabaseH1.endTransaction();
                                                                                                    }
                                                                                                }
                                                                                                zzfpVarP.i().f9056x.a(e, "Error reading entries from local database");
                                                                                                zzfpVarP.f9029v = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseH1 != null) {
                                                                                                    sQLiteDatabaseH1.close();
                                                                                                }
                                                                                                arrayList3 = arrayList3;
                                                                                                i17++;
                                                                                                arrayList3 = arrayList3;
                                                                                                i12 = i10;
                                                                                                i13 = 0;
                                                                                                i16 = 5;
                                                                                            }
                                                                                        } catch (SQLiteDatabaseLockedException unused2) {
                                                                                            sQLiteDatabase = sQLiteDatabaseH1;
                                                                                            cursor2 = cursor3;
                                                                                            SystemClock.sleep(i18);
                                                                                            i18 += 20;
                                                                                            if (cursor2 != null) {
                                                                                                cursor2.close();
                                                                                            }
                                                                                            if (sQLiteDatabase != null) {
                                                                                                sQLiteDatabase.close();
                                                                                            }
                                                                                            i17++;
                                                                                            arrayList3 = arrayList3;
                                                                                            i12 = i10;
                                                                                            i13 = 0;
                                                                                            i16 = 5;
                                                                                        }
                                                                                    } catch (SQLiteFullException e13) {
                                                                                        e = e13;
                                                                                        arrayList3 = arrayList3;
                                                                                        cursorQuery = cursor3;
                                                                                        zzfpVarP.i().f9056x.a(e, "Error reading entries from local database");
                                                                                        zzfpVarP.f9029v = true;
                                                                                        if (cursorQuery != null) {
                                                                                            cursorQuery.close();
                                                                                        }
                                                                                        if (sQLiteDatabaseH1 != null) {
                                                                                            sQLiteDatabaseH1.close();
                                                                                        }
                                                                                        i17++;
                                                                                        arrayList3 = arrayList3;
                                                                                        i12 = i10;
                                                                                        i13 = 0;
                                                                                        i16 = 5;
                                                                                    }
                                                                                } catch (SafeParcelReader.ParseException unused3) {
                                                                                    zzfpVarP.i().f9056x.b("Failed to load event from local database");
                                                                                    parcelObtain.recycle();
                                                                                }
                                                                            } catch (Throwable th5) {
                                                                                th = th5;
                                                                                parcelObtain.recycle();
                                                                                throw th;
                                                                            }
                                                                        } catch (SafeParcelReader.ParseException unused4) {
                                                                            cursor3 = cursorQuery;
                                                                        } catch (Throwable th6) {
                                                                            th = th6;
                                                                        }
                                                                        i11 = 0;
                                                                        i13 = i11;
                                                                        cursorQuery = cursor3;
                                                                        i19 = 1;
                                                                    } catch (SQLiteFullException e14) {
                                                                        e = e14;
                                                                        arrayList3 = arrayList3;
                                                                        zzfpVarP.i().f9056x.a(e, "Error reading entries from local database");
                                                                        zzfpVarP.f9029v = true;
                                                                        if (cursorQuery != null) {
                                                                            cursorQuery.close();
                                                                        }
                                                                        if (sQLiteDatabaseH1 != null) {
                                                                            sQLiteDatabaseH1.close();
                                                                        }
                                                                        i17++;
                                                                        arrayList3 = arrayList3;
                                                                        i12 = i10;
                                                                        i13 = 0;
                                                                        i16 = 5;
                                                                    }
                                                                } else {
                                                                    cursor3 = cursorQuery;
                                                                    if (i20 == 1) {
                                                                        Parcel parcelObtain2 = Parcel.obtain();
                                                                        try {
                                                                            try {
                                                                                parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                parcelObtain2.setDataPosition(0);
                                                                                zznoVarCreateFromParcel = zzno.CREATOR.createFromParcel(parcelObtain2);
                                                                                parcelObtain2.recycle();
                                                                            } catch (SafeParcelReader.ParseException unused5) {
                                                                                zzfpVarP.i().f9056x.b("Failed to load user property from local database");
                                                                                parcelObtain2.recycle();
                                                                                zznoVarCreateFromParcel = null;
                                                                            }
                                                                            if (zznoVarCreateFromParcel != null) {
                                                                                arrayList3.add(zznoVarCreateFromParcel);
                                                                            }
                                                                            i11 = 0;
                                                                        } catch (Throwable th7) {
                                                                            parcelObtain2.recycle();
                                                                            throw th7;
                                                                        }
                                                                    } else if (i20 == 2) {
                                                                        try {
                                                                            Parcel parcelObtain3 = Parcel.obtain();
                                                                            try {
                                                                                i11 = 0;
                                                                                try {
                                                                                    try {
                                                                                        parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                        parcelObtain3.setDataPosition(0);
                                                                                        zzaeVarCreateFromParcel = zzae.CREATOR.createFromParcel(parcelObtain3);
                                                                                        try {
                                                                                            parcelObtain3.recycle();
                                                                                        } catch (SQLiteDatabaseLockedException unused6) {
                                                                                            sQLiteDatabase = sQLiteDatabaseH1;
                                                                                            cursor2 = cursor3;
                                                                                            SystemClock.sleep(i18);
                                                                                            i18 += 20;
                                                                                            if (cursor2 != null) {
                                                                                                cursor2.close();
                                                                                            }
                                                                                            if (sQLiteDatabase != null) {
                                                                                                sQLiteDatabase.close();
                                                                                            }
                                                                                            i17++;
                                                                                            arrayList3 = arrayList3;
                                                                                            i12 = i10;
                                                                                            i13 = 0;
                                                                                            i16 = 5;
                                                                                        } catch (SQLiteException e15) {
                                                                                            e = e15;
                                                                                            cursorQuery = cursor3;
                                                                                            if (sQLiteDatabaseH1 != null) {
                                                                                                if (sQLiteDatabaseH1.inTransaction()) {
                                                                                                    sQLiteDatabaseH1.endTransaction();
                                                                                                }
                                                                                            }
                                                                                            zzfpVarP.i().f9056x.a(e, "Error reading entries from local database");
                                                                                            zzfpVarP.f9029v = true;
                                                                                            if (cursorQuery != null) {
                                                                                                cursorQuery.close();
                                                                                            }
                                                                                            if (sQLiteDatabaseH1 != null) {
                                                                                                sQLiteDatabaseH1.close();
                                                                                            }
                                                                                            arrayList3 = arrayList3;
                                                                                            i17++;
                                                                                            arrayList3 = arrayList3;
                                                                                            i12 = i10;
                                                                                            i13 = 0;
                                                                                            i16 = 5;
                                                                                        }
                                                                                    } catch (SafeParcelReader.ParseException unused7) {
                                                                                        zzfpVarP.i().f9056x.b("Failed to load conditional user property from local database");
                                                                                        parcelObtain3.recycle();
                                                                                        zzaeVarCreateFromParcel = null;
                                                                                    }
                                                                                } catch (Throwable th8) {
                                                                                    th = th8;
                                                                                    parcelObtain3.recycle();
                                                                                    throw th;
                                                                                }
                                                                            } catch (SafeParcelReader.ParseException unused8) {
                                                                                i11 = 0;
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                            }
                                                                            if (zzaeVarCreateFromParcel != null) {
                                                                                arrayList3.add(zzaeVarCreateFromParcel);
                                                                            }
                                                                        } catch (SQLiteFullException e16) {
                                                                            e = e16;
                                                                            arrayList3 = arrayList3;
                                                                            cursorQuery = cursor3;
                                                                            zzfpVarP.i().f9056x.a(e, "Error reading entries from local database");
                                                                            zzfpVarP.f9029v = true;
                                                                            if (cursorQuery != null) {
                                                                                cursorQuery.close();
                                                                            }
                                                                            if (sQLiteDatabaseH1 != null) {
                                                                                sQLiteDatabaseH1.close();
                                                                            }
                                                                            i17++;
                                                                            arrayList3 = arrayList3;
                                                                            i12 = i10;
                                                                            i13 = 0;
                                                                            i16 = 5;
                                                                        } catch (SQLiteException e17) {
                                                                            e = e17;
                                                                        }
                                                                    } else {
                                                                        i11 = 0;
                                                                        if (i20 == 3) {
                                                                            zzfpVarP.i().f9047A.b("Skipping app launch break");
                                                                        } else {
                                                                            zzfpVarP.i().f9056x.b("Unknown record type in local database");
                                                                        }
                                                                    }
                                                                    i13 = i11;
                                                                    cursorQuery = cursor3;
                                                                    i19 = 1;
                                                                }
                                                            } catch (SQLiteFullException e18) {
                                                                e = e18;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused9) {
                                                            cursor3 = cursorQuery;
                                                        } catch (SQLiteException e19) {
                                                            e = e19;
                                                        }
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        cursor3 = cursorQuery;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused10) {
                                                    cursor3 = cursorQuery;
                                                } catch (SQLiteFullException e20) {
                                                    e = e20;
                                                } catch (SQLiteException e21) {
                                                    e = e21;
                                                }
                                                i17++;
                                                arrayList3 = arrayList3;
                                                i12 = i10;
                                                i13 = 0;
                                                i16 = 5;
                                            }
                                            Cursor cursor4 = cursorQuery;
                                            if (sQLiteDatabaseH1.delete("messages", "rowid <= ?", new String[]{Long.toString(j)}) < arrayList3.size()) {
                                                zzfpVarP.i().f9056x.b("Fewer entries removed from local database than expected");
                                            }
                                            sQLiteDatabaseH1.setTransactionSuccessful();
                                            sQLiteDatabaseH1.endTransaction();
                                            cursor4.close();
                                            sQLiteDatabaseH1.close();
                                        } catch (SQLiteDatabaseLockedException unused11) {
                                            sQLiteDatabase = sQLiteDatabaseH1;
                                            cursor2 = null;
                                            SystemClock.sleep(i18);
                                            i18 += 20;
                                            if (cursor2 != null) {
                                                cursor2.close();
                                            }
                                            if (sQLiteDatabase != null) {
                                                sQLiteDatabase.close();
                                            }
                                            i17++;
                                            arrayList3 = arrayList3;
                                            i12 = i10;
                                            i13 = 0;
                                            i16 = 5;
                                        } catch (SQLiteFullException e22) {
                                            e = e22;
                                            cursorQuery = null;
                                            zzfpVarP.i().f9056x.a(e, "Error reading entries from local database");
                                            zzfpVarP.f9029v = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseH1 != null) {
                                                sQLiteDatabaseH1.close();
                                            }
                                            i17++;
                                            arrayList3 = arrayList3;
                                            i12 = i10;
                                            i13 = 0;
                                            i16 = 5;
                                        } catch (SQLiteException e23) {
                                            e = e23;
                                            sQLiteDatabaseH1 = sQLiteDatabaseH1;
                                            cursorQuery = null;
                                            if (sQLiteDatabaseH1 != null) {
                                                if (sQLiteDatabaseH1.inTransaction()) {
                                                    sQLiteDatabaseH1.endTransaction();
                                                }
                                            }
                                            zzfpVarP.i().f9056x.a(e, "Error reading entries from local database");
                                            zzfpVarP.f9029v = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseH1 != null) {
                                                sQLiteDatabaseH1.close();
                                            }
                                            arrayList3 = arrayList3;
                                            i17++;
                                            arrayList3 = arrayList3;
                                            i12 = i10;
                                            i13 = 0;
                                            i16 = 5;
                                        }
                                    } catch (SQLiteFullException e24) {
                                        e = e24;
                                        i10 = i12;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused12) {
                                i10 = i12;
                                cursor2 = null;
                                sQLiteDatabase = null;
                            } catch (SQLiteFullException e25) {
                                e = e25;
                                i10 = i12;
                                arrayList3 = arrayList3;
                                cursorQuery = null;
                                sQLiteDatabaseH1 = null;
                            } catch (SQLiteException e26) {
                                e = e26;
                                i10 = i12;
                                cursorQuery = null;
                                sQLiteDatabaseH1 = null;
                            } catch (Throwable th11) {
                                th = th11;
                                cursor = null;
                                sQLiteDatabaseH1 = null;
                            }
                        } else {
                            i10 = i12;
                            zzfpVarP.i().f9047A.b("Failed to read events from database in reasonable time");
                        }
                        arrayList = null;
                    }
                } else {
                    i10 = i12;
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = 0;
            }
            int i21 = i10;
            if (abstractSafeParcelable != null && size < i21) {
                arrayList2.add(abstractSafeParcelable);
            }
            int size2 = arrayList2.size();
            int i22 = 0;
            while (i22 < size2) {
                int i23 = i22 + 1;
                AbstractSafeParcelable abstractSafeParcelable2 = (AbstractSafeParcelable) arrayList2.get(i22);
                if (abstractSafeParcelable2 instanceof zzbd) {
                    try {
                        zzflVar.P((zzbd) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e27) {
                        i().f9056x.a(e27, "Failed to send event to the service");
                    }
                } else if (abstractSafeParcelable2 instanceof zzno) {
                    try {
                        zzflVar.A((zzno) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e28) {
                        i().f9056x.a(e28, "Failed to send user property to the service");
                    }
                } else if (abstractSafeParcelable2 instanceof zzae) {
                    try {
                        zzflVar.X((zzae) abstractSafeParcelable2, zzoVar);
                    } catch (RemoteException e29) {
                        i().f9056x.a(e29, "Failed to send conditional user property to the service");
                    }
                } else {
                    i().f9056x.b("Discarding data. Unrecognized parcel type.");
                }
                i22 = i23;
            }
            i15++;
            i14 = size;
            i12 = i21;
            i13 = 0;
        }
    }

    public final void f1(Runnable runnable) {
        W0();
        if (k1()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f9247z;
        if (arrayList.size() >= 1000) {
            i().f9056x.b("Discarding data. Max runnable queue size reached");
            return;
        }
        arrayList.add(runnable);
        this.f9241A.b(60000L);
        i1();
    }

    public final void g1(AtomicReference atomicReference) {
        W0();
        a1();
        f1(new I(this, atomicReference, p1(false), 7));
    }

    public final void h1(boolean z6) {
        W0();
        a1();
        com.google.android.gms.internal.measurement.zznk.a();
        zzhj zzhjVar = (zzhj) this.f577s;
        if (!zzhjVar.f9146y.h1(null, zzbf.U0) && z6) {
            zzhjVar.p().f1();
        }
        if (l1()) {
            f1(new c0(this, p1(false), 3));
        }
    }

    public final void i1() {
        W0();
        a1();
        if (k1()) {
            return;
        }
        if (!m1()) {
            if (((zzhj) this.f577s).f9146y.l1()) {
                return;
            }
            List<ResolveInfo> listQueryIntentServices = ((zzhj) this.f577s).f9140s.getPackageManager().queryIntentServices(new Intent().setClassName(((zzhj) this.f577s).f9140s, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
                i().f9056x.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
                return;
            }
            Intent intent = new Intent("com.google.android.gms.measurement.START");
            intent.setComponent(new ComponentName(((zzhj) this.f577s).f9140s, "com.google.android.gms.measurement.AppMeasurementService"));
            this.f9242u.a(intent);
            return;
        }
        zzlw zzlwVar = this.f9242u;
        zzlwVar.f9252u.W0();
        Context context = ((zzhj) zzlwVar.f9252u.f577s).f9140s;
        synchronized (zzlwVar) {
            try {
                if (zzlwVar.f9250s) {
                    zzlwVar.f9252u.i().f9052F.b("Connection attempt already in progress");
                    return;
                }
                if (zzlwVar.f9251t != null && (zzlwVar.f9251t.j() || zzlwVar.f9251t.a())) {
                    zzlwVar.f9252u.i().f9052F.b("Already awaiting connection attempt");
                    return;
                }
                zzlwVar.f9251t = new zzft(context, Looper.getMainLooper(), GmsClientSupervisor.a(context), GoogleApiAvailabilityLight.f7833b, 93, zzlwVar, zzlwVar, null);
                zzlwVar.f9252u.i().f9052F.b("Connecting to remote service");
                zzlwVar.f9250s = true;
                Preconditions.i(zzlwVar.f9251t);
                zzlwVar.f9251t.u();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j1() {
        W0();
        a1();
        zzlw zzlwVar = this.f9242u;
        if (zzlwVar.f9251t != null && (zzlwVar.f9251t.a() || zzlwVar.f9251t.j())) {
            zzlwVar.f9251t.q();
        }
        zzlwVar.f9251t = null;
        try {
            ConnectionTracker.b().c(((zzhj) this.f577s).f9140s, this.f9242u);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f9243v = null;
    }

    public final boolean k1() {
        W0();
        a1();
        return this.f9243v != null;
    }

    public final boolean l1() {
        W0();
        a1();
        return !m1() || V0().b2() >= ((Integer) zzbf.f9000o0.a(null)).intValue();
    }

    public final boolean m1() {
        boolean z6;
        W0();
        a1();
        if (this.f9244w == null) {
            W0();
            a1();
            C0313w c0313wU0 = U0();
            c0313wU0.W0();
            boolean z10 = false;
            Boolean boolValueOf = !c0313wU0.f1().contains("use_service") ? null : Boolean.valueOf(c0313wU0.f1().getBoolean("use_service", false));
            boolean z11 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                zzfq zzfqVarO = ((zzhj) this.f577s).o();
                zzfqVarO.a1();
                if (zzfqVarO.f9032C == 1) {
                    z6 = true;
                } else {
                    i().f9052F.b("Checking service availability");
                    int iB = GoogleApiAvailabilityLight.f7833b.b(((zzhj) V0().f577s).f9140s, 12451000);
                    if (iB != 0) {
                        if (iB == 1) {
                            i().f9052F.b("Service missing");
                        } else if (iB != 2) {
                            if (iB == 3) {
                                i().f9047A.b("Service disabled");
                            } else if (iB == 9) {
                                i().f9047A.b("Service invalid");
                            } else if (iB != 18) {
                                i().f9047A.a(Integer.valueOf(iB), "Unexpected service status");
                            } else {
                                i().f9047A.b("Service updating");
                            }
                            z6 = false;
                            z11 = false;
                        } else {
                            i().f9051E.b("Service container out of date");
                            if (V0().b2() >= 17443) {
                                z11 = boolValueOf == null;
                                z6 = false;
                            }
                        }
                        z6 = true;
                        z11 = false;
                    } else {
                        i().f9052F.b("Service available");
                    }
                    z6 = true;
                }
                if (z11 || !((zzhj) this.f577s).f9146y.l1()) {
                    z10 = z6;
                } else {
                    i().f9056x.b("No way to upload. Consider using the full version of Analytics");
                }
                if (z10) {
                    C0313w c0313wU1 = U0();
                    c0313wU1.W0();
                    SharedPreferences.Editor editorEdit = c0313wU1.f1().edit();
                    editorEdit.putBoolean("use_service", z11);
                    editorEdit.apply();
                }
            }
            this.f9244w = Boolean.valueOf(z11);
        }
        return this.f9244w.booleanValue();
    }

    public final void n1() {
        W0();
        zzfw zzfwVarI = i();
        ArrayList arrayList = this.f9247z;
        zzfwVarI.f9052F.a(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                i().f9056x.a(e10, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f9241A.a();
    }

    public final void o1() {
        W0();
        C0252b c0252b = this.f9246y;
        ((DefaultClock) c0252b.f2272c).getClass();
        c0252b.f2271b = SystemClock.elapsedRealtime();
        this.f9245x.b(((Long) zzbf.f8947K.a(null)).longValue());
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public final zzo p1(boolean z6) {
        String str;
        long j;
        int i10;
        int i11;
        long j10;
        boolean z10;
        String str2;
        String str3;
        String str4;
        int i12;
        int i13;
        long j11;
        int extensionVersion;
        long j12;
        String str5;
        long jAbs;
        Pair pair;
        zzfq zzfqVarO = ((zzhj) this.f577s).o();
        if (z6) {
            zzfw zzfwVarI = i();
            if (zzfwVarI.U0().f3150x == null) {
                str5 = null;
            } else {
                zzgl zzglVar = zzfwVarI.U0().f3150x;
                C0313w c0313w = zzglVar.f9075e;
                c0313w.W0();
                c0313w.W0();
                long j13 = zzglVar.f9075e.f1().getLong(zzglVar.a, 0L);
                if (j13 == 0) {
                    zzglVar.a();
                    jAbs = 0;
                } else {
                    ((zzhj) c0313w.f577s).f9120F.getClass();
                    jAbs = Math.abs(j13 - System.currentTimeMillis());
                }
                long j14 = zzglVar.f9074d;
                if (jAbs < j14) {
                    pair = null;
                } else if (jAbs > (j14 << 1)) {
                    zzglVar.a();
                    pair = null;
                } else {
                    String string = c0313w.f1().getString(zzglVar.f9073c, null);
                    long j15 = c0313w.f1().getLong(zzglVar.f9072b, 0L);
                    zzglVar.a();
                    pair = (string == null || j15 <= 0) ? C0313w.f3129S : new Pair(string, Long.valueOf(j15));
                }
                if (pair == null || pair == C0313w.f3129S) {
                    str5 = null;
                } else {
                    str5 = String.valueOf(pair.second) + ":" + ((String) pair.first);
                }
            }
            str = str5;
        } else {
            str = null;
        }
        zzfqVarO.W0();
        String strD1 = zzfqVarO.d1();
        String strE1 = zzfqVarO.e1();
        zzfqVarO.a1();
        String str6 = zzfqVarO.f9039v;
        zzfqVarO.a1();
        long j16 = zzfqVarO.f9040w;
        zzfqVarO.a1();
        Preconditions.i(zzfqVarO.f9041x);
        String str7 = zzfqVarO.f9041x;
        zzfqVarO.a1();
        zzfqVarO.W0();
        long j17 = zzfqVarO.f9042y;
        zzhj zzhjVar = (zzhj) zzfqVarO.f577s;
        if (j17 == 0) {
            zznp zznpVar = zzhjVar.f9118D;
            zzhj.e(zznpVar);
            Context context = zzhjVar.f9140s;
            j = 0;
            String packageName = context.getPackageName();
            zznpVar.W0();
            Preconditions.e(packageName);
            PackageManager packageManager = context.getPackageManager();
            i10 = 0;
            MessageDigest messageDigestK2 = zznp.k2();
            long jE1 = -1;
            if (messageDigestK2 == null) {
                zznpVar.i().f9056x.b("Could not get MD5 instance");
                i11 = 1;
            } else {
                if (packageManager != null) {
                    try {
                        if (!zznpVar.T1(context, packageName)) {
                            i11 = 1;
                            try {
                                Signature[] signatureArr = Wrappers.a(context).b(64, ((zzhj) zznpVar.f577s).f9140s.getPackageName()).signatures;
                                if (signatureArr == null || signatureArr.length <= 0) {
                                    zznpVar.i().f9047A.b("Could not get signatures");
                                } else {
                                    jE1 = zznp.e1(messageDigestK2.digest(signatureArr[0].toByteArray()));
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e = e10;
                                zznpVar.i().f9056x.a(e, "Package name not found");
                                j12 = 0;
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e11) {
                        e = e11;
                        i11 = 1;
                    }
                }
                i11 = 1;
                j12 = 0;
                zzfqVarO.f9042y = j12;
            }
            j12 = jE1;
            zzfqVarO.f9042y = j12;
        } else {
            j = 0;
            i10 = 0;
            i11 = 1;
        }
        long j18 = zzfqVarO.f9042y;
        boolean zH = zzhjVar.h();
        Context context2 = zzhjVar.f9140s;
        boolean z11 = !zzfqVarO.U0().f3140K;
        zzfqVarO.W0();
        boolean zH2 = zzhjVar.h();
        zzag zzagVar = zzhjVar.f9146y;
        if (zH2) {
            zzps.f8861t.get();
            if (zzagVar.h1(null, zzbf.f8996m0)) {
                zzfqVarO.i().f9052F.b("Disabled IID for tests.");
            } else {
                try {
                    Class<?> clsLoadClass = context2.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    if (clsLoadClass != null) {
                        j10 = j18;
                        int i14 = i11;
                        try {
                            Class<?>[] clsArr = new Class[i14];
                            clsArr[i10] = Context.class;
                            Method declaredMethod = clsLoadClass.getDeclaredMethod("getInstance", clsArr);
                            Object[] objArr = new Object[i14];
                            objArr[i10] = context2;
                            Object objInvoke = declaredMethod.invoke(null, objArr);
                            if (objInvoke == null) {
                                z10 = zH;
                            } else {
                                z10 = zH;
                                int i15 = i10;
                                try {
                                    str2 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[i15]).invoke(objInvoke, new Object[i15]);
                                } catch (Exception unused) {
                                    zzfqVarO.i().f9049C.b("Failed to retrieve Firebase Instance Id");
                                    str2 = null;
                                }
                                str3 = str2;
                            }
                        } catch (Exception unused2) {
                            z10 = zH;
                            zzfqVarO.i().f9048B.b("Failed to obtain Firebase Analytics instance");
                        }
                    }
                } catch (ClassNotFoundException unused3) {
                }
                str2 = null;
                str3 = str2;
            }
            z10 = zH;
            j10 = j18;
            str2 = null;
            str3 = str2;
        } else {
            z10 = zH;
            j10 = j18;
            str3 = null;
        }
        C0313w c0313w2 = zzhjVar.f9147z;
        zzhj.e(c0313w2);
        long jA = c0313w2.f3151y.a();
        long jMin = zzhjVar.f9139Z;
        if (jA != j) {
            jMin = Math.min(jMin, jA);
        }
        zzfqVarO.a1();
        int i16 = zzfqVarO.f9032C;
        Boolean boolF1 = zzagVar.f1("google_analytics_adid_collection_enabled");
        boolean z12 = boolF1 == null || boolF1.booleanValue();
        C0313w c0313wU0 = zzfqVarO.U0();
        c0313wU0.W0();
        String str8 = str3;
        boolean z13 = c0313wU0.f1().getBoolean("deferred_analytics_collection", false);
        zzfqVarO.a1();
        String str9 = zzfqVarO.f9034E;
        Boolean boolF2 = zzagVar.f1("google_analytics_default_allow_ad_personalization_signals");
        Boolean boolValueOf = boolF2 == null ? null : Boolean.valueOf(!boolF2.booleanValue());
        List list = zzfqVarO.f9030A;
        String strO = zzfqVarO.U0().h1().o();
        if (zzfqVarO.f9031B == null) {
            zzfqVarO.f9031B = zzfqVarO.V0().j2();
        }
        String str10 = zzfqVarO.f9031B;
        com.google.android.gms.internal.measurement.zznk.a();
        if (!zzagVar.h1(null, zzbf.U0) || zzfqVarO.U0().h1().i(zzin.zza.ANALYTICS_STORAGE)) {
            zzfqVarO.W0();
            if (zzfqVarO.f9036G != j) {
                zzhjVar.f9120F.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis() - zzfqVarO.f9036G;
                if (zzfqVarO.f9035F != null && jCurrentTimeMillis > 86400000 && zzfqVarO.f9037H == null) {
                    zzfqVarO.f1();
                }
            }
            if (zzfqVarO.f9035F == null) {
                zzfqVarO.f1();
            }
            str4 = zzfqVarO.f9035F;
        } else {
            str4 = null;
        }
        Boolean boolF3 = zzagVar.f1("google_analytics_sgtm_upload_enabled");
        boolean zBooleanValue = boolF3 == null ? false : boolF3.booleanValue();
        zznp zznpVarV0 = zzfqVarO.V0();
        String strD2 = zzfqVarO.d1();
        zzhj zzhjVar2 = (zzhj) zznpVarV0.f577s;
        boolean z14 = zBooleanValue;
        if (zzhjVar2.f9140s.getPackageManager() == null) {
            j11 = j;
        } else {
            try {
                PackageManagerWrapper packageManagerWrapperA = Wrappers.a(zzhjVar2.f9140s);
                i12 = 0;
                try {
                    ApplicationInfo applicationInfoA = packageManagerWrapperA.a(0, strD2);
                    i13 = applicationInfoA != null ? applicationInfoA.targetSdkVersion : i12;
                } catch (PackageManager.NameNotFoundException unused4) {
                    zznpVarV0.i().f9050D.a(strD2, "PackageManager failed to find running app: app_id");
                }
            } catch (PackageManager.NameNotFoundException unused5) {
                i12 = 0;
            }
            j11 = i13;
        }
        zzin zzinVarH1 = zzfqVarO.U0().h1();
        C0313w c0313wU1 = zzfqVarO.U0();
        c0313wU1.W0();
        String str11 = zzav.b(c0313wU1.f1().getString("dma_consent_settings", null)).f8905b;
        zzpg.a();
        zzfj zzfjVar = zzbf.f8928A0;
        if (zzagVar.h1(null, zzfjVar)) {
            zzfqVarO.V0();
            extensionVersion = (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) ? 0 : SdkExtensions.getExtensionVersion(1000000);
        } else {
            extensionVersion = 0;
        }
        zzpg.a();
        long jD2 = zzagVar.h1(null, zzfjVar) ? zzfqVarO.V0().d2() : j;
        String str12 = zzagVar.f8895u;
        zzne.a();
        return new zzo(strD1, strE1, str6, j16, str7, 97001L, j10, str, z10, z11, str8, jMin, i16, z12, z13, str9, boolValueOf, zzfqVarO.f9043z, list, strO, str10, str4, z14, j11, zzinVarH1.f9165b, str11, extensionVersion, jD2, str12, zzagVar.h1(null, zzbf.f8959Q0) ? String.valueOf(zzin.a(zzagVar.d1("google_analytics_default_allow_ad_personalization_signals", true))) : "");
    }
}
