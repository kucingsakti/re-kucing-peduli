package p047e9;

import p104k9.o;

/* JADX INFO: renamed from: e9.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0625q implements o {
    AT_MOST_ONCE(0),
    EXACTLY_ONCE(1),
    AT_LEAST_ONCE(2);


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f11168s;

    EnumC0625q(int i10) {
        this.f11168s = i10;
    }

    @Override // p104k9.o
    public final int getNumber() {
        return this.f11168s;
    }
}
