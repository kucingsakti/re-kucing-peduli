package G9;

import androidx.datastore.preferences.protobuf.AbstractC0487g;

/* JADX INFO: loaded from: classes.dex */
public final class y extends n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1804c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1805d;

    /* JADX WARN: Illegal instructions before constructor call */
    public y(int i10) {
        StringBuilder sbL = AbstractC0487g.l("must have at least ", i10, " value parameter");
        sbL.append(i10 > 1 ? "s" : "");
        super(sbL.toString(), 1);
        this.f1805d = i10;
    }

    @Override // G9.e
    public final boolean a(W8.f fVar) {
        switch (this.f1804c) {
            case 0:
                return fVar.H0().size() >= this.f1805d;
            default:
                return fVar.H0().size() == this.f1805d;
        }
    }

    public y() {
        super("must have exactly 2 value parameters", 1);
        this.f1805d = 2;
    }
}
