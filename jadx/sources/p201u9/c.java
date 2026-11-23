package p201u9;

import A9.AbstractC0151y;
import A9.D;
import L8.InterfaceC0271e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class c implements d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC0271e f15361s;

    public c(InterfaceC0271e interfaceC0271e) {
        i.f(interfaceC0271e, "classDescriptor");
        this.f15361s = interfaceC0271e;
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return i.a(this.f15361s, cVar != null ? cVar.f15361s : null);
    }

    @Override // p201u9.d
    public final AbstractC0151y getType() {
        D dP = this.f15361s.p();
        i.e(dP, "classDescriptor.defaultType");
        return dP;
    }

    public final int hashCode() {
        return this.f15361s.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Class{");
        D dP = this.f15361s.p();
        i.e(dP, "classDescriptor.defaultType");
        sb.append(dP);
        sb.append('}');
        return sb.toString();
    }
}
