package I;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: renamed from: I.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0249m {
    public final Bundle a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IconCompat f1973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CharSequence f1977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final PendingIntent f1978g;

    public C0249m(int i10, String str, PendingIntent pendingIntent) {
        this(i10 == 0 ? null : IconCompat.b(i10), str, pendingIntent);
    }

    public C0249m(IconCompat iconCompat, String str, PendingIntent pendingIntent) {
        Bundle bundle = new Bundle();
        this.f1975d = true;
        this.f1973b = iconCompat;
        if (iconCompat != null && iconCompat.d() == 2) {
            this.f1976e = iconCompat.c();
        }
        this.f1977f = s.c(str);
        this.f1978g = pendingIntent;
        this.a = bundle;
        this.f1974c = true;
        this.f1975d = true;
    }
}
