package p124m9;

import L8.InterfaceC0268b;
import L8.InterfaceC0276j;
import p200u8.c;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0268b f13165s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0268b f13166t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC0268b interfaceC0268b, InterfaceC0268b interfaceC0268b2) {
        super(2);
        this.f13165s = interfaceC0268b;
        this.f13166t = interfaceC0268b2;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return Boolean.valueOf(i.a((InterfaceC0276j) obj, this.f13165s) && i.a((InterfaceC0276j) obj2, this.f13166t));
    }
}
