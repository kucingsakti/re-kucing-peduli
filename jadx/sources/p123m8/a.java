package p123m8;

import com.bumptech.glide.e;
import p200u8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements g {
    private final h key;

    public a(h hVar) {
        i.f(hVar, "key");
        this.key = hVar;
    }

    @Override // p123m8.i
    public <R> R fold(R r10, c cVar) {
        i.f(cVar, "operation");
        return (R) cVar.invoke(r10, this);
    }

    @Override // p123m8.i
    public <E extends g> E get(h hVar) {
        return (E) e.g(this, hVar);
    }

    @Override // p123m8.g
    public h getKey() {
        return this.key;
    }

    @Override // p123m8.i
    public i minusKey(h hVar) {
        return e.j(this, hVar);
    }

    @Override // p123m8.i
    public i plus(i iVar) {
        return e.l(this, iVar);
    }
}
