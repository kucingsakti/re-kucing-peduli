package J4;

import A9.A;
import C8.E;
import E4.L;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.material.textview.MaterialTextView;
import com.kcstream.cing.R;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Ga.c implements Ga.d {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f2418M = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(ViewGroup viewGroup) {
        p210v8.i.f(viewGroup, "parent");
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_activity_main_fragment_download, viewGroup, false);
        p210v8.i.e(viewInflate, "inflate(...)");
        super(viewInflate);
        this.f7003s.setOnClickListener(new L(this, 1));
    }

    @Override // Ga.a
    public final void a(Object obj) {
        e eVar = (e) obj;
        p210v8.i.f(eVar, "item");
        View view = this.f7003s;
        Fa.e eVarI = Fa.e.i(view);
        ((MaterialTextView) eVarI.f1663x).setText(eVar.a);
        MaterialTextView materialTextView = (MaterialTextView) eVarI.f1661v;
        String str = eVar.f2410b;
        materialTextView.setText(str);
        ((MaterialTextView) eVarI.f1659t).setText(E.l(DateFormat.format("yyyy-MM-dd HH:mm:ss", new Date(eVar.f2411c)).toString(), "yyyy-MM-dd HH:mm:ss", new Locale("en", "US")));
        ((MaterialTextView) eVarI.f1662w).setText(C3.a.h(eVar.f2412d));
        ImageView imageView = (ImageView) eVarI.f1660u;
        D3.b.t(imageView, str);
        imageView.setClipToOutline(true);
        D3.b.e(view, new A(view, 16, eVar));
    }
}
