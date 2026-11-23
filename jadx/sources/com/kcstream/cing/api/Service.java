package com.kcstream.cing.api;

import Fa.e;
import J7.n;
import L9.a;
import X9.C0461g;
import X9.D;
import X9.E;
import X9.L;
import X9.z;
import Y9.c;
import android.util.Base64;
import com.google.gson.j;
import com.kcstream.cing.api.Service;
import java.io.File;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import la.b;
import p030ca.f;
import p078i.AbstractActivityC0655l;
import p210v8.i;
import ya.C0892m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/kcstream/cing/api/Service;", "", "", "getAPIKey", "()Ljava/lang/String;", "getAPISignature", "getAPIPath", "getAPIUrl", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Service {
    public final AbstractActivityC0655l a;

    public Service(AbstractActivityC0655l abstractActivityC0655l) {
        this.a = abstractActivityC0655l;
    }

    public static L a(Service service, f fVar) {
        i.f(service, "this$0");
        e eVarA = fVar.f7579e.a();
        byte[] bArrDecode = Base64.decode(service.getAPIKey(), 0);
        i.e(bArrDecode, "decode(...)");
        Charset charset = a.a;
        eVarA.g("Token", new String(bArrDecode, charset));
        eVarA.g("Accept", "application/json");
        eVarA.g("AppBuildCode", "25301");
        byte[] bArrDecode2 = Base64.decode(service.getAPISignature(), 0);
        i.e(bArrDecode2, "decode(...)");
        eVarA.g("AppSignature", new String(bArrDecode2, charset));
        return fVar.b(eVarA.j());
    }

    private final native String getAPIKey();

    private final native String getAPIPath();

    private final native String getAPISignature();

    private final native String getAPIUrl();

    public final E b() {
        D dA = new E().a();
        File cacheDir = this.a.getCacheDir();
        i.e(cacheDir, "getCacheDir(...)");
        dA.f5453k = new C0461g(cacheDir);
        dA.f5446c.add(new z() { // from class: H4.b
            @Override // X9.z
            public final L a(f fVar) {
                return Service.a(this.a, fVar);
            }
        });
        b bVar = new b();
        bVar.a = 4;
        dA.f5446c.add(bVar);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        i.f(timeUnit, "unit");
        dA.f5465w = c.b(40L, timeUnit);
        dA.f5466x = c.b(40L, timeUnit);
        dA.f5467y = c.b(40L, timeUnit);
        dA.f5451h = false;
        dA.f5449f = true;
        return new E(dA);
    }

    public final H4.a c() throws Exception {
        try {
            e eVar = new e(17);
            StringBuilder sb = new StringBuilder();
            byte[] bArrDecode = Base64.decode(getAPIUrl(), 0);
            i.e(bArrDecode, "decode(...)");
            Charset charset = a.a;
            sb.append(new String(bArrDecode, charset));
            sb.append('/');
            byte[] bArrDecode2 = Base64.decode(getAPIPath(), 0);
            i.e(bArrDecode2, "decode(...)");
            sb.append(new String(bArrDecode2, charset));
            sb.append('/');
            eVar.h(sb.toString());
            eVar.f1660u = b();
            n nVar = p046e8.f.f10734b;
            if (nVar == null) {
                throw new NullPointerException("scheduler == null");
            }
            ((ArrayList) eVar.f1663x).add(new C0892m(nVar, 1));
            j jVar = new j();
            jVar.j = true;
            ((ArrayList) eVar.f1662w).add(new Aa.a(jVar.a()));
            Object objG = eVar.k().g();
            i.e(objG, "create(...)");
            return (H4.a) objG;
        } catch (SocketTimeoutException e10) {
            za.c cVar = Ha.a.a;
            e10.getStackTrace();
            cVar.getClass();
            za.c.k(new Object[0]);
            e10.printStackTrace();
            throw e10;
        } catch (Exception e11) {
            za.c cVar2 = Ha.a.a;
            e11.getStackTrace();
            cVar2.getClass();
            za.c.k(new Object[0]);
            e11.printStackTrace();
            throw e11;
        }
    }
}
