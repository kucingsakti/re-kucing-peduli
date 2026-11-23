package L4;

import N9.InterfaceC0341y;
import java.io.File;
import p076h8.m;
import p144o8.g;

/* JADX INFO: loaded from: classes.dex */
public final class c extends g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ a f2783s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ File f2784t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, File file, p123m8.d dVar) {
        super(2, dVar);
        this.f2783s = aVar;
        this.f2784t = file;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new c(this.f2783s, this.f2784t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        c cVar = (c) create((InterfaceC0341y) obj, (p123m8.d) obj2);
        m mVar = m.a;
        cVar.invokeSuspend(mVar);
        return mVar;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        J7.a.v(obj);
        this.f2783s.i(this.f2784t);
        return m.a;
    }
}
