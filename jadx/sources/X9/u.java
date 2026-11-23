package X9;

import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes.dex */
public final class u extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f5642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ p210v8.k f5643t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u(p200u8.a aVar, int i10) {
        super(0);
        this.f5642s = i10;
        switch (i10) {
            case 1:
                this.f5643t = (p210v8.k) aVar;
                super(0);
                break;
            default:
                this.f5643t = (p210v8.k) aVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [u8.a, v8.k] */
    /* JADX WARN: Type inference failed for: r0v5, types: [u8.a, v8.k] */
    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f5642s) {
            case 0:
                try {
                    return (List) this.f5643t.invoke();
                } catch (SSLPeerUnverifiedException unused) {
                    return p086i8.s.f12328s;
                }
            default:
                return p086i8.k.w0((Iterable) this.f5643t.invoke());
        }
    }
}
