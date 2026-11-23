package V3;

import L8.InterfaceC0276j;
import N4.e;
import P2.g;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import p.b1;
import p067g9.f;
import p067g9.h;
import p210v8.i;
import p220w9.q;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f5174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f5175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f5176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f5177g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f5178h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f5179i;

    public b(Y1.c cVar, p122m7.a aVar, Handler handler) {
        i.g(handler, "uiHandler");
        this.f5178h = cVar;
        this.f5179i = handler;
        this.a = new Object();
        this.f5172b = new LinkedHashMap();
        this.f5173c = new LinkedHashMap();
        this.f5174d = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("FetchNotificationsIO");
        handlerThread.start();
        this.f5175e = new Handler(handlerThread.getLooper());
        this.f5176f = new LinkedHashMap();
        this.f5177g = new J4.c(this, 1);
    }

    public void a(int i10, J4.c cVar) {
        synchronized (this.a) {
            Set linkedHashSet = (Set) ((LinkedHashMap) this.f5172b).get(Integer.valueOf(i10));
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
            }
            linkedHashSet.add(new WeakReference(cVar));
            ((LinkedHashMap) this.f5172b).put(Integer.valueOf(i10), linkedHashSet);
        }
    }

    public void b(e eVar) {
        synchronized (this.a) {
            ((Handler) this.f5175e).post(new g(this, 18, eVar));
        }
    }

    public b c(InterfaceC0276j interfaceC0276j, List list, f fVar, p067g9.g gVar, h hVar, p067g9.a aVar) {
        i.f(list, "typeParameterProtos");
        i.f(fVar, "nameResolver");
        i.f(hVar, "versionRequirementTable");
        i.f(aVar, "metadataVersion");
        int i10 = aVar.f11543b;
        if ((i10 != 1 || aVar.f11544c < 4) && i10 <= 1) {
            hVar = (h) this.f5175e;
        }
        return new b((I4.c) this.a, fVar, interfaceC0276j, gVar, hVar, aVar, (p029c9.f) this.f5177g, (b1) this.f5178h, list);
    }

    public void e() {
        synchronized (this.a) {
            ((LinkedHashMap) this.f5172b).clear();
            ((LinkedHashMap) this.f5173c).clear();
            ((ArrayList) this.f5174d).clear();
            ((LinkedHashMap) this.f5176f).clear();
        }
    }

    public a f(int i10) {
        try {
            if (p239z.e.b(2, i10)) {
                return null;
            }
            JSONObject jSONObjectD = ((V.h) this.f5175e).d();
            if (jSONObjectD == null) {
                Log.isLoggable("FirebaseCrashlytics", 3);
                return null;
            }
            P0.d dVar = (P0.d) this.f5173c;
            dVar.getClass();
            a aVarF = (jSONObjectD.getInt("settings_version") != 3 ? new p053f4.e(12) : new p170r3.e(12)).f((za.c) dVar.f3811t, jSONObjectD);
            jSONObjectD.toString();
            Log.isLoggable("FirebaseCrashlytics", 3);
            ((za.c) this.f5174d).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (!p239z.e.b(3, i10) && aVarF.f5168c < jCurrentTimeMillis) {
                Log.isLoggable("FirebaseCrashlytics", 2);
                return null;
            }
            try {
                Log.isLoggable("FirebaseCrashlytics", 2);
                return aVarF;
            } catch (Exception unused) {
                return aVarF;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public a g() {
        return (a) ((AtomicReference) this.f5178h).get();
    }

    public void h(int i10, J4.c cVar) {
        i.g(cVar, "fetchListener");
        synchronized (this.a) {
            try {
                Set set = (Set) ((LinkedHashMap) this.f5172b).get(Integer.valueOf(i10));
                Iterator it = set != null ? set.iterator() : null;
                if (it != null) {
                    while (it.hasNext()) {
                        if (i.a((J4.c) ((WeakReference) it.next()).get(), cVar)) {
                            it.remove();
                            break;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(e eVar) {
        synchronized (this.a) {
            ((ArrayList) this.f5174d).remove(eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0071  */
    public b(I4.c cVar, f fVar, InterfaceC0276j interfaceC0276j, p067g9.g gVar, h hVar, p067g9.a aVar, p029c9.f fVar2, b1 b1Var, List list) {
        String str;
        i.f(cVar, "components");
        i.f(fVar, "nameResolver");
        i.f(interfaceC0276j, "containingDeclaration");
        i.f(hVar, "versionRequirementTable");
        i.f(aVar, "metadataVersion");
        i.f(list, "typeParameters");
        this.a = cVar;
        this.f5172b = fVar;
        this.f5173c = interfaceC0276j;
        this.f5174d = gVar;
        this.f5175e = hVar;
        this.f5176f = aVar;
        this.f5177g = fVar2;
        String str2 = "Deserializer for \"" + interfaceC0276j.getName() + '\"';
        if (fVar2 != null) {
            str = "Class '" + fVar2.a().b().b() + '\'';
            str = str == null ? "[container not found]" : str;
        }
        this.f5178h = new b1(this, b1Var, list, str2, str);
        this.f5179i = new q(this);
    }
}
