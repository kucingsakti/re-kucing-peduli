package p047e9;

import p104k9.o;

/* JADX INFO: renamed from: e9.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0617i implements o {
    CLASS(0),
    INTERFACE(1),
    ENUM_CLASS(2),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM_ENTRY(3),
    ANNOTATION_CLASS(4),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(5),
    COMPANION_OBJECT(6);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11097s;

    EnumC0617i(int i10) {
        this.f11097s = i10;
    }

    @Override // p104k9.o
    public final int getNumber() {
        return this.f11097s;
    }
}
