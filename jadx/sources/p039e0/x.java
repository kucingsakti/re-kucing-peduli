package p039e0;

import java.io.FileInputStream;
import p144o8.c;

/* JADX INFO: loaded from: classes.dex */
public final class x extends c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C f10676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public FileInputStream f10677t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f10678u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C f10679v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10680w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(C c10, c cVar) {
        super(cVar);
        this.f10679v = c10;
    }

    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        this.f10678u = obj;
        this.f10680w |= Integer.MIN_VALUE;
        return this.f10679v.g(this);
    }
}
