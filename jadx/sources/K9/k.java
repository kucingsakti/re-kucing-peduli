package K9;

import java.io.File;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k implements l {
    public final /* synthetic */ int a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Serializable f2693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2694c;

    public k(File file) {
        s8.g gVar = s8.g.f14737s;
        p210v8.i.f(file, "start");
        this.f2693b = file;
        this.f2694c = gVar;
    }

    @Override // K9.l
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new j(this);
            case 1:
                return new f(this);
            default:
                return new s8.e(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(l lVar, p200u8.b bVar) {
        p210v8.i.f(lVar, "sequence");
        this.f2694c = lVar;
        this.f2693b = (p210v8.k) bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(p200u8.a aVar, p200u8.b bVar) {
        p210v8.i.f(bVar, "getNextValue");
        this.f2693b = (p210v8.k) aVar;
        this.f2694c = bVar;
    }
}
