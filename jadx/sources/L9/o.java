package L9;

import N9.InterfaceC0327j;
import N9.b0;
import N9.c0;
import N9.k0;
import S9.r;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p210v8.k implements p200u8.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2856s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f2857t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Object obj, int i10) {
        super(2);
        this.f2856s = i10;
        this.f2857t = obj;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0113 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0115 A[LOOP:1: B:46:0x00e0->B:57:0x0115, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x015c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x015c A[SYNTHETIC] */
    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        Object next;
        p076h8.f fVar;
        Object next2;
        String str;
        String str2;
        switch (this.f2856s) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Number) obj2).intValue();
                p210v8.i.f(charSequence, "$this$$receiver");
                int iQ = f.Q(charSequence, (char[]) this.f2857t, iIntValue, false);
                if (iQ < 0) {
                    return null;
                }
                return new p076h8.f(Integer.valueOf(iQ), 1);
            case 1:
                CharSequence charSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                p210v8.i.f(charSequence2, "$this$$receiver");
                List list = (List) this.f2857t;
                if (list.size() == 1) {
                    String str3 = (String) p086i8.k.j0(list);
                    int iP = f.P(charSequence2, str3, iIntValue2, false, 4);
                    if (iP < 0) {
                        fVar = null;
                    } else {
                        fVar = new p076h8.f(Integer.valueOf(iP), str3);
                    }
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    B8.c cVar = new B8.c(iIntValue2, charSequence2.length(), 1);
                    boolean z6 = charSequence2 instanceof String;
                    int i11 = cVar.f771u;
                    int i12 = cVar.f770t;
                    if (z6) {
                        if ((i11 <= 0 || iIntValue2 > i12) && (i11 >= 0 || i12 > iIntValue2)) {
                            fVar = null;
                        } else {
                            int i13 = iIntValue2;
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str2 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str = (String) next2;
                                    if (str != null) {
                                        fVar = new p076h8.f(Integer.valueOf(i13), str);
                                    } else if (i13 != i12) {
                                        i13 += i11;
                                    } else {
                                        fVar = null;
                                    }
                                } while (!n.E(0, i13, str2.length(), str2, (String) charSequence2, false));
                                str = (String) next2;
                                if (str != null) {
                                    fVar = new p076h8.f(Integer.valueOf(i13), str);
                                } else if (i13 != i12) {
                                    i13 += i11;
                                } else {
                                    fVar = null;
                                }
                            }
                        }
                    } else if ((i11 <= 0 || iIntValue2 > i12) && (i11 >= 0 || i12 > iIntValue2)) {
                        fVar = null;
                    } else {
                        int i14 = iIntValue2;
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    int i15 = i11;
                                    String str4 = (String) next;
                                    i10 = i15;
                                    if (!f.V(str4, 0, charSequence2, i14, str4.length(), false)) {
                                        i11 = i10;
                                    }
                                } else {
                                    i10 = i11;
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                fVar = new p076h8.f(Integer.valueOf(i14), str5);
                            } else if (i14 != i12) {
                                i14 += i10;
                                i11 = i10;
                            } else {
                                fVar = null;
                            }
                        }
                    }
                }
                if (fVar != null) {
                    return new p076h8.f(fVar.f11789s, Integer.valueOf(((String) fVar.f11790t).length()));
                }
                return null;
            default:
                int iIntValue3 = ((Number) obj).intValue();
                p123m8.g gVar = (p123m8.g) obj2;
                p123m8.h key = gVar.getKey();
                p123m8.g gVar2 = ((R9.g) this.f2857t).f4487t.get(key);
                if (key != b0.f3440s) {
                    return Integer.valueOf(gVar != gVar2 ? Integer.MIN_VALUE : iIntValue3 + 1);
                }
                c0 c0Var = (c0) gVar2;
                c0 parent = (c0) gVar;
                while (true) {
                    if (parent == null) {
                        parent = null;
                    } else if (parent != c0Var && (parent instanceof r)) {
                        InterfaceC0327j interfaceC0327j = (InterfaceC0327j) k0.f3470t.get((k0) parent);
                        parent = interfaceC0327j != null ? interfaceC0327j.getParent() : null;
                    }
                }
                if (parent == c0Var) {
                    if (c0Var != null) {
                        iIntValue3++;
                    }
                    return Integer.valueOf(iIntValue3);
                }
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + c0Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }
    }
}
