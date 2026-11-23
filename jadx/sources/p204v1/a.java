package p204v1;

import androidx.lifecycle.EnumC0518m;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC0518m.values().length];
        a = iArr;
        try {
            iArr[EnumC0518m.ON_PAUSE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC0518m.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
