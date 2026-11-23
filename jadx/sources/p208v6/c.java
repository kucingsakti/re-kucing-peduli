package p208v6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p086i8.k;
import p210v8.i;
import p228x6.a;
import p228x6.b;
import p228x6.d;
import p228x6.e;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    private final b _fallbackPushSub;
    private final List<e> collection;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List<? extends e> list, b bVar) {
        i.f(list, "collection");
        i.f(bVar, "_fallbackPushSub");
        this.collection = list;
        this._fallbackPushSub = bVar;
    }

    public final a getByEmail(String str) {
        Object next;
        i.f(str, "email");
        Iterator<T> it = getEmails().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (i.a(((a) next).getEmail(), str)) {
                return (a) next;
            }
        }
        next = null;
        return (a) next;
    }

    public final d getBySMS(String str) {
        Object next;
        i.f(str, "sms");
        Iterator<T> it = getSmss().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (i.a(((d) next).getNumber(), str)) {
                return (d) next;
            }
        }
        next = null;
        return (d) next;
    }

    public final List<e> getCollection() {
        return this.collection;
    }

    public final List<a> getEmails() {
        List<e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof a) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final b getPush() {
        List<e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof b) {
                arrayList.add(obj);
            }
        }
        b bVar = (b) k.V(arrayList);
        return bVar == null ? this._fallbackPushSub : bVar;
    }

    public final List<d> getSmss() {
        List<e> list = this.collection;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof d) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
