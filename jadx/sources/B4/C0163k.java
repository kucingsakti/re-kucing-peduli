package B4;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzo;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: B4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0163k implements Handler.Callback {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f693t;

    public /* synthetic */ C0163k(Object obj, int i10) {
        this.f692s = i10;
        this.f693t = obj;
    }

    private final boolean a(Message message) {
        if (message.what != 0) {
            return false;
        }
        o1.h hVar = (o1.h) this.f693t;
        p190t3.h hVar2 = (p190t3.h) message.obj;
        synchronized (hVar.f13632s) {
            if (((p190t3.h) hVar.f13634u) == hVar2 || ((p190t3.h) hVar.f13635v) == hVar2) {
                hVar.c(hVar2, 2);
            }
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f692s) {
            case 0:
                C0164l c0164l = (C0164l) this.f693t;
                if (c0164l.a.get() == null) {
                    return true;
                }
                C0159g c0159g = (C0159g) c0164l.a.get();
                com.google.android.gms.internal.measurement.S s9 = c0159g.j;
                if (s9 == null) {
                    WebView webView = c0159g.f674b.f627f;
                    com.google.android.gms.internal.measurement.S s10 = new com.google.android.gms.internal.measurement.S(2, false);
                    s10.f8359t = webView;
                    s10.f8360u = new Handler(Looper.getMainLooper());
                    c0159g.j = s10;
                    s9 = s10;
                }
                Object obj = message.obj;
                String str = obj instanceof String ? (String) obj : null;
                StringBuilder sb = new StringBuilder("javascript:uploadFileResult(");
                StringBuilder sb2 = new StringBuilder();
                String str2 = new String[]{str}[0];
                if (TextUtils.isEmpty(str2)) {
                    sb2.append("\"");
                    sb2.append(str2);
                    sb2.append("\"");
                } else {
                    try {
                        if (str2.startsWith("[")) {
                            new JSONArray(str2);
                        } else {
                            new JSONObject(str2);
                        }
                        sb2.append(str2);
                    } catch (JSONException unused) {
                        sb2.append("\"");
                        sb2.append(str2);
                        sb2.append("\"");
                    }
                }
                sb.append(sb2.toString());
                sb.append(")");
                s9.l(sb.toString());
                return true;
            case 1:
                int i10 = message.what;
                L1.g gVar = (L1.g) this.f693t;
                if (i10 == 1) {
                    gVar.b((L1.e) message.obj);
                    return true;
                }
                if (i10 == 2) {
                    gVar.f2760d.l((L1.e) message.obj);
                }
                return false;
            case 2:
                return a(message);
            default:
                int i11 = message.what;
                if (i11 != 0) {
                    if (i11 != 1) {
                        return false;
                    }
                    synchronized (((p233y2.d) this.f693t).f16034d) {
                        try {
                            zzo zzoVar = (zzo) message.obj;
                            p233y2.c cVar = (p233y2.c) ((p233y2.d) this.f693t).f16034d.get(zzoVar);
                            if (cVar != null && cVar.f16028t == 3) {
                                String.valueOf(zzoVar);
                                new Exception();
                                ComponentName componentName = cVar.f16032x;
                                if (componentName == null) {
                                    zzoVar.getClass();
                                    componentName = null;
                                }
                                if (componentName == null) {
                                    String str3 = zzoVar.f8183b;
                                    Preconditions.i(str3);
                                    componentName = new ComponentName(str3, "unknown");
                                }
                                cVar.onServiceDisconnected(componentName);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                } else {
                    synchronized (((p233y2.d) this.f693t).f16034d) {
                        try {
                            zzo zzoVar2 = (zzo) message.obj;
                            p233y2.c cVar2 = (p233y2.c) ((p233y2.d) this.f693t).f16034d.get(zzoVar2);
                            if (cVar2 != null && cVar2.f16027s.isEmpty()) {
                                if (cVar2.f16029u) {
                                    cVar2.f16033y.f16036f.removeMessages(1, cVar2.f16031w);
                                    p233y2.d dVar = cVar2.f16033y;
                                    dVar.f16037g.c(dVar.f16035e, cVar2);
                                    cVar2.f16029u = false;
                                    cVar2.f16028t = 2;
                                }
                                ((p233y2.d) this.f693t).f16034d.remove(zzoVar2);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return true;
        }
    }
}
