package androidx.lifecycle;

import A1.RunnableC0094c;
import B4.RunnableC0160h;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import androidx.emoji2.text.EmojiCompatInitializer;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0511f implements InterfaceC0522q {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f6752s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f6753t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f6754u;

    public /* synthetic */ C0511f(Object obj, int i10, Object obj2) {
        this.f6752s = i10;
        this.f6753t = obj;
        this.f6754u = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0522q
    public final void onStateChanged(InterfaceC0523s interfaceC0523s, EnumC0518m enumC0518m) {
        Object obj = this.f6754u;
        Object obj2 = this.f6753t;
        switch (this.f6752s) {
            case 0:
                p106l0.h hVar = (p106l0.h) obj2;
                switch (AbstractC0510e.a[enumC0518m.ordinal()]) {
                    case 1:
                        hVar.getClass();
                        break;
                    case 2:
                        hVar.getClass();
                        break;
                    case 3:
                        EmojiCompatInitializer emojiCompatInitializer = hVar.f12860t;
                        (Build.VERSION.SDK_INT >= 28 ? p106l0.a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC0160h(3), 500L);
                        hVar.f12859s.f(hVar);
                        break;
                    case 4:
                        hVar.getClass();
                        break;
                    case 5:
                        hVar.getClass();
                        break;
                    case 6:
                        hVar.getClass();
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0522q interfaceC0522q = (InterfaceC0522q) obj;
                if (interfaceC0522q != null) {
                    interfaceC0522q.onStateChanged(interfaceC0523s, enumC0518m);
                    return;
                }
                return;
            case 1:
                if (enumC0518m == EnumC0518m.ON_START) {
                    ((C0525u) obj2).f(this);
                    ((N0.e) obj).g();
                    return;
                }
                return;
            case 2:
                HashMap map = ((C0507b) obj).a;
                r rVar = (r) obj2;
                C0507b.a((List) map.get(enumC0518m), interfaceC0523s, enumC0518m, rVar);
                C0507b.a((List) map.get(EnumC0518m.ON_ANY), interfaceC0523s, enumC0518m, rVar);
                return;
            case 3:
                p013b1.e eVar = (p013b1.e) obj;
                if (eVar.f7252e.P()) {
                    return;
                }
                interfaceC0523s.g().f(this);
                p013b1.f fVar = (p013b1.f) obj2;
                FrameLayout frameLayout = (FrameLayout) fVar.f7003s;
                WeakHashMap weakHashMap = U.U.a;
                if (frameLayout.isAttachedToWindow()) {
                    eVar.q(fVar);
                    return;
                }
                return;
            default:
                if (enumC0518m == EnumC0518m.ON_DESTROY) {
                    ((Handler) obj2).removeCallbacks((RunnableC0094c) obj);
                    interfaceC0523s.g().f(this);
                    return;
                }
                return;
        }
    }

    public C0511f(p106l0.h hVar, InterfaceC0522q interfaceC0522q) {
        this.f6752s = 0;
        p210v8.i.f(hVar, "defaultLifecycleObserver");
        this.f6753t = hVar;
        this.f6754u = interfaceC0522q;
    }

    public C0511f(r rVar) {
        this.f6752s = 2;
        this.f6753t = rVar;
        C0509d c0509d = C0509d.f6750c;
        Class<?> cls = rVar.getClass();
        C0507b c0507b = (C0507b) c0509d.a.get(cls);
        this.f6754u = c0507b == null ? c0509d.a(cls, null) : c0507b;
    }

    public C0511f(p013b1.e eVar, p013b1.f fVar) {
        this.f6752s = 3;
        this.f6754u = eVar;
        this.f6753t = fVar;
    }
}
