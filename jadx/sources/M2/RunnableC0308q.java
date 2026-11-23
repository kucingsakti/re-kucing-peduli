package M2;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.internal.zzag;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzgl;
import com.google.android.gms.measurement.internal.zzhj;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: renamed from: M2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0308q implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3061s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f3062t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final String f3063u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f3064v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f3065w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Object f3066x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f3067y;

    public RunnableC0308q(zzfw zzfwVar, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f3062t = i10;
        this.f3063u = str;
        this.f3064v = obj;
        this.f3065w = obj2;
        this.f3066x = obj3;
        this.f3067y = zzfwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3061s) {
            case 0:
                C0313w c0313w = ((zzhj) ((zzfw) this.f3067y).f577s).f9147z;
                zzhj.e(c0313w);
                if (!c0313w.f2917t) {
                    Log.println(6, ((zzfw) this.f3067y).k1(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                zzfw zzfwVar = (zzfw) this.f3067y;
                if (zzfwVar.f9053u == 0) {
                    zzag zzagVar = ((zzhj) zzfwVar.f577s).f9146y;
                    if (zzagVar.f8897w == null) {
                        synchronized (zzagVar) {
                            try {
                                if (zzagVar.f8897w == null) {
                                    ApplicationInfo applicationInfo = ((zzhj) zzagVar.f577s).f9140s.getApplicationInfo();
                                    String strA = ProcessUtils.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        zzagVar.f8897w = Boolean.valueOf(str != null && str.equals(strA));
                                    }
                                    if (zzagVar.f8897w == null) {
                                        zzagVar.f8897w = Boolean.TRUE;
                                        zzagVar.i().f9056x.b("My process not in the list of running processes");
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (zzagVar.f8897w.booleanValue()) {
                        ((zzfw) this.f3067y).f9053u = 'C';
                    } else {
                        ((zzfw) this.f3067y).f9053u = 'c';
                    }
                    break;
                }
                zzfw zzfwVar2 = (zzfw) this.f3067y;
                if (zzfwVar2.f9054v < 0) {
                    zzfwVar2.f9054v = 97001L;
                }
                char cCharAt = "01VDIWEA?".charAt(this.f3062t);
                zzfw zzfwVar3 = (zzfw) this.f3067y;
                char c10 = zzfwVar3.f9053u;
                long j = zzfwVar3.f9054v;
                String strC1 = zzfw.c1(true, this.f3063u, this.f3064v, this.f3065w, this.f3066x);
                StringBuilder sb = new StringBuilder("2");
                sb.append(cCharAt);
                sb.append(c10);
                sb.append(j);
                String strL = E0.a.l(sb, ":", strC1);
                if (strL.length() > 1024) {
                    strL = this.f3063u.substring(0, 1024);
                }
                zzgl zzglVar = c0313w.f3150x;
                if (zzglVar != null) {
                    C0313w c0313w2 = zzglVar.f9075e;
                    c0313w2.W0();
                    if (zzglVar.f9075e.f1().getLong(zzglVar.a, 0L) == 0) {
                        zzglVar.a();
                    }
                    if (strL == null) {
                        strL = "";
                    }
                    SharedPreferences sharedPreferencesF1 = c0313w2.f1();
                    String str2 = zzglVar.f9072b;
                    long j10 = sharedPreferencesF1.getLong(str2, 0L);
                    String str3 = zzglVar.f9073c;
                    if (j10 <= 0) {
                        SharedPreferences.Editor editorEdit = c0313w2.f1().edit();
                        editorEdit.putString(str3, strL);
                        editorEdit.putLong(str2, 1L);
                        editorEdit.apply();
                        return;
                    }
                    long j11 = j10 + 1;
                    boolean z6 = (c0313w2.V0().l2().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j11;
                    SharedPreferences.Editor editorEdit2 = c0313w2.f1().edit();
                    if (z6) {
                        editorEdit2.putString(str3, strL);
                    }
                    editorEdit2.putLong(str2, j11);
                    editorEdit2.apply();
                    return;
                }
                return;
            default:
                ((InterfaceC0310t) this.f3064v).m(this.f3063u, this.f3062t, (IOException) this.f3065w, (byte[]) this.f3066x, (Map) this.f3067y);
                return;
        }
    }

    public RunnableC0308q(String str, InterfaceC0310t interfaceC0310t, int i10, IOException iOException, byte[] bArr, Map map) {
        Preconditions.i(interfaceC0310t);
        this.f3064v = interfaceC0310t;
        this.f3062t = i10;
        this.f3065w = iOException;
        this.f3066x = bArr;
        this.f3063u = str;
        this.f3067y = map;
    }
}
