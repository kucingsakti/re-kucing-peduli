package J9;

import K8.p;
import L8.InterfaceC0269c;
import L8.InterfaceC0271e;
import java.io.Serializable;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class a extends l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f2463d;

    public /* synthetic */ a(Object obj, Serializable serializable, int i10) {
        this.f2461b = i10;
        this.f2462c = obj;
        this.f2463d = serializable;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [u8.b, v8.k] */
    @Override // J9.l
    public void c(Object obj) {
        switch (this.f2461b) {
            case 2:
                InterfaceC0269c interfaceC0269c = (InterfaceC0269c) obj;
                p210v8.i.f(interfaceC0269c, "current");
                t tVar = (t) this.f2462c;
                if (tVar.f15466s == null && ((Boolean) ((p210v8.k) this.f2463d).invoke(interfaceC0269c)).booleanValue()) {
                    tVar.f15466s = interfaceC0269c;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, u8.b] */
    @Override // J9.l
    public final boolean d(Object obj) {
        switch (this.f2461b) {
            case 0:
                boolean zBooleanValue = ((Boolean) this.f2462c.invoke(obj)).booleanValue();
                boolean[] zArr = (boolean[]) this.f2463d;
                if (zBooleanValue) {
                    zArr[0] = true;
                }
                return !zArr[0];
            case 1:
                InterfaceC0271e interfaceC0271e = (InterfaceC0271e) obj;
                p210v8.i.f(interfaceC0271e, "javaClassDescriptor");
                String strN = oa.b.n(interfaceC0271e, (String) this.f2462c);
                boolean zContains = p.f2669b.contains(strN);
                t tVar = (t) this.f2463d;
                if (zContains) {
                    tVar.f15466s = K8.j.f2650s;
                } else if (p.f2670c.contains(strN)) {
                    tVar.f15466s = K8.j.f2651t;
                } else if (p.a.contains(strN)) {
                    tVar.f15466s = K8.j.f2653v;
                }
                return tVar.f15466s == null;
            default:
                p210v8.i.f((InterfaceC0269c) obj, "current");
                return ((t) this.f2462c).f15466s == null;
        }
    }

    @Override // J9.l
    public final Object k() {
        switch (this.f2461b) {
            case 0:
                return Boolean.valueOf(((boolean[]) this.f2463d)[0]);
            case 1:
                K8.j jVar = (K8.j) ((t) this.f2463d).f15466s;
                return jVar == null ? K8.j.f2652u : jVar;
            default:
                return (InterfaceC0269c) ((t) this.f2462c).f15466s;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(t tVar, p200u8.b bVar) {
        this.f2461b = 2;
        this.f2462c = tVar;
        this.f2463d = (p210v8.k) bVar;
    }
}
