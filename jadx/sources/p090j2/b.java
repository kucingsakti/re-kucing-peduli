package p090j2;

import android.content.Context;
import p169r2.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f12361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f12362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12363d;

    public b(Context context, a aVar, a aVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (aVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f12361b = aVar;
        if (aVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f12362c = aVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f12363d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.a.equals(((b) cVar).a)) {
                b bVar = (b) cVar;
                if (this.f12361b.equals(bVar.f12361b) && this.f12362c.equals(bVar.f12362c) && this.f12363d.equals(bVar.f12363d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f12361b.hashCode()) * 1000003) ^ this.f12362c.hashCode()) * 1000003) ^ this.f12363d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.f12361b);
        sb.append(", monotonicClock=");
        sb.append(this.f12362c);
        sb.append(", backendName=");
        return E0.a.l(sb, this.f12363d, "}");
    }
}
