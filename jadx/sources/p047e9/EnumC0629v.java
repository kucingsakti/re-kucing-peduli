package p047e9;

import p104k9.o;

/* JADX INFO: renamed from: e9.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0629v implements o {
    TRUE(0),
    FALSE(1),
    NULL(2);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11200s;

    EnumC0629v(int i10) {
        this.f11200s = i10;
    }

    @Override // p104k9.o
    public final int getNumber() {
        return this.f11200s;
    }
}
