package Ca;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import com.kcstream.cing.R;
import java.util.List;
import p210v8.i;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f1022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f1024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f1025n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(List list) {
        super(list);
        i.g(list, "items");
        this.j = Integer.MAX_VALUE;
        this.f1022k = true;
        this.f1025n = R.layout.load_more_view;
    }

    @Override // Ca.c, androidx.recyclerview.widget.s
    public final int a() {
        return this.f1026d + (this.f1022k ? 1 : 0);
    }

    @Override // Ca.c, androidx.recyclerview.widget.s
    public final int c(int i10) {
        return (this.f1022k && i10 == a() - (this.f1022k ? 1 : 0)) ? this.j : super.c(i10);
    }

    @Override // Ca.c, androidx.recyclerview.widget.s
    /* JADX INFO: renamed from: n */
    public final void e(int i10, Ga.c cVar) {
        if (i10 < a() - (this.f1022k ? 1 : 0)) {
            cVar.a(this.f1031i.get(i10));
        }
    }

    @Override // Ca.c, androidx.recyclerview.widget.s
    /* JADX INFO: renamed from: o */
    public final Ga.c f(ViewGroup viewGroup, int i10) {
        i.g(viewGroup, "parent");
        return i10 == this.j ? new Ga.b(viewGroup, this.f1025n, this.f1023l) : super.f(viewGroup, i10);
    }

    @Override // Ca.c, androidx.recyclerview.widget.s
    /* JADX INFO: renamed from: p */
    public final void i(Ga.c cVar) {
        super.i(cVar);
        if (cVar instanceof Ga.b) {
            if (this.f1023l) {
                cVar.f7003s.post(new C3.c(this, 3, cVar));
                return;
            }
            Ga.b bVar = (Ga.b) cVar;
            bVar.s(false);
            AppCompatButton appCompatButton = bVar.f1809M;
            if (appCompatButton != null) {
                appCompatButton.setOnClickListener(new a(this, cVar));
            }
        }
    }
}
