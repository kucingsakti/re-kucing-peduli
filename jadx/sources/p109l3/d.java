package p109l3;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p031d.b;

/* JADX INFO: loaded from: classes.dex */
public final class d implements OnBackAnimationCallback {
    public final /* synthetic */ b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f12919b;

    public d(e eVar, b bVar) {
        this.f12919b = eVar;
        this.a = bVar;
    }

    public final void onBackCancelled() {
        if (this.f12919b.a != null) {
            this.a.d();
        }
    }

    public final void onBackInvoked() {
        this.a.b();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f12919b.a != null) {
            this.a.a(new b(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f12919b.a != null) {
            this.a.c(new b(backEvent));
        }
    }
}
