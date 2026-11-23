package K4;

import N9.AbstractC0342z;
import N9.InterfaceC0341y;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p144o8.g implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ File f2599t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(File file, p123m8.d dVar) {
        super(2, dVar);
        this.f2599t = file;
    }

    @Override // p144o8.a
    public final p123m8.d create(Object obj, p123m8.d dVar) {
        return new i(this.f2599t, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((InterfaceC0341y) obj, (p123m8.d) obj2)).invokeSuspend(p076h8.m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        p134n8.a aVar = p134n8.a.f13404s;
        int i10 = this.f2598s;
        if (i10 == 0) {
            J7.a.v(obj);
            this.f2598s = 1;
            if (AbstractC0342z.e(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            J7.a.v(obj);
        }
        File file = this.f2599t;
        if (file.exists()) {
            file.deleteOnExit();
            Ha.a.a.getClass();
            za.c.k(new Object[0]);
        } else {
            Ha.a.a.getClass();
            za.c.k(new Object[0]);
        }
        return p076h8.m.a;
    }
}
