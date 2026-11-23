package com.unity3d.scar.adapter.common;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {
    public static a a(p199u7.c cVar) {
        String strH = E0.a.h("Cannot show ad that is not loaded for placement ", cVar.a);
        return new a(b.f10404L, strH, cVar.a, cVar.f15349b, strH);
    }

    @Override // com.unity3d.scar.adapter.common.g
    public final String getDomain() {
        return "GMA";
    }
}
