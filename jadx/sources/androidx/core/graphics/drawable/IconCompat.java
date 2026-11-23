package androidx.core.graphics.drawable;

import M.c;
import M.e;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f6341k = PorterDuff.Mode.SRC_IN;
    public int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f6342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f6343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f6344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f6345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f6347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f6348h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f6349i;
    public String j;

    public IconCompat() {
        this.a = -1;
        this.f6343c = null;
        this.f6344d = null;
        this.f6345e = 0;
        this.f6346f = 0;
        this.f6347g = null;
        this.f6348h = f6341k;
        this.f6349i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z6) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f10 = iMin;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z6) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f6345e = i10;
        iconCompat.f6342b = "";
        iconCompat.j = "";
        return iconCompat;
    }

    public final int c() {
        int i10 = this.a;
        if (i10 != -1) {
            if (i10 == 2) {
                return this.f6345e;
            }
            throw new IllegalStateException("called getResId() on " + this);
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f6342b;
        if (i11 >= 28) {
            return e.a(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return 0;
        }
    }

    public final int d() {
        int i10 = this.a;
        if (i10 != -1) {
            return i10;
        }
        int i11 = Build.VERSION.SDK_INT;
        Object obj = this.f6342b;
        if (i11 >= 28) {
            return e.c(obj);
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException unused) {
            Objects.toString(obj);
            return -1;
        } catch (NoSuchMethodException unused2) {
            Objects.toString(obj);
            return -1;
        } catch (InvocationTargetException unused3) {
            Objects.toString(obj);
            return -1;
        }
    }

    public final Uri e() {
        int i10 = this.a;
        if (i10 == -1) {
            return c.a(this.f6342b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f6342b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public final String toString() {
        String str;
        if (this.a == -1) {
            return String.valueOf(this.f6342b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f6342b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f6342b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f6345e);
                if (this.f6346f != 0) {
                    sb.append(" off=");
                    sb.append(this.f6346f);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f6342b);
                break;
        }
        if (this.f6347g != null) {
            sb.append(" tint=");
            sb.append(this.f6347g);
        }
        if (this.f6348h != f6341k) {
            sb.append(" mode=");
            sb.append(this.f6348h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i10) {
        this.f6343c = null;
        this.f6344d = null;
        this.f6345e = 0;
        this.f6346f = 0;
        this.f6347g = null;
        this.f6348h = f6341k;
        this.f6349i = null;
        this.a = i10;
    }
}
