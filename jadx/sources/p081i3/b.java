package p081i3;

import A1.C0099h;
import A9.AbstractC0151y;
import C8.u;
import E4.C0187a;
import F8.C0212f;
import L8.AbstractC0287v;
import L8.C0280n;
import L8.D;
import L8.G;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import L8.InterfaceC0276j;
import L8.InterfaceC0278l;
import L8.InterfaceC0285t;
import L8.J;
import M2.RunnableC0315y;
import N9.C0324g;
import O8.AbstractC0354j;
import O8.B;
import O8.C;
import O8.C0355k;
import O8.I;
import O8.K;
import O8.L;
import O8.M;
import O8.U;
import O8.x;
import O8.z;
import Y8.r;
import Y8.w;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.zabz;
import com.google.android.gms.common.internal.zaj;
import com.google.android.material.chip.Chip;
import com.google.android.material.navigation.NavigationView;
import com.kcstream.cing.R;
import com.kcstream.cing.activity.MainActivity;
import com.kcstream.cing.activity.drawer.AboutActivity;
import com.kcstream.cing.activity.drawer.ChatActivity;
import com.kcstream.cing.activity.drawer.NewReleaseActivity;
import com.kcstream.cing.activity.drawer.ServiceActivity;
import com.kcstream.cing.activity.drawer.SettingsActivity;
import com.kcstream.cing.fragment.TabsBookmarkFragment;
import com.kcstream.cing.fragment.TabsDownloadsFragment;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import i2.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import org.chromium.net.UrlRequest;
import org.chromium.net.c;
import p.B0;
import p.InterfaceC0715m;
import p.V0;
import p.b1;
import p051f2.a;
import p051f2.d;
import p051f2.f;
import p076h8.m;
import p078i.C0650g;
import p086i8.k;
import p104k9.AbstractC0675d;
import p114l9.g;
import p114l9.h;
import p114l9.p;
import p136o.l;
import p156q0.C0763w;
import p163q7.j;
import p182s4.F;
import p210v8.i;
import p220w9.e;
import p238y9.q;
import sa.E;
import ta.n;
import ya.InterfaceC0882c;
import ya.InterfaceC0885f;

