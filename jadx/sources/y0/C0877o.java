package y0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: y0.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0877o extends p210v8.k implements p200u8.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ p210v8.q f15952s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ArrayList f15953t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p210v8.r f15954u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ B f15955v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Bundle f15956w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0877o(p210v8.q qVar, ArrayList arrayList, p210v8.r rVar, B b3, Bundle bundle) {
        super(1);
        this.f15952s = qVar;
        this.f15953t = arrayList;
        this.f15954u = rVar;
        this.f15955v = b3;
        this.f15956w = bundle;
    }

    @Override // p200u8.b
    public final Object invoke(Object obj) {
        List listSubList;
        C0872j c0872j = (C0872j) obj;
        p210v8.i.f(c0872j, "entry");
        this.f15952s.f15463s = true;
        ArrayList arrayList = this.f15953t;
        int iIndexOf = arrayList.indexOf(c0872j);
        if (iIndexOf != -1) {
            p210v8.r rVar = this.f15954u;
            int i10 = iIndexOf + 1;
            listSubList = arrayList.subList(rVar.f15464s, i10);
            rVar.f15464s = i10;
        } else {
            listSubList = p086i8.s.f12328s;
        }
        this.f15955v.a(c0872j.f15928t, this.f15956w, c0872j, listSubList);
        return p076h8.m.a;
    }
}
