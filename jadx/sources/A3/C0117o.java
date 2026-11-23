package A3;

/* JADX INFO: renamed from: A3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0117o extends AbstractC0103a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AbstractC0119q f275u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0117o(AbstractC0119q abstractC0119q, int i10, int i11) {
        super(i10, i11);
        this.f275u = abstractC0119q;
    }

    @Override // A3.AbstractC0103a
    public final Object a(int i10) {
        return this.f275u.get(i10);
    }
}
