package p220w9;

import J7.a;
import K0.q;
import L8.M;
import p047e9.C0618j;
import p047e9.EnumC0617i;
import p067g9.e;
import p067g9.f;
import p067g9.g;
import p096j9.b;
import p096j9.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class r extends q {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0618j f15685e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f15686f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f15687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EnumC0617i f15688h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15689i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C0618j c0618j, f fVar, g gVar, M m2, r rVar) {
        super(fVar, gVar, m2);
        i.f(c0618j, "classProto");
        i.f(fVar, "nameResolver");
        this.f15685e = c0618j;
        this.f15686f = rVar;
        this.f15687g = a.e(fVar, c0618j.f11128w);
        EnumC0617i enumC0617i = (EnumC0617i) e.f11566f.c(c0618j.f11127v);
        this.f15688h = enumC0617i == null ? EnumC0617i.CLASS : enumC0617i;
        this.f15689i = e.f11567g.c(c0618j.f11127v).booleanValue();
    }

    @Override // K0.q
    public final c d() {
        return this.f15687g.b();
    }
}
