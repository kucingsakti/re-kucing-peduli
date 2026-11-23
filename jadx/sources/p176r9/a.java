package p176r9;

import Fa.e;
import L8.InterfaceC0271e;
import Y8.j;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import p086i8.q;
import p086i8.r;
import p095j8.b;
import p096j9.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {
    public final void a(e eVar, InterfaceC0271e interfaceC0271e, ArrayList arrayList) {
        i.f(eVar, "_context_receiver_0");
        i.f(interfaceC0271e, "thisDescriptor");
        r rVar = r.f12327s;
        while (rVar.hasNext()) {
            ((a) ((e) rVar.next())).a(eVar, interfaceC0271e, arrayList);
        }
    }

    public final void b(e eVar, InterfaceC0271e interfaceC0271e, f fVar, ArrayList arrayList) {
        i.f(eVar, "_context_receiver_0");
        i.f(interfaceC0271e, "thisDescriptor");
        i.f(fVar, MediationMetaData.KEY_NAME);
        r rVar = r.f12327s;
        while (rVar.hasNext()) {
            ((a) ((e) rVar.next())).b(eVar, interfaceC0271e, fVar, arrayList);
        }
    }

    public final void c(e eVar, InterfaceC0271e interfaceC0271e, f fVar, b bVar) {
        i.f(eVar, "_context_receiver_0");
        i.f(interfaceC0271e, "thisDescriptor");
        i.f(fVar, MediationMetaData.KEY_NAME);
        r rVar = r.f12327s;
        while (rVar.hasNext()) {
            ((a) ((e) rVar.next())).c(eVar, interfaceC0271e, fVar, bVar);
        }
    }

    public final void d(e eVar, j jVar, f fVar, ArrayList arrayList) {
        i.f(eVar, "_context_receiver_0");
        i.f(jVar, "thisDescriptor");
        i.f(fVar, MediationMetaData.KEY_NAME);
        r rVar = r.f12327s;
        while (rVar.hasNext()) {
            ((a) ((e) rVar.next())).d(eVar, jVar, fVar, arrayList);
        }
    }

    public final ArrayList e(e eVar, InterfaceC0271e interfaceC0271e) {
        i.f(eVar, "_context_receiver_0");
        i.f(interfaceC0271e, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        r rVar = r.f12327s;
        while (rVar.hasNext()) {
            q.J(arrayList, ((a) ((e) rVar.next())).e(eVar, interfaceC0271e));
        }
        return arrayList;
    }

    public final ArrayList f(e eVar, InterfaceC0271e interfaceC0271e) {
        i.f(eVar, "_context_receiver_0");
        i.f(interfaceC0271e, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        r rVar = r.f12327s;
        while (rVar.hasNext()) {
            q.J(arrayList, ((a) ((e) rVar.next())).f(eVar, interfaceC0271e));
        }
        return arrayList;
    }

    public final ArrayList g(e eVar, j jVar) {
        i.f(eVar, "_context_receiver_0");
        i.f(jVar, "thisDescriptor");
        ArrayList arrayList = new ArrayList();
        r rVar = r.f12327s;
        while (rVar.hasNext()) {
            q.J(arrayList, ((a) ((e) rVar.next())).g(eVar, jVar));
        }
        return arrayList;
    }
}
