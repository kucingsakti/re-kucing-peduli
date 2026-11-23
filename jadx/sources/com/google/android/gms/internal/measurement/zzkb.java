package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public class zzkb {
    public volatile zzkt a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile zzia f8695b;

    public final int a() {
        if (this.f8695b != null) {
            return this.f8695b.n();
        }
        if (this.a != null) {
            return this.a.a();
        }
        return 0;
    }

    public final zzia b() {
        if (this.f8695b != null) {
            return this.f8695b;
        }
        synchronized (this) {
            try {
                if (this.f8695b != null) {
                    return this.f8695b;
                }
                if (this.a == null) {
                    this.f8695b = zzia.f8668t;
                } else {
                    this.f8695b = this.a.f();
                }
                return this.f8695b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzkt c(zzkt zzktVar) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    try {
                        this.a = zzktVar;
                        this.f8695b = zzia.f8668t;
                    } catch (zzjs unused) {
                        this.a = zzktVar;
                        this.f8695b = zzia.f8668t;
                    }
                }
            }
        }
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzkb)) {
            return false;
        }
        zzkb zzkbVar = (zzkb) obj;
        zzkt zzktVar = this.a;
        zzkt zzktVar2 = zzkbVar.a;
        if (zzktVar == null && zzktVar2 == null) {
            return b().equals(zzkbVar.b());
        }
        if (zzktVar == null || zzktVar2 == null) {
            return zzktVar != null ? zzktVar.equals(zzkbVar.c(zzktVar.e())) : c(zzktVar2.e()).equals(zzktVar2);
        }
        return zzktVar.equals(zzktVar2);
    }

    public int hashCode() {
        return 1;
    }
}
