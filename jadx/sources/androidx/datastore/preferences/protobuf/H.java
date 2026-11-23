package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class H implements O {
    public O[] a;

    @Override // androidx.datastore.preferences.protobuf.O
    public final Z a(Class cls) {
        for (O o10 : this.a) {
            if (o10.b(cls)) {
                return o10.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // androidx.datastore.preferences.protobuf.O
    public final boolean b(Class cls) {
        for (O o10 : this.a) {
            if (o10.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
