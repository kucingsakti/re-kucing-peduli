package X2;

import android.app.Notification;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import androidx.work.impl.foreground.SystemForegroundService;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5382s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f5383t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f5384u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f5385v;

    public /* synthetic */ a(Object obj, int i10, Object obj2, int i11) {
        this.f5382s = i11;
        this.f5385v = obj;
        this.f5383t = i10;
        this.f5384u = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5382s) {
            case 0:
                ((BottomSheetBehavior) this.f5385v).L((View) this.f5384u, this.f5383t, false);
                break;
            case 1:
                Serializable serializable = (Serializable) ((P0.d) this.f5384u).f3811t;
                p031d.g gVar = (p031d.g) this.f5385v;
                String str = (String) gVar.a.get(Integer.valueOf(this.f5383t));
                if (str != null) {
                    p049f.e eVar = (p049f.e) gVar.f10441e.get(str);
                    if (eVar == null) {
                        gVar.f10443g.remove(str);
                        gVar.f10442f.put(str, serializable);
                    } else {
                        p049f.a aVar = eVar.a;
                        if (gVar.f10440d.remove(str)) {
                            aVar.a(serializable);
                        }
                    }
                    break;
                }
                break;
            case 2:
                ((p031d.g) this.f5385v).a(this.f5383t, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f5384u));
                break;
            case 3:
                Intent intent = (Intent) this.f5385v;
                ((p080i1.i) this.f5384u).a(this.f5383t, intent);
                break;
            case 4:
                ((SystemForegroundService) this.f5385v).f7234w.notify(this.f5383t, (Notification) this.f5384u);
                break;
            default:
                ((TextView) this.f5384u).setTypeface((Typeface) this.f5385v, this.f5383t);
                break;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, int i10, int i11) {
        this.f5382s = i11;
        this.f5384u = obj;
        this.f5385v = obj2;
        this.f5383t = i10;
    }

    public a(BottomSheetBehavior bottomSheetBehavior, View view, int i10) {
        this.f5382s = 0;
        this.f5385v = bottomSheetBehavior;
        this.f5384u = view;
        this.f5383t = i10;
    }
}
