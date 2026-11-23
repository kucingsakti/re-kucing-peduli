package p078i;

import B6.d;
import I.AbstractC0244h;
import L8.e0;
import Q.h;
import Q3.u0;
import U.C0417d0;
import U.H;
import U.InterfaceC0425k;
import U.U;
import Y1.c;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.EnumC0519n;
import androidx.lifecycle.InterfaceC0523s;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.unity3d.services.core.device.MimeTypes;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p.A;
import p.C;
import p.C0698d0;
import p.C0703g;
import p.C0723q;
import p.C0728t;
import p.C0732v;
import p.C0734w;
import p.InterfaceC0702f0;
import p.X0;
import p.c1;
import p.f1;
import p.r;
import p069h.a;
import p125n.b;
import p125n.g;
import p136o.j;
import p136o.l;
import p212w.i;

/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC0660q implements j, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Object f11921B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Context f11922C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Window f11923D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public z f11924E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Object f11925F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public J7.j f11926G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public g f11927H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public CharSequence f11928I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public InterfaceC0702f0 f11929J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public C0661s f11930K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public t f11931L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public e0 f11932M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public ActionBarContextView f11933N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public PopupWindow f11934O;
    public r P;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f11936R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ViewGroup f11937S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f11938T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public View f11939U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f11940V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f11941W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f11942X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f11943Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public boolean f11944Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f11945a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f11946b0;
    public boolean c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C[] f11947d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C f11948e0;
    public boolean f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f11949g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f11950h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f11951i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Configuration f11952j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int f11953k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f11954l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f11955m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public boolean f11956n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public A f11957o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public A f11958p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f11959q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f11960r0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f11962t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Rect f11963u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Rect f11964v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public I f11965w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public OnBackInvokedDispatcher f11966x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public OnBackInvokedCallback f11967y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final i f11920z0 = new i(0);

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final int[] f11918A0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final boolean f11919B0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public C0417d0 f11935Q = null;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final r f11961s0 = new r(this, 0);

    public D(Context context, Window window, InterfaceC0656m interfaceC0656m, Object obj) {
        AbstractActivityC0655l abstractActivityC0655l = null;
        this.f11953k0 = -100;
        this.f11922C = context;
        this.f11925F = interfaceC0656m;
        this.f11921B = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC0655l)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC0655l = (AbstractActivityC0655l) context;
                    break;
                }
            }
            if (abstractActivityC0655l != null) {
                this.f11953k0 = ((D) abstractActivityC0655l.k()).f11953k0;
            }
        }
        if (this.f11953k0 == -100) {
            i iVar = f11920z0;
            Integer num = (Integer) iVar.get(this.f11921B.getClass().getName());
            if (num != null) {
                this.f11953k0 = num.intValue();
                iVar.remove(this.f11921B.getClass().getName());
            }
        }
        if (window != null) {
            n(window);
        }
        r.d();
    }

    public static h A(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? x.b(configuration) : h.b(v.b(configuration.locale));
    }

    public static h o(Context context) {
        h hVar;
        h hVarB;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33 || (hVar = AbstractC0660q.f12109u) == null) {
            return null;
        }
        h hVarA = A(context.getApplicationContext().getResources().getConfiguration());
        Q.j jVar = hVar.a;
        int i11 = 0;
        if (i10 < 24) {
            hVarB = jVar.isEmpty() ? h.f3933b : h.b(v.b(jVar.get(0)));
        } else if (jVar.isEmpty()) {
            hVarB = h.f3933b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i11 < hVarA.a.size() + jVar.size()) {
                Locale locale = i11 < jVar.size() ? jVar.get(i11) : hVarA.a.get(i11 - jVar.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i11++;
            }
            hVarB = h.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
        }
        return hVarB.a.isEmpty() ? hVarA : hVarB;
    }

    public static Configuration t(Context context, int i10, h hVar, Configuration configuration, boolean z6) {
        int i11;
        if (i10 == 1) {
            i11 = 16;
        } else if (i10 != 2) {
            i11 = z6 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i11 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i11 | (configuration2.uiMode & (-49));
        if (hVar != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                x.d(configuration2, hVar);
                return configuration2;
            }
            Q.j jVar = hVar.a;
            configuration2.setLocale(jVar.get(0));
            configuration2.setLayoutDirection(jVar.get(0));
        }
        return configuration2;
    }

    public final C B(int i10) {
        C[] cArr = this.f11947d0;
        if (cArr == null || cArr.length <= i10) {
            C[] cArr2 = new C[i10 + 1];
            if (cArr != null) {
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            }
            this.f11947d0 = cArr2;
            cArr = cArr2;
        }
        C c10 = cArr[i10];
        if (c10 != null) {
            return c10;
        }
        C c11 = new C();
        c11.a = i10;
        c11.f11915n = false;
        cArr[i10] = c11;
        return c11;
    }

    public final void C() {
        w();
        if (this.f11942X && this.f11926G == null) {
            Object obj = this.f11921B;
            if (obj instanceof Activity) {
                this.f11926G = new S((Activity) obj, this.f11943Y);
            } else if (obj instanceof Dialog) {
                this.f11926G = new S((Dialog) obj);
            }
            J7.j jVar = this.f11926G;
            if (jVar != null) {
                jVar.G(this.f11962t0);
            }
        }
    }

    public final void D(int i10) {
        this.f11960r0 = (1 << i10) | this.f11960r0;
        if (this.f11959q0) {
            return;
        }
        View decorView = this.f11923D.getDecorView();
        r rVar = this.f11961s0;
        WeakHashMap weakHashMap = U.a;
        decorView.postOnAnimation(rVar);
        this.f11959q0 = true;
    }

    public final int E(Context context, int i10) {
        if (i10 != -100) {
            if (i10 != -1) {
                if (i10 != 0) {
                    if (i10 != 1 && i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f11958p0 == null) {
                            this.f11958p0 = new A(this, context);
                        }
                        return this.f11958p0.g();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return z(context).g();
                }
            }
            return i10;
        }
        return -1;
    }

    public final boolean F() {
        boolean z6 = this.f0;
        this.f0 = false;
        C cB = B(0);
        if (!cB.f11914m) {
            e0 e0Var = this.f11932M;
            if (e0Var != null) {
                e0Var.b();
                return true;
            }
            C();
            J7.j jVar = this.f11926G;
            if (jVar == null || !jVar.f()) {
                return false;
            }
        } else if (!z6) {
            s(cB, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0164, code lost:
    
        if (r15.f13485x.getCount() > 0) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(p078i.C r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p078i.D.G(i.C, android.view.KeyEvent):void");
    }

    public final boolean H(C c10, int i10, KeyEvent keyEvent) {
        l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c10.f11912k || I(c10, keyEvent)) && (lVar = c10.f11910h) != null) {
            return lVar.performShortcut(i10, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:74:0x0104 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0106  */
    /* JADX WARN: Code duplicated, block: B:82:0x011b  */
    public final boolean I(C c10, KeyEvent keyEvent) {
        l lVar;
        InterfaceC0702f0 interfaceC0702f0;
        InterfaceC0702f0 interfaceC0702f1;
        Resources.Theme themeNewTheme;
        InterfaceC0702f0 interfaceC0702f2;
        InterfaceC0702f0 interfaceC0702f3;
        if (!this.f11951i0) {
            if (c10.f11912k) {
                return true;
            }
            C c11 = this.f11948e0;
            if (c11 != null && c11 != c10) {
                s(c11, false);
            }
            Window.Callback callback = this.f11923D.getCallback();
            int i10 = c10.a;
            if (callback != null) {
                c10.f11909g = callback.onCreatePanelView(i10);
            }
            boolean z6 = i10 == 0 || i10 == 108;
            if (z6 && (interfaceC0702f3 = this.f11929J) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0702f3;
                actionBarOverlayLayout.k();
                ((X0) actionBarOverlayLayout.f6124w).f14017l = true;
            }
            if (c10.f11909g == null && (!z6 || !(this.f11926G instanceof M))) {
                l lVar2 = c10.f11910h;
                if (lVar2 == null || c10.f11916o) {
                    if (lVar2 == null) {
                        Context context = this.f11922C;
                        if ((i10 == 0 || i10 == 108) && this.f11929J != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(com.kcstream.cing.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                themeNewTheme = context.getResources().newTheme();
                                themeNewTheme.setTo(theme);
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                                themeNewTheme.resolveAttribute(com.kcstream.cing.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme.resolveAttribute(com.kcstream.cing.R.attr.actionBarWidgetTheme, typedValue, true);
                                themeNewTheme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (themeNewTheme == null) {
                                    themeNewTheme = context.getResources().newTheme();
                                    themeNewTheme.setTo(theme);
                                }
                                themeNewTheme.applyStyle(typedValue.resourceId, true);
                            }
                            if (themeNewTheme != null) {
                                b bVar = new b(context, 0);
                                bVar.getTheme().setTo(themeNewTheme);
                                context = bVar;
                            }
                        }
                        l lVar3 = new l(context);
                        lVar3.f13511w = this;
                        l lVar4 = c10.f11910h;
                        if (lVar3 != lVar4) {
                            if (lVar4 != null) {
                                lVar4.r(c10.f11911i);
                            }
                            c10.f11910h = lVar3;
                            p136o.h hVar = c10.f11911i;
                            if (hVar != null) {
                                lVar3.b(hVar, lVar3.f13507s);
                            }
                        }
                        if (c10.f11910h != null) {
                            if (z6 && (interfaceC0702f1 = this.f11929J) != null) {
                                if (this.f11930K == null) {
                                    this.f11930K = new C0661s(this);
                                }
                                ((ActionBarOverlayLayout) interfaceC0702f1).l(c10.f11910h, this.f11930K);
                            }
                            c10.f11910h.y();
                            if (callback.onCreatePanelMenu(i10, c10.f11910h)) {
                                c10.f11916o = false;
                            } else {
                                lVar = c10.f11910h;
                                if (lVar != null) {
                                    if (lVar != null) {
                                        lVar.r(c10.f11911i);
                                    }
                                    c10.f11910h = null;
                                }
                                if (z6 && (interfaceC0702f0 = this.f11929J) != null) {
                                    ((ActionBarOverlayLayout) interfaceC0702f0).l(null, this.f11930K);
                                }
                            }
                        }
                    } else {
                        if (z6) {
                            if (this.f11930K == null) {
                                this.f11930K = new C0661s(this);
                            }
                            ((ActionBarOverlayLayout) interfaceC0702f1).l(c10.f11910h, this.f11930K);
                        }
                        c10.f11910h.y();
                        if (callback.onCreatePanelMenu(i10, c10.f11910h)) {
                            lVar = c10.f11910h;
                            if (lVar != null) {
                                if (lVar != null) {
                                    lVar.r(c10.f11911i);
                                }
                                c10.f11910h = null;
                            }
                            if (z6) {
                                ((ActionBarOverlayLayout) interfaceC0702f0).l(null, this.f11930K);
                            }
                        } else {
                            c10.f11916o = false;
                        }
                    }
                }
                c10.f11910h.y();
                Bundle bundle = c10.f11917p;
                if (bundle != null) {
                    c10.f11910h.s(bundle);
                    c10.f11917p = null;
                }
                if (!callback.onPreparePanel(0, c10.f11909g, c10.f11910h)) {
                    if (z6 && (interfaceC0702f2 = this.f11929J) != null) {
                        ((ActionBarOverlayLayout) interfaceC0702f2).l(null, this.f11930K);
                    }
                    c10.f11910h.x();
                    return false;
                }
                c10.f11910h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c10.f11910h.x();
            }
            c10.f11912k = true;
            c10.f11913l = false;
            this.f11948e0 = c10;
            return true;
        }
        return false;
    }

    public final void J() {
        if (this.f11936R) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z6 = false;
            if (this.f11966x0 != null && (B(0).f11914m || this.f11932M != null)) {
                z6 = true;
            }
            if (z6 && this.f11967y0 == null) {
                this.f11967y0 = y.b(this.f11966x0, this);
            } else {
                if (z6 || (onBackInvokedCallback = this.f11967y0) == null) {
                    return;
                }
                y.c(this.f11966x0, onBackInvokedCallback);
                this.f11967y0 = null;
            }
        }
    }

    @Override // p078i.AbstractC0660q
    public final void a() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f11922C);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof D) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // p078i.AbstractC0660q
    public final void b() {
        if (this.f11926G != null) {
            C();
            if (this.f11926G.p()) {
                return;
            }
            D(0);
        }
    }

    @Override // p078i.AbstractC0660q
    public final void d() {
        String strC;
        this.f11949g0 = true;
        m(false, true);
        x();
        Object obj = this.f11921B;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strC = AbstractC0244h.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                J7.j jVar = this.f11926G;
                if (jVar == null) {
                    this.f11962t0 = true;
                } else {
                    jVar.G(true);
                }
            }
            synchronized (AbstractC0660q.f12114z) {
                AbstractC0660q.f(this);
                AbstractC0660q.f12113y.add(new WeakReference(this));
            }
        }
        this.f11952j0 = new Configuration(this.f11922C.getResources().getConfiguration());
        this.f11950h0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004d  */
    @Override // p078i.AbstractC0660q
    public final void e() {
        if (this.f11921B instanceof Activity) {
            synchronized (AbstractC0660q.f12114z) {
                AbstractC0660q.f(this);
            }
        }
        if (this.f11959q0) {
            this.f11923D.getDecorView().removeCallbacks(this.f11961s0);
        }
        this.f11951i0 = true;
        if (this.f11953k0 != -100) {
            Object obj = this.f11921B;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f11920z0.put(this.f11921B.getClass().getName(), Integer.valueOf(this.f11953k0));
            } else {
                f11920z0.remove(this.f11921B.getClass().getName());
            }
        } else {
            f11920z0.remove(this.f11921B.getClass().getName());
        }
        J7.j jVar = this.f11926G;
        if (jVar != null) {
            jVar.x();
        }
        A a = this.f11957o0;
        if (a != null) {
            a.d();
        }
        A a10 = this.f11958p0;
        if (a10 != null) {
            a10.d();
        }
    }

    @Override // p078i.AbstractC0660q
    public final boolean g(int i10) {
        if (i10 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i10 = 108;
        } else if (i10 == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i10 = 109;
        }
        if (this.f11946b0 && i10 == 108) {
            return false;
        }
        if (this.f11942X && i10 == 1) {
            this.f11942X = false;
        }
        if (i10 == 1) {
            J();
            this.f11946b0 = true;
            return true;
        }
        if (i10 == 2) {
            J();
            this.f11940V = true;
            return true;
        }
        if (i10 == 5) {
            J();
            this.f11941W = true;
            return true;
        }
        if (i10 == 10) {
            J();
            this.f11944Z = true;
            return true;
        }
        if (i10 == 108) {
            J();
            this.f11942X = true;
            return true;
        }
        if (i10 != 109) {
            return this.f11923D.requestFeature(i10);
        }
        J();
        this.f11943Y = true;
        return true;
    }

    @Override // p078i.AbstractC0660q
    public final void h(int i10) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f11937S.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f11922C).inflate(i10, viewGroup);
        this.f11924E.a(this.f11923D.getCallback());
    }

    @Override // p078i.AbstractC0660q
    public final void i(View view) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f11937S.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f11924E.a(this.f11923D.getCallback());
    }

    @Override // p078i.AbstractC0660q
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        w();
        ViewGroup viewGroup = (ViewGroup) this.f11937S.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f11924E.a(this.f11923D.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x002a  */
    @Override // p136o.j
    public final boolean k(l lVar, MenuItem menuItem) {
        C c10;
        Window.Callback callback = this.f11923D.getCallback();
        if (callback != null && !this.f11951i0) {
            l lVarK = lVar.k();
            C[] cArr = this.f11947d0;
            int length = cArr != null ? cArr.length : 0;
            for (int i10 = 0; i10 < length; i10++) {
                c10 = cArr[i10];
                if (c10 != null && c10.f11910h == lVarK) {
                    if (c10 != null) {
                        return callback.onMenuItemSelected(c10.a, menuItem);
                    }
                }
            }
            c10 = null;
            if (c10 != null) {
                return callback.onMenuItemSelected(c10.a, menuItem);
            }
        }
        return false;
    }

    @Override // p078i.AbstractC0660q
    public final void l(CharSequence charSequence) {
        this.f11928I = charSequence;
        InterfaceC0702f0 interfaceC0702f0 = this.f11929J;
        if (interfaceC0702f0 != null) {
            interfaceC0702f0.setWindowTitle(charSequence);
            return;
        }
        J7.j jVar = this.f11926G;
        if (jVar != null) {
            jVar.S(charSequence);
            return;
        }
        TextView textView = this.f11938T;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Code duplicated, block: B:71:0x00f8  */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean m(boolean z6, boolean z10) {
        int i10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Object obj;
        boolean z16;
        int i11;
        if (this.f11951i0) {
            return false;
        }
        int i12 = this.f11953k0;
        if (i12 == -100) {
            i12 = AbstractC0660q.f12108t;
        }
        Context context = this.f11922C;
        int iE = E(context, i12);
        int i13 = Build.VERSION.SDK_INT;
        Object obj2 = null;
        h hVarO = i13 < 33 ? o(context) : null;
        if (!z10 && hVarO != null) {
            hVarO = A(context.getResources().getConfiguration());
        }
        Configuration configurationT = t(context, iE, hVarO, null, false);
        boolean z17 = this.f11956n0;
        Object obj3 = this.f11921B;
        if (z17 || !(obj3 instanceof Activity)) {
            this.f11956n0 = true;
            i10 = this.f11955m0;
        } else {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i10 = 0;
            } else {
                if (i13 >= 29) {
                    i11 = 269221888;
                } else {
                    i11 = i13 >= 24 ? 786432 : 0;
                }
                try {
                    ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i11);
                    if (activityInfo != null) {
                        this.f11955m0 = activityInfo.configChanges;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    this.f11955m0 = 0;
                }
                this.f11956n0 = true;
                i10 = this.f11955m0;
            }
        }
        Configuration configuration = this.f11952j0;
        if (configuration == null) {
            configuration = context.getResources().getConfiguration();
        }
        int i14 = configuration.uiMode & 48;
        int i15 = configurationT.uiMode & 48;
        h hVarA = A(configuration);
        h hVarA2 = hVarO == null ? null : A(configurationT);
        int i16 = i14 != i15 ? 512 : 0;
        if (hVarA2 != null && !hVarA.equals(hVarA2)) {
            i16 |= 8196;
        }
        if (((~i10) & i16) != 0 && z6 && this.f11949g0 && ((f11919B0 || this.f11950h0) && (obj3 instanceof Activity))) {
            Activity activity = (Activity) obj3;
            if (activity.isChild()) {
                z11 = false;
            } else {
                int i17 = Build.VERSION.SDK_INT;
                if (i17 >= 31 && (i16 & 8192) != 0) {
                    activity.getWindow().getDecorView().setLayoutDirection(configurationT.getLayoutDirection());
                }
                if (i17 >= 28) {
                    activity.recreate();
                } else {
                    new Handler(activity.getMainLooper()).post(new d(activity, 2));
                }
                z11 = true;
            }
        } else {
            z11 = false;
        }
        if (z11 || i16 == 0) {
            z12 = z11;
        } else {
            boolean z18 = (i16 & i10) == i16;
            Resources resources = context.getResources();
            Configuration configuration2 = new Configuration(resources.getConfiguration());
            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i15;
            if (hVarA2 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    x.d(configuration2, hVarA2);
                } else {
                    Q.j jVar = hVarA2.a;
                    configuration2.setLocale(jVar.get(0));
                    configuration2.setLayoutDirection(jVar.get(0));
                }
            }
            resources.updateConfiguration(configuration2, null);
            int i18 = Build.VERSION.SDK_INT;
            if (i18 < 26 && i18 < 28) {
                if (i18 >= 24) {
                    if (!u0.j) {
                        try {
                            Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                            u0.f4313i = declaredField;
                            z15 = true;
                            try {
                                declaredField.setAccessible(true);
                            } catch (NoSuchFieldException unused2) {
                            }
                        } catch (NoSuchFieldException unused3) {
                            z15 = true;
                        }
                        u0.j = z15;
                    }
                    Field field = u0.f4313i;
                    if (field != null) {
                        try {
                            obj = field.get(resources);
                        } catch (IllegalAccessException unused4) {
                            obj = null;
                        }
                        if (obj != null) {
                            if (!u0.f4308d) {
                                try {
                                    Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                    u0.f4307c = declaredField2;
                                    z16 = true;
                                    try {
                                        declaredField2.setAccessible(true);
                                    } catch (NoSuchFieldException unused5) {
                                    }
                                } catch (NoSuchFieldException unused6) {
                                    z16 = true;
                                }
                                u0.f4308d = z16;
                            }
                            Field field2 = u0.f4307c;
                            if (field2 != null) {
                                try {
                                    obj2 = field2.get(obj);
                                } catch (IllegalAccessException unused7) {
                                }
                            }
                            if (obj2 != null) {
                                u0.d(obj2);
                            }
                        }
                    }
                } else {
                    if (!u0.f4308d) {
                        try {
                            Field declaredField3 = Resources.class.getDeclaredField("mDrawableCache");
                            u0.f4307c = declaredField3;
                            z14 = true;
                            try {
                                declaredField3.setAccessible(true);
                            } catch (NoSuchFieldException unused8) {
                            }
                        } catch (NoSuchFieldException unused9) {
                            z14 = true;
                        }
                        u0.f4308d = z14;
                    }
                    Field field3 = u0.f4307c;
                    if (field3 != null) {
                        try {
                            obj2 = field3.get(resources);
                        } catch (IllegalAccessException unused10) {
                        }
                    }
                    if (obj2 != null) {
                        u0.d(obj2);
                    }
                }
            }
            int i19 = this.f11954l0;
            if (i19 != 0) {
                context.setTheme(i19);
                z13 = true;
                context.getTheme().applyStyle(this.f11954l0, true);
            } else {
                z13 = true;
            }
            if (z18 && (obj3 instanceof Activity)) {
                Activity activity2 = (Activity) obj3;
                if (activity2 instanceof InterfaceC0523s) {
                    if (((InterfaceC0523s) activity2).g().f6763c.compareTo(EnumC0519n.f6757u) >= 0) {
                        activity2.onConfigurationChanged(configuration2);
                    }
                } else if (this.f11950h0 && !this.f11951i0) {
                    activity2.onConfigurationChanged(configuration2);
                }
            }
            z12 = z13;
        }
        if (z12 && (obj3 instanceof AbstractActivityC0655l)) {
            if ((i16 & 512) != 0) {
            }
            if ((i16 & 4) != 0) {
            }
        }
        if (hVarA2 != null) {
            h hVarA3 = A(context.getResources().getConfiguration());
            if (Build.VERSION.SDK_INT >= 24) {
                x.c(hVarA3);
            } else {
                Locale.setDefault(hVarA3.a.get(0));
            }
        }
        if (i12 == 0) {
            z(context).s();
        } else {
            A a = this.f11957o0;
            if (a != null) {
                a.d();
            }
        }
        if (i12 == 3) {
            if (this.f11958p0 == null) {
                this.f11958p0 = new A(this, context);
            }
            this.f11958p0.s();
        } else {
            A a10 = this.f11958p0;
            if (a10 != null) {
                a10.d();
            }
        }
        return z12;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005a  */
    public final void n(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f11923D != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof z) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        z zVar = new z(this, callback);
        this.f11924E = zVar;
        window.setCallback(zVar);
        c cVarD = c.D(this.f11922C, null, f11918A0);
        Drawable drawableW = cVarD.w(0);
        if (drawableW != null) {
            window.setBackgroundDrawable(drawableW);
        }
        cVarD.J();
        this.f11923D = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f11966x0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f11967y0) != null) {
            y.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f11967y0 = null;
        }
        Object obj = this.f11921B;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f11966x0 = y.a(activity);
            } else {
                this.f11966x0 = null;
            }
        } else {
            this.f11966x0 = null;
        }
        K();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a;
        if (this.f11965w0 == null) {
            int[] iArr = a.j;
            Context context2 = this.f11922C;
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = typedArrayObtainStyledAttributes.getString(116);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f11965w0 = new I();
            } else {
                try {
                    this.f11965w0 = (I) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f11965w0 = new I();
                }
            }
        }
        I i10 = this.f11965w0;
        int i11 = c1.a;
        i10.getClass();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, a.f11633z, 0, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        typedArrayObtainStyledAttributes2.recycle();
        Context bVar = (resourceId == 0 || ((context instanceof b) && ((b) context).a == resourceId)) ? context : new b(context, resourceId);
        str.getClass();
        View view2 = null;
        switch (str) {
            case "RatingBar":
                a = new A(bVar, attributeSet);
                break;
            case "CheckedTextView":
                a = new C0723q(bVar, attributeSet);
                break;
            case "MultiAutoCompleteTextView":
                a = new C0734w(bVar, attributeSet);
                break;
            case "TextView":
                a = i10.e(bVar, attributeSet);
                break;
            case "ImageButton":
                a = new AppCompatImageButton(bVar, attributeSet);
                break;
            case "SeekBar":
                a = new C(bVar, attributeSet);
                break;
            case "Spinner":
                a = new androidx.appcompat.widget.c(bVar, attributeSet);
                break;
            case "RadioButton":
                a = i10.d(bVar, attributeSet);
                break;
            case "ToggleButton":
                a = new C0698d0(bVar, attributeSet);
                break;
            case "ImageView":
                a = new C0732v(bVar, attributeSet, 0);
                break;
            case "AutoCompleteTextView":
                a = i10.a(bVar, attributeSet);
                break;
            case "CheckBox":
                a = i10.c(bVar, attributeSet);
                break;
            case "EditText":
                a = new C0728t(bVar, attributeSet, com.kcstream.cing.R.attr.editTextStyle);
                break;
            case "Button":
                a = i10.b(bVar, attributeSet);
                break;
            default:
                a = null;
                break;
        }
        if (a == null && context != bVar) {
            Object[] objArr = i10.a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = bVar;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i12 = 0;
                    while (true) {
                        String[] strArr = I.f11980g;
                        if (i12 < 3) {
                            View viewF = i10.f(bVar, str, strArr[i12]);
                            if (viewF != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = viewF;
                            } else {
                                i12++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View viewF2 = i10.f(bVar, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = viewF2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            a = view2;
        }
        if (a != null) {
            Context context3 = a.getContext();
            if ((context3 instanceof ContextWrapper) && a.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, I.f11976c);
                String string2 = typedArrayObtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    a.setOnClickListener(new H(a, string2));
                }
                typedArrayObtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes4 = bVar.obtainStyledAttributes(attributeSet, I.f11977d);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    boolean z6 = typedArrayObtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = U.a;
                    new U.C(com.kcstream.cing.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).g(a, Boolean.valueOf(z6));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = bVar.obtainStyledAttributes(attributeSet, I.f11978e);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    U.o(a, typedArrayObtainStyledAttributes5.getString(0));
                }
                typedArrayObtainStyledAttributes5.recycle();
                TypedArray typedArrayObtainStyledAttributes6 = bVar.obtainStyledAttributes(attributeSet, I.f11979f);
                if (typedArrayObtainStyledAttributes6.hasValue(0)) {
                    boolean z10 = typedArrayObtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = U.a;
                    new U.C(com.kcstream.cing.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).g(a, Boolean.valueOf(z10));
                }
                typedArrayObtainStyledAttributes6.recycle();
            }
        }
        return a;
    }

    public final void p(int i10, C c10, l lVar) {
        if (lVar == null) {
            if (c10 == null && i10 >= 0) {
                C[] cArr = this.f11947d0;
                if (i10 < cArr.length) {
                    c10 = cArr[i10];
                }
            }
            if (c10 != null) {
                lVar = c10.f11910h;
            }
        }
        if ((c10 == null || c10.f11914m) && !this.f11951i0) {
            z zVar = this.f11924E;
            Window.Callback callback = this.f11923D.getCallback();
            zVar.getClass();
            try {
                zVar.f12125w = true;
                callback.onPanelClosed(i10, lVar);
            } finally {
                zVar.f12125w = false;
            }
        }
    }

    public final void q(l lVar) {
        androidx.appcompat.widget.b bVar;
        if (this.c0) {
            return;
        }
        this.c0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f11929J;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((X0) actionBarOverlayLayout.f6124w).a.f6239s;
        if (actionMenuView != null && (bVar = actionMenuView.f6133L) != null) {
            bVar.b();
            C0703g c0703g = bVar.f6265M;
            if (c0703g != null && c0703g.b()) {
                c0703g.f13564i.dismiss();
            }
        }
        Window.Callback callback = this.f11923D.getCallback();
        if (callback != null && !this.f11951i0) {
            callback.onPanelClosed(108, lVar);
        }
        this.c0 = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.f() != false) goto L20;
     */
    @Override // p136o.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(p136o.l r6) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p078i.D.r(o.l):void");
    }

    public final void s(C c10, boolean z6) {
        B b3;
        InterfaceC0702f0 interfaceC0702f0;
        if (z6 && c10.a == 0 && (interfaceC0702f0 = this.f11929J) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0702f0;
            actionBarOverlayLayout.k();
            if (((X0) actionBarOverlayLayout.f6124w).a.p()) {
                q(c10.f11910h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f11922C.getSystemService("window");
        if (windowManager != null && c10.f11914m && (b3 = c10.f11907e) != null) {
            windowManager.removeView(b3);
            if (z6) {
                p(c10.a, c10, null);
            }
        }
        c10.f11912k = false;
        c10.f11913l = false;
        c10.f11914m = false;
        c10.f11908f = null;
        c10.f11915n = true;
        if (this.f11948e0 == c10) {
            this.f11948e0 = null;
        }
        if (c10.a == 0) {
            K();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0129  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0135  */
    /* JADX WARN: Code duplicated, block: B:94:0x013c A[RETURN] */
    public final boolean u(KeyEvent keyEvent) {
        View decorView;
        int keyCode;
        C cB;
        InterfaceC0702f0 interfaceC0702f0;
        Context context;
        boolean z6;
        boolean zV;
        boolean zI;
        AudioManager audioManager;
        Toolbar toolbar;
        ActionMenuView actionMenuView;
        androidx.appcompat.widget.b bVar;
        C cB2;
        Object obj = this.f11921B;
        if ((!(obj instanceof InterfaceC0425k) && !(obj instanceof F)) || (decorView = this.f11923D.getDecorView()) == null || !C4.a.o(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                z zVar = this.f11924E;
                Window.Callback callback = this.f11923D.getCallback();
                zVar.getClass();
                try {
                    zVar.f12124v = true;
                    boolean zDispatchKeyEvent = callback.dispatchKeyEvent(keyEvent);
                    zVar.f12124v = false;
                    if (!zDispatchKeyEvent) {
                        keyCode = keyEvent.getKeyCode();
                        if (keyEvent.getAction() == 0) {
                            if (keyCode != 4) {
                                this.f0 = (keyEvent.getFlags() & 128) != 0;
                                return false;
                            }
                            if (keyCode == 82) {
                                if (keyEvent.getRepeatCount() == 0) {
                                    cB2 = B(0);
                                    if (!cB2.f11914m) {
                                        I(cB2, keyEvent);
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (keyCode != 4) {
                            if (keyCode == 82) {
                                if (this.f11932M == null) {
                                    cB = B(0);
                                    interfaceC0702f0 = this.f11929J;
                                    context = this.f11922C;
                                    if (interfaceC0702f0 != null) {
                                        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0702f0;
                                        actionBarOverlayLayout.k();
                                        toolbar = ((X0) actionBarOverlayLayout.f6124w).a;
                                        if (toolbar.getVisibility() == 0 || (actionMenuView = toolbar.f6239s) == null || !actionMenuView.f6132K || ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                            z6 = cB.f11914m;
                                            if (!z6 || cB.f11913l) {
                                                s(cB, true);
                                                zV = z6;
                                            } else {
                                                if (cB.f11912k) {
                                                    if (cB.f11916o) {
                                                        cB.f11912k = false;
                                                        zI = I(cB, keyEvent);
                                                    } else {
                                                        zI = true;
                                                    }
                                                    if (zI) {
                                                        G(cB, keyEvent);
                                                        zV = true;
                                                    }
                                                }
                                                zV = false;
                                            }
                                        } else {
                                            ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f11929J;
                                            actionBarOverlayLayout2.k();
                                            if (((X0) actionBarOverlayLayout2.f6124w).a.p()) {
                                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f11929J;
                                                actionBarOverlayLayout3.k();
                                                ActionMenuView actionMenuView2 = ((X0) actionBarOverlayLayout3.f6124w).a.f6239s;
                                                if (actionMenuView2 != null && (bVar = actionMenuView2.f6133L) != null && bVar.b()) {
                                                    zV = true;
                                                }
                                            } else if (!this.f11951i0 && I(cB, keyEvent)) {
                                                ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f11929J;
                                                actionBarOverlayLayout4.k();
                                                zV = ((X0) actionBarOverlayLayout4.f6124w).a.v();
                                            }
                                            zV = false;
                                        }
                                    } else {
                                        z6 = cB.f11914m;
                                        if (z6) {
                                        }
                                        s(cB, true);
                                        zV = z6;
                                    }
                                    if (zV) {
                                        audioManager = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                            }
                            return false;
                        }
                        if (F()) {
                            return false;
                        }
                    }
                } catch (Throwable th) {
                    zVar.f12124v = false;
                    throw th;
                }
            } else {
                keyCode = keyEvent.getKeyCode();
                if (keyEvent.getAction() == 0) {
                    if (keyCode != 4) {
                        this.f0 = (keyEvent.getFlags() & 128) != 0;
                        return false;
                    }
                    if (keyCode == 82) {
                        if (keyEvent.getRepeatCount() == 0) {
                            cB2 = B(0);
                            if (!cB2.f11914m) {
                                I(cB2, keyEvent);
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (keyCode != 4) {
                    if (keyCode == 82) {
                        if (this.f11932M == null) {
                            cB = B(0);
                            interfaceC0702f0 = this.f11929J;
                            context = this.f11922C;
                            if (interfaceC0702f0 != null) {
                                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) interfaceC0702f0;
                                actionBarOverlayLayout5.k();
                                toolbar = ((X0) actionBarOverlayLayout5.f6124w).a;
                                if (toolbar.getVisibility() == 0) {
                                    z6 = cB.f11914m;
                                    if (z6) {
                                    }
                                    s(cB, true);
                                    zV = z6;
                                } else {
                                    z6 = cB.f11914m;
                                    if (z6) {
                                    }
                                    s(cB, true);
                                    zV = z6;
                                }
                            } else {
                                z6 = cB.f11914m;
                                if (z6) {
                                }
                                s(cB, true);
                                zV = z6;
                            }
                            if (zV) {
                                audioManager = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                                if (audioManager != null) {
                                    audioManager.playSoundEffect(0);
                                    return true;
                                }
                                Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                return true;
                            }
                        }
                    }
                    return false;
                }
                if (F()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void v(int i10) {
        C cB = B(i10);
        if (cB.f11910h != null) {
            Bundle bundle = new Bundle();
            cB.f11910h.u(bundle);
            if (bundle.size() > 0) {
                cB.f11917p = bundle;
            }
            cB.f11910h.y();
            cB.f11910h.clear();
        }
        cB.f11916o = true;
        cB.f11915n = true;
        if ((i10 == 108 || i10 == 0) && this.f11929J != null) {
            C cB2 = B(0);
            cB2.f11912k = false;
            I(cB2, null);
        }
    }

    public final void w() {
        ViewGroup viewGroup;
        if (this.f11936R) {
            return;
        }
        int[] iArr = a.j;
        Context context = this.f11922C;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(ModuleDescriptor.MODULE_VERSION)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            g(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(ModuleDescriptor.MODULE_VERSION, false)) {
            g(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            g(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.f11945a0 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        x();
        this.f11923D.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.f11946b0) {
            viewGroup = this.f11944Z ? (ViewGroup) layoutInflaterFrom.inflate(com.kcstream.cing.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(com.kcstream.cing.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f11945a0) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(com.kcstream.cing.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f11943Y = false;
            this.f11942X = false;
        } else if (this.f11942X) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.kcstream.cing.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new b(context, typedValue.resourceId) : context).inflate(com.kcstream.cing.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0702f0 interfaceC0702f0 = (InterfaceC0702f0) viewGroup.findViewById(com.kcstream.cing.R.id.decor_content_parent);
            this.f11929J = interfaceC0702f0;
            interfaceC0702f0.setWindowCallback(this.f11923D.getCallback());
            if (this.f11943Y) {
                ((ActionBarOverlayLayout) this.f11929J).j(109);
            }
            if (this.f11940V) {
                ((ActionBarOverlayLayout) this.f11929J).j(2);
            }
            if (this.f11941W) {
                ((ActionBarOverlayLayout) this.f11929J).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f11942X + ", windowActionBarOverlay: " + this.f11943Y + ", android:windowIsFloating: " + this.f11945a0 + ", windowActionModeOverlay: " + this.f11944Z + ", windowNoTitle: " + this.f11946b0 + " }");
        }
        C0661s c0661s = new C0661s(this);
        WeakHashMap weakHashMap = U.a;
        H.u(viewGroup, c0661s);
        if (this.f11929J == null) {
            this.f11938T = (TextView) viewGroup.findViewById(com.kcstream.cing.R.id.title);
        }
        boolean z6 = f1.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.kcstream.cing.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f11923D.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f11923D.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new t(this));
        this.f11937S = viewGroup;
        Object obj = this.f11921B;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f11928I;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0702f0 interfaceC0702f1 = this.f11929J;
            if (interfaceC0702f1 != null) {
                interfaceC0702f1.setWindowTitle(title);
            } else {
                J7.j jVar = this.f11926G;
                if (jVar != null) {
                    jVar.S(title);
                } else {
                    TextView textView = this.f11938T;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f11937S.findViewById(R.id.content);
        View decorView = this.f11923D.getDecorView();
        contentFrameLayout2.f6157y.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.f11936R = true;
        C cB = B(0);
        if (this.f11951i0 || cB.f11910h != null) {
            return;
        }
        D(108);
    }

    public final void x() {
        if (this.f11923D == null) {
            Object obj = this.f11921B;
            if (obj instanceof Activity) {
                n(((Activity) obj).getWindow());
            }
        }
        if (this.f11923D == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context y() {
        C();
        J7.j jVar = this.f11926G;
        Context contextN = jVar != null ? jVar.n() : null;
        return contextN == null ? this.f11922C : contextN;
    }

    public final B6.b z(Context context) {
        if (this.f11957o0 == null) {
            if (c.f5668w == null) {
                Context applicationContext = context.getApplicationContext();
                c.f5668w = new c(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f11957o0 = new A(this, c.f5668w);
        }
        return this.f11957o0;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
