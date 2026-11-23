package Y8;

import A9.AbstractC0151y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x {
    public final AbstractC0151y a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5812c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f5813d;

    public x(AbstractC0151y abstractC0151y, List list, ArrayList arrayList, List list2) {
        this.a = abstractC0151y;
        this.f5811b = list;
        this.f5812c = arrayList;
        this.f5813d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.a.equals(xVar.a) && this.f5811b.equals(xVar.f5811b) && this.f5812c.equals(xVar.f5812c) && this.f5813d.equals(xVar.f5813d);
    }

    public final int hashCode() {
        return this.f5813d.hashCode() + ((this.f5812c.hashCode() + ((this.f5811b.hashCode() + (this.a.hashCode() * 961)) * 31)) * 961);
    }

    public final String toString() {
        return "MethodSignatureData(returnType=" + this.a + ", receiverType=null, valueParameters=" + this.f5811b + ", typeParameters=" + this.f5812c + ", hasStableParameterNames=false, errors=" + this.f5813d + ')';
    }
}
