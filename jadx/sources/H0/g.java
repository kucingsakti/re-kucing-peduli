package H0;

import I.AbstractC0244h;
import Q.l;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p078i.AbstractC0657n;
import p078i.AbstractC0658o;
import p078i.AbstractC0660q;
import p078i.D;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1842s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f1843t;

    public /* synthetic */ g(Context context, int i10) {
        this.f1842s = i10;
        this.f1843t = context;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    @Override // java.lang.Runnable
    public final void run() {
        Q.h hVar;
        Object systemService;
        Context context;
        switch (this.f1842s) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new g(this.f1843t, 1));
                break;
            case 1:
                e.t(this.f1843t, new G0.b(0), e.a, false);
                break;
            default:
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 33) {
                    Context context2 = this.f1843t;
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i10 >= 33) {
                            p212w.f fVar = AbstractC0660q.f12113y;
                            fVar.getClass();
                            p212w.a aVar = new p212w.a(fVar);
                            while (true) {
                                if (aVar.hasNext()) {
                                    AbstractC0660q abstractC0660q = (AbstractC0660q) ((WeakReference) aVar.next()).get();
                                    if (abstractC0660q != null && (context = ((D) abstractC0660q).f11922C) != null) {
                                        systemService = context.getSystemService("locale");
                                    }
                                } else {
                                    systemService = null;
                                }
                            }
                            if (systemService != null) {
                                hVar = new Q.h(new l(AbstractC0658o.a(systemService)));
                            } else {
                                hVar = Q.h.f3933b;
                            }
                        } else {
                            hVar = AbstractC0660q.f12109u;
                            if (hVar == null) {
                                hVar = Q.h.f3933b;
                            }
                        }
                        if (hVar.a.isEmpty()) {
                            String strE = AbstractC0244h.e(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                AbstractC0658o.b(systemService2, AbstractC0657n.a(strE));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AbstractC0660q.f12112x = true;
                break;
        }
    }
}
