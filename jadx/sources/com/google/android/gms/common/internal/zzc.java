package com.google.android.gms.common.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzc {
    public Boolean a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseGmsClient f8170c;

    public zzc(BaseGmsClient baseGmsClient) {
        Boolean bool = Boolean.TRUE;
        this.f8170c = baseGmsClient;
        this.a = bool;
        this.f8169b = false;
    }

    public abstract void a();

    public final void b() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void c() {
        b();
        synchronized (this.f8170c.f8054I) {
            this.f8170c.f8054I.remove(this);
        }
    }
}
