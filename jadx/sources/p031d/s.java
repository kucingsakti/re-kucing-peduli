package p031d;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p200u8.a;
import p200u8.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class s implements OnBackAnimationCallback {
    public final /* synthetic */ b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f10481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f10482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f10483d;

    public s(b bVar, b bVar2, a aVar, a aVar2) {
        this.a = bVar;
        this.f10481b = bVar2;
        this.f10482c = aVar;
        this.f10483d = aVar2;
    }

    public final void onBackCancelled() {
        this.f10483d.invoke();
    }

    public final void onBackInvoked() {
        this.f10482c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        i.f(backEvent, "backEvent");
        this.f10481b.invoke(new b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        i.f(backEvent, "backEvent");
        this.a.invoke(new b(backEvent));
    }
}