/* JADX INFO: loaded from: classes.dex */
public class b implements j, InterfaceC0278l, p136o.j, B0, c, n, e, zaj, zabz, InterfaceC0885f, p247z9.n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12211s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f12212t;

    public /* synthetic */ b(Object obj, int i10) {
        this.f12211s = i10;
        this.f12212t = obj;
    }

    @Override // L8.InterfaceC0278l
    public Object A(M m2, Object obj) {
        L(m2, (StringBuilder) obj, "setter");
        return m.a;
    }

    @Override // L8.InterfaceC0278l
    public /* bridge */ /* synthetic */ Object B(InterfaceC0285t interfaceC0285t, Object obj) {
        K(interfaceC0285t, (StringBuilder) obj);
        return m.a;
    }

    public void C(F f10) {
        ((o) ((f) ((p073h4.b) this.f12212t).get())).a("FIREBASE_APPQUALITY_SESSION", new p051f2.c("json"), new C0187a(this, 26)).y(new a(f10, d.f11424s, null), new Y9.a(3));
    }

    public void D() {
        ((C0763w) this.f12212t).f14371v.R();
    }

    public void E(View view) {
        if (view.getParent() != null) {
            view.setVisibility(8);
        }
        ((p190t3.f) this.f12212t).a(0);
    }

    @Override // L8.InterfaceC0278l
    public Object F(K k3, Object obj) {
        i.f(k3, "descriptor");
        g.n((g) this.f12212t, k3, (StringBuilder) obj);
        return m.a;
    }

    @Override // L8.InterfaceC0278l
    public Object G(x xVar, Object obj) {
        i.f(xVar, "descriptor");
        ((StringBuilder) obj).append(xVar.getName());
        return m.a;
    }

    public InterfaceC0271e J(R8.n nVar) {
        i.f(nVar, "javaClass");
        p096j9.c cVarC = nVar.c();
        Class cls = nVar.a;
        Class<?> declaringClass = cls.getDeclaringClass();
        R8.n nVar2 = declaringClass != null ? new R8.n(declaringClass) : null;
        if (nVar2 != null) {
            InterfaceC0271e interfaceC0271eJ = J(nVar2);
            t9.n nVarS0 = interfaceC0271eJ != null ? interfaceC0271eJ.s0() : null;
            InterfaceC0273g interfaceC0273gA = nVarS0 != null ? nVarS0.a(p096j9.f.j(cls.getSimpleName()), T8.b.f4766z) : null;
            if (interfaceC0273gA instanceof InterfaceC0271e) {
                return (InterfaceC0271e) interfaceC0273gA;
            }
        } else {
            p096j9.c cVarE = cVarC.e();
            i.e(cVarE, "fqName.parent()");
            r rVar = (r) k.V(com.bumptech.glide.d.u(((X8.c) this.f12212t).c(cVarE)));
            if (rVar != null) {
                w wVar = rVar.f5798B.f5740d;
                wVar.getClass();
                return wVar.v(p096j9.f.j(cls.getSimpleName()), nVar);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b3  */
    public void K(InterfaceC0285t interfaceC0285t, StringBuilder sb) {
        String strY;
        boolean z6;
        g gVar = (g) this.f12212t;
        boolean zR = gVar.r();
        p114l9.k kVar = gVar.a;
        if (!zR) {
            u[] uVarArr = p114l9.k.f13005W;
            if (!((Boolean) kVar.f13032g.a(uVarArr[5], kVar)).booleanValue()) {
                gVar.y(sb, interfaceC0285t, null);
                List listB0 = interfaceC0285t.b0();
                i.e(listB0, "function.contextReceiverParameters");
                gVar.C(sb, listB0);
                C0280n c0280nF = interfaceC0285t.f();
                i.e(c0280nF, "function.visibility");
                gVar.h0(c0280nF, sb);
                gVar.M(interfaceC0285t, sb);
                if (((Boolean) kVar.f13022R.a(uVarArr[42], kVar)).booleanValue()) {
                    gVar.K(interfaceC0285t, sb);
                }
                gVar.S(interfaceC0285t, sb);
                if (((Boolean) kVar.f13022R.a(uVarArr[42], kVar)).booleanValue()) {
                    boolean z10 = false;
                    if (interfaceC0285t.r0()) {
                        Collection collectionX = interfaceC0285t.x();
                        i.e(collectionX, "functionDescriptor.overriddenDescriptors");
                        Collection collection = collectionX;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((InterfaceC0285t) it.next()).r0()) {
                                        if (!((Boolean) kVar.f13019N.a(p114l9.k.f13005W[38], kVar)).booleanValue()) {
                                            z6 = false;
                                        }
                                    }
                                }
                            }
                        }
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (interfaceC0285t.I0()) {
                        Collection collectionX2 = interfaceC0285t.x();
                        i.e(collectionX2, "functionDescriptor.overriddenDescriptors");
                        Collection collection2 = collectionX2;
                        if (!collection2.isEmpty()) {
                            Iterator it2 = collection2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((InterfaceC0285t) it2.next()).I0()) {
                                        if (!((Boolean) kVar.f13019N.a(p114l9.k.f13005W[38], kVar)).booleanValue()) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z10 = true;
                                break;
                            }
                        }
                        z10 = true;
                        break;
                    }
                    gVar.N("tailrec", sb, interfaceC0285t.q0());
                    gVar.N("suspend", sb, interfaceC0285t.t());
                    gVar.N("inline", sb, interfaceC0285t.u());
                    gVar.N("infix", sb, z10);
                    gVar.N("operator", sb, z6);
                } else {
                    gVar.N("suspend", sb, interfaceC0285t.t());
                }
                gVar.J(interfaceC0285t, sb);
                if (gVar.u()) {
                    if (interfaceC0285t.n0()) {
                        sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (interfaceC0285t.x0()) {
                        sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb.append(gVar.I("fun"));
            sb.append(" ");
            List listZ = interfaceC0285t.z();
            i.e(listZ, "function.typeParameters");
            gVar.d0(listZ, sb, true);
            gVar.V(interfaceC0285t, sb);
        }
        gVar.P(interfaceC0285t, sb, true);
        List listH0 = interfaceC0285t.H0();
        i.e(listH0, "function.valueParameters");
        gVar.g0(listH0, interfaceC0285t.Z(), sb);
        gVar.W(interfaceC0285t, sb);
        AbstractC0151y abstractC0151yW = interfaceC0285t.w();
        u[] uVarArr2 = p114l9.k.f13005W;
        if (!((Boolean) kVar.f13036l.a(uVarArr2[10], kVar)).booleanValue()) {
            if (((Boolean) kVar.f13035k.a(uVarArr2[9], kVar)).booleanValue() || abstractC0151yW == null) {
                sb.append(": ");
                if (abstractC0151yW == null) {
                    strY = "[NULL]";
                } else {
                    strY = gVar.Y(abstractC0151yW);
                }
                sb.append(strY);
            } else {
                p096j9.f fVar = I8.i.f2112e;
                if (!I8.i.D(abstractC0151yW, I8.n.f2167d)) {
                    sb.append(": ");
                    if (abstractC0151yW == null) {
                        strY = "[NULL]";
                    } else {
                        strY = gVar.Y(abstractC0151yW);
                    }
                    sb.append(strY);
                }
            }
        }
        List listZ2 = interfaceC0285t.z();
        i.e(listZ2, "function.typeParameters");
        gVar.i0(sb, listZ2);
    }

    public void L(J j, StringBuilder sb, String str) {
        g gVar = (g) this.f12212t;
        p114l9.k kVar = gVar.a;
        int iOrdinal = ((p) kVar.f13012G.a(p114l9.k.f13005W[31], kVar)).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                return;
            }
            K(j, sb);
        } else {
            gVar.K(j, sb);
            sb.append(str.concat(" for "));
            L8.K kZ0 = ((I) j).Z0();
            i.e(kZ0, "descriptor.correspondingProperty");
            g.n(gVar, kZ0, sb);
        }
    }

    @Override // p220w9.e
    public p220w9.d a(p096j9.b bVar) {
        p220w9.d dVarA;
        i.f(bVar, "classId");
        p096j9.c cVarG = bVar.g();
        i.e(cVarG, "classId.packageFqName");
        for (D d3 : AbstractC0287v.i((G) this.f12212t, cVarG)) {
            if ((d3 instanceof p230x9.c) && (dVarA = ((p230x9.c) d3).f15788A.a(bVar)) != null) {
                return dVarA;
            }
        }
        return null;
    }

    @Override // L8.InterfaceC0278l
    public Object b(B b3, Object obj) {
        C0355k c0355kU0;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        g gVar = (g) this.f12212t;
        gVar.getClass();
        boolean z6 = b3.M() == 4;
        if (!gVar.r()) {
            gVar.y(sb, b3, null);
            List listF0 = b3.F0();
            i.e(listF0, "klass.contextReceivers");
            gVar.C(sb, listF0);
            if (!z6) {
                C0280n c0280nF = b3.f();
                i.e(c0280nF, "klass.visibility");
                gVar.h0(c0280nF, sb);
            }
            if ((b3.M() != 2 || b3.m() != 4) && (!E0.a.a(b3.M()) || b3.m() != 1)) {
                int iM = b3.m();
                AbstractC0487g.u(iM, "klass.modality");
                gVar.L(iM, sb, g.v(b3));
            }
            gVar.K(b3, sb);
            gVar.N("inner", sb, gVar.q().contains(h.INNER) && b3.r());
            gVar.N(JsonStorageKeyNames.DATA_KEY, sb, gVar.q().contains(h.DATA) && b3.L0());
            gVar.N("inline", sb, gVar.q().contains(h.INLINE) && b3.u());
            gVar.N("value", sb, gVar.q().contains(h.VALUE) && b3.h0());
            gVar.N("fun", sb, gVar.q().contains(h.FUN) && b3.T());
            if (b3.N()) {
                str = "companion object";
            } else {
                int iD = p239z.e.d(b3.M());
                if (iD == 0) {
                    str = "class";
                } else if (iD == 1) {
                    str = "interface";
                } else if (iD == 2) {
                    str = "enum class";
                } else if (iD == 3) {
                    str = "enum entry";
                } else if (iD == 4) {
                    str = "annotation class";
                } else {
                    if (iD != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "object";
                }
            }
            sb.append(gVar.I(str));
        }
        boolean zL = p124m9.e.l(b3);
        p114l9.k kVar = gVar.a;
        if (zL) {
            if (((Boolean) kVar.f13011F.a(p114l9.k.f13005W[30], kVar)).booleanValue()) {
                if (gVar.r()) {
                    sb.append("companion object");
                }
                g.X(sb);
                InterfaceC0276j interfaceC0276jV = b3.v();
                if (interfaceC0276jV != null) {
                    sb.append("of ");
                    p096j9.f name = interfaceC0276jV.getName();
                    i.e(name, "containingDeclaration.name");
                    sb.append(gVar.O(name, false));
                }
            }
            if (gVar.u() || !i.a(b3.getName(), p096j9.h.f12553b)) {
                if (!gVar.r()) {
                    g.X(sb);
                }
                p096j9.f name2 = b3.getName();
                i.e(name2, "descriptor.name");
                sb.append(gVar.O(name2, true));
            }
        } else {
            if (!gVar.r()) {
                g.X(sb);
            }
            gVar.P(b3, sb, true);
        }
        if (!z6) {
            List listY = b3.y();
            i.e(listY, "klass.declaredTypeParameters");
            gVar.d0(listY, sb, false);
            gVar.A(b3, sb);
            if (!E0.a.a(b3.M())) {
                if (((Boolean) kVar.f13034i.a(p114l9.k.f13005W[7], kVar)).booleanValue() && (c0355kU0 = b3.u0()) != null) {
                    sb.append(" ");
                    gVar.y(sb, c0355kU0, null);
                    C0355k c0355k = c0355kU0;
                    C0280n c0280nF2 = c0355k.f();
                    i.e(c0280nF2, "primaryConstructor.visibility");
                    gVar.h0(c0280nF2, sb);
                    sb.append(gVar.I("constructor"));
                    List listH0 = c0355k.H0();
                    i.e(listH0, "primaryConstructor.valueParameters");
                    gVar.g0(listH0, c0355kU0.Z(), sb);
                }
            }
            if (!((Boolean) kVar.f13047w.a(p114l9.k.f13005W[21], kVar)).booleanValue() && !I8.i.E(b3.p())) {
                Collection collectionT = b3.I().t();
                i.e(collectionT, "klass.typeConstructor.supertypes");
                if (!collectionT.isEmpty() && (collectionT.size() != 1 || !I8.i.x((AbstractC0151y) collectionT.iterator().next()))) {
                    g.X(sb);
                    sb.append(": ");
                    k.Y(collectionT, sb, ", ", null, null, new p114l9.e(gVar, 2), 60);
                }
            }
            gVar.i0(sb, listY);
        }
        return m.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0047  */
    @Override // L8.InterfaceC0278l
    public Object c(C0355k c0355k, Object obj) {
        boolean z6;
        C0355k c0355kU0;
        StringBuilder sb = (StringBuilder) obj;
        g gVar = (g) this.f12212t;
        gVar.getClass();
        gVar.y(sb, c0355k, null);
        p114l9.k kVar = gVar.a;
        u[] uVarArr = p114l9.k.f13005W;
        if (((Boolean) kVar.f13039o.a(uVarArr[13], kVar)).booleanValue() || c0355k.Q().m() != 2) {
            C0280n c0280nF = c0355k.f();
            i.e(c0280nF, "constructor.visibility");
            if (gVar.h0(c0280nF, sb)) {
                z6 = true;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        gVar.J(c0355k, sb);
        boolean zBooleanValue = ((Boolean) kVar.f13020O.a(uVarArr[39], kVar)).booleanValue();
        boolean z10 = c0355k.f3717V;
        boolean z11 = zBooleanValue || !z10 || z6;
        if (z11) {
            sb.append(gVar.I("constructor"));
        }
        InterfaceC0271e interfaceC0271eL1 = c0355k.v();
        i.e(interfaceC0271eL1, "constructor.containingDeclaration");
        if (((Boolean) kVar.f13050z.a(uVarArr[24], kVar)).booleanValue()) {
            if (z11) {
                sb.append(" ");
            }
            gVar.P(interfaceC0271eL1, sb, true);
            gVar.d0(c0355k.z(), sb, false);
        }
        List listH0 = c0355k.H0();
        i.e(listH0, "constructor.valueParameters");
        gVar.g0(listH0, c0355k.Z(), sb);
        if (((Boolean) kVar.f13041q.a(uVarArr[15], kVar)).booleanValue() && !z10 && (c0355kU0 = interfaceC0271eL1.u0()) != null) {
            List listH1 = c0355kU0.H0();
            i.e(listH1, "primaryConstructor.valueParameters");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listH1) {
                U u3 = (U) obj2;
                if (!u3.a1() && u3.f3689B == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(gVar.I("this"));
                sb.append(k.Z(arrayList, ", ", "(", ")", p114l9.f.f12977t, 24));
            }
        }
        if (((Boolean) kVar.f13050z.a(p114l9.k.f13005W[24], kVar)).booleanValue()) {
            gVar.i0(sb, c0355k.z());
        }
        return m.a;
    }

    @Override // p.B0
    public void d(l lVar, p136o.n nVar) {
        p136o.f fVar = (p136o.f) this.f12212t;
        fVar.f13476x.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.f13478z;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((p136o.e) arrayList.get(i10)).f13453b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        fVar.f13476x.postAtTime(new RunnableC0315y(this, i11 < arrayList.size() ? (p136o.e) arrayList.get(i11) : null, nVar, lVar, 7), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // ta.n
    public void e(org.jsoup.nodes.p pVar, int i10) {
        boolean z6 = pVar instanceof org.jsoup.nodes.r;
        StringBuilder sb = (StringBuilder) this.f12212t;
        if (z6) {
            org.jsoup.nodes.r rVar = (org.jsoup.nodes.r) pVar;
            String strC = rVar.C();
            if (org.jsoup.nodes.k.L(rVar.f13896s) || (rVar instanceof org.jsoup.nodes.d)) {
                sb.append(strC);
                return;
            } else {
                ra.a.a(strC, sb, org.jsoup.nodes.r.F(sb));
                return;
            }
        }
        if (pVar instanceof org.jsoup.nodes.k) {
            org.jsoup.nodes.k kVar = (org.jsoup.nodes.k) pVar;
            if (sb.length() > 0) {
                E e10 = kVar.f13880v;
                if ((e10.f14813u || e10.f14812t.equals("br")) && !org.jsoup.nodes.r.F(sb)) {
                    sb.append(' ');
                }
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public void f(Bundle bundle) {
        com.google.android.gms.common.api.internal.a aVar = (com.google.android.gms.common.api.internal.a) this.f12212t;
        ReentrantLock reentrantLock = aVar.f7931m;
        ReentrantLock reentrantLock2 = aVar.f7931m;
        reentrantLock.lock();
        try {
            aVar.f7929k = ConnectionResult.f7820w;
            com.google.android.gms.common.api.internal.a.i(aVar);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // ya.InterfaceC0885f
    public void g(InterfaceC0882c interfaceC0882c, Throwable th) {
        i.g(interfaceC0882c, "call");
        ((C0324g) this.f12212t).resumeWith(J7.a.d(th));
    }

    @Override // L8.InterfaceC0278l
    public Object h(q qVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        g gVar = (g) this.f12212t;
        gVar.getClass();
        gVar.y(sb, qVar, null);
        C0280n c0280n = qVar.f16124w;
        i.e(c0280n, "typeAlias.visibility");
        gVar.h0(c0280n, sb);
        gVar.K(qVar, sb);
        sb.append(gVar.I("typealias"));
        sb.append(" ");
        gVar.P(qVar, sb, true);
        gVar.d0(qVar.y(), sb, false);
        gVar.A(qVar, sb);
        sb.append(" = ");
        sb.append(gVar.Y(qVar.b1()));
        return m.a;
    }

    @Override // ta.n
    public void i(org.jsoup.nodes.p pVar, int i10) {
        if ((pVar instanceof org.jsoup.nodes.k) && ((org.jsoup.nodes.k) pVar).f13880v.f14813u && (pVar.r() instanceof org.jsoup.nodes.r)) {
            StringBuilder sb = (StringBuilder) this.f12212t;
            if (org.jsoup.nodes.r.F(sb)) {
                return;
            }
            sb.append(' ');
        }
    }

    @Override // L8.InterfaceC0278l
    public Object j(L l4, Object obj) {
        L(l4, (StringBuilder) obj, "getter");
        return m.a;
    }

    @Override // p136o.j
    public boolean k(l lVar, MenuItem menuItem) {
        boolean z6;
        boolean zOnMenuItemSelected;
        int i10 = 6;
        final int i11 = 0;
        final int i12 = 1;
        switch (this.f12211s) {
            case 6:
                p118m3.l lVar2 = ((NavigationView) this.f12212t).f9755B;
                if (lVar2 == null) {
                    return false;
                }
                int i13 = MainActivity.c0;
                MainActivity mainActivity = (MainActivity) ((C0187a) lVar2).f1398t;
                i.f(menuItem, "menu");
                switch (menuItem.getItemId()) {
                    case R.id.nav_drawer_about /* 2131362299 */:
                        D3.b.H(mainActivity, AboutActivity.class);
                        break;
                    case R.id.nav_drawer_chat /* 2131362300 */:
                        Intent intent = new Intent(mainActivity, (Class<?>) ChatActivity.class);
                        intent.putExtra(com.onesignal.inAppMessages.internal.display.impl.k.EVENT_TYPE_KEY, "discord");
                        mainActivity.startActivity(intent);
                        break;
                    case R.id.nav_drawer_comingsoon /* 2131362301 */:
                        D3.b.H(mainActivity, NewReleaseActivity.class);
                        break;
                    case R.id.nav_drawer_service /* 2131362302 */:
                        D3.b.H(mainActivity, ServiceActivity.class);
                        break;
                    case R.id.nav_drawer_settings /* 2131362303 */:
                        D3.b.H(mainActivity, SettingsActivity.class);
                        break;
                    case R.id.nav_drawer_stickers /* 2131362304 */:
                        Intent launchIntentForPackage = mainActivity.getPackageManager().getLaunchIntentForPackage("com.nekopoi.nephiphelia");
                        if (launchIntentForPackage != null) {
                            launchIntentForPackage.addFlags(268435456);
                            mainActivity.startActivity(launchIntentForPackage);
                        } else {
                            try {
                                mainActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.nekopoi.nephiphelia")));
                            } catch (Exception unused) {
                                b1 b1Var = mainActivity.f10193V;
                                if (b1Var == null) {
                                    i.n("binding");
                                    throw null;
                                }
                                p190t3.g.f((DrawerLayout) b1Var.f14039v, "Tidak ada Google Play Store").g();
                            }
                        }
                        break;
                    case R.id.nav_drawer_switch_theme /* 2131362305 */:
                        C0099h c0099h = new C0099h(mainActivity);
                        p156q0.M m2 = mainActivity.m();
                        i.e(m2, "getSupportFragmentManager(...)");
                        G7.g gVar = new G7.g();
                        List list = (List) c0099h.f104u;
                        int size = list.size();
                        int[] iArr = new int[size];
                        Iterator it = list.iterator();
                        while (i11 < size) {
                            iArr[i11] = Color.parseColor((String) it.next());
                            i11++;
                        }
                        gVar.f1714K0 = new G7.c(gVar, iArr, new A0.m(c0099h, 9));
                        gVar.n0(m2, "ColorSheet");
                        break;
                }
                b1 b1Var2 = mainActivity.f10193V;
                if (b1Var2 != null) {
                    ((DrawerLayout) b1Var2.f14039v).d();
                    return true;
                }
                i.n("binding");
                throw null;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                InterfaceC0715m interfaceC0715m = ((ActionMenuView) this.f12212t).f6139S;
                if (interfaceC0715m == null) {
                    return false;
                }
                Toolbar toolbar = (Toolbar) ((p102k7.e) interfaceC0715m).f12743s;
                Iterator it2 = ((CopyOnWriteArrayList) toolbar.f6227b0.f104u).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z6 = false;
                    } else if (((p156q0.E) it2.next()).a.p(menuItem)) {
                        z6 = true;
                    }
                }
                if (z6) {
                    zOnMenuItemSelected = true;
                } else {
                    V0 v4 = toolbar.f6228d0;
                    zOnMenuItemSelected = v4 != null ? ((p078i.L) v4).a.f11984c.f12121s.onMenuItemSelected(0, menuItem) : false;
                }
                return zOnMenuItemSelected;
            default:
                C0187a c0187a = (C0187a) ((Y1.c) this.f12212t).f5672v;
                if (c0187a == null) {
                    return false;
                }
                switch (c0187a.f1397s) {
                    case 7:
                        TabsBookmarkFragment tabsBookmarkFragment = (TabsBookmarkFragment) c0187a.f1398t;
                        i.f(tabsBookmarkFragment, "this$0");
                        int itemId = menuItem.getItemId();
                        ArrayList arrayList = tabsBookmarkFragment.f10247w0;
                        switch (itemId) {
                            case R.id.menu_bookmark_type_all /* 2131362248 */:
                                tabsBookmarkFragment.f10248x0 = "all";
                                ((Chip) tabsBookmarkFragment.g0().f1660u).setText("Semua");
                                break;
                            case R.id.menu_bookmark_type_episodes /* 2131362249 */:
                                tabsBookmarkFragment.f10248x0 = "episodes";
                                ((Chip) tabsBookmarkFragment.g0().f1660u).setText("Episodes");
                                if (arrayList.size() > 1) {
                                    p086i8.p.I(arrayList, new C0212f(i10));
                                }
                                Ca.c cVar = tabsBookmarkFragment.f10246v0;
                                if (cVar == null) {
                                    i.n("adapters");
                                    throw null;
                                }
                                cVar.q();
                                break;
                                break;
                            case R.id.menu_bookmark_type_series /* 2131362250 */:
                                tabsBookmarkFragment.f10248x0 = "series";
                                ((Chip) tabsBookmarkFragment.g0().f1660u).setText("Series");
                                if (arrayList.size() > 1) {
                                    p086i8.p.I(arrayList, new C0212f(5));
                                }
                                Ca.c cVar2 = tabsBookmarkFragment.f10246v0;
                                if (cVar2 == null) {
                                    i.n("adapters");
                                    throw null;
                                }
                                cVar2.q();
                                break;
                                break;
                        }
                        break;
                    default:
                        final TabsDownloadsFragment tabsDownloadsFragment = (TabsDownloadsFragment) c0187a.f1398t;
                        i.f(tabsDownloadsFragment, "this$0");
                        switch (menuItem.getItemId()) {
                            case R.id.menu_download_option_delete_all /* 2131362251 */:
                                p041e3.b bVar = new p041e3.b(tabsDownloadsFragment.X());
                                C0650g c0650g = (C0650g) bVar.f123t;
                                c0650g.f12042d = "Hapus semua";
                                c0650g.f12044f = "Hapus semua file?";
                                bVar.i("Hapus", new DialogInterface.OnClickListener() { // from class: J4.i
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        switch (i12) {
                                            case 0:
                                                TabsDownloadsFragment tabsDownloadsFragment2 = tabsDownloadsFragment;
                                                p210v8.i.f(tabsDownloadsFragment2, "this$0");
                                                ArrayList arrayList2 = tabsDownloadsFragment2.f10251v0;
                                                if (i14 == 0) {
                                                    if (arrayList2.size() > 1) {
                                                        p086i8.p.I(arrayList2, new C0212f(9));
                                                    }
                                                    Ca.c cVar3 = tabsDownloadsFragment2.f10250u0;
                                                    if (cVar3 != null) {
                                                        cVar3.q();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (i14 == 1) {
                                                    if (arrayList2.size() > 1) {
                                                        p086i8.p.I(arrayList2, new C0212f(10));
                                                    }
                                                    Ca.c cVar4 = tabsDownloadsFragment2.f10250u0;
                                                    if (cVar4 != null) {
                                                        cVar4.q();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (i14 != 2) {
                                                    return;
                                                }
                                                if (arrayList2.size() > 1) {
                                                    p086i8.p.I(arrayList2, new C0212f(11));
                                                }
                                                Ca.c cVar5 = tabsDownloadsFragment2.f10250u0;
                                                if (cVar5 != null) {
                                                    cVar5.q();
                                                    return;
                                                }
                                                return;
                                            default:
                                                TabsDownloadsFragment tabsDownloadsFragment3 = tabsDownloadsFragment;
                                                p210v8.i.f(tabsDownloadsFragment3, "this$0");
                                                File file = tabsDownloadsFragment3.f10253x0;
                                                if (file == null) {
                                                    p210v8.i.n("path");
                                                    throw null;
                                                }
                                                s8.h.B(file);
                                                Ca.c cVar6 = tabsDownloadsFragment3.f10250u0;
                                                if (cVar6 != null) {
                                                    cVar6.f1031i.clear();
                                                    cVar6.q();
                                                }
                                                dialogInterface.dismiss();
                                                return;
                                        }
                                    }
                                });
                                bVar.h("Batal", new F4.c(6));
                                bVar.g();
                                break;
                            case R.id.menu_download_option_sort /* 2131362252 */:
                                p041e3.b bVar2 = new p041e3.b(tabsDownloadsFragment.X());
                                C0650g c0650g2 = (C0650g) bVar2.f123t;
                                c0650g2.f12042d = "Sortir";
                                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: J4.i
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i14) {
                                        switch (i11) {
                                            case 0:
                                                TabsDownloadsFragment tabsDownloadsFragment2 = tabsDownloadsFragment;
                                                p210v8.i.f(tabsDownloadsFragment2, "this$0");
                                                ArrayList arrayList2 = tabsDownloadsFragment2.f10251v0;
                                                if (i14 == 0) {
                                                    if (arrayList2.size() > 1) {
                                                        p086i8.p.I(arrayList2, new C0212f(9));
                                                    }
                                                    Ca.c cVar3 = tabsDownloadsFragment2.f10250u0;
                                                    if (cVar3 != null) {
                                                        cVar3.q();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (i14 == 1) {
                                                    if (arrayList2.size() > 1) {
                                                        p086i8.p.I(arrayList2, new C0212f(10));
                                                    }
                                                    Ca.c cVar4 = tabsDownloadsFragment2.f10250u0;
                                                    if (cVar4 != null) {
                                                        cVar4.q();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                if (i14 != 2) {
                                                    return;
                                                }
                                                if (arrayList2.size() > 1) {
                                                    p086i8.p.I(arrayList2, new C0212f(11));
                                                }
                                                Ca.c cVar5 = tabsDownloadsFragment2.f10250u0;
                                                if (cVar5 != null) {
                                                    cVar5.q();
                                                    return;
                                                }
                                                return;
                                            default:
                                                TabsDownloadsFragment tabsDownloadsFragment3 = tabsDownloadsFragment;
                                                p210v8.i.f(tabsDownloadsFragment3, "this$0");
                                                File file = tabsDownloadsFragment3.f10253x0;
                                                if (file == null) {
                                                    p210v8.i.n("path");
                                                    throw null;
                                                }
                                                s8.h.B(file);
                                                Ca.c cVar6 = tabsDownloadsFragment3.f10250u0;
                                                if (cVar6 != null) {
                                                    cVar6.f1031i.clear();
                                                    cVar6.q();
                                                }
                                                dialogInterface.dismiss();
                                                return;
                                        }
                                    }
                                };
                                c0650g2.f12052o = new String[]{"Nama", "Ukuran", "Tanggal"};
                                c0650g2.f12054q = onClickListener;
                                bVar2.g();
                                break;
                        }
                        break;
                }
                return true;
        }
    }

    @Override // L8.InterfaceC0278l
    public Object l(z zVar, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        g gVar = (g) this.f12212t;
        gVar.getClass();
        gVar.T(zVar.f3796v, "package", sb);
        if (gVar.a.n()) {
            sb.append(" in context of ");
            gVar.P(zVar.f3795u, sb, false);
        }
        return m.a;
    }

    @Override // p247z9.n
    public void lock() {
        ((ReentrantLock) this.f12212t).lock();
    }

    @Override // ya.InterfaceC0885f
    public void m(InterfaceC0882c interfaceC0882c, ya.L l4) {
        i.g(interfaceC0882c, "call");
        ((C0324g) this.f12212t).resumeWith(l4);
    }

    @Override // p.B0
    public void n(l lVar, p136o.n nVar) {
        ((p136o.f) this.f12212t).f13476x.removeCallbacksAndMessages(lVar);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public void o(ConnectionResult connectionResult) {
        com.google.android.gms.common.api.internal.a aVar = (com.google.android.gms.common.api.internal.a) this.f12212t;
        ReentrantLock reentrantLock = aVar.f7931m;
        ReentrantLock reentrantLock2 = aVar.f7931m;
        reentrantLock.lock();
        try {
            aVar.f7929k = connectionResult;
            com.google.android.gms.common.api.internal.a.i(aVar);
        } finally {
            reentrantLock2.unlock();
        }
    }

    @Override // p163q7.j
    public boolean p() {
        return ((p102k7.c) this.f12212t).f12733s;
    }

    @Override // org.chromium.net.c
    public FileChannel q() {
        return new FileInputStream((File) this.f12212t).getChannel();
    }

    @Override // p136o.j
    public void r(l lVar) {
        switch (this.f12211s) {
            case 6:
                break;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                p136o.j jVar = ((ActionMenuView) this.f12212t).f6135N;
                if (jVar != null) {
                    jVar.r(lVar);
                }
                break;
        }
    }

    @Override // L8.InterfaceC0278l
    public Object s(C c10, Object obj) {
        ((g) this.f12212t).P(c10, (StringBuilder) obj, true);
        return m.a;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public void t(int i10) {
        com.google.android.gms.common.api.internal.a aVar = (com.google.android.gms.common.api.internal.a) this.f12212t;
        ReentrantLock reentrantLock = aVar.f7931m;
        ReentrantLock reentrantLock2 = aVar.f7931m;
        reentrantLock.lock();
        try {
            if (aVar.f7930l) {
                aVar.f7930l = false;
                com.google.android.gms.common.api.internal.a.h(aVar, i10);
            } else {
                aVar.f7930l = true;
                aVar.f7923d.onConnectionSuspended(i10);
            }
        } finally {
            reentrantLock2.unlock();
        }
    }

    public String toString() {
        String str;
        switch (this.f12211s) {
            case 24:
                StringBuilder sb = new StringBuilder("NotNullProperty(");
                if (this.f12212t != null) {
                    str = "value=" + this.f12212t;
                } else {
                    str = "value not initialized yet";
                }
                return AbstractC0487g.j(sb, str, ')');
            default:
                return super.toString();
        }
    }

    @Override // L8.InterfaceC0278l
    public Object u(AbstractC0354j abstractC0354j, Object obj) {
        ((g) this.f12212t).b0(abstractC0354j, (StringBuilder) obj, true);
        return m.a;
    }

    @Override // p247z9.n
    public void unlock() {
        ((ReentrantLock) this.f12212t).unlock();
    }

    public synchronized void v() {
        ((SharedPreferences) this.f12212t).edit().clear().commit();
    }

    public void w(AbstractC0675d abstractC0675d) {
        if (!abstractC0675d.m()) {
            if (!(abstractC0675d instanceof p104k9.x)) {
                String strValueOf = String.valueOf(abstractC0675d.getClass());
                throw new IllegalArgumentException(E0.a.l(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
            }
            p104k9.x xVar = (p104k9.x) abstractC0675d;
            w(xVar.f12830u);
            w(xVar.f12831v);
            return;
        }
        int size = abstractC0675d.size();
        int[] iArr = p104k9.x.f12828z;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i10 = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.f12212t;
        if (stack.isEmpty() || ((AbstractC0675d) stack.peek()).size() >= i10) {
            stack.push(abstractC0675d);
            return;
        }
        int i11 = iArr[iBinarySearch];
        AbstractC0675d xVar2 = (AbstractC0675d) stack.pop();
        while (!stack.isEmpty() && ((AbstractC0675d) stack.peek()).size() < i11) {
            xVar2 = new p104k9.x((AbstractC0675d) stack.pop(), xVar2);
        }
        p104k9.x xVar3 = new p104k9.x(xVar2, abstractC0675d);
        while (!stack.isEmpty()) {
            int[] iArr2 = p104k9.x.f12828z;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, xVar3.f12829t);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((AbstractC0675d) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                xVar3 = new p104k9.x((AbstractC0675d) stack.pop(), xVar3);
            }
        }
        stack.push(xVar3);
    }

    @Override // L8.InterfaceC0278l
    public Object x(O8.E e10, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        g gVar = (g) this.f12212t;
        gVar.getClass();
        gVar.T(e10.f3634w, "package-fragment", sb);
        if (gVar.a.n()) {
            sb.append(" in ");
            gVar.P(e10.v(), sb, false);
        }
        return m.a;
    }

    public Object y(u uVar, Object obj) {
        i.f(uVar, "property");
        Object obj2 = this.f12212t;
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalStateException("Property " + uVar.getName() + " should be initialized before get.");
    }

    @Override // L8.InterfaceC0278l
    public Object z(U u3, Object obj) {
        ((g) this.f12212t).f0(u3, true, (StringBuilder) obj, true);
        return m.a;
    }

    public b(Context context) {
        boolean zIsEmpty;
        this.f12211s = 10;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f12212t = sharedPreferences;
        File file = new File(J.a.c(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                v();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e10.getMessage();
            }
        }
    }

    public b(EditText editText) {
        this.f12211s = 7;
        o1.k kVar = new o1.k();
        kVar.f13638s = editText;
        p126n0.i iVar = new p126n0.i(editText);
        kVar.f13639t = iVar;
        editText.addTextChangedListener(iVar);
        if (p126n0.a.f13286b == null) {
            synchronized (p126n0.a.a) {
                try {
                    if (p126n0.a.f13286b == null) {
                        p126n0.a aVar = new p126n0.a();
                        try {
                            p126n0.a.f13287c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, p126n0.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        p126n0.a.f13286b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(p126n0.a.f13286b);
        this.f12212t = kVar;
    }

    private final void H(l lVar) {
    }

    private final void I(l lVar) {
    }

    public b(int i10) {
        this.f12211s = i10;
        switch (i10) {
            case 24:
                break;
            default:
                this.f12212t = new Stack();
                break;
        }
    }
}
