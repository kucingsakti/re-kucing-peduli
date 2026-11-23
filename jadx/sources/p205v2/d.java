package p205v2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f15413d;

    public d(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f15413d = bArr;
    }

    @Override // p205v2.c
    public final byte[] i0() {
        return this.f15413d;
    }
}
