package R8;

import C8.InterfaceC0177e;
import java.lang.reflect.Member;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k extends p210v8.g implements p200u8.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final k f4471A = new k(1);

    @Override // p210v8.b
    public final InterfaceC0177e d() {
        return p210v8.u.a.b(Member.class);
    }

    @Override // p210v8.b
    public final String g() {
        return "isSynthetic()Z";
    }

    @Override // p210v8.b, C8.InterfaceC0174b
    public final String getName() {
        return "isSynthetic";
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        Member member = (Member) obj;
        p210v8.i.f(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }
}
