package F0;

import G0.e;
import N9.AbstractC0342z;
import N9.I;
import android.net.Uri;
import android.view.InputEvent;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final G0.c a;

    public d(G0.c cVar) {
        this.a = cVar;
    }

    public C3.d a(G0.a aVar) {
        i.f(aVar, "deletionRequest");
        throw null;
    }

    public C3.d b() {
        return p068ga.d.a(AbstractC0342z.d(AbstractC0342z.b(I.a), null, new a(this, null), 3));
    }

    public C3.d c(Uri uri, InputEvent inputEvent) {
        i.f(uri, "attributionSource");
        return p068ga.d.a(AbstractC0342z.d(AbstractC0342z.b(I.a), null, new b(this, uri, inputEvent, null), 3));
    }

    public C3.d d(Uri uri) {
        i.f(uri, "trigger");
        return p068ga.d.a(AbstractC0342z.d(AbstractC0342z.b(I.a), null, new c(this, uri, null), 3));
    }

    public C3.d e(G0.d dVar) {
        i.f(dVar, "request");
        throw null;
    }

    public C3.d f(e eVar) {
        i.f(eVar, "request");
        throw null;
    }
}
