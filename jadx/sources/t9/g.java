package t9;

import L8.InterfaceC0269c;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g extends p124m9.m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f15247c;

    public g(ArrayList arrayList, h hVar) {
        this.f15246b = arrayList;
        this.f15247c = hVar;
    }

    @Override // p124m9.m
    public final void b(InterfaceC0269c interfaceC0269c) {
        p210v8.i.f(interfaceC0269c, "fakeOverride");
        p124m9.l.r(interfaceC0269c, null);
        this.f15246b.add(interfaceC0269c);
    }

    @Override // p124m9.m
    public final void d(InterfaceC0269c interfaceC0269c, InterfaceC0269c interfaceC0269c2) {
        p210v8.i.f(interfaceC0269c2, "fromCurrent");
        throw new IllegalStateException(("Conflict in scope of " + this.f15247c.f15249b + ": " + interfaceC0269c + " vs " + interfaceC0269c2).toString());
    }
}
