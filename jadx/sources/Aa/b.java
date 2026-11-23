package Aa;

import X9.A;
import X9.H;
import com.google.gson.i;
import com.google.gson.u;
import com.rollbar.notifier.sender.SyncSender;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import ma.f;
import p039e0.m;
import p068ga.d;
import ya.InterfaceC0890k;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC0890k {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final A f398u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Charset f399v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u f401t;

    static {
        Pattern pattern = A.f5431d;
        f398u = d.k("application/json; charset=UTF-8");
        f399v = Charset.forName(SyncSender.UTF_8);
    }

    public b(i iVar, u uVar) {
        this.f400s = iVar;
        this.f401t = uVar;
    }

    @Override // ya.InterfaceC0890k
    public final Object j(Object obj) throws IOException {
        f fVar = new f();
        A4.b bVarE = this.f400s.e(new OutputStreamWriter(new m(fVar), f399v));
        this.f401t.c(bVarE, obj);
        bVarE.close();
        ma.i iVarB = fVar.B(fVar.f13190t);
        p210v8.i.f(iVarB, "content");
        return new H(f398u, iVarB);
    }
}
