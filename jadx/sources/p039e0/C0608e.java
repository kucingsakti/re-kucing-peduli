package p039e0;

import J7.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p200u8.c;

/* JADX INFO: renamed from: e0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0608e extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Iterator f10617s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f10618t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10619u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f10620v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f10621w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ArrayList f10622x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0608e(List list, ArrayList arrayList, d dVar) {
        super(2, dVar);
        this.f10621w = list;
        this.f10622x = arrayList;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        C0608e c0608e = new C0608e(this.f10621w, this.f10622x, dVar);
        c0608e.f10620v = obj;
        return c0608e;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((C0608e) create(obj, (d) obj2)).invokeSuspend(m.a);
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        List list;
        int i10 = this.f10619u;
        if (i10 == 0) {
            a.v(obj);
            obj = this.f10620v;
            it = this.f10621w.iterator();
            list = this.f10622x;
        } else if (i10 == 1) {
            Object obj2 = this.f10618t;
            Iterator it2 = this.f10617s;
            List list2 = (List) this.f10620v;
            a.v(obj);
            if (((Boolean) obj).booleanValue()) {
                list2.add(new C0607d(1, null));
                this.f10620v = list2;
                this.f10617s = it2;
                this.f10618t = null;
                this.f10619u = 2;
                throw null;
            }
            obj = obj2;
            it = it2;
            list = list2;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f10617s;
            list = (List) this.f10620v;
            a.v(obj);
        }
        if (!it.hasNext()) {
            return obj;
        }
        if (it.next() != null) {
            throw new ClassCastException();
        }
        this.f10620v = list;
        this.f10617s = it;
        this.f10618t = obj;
        this.f10619u = 1;
        throw null;
    }
}
