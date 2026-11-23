package p078i;

import C8.E;
import C8.InterfaceC0175c;
import H0.g;
import I.AbstractC0244h;
import I.InterfaceC0240d;
import I.N;
import J7.j;
import N0.e;
import Q.h;
import T.a;
import Y1.c;
import android.R;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C0525u;
import androidx.lifecycle.EnumC0518m;
import androidx.lifecycle.EnumC0519n;
import androidx.lifecycle.L;
import androidx.lifecycle.V;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Objects;
import p.c1;
import p.r;
import p031d.f;
import p031d.m;
import p068ga.d;
import p078i.AbstractActivityC0655l;
import p081i3.b;
import p156q0.C0763w;
import p156q0.M;
import p156q0.Q;
import p210v8.i;

/* JADX INFO: renamed from: i.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0655l extends m implements InterfaceC0656m, InterfaceC0240d {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f12097L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f12098M;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public D f12100O;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final b f12095J = new b(new C0763w(this), 16);

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final C0525u f12096K = new C0525u(this);

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f12099N = true;

    public AbstractActivityC0655l() {
        ((e) this.f10469w.f3308d).f("android:support:lifecycle", new p031d.e(this, 1));
        final int i10 = 0;
        h(new a(this) { // from class: q0.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0655l f14367b;

            {
                this.f14367b = this;
            }

            @Override // T.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f14367b.f12095J.D();
                        break;
                    default:
                        this.f14367b.f12095J.D();
                        break;
                }
            }
        });
        final int i11 = 1;
        this.f10461E.add(new a(this) { // from class: q0.v

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AbstractActivityC0655l f14367b;

            {
                this.f14367b = this;
            }

            @Override // T.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f14367b.f12095J.D();
                        break;
                    default:
                        this.f14367b.f12095J.D();
                        break;
                }
            }
        });
        i(new f(this, 1));
        ((e) this.f10469w.f3308d).f("androidx:appcompat", new N0.a(this));
        i(new C0654k(this));
    }

    public static boolean o(androidx.fragment.app.e eVar) {
        EnumC0519n enumC0519n = EnumC0519n.f6757u;
        boolean zO = false;
        for (androidx.fragment.app.b bVar : eVar.f6677c.m()) {
            if (bVar != null) {
                C0763w c0763w = bVar.f6623O;
                if ((c0763w == null ? null : c0763w.f14372w) != null) {
                    zO |= o(bVar.l());
                }
                Q q10 = bVar.f6644m0;
                EnumC0519n enumC0519n2 = EnumC0519n.f6758v;
                if (q10 != null) {
                    q10.c();
                    if (q10.f14280v.f6763c.compareTo(enumC0519n2) >= 0) {
                        bVar.f6644m0.f14280v.g(enumC0519n);
                        zO = true;
                    }
                }
                if (bVar.f6643l0.f6763c.compareTo(enumC0519n2) >= 0) {
                    bVar.f6643l0.g(enumC0519n);
                    zO = true;
                }
            }
        }
        return zO;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        D d3 = (D) k();
        d3.w();
        ((ViewGroup) d3.f11937S.findViewById(R.id.content)).addView(view, layoutParams);
        d3.f11924E.a(d3.f11923D.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0181  */
    /* JADX WARN: Code duplicated, block: B:104:0x018f  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:116:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:129:0x020c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00df  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0103  */
    /* JADX WARN: Code duplicated, block: B:69:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0117  */
    /* JADX WARN: Code duplicated, block: B:75:0x011f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0127  */
    /* JADX WARN: Code duplicated, block: B:81:0x012f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0137  */
    /* JADX WARN: Code duplicated, block: B:87:0x013f  */
    /* JADX WARN: Code duplicated, block: B:90:0x014b  */
    /* JADX WARN: Code duplicated, block: B:93:0x015a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0169  */
    /* JADX WARN: Code duplicated, block: B:99:0x0178  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        p125n.b bVar;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        D d3 = (D) k();
        d3.f11949g0 = true;
        int i47 = d3.f11953k0;
        if (i47 == -100) {
            i47 = AbstractC0660q.f12108t;
        }
        int iE = d3.E(context, i47);
        if (AbstractC0660q.c(context) && AbstractC0660q.c(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC0660q.f12106A) {
                    try {
                        h hVar = AbstractC0660q.f12109u;
                        if (hVar == null) {
                            if (AbstractC0660q.f12110v == null) {
                                AbstractC0660q.f12110v = h.b(AbstractC0244h.e(context));
                            }
                            if (!AbstractC0660q.f12110v.a.isEmpty()) {
                                AbstractC0660q.f12109u = AbstractC0660q.f12110v;
                            }
                        } else if (!hVar.equals(AbstractC0660q.f12110v)) {
                            h hVar2 = AbstractC0660q.f12109u;
                            AbstractC0660q.f12110v = hVar2;
                            AbstractC0244h.d(context, hVar2.a.a());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (!AbstractC0660q.f12112x) {
                AbstractC0660q.f12107s.execute(new g(context, 2));
            }
        }
        h hVarO = D.o(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(D.t(context, iE, hVarO, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof p125n.b) {
                    try {
                        ((p125n.b) context).a(D.t(context, iE, hVarO, null, false));
                    } catch (IllegalStateException unused2) {
                        if (D.f11919B0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = 0.0f;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = 0.0f;
                                if (configuration.diff(configuration2) != 0) {
                                    f10 = configuration.fontScale;
                                    f11 = configuration2.fontScale;
                                    if (f10 != f11) {
                                        configuration3.fontScale = f11;
                                    }
                                    i10 = configuration.mcc;
                                    i11 = configuration2.mcc;
                                    if (i10 != i11) {
                                        configuration3.mcc = i11;
                                    }
                                    i12 = configuration.mnc;
                                    i13 = configuration2.mnc;
                                    if (i12 != i13) {
                                        configuration3.mnc = i13;
                                    }
                                    i14 = Build.VERSION.SDK_INT;
                                    if (i14 >= 24) {
                                        x.a(configuration, configuration2, configuration3);
                                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                        configuration3.locale = configuration2.locale;
                                    }
                                    i15 = configuration.touchscreen;
                                    i16 = configuration2.touchscreen;
                                    if (i15 != i16) {
                                        configuration3.touchscreen = i16;
                                    }
                                    i17 = configuration.keyboard;
                                    i18 = configuration2.keyboard;
                                    if (i17 != i18) {
                                        configuration3.keyboard = i18;
                                    }
                                    i19 = configuration.keyboardHidden;
                                    i20 = configuration2.keyboardHidden;
                                    if (i19 != i20) {
                                        configuration3.keyboardHidden = i20;
                                    }
                                    i21 = configuration.navigation;
                                    i22 = configuration2.navigation;
                                    if (i21 != i22) {
                                        configuration3.navigation = i22;
                                    }
                                    i23 = configuration.navigationHidden;
                                    i24 = configuration2.navigationHidden;
                                    if (i23 != i24) {
                                        configuration3.navigationHidden = i24;
                                    }
                                    i25 = configuration.orientation;
                                    i26 = configuration2.orientation;
                                    if (i25 != i26) {
                                        configuration3.orientation = i26;
                                    }
                                    i27 = configuration.screenLayout & 15;
                                    i28 = configuration2.screenLayout & 15;
                                    if (i27 != i28) {
                                        configuration3.screenLayout |= i28;
                                    }
                                    i29 = configuration.screenLayout & 192;
                                    i30 = configuration2.screenLayout & 192;
                                    if (i29 != i30) {
                                        configuration3.screenLayout |= i30;
                                    }
                                    i31 = configuration.screenLayout & 48;
                                    i32 = configuration2.screenLayout & 48;
                                    if (i31 != i32) {
                                        configuration3.screenLayout |= i32;
                                    }
                                    i33 = configuration.screenLayout & 768;
                                    i34 = configuration2.screenLayout & 768;
                                    if (i33 != i34) {
                                        configuration3.screenLayout |= i34;
                                    }
                                    if (i14 >= 26) {
                                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                            configuration3.colorMode |= configuration2.colorMode & 3;
                                        }
                                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                            configuration3.colorMode |= configuration2.colorMode & 12;
                                        }
                                    }
                                    i35 = configuration.uiMode & 15;
                                    i36 = configuration2.uiMode & 15;
                                    if (i35 != i36) {
                                        configuration3.uiMode |= i36;
                                    }
                                    i37 = configuration.uiMode & 48;
                                    i38 = configuration2.uiMode & 48;
                                    if (i37 != i38) {
                                        configuration3.uiMode |= i38;
                                    }
                                    i39 = configuration.screenWidthDp;
                                    i40 = configuration2.screenWidthDp;
                                    if (i39 != i40) {
                                        configuration3.screenWidthDp = i40;
                                    }
                                    i41 = configuration.screenHeightDp;
                                    i42 = configuration2.screenHeightDp;
                                    if (i41 != i42) {
                                        configuration3.screenHeightDp = i42;
                                    }
                                    i43 = configuration.smallestScreenWidthDp;
                                    i44 = configuration2.smallestScreenWidthDp;
                                    if (i43 != i44) {
                                        configuration3.smallestScreenWidthDp = i44;
                                    }
                                    i45 = configuration.densityDpi;
                                    i46 = configuration2.densityDpi;
                                    if (i45 != i46) {
                                        configuration3.densityDpi = i46;
                                    }
                                }
                            }
                            Configuration configurationT = D.t(context, iE, hVarO, configuration3, true);
                            bVar = new p125n.b(context, com.kcstream.cing.R.style.Theme_AppCompat_Empty);
                            bVar.a(configurationT);
                            try {
                                if (context.getTheme() != null) {
                                    K.b.m(bVar.getTheme());
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = bVar;
                        }
                    }
                } else if (D.f11919B0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = 0.0f;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = 0.0f;
                        if (configuration.diff(configuration2) != 0) {
                            f10 = configuration.fontScale;
                            f11 = configuration2.fontScale;
                            if (f10 != f11) {
                                configuration3.fontScale = f11;
                            }
                            i10 = configuration.mcc;
                            i11 = configuration2.mcc;
                            if (i10 != i11) {
                                configuration3.mcc = i11;
                            }
                            i12 = configuration.mnc;
                            i13 = configuration2.mnc;
                            if (i12 != i13) {
                                configuration3.mnc = i13;
                            }
                            i14 = Build.VERSION.SDK_INT;
                            if (i14 >= 24) {
                                x.a(configuration, configuration2, configuration3);
                            } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                                configuration3.locale = configuration2.locale;
                            }
                            i15 = configuration.touchscreen;
                            i16 = configuration2.touchscreen;
                            if (i15 != i16) {
                                configuration3.touchscreen = i16;
                            }
                            i17 = configuration.keyboard;
                            i18 = configuration2.keyboard;
                            if (i17 != i18) {
                                configuration3.keyboard = i18;
                            }
                            i19 = configuration.keyboardHidden;
                            i20 = configuration2.keyboardHidden;
                            if (i19 != i20) {
                                configuration3.keyboardHidden = i20;
                            }
                            i21 = configuration.navigation;
                            i22 = configuration2.navigation;
                            if (i21 != i22) {
                                configuration3.navigation = i22;
                            }
                            i23 = configuration.navigationHidden;
                            i24 = configuration2.navigationHidden;
                            if (i23 != i24) {
                                configuration3.navigationHidden = i24;
                            }
                            i25 = configuration.orientation;
                            i26 = configuration2.orientation;
                            if (i25 != i26) {
                                configuration3.orientation = i26;
                            }
                            i27 = configuration.screenLayout & 15;
                            i28 = configuration2.screenLayout & 15;
                            if (i27 != i28) {
                                configuration3.screenLayout |= i28;
                            }
                            i29 = configuration.screenLayout & 192;
                            i30 = configuration2.screenLayout & 192;
                            if (i29 != i30) {
                                configuration3.screenLayout |= i30;
                            }
                            i31 = configuration.screenLayout & 48;
                            i32 = configuration2.screenLayout & 48;
                            if (i31 != i32) {
                                configuration3.screenLayout |= i32;
                            }
                            i33 = configuration.screenLayout & 768;
                            i34 = configuration2.screenLayout & 768;
                            if (i33 != i34) {
                                configuration3.screenLayout |= i34;
                            }
                            if (i14 >= 26) {
                                if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                                    configuration3.colorMode |= configuration2.colorMode & 3;
                                }
                                if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                                    configuration3.colorMode |= configuration2.colorMode & 12;
                                }
                            }
                            i35 = configuration.uiMode & 15;
                            i36 = configuration2.uiMode & 15;
                            if (i35 != i36) {
                                configuration3.uiMode |= i36;
                            }
                            i37 = configuration.uiMode & 48;
                            i38 = configuration2.uiMode & 48;
                            if (i37 != i38) {
                                configuration3.uiMode |= i38;
                            }
                            i39 = configuration.screenWidthDp;
                            i40 = configuration2.screenWidthDp;
                            if (i39 != i40) {
                                configuration3.screenWidthDp = i40;
                            }
                            i41 = configuration.screenHeightDp;
                            i42 = configuration2.screenHeightDp;
                            if (i41 != i42) {
                                configuration3.screenHeightDp = i42;
                            }
                            i43 = configuration.smallestScreenWidthDp;
                            i44 = configuration2.smallestScreenWidthDp;
                            if (i43 != i44) {
                                configuration3.smallestScreenWidthDp = i44;
                            }
                            i45 = configuration.densityDpi;
                            i46 = configuration2.densityDpi;
                            if (i45 != i46) {
                                configuration3.densityDpi = i46;
                            }
                        }
                    }
                    Configuration configurationT2 = D.t(context, iE, hVarO, configuration3, true);
                    bVar = new p125n.b(context, com.kcstream.cing.R.style.Theme_AppCompat_Empty);
                    bVar.a(configurationT2);
                    if (context.getTheme() != null) {
                        K.b.m(bVar.getTheme());
                    }
                    context = bVar;
                }
            }
        } else if (context instanceof p125n.b) {
            ((p125n.b) context).a(D.t(context, iE, hVarO, null, false));
        } else if (D.f11919B0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = 0.0f;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = 0.0f;
                if (configuration.diff(configuration2) != 0) {
                    f10 = configuration.fontScale;
                    f11 = configuration2.fontScale;
                    if (f10 != f11) {
                        configuration3.fontScale = f11;
                    }
                    i10 = configuration.mcc;
                    i11 = configuration2.mcc;
                    if (i10 != i11) {
                        configuration3.mcc = i11;
                    }
                    i12 = configuration.mnc;
                    i13 = configuration2.mnc;
                    if (i12 != i13) {
                        configuration3.mnc = i13;
                    }
                    i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 24) {
                        x.a(configuration, configuration2, configuration3);
                    } else if (!Objects.equals(configuration.locale, configuration2.locale)) {
                        configuration3.locale = configuration2.locale;
                    }
                    i15 = configuration.touchscreen;
                    i16 = configuration2.touchscreen;
                    if (i15 != i16) {
                        configuration3.touchscreen = i16;
                    }
                    i17 = configuration.keyboard;
                    i18 = configuration2.keyboard;
                    if (i17 != i18) {
                        configuration3.keyboard = i18;
                    }
                    i19 = configuration.keyboardHidden;
                    i20 = configuration2.keyboardHidden;
                    if (i19 != i20) {
                        configuration3.keyboardHidden = i20;
                    }
                    i21 = configuration.navigation;
                    i22 = configuration2.navigation;
                    if (i21 != i22) {
                        configuration3.navigation = i22;
                    }
                    i23 = configuration.navigationHidden;
                    i24 = configuration2.navigationHidden;
                    if (i23 != i24) {
                        configuration3.navigationHidden = i24;
                    }
                    i25 = configuration.orientation;
                    i26 = configuration2.orientation;
                    if (i25 != i26) {
                        configuration3.orientation = i26;
                    }
                    i27 = configuration.screenLayout & 15;
                    i28 = configuration2.screenLayout & 15;
                    if (i27 != i28) {
                        configuration3.screenLayout |= i28;
                    }
                    i29 = configuration.screenLayout & 192;
                    i30 = configuration2.screenLayout & 192;
                    if (i29 != i30) {
                        configuration3.screenLayout |= i30;
                    }
                    i31 = configuration.screenLayout & 48;
                    i32 = configuration2.screenLayout & 48;
                    if (i31 != i32) {
                        configuration3.screenLayout |= i32;
                    }
                    i33 = configuration.screenLayout & 768;
                    i34 = configuration2.screenLayout & 768;
                    if (i33 != i34) {
                        configuration3.screenLayout |= i34;
                    }
                    if (i14 >= 26) {
                        if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                            configuration3.colorMode |= configuration2.colorMode & 3;
                        }
                        if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                            configuration3.colorMode |= configuration2.colorMode & 12;
                        }
                    }
                    i35 = configuration.uiMode & 15;
                    i36 = configuration2.uiMode & 15;
                    if (i35 != i36) {
                        configuration3.uiMode |= i36;
                    }
                    i37 = configuration.uiMode & 48;
                    i38 = configuration2.uiMode & 48;
                    if (i37 != i38) {
                        configuration3.uiMode |= i38;
                    }
                    i39 = configuration.screenWidthDp;
                    i40 = configuration2.screenWidthDp;
                    if (i39 != i40) {
                        configuration3.screenWidthDp = i40;
                    }
                    i41 = configuration.screenHeightDp;
                    i42 = configuration2.screenHeightDp;
                    if (i41 != i42) {
                        configuration3.screenHeightDp = i42;
                    }
                    i43 = configuration.smallestScreenWidthDp;
                    i44 = configuration2.smallestScreenWidthDp;
                    if (i43 != i44) {
                        configuration3.smallestScreenWidthDp = i44;
                    }
                    i45 = configuration.densityDpi;
                    i46 = configuration2.densityDpi;
                    if (i45 != i46) {
                        configuration3.densityDpi = i46;
                    }
                }
            }
            Configuration configurationT3 = D.t(context, iE, hVarO, configuration3, true);
            bVar = new p125n.b(context, com.kcstream.cing.R.style.Theme_AppCompat_Empty);
            bVar.a(configurationT3);
            if (context.getTheme() != null) {
                K.b.m(bVar.getTheme());
            }
            context = bVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        j jVarL = l();
        if (getWindow().hasFeature(0)) {
            if (jVarL == null || !jVarL.e()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // I.AbstractActivityC0247k, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        j jVarL = l();
        if (keyCode == 82 && jVarL != null && jVarL.A(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX WARN: Code duplicated, block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    if (str2.equals("--dump-dumpable")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 472614934:
                    if (str2.equals("--list-dumpables")) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            return;
                        }
                    }
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f12097L);
        printWriter.print(" mResumed=");
        printWriter.print(this.f12098M);
        printWriter.print(" mStopped=");
        printWriter.print(this.f12099N);
        if (getApplication() != null) {
            V vE = e();
            p204v1.g gVar = p213w0.a.f15513c;
            i.f(vE, "store");
            u0.a aVar = u0.a.f15287t;
            i.f(aVar, "defaultCreationExtras");
            c cVar = new c(vE, gVar, aVar);
            InterfaceC0175c interfaceC0175cR = d.r(p213w0.a.class);
            String strS = interfaceC0175cR.s();
            if (strS == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            p212w.j jVar = ((p213w0.a) cVar.A("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strS), interfaceC0175cR)).f15514b;
            if (jVar.h() > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (jVar.h() > 0) {
                    if (jVar.i(0) != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(jVar.e(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0763w) this.f12095J.f12212t).f14371v.v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i10) {
        D d3 = (D) k();
        d3.w();
        return d3.f11923D.findViewById(i10);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        D d3 = (D) k();
        if (d3.f11927H == null) {
            d3.C();
            j jVar = d3.f11926G;
            d3.f11927H = new p125n.g(jVar != null ? jVar.n() : d3.f11922C);
        }
        return d3.f11927H;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = c1.a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        k().b();
    }

    public final AbstractC0660q k() {
        if (this.f12100O == null) {
            ExecutorC0659p executorC0659p = AbstractC0660q.f12107s;
            this.f12100O = new D(this, null, this, this);
        }
        return this.f12100O;
    }

    public final j l() {
        D d3 = (D) k();
        d3.C();
        return d3.f11926G;
    }

    public final M m() {
        return ((C0763w) this.f12095J.f12212t).f14371v;
    }

    public final void n() {
        L.g(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        i.f(decorView, "<this>");
        decorView.setTag(com.kcstream.cing.R.id.view_tree_view_model_store_owner, this);
        xa.d.u(getWindow().getDecorView(), this);
        E.z(getWindow().getDecorView(), this);
    }

    @Override // p031d.m, android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        this.f12095J.D();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // p031d.m, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        D d3 = (D) k();
        if (d3.f11942X && d3.f11936R) {
            d3.C();
            j jVar = d3.f11926G;
            if (jVar != null) {
                jVar.w();
            }
        }
        r rVarA = r.a();
        Context context = d3.f11922C;
        synchronized (rVarA) {
            rVarA.a.l(context);
        }
        d3.f11952j0 = new Configuration(d3.f11922C.getResources().getConfiguration());
        d3.m(false, false);
    }

    @Override // p031d.m, I.AbstractActivityC0247k, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12096K.d(EnumC0518m.ON_CREATE);
        M m2 = ((C0763w) this.f12095J.f12212t).f14371v;
        m2.f6668H = false;
        m2.f6669I = false;
        m2.f6675O.f14268g = false;
        m2.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0763w) this.f12095J.f12212t).f14371v.f6680f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        p();
        k().e();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i10, keyEvent);
        }
        return true;
    }

    @Override // p031d.m, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (q(i10, menuItem)) {
            return true;
        }
        j jVarL = l();
        if (menuItem.getItemId() != 16908332 || jVarL == null || (jVarL.k() & 4) == 0) {
            return false;
        }
        return u();
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f12098M = false;
        ((C0763w) this.f12095J.f12212t).f14371v.u(5);
        this.f12096K.d(EnumC0518m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((D) k()).w();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        r();
        D d3 = (D) k();
        d3.C();
        j jVar = d3.f11926G;
        if (jVar != null) {
            jVar.P(true);
        }
    }

    @Override // p031d.m, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.f12095J.D();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        b bVar = this.f12095J;
        bVar.D();
        super.onResume();
        this.f12098M = true;
        ((C0763w) bVar.f12212t).f14371v.z(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        s();
        ((D) k()).m(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f12095J.D();
    }

    @Override // android.app.Activity
    public final void onStop() {
        t();
        D d3 = (D) k();
        d3.C();
        j jVar = d3.f11926G;
        if (jVar != null) {
            jVar.P(false);
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        k().l(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        j jVarL = l();
        if (getWindow().hasFeature(0)) {
            if (jVarL == null || !jVarL.B()) {
                super.openOptionsMenu();
            }
        }
    }

    public final void p() {
        super.onDestroy();
        ((C0763w) this.f12095J.f12212t).f14371v.l();
        this.f12096K.d(EnumC0518m.ON_DESTROY);
    }

    public final boolean q(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return ((C0763w) this.f12095J.f12212t).f14371v.j();
        }
        return false;
    }

    public final void r() {
        super.onPostResume();
        this.f12096K.d(EnumC0518m.ON_RESUME);
        M m2 = ((C0763w) this.f12095J.f12212t).f14371v;
        m2.f6668H = false;
        m2.f6669I = false;
        m2.f6675O.f14268g = false;
        m2.u(7);
    }

    public final void s() {
        b bVar = this.f12095J;
        bVar.D();
        super.onStart();
        this.f12099N = false;
        boolean z6 = this.f12097L;
        C0763w c0763w = (C0763w) bVar.f12212t;
        if (!z6) {
            this.f12097L = true;
            M m2 = c0763w.f14371v;
            m2.f6668H = false;
            m2.f6669I = false;
            m2.f6675O.f14268g = false;
            m2.u(4);
        }
        c0763w.f14371v.z(true);
        this.f12096K.d(EnumC0518m.ON_START);
        M m10 = c0763w.f14371v;
        m10.f6668H = false;
        m10.f6669I = false;
        m10.f6675O.f14268g = false;
        m10.u(5);
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        n();
        k().h(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        ((D) k()).f11954l0 = i10;
    }

    public final void t() {
        super.onStop();
        this.f12099N = true;
        while (o(m())) {
        }
        M m2 = ((C0763w) this.f12095J.f12212t).f14371v;
        m2.f6669I = true;
        m2.f6675O.f14268g = true;
        m2.u(4);
        this.f12096K.d(EnumC0518m.ON_STOP);
    }

    public boolean u() {
        Intent intentB = AbstractC0244h.b(this);
        if (intentB == null) {
            return false;
        }
        if (!shouldUpRecreateTask(intentB)) {
            navigateUpTo(intentB);
            return true;
        }
        N n10 = new N(this);
        Intent intentB2 = AbstractC0244h.b(this);
        if (intentB2 == null) {
            intentB2 = AbstractC0244h.b(this);
        }
        if (intentB2 != null) {
            ComponentName component = intentB2.getComponent();
            if (component == null) {
                component = intentB2.resolveActivity(n10.f1959t.getPackageManager());
            }
            n10.d(component);
            n10.f1958s.add(intentB2);
        }
        n10.e();
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final void v(Toolbar toolbar) {
        D d3 = (D) k();
        if (d3.f11921B instanceof Activity) {
            d3.C();
            j jVar = d3.f11926G;
            if (jVar instanceof S) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            d3.f11927H = null;
            if (jVar != null) {
                jVar.x();
            }
            d3.f11926G = null;
            if (toolbar != null) {
                Object obj = d3.f11921B;
                M m2 = new M(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : d3.f11928I, d3.f11924E);
                d3.f11926G = m2;
                d3.f11924E.f12122t = m2.f11985d;
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                d3.f11924E.f12122t = null;
            }
            d3.b();
        }
    }

    @Override // p031d.m, android.app.Activity
    public void setContentView(View view) {
        n();
        k().i(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((C0763w) this.f12095J.f12212t).f14371v.f6680f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        n();
        k().j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
