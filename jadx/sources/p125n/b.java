package p125n;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f13228f;
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f13229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f13230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f13231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f13232e;

    public b(Context context, int i10) {
        super(context);
        this.a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f13232e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f13231d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f13231d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f13229b == null) {
            this.f13229b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f13229b.setTo(theme);
            }
        }
        this.f13229b.applyStyle(this.a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f13232e == null) {
            Configuration configuration = this.f13231d;
            if (configuration == null) {
                this.f13232e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f13228f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f13228f = configuration2;
                    }
                    if (configuration.equals(f13228f)) {
                        this.f13232e = super.getResources();
                    }
                }
                this.f13232e = createConfigurationContext(this.f13231d).getResources();
            }
        }
        return this.f13232e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f13230c == null) {
            this.f13230c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f13230c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f13229b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f13229b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.a != i10) {
            this.a = i10;
            b();
        }
    }
}
