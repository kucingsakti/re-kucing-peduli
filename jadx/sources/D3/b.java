package D3;

import A1.p;
import A3.K;
import C8.E;
import E4.L;
import O3.C0343a;
import U.H;
import U.U;
import U.f0;
import X9.C0462h;
import X9.G;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import o1.k;
import o1.r;
import p076h8.l;
import p076h8.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static void A(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        M.a.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static void B(Window window, boolean z6) {
        if (Build.VERSION.SDK_INT >= 30) {
            f0.a(window, z6);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z6 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static void C(ViewGroup viewGroup, float f10) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof p170r3.g) {
            ((p170r3.g) background).k(f10);
        }
    }

    public static void D(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = U.a;
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z6 = onLongClickListener != null;
        boolean z10 = zHasOnClickListeners || z6;
        checkableImageButton.setFocusable(z10);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z6);
        checkableImageButton.setImportantForAccessibility(z10 ? 1 : 2);
    }

    public static void E(View view, p170r3.g gVar) {
        p062g3.a aVar = gVar.f14501s.f14471b;
        if (aVar == null || !aVar.a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = U.a;
            fI += H.i((View) parent);
        }
        p170r3.f fVar = gVar.f14501s;
        if (fVar.f14480l != fI) {
            fVar.f14480l = fI;
            gVar.q();
        }
    }

    public static void F(ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof p170r3.g) {
            E(viewGroup, (p170r3.g) background);
        }
    }

    public static final String G(String str) {
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        p210v8.i.e(strNormalize, "normalize(...)");
        Pattern patternCompile = Pattern.compile("[^\\p{ASCII}]");
        p210v8.i.e(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strNormalize).replaceAll("");
        p210v8.i.e(strReplaceAll, "replaceAll(...)");
        Pattern patternCompile2 = Pattern.compile("[^a-zA-Z0-9.\\s]+");
        p210v8.i.e(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("");
        p210v8.i.e(strReplaceAll2, "replaceAll(...)");
        return L9.f.j0(strReplaceAll2).toString();
    }

    public static final void H(Activity activity, Class cls) {
        p210v8.i.f(activity, "<this>");
        activity.startActivity(new Intent(activity, (Class<?>) cls));
    }

    public static void a(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                M.a.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                M.a.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                M.a.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    public static boolean b(int i10, Rect rect, Rect rect2, Rect rect3) {
        int iU;
        int i11;
        int i12;
        boolean zC = c(i10, rect, rect2);
        if (c(i10, rect, rect3) || !zC) {
            return false;
        }
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    if (rect.bottom <= rect3.top) {
                        if (i10 != 17 && i10 != 66) {
                            iU = u(i10, rect, rect2);
                            if (i10 != 17) {
                                i11 = rect.left;
                                i12 = rect3.left;
                            } else if (i10 != 33) {
                                i11 = rect.top;
                                i12 = rect3.top;
                            } else if (i10 != 66) {
                                i11 = rect3.right;
                                i12 = rect.right;
                            } else {
                                if (i10 == 130) {
                                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                }
                                i11 = rect3.bottom;
                                i12 = rect.bottom;
                            }
                            if (iU < Math.max(1, i11 - i12)) {
                                return false;
                            }
                        }
                    }
                } else if (rect.right <= rect3.left) {
                    if (i10 != 17) {
                        iU = u(i10, rect, rect2);
                        if (i10 != 17) {
                            i11 = rect.left;
                            i12 = rect3.left;
                        } else if (i10 != 33) {
                            i11 = rect.top;
                            i12 = rect3.top;
                        } else if (i10 != 66) {
                            i11 = rect3.right;
                            i12 = rect.right;
                        } else {
                            if (i10 == 130) {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                            i11 = rect3.bottom;
                            i12 = rect.bottom;
                        }
                        if (iU < Math.max(1, i11 - i12)) {
                            return false;
                        }
                    }
                }
            } else if (rect.top >= rect3.bottom) {
                if (i10 != 17) {
                    iU = u(i10, rect, rect2);
                    if (i10 != 17) {
                        i11 = rect.left;
                        i12 = rect3.left;
                    } else if (i10 != 33) {
                        i11 = rect.top;
                        i12 = rect3.top;
                    } else if (i10 != 66) {
                        i11 = rect3.right;
                        i12 = rect.right;
                    } else {
                        if (i10 == 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i11 = rect3.bottom;
                        i12 = rect.bottom;
                    }
                    if (iU < Math.max(1, i11 - i12)) {
                        return false;
                    }
                }
            }
        } else if (rect.left >= rect3.right) {
            if (i10 != 17) {
                iU = u(i10, rect, rect2);
                if (i10 != 17) {
                    i11 = rect.left;
                    i12 = rect3.left;
                } else if (i10 != 33) {
                    i11 = rect.top;
                    i12 = rect3.top;
                } else if (i10 != 66) {
                    i11 = rect3.right;
                    i12 = rect.right;
                } else {
                    if (i10 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = rect3.bottom;
                    i12 = rect.bottom;
                }
                if (iU < Math.max(1, i11 - i12)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean c(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void d(int i10) {
        if (new B8.c(2, 36, 1).f(i10)) {
            return;
        }
        StringBuilder sbL = AbstractC0487g.l("radix ", i10, " was not in valid range ");
        sbL.append(new B8.c(2, 36, 1));
        throw new IllegalArgumentException(sbL.toString());
    }

    public static final void e(View view, p200u8.a aVar) {
        p210v8.i.f(view, "<this>");
        view.setOnClickListener(new L(aVar));
    }

    public static ImageView.ScaleType f(int i10) {
        if (i10 == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i10 == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i10 == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i10 == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i10 != 5) {
            return i10 != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE;
        }
        return ImageView.ScaleType.CENTER_CROP;
    }

    public static E g(int i10) {
        if (i10 != 0) {
            return i10 != 1 ? new p170r3.i() : new p170r3.d();
        }
        return new p170r3.i();
    }

    public static final boolean h(char c10, char c11, boolean z6) {
        if (c10 == c11) {
            return true;
        }
        if (!z6) {
            return false;
        }
        char upperCase = Character.toUpperCase(c10);
        char upperCase2 = Character.toUpperCase(c11);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static final C0343a i(Context context) {
        T3.c cVar;
        int i10 = 0;
        int i11 = 6;
        int i12 = 4;
        int i13 = 5;
        int i14 = 3;
        int i15 = 2;
        int i16 = 1;
        Context applicationContext = context.getApplicationContext();
        p163q7.f fVar = p152p7.a.f14243b;
        h7.d dVar = p152p7.a.a;
        p210v8.i.b(applicationContext, "appContext");
        k kVar = new k(applicationContext, C3.b.u(applicationContext));
        N4.e eVar = new N4.e(context);
        p185s7.a aVar = new p185s7.a();
        if (fVar instanceof p163q7.f) {
            fVar.getClass();
            if (fVar.a.equals("fetch2")) {
                fVar.a = "LibGlobalFetchLib";
            }
        } else {
            fVar.getClass();
        }
        h7.c cVar2 = new h7.c(applicationContext, aVar, fVar, dVar, kVar, eVar);
        synchronized (p112l7.e.a) {
            try {
                LinkedHashMap linkedHashMap = p112l7.e.f12950b;
                p112l7.d dVar2 = (p112l7.d) linkedHashMap.get("LibGlobalFetchLib");
                if (dVar2 != null) {
                    cVar = new T3.c(cVar2, dVar2.a, dVar2.f12943b, dVar2.f12944c, dVar2.f12945d, dVar2.f12946e, dVar2.f12947f, dVar2.f12948g);
                } else {
                    p163q7.i iVar = new p163q7.i();
                    p085i7.g gVar = new p085i7.g(new p085i7.f(applicationContext, fVar, new p094j7.a[]{new p094j7.a(i16, i15, i15), new p094j7.a(i15, i14, i13), new p094j7.a(i14, i12, i12), new p094j7.a(i12, i13, i16), new p094j7.a(i13, i11, i10), new p094j7.a(i11, 7, 3)}, new p112l7.j(), new k(applicationContext, C3.b.u(applicationContext))));
                    p122m7.a aVar2 = new p122m7.a(gVar);
                    r rVar = new r(15);
                    Y1.c cVar3 = new Y1.c(aVar2);
                    Handler handler = p112l7.e.f12951c;
                    V3.b bVar = new V3.b(cVar3, aVar2, handler);
                    cVar = new T3.c(cVar2, iVar, gVar, aVar2, cVar3, handler, rVar, bVar);
                    linkedHashMap.put("LibGlobalFetchLib", new p112l7.d(iVar, gVar, aVar2, cVar3, handler, rVar, bVar, (p143o7.a) cVar.a));
                }
                ((p163q7.i) cVar.f4659d).c();
            } catch (Throwable th) {
                throw th;
            }
        }
        h7.c cVar4 = (h7.c) cVar.f4658c;
        return new C0343a(cVar4, (p163q7.i) cVar.f4659d, (Handler) cVar.f4661f, (p112l7.a) cVar.f4657b, cVar4.f11760c, (V3.b) cVar.f4662g, (p085i7.g) cVar.f4660e);
    }

    public static K j(int i10, int i11, Object[] objArr) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        C4.a.e(0, i10, objArr.length);
        C4.a.d(i11, i10);
        return i10 == 0 ? K.f231v : new K(i10, i11, objArr);
    }

    public static final String k(long j) {
        if (j < 0) {
            j = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("####.00");
        if (j < 1024) {
            return j + " bytes";
        }
        if (j < 1048576) {
            return decimalFormat.format(Float.valueOf(j / 1024.0f)) + " KB";
        }
        if (j < 1073741824) {
            return decimalFormat.format(Float.valueOf((j / 1024.0f) / 1024.0f)) + " MB";
        }
        return decimalFormat.format(Float.valueOf(((j / 1024.0f) / 1024.0f) / 1024.0f)) + " GB";
    }

    public static Set l() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final int m(Context context, int i10) {
        p210v8.i.f(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{i10});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static String n(G9.e eVar, W8.f fVar) {
        if (eVar.a(fVar)) {
            return null;
        }
        return eVar.getDescription();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0033  */
    public static boolean o(X9.L l4, G g8) {
        p210v8.i.f(g8, "request");
        int i10 = l4.f5534v;
        if (i10 != 200 && i10 != 410 && i10 != 414 && i10 != 501 && i10 != 203 && i10 != 204) {
            if (i10 == 307) {
                if (X9.L.b(l4, "Expires") == null && l4.a().f5588c == -1 && !l4.a().f5591f && !l4.a().f5590e) {
                    return false;
                }
            } else if (i10 != 308 && i10 != 404 && i10 != 405) {
                switch (i10) {
                    case 300:
                    case 301:
                        break;
                    case 302:
                        if (X9.L.b(l4, "Expires") == null) {
                            return false;
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        if (l4.a().f5587b) {
            return false;
        }
        C0462h c0462hJ = g8.f5509f;
        if (c0462hJ == null) {
            int i11 = C0462h.f5586n;
            c0462hJ = com.bumptech.glide.c.j(g8.f5506c);
            g8.f5509f = c0462hJ;
        }
        return !c0462hJ.f5587b;
    }

    public static boolean p(int i10, Rect rect, Rect rect2) {
        if (i10 == 17) {
            int i11 = rect.right;
            int i12 = rect2.right;
            return (i11 > i12 || rect.left >= i12) && rect.left > rect2.left;
        }
        if (i10 == 33) {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            return (i13 > i14 || rect.top >= i14) && rect.top > rect2.top;
        }
        if (i10 == 66) {
            int i15 = rect.left;
            int i16 = rect2.left;
            return (i15 < i16 || rect.right <= i16) && rect.right < rect2.right;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        return (i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom;
    }

    public static boolean q(char c10) {
        return Character.isWhitespace(c10) || Character.isSpaceChar(c10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static p076h8.d r(p076h8.e eVar, p200u8.a aVar) {
        int iOrdinal = eVar.ordinal();
        if (iOrdinal == 0) {
            return new p076h8.j(aVar);
        }
        l lVar = l.a;
        if (iOrdinal == 1) {
            p076h8.i iVar = new p076h8.i();
            iVar.f11794s = (p210v8.k) aVar;
            iVar.f11795t = lVar;
            return iVar;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        n nVar = new n();
        nVar.f11802s = (p210v8.k) aVar;
        nVar.f11803t = lVar;
        return nVar;
    }

    public static p076h8.j s(p200u8.a aVar) {
        p210v8.i.f(aVar, "initializer");
        return new p076h8.j(aVar);
    }

    public static final void t(ImageView imageView, Object obj) {
        p210v8.i.f(imageView, "<this>");
        try {
            com.bumptech.glide.l lVarF = com.bumptech.glide.b.f(imageView);
            lVarF.getClass();
            com.bumptech.glide.j jVar = (com.bumptech.glide.j) new com.bumptech.glide.j(lVarF.f7632s, lVarF, Drawable.class, lVarF.f7633t).A(obj).e(p.f162e);
            J1.b bVar = new J1.b();
            bVar.f7670s = new P0.d(5, false);
            jVar.B(bVar).y(imageView);
        } catch (Exception unused) {
        }
    }

    public static int u(int i10, Rect rect, Rect rect2) {
        int i11;
        int i12;
        if (i10 == 17) {
            i11 = rect.left;
            i12 = rect2.right;
        } else if (i10 == 33) {
            i11 = rect.top;
            i12 = rect2.bottom;
        } else if (i10 == 66) {
            i11 = rect2.left;
            i12 = rect.right;
        } else {
            if (i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i11 = rect2.top;
            i12 = rect.bottom;
        }
        return Math.max(0, i11 - i12);
    }

    public static z3.d v(z3.d dVar) {
        if ((dVar instanceof z3.g) || (dVar instanceof z3.e)) {
            return dVar;
        }
        if (dVar instanceof Serializable) {
            return new z3.e(dVar);
        }
        z3.g gVar = new z3.g();
        gVar.f16310s = dVar;
        return gVar;
    }

    public static int w(int i10, Rect rect, Rect rect2) {
        if (i10 != 17) {
            if (i10 != 33) {
                if (i10 != 66) {
                    if (i10 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public abstract void x();

    public abstract void y(int i10);

    public abstract void z(Typeface typeface, boolean z6);
}
