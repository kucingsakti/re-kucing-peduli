package M7;

import java.io.PrintStream;
import java.io.PrintWriter;
import p068ga.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3182c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, int i10) {
        super(3);
        this.f3181b = i10;
        this.f3182c = obj;
    }

    @Override // p068ga.d
    public final void y(String str) {
        switch (this.f3181b) {
            case 0:
                ((PrintStream) this.f3182c).println((Object) str);
                break;
            default:
                ((PrintWriter) this.f3182c).println((Object) str);
                break;
        }
    }
}
