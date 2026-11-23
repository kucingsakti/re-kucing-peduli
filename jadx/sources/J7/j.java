package J7;

import A9.A;
import I.D;
import L8.AbstractC0281o;
import L8.C0280n;
import L8.InterfaceC0272f;
import L8.e0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.TextView;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import p.X;
import p047e9.EnumC0633z;
import p047e9.f0;
import p140o4.C0690d;
import p220w9.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static volatile N7.b a;

    public static int C(Context context, int i10, int i11) {
        TypedValue typedValueB = C4.a.B(context, i10);
        return (typedValueB == null || typedValueB.type != 16) ? i11 : typedValueB.data;
    }

    public static TimeInterpolator D(Context context, int i10, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!r(strValueOf, "cubic-bezier") && !r(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!r(strValueOf, "cubic-bezier")) {
            if (r(strValueOf, "path")) {
                return W.a.c(C3.b.l(strValueOf.substring(5, strValueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return W.a.b(l(strArrSplit, 0), l(strArrSplit, 1), l(strArrSplit, 2), l(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }

    public static void I(TextView textView, int i10) {
        xa.d.c(i10);
        if (Build.VERSION.SDK_INT >= 28) {
            p000a0.n.d(textView, i10);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), i10 + i11, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void N(TextView textView, int i10) {
        xa.d.c(i10);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i10 > Math.abs(i11)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i10 - i11);
        }
    }

    public static void O(TextView textView, int i10) {
        xa.d.c(i10);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i10 != fontMetricsInt) {
            textView.setLineSpacing(i10 - fontMetricsInt, 1.0f);
        }
    }

    public static void Q(Drawable drawable, int i10) {
        M.a.g(drawable, i10);
    }

    public static byte[] W(C0690d c0690d) throws IOException {
        ArrayDeque arrayDeque = new ArrayDeque(20);
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(0) * 2));
        int i10 = 0;
        while (i10 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i10);
            byte[] bArr = new byte[iMin2];
            arrayDeque.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = c0690d.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return g(arrayDeque, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            long j = ((long) iMin) * ((long) (iMin < 4096 ? 4 : 2));
            if (j > 2147483647L) {
                iMin = Integer.MAX_VALUE;
            } else {
                iMin = j < -2147483648L ? Integer.MIN_VALUE : (int) j;
            }
        }
        if (c0690d.read() == -1) {
            return g(arrayDeque, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    public static final String X(String str) {
        p210v8.i.f(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        p210v8.i.e(string, "builder.toString()");
        return string;
    }

    public static ActionMode.Callback Y(ActionMode.Callback callback) {
        return (!(callback instanceof p000a0.p) || Build.VERSION.SDK_INT < 26) ? callback : ((p000a0.p) callback).a;
    }

    public static ActionMode.Callback Z(ActionMode.Callback callback, TextView textView) {
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || i10 > 27 || (callback instanceof p000a0.p) || callback == null) ? callback : new p000a0.p(callback, textView);
    }

    public static n a(Callable callable) {
        try {
            Object objCall = callable.call();
            P7.a.a(objCall, "Scheduler Callable result can't be null");
            return (n) objCall;
        } catch (Throwable th) {
            throw p028c8.c.a(th);
        }
    }

    public static final String b(String str) {
        char cCharAt;
        p210v8.i.f(str, "<this>");
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        char upperCase = Character.toUpperCase(cCharAt);
        String strSubstring = str.substring(1);
        p210v8.i.e(strSubstring, "this as java.lang.String).substring(startIndex)");
        return upperCase + strSubstring;
    }

    public static void c(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(AbstractC0487g.g(i11, "at index "));
            }
        }
    }

    public static Fa.e d(Fa.e eVar, InterfaceC0272f interfaceC0272f, R8.n nVar, int i10) {
        if ((i10 & 2) != 0) {
            nVar = null;
        }
        p210v8.i.f(eVar, "<this>");
        return new Fa.e((I4.a) eVar.f1659t, nVar != null ? new D(eVar, interfaceC0272f, nVar, 0) : (X8.d) eVar.f1660u, D3.b.r(p076h8.e.f11787t, new A(eVar, 24, interfaceC0272f)));
    }

    public static byte[] g(ArrayDeque arrayDeque, int i10) {
        if (arrayDeque.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) arrayDeque.remove();
        if (bArr.length == i10) {
            return bArr;
        }
        int length = i10 - bArr.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
        while (length > 0) {
            byte[] bArr2 = (byte[]) arrayDeque.remove();
            int iMin = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    public static final Fa.e h(Fa.e eVar, M8.h hVar) {
        p210v8.i.f(eVar, "<this>");
        p210v8.i.f(hVar, "additionalAnnotations");
        if (hVar.isEmpty()) {
            return eVar;
        }
        return new Fa.e((I4.a) eVar.f1659t, (X8.d) eVar.f1660u, D3.b.r(p076h8.e.f11787t, new A(eVar, 25, hVar)));
    }

    public static final C0280n i(f0 f0Var) {
        switch (f0Var == null ? -1 : u.f15692b[f0Var.ordinal()]) {
            case 1:
                C0280n c0280n = AbstractC0281o.f2821d;
                p210v8.i.e(c0280n, "INTERNAL");
                return c0280n;
            case 2:
                C0280n c0280n2 = AbstractC0281o.a;
                p210v8.i.e(c0280n2, "PRIVATE");
                return c0280n2;
            case 3:
                C0280n c0280n3 = AbstractC0281o.f2819b;
                p210v8.i.e(c0280n3, "PRIVATE_TO_THIS");
                return c0280n3;
            case 4:
                C0280n c0280n4 = AbstractC0281o.f2820c;
                p210v8.i.e(c0280n4, "PROTECTED");
                return c0280n4;
            case 5:
                C0280n c0280n5 = AbstractC0281o.f2822e;
                p210v8.i.e(c0280n5, "PUBLIC");
                return c0280n5;
            case 6:
                C0280n c0280n6 = AbstractC0281o.f2823f;
                p210v8.i.e(c0280n6, "LOCAL");
                return c0280n6;
            default:
                C0280n c0280n7 = AbstractC0281o.a;
                p210v8.i.e(c0280n7, "PRIVATE");
                return c0280n7;
        }
    }

    public static float l(String[] strArr, int i10) {
        float f10 = Float.parseFloat(strArr[i10]);
        if (f10 >= 0.0f && f10 <= 1.0f) {
            return f10;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f10);
    }

    public static S.h m(X x8) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return new S.h(p000a0.n.c(x8));
        }
        TextPaint textPaint = new TextPaint(x8.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int iA = p000a0.l.a(x8);
        int iD = p000a0.l.d(x8);
        if (x8.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i10 < 28 || (x8.getInputType() & 15) != 3) {
            boolean z6 = x8.getLayoutDirection() == 1;
            switch (x8.getTextDirection()) {
                case 2:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case 3:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case 4:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case 5:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case 6:
                    break;
                case 7:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z6) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(p000a0.n.b(p000a0.m.a(x8.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new S.h(textPaint, textDirectionHeuristic, iA, iD);
    }

    public static final Object o(p247z9.m mVar, C8.u uVar) {
        p210v8.i.f(mVar, "<this>");
        p210v8.i.f(uVar, R5.a.PUSH_MINIFIED_BUTTON_ICON);
        return mVar.invoke();
    }

    public static boolean r(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final boolean s(int i10, String str) {
        char cCharAt = str.charAt(i10);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static String t(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static final int u(EnumC0633z enumC0633z) {
        int i10 = enumC0633z == null ? -1 : u.a[enumC0633z.ordinal()];
        if (i10 != 1) {
            int i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 4;
                    if (i10 != 4) {
                    }
                }
            }
            return i11;
        }
        return 1;
    }

    public static String v(String str) {
        return t(str).trim();
    }

    public static void y(Throwable th) {
        N7.b bVar = a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new UndeliverableException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        if (bVar != null) {
            try {
                bVar.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
            }
        }
        th.printStackTrace();
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public boolean A(KeyEvent keyEvent) {
        return false;
    }

    public boolean B() {
        return false;
    }

    public abstract void F(boolean z6);

    public abstract void G(boolean z6);

    public abstract void H(boolean z6);

    public abstract void J(int i10);

    public abstract void K(int i10);

    public abstract void L(Drawable drawable);

    public abstract void M();

    public abstract void P(boolean z6);

    public abstract void R(CharSequence charSequence);

    public abstract void S(CharSequence charSequence);

    public e0 T(o1.k kVar) {
        return null;
    }

    public void U(k kVar) {
        try {
            V(kVar);
        } catch (NullPointerException e10) {
            throw e10;
        } catch (Throwable th) {
            p068ga.l.n(th);
            y(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void V(k kVar);

    public boolean e() {
        return false;
    }

    public abstract boolean f();

    public abstract void j(boolean z6);

    public abstract int k();

    public abstract Context n();

    public boolean p() {
        return false;
    }

    public abstract boolean q();

    public abstract void w();

    public abstract boolean z(int i10, KeyEvent keyEvent);

    public void x() {
    }

    public void E(boolean z6) {
    }
}
