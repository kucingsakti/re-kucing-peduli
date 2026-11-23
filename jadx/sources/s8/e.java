package s8;

import K9.k;
import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;
import p086i8.AbstractC0662a;
import p086i8.D;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC0662a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ArrayDeque f14735u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ k f14736v;

    public e(k kVar) {
        this.f14736v = kVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f14735u = arrayDeque;
        if (((File) kVar.f2693b).isDirectory()) {
            arrayDeque.push(b((File) kVar.f2693b));
        } else {
            if (!((File) kVar.f2693b).isFile()) {
                this.f12313s = D.f12310u;
                return;
            }
            File file = (File) kVar.f2693b;
            i.f(file, "rootFile");
            arrayDeque.push(new c(file));
        }
    }

    @Override // p086i8.AbstractC0662a
    public final void a() {
        File file;
        while (true) {
            ArrayDeque arrayDeque = this.f14735u;
            f fVar = (f) arrayDeque.peek();
            if (fVar != null) {
                File fileA = fVar.a();
                if (fileA != null) {
                    if (!fileA.equals(fVar.a) && fileA.isDirectory()) {
                        int size = arrayDeque.size();
                        this.f14736v.getClass();
                        if (size < Integer.MAX_VALUE) {
                            arrayDeque.push(b(fileA));
                        }
                    }
                    file = fileA;
                    break;
                }
                arrayDeque.pop();
            } else {
                file = null;
                break;
            }
        }
        if (file == null) {
            this.f12313s = D.f12310u;
        } else {
            this.f12314t = file;
            this.f12313s = D.f12308s;
        }
    }

    public final a b(File file) {
        int iOrdinal = ((g) this.f14736v.f2694c).ordinal();
        if (iOrdinal == 0) {
            return new d(this, file);
        }
        if (iOrdinal == 1) {
            return new b(this, file);
        }
        throw new NoWhenBranchMatchedException();
    }
}
