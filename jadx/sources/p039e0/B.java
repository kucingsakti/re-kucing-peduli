package p039e0;

import java.io.File;
import java.io.FileOutputStream;
import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class B extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C f10593s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public File f10594t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public FileOutputStream f10595u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public FileOutputStream f10596v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f10597w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C f10598x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10599y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C c10, c cVar) {
        super(cVar);
        this.f10598x = c10;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f10597w = obj;
        this.f10599y |= Integer.MIN_VALUE;
        return this.f10598x.j(null, this);
    }
}
