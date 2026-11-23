package F8;

import A9.AbstractC0151y;
import C8.InterfaceC0175c;
import C8.InterfaceC0177e;
import C8.InterfaceC0178f;
import L8.InterfaceC0285t;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.ByteArrayInputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import p047e9.C0609a;
import p047e9.C0632y;
import p104k9.AbstractC0672a;
import p104k9.C0676e;
import p104k9.C0678g;

/* JADX INFO: loaded from: classes.dex */
public class u0 extends p210v8.v {
    public static D j(p210v8.b bVar) {
        InterfaceC0177e interfaceC0177eD = bVar.d();
        return interfaceC0177eD instanceof D ? (D) interfaceC0177eD : C0210d.f1570t;
    }

    @Override // p210v8.v
    public final InterfaceC0178f a(p210v8.g gVar) {
        D dJ = j(gVar);
        String name = gVar.getName();
        String strG = gVar.g();
        p210v8.i.f(dJ, "container");
        p210v8.i.f(name, MediationMetaData.KEY_NAME);
        p210v8.i.f(strG, InAppPurchaseMetaData.KEY_SIGNATURE);
        return new F(dJ, name, strG, null, gVar.f15450t);
    }

    @Override // p210v8.v
    public final InterfaceC0175c b(Class cls) {
        return AbstractC0209c.a(cls);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [u8.b, v8.k] */
    @Override // p210v8.v
    public final InterfaceC0177e c(String str, Class cls) {
        Object objPutIfAbsent;
        o1.e eVar = AbstractC0209c.a;
        p210v8.i.f(cls, "jClass");
        o1.e eVar2 = AbstractC0209c.f1567b;
        eVar2.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) eVar2.f13628u;
        Object objInvoke = concurrentHashMap.get(cls);
        if (objInvoke == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(cls, (objInvoke = ((p210v8.k) eVar2.f13627t).invoke(cls)))) != null) {
            objInvoke = objPutIfAbsent;
        }
        return (InterfaceC0177e) objInvoke;
    }

    @Override // p210v8.v
    public final C8.i d(p210v8.l lVar) {
        return new J(j(lVar), lVar.f15452v, lVar.f15453w, lVar.f15450t);
    }

    @Override // p210v8.v
    public final C8.p e(S9.i iVar) {
        return new X(j(iVar), iVar.f15452v, iVar.f15453w, iVar.f15450t);
    }

    @Override // p210v8.v
    public final C8.r f(p210v8.n nVar) {
        return new a0(j(nVar), nVar.f15452v, nVar.f15453w, nVar.f15450t);
    }

    @Override // p210v8.v
    public final C8.t g(p210v8.o oVar) {
        return new d0(j(oVar), oVar.f15452v, oVar.f15453w);
    }

    @Override // p210v8.v
    public final String h(p210v8.f fVar) throws InvalidProtocolBufferException {
        F fB;
        Metadata metadata = (Metadata) fVar.getClass().getAnnotation(Metadata.class);
        F f10 = null;
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                String[] strArrD2 = metadata.d2();
                C0678g c0678g = i9.h.a;
                p210v8.i.f(strArrD2, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(i9.a.a(strArrD1));
                C0678g c0678g2 = i9.h.a;
                i9.g gVarG = i9.h.g(byteArrayInputStream, strArrD2);
                C0609a c0609a = C0632y.f11230N;
                C0678g c0678g3 = i9.h.a;
                c0609a.getClass();
                C0676e c0676e = new C0676e(byteArrayInputStream);
                AbstractC0672a abstractC0672a = (AbstractC0672a) c0609a.a(c0676e, c0678g3);
                try {
                    c0676e.a(0);
                    if (!abstractC0672a.isInitialized()) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
                        invalidProtocolBufferException.f12841s = abstractC0672a;
                        throw invalidProtocolBufferException;
                    }
                    C0632y c0632y = (C0632y) abstractC0672a;
                    i9.f fVar2 = new i9.f(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = fVar.getClass();
                    p047e9.X x8 = c0632y.f11238H;
                    p210v8.i.e(x8, "proto.typeTable");
                    f10 = new F(C0210d.f1570t, (O8.N) y0.f(cls, c0632y, gVarG, new p067g9.g(x8), fVar2, E8.a.f1455A));
                } catch (InvalidProtocolBufferException e10) {
                    e10.f12841s = abstractC0672a;
                    throw e10;
                }
            }
        }
        if (f10 == null || (fB = y0.b(f10)) == null) {
            return super.h(fVar);
        }
        p114l9.g gVar = v0.a;
        InterfaceC0285t interfaceC0285tL = fB.g();
        StringBuilder sb = new StringBuilder();
        v0.a(interfaceC0285tL, sb);
        List listH0 = interfaceC0285tL.H0();
        p210v8.i.e(listH0, "invoke.valueParameters");
        p086i8.k.Y(listH0, sb, ", ", "(", ")", C0208b.f1556A, 48);
        sb.append(" -> ");
        AbstractC0151y abstractC0151yW = interfaceC0285tL.w();
        p210v8.i.c(abstractC0151yW);
        sb.append(v0.d(abstractC0151yW));
        String string = sb.toString();
        p210v8.i.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // p210v8.v
    public final String i(p210v8.k kVar) {
        return h(kVar);
    }
}
