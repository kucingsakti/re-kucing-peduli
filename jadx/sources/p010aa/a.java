package p010aa;

import com.unity3d.ads.metadata.MediationMetaData;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final String a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f6016c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6017d;

    public a(String str, boolean z6) {
        i.f(str, MediationMetaData.KEY_NAME);
        this.a = str;
        this.f6015b = z6;
        this.f6017d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.a;
    }
}
