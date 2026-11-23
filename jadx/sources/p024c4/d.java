package p024c4;

import java.util.Date;
import java.util.HashMap;
import p004a4.c;
import p004a4.e;
import p004a4.f;
import p015b4.a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f7522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f7523g;
    public final HashMap a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f7525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f7526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f7521e = new a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f7524h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [c4.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [c4.b] */
    static {
        final int i10 = 0;
        f7522f = new e() { // from class: c4.b
            @Override // p004a4.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((f) obj2).c((String) obj);
                        break;
                    default:
                        ((f) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        f7523g = new e() { // from class: c4.b
            @Override // p004a4.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((f) obj2).c((String) obj);
                        break;
                    default:
                        ((f) obj2).d(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap map = new HashMap();
        this.a = map;
        HashMap map2 = new HashMap();
        this.f7525b = map2;
        this.f7526c = f7521e;
        this.f7527d = false;
        map2.put(String.class, f7522f);
        map.remove(String.class);
        map2.put(Boolean.class, f7523g);
        map.remove(Boolean.class);
        map2.put(Date.class, f7524h);
        map.remove(Date.class);
    }

    public final a a(Class cls, c cVar) {
        this.a.put(cls, cVar);
        this.f7525b.remove(cls);
        return this;
    }
}
