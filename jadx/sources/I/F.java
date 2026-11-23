package I;

import android.app.Notification;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class F {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Notification f1942c;

    public F(String str, int i10, Notification notification) {
        this.a = str;
        this.f1941b = i10;
        this.f1942c = notification;
    }

    public final void a(p021c.c cVar) {
        String str = this.a;
        int i10 = this.f1941b;
        p021c.a aVar = (p021c.a) cVar;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(p021c.c.a);
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i10);
            parcelObtain.writeString(null);
            Notification notification = this.f1942c;
            if (notification != null) {
                parcelObtain.writeInt(1);
                notification.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            aVar.f7413b.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        return E0.a.j(sb, this.f1941b, ", tag:null]");
    }
}
