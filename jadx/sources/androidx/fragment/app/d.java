package androidx.fragment.app;

import android.os.Bundle;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p156q0.C0742a;
import p156q0.J;
import p156q0.P;

/* JADX INFO: loaded from: classes.dex */
public final class d implements J {
    public final /* synthetic */ int a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f6660c;

    public /* synthetic */ d(e eVar, String str, int i10) {
        this.a = i10;
        this.f6660c = eVar;
        this.f6659b = str;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    @Override // p156q0.J
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) throws Throwable {
        int i10;
        Iterator it;
        int i11;
        switch (this.a) {
            case 0:
                e eVar = this.f6660c;
                BackStackState backStackState = (BackStackState) eVar.f6685l.remove(this.f6659b);
                boolean z6 = false;
                if (backStackState != null) {
                    HashMap map = new HashMap();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C0742a c0742a = (C0742a) it2.next();
                        if (c0742a.f14312u) {
                            Iterator it3 = c0742a.a.iterator();
                            while (it3.hasNext()) {
                                b bVar = ((P) it3.next()).f14269b;
                                if (bVar != null) {
                                    map.put(bVar.f6655x, bVar);
                                }
                            }
                        }
                    }
                    ArrayList<String> arrayList3 = backStackState.f6576s;
                    HashMap map2 = new HashMap(arrayList3.size());
                    for (String str : arrayList3) {
                        b bVar2 = (b) map.get(str);
                        if (bVar2 != null) {
                            map2.put(bVar2.f6655x, bVar2);
                        } else {
                            Bundle bundleA = eVar.f6677c.A(str, null);
                            if (bundleA != null) {
                                ClassLoader classLoader = eVar.f6696w.f14369t.getClassLoader();
                                b bVarA = ((FragmentState) bundleA.getParcelable(AdOperationMetric.INIT_STATE)).a(eVar.I());
                                bVarA.f6651t = bundleA;
                                if (bundleA.getBundle("savedInstanceState") == null) {
                                    bVarA.f6651t.putBundle("savedInstanceState", new Bundle());
                                }
                                Bundle bundle = bundleA.getBundle("arguments");
                                if (bundle != null) {
                                    bundle.setClassLoader(classLoader);
                                }
                                bVarA.b0(bundle);
                                map2.put(bVarA.f6655x, bVarA);
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (BackStackRecordState backStackRecordState : backStackState.f6577t) {
                        backStackRecordState.getClass();
                        C0742a c0742a2 = new C0742a(eVar);
                        backStackRecordState.a(c0742a2);
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList5 = backStackRecordState.f6569t;
                            if (i12 < arrayList5.size()) {
                                String str2 = (String) arrayList5.get(i12);
                                if (str2 != null) {
                                    b bVar3 = (b) map2.get(str2);
                                    if (bVar3 == null) {
                                        throw new IllegalStateException("Restoring FragmentTransaction " + backStackRecordState.f6573x + " failed due to missing saved state for Fragment (" + str2 + ")");
                                    }
                                    ((P) c0742a2.a.get(i12)).f14269b = bVar3;
                                }
                                i12++;
                            }
                        }
                        arrayList4.add(c0742a2);
                    }
                    Iterator it4 = arrayList4.iterator();
                    while (it4.hasNext()) {
                        ((C0742a) it4.next()).a(arrayList, arrayList2);
                        z6 = true;
                    }
                }
                return z6;
            default:
                e eVar2 = this.f6660c;
                String str3 = this.f6659b;
                int iC = eVar2.C(str3, true, -1);
                if (iC < 0) {
                    return false;
                }
                int i13 = iC;
                while (true) {
                    Throwable th = null;
                    if (i13 >= eVar2.f6678d.size()) {
                        HashSet hashSet = new HashSet();
                        int i14 = iC;
                        while (i14 < eVar2.f6678d.size()) {
                            C0742a c0742a3 = (C0742a) eVar2.f6678d.get(i14);
                            HashSet hashSet2 = new HashSet();
                            HashSet hashSet3 = new HashSet();
                            Iterator it5 = c0742a3.a.iterator();
                            while (it5.hasNext()) {
                                P p10 = (P) it5.next();
                                th = th;
                                b bVar4 = p10.f14269b;
                                if (bVar4 != null) {
                                    if (p10.f14270c) {
                                        i10 = i14;
                                        int i15 = p10.a;
                                        it = it5;
                                        if (i15 == 1 || i15 == 2 || i15 == 8) {
                                        }
                                        i11 = p10.a;
                                        if (i11 != 1 || i11 == 2) {
                                            hashSet3.add(bVar4);
                                        }
                                        i14 = i10;
                                        it5 = it;
                                    } else {
                                        i10 = i14;
                                        it = it5;
                                    }
                                    hashSet.add(bVar4);
                                    hashSet2.add(bVar4);
                                    i11 = p10.a;
                                    if (i11 != 1) {
                                        hashSet3.add(bVar4);
                                    } else {
                                        hashSet3.add(bVar4);
                                    }
                                    i14 = i10;
                                    it5 = it;
                                }
                            }
                            int i16 = i14;
                            Throwable th2 = th;
                            hashSet2.removeAll(hashSet3);
                            if (!hashSet2.isEmpty()) {
                                StringBuilder sbM = AbstractC0487g.m("saveBackStack(\"", str3, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                                sbM.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                                sbM.append(" in ");
                                sbM.append(c0742a3);
                                sbM.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                                eVar2.f0(new IllegalArgumentException(sbM.toString()));
                                throw th2;
                            }
                            i14 = i16 + 1;
                            th = th2;
                        }
                        Throwable th3 = th;
                        ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                        while (!arrayDeque.isEmpty()) {
                            b bVar5 = (b) arrayDeque.removeFirst();
                            if (bVar5.f6630W) {
                                StringBuilder sbM2 = AbstractC0487g.m("saveBackStack(\"", str3, "\") must not contain retained fragments. Found ");
                                sbM2.append(hashSet.contains(bVar5) ? "direct reference to retained " : "retained child ");
                                sbM2.append("fragment ");
                                sbM2.append(bVar5);
                                eVar2.f0(new IllegalArgumentException(sbM2.toString()));
                                throw th3;
                            }
                            for (b bVar6 : bVar5.P.f6677c.k()) {
                                if (bVar6 != null) {
                                    arrayDeque.addLast(bVar6);
                                }
                            }
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it6 = hashSet.iterator();
                        while (it6.hasNext()) {
                            arrayList6.add(((b) it6.next()).f6655x);
                        }
                        ArrayList arrayList7 = new ArrayList(eVar2.f6678d.size() - iC);
                        for (int i17 = iC; i17 < eVar2.f6678d.size(); i17++) {
                            arrayList7.add(th3);
                        }
                        BackStackState backStackState2 = new BackStackState(arrayList6, arrayList7);
                        for (int size = eVar2.f6678d.size() - 1; size >= iC; size--) {
                            C0742a c0742a4 = (C0742a) eVar2.f6678d.remove(size);
                            C0742a c0742a5 = new C0742a(c0742a4);
                            c0742a5.e();
                            arrayList7.set(size - iC, new BackStackRecordState(c0742a5));
                            c0742a4.f14312u = true;
                            arrayList.add(c0742a4);
                            arrayList2.add(Boolean.TRUE);
                        }
                        eVar2.f6685l.put(str3, backStackState2);
                        return true;
                    }
                    C0742a c0742a6 = (C0742a) eVar2.f6678d.get(i13);
                    if (!c0742a6.f14307p) {
                        eVar2.f0(new IllegalArgumentException("saveBackStack(\"" + str3 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + c0742a6 + " that did not use setReorderingAllowed(true)."));
                        throw null;
                    }
                    i13++;
                }
                break;
        }
    }
}
