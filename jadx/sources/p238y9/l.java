package p238y9;

import B4.C0154b;
import C8.u;
import I4.c;
import J7.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p047e9.C0632y;
import p047e9.G;
import p047e9.T;
import p086i8.m;
import p086i8.z;
import p096j9.f;
import p104k9.AbstractC0672a;
import p210v8.n;
import p210v8.v;
import p247z9.e;
import p247z9.i;
import p247z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final /* synthetic */ u[] j;
    public final LinkedHashMap a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f16088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f16089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f16090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f16091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f16092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f16093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f16094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m f16095i;

    static {
        v vVar = p210v8.u.a;
        j = new u[]{vVar.f(new n(vVar.b(l.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), vVar.f(new n(vVar.b(l.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
    }

    public l(m mVar, List list, List list2, List list3) {
        p210v8.i.f(list, "functionList");
        p210v8.i.f(list2, "propertyList");
        p210v8.i.f(list3, "typeAliasList");
        this.f16095i = mVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            f fVarI = a.i((p067g9.f) mVar.f16097b.f5172b, ((C0632y) ((AbstractC0672a) obj)).f11247x);
            Object arrayList = linkedHashMap.get(fVarI);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(fVarI, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.a = a(linkedHashMap);
        m mVar2 = this.f16095i;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : list2) {
            f fVarI2 = a.i((p067g9.f) mVar2.f16097b.f5172b, ((G) ((AbstractC0672a) obj2)).f10802x);
            Object arrayList2 = linkedHashMap2.get(fVarI2);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put(fVarI2, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        this.f16088b = a(linkedHashMap2);
        ((p220w9.i) ((c) this.f16095i.f16097b.a).f2080c).getClass();
        m mVar3 = this.f16095i;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Object obj3 : list3) {
            f fVarI3 = a.i((p067g9.f) mVar3.f16097b.f5172b, ((T) ((AbstractC0672a) obj3)).f10910w);
            Object arrayList3 = linkedHashMap3.get(fVarI3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap3.put(fVarI3, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        this.f16089c = a(linkedHashMap3);
        this.f16090d = ((p247z9.l) ((c) this.f16095i.f16097b.a).a).b(new k(this, 0));
        this.f16091e = ((p247z9.l) ((c) this.f16095i.f16097b.a).a).b(new k(this, 1));
        this.f16092f = ((p247z9.l) ((c) this.f16095i.f16097b.a).a).c(new k(this, 2));
        m mVar4 = this.f16095i;
        p247z9.l lVar = (p247z9.l) ((c) mVar4.f16097b.a).a;
        j jVar = new j(this, mVar4, 0);
        lVar.getClass();
        this.f16093g = new i(lVar, jVar);
        m mVar5 = this.f16095i;
        p247z9.l lVar2 = (p247z9.l) ((c) mVar5.f16097b.a).a;
        j jVar2 = new j(this, mVar5, 1);
        lVar2.getClass();
        this.f16094h = new i(lVar2, jVar2);
    }

    public static LinkedHashMap a(LinkedHashMap linkedHashMap) throws IOException {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(z.s(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterable<AbstractC0672a> iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(m.H(iterable, 10));
            for (AbstractC0672a abstractC0672a : iterable) {
                int iB = abstractC0672a.b();
                int iF = C0154b.f(iB) + iB;
                if (iF > 4096) {
                    iF = 4096;
                }
                C0154b c0154bJ = C0154b.j(byteArrayOutputStream, iF);
                c0154bJ.v(iB);
                abstractC0672a.e(c0154bJ);
                c0154bJ.i();
                arrayList.add(p076h8.m.a);
            }
            linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
        }
        return linkedHashMap2;
    }
}
