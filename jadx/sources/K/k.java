package K;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final ColorStateList a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f2495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2496c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.a = colorStateList;
        this.f2495b = configuration;
        this.f2496c = theme == null ? 0 : theme.hashCode();
    }
}
