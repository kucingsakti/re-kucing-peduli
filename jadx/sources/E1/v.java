package E1;

import A1.C0099h;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f1328s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0099h f1329t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1330u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.bumptech.glide.g f1331v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f1332w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f1333x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f1334y;

    public v(ArrayList arrayList, C0099h c0099h) {
        this.f1329t = c0099h;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f1328s = arrayList;
        this.f1330u = 0;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return ((com.bumptech.glide.load.data.e) this.f1328s.get(0)).a();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        List list = this.f1333x;
        if (list != null) {
            this.f1329t.q(list);
        }
        this.f1333x = null;
        Iterator it = this.f1328s.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        return ((com.bumptech.glide.load.data.e) this.f1328s.get(0)).c();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f1334y = true;
        Iterator it = this.f1328s.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        this.f1331v = gVar;
        this.f1332w = dVar;
        this.f1333x = (List) this.f1329t.b();
        ((com.bumptech.glide.load.data.e) this.f1328s.get(this.f1330u)).d(gVar, this);
        if (this.f1334y) {
            cancel();
        }
    }

    public final void e() {
        if (this.f1334y) {
            return;
        }
        if (this.f1330u < this.f1328s.size() - 1) {
            this.f1330u++;
            d(this.f1331v, this.f1332w);
        } else {
            U1.f.b(this.f1333x);
            this.f1332w.f(new GlideException("Fetch failed", new ArrayList(this.f1333x)));
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void f(Exception exc) {
        List list = this.f1333x;
        U1.f.c(list, "Argument must not be null");
        list.add(exc);
        e();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void g(Object obj) {
        if (obj != null) {
            this.f1332w.g(obj);
        } else {
            e();
        }
    }
}
