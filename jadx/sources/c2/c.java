package c2;

import java.util.List;
import p086i8.s;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f7436c;
    public final Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7437b;

    static {
        s sVar = s.f12328s;
        f7436c = new c(sVar, sVar);
    }

    public c(List list, List list2) {
        this.a = list;
        this.f7437b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.f7437b.equals(cVar.f7437b);
    }

    public final int hashCode() {
        return this.f7437b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CpuInfo(commonInfo=" + this.a + ", perProcessorInfo=" + this.f7437b + ')';
    }
}
