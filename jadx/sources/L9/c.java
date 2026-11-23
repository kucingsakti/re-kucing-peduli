package L9;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c implements K9.l {
    public final CharSequence a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p210v8.k f2852c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(CharSequence charSequence, int i10, p200u8.c cVar) {
        p210v8.i.f(charSequence, "input");
        this.a = charSequence;
        this.f2851b = i10;
        this.f2852c = (p210v8.k) cVar;
    }

    @Override // K9.l
    public final Iterator iterator() {
        return new b(this);
    }
}
