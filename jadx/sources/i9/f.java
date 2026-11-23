package i9;

import java.util.Arrays;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p067g9.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f12337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f12338h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12339f;

    static {
        f fVar = new f(new int[]{1, 8, 0}, false);
        f12337g = fVar;
        int i10 = fVar.f11544c;
        int i11 = fVar.f11543b;
        f12338h = (i11 == 1 && i10 == 9) ? new f(new int[]{2, 0, 0}, false) : new f(new int[]{i11, i10 + 1, 0}, false);
        new f(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int[] iArr, boolean z6) {
        super(Arrays.copyOf(iArr, iArr.length));
        i.f(iArr, "versionArray");
        this.f12339f = z6;
    }

    public final boolean b(f fVar) {
        i.f(fVar, "metadataVersionFromLanguageVersion");
        f fVar2 = f12337g;
        int i10 = this.f11543b;
        int i11 = this.f11544c;
        if (i10 == 2 && i11 == 0 && fVar2.f11543b == 1 && fVar2.f11544c == 8) {
            return true;
        }
        if (!this.f12339f) {
            fVar2 = f12338h;
        }
        fVar2.getClass();
        int i12 = fVar.f11543b;
        int i13 = fVar2.f11543b;
        if (i13 > i12 || (i13 >= i12 && fVar2.f11544c > fVar.f11544c)) {
            fVar = fVar2;
        }
        boolean z6 = false;
        if ((i10 == 1 && i11 == 0) || i10 == 0) {
            return false;
        }
        int i14 = fVar.f11543b;
        if (i10 > i14 || (i10 >= i14 && i11 > fVar.f11544c)) {
            z6 = true;
        }
        return !z6;
    }
}
