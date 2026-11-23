package L8;

import com.google.gson.JsonIOException;

/* JADX INFO: renamed from: L8.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0289x implements O0.e, com.google.gson.internal.l {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f2840s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f2841t;

    public /* synthetic */ C0289x(String str, int i10) {
        this.f2840s = i10;
        this.f2841t = str;
    }

    @Override // O0.e
    public String a() {
        return this.f2841t;
    }

    @Override // com.google.gson.internal.l
    public Object n() {
        throw new JsonIOException(this.f2841t);
    }

    public String toString() {
        switch (this.f2840s) {
            case 0:
                return this.f2841t;
            default:
                return super.toString();
        }
    }

    public C0289x(String str) {
        this.f2840s = 1;
        p210v8.i.f(str, "query");
        this.f2841t = str;
    }

    @Override // O0.e
    public void b(O0.d dVar) {
    }
}
