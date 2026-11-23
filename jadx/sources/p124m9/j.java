package p124m9;

import L8.InterfaceC0269c;
import p076h8.m;
import p200u8.b;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class j implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f13170s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0269c f13171t;

    public j(m mVar, InterfaceC0269c interfaceC0269c) {
        this.f13170s = mVar;
        this.f13171t = interfaceC0269c;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        InterfaceC0269c interfaceC0269c = (InterfaceC0269c) obj;
        m mVar = this.f13170s;
        InterfaceC0269c interfaceC0269c2 = this.f13171t;
        i.f(interfaceC0269c, "second");
        mVar.d(interfaceC0269c2, interfaceC0269c);
        return m.a;
    }
}
