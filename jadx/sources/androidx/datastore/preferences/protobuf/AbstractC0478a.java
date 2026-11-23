package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0478a {
    protected int memoizedHashCode;

    public abstract int a();

    public final int b(InterfaceC0481b0 interfaceC0481b0) {
        AbstractC0502w abstractC0502w = (AbstractC0502w) this;
        int i10 = abstractC0502w.memoizedSerializedSize;
        if (i10 != -1) {
            return i10;
        }
        int iE = interfaceC0481b0.e(this);
        abstractC0502w.memoizedSerializedSize = iE;
        return iE;
    }

    public abstract void c(C0491k c0491k);
}
