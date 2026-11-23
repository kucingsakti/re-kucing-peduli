package K;

import J0.M;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final ThreadLocal a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f2501b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2502c = new Object();

    public static void a(l lVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f2502c) {
            try {
                WeakHashMap weakHashMap = f2501b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(lVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(lVar, sparseArray);
                }
                sparseArray.append(i10, new k(colorStateList, lVar.a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface b(Context context, int i10, TypedValue typedValue, int i11, b bVar, boolean z6, boolean z10) {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i10) + "\" (" + Integer.toHexString(i10) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        Typeface typefaceA = null;
        if (string.startsWith("res/")) {
            int i12 = typedValue.assetCookie;
            M m2 = L.g.f2716b;
            Typeface typeface = (Typeface) m2.g(L.g.b(resources, i10, string, i12, i11));
            if (typeface != null) {
                if (bVar != null) {
                    new Handler(Looper.getMainLooper()).post(new D4.a(bVar, 6, typeface));
                }
                typefaceA = typeface;
            } else if (!z10) {
                try {
                    if (string.toLowerCase().endsWith(".xml")) {
                        e eVarK = b.k(resources.getXml(i10), resources);
                        if (eVarK != null) {
                            typefaceA = L.g.a(context, eVarK, resources, i10, string, typedValue.assetCookie, i11, bVar, z6);
                        } else if (bVar != null) {
                            bVar.a(-3);
                        }
                    } else {
                        int i13 = typedValue.assetCookie;
                        Typeface typefaceL = L.g.a.l(context, resources, i10, string, i11);
                        if (typefaceL != null) {
                            m2.k(L.g.b(resources, i10, string, i13, i11), typefaceL);
                        }
                        if (bVar != null) {
                            if (typefaceL != null) {
                                new Handler(Looper.getMainLooper()).post(new D4.a(bVar, 6, typefaceL));
                            } else {
                                bVar.a(-3);
                            }
                        }
                        typefaceA = typefaceL;
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (bVar != null) {
                        bVar.a(-3);
                    }
                }
            }
        } else if (bVar != null) {
            bVar.a(-3);
        }
        if (typefaceA != null || bVar != null || z10) {
            return typefaceA;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
    }
}
