package p057f9;

import java.util.Arrays;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends p067g9.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f11443f = new a(1, 0, 7);

    static {
        new a(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        i.f(iArr, "numbers");
    }
}
