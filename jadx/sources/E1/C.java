package E1;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class C implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C f1293b = new C(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C(int i10) {
        this.a = i10;
    }

    @Override // E1.r
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // E1.r
    public final q b(Object obj, int i10, int i11, p232y1.h hVar) {
        switch (this.a) {
            case 0:
                return new q(new T1.b(obj), new C0182d(obj, 1));
            case 1:
                File file = (File) obj;
                return new q(new T1.b(file), new C0182d(file, 0));
            default:
                return null;
        }
    }
}
