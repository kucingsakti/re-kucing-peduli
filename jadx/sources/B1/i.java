package B1;

import U1.n;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i implements b {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Bitmap.Config f589x = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final m f590s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Set f591t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final za.c f592u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f593v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f594w;

    public i(long j) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f593v = j;
        this.f590s = mVar;
        this.f591t = setUnmodifiableSet;
        this.f592u = new za.c(1);
    }

    public final synchronized Bitmap a(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.f590s.b(i10, i11, config != null ? config : f589x);
            if (bitmapB != null) {
                long j = this.f594w;
                this.f590s.getClass();
                this.f594w = j - ((long) n.c(bitmapB));
                this.f592u.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.f590s.getClass();
                m.c(n.d(config) * i10 * i11, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f590s.getClass();
                m.c(n.d(config) * i10 * i11, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.f590s);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    public final synchronized void b(long j) {
        while (this.f594w > j) {
            try {
                m mVar = this.f590s;
                Bitmap bitmap = (Bitmap) mVar.f602b.w();
                if (bitmap != null) {
                    mVar.a(Integer.valueOf(n.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        Objects.toString(this.f590s);
                    }
                    this.f594w = 0L;
                    return;
                }
                this.f592u.getClass();
                long j10 = this.f594w;
                this.f590s.getClass();
                this.f594w = j10 - ((long) n.c(bitmap));
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.f590s.getClass();
                    m.c(n.c(bitmap), bitmap.getConfig());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Objects.toString(this.f590s);
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // B1.b
    public final Bitmap c(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapA = a(i10, i11, config);
        if (bitmapA != null) {
            return bitmapA;
        }
        if (config == null) {
            config = f589x;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // B1.b
    public final Bitmap f(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapA = a(i10, i11, config);
        if (bitmapA != null) {
            bitmapA.eraseColor(0);
            return bitmapA;
        }
        if (config == null) {
            config = f589x;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    @Override // B1.b
    public final synchronized void h(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.f590s.getClass();
                if (n.c(bitmap) <= this.f593v && this.f591t.contains(bitmap.getConfig())) {
                    this.f590s.getClass();
                    int iC = n.c(bitmap);
                    this.f590s.e(bitmap);
                    this.f592u.getClass();
                    this.f594w += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.f590s.getClass();
                        m.c(n.c(bitmap), bitmap.getConfig());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.f590s);
                    }
                    b(this.f593v);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.f590s.getClass();
                m.c(n.c(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.f591t.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // B1.b
    public final void l(int i10) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i10 >= 40 || i10 >= 20) {
            o();
        } else if (i10 >= 20 || i10 == 15) {
            b(this.f593v / 2);
        }
    }

    @Override // B1.b
    public final void o() {
        Log.isLoggable("LruBitmapPool", 3);
        b(0L);
    }
}
