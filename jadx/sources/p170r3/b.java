package p170r3;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {
    public final c a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14466b;

    public b(float f10, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).a;
            f10 += ((b) cVar).f14466b;
        }
        this.a = cVar;
        this.f14466b = f10;
    }

    @Override // p170r3.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.f14466b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.f14466b == bVar.f14466b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.f14466b)});
    }
}
