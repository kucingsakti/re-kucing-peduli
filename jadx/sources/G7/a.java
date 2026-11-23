package G7;

import android.view.View;
import com.kcstream.cing.R;
import p210v8.k;

/* JADX INFO: loaded from: classes.dex */
public final class a extends k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f1703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ View f1704t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(View view, int i10) {
        super(0);
        this.f1703s = i10;
        this.f1704t = view;
    }

    @Override // p200u8.a
    public final Object invoke() {
        switch (this.f1703s) {
            case 0:
                return J.a.b(this.f1704t.getContext(), R.drawable.ic_check);
            case 1:
                return J.a.b(this.f1704t.getContext(), R.drawable.ic_circle);
            default:
                return J.a.b(this.f1704t.getContext(), R.drawable.ic_no_color);
        }
    }
}
