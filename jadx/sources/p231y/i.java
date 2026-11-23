package p231y;

import p157q1.b;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public Object a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f15824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f15825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15826d;

    public final void finalize() {
        l lVar;
        k kVar = this.f15824b;
        if (kVar != null) {
            j jVar = kVar.f15829t;
            if (!jVar.isDone()) {
                jVar.p(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 2));
            }
        }
        if (this.f15826d || (lVar = this.f15825c) == null) {
            return;
        }
        lVar.o(null);
    }
}
