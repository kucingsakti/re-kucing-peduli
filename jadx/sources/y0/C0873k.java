package y0;

import p047e9.C0627t;

/* JADX INFO: renamed from: y0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0873k extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15935s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f15936t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f15937u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0873k(C0874l c0874l, C0872j c0872j, boolean z6) {
        super(0);
        this.f15936t = c0874l;
        this.f15937u = c0872j;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f15935s) {
            case 0:
                ((C0874l) this.f15936t).e((C0872j) this.f15937u);
                return p076h8.m.a;
            default:
                p238y9.g gVar = (p238y9.g) this.f15936t;
                return p086i8.k.s0(((p220w9.a) ((I4.c) gVar.f16067D.a).f2082e).x0(gVar.f16077N, (C0627t) this.f15937u));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0873k(p238y9.g gVar, C0627t c0627t) {
        super(0);
        this.f15936t = gVar;
        this.f15937u = c0627t;
    }
}
