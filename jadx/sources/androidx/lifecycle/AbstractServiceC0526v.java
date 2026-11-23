package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractServiceC0526v extends Service implements InterfaceC0523s {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Y1.c f6770s = new Y1.c(this);

    @Override // androidx.lifecycle.InterfaceC0523s
    public final C0525u g() {
        return (C0525u) this.f6770s.f5670t;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        p210v8.i.f(intent, "intent");
        this.f6770s.G(EnumC0518m.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f6770s.G(EnumC0518m.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        EnumC0518m enumC0518m = EnumC0518m.ON_STOP;
        Y1.c cVar = this.f6770s;
        cVar.G(enumC0518m);
        cVar.G(EnumC0518m.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i10) {
        this.f6770s.G(EnumC0518m.ON_START);
        super.onStart(intent, i10);
    }
}
