package p050f1;

import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f11414c;

    public i(int i10, Notification notification, int i11) {
        this.a = i10;
        this.f11414c = notification;
        this.f11413b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a == iVar.a && this.f11413b == iVar.f11413b) {
            return this.f11414c.equals(iVar.f11414c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11414c.hashCode() + (((this.a * 31) + this.f11413b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.f11413b + ", mNotification=" + this.f11414c + '}';
    }
}
