package A0;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f21s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f22t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, int i10) {
        super(1);
        this.f21s = i10;
        this.f22t = str;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        p076h8.m mVar = p076h8.m.a;
        String str = this.f22t;
        switch (this.f21s) {
            case 0:
                p076h8.f fVar = (p076h8.f) obj;
                p210v8.i.f(fVar, "it");
                return Boolean.valueOf(p210v8.i.a(fVar.f11789s, str));
            case 1:
                B8.c cVar = (B8.c) obj;
                p210v8.i.f(cVar, "it");
                return L9.f.c0(str, cVar);
            case 2:
                p019b9.n nVar = (p019b9.n) obj;
                p210v8.i.f(nVar, "$this$function");
                p019b9.e eVar = p019b9.k.f7341b;
                nVar.a(str, eVar, eVar);
                return mVar;
            case 3:
                p019b9.n nVar2 = (p019b9.n) obj;
                p210v8.i.f(nVar2, "$this$function");
                nVar2.a(str, p019b9.k.f7341b);
                return mVar;
            case 4:
                p019b9.n nVar3 = (p019b9.n) obj;
                p210v8.i.f(nVar3, "$this$function");
                p019b9.e eVar2 = p019b9.k.f7341b;
                nVar3.a(str, eVar2);
                nVar3.a(str, eVar2);
                return mVar;
            case 5:
                p019b9.n nVar4 = (p019b9.n) obj;
                p210v8.i.f(nVar4, "$this$function");
                p019b9.e eVar3 = p019b9.k.f7341b;
                nVar4.a(str, eVar3);
                nVar4.b(str, eVar3);
                return mVar;
            case 6:
                p019b9.n nVar5 = (p019b9.n) obj;
                p210v8.i.f(nVar5, "$this$function");
                p019b9.e eVar4 = p019b9.k.f7341b;
                nVar5.a(str, eVar4);
                nVar5.a(str, eVar4);
                nVar5.b(str, eVar4);
                return mVar;
            case 7:
                p019b9.n nVar6 = (p019b9.n) obj;
                p210v8.i.f(nVar6, "$this$function");
                nVar6.b(str, p019b9.k.f7341b);
                return mVar;
            case 8:
                p019b9.n nVar7 = (p019b9.n) obj;
                p210v8.i.f(nVar7, "$this$function");
                p019b9.e eVar5 = p019b9.k.f7341b;
                nVar7.a(str, eVar5, eVar5);
                nVar7.c(p176r9.c.BOOLEAN);
                return mVar;
            case 9:
                p019b9.n nVar8 = (p019b9.n) obj;
                p210v8.i.f(nVar8, "$this$function");
                p019b9.e eVar6 = p019b9.k.f7341b;
                nVar8.b(str, eVar6, eVar6);
                return mVar;
            case 10:
                p019b9.n nVar9 = (p019b9.n) obj;
                p210v8.i.f(nVar9, "$this$function");
                p019b9.e eVar7 = p019b9.k.f7341b;
                nVar9.b(str, eVar7, eVar7);
                return mVar;
            case 11:
                p019b9.n nVar10 = (p019b9.n) obj;
                p210v8.i.f(nVar10, "$this$function");
                p019b9.e eVar8 = p019b9.k.f7341b;
                nVar10.a(str, eVar8, eVar8);
                return mVar;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                p019b9.n nVar11 = (p019b9.n) obj;
                p210v8.i.f(nVar11, "$this$function");
                p019b9.e eVar9 = p019b9.k.f7341b;
                nVar11.a(str, eVar9, eVar9, eVar9);
                return mVar;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                p019b9.n nVar12 = (p019b9.n) obj;
                p210v8.i.f(nVar12, "$this$function");
                p019b9.e eVar10 = p019b9.k.f7341b;
                nVar12.a(str, eVar10);
                nVar12.a(str, eVar10);
                nVar12.b(str, p019b9.k.a);
                return mVar;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                p019b9.n nVar13 = (p019b9.n) obj;
                p210v8.i.f(nVar13, "$this$function");
                p019b9.e eVar11 = p019b9.k.f7341b;
                nVar13.a(str, eVar11);
                nVar13.a(str, eVar11);
                nVar13.b(str, p019b9.k.a);
                return mVar;
            case 15:
                p019b9.n nVar14 = (p019b9.n) obj;
                p210v8.i.f(nVar14, "$this$function");
                p019b9.e eVar12 = p019b9.k.f7341b;
                nVar14.a(str, eVar12);
                nVar14.a(str, eVar12);
                nVar14.a(str, eVar12);
                nVar14.c(p176r9.c.BOOLEAN);
                return mVar;
            case 16:
                p019b9.n nVar15 = (p019b9.n) obj;
                p210v8.i.f(nVar15, "$this$function");
                p019b9.e eVar13 = p019b9.k.f7341b;
                nVar15.a(str, eVar13, eVar13, eVar13, eVar13);
                return mVar;
            case 17:
                p019b9.n nVar16 = (p019b9.n) obj;
                p210v8.i.f(nVar16, "$this$function");
                nVar16.b(str, p019b9.k.f7341b, p019b9.k.f7342c);
                return mVar;
            case 18:
                p019b9.n nVar17 = (p019b9.n) obj;
                p210v8.i.f(nVar17, "$this$function");
                nVar17.b(str, p019b9.k.f7342c);
                return mVar;
            case 19:
                p019b9.n nVar18 = (p019b9.n) obj;
                p210v8.i.f(nVar18, "$this$function");
                nVar18.a(str, p019b9.k.f7341b, p019b9.k.f7342c);
                return mVar;
            case 20:
                p019b9.n nVar19 = (p019b9.n) obj;
                p210v8.i.f(nVar19, "$this$function");
                nVar19.b(str, p019b9.k.a);
                return mVar;
            case MobileAdsBridge.CODE_21 /* 21 */:
                p019b9.n nVar20 = (p019b9.n) obj;
                p210v8.i.f(nVar20, "$this$function");
                nVar20.a(str, p019b9.k.f7341b);
                nVar20.c(p176r9.c.BOOLEAN);
                return mVar;
            case 22:
                p019b9.n nVar21 = (p019b9.n) obj;
                p210v8.i.f(nVar21, "$this$function");
                p019b9.e eVar14 = p019b9.k.f7341b;
                nVar21.a(str, eVar14);
                nVar21.a(str, eVar14);
                nVar21.c(p176r9.c.BOOLEAN);
                return mVar;
            default:
                return Boolean.valueOf(p210v8.i.a((String) obj, str));
        }
    }
}
