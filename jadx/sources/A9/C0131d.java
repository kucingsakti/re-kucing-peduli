package A9;

import A1.C0099h;
import B4.C0159g;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: renamed from: A9.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0131d extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f362s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f363t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f364u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f366w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0131d(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        super(0);
        this.f362s = i10;
        this.f363t = obj;
        this.f364u = obj2;
        this.f365v = obj3;
        this.f366w = obj4;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f362s) {
            case 0:
                return Boolean.valueOf(C0133f.m((N) this.f363t, ((B9.b) this.f364u).O((D9.d) this.f365v), (D9.d) this.f366w));
            default:
                ((Activity) this.f366w).startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse((String) ((C0099h) this.f363t).f105v)));
                ((C0159g) this.f364u).f683l.I();
                ((Dialog) this.f365v).dismiss();
                return p076h8.m.a;
        }
    }
}
