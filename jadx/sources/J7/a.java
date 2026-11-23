package J7;

import A9.AbstractC0151y;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.P;
import U.h0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Typeface;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.widget.EdgeEffect;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.ferfalk.simplesearchview.SimpleSearchView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(StringBuilder sb, Object obj, p200u8.b bVar) {
        p210v8.i.f(sb, "<this>");
        if (bVar != null) {
            sb.append((CharSequence) bVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static int b(int i10) {
        if (i10 < 3) {
            if (i10 >= 0) {
                return i10 + 1;
            }
            throw new IllegalArgumentException(AbstractC0487g.g(i10, "expectedSize cannot be negative but was: "));
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(((double) i10) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static int c(int i10, int i11) {
        return L.a.d(i10, (Color.alpha(i10) * i11) / 255);
    }

    public static final p076h8.g d(Throwable th) {
        p210v8.i.f(th, "exception");
        return new p076h8.g(th);
    }

    public static final p096j9.b e(p067g9.f fVar, int i10) {
        p210v8.i.f(fVar, "<this>");
        return p096j9.b.e(fVar.n(i10), fVar.j(i10));
    }

    public static int f(Context context, int i10, int i11) {
        Integer numValueOf;
        TypedValue typedValueB = C4.a.B(context, i10);
        if (typedValueB != null) {
            int i12 = typedValueB.resourceId;
            numValueOf = Integer.valueOf(i12 != 0 ? J.b.a(context, i12) : typedValueB.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i11;
    }

    public static int g(View view, int i10) {
        Context context = view.getContext();
        TypedValue typedValueD = C4.a.D(i10, view.getContext(), view.getClass().getCanonicalName());
        int i11 = typedValueD.resourceId;
        return i11 != 0 ? J.b.a(context, i11) : typedValueD.data;
    }

    public static float h(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p000a0.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final p096j9.f i(p067g9.f fVar, int i10) {
        p210v8.i.f(fVar, "<this>");
        return p096j9.f.i(fVar.getString(i10));
    }

    public static int j(Point point, SimpleSearchView simpleSearchView) {
        ArrayList<Point> arrayList = new ArrayList();
        arrayList.add(new Point(simpleSearchView.getLeft(), simpleSearchView.getTop()));
        arrayList.add(new Point(simpleSearchView.getRight(), simpleSearchView.getTop()));
        arrayList.add(new Point(simpleSearchView.getLeft(), simpleSearchView.getBottom()));
        arrayList.add(new Point(simpleSearchView.getRight(), simpleSearchView.getBottom()));
        float f10 = 0.0f;
        for (Point point2 : arrayList) {
            float fSqrt = (float) Math.sqrt(Math.pow(point.y - point2.y, 2.0d) + Math.pow(point.x - point2.x, 2.0d));
            if (fSqrt > f10) {
                f10 = fSqrt;
            }
        }
        return (int) Math.ceil(f10);
    }

    public static int k(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 8) {
            return 3;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 32) {
            return 5;
        }
        if (i10 == 64) {
            return 6;
        }
        if (i10 == 128) {
            return 7;
        }
        if (i10 == 256) {
            return 8;
        }
        throw new IllegalArgumentException(AbstractC0487g.g(i10, "type needs to be >= FIRST and <= LAST, type="));
    }

    public static boolean l(int i10) {
        if (i10 == 0) {
            return false;
        }
        return ((double) 1) - (((((double) Color.blue(i10)) * 0.114d) + ((((double) Color.green(i10)) * 0.587d) + (((double) Color.red(i10)) * 0.299d))) / ((double) 255)) >= 0.5d;
    }

    public static boolean m(int i10) {
        if (i10 == 0) {
            return false;
        }
        ThreadLocal threadLocal = L.a.a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d3 = ((double) iRed) / 255.0d;
        double dPow = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d8 = ((double) iGreen) / 255.0d;
        double dPow2 = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        double d10 = ((double) iBlue) / 255.0d;
        double dPow3 = d10 < 0.04045d ? d10 / 12.92d : Math.pow((d10 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
        double d11 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
        dArr[1] = d11;
        dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
        return d11 / 100.0d > 0.5d;
    }

    public static int n(int i10, float f10, int i11) {
        return L.a.b(L.a.d(i11, Math.round(Color.alpha(i11) * f10)), i10);
    }

    public static Typeface o(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, p181s3.a.e(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static final int p(B8.c cVar) {
        p246z8.a aVar = p246z8.d.f16317s;
        if (cVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + cVar);
        }
        int i10 = cVar.f769s;
        int i11 = cVar.f770t;
        if (i11 < Integer.MAX_VALUE) {
            return p246z8.d.f16317s.c(i10, i11 + 1);
        }
        if (i10 <= Integer.MIN_VALUE) {
            return p246z8.d.f16317s.b();
        }
        return p246z8.d.f16317s.c(i10 - 1, i11) + 1;
    }

    public static float q(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return p000a0.e.c(edgeEffect, f10, f11);
        }
        p000a0.d.a(edgeEffect, f10, f11);
        return f10;
    }

    public static p116m0.b r(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i10 = byteBufferDuplicate.getShort() & 65535;
        if (i10 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                j = -1;
                break;
            }
            int i12 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i12) {
                break;
            }
            i11++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j10 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i13 = 0; i13 < j10; i13++) {
                int i14 = byteBufferDuplicate.getInt();
                long j11 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i14 || 1701669481 == i14) {
                    byteBufferDuplicate.position((int) (j11 + j));
                    p116m0.b bVar = new p116m0.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f4778v = byteBufferDuplicate;
                    bVar.f4775s = iPosition;
                    int i15 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f4776t = i15;
                    bVar.f4777u = ((ByteBuffer) bVar.f4778v).getShort(i15);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final boolean s(AbstractC0151y abstractC0151y) {
        InterfaceC0273g interfaceC0273gW = abstractC0151y.D().w();
        if (interfaceC0273gW != null && p124m9.g.b(interfaceC0273gW) && !p165q9.d.g((InterfaceC0271e) interfaceC0273gW).equals(I8.o.f2194g)) {
            return true;
        }
        InterfaceC0273g interfaceC0273gW2 = abstractC0151y.D().w();
        P p10 = interfaceC0273gW2 instanceof P ? (P) interfaceC0273gW2 : null;
        return p10 == null ? false : s(qa.b.n(p10));
    }

    public static final int t(Context context, int i10) {
        return context.getTheme().obtainStyledAttributes(new int[]{i10}).getColor(0, 0);
    }

    public static final void v(Object obj) {
        if (obj instanceof p076h8.g) {
            throw ((p076h8.g) obj).f11791s;
        }
    }

    public static ValueAnimator w(int i10, int i11, int i12, View view) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, i11);
        valueAnimatorOfInt.addUpdateListener(new X1.a(view, 0));
        valueAnimatorOfInt.addListener(new h0(view, (D3.b) null));
        valueAnimatorOfInt.setDuration(i12);
        valueAnimatorOfInt.setInterpolator(new p178s0.a(1));
        return valueAnimatorOfInt;
    }

    public abstract void u(b bVar);
}
