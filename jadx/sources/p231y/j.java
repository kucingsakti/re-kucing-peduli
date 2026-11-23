package p231y;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ k f15827z;

    public j(k kVar) {
        this.f15827z = kVar;
    }

    @Override // p231y.h
    public final String m() {
        i iVar = (i) this.f15827z.f15828s.get();
        if (iVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + iVar.a + "]";
    }
}
