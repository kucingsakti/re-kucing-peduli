package p122m7;

import C3.a;
import C3.b;
import J4.c;
import android.app.NotificationManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.fragment.app.e;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import org.chromium.net.UrlRequest;
import p.C0722p0;
import p086i8.l;
import p086i8.s;
import p156q0.DialogInterfaceOnCancelListenerC0756o;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f13144t;

    public /* synthetic */ d(Object obj, int i10) {
        this.f13143s = i10;
        this.f13144t = obj;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:108:0x020a  */
    /* JADX WARN: Code duplicated, block: B:109:0x020c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ed  */
    /* JADX WARN: Type inference failed for: r0v43, types: [u8.a, v8.k] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z6;
        List listG;
        boolean z10;
        Object systemService;
        switch (this.f13143s) {
            case 0:
                if (e.a((e) this.f13144t)) {
                    if (((e) this.f13144t).f13145A.b() && e.a((e) this.f13144t)) {
                        e eVar = (e) this.f13144t;
                        synchronized (eVar.f13150s) {
                            z6 = true;
                            try {
                                a aVar = eVar.f13157z;
                                AbstractC0487g.v(1, "prioritySort");
                                listG = aVar.a.g();
                            } catch (Exception unused) {
                                eVar.f13147C.getClass();
                                listG = s.f12328s;
                            }
                            break;
                        }
                        boolean z11 = listG.isEmpty() || !a.j(((e) this.f13144t).f13146B.f13825g);
                        if (z11) {
                            z6 = z11;
                        } else {
                            int iB = l.B(listG);
                            if (iB >= 0) {
                                boolean z12 = true;
                                int i10 = 0;
                                while (((e) this.f13144t).f13145A.b() && e.a((e) this.f13144t)) {
                                    Download download = (Download) listG.get(i10);
                                    DownloadInfo downloadInfo = (DownloadInfo) download;
                                    boolean zI = b.I(downloadInfo.f10362u);
                                    if ((zI || a.j(((e) this.f13144t).f13146B.f13825g)) && e.a((e) this.f13144t)) {
                                        ((e) this.f13144t).getClass();
                                        int i11 = downloadInfo.f10349D;
                                        if (i11 == 1) {
                                            i11 = 2;
                                        }
                                        p143o7.a aVar2 = ((e) this.f13144t).f13146B;
                                        AbstractC0487g.v(i11, "networkType");
                                        Context context = aVar2.f13825g;
                                        if (i11 == 3) {
                                            i.g(context, "$this$isOnWiFi");
                                            Object systemService2 = context.getSystemService("connectivity");
                                            if (systemService2 == null) {
                                                throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
                                            }
                                            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService2).getActiveNetworkInfo();
                                            if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) {
                                                z10 = true;
                                            } else if (i11 == 4) {
                                                i.g(context, "$this$isOnMeteredConnection");
                                                systemService = context.getSystemService("connectivity");
                                                if (systemService != null) {
                                                    throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
                                                }
                                                if (!((ConnectivityManager) systemService).isActiveNetworkMetered()) {
                                                    z10 = true;
                                                } else if (i11 == 2 || !a.j(context)) {
                                                    z10 = false;
                                                } else {
                                                    z10 = true;
                                                }
                                            } else {
                                                if (i11 == 2) {
                                                }
                                                z10 = false;
                                            }
                                        } else if (i11 == 4) {
                                            i.g(context, "$this$isOnMeteredConnection");
                                            systemService = context.getSystemService("connectivity");
                                            if (systemService != null) {
                                                throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
                                            }
                                            if (!((ConnectivityManager) systemService).isActiveNetworkMetered()) {
                                                z10 = true;
                                            } else {
                                                if (i11 == 2) {
                                                }
                                                z10 = false;
                                            }
                                        } else {
                                            if (i11 == 2) {
                                            }
                                            z10 = false;
                                        }
                                        if (!z10) {
                                            ((c) ((e) this.f13144t).f13148D.f5177g).k(download);
                                        }
                                        if (zI || z10) {
                                            if (!((e) this.f13144t).f13145A.i(downloadInfo.f10360s) && e.a((e) this.f13144t)) {
                                                ((e) this.f13144t).f13145A.n(download);
                                            }
                                            z12 = false;
                                        }
                                        if (i10 != iB) {
                                            i10++;
                                        }
                                    }
                                    z6 = z12;
                                }
                                z6 = z12;
                            }
                        }
                        if (z6) {
                            e eVar2 = (e) this.f13144t;
                            eVar2.f13152u = eVar2.f13152u == 500 ? 60000L : eVar2.f13152u * 2;
                            long minutes = TimeUnit.MILLISECONDS.toMinutes(eVar2.f13152u);
                            eVar2.f13147C.a("PriorityIterator backoffTime increased to " + minutes + " minute(s)");
                        }
                    }
                    if (e.a((e) this.f13144t)) {
                        ((e) this.f13144t).b();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C0722p0 c0722p0 = (C0722p0) this.f13144t;
                c0722p0.f14100D = null;
                c0722p0.drawableStateChanged();
                return;
            case 2:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f13144t;
                if (searchView$SearchAutoComplete.f6160x) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f6160x = false;
                    return;
                }
                return;
            case 3:
                ((Toolbar) this.f13144t).v();
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0756o dialogInterfaceOnCancelListenerC0756o = (DialogInterfaceOnCancelListenerC0756o) this.f13144t;
                dialogInterfaceOnCancelListenerC0756o.f14349w0.onDismiss(dialogInterfaceOnCancelListenerC0756o.f14341E0);
                return;
            case 5:
                androidx.fragment.app.b bVar = (androidx.fragment.app.b) this.f13144t;
                if (bVar.f0 != null) {
                    bVar.j().getClass();
                    return;
                }
                return;
            case 6:
                ((e) this.f13144t).z(true);
                return;
            case 7:
                i.b(((k) this.f13144t).invoke(), "invoke(...)");
                return;
            case 8:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f13144t).f9917u.f15590y;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 9:
                ((p229x7.e) this.f13144t).b(new p230x9.d(27));
                return;
            case 10:
                ((p229x7.i) this.f13144t).b(new za.c(27));
                return;
            case 11:
                ((p229x7.b) this.f13144t).b(null);
                return;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                zaaw zaawVar = (zaaw) this.f13144t;
                GoogleApiAvailabilityLight googleApiAvailabilityLight = zaawVar.f7939d;
                Context context2 = zaawVar.f7938c;
                googleApiAvailabilityLight.getClass();
                if (GooglePlayServicesUtilLight.a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException unused2) {
                    return;
                }
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                ((zabq) this.f13144t).e();
                return;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                ((zact) this.f13144t).f8013h.b(new ConnectionResult(4));
                return;
            case 15:
                ((B7.e) this.f13144t).c(new p053f4.e(29));
                return;
            case 16:
                ((B7.i) this.f13144t).c(new p170r3.e(29));
                return;
            default:
                ((B7.b) this.f13144t).c(null);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(p200u8.a aVar) {
        this.f13143s = 7;
        this.f13144t = (k) aVar;
    }
}
