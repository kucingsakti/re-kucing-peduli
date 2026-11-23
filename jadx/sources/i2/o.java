package i2;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o implements p051f2.f {
    public final Set a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f12191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f12192c;

    public o(Set set, i iVar, p pVar) {
        this.a = set;
        this.f12191b = iVar;
        this.f12192c = pVar;
    }

    public final Fa.e a(String str, p051f2.c cVar, p051f2.e eVar) {
        Set set = this.a;
        if (set.contains(cVar)) {
            return new Fa.e(this.f12191b, str, cVar, eVar, this.f12192c, 13);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", cVar, set));
    }
}
