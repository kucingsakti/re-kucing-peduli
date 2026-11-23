package A1;

import java.io.File;
import java.util.List;

/* JADX INFO: renamed from: A1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0097f implements InterfaceC0101j, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public File f91A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f92s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0102k f93t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC0100i f94u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f95v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p232y1.e f96w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f97x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f98y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile E1.q f99z;

    public C0097f(List list, C0102k c0102k, InterfaceC0100i interfaceC0100i) {
        this.f92s = list;
        this.f93t = c0102k;
        this.f94u = interfaceC0100i;
    }

    @Override // A1.InterfaceC0101j
    public final boolean a() {
        while (true) {
            List list = this.f97x;
            boolean z6 = false;
            if (list != null && this.f98y < list.size()) {
                this.f99z = null;
                while (!z6 && this.f98y < this.f97x.size()) {
                    List list2 = this.f97x;
                    int i10 = this.f98y;
                    this.f98y = i10 + 1;
                    E1.r rVar = (E1.r) list2.get(i10);
                    File file = this.f91A;
                    C0102k c0102k = this.f93t;
                    this.f99z = rVar.b(file, c0102k.f109e, c0102k.f110f, c0102k.f113i);
                    if (this.f99z != null && this.f93t.c(this.f99z.f1326c.a()) != null) {
                        this.f99z.f1326c.d(this.f93t.f118o, this);
                        z6 = true;
                    }
                }
                return z6;
            }
            int i11 = this.f95v + 1;
            this.f95v = i11;
            if (i11 >= this.f92s.size()) {
                return false;
            }
            p232y1.e eVar = (p232y1.e) this.f92s.get(this.f95v);
            C0102k c0102k2 = this.f93t;
            File fileA = c0102k2.f112h.a().a(new C0098g(eVar, c0102k2.f117n));
            this.f91A = fileA;
            if (fileA != null) {
                this.f96w = eVar;
                this.f97x = this.f93t.f107c.a().g(fileA);
                this.f98y = 0;
            }
        }
    }

    @Override // A1.InterfaceC0101j
    public final void cancel() {
        E1.q qVar = this.f99z;
        if (qVar != null) {
            qVar.f1326c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Exception exc) {
        this.f94u.k(this.f96w, exc, this.f99z.f1326c, 3);
    }

    @Override // com.bumptech.glide.load.data.d
    public final void g(Object obj) {
        this.f94u.f(this.f96w, obj, this.f99z.f1326c, 3, this.f96w);
    }
}
