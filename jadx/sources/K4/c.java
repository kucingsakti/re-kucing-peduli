package K4;

import A1.C0099h;
import A9.A;
import A9.C0131d;
import B4.C0159g;
import android.app.Activity;
import android.app.Dialog;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes.dex */
public final class c extends CountDownTimer {
    public final /* synthetic */ o1.m a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0159g f2583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Dialog f2584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0099h f2585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Activity f2586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o1.m mVar, C0159g c0159g, Dialog dialog, C0099h c0099h, Activity activity) {
        super(6000L, 1000L);
        this.a = mVar;
        this.f2583b = c0159g;
        this.f2584c = dialog;
        this.f2585d = c0099h;
        this.f2586e = activity;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        o1.m mVar = this.a;
        ((MaterialTextView) mVar.f13643u).setVisibility(8);
        ((LinearLayout) mVar.f13644v).setVisibility(0);
        Button button = (Button) mVar.f13641s;
        C0159g c0159g = this.f2583b;
        Dialog dialog = this.f2584c;
        D3.b.e(button, new A(c0159g, 17, dialog));
        D3.b.e((Button) mVar.f13642t, new C0131d(this.f2585d, c0159g, dialog, this.f2586e, 1));
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        ((MaterialTextView) this.a.f13643u).setText("Tunggu dalam " + (j / ((long) 1000)));
    }
}
