package p220w9;

import I4.c;
import K0.q;
import L8.InterfaceC0276j;
import V3.b;
import java.util.List;
import p047e9.G;
import p086i8.s;
import p200u8.a;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class n extends k implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q f15671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f15672t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ G f15673u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(q qVar, boolean z6, G g8) {
        super(0);
        this.f15671s = qVar;
        this.f15672t = z6;
        this.f15673u = g8;
    }

    @Override // p200u8.a
    public final Object invoke() {
        List listS0;
        q qVar = this.f15671s;
        q qVarA = qVar.a((InterfaceC0276j) qVar.a.f5173c);
        if (qVarA != null) {
            b bVar = qVar.a;
            boolean z6 = this.f15672t;
            G g8 = this.f15673u;
            listS0 = z6 ? p086i8.k.s0(((a) ((c) bVar.a).f2082e).Z(qVarA, g8)) : p086i8.k.s0(((a) ((c) bVar.a).f2082e).l0(qVarA, g8));
        } else {
            listS0 = null;
        }
        return listS0 == null ? s.f12328s : listS0;
    }
}
