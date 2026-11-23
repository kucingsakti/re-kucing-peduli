package p165q9;

import J9.b;
import L8.InterfaceC0269c;
import O8.U;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p086i8.m;
import p086i8.s;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f14437t = new a(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f14438s;

    public /* synthetic */ a(int i10) {
        this.f14438s = i10;
    }

    @Override // J9.b
    public final Iterable h(Object obj) {
        switch (this.f14438s) {
            case 0:
                int i10 = d.a;
                Collection collectionX = ((U) obj).x();
                ArrayList arrayList = new ArrayList(m.H(collectionX, 10));
                Iterator it = ((ArrayList) collectionX).iterator();
                while (it.hasNext()) {
                    arrayList.add(((U) it.next()).c());
                }
                return arrayList;
            default:
                InterfaceC0269c interfaceC0269c = (InterfaceC0269c) obj;
                Collection collectionX2 = interfaceC0269c != null ? interfaceC0269c.x() : null;
                return collectionX2 == null ? s.f12328s : collectionX2;
        }
    }
}
