package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: p.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0696c0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f14046l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f14047m = new ConcurrentHashMap();
    public int a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14048b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f14049c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14050d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14051e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f14052f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f14053g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f14054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f14055i;
    public final Context j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Z f14056k;

    public C0696c0(TextView textView) {
        this.f14055i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f14056k = new C0692a0();
        } else {
            this.f14056k = new Z();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f14047m;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public static Object e(String str, Object obj, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e10) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f14048b) {
                if (this.f14055i.getMeasuredHeight() <= 0 || this.f14055i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f14056k.b(this.f14055i) ? 1048576 : (this.f14055i.getMeasuredWidth() - this.f14055i.getTotalPaddingLeft()) - this.f14055i.getTotalPaddingRight();
                int height = (this.f14055i.getHeight() - this.f14055i.getCompoundPaddingBottom()) - this.f14055i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f14046l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fC = c(rectF);
                        if (fC != this.f14055i.getTextSize()) {
                            g(0, fC);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f14048b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f14052f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = length - 1;
        int i11 = 0;
        int i12 = 1;
        while (i12 <= i10) {
            int i13 = (i12 + i10) / 2;
            int i14 = this.f14052f[i13];
            TextView textView = this.f14055i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f14054h;
            if (textPaint == null) {
                this.f14054h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f14054h.set(textView.getPaint());
            this.f14054h.setTextSize(i14);
            StaticLayout staticLayoutA = Y.a(charSequence, (Layout.Alignment) e("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f14055i, this.f14054h, this.f14056k);
            if ((maxLines == -1 || (staticLayoutA.getLineCount() <= maxLines && staticLayoutA.getLineEnd(staticLayoutA.getLineCount() - 1) == charSequence.length())) && staticLayoutA.getHeight() <= rectF.bottom) {
                int i15 = i13 + 1;
                i11 = i12;
                i12 = i15;
            } else {
                i11 = i13 - 1;
                i10 = i11;
            }
        }
        return this.f14052f[i11];
    }

    public final boolean f() {
        return j() && this.a != 0;
    }

    public final void g(int i10, float f10) {
        Context context = this.j;
        float fApplyDimension = TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f14055i;
        if (fApplyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f14048b = false;
                try {
                    Method methodD = d("nullLayouts");
                    if (methodD != null) {
                        methodD.invoke(textView, new Object[0]);
                    }
                } catch (Exception e10) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.a == 1) {
            if (!this.f14053g || this.f14052f.length == 0) {
                int iFloor = ((int) Math.floor((this.f14051e - this.f14050d) / this.f14049c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round((i10 * this.f14049c) + this.f14050d);
                }
                this.f14052f = b(iArr);
            }
            this.f14048b = true;
        } else {
            this.f14048b = false;
        }
        return this.f14048b;
    }

    public final boolean i() {
        int[] iArr = this.f14052f;
        int length = iArr.length;
        boolean z6 = length > 0;
        this.f14053g = z6;
        if (z6) {
            this.a = 1;
            this.f14050d = iArr[0];
            this.f14051e = iArr[length - 1];
            this.f14049c = -1.0f;
        }
        return z6;
    }

    public final boolean j() {
        return !(this.f14055i instanceof C0728t);
    }

    public final void k(float f10, float f11, float f12) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.a = 1;
        this.f14050d = f10;
        this.f14051e = f11;
        this.f14049c = f12;
        this.f14053g = false;
    }
}
