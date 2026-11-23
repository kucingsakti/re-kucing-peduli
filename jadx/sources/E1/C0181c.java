package E1;

import java.io.File;

/* JADX INFO: renamed from: E1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0181c implements r {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1301b;

    public /* synthetic */ C0181c(Object obj, int i10) {
        this.a = i10;
        this.f1301b = obj;
    }

    @Override // E1.r
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // E1.r
    public final q b(Object obj, int i10, int i11, p232y1.h hVar) {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new q(new T1.b(bArr), new m(bArr, 1, (B) this.f1301b));
            case 1:
                return new q(new T1.b(obj), new C0183e(0, obj.toString(), (B) this.f1301b));
            default:
                File file = (File) obj;
                return new q(new T1.b(file), new C0183e(1, file, (B) this.f1301b));
        }
    }
}
