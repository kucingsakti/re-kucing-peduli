package com.google.gson;

import com.google.gson.internal.Excluder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final Excluder a = Excluder.f10013u;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10144b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f10145c = h.f10003s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f10146d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f10147e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f10148f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10149g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10150h = 2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f10151i = true;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f10152k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p f10153l = t.f10160s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f10154m = t.f10161t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final LinkedList f10155n = new LinkedList();

    public final i a() {
        int i10;
        v vVarA;
        v vVarA2;
        ArrayList arrayList = this.f10147e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f10148f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z6 = com.google.gson.internal.sql.b.a;
        com.google.gson.internal.bind.a aVar = com.google.gson.internal.bind.b.f10063b;
        int i11 = this.f10149g;
        if (i11 != 2 && (i10 = this.f10150h) != 2) {
            v vVarA3 = aVar.a(i11, i10);
            if (z6) {
                vVarA = com.google.gson.internal.sql.b.f10140c.a(i11, i10);
                vVarA2 = com.google.gson.internal.sql.b.f10139b.a(i11, i10);
            } else {
                vVarA = null;
                vVarA2 = null;
            }
            arrayList3.add(vVarA3);
            if (z6) {
                arrayList3.add(vVarA);
                arrayList3.add(vVarA2);
            }
        }
        return new i(this.a, this.f10145c, new HashMap(this.f10146d), this.f10151i, this.j, this.f10152k, this.f10144b, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, this.f10153l, this.f10154m, new ArrayList(this.f10155n));
    }
}
