package p068ga;

import X9.F;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p086i8.m;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f11599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f11600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f11601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Class f11602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f11603g;

    public j(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f11599c = method;
        this.f11600d = method2;
        this.f11601e = method3;
        this.f11602f = cls;
        this.f11603g = cls2;
    }

    @Override // p068ga.n
    public final void a(SSLSocket sSLSocket) {
        try {
            this.f11601e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to remove ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to remove ALPN", e11);
        }
    }

    @Override // p068ga.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        i.f(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((F) obj) != F.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(m.H(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((F) it.next()).f5504s);
        }
        try {
            this.f11599c.invoke(null, sSLSocket, Proxy.newProxyInstance(n.class.getClassLoader(), new Class[]{this.f11602f, this.f11603g}, new i(arrayList2)));
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to set ALPN", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to set ALPN", e11);
        }
    }

    @Override // p068ga.n
    public final String f(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f11600d.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            i iVar = (i) invocationHandler;
            boolean z6 = iVar.f11597b;
            if (!z6 && iVar.f11598c == null) {
                n.j(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 6);
                return null;
            }
            if (z6) {
                return null;
            }
            return iVar.f11598c;
        } catch (IllegalAccessException e10) {
            throw new AssertionError("failed to get ALPN selected protocol", e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError("failed to get ALPN selected protocol", e11);
        }
    }
}
