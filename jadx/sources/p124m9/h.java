package p124m9;

import C3.a;
import L8.InterfaceC0271e;
import L8.InterfaceC0275i;
import L8.InterfaceC0276j;
import L8.InterfaceC0285t;
import L8.K;
import java.util.Comparator;
import p165q9.d;
import p238y9.q;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f13168b = new h(0);
    public final /* synthetic */ int a;

    public /* synthetic */ h(int i10) {
        this.a = i10;
    }

    public static int a(InterfaceC0276j interfaceC0276j) {
        if (e.m(interfaceC0276j)) {
            return 8;
        }
        if (interfaceC0276j instanceof InterfaceC0275i) {
            return 7;
        }
        if (interfaceC0276j instanceof K) {
            return ((K) interfaceC0276j).R() == null ? 6 : 5;
        }
        if (interfaceC0276j instanceof InterfaceC0285t) {
            return ((InterfaceC0285t) interfaceC0276j).R() == null ? 4 : 3;
        }
        if (interfaceC0276j instanceof InterfaceC0271e) {
            return 2;
        }
        return interfaceC0276j instanceof q ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer numValueOf;
        switch (this.a) {
            case 0:
                InterfaceC0276j interfaceC0276j = (InterfaceC0276j) obj;
                InterfaceC0276j interfaceC0276j2 = (InterfaceC0276j) obj2;
                int iA = a(interfaceC0276j2) - a(interfaceC0276j);
                if (iA != 0) {
                    numValueOf = Integer.valueOf(iA);
                } else if (e.n(interfaceC0276j, 4) && e.n(interfaceC0276j2, 4)) {
                    numValueOf = 0;
                } else {
                    int iCompareTo = interfaceC0276j.getName().f12551s.compareTo(interfaceC0276j2.getName().f12551s);
                    numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
                }
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                return 0;
            default:
                return a.d(d.g((InterfaceC0271e) obj).b(), d.g((InterfaceC0271e) obj2).b());
        }
    }
}
