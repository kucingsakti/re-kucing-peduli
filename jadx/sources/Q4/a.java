package Q4;

import java.util.Iterator;
import java.util.Map;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements S4.a {
    public static final C0001a Companion = new C0001a(null);
    public static final String ID = "IamFetchReadyCondition";
    private final String key;

    /* JADX INFO: renamed from: Q4.a$a, reason: collision with other inner class name */
    public static final class C0001a {
        public /* synthetic */ C0001a(e eVar) {
            this();
        }

        private C0001a() {
        }
    }

    public a(String str) {
        i.f(str, "key");
        this.key = str;
    }

    @Override // S4.a
    public String getId() {
        return ID;
    }

    @Override // S4.a
    public b getRywData(Map<String, ? extends Map<S4.b, b>> map) {
        i.f(map, "indexedTokens");
        Map<S4.b, b> map2 = map.get(this.key);
        Object next = null;
        if (map2 == null) {
            return null;
        }
        Iterator it = p086i8.i.u(new b[]{map2.get(R4.a.USER), map2.get(R4.a.SUBSCRIPTION)}).iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                String rywToken = ((b) next).getRywToken();
                if (rywToken == null) {
                    rywToken = "";
                }
                do {
                    Object next2 = it.next();
                    String rywToken2 = ((b) next2).getRywToken();
                    if (rywToken2 == null) {
                        rywToken2 = "";
                    }
                    if (rywToken.compareTo(rywToken2) < 0) {
                        next = next2;
                        rywToken = rywToken2;
                    }
                } while (it.hasNext());
            }
        }
        return (b) next;
    }

    @Override // S4.a
    public boolean isMet(Map<String, ? extends Map<S4.b, b>> map) {
        i.f(map, "indexedTokens");
        Map<S4.b, b> map2 = map.get(this.key);
        return (map2 == null || map2.get(R4.a.USER) == null) ? false : true;
    }
}
