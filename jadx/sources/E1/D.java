package E1;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class D implements s, F {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1294s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ContentResolver f1295t;

    public /* synthetic */ D(ContentResolver contentResolver, int i10) {
        this.f1294s = i10;
        this.f1295t = contentResolver;
    }

    @Override // E1.s
    public r D(x xVar) {
        switch (this.f1294s) {
            case 0:
                break;
        }
        return new G(this);
    }

    @Override // E1.F
    public com.bumptech.glide.load.data.e a(Uri uri) {
        switch (this.f1294s) {
            case 0:
                return new com.bumptech.glide.load.data.a(this.f1295t, uri, 0);
            default:
                return new com.bumptech.glide.load.data.m(1, uri, this.f1295t);
        }
    }

    public String b(String str) {
        Object objInvoke;
        try {
            objInvoke = new c2.n(this, str, 0).invoke();
        } catch (Exception unused) {
            objInvoke = "";
        }
        return (String) objInvoke;
    }

    public String c(String str) {
        Object objInvoke;
        try {
            objInvoke = new c2.n(this, str, 1).invoke();
        } catch (Exception unused) {
            objInvoke = "";
        }
        return (String) objInvoke;
    }

    public String d(String str) {
        Object objInvoke;
        try {
            objInvoke = new c2.n(this, str, 2).invoke();
        } catch (Exception unused) {
            objInvoke = "";
        }
        return (String) objInvoke;
    }
}
