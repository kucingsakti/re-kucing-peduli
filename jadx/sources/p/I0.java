package p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.kcstream.cing.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static I0 f13949i;
    public WeakHashMap a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p212w.i f13950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p212w.j f13951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f13952d = new WeakHashMap(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f13953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p188t1.G f13955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final PorterDuff.Mode f13948h = PorterDuff.Mode.SRC_IN;
    public static final G0 j = new G0(6);

    public static synchronized I0 d() {
        try {
            if (f13949i == null) {
                I0 i10 = new I0();
                f13949i = i10;
                j(i10);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13949i;
    }

    public static synchronized PorterDuffColorFilter h(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        G0 g8 = j;
        g8.getClass();
        int i11 = (31 + i10) * 31;
        porterDuffColorFilter = (PorterDuffColorFilter) g8.g(Integer.valueOf(mode.hashCode() + i11));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = new PorterDuffColorFilter(i10, mode);
        }
        return porterDuffColorFilter;
    }

    public static void j(I0 i10) {
        if (Build.VERSION.SDK_INT < 24) {
            i10.a("vector", new H0(3));
            i10.a("animated-vector", new H0(2));
            i10.a("animated-selector", new H0(1));
            i10.a("drawable", new H0(0));
        }
    }

    public final void a(String str, H0 h10) {
        if (this.f13950b == null) {
            this.f13950b = new p212w.i(0);
        }
        this.f13950b.put(str, h10);
    }

    public final synchronized void b(Context context, long j10, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                p212w.g gVar = (p212w.g) this.f13952d.get(context);
                if (gVar == null) {
                    gVar = new p212w.g();
                    this.f13952d.put(context, gVar);
                }
                gVar.j(j10, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable c(Context context, int i10) {
        if (this.f13953e == null) {
            this.f13953e = new TypedValue();
        }
        TypedValue typedValue = this.f13953e;
        context.getResources().getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j10);
        if (drawableE != null) {
            return drawableE;
        }
        LayerDrawable layerDrawableN = null;
        if (this.f13955g != null) {
            if (i10 == R.drawable.abc_cab_background_top_material) {
                layerDrawableN = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else if (i10 == R.drawable.abc_ratingbar_material) {
                layerDrawableN = p188t1.G.n(this, context, R.dimen.abc_star_big);
            } else if (i10 == R.drawable.abc_ratingbar_indicator_material) {
                layerDrawableN = p188t1.G.n(this, context, R.dimen.abc_star_medium);
            } else if (i10 == R.drawable.abc_ratingbar_small_material) {
                layerDrawableN = p188t1.G.n(this, context, R.dimen.abc_star_small);
            }
        }
        if (layerDrawableN != null) {
            layerDrawableN.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j10, layerDrawableN);
        }
        return layerDrawableN;
    }

    public final synchronized Drawable e(Context context, long j10) {
        p212w.g gVar = (p212w.g) this.f13952d.get(context);
        if (gVar == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) gVar.e(j10);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            gVar.k(j10);
        }
        return null;
    }

    public final synchronized Drawable f(Context context, int i10) {
        return g(context, i10, false);
    }

    public final synchronized Drawable g(Context context, int i10, boolean z6) {
        Drawable drawableK;
        try {
            if (!this.f13954f) {
                this.f13954f = true;
                Drawable drawableF = f(context, R.drawable.abc_vector_test);
                if (drawableF == null || (!(drawableF instanceof W0.q) && !"android.graphics.drawable.VectorDrawable".equals(drawableF.getClass().getName()))) {
                    this.f13954f = false;
                    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
                }
            }
            drawableK = k(context, i10);
            if (drawableK == null) {
                drawableK = c(context, i10);
            }
            if (drawableK == null) {
                drawableK = J.a.b(context, i10);
            }
            if (drawableK != null) {
                drawableK = n(context, i10, z6, drawableK);
            }
            if (drawableK != null) {
                AbstractC0710j0.a(drawableK);
            }
        } catch (Throwable th) {
            throw th;
        }
        return drawableK;
    }

    public final synchronized ColorStateList i(Context context, int i10) {
        ColorStateList colorStateList;
        p212w.j jVar;
        WeakHashMap weakHashMap = this.a;
        ColorStateList colorStateListQ = null;
        colorStateList = (weakHashMap == null || (jVar = (p212w.j) weakHashMap.get(context)) == null) ? null : (ColorStateList) jVar.d(i10);
        if (colorStateList == null) {
            p188t1.G g8 = this.f13955g;
            if (g8 != null) {
                colorStateListQ = g8.q(context, i10);
            }
            if (colorStateListQ != null) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                p212w.j jVar2 = (p212w.j) this.a.get(context);
                if (jVar2 == null) {
                    jVar2 = new p212w.j(0);
                    this.a.put(context, jVar2);
                }
                jVar2.a(i10, colorStateListQ);
            }
            colorStateList = colorStateListQ;
        }
        return colorStateList;
    }

    public final Drawable k(Context context, int i10) {
        int next;
        p212w.i iVar = this.f13950b;
        if (iVar == null || iVar.isEmpty()) {
            return null;
        }
        p212w.j jVar = this.f13951c;
        if (jVar != null) {
            String str = (String) jVar.d(i10);
            if ("appcompat_skip_skip".equals(str)) {
                return null;
            }
            if (str != null && this.f13950b.get(str) == null) {
                return null;
            }
        } else {
            this.f13951c = new p212w.j(0);
        }
        if (this.f13953e == null) {
            this.f13953e = new TypedValue();
        }
        TypedValue typedValue = this.f13953e;
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        long j10 = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable drawableE = e(context, j10);
        if (drawableE != null) {
            return drawableE;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i10);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f13951c.a(i10, name);
                H0 h10 = (H0) this.f13950b.get(name);
                if (h10 != null) {
                    drawableE = h10.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                if (drawableE != null) {
                    drawableE.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j10, drawableE);
                }
            } catch (Exception unused) {
            }
        }
        if (drawableE == null) {
            this.f13951c.a(i10, "appcompat_skip_skip");
        }
        return drawableE;
    }

    public final synchronized void l(Context context) {
        p212w.g gVar = (p212w.g) this.f13952d.get(context);
        if (gVar != null) {
            gVar.c();
        }
    }

    public final synchronized void m(p188t1.G g8) {
        this.f13955g = g8;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fc  */
    public final Drawable n(Context context, int i10, boolean z6, Drawable drawable) {
        int i11;
        boolean z10;
        int iRound;
        Drawable drawableMutate;
        ColorStateList colorStateListI = i(context, i10);
        PorterDuff.Mode mode = null;
        if (colorStateListI != null) {
            Drawable drawableMutate2 = drawable.mutate();
            M.a.h(drawableMutate2, colorStateListI);
            if (this.f13955g != null && i10 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode != null) {
                M.a.i(drawableMutate2, mode);
            }
            return drawableMutate2;
        }
        if (this.f13955g != null) {
            if (i10 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int iC = N0.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = r.f14113b;
                p188t1.G.C(drawableFindDrawableByLayerId, iC, mode2);
                p188t1.G.C(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), N0.c(context, R.attr.colorControlNormal), mode2);
                p188t1.G.C(layerDrawable.findDrawableByLayerId(android.R.id.progress), N0.c(context, R.attr.colorControlActivated), mode2);
                return drawable;
            }
            if (i10 == R.drawable.abc_ratingbar_material || i10 == R.drawable.abc_ratingbar_indicator_material || i10 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int iB = N0.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = r.f14113b;
                p188t1.G.C(drawableFindDrawableByLayerId2, iB, mode3);
                p188t1.G.C(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), N0.c(context, R.attr.colorControlActivated), mode3);
                p188t1.G.C(layerDrawable2.findDrawableByLayerId(android.R.id.progress), N0.c(context, R.attr.colorControlActivated), mode3);
                return drawable;
            }
        }
        p188t1.G g8 = this.f13955g;
        boolean z11 = false;
        if (g8 != null) {
            PorterDuff.Mode mode4 = r.f14113b;
            if (p188t1.G.e((int[]) g8.f14978s, i10)) {
                i11 = R.attr.colorControlNormal;
            } else if (p188t1.G.e((int[]) g8.f14980u, i10)) {
                i11 = R.attr.colorControlActivated;
            } else {
                if (p188t1.G.e((int[]) g8.f14981v, i10)) {
                    mode4 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i10 == R.drawable.abc_list_divider_mtrl_alpha) {
                        iRound = Math.round(40.8f);
                        i11 = 16842800;
                        z10 = true;
                    } else {
                        if (i10 != R.drawable.abc_dialog_material_background) {
                            i11 = 0;
                            z10 = false;
                        }
                        iRound = -1;
                    }
                    if (z10) {
                        drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(r.c(N0.c(context, i11), mode4));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        z11 = true;
                    }
                }
                i11 = 16842801;
            }
            z10 = true;
            iRound = -1;
            if (z10) {
                drawableMutate = drawable.mutate();
                drawableMutate.setColorFilter(r.c(N0.c(context, i11), mode4));
                if (iRound != -1) {
                    drawableMutate.setAlpha(iRound);
                }
                z11 = true;
            }
        }
        if (z11 || !z6) {
            return drawable;
        }
        return null;
    }
}
