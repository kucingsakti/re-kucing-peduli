package p114l9;

import C8.u;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class j {
    public Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f13004b;

    public j(Object obj, k kVar) {
        this.f13004b = kVar;
        this.a = obj;
    }

    public final Object a(u uVar, Object obj) {
        i.f(uVar, "property");
        return this.a;
    }

    public final void b(u uVar, Object obj) {
        i.f(uVar, "property");
        if (this.f13004b.a) {
            throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        this.a = obj;
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.a + ')';
    }
}
