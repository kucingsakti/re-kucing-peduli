package p127n1;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k1.b;
import o1.i;
import p050f1.q;
import p061g1.c;
import p061g1.o;
import p147p1.l;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b, c {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f13300B = q.c("SystemFgDispatcher");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public SystemForegroundService f13301A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f13302s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Y1.c f13303t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f13304u = new Object();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f13305v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final LinkedHashMap f13306w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final HashMap f13307x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final HashSet f13308y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Y1.c f13309z;

    public a(Context context) {
        o oVarB = o.b(context);
        this.f13302s = oVarB;
        this.f13303t = oVarB.f11500d;
        this.f13305v = null;
        this.f13306w = new LinkedHashMap();
        this.f13308y = new HashSet();
        this.f13307x = new HashMap();
        this.f13309z = new Y1.c(oVarB.j, this);
        oVarB.f11502f.a(this);
    }

    public static Intent a(Context context, i iVar, p050f1.i iVar2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", iVar2.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar2.f11413b);
        intent.putExtra("KEY_NOTIFICATION", iVar2.f11414c);
        intent.putExtra("KEY_WORKSPEC_ID", iVar.a);
        intent.putExtra("KEY_GENERATION", iVar.f13636b);
        return intent;
    }

    public static Intent b(Context context, i iVar, p050f1.i iVar2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", iVar.a);
        intent.putExtra("KEY_GENERATION", iVar.f13636b);
        intent.putExtra("KEY_NOTIFICATION_ID", iVar2.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", iVar2.f11413b);
        intent.putExtra("KEY_NOTIFICATION", iVar2.f11414c);
        return intent;
    }

    @Override // k1.b
    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o1.o oVar = (o1.o) it.next();
            String str = oVar.a;
            q.a().getClass();
            i iVarG = C3.a.g(oVar);
            o oVar2 = this.f13302s;
            oVar2.f11500d.t(new l(oVar2, new p061g1.i(iVarG), true));
        }
    }

    public final void e(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        i iVar = new i(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        q.a().getClass();
        if (notification == null || this.f13301A == null) {
            return;
        }
        p050f1.i iVar2 = new p050f1.i(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.f13306w;
        linkedHashMap.put(iVar, iVar2);
        if (this.f13305v == null) {
            this.f13305v = iVar;
            SystemForegroundService systemForegroundService = this.f13301A;
            systemForegroundService.f7231t.post(new b(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = this.f13301A;
        systemForegroundService2.f7231t.post(new X2.a(systemForegroundService2, intExtra, notification, 4));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i10 |= ((p050f1.i) ((Map.Entry) it.next()).getValue()).f11413b;
        }
        p050f1.i iVar3 = (p050f1.i) linkedHashMap.get(this.f13305v);
        if (iVar3 != null) {
            SystemForegroundService systemForegroundService3 = this.f13301A;
            systemForegroundService3.f7231t.post(new b(systemForegroundService3, iVar3.a, iVar3.f11414c, i10));
        }
    }

    @Override // p061g1.c
    public final void f(i iVar, boolean z6) {
        Map.Entry entry;
        synchronized (this.f13304u) {
            try {
                o1.o oVar = (o1.o) this.f13307x.remove(iVar);
                if (oVar != null ? this.f13308y.remove(oVar) : false) {
                    this.f13309z.K(this.f13308y);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        p050f1.i iVar2 = (p050f1.i) this.f13306w.remove(iVar);
        if (iVar.equals(this.f13305v) && this.f13306w.size() > 0) {
            Iterator it = this.f13306w.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f13305v = (i) entry.getKey();
            if (this.f13301A != null) {
                p050f1.i iVar3 = (p050f1.i) entry.getValue();
                SystemForegroundService systemForegroundService = this.f13301A;
                systemForegroundService.f7231t.post(new b(systemForegroundService, iVar3.a, iVar3.f11414c, iVar3.f11413b));
                SystemForegroundService systemForegroundService2 = this.f13301A;
                systemForegroundService2.f7231t.post(new R.a(iVar3.a, 5, systemForegroundService2));
            }
        }
        SystemForegroundService systemForegroundService3 = this.f13301A;
        if (iVar2 == null || systemForegroundService3 == null) {
            return;
        }
        q qVarA = q.a();
        iVar.toString();
        qVarA.getClass();
        systemForegroundService3.f7231t.post(new R.a(iVar2.a, 5, systemForegroundService3));
    }

    public final void g() {
        this.f13301A = null;
        synchronized (this.f13304u) {
            this.f13309z.L();
        }
        this.f13302s.f11502f.g(this);
    }

    @Override // k1.b
    public final void d(List list) {
    }
}
