package p019b9;

import p076h8.m;
import p200u8.b;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k implements b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f7339t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f7340u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(String str, int i10, String str2) {
        super(1);
        this.f7338s = i10;
        this.f7339t = str;
        this.f7340u = str2;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        m mVar = m.a;
        String str = this.f7340u;
        String str2 = this.f7339t;
        switch (this.f7338s) {
            case 0:
                n nVar = (n) obj;
                i.f(nVar, "$this$function");
                e eVar = k.f7341b;
                nVar.a(str2, eVar);
                e eVar2 = k.a;
                nVar.a(str, eVar, eVar, eVar2, eVar2);
                nVar.b(str2, eVar2);
                break;
            case 1:
                n nVar2 = (n) obj;
                i.f(nVar2, "$this$function");
                e eVar3 = k.f7341b;
                nVar2.a(str2, eVar3);
                nVar2.a(str, eVar3, eVar3, eVar3);
                nVar2.b(str2, eVar3);
                break;
            case 2:
                n nVar3 = (n) obj;
                i.f(nVar3, "$this$function");
                e eVar4 = k.f7341b;
                nVar3.a(str2, eVar4);
                e eVar5 = k.a;
                nVar3.a(str, eVar4, eVar4, k.f7342c, eVar5);
                nVar3.b(str2, eVar5);
                break;
            case 3:
                n nVar4 = (n) obj;
                i.f(nVar4, "$this$function");
                e eVar6 = k.f7341b;
                nVar4.a(str2, eVar6);
                e eVar7 = k.f7342c;
                nVar4.a(str2, eVar7);
                e eVar8 = k.a;
                nVar4.a(str, eVar6, eVar7, eVar7, eVar8);
                nVar4.b(str2, eVar8);
                break;
            case 4:
                n nVar5 = (n) obj;
                i.f(nVar5, "$this$function");
                e eVar9 = k.f7342c;
                nVar5.a(str2, eVar9);
                nVar5.b(str, k.f7341b, eVar9);
                break;
            default:
                n nVar6 = (n) obj;
                i.f(nVar6, "$this$function");
                nVar6.a(str2, k.a);
                nVar6.b(str, k.f7341b, k.f7342c);
                break;
        }
        return mVar;
    }
}
