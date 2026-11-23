package P3;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class e implements j {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final p053f4.e f3874u = new p053f4.e(10);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f3875s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f3876t;

    public e(T3.c cVar) {
        this.f3875s = cVar;
        this.f3876t = f3874u;
    }

    @Override // P3.j
    public void e(i iVar, int i10) throws IOException {
        int[] iArr = (int[]) this.f3876t;
        try {
            iVar.read((byte[]) this.f3875s, iArr[0], i10);
            iArr[0] = iArr[0] + i10;
        } finally {
            iVar.close();
        }
    }

    public e(byte[] bArr, int[] iArr) {
        this.f3875s = bArr;
        this.f3876t = iArr;
    }
}
