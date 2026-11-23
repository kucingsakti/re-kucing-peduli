package p095j8;

import U.E;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p210v8.i;
import p219w8.a;

/* JADX INFO: loaded from: classes.dex */
public final class c extends E implements Iterator, a {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f12518w;

    public c(e eVar, int i10) {
        this.f12518w = i10;
        i.f(eVar, "map");
        this.f4778v = eVar;
        this.f4776t = -1;
        this.f4777u = eVar.f12534z;
        f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f12518w) {
            case 0:
                b();
                int i10 = this.f4775s;
                e eVar = (e) this.f4778v;
                if (i10 >= eVar.f12532x) {
                    throw new NoSuchElementException();
                }
                this.f4775s = i10 + 1;
                this.f4776t = i10;
                d dVar = new d(eVar, i10);
                f();
                return dVar;
            case 1:
                b();
                int i11 = this.f4775s;
                e eVar2 = (e) this.f4778v;
                if (i11 >= eVar2.f12532x) {
                    throw new NoSuchElementException();
                }
                this.f4775s = i11 + 1;
                this.f4776t = i11;
                Object obj = eVar2.f12527s[i11];
                f();
                return obj;
            default:
                b();
                int i12 = this.f4775s;
                e eVar3 = (e) this.f4778v;
                if (i12 >= eVar3.f12532x) {
                    throw new NoSuchElementException();
                }
                this.f4775s = i12 + 1;
                this.f4776t = i12;
                Object[] objArr = eVar3.f12528t;
                i.c(objArr);
                Object obj2 = objArr[this.f4776t];
                f();
                return obj2;
        }
    }
}
