package p031d;

import android.window.BackEvent;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final float a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10433c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10434d;

    public b(BackEvent backEvent) {
        i.f(backEvent, "backEvent");
        a aVar = a.a;
        float fD = aVar.d(backEvent);
        float fE = aVar.e(backEvent);
        float fB = aVar.b(backEvent);
        int iC = aVar.c(backEvent);
        this.a = fD;
        this.f10432b = fE;
        this.f10433c = fB;
        this.f10434d = iC;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.a + ", touchY=" + this.f10432b + ", progress=" + this.f10433c + ", swipeEdge=" + this.f10434d + '}';
    }
}
