package com.google.firebase.concurrent;

import D3.i;
import H3.a;
import H3.c;
import H3.d;
import I3.b;
import I3.f;
import I3.l;
import I3.p;
import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final l a = new l(new f(2));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f9981b = new l(new f(3));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f9982c = new l(new f(4));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f9983d = new l(new f(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        p pVar = new p(a.class, ScheduledExecutorService.class);
        p[] pVarArr = {new p(a.class, ExecutorService.class), new p(a.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            p181s3.a.b(pVar2, "Null interface");
        }
        Collections.addAll(hashSet, pVarArr);
        b bVar = new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new i(7), hashSet3);
        p pVar3 = new p(H3.b.class, ScheduledExecutorService.class);
        p[] pVarArr2 = {new p(H3.b.class, ExecutorService.class), new p(H3.b.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(pVar3);
        for (p pVar4 : pVarArr2) {
            p181s3.a.b(pVar4, "Null interface");
        }
        Collections.addAll(hashSet4, pVarArr2);
        b bVar2 = new b(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new i(8), hashSet6);
        p pVar5 = new p(c.class, ScheduledExecutorService.class);
        p[] pVarArr3 = {new p(c.class, ExecutorService.class), new p(c.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(pVar5);
        for (p pVar6 : pVarArr3) {
            p181s3.a.b(pVar6, "Null interface");
        }
        Collections.addAll(hashSet7, pVarArr3);
        b bVar3 = new b(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new i(9), hashSet9);
        I3.a aVarA = b.a(new p(d.class, Executor.class));
        aVarA.f2016f = new i(10);
        return Arrays.asList(bVar, bVar2, bVar3, aVarA.b());
    }
}
