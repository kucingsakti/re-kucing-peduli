package X1;

import U.h0;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class b extends h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5381d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(View view, D3.b bVar, int i10) {
        super(view, bVar);
        this.f5381d = i10;
    }

    @Override // U.h0
    public void a(View view) {
        switch (this.f5381d) {
            case 1:
                view.setVisibility(8);
                break;
        }
    }

    @Override // U.h0
    public void b(View view) {
        switch (this.f5381d) {
            case 0:
                view.setVisibility(0);
                break;
        }
    }
}
