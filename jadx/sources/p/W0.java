package p;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p136o.C0683a;

/* JADX INFO: loaded from: classes.dex */
public final class W0 implements View.OnClickListener {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0683a f13999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ X0 f14000t;

    public W0(X0 x8) {
        this.f14000t = x8;
        Context context = x8.a.getContext();
        CharSequence charSequence = x8.f14014h;
        C0683a c0683a = new C0683a();
        c0683a.f13445w = 4096;
        c0683a.f13447y = 4096;
        c0683a.f13436D = null;
        c0683a.f13437E = null;
        c0683a.f13438F = false;
        c0683a.f13439G = false;
        c0683a.f13440H = 16;
        c0683a.f13433A = context;
        c0683a.f13441s = charSequence;
        this.f13999s = c0683a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        X0 x8 = this.f14000t;
        Window.Callback callback = x8.f14016k;
        if (callback == null || !x8.f14017l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f13999s);
    }
}
