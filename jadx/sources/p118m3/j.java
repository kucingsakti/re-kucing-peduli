package p118m3;

import B6.d;
import android.view.View;
import com.google.android.material.navigation.NavigationView;
import java.util.Objects;
import p088j0.c;

/* JADX INFO: loaded from: classes.dex */
public final class j implements c {
    public final /* synthetic */ NavigationView a;

    public j(NavigationView navigationView) {
        this.a = navigationView;
    }

    @Override // p088j0.c
    public final void b(View view) {
        NavigationView navigationView = this.a;
        if (view == navigationView) {
            Y1.c cVar = navigationView.f9767N;
            Objects.requireNonNull(cVar);
            view.post(new d(cVar, 22));
        }
    }

    @Override // p088j0.c
    public final void c(View view) {
        NavigationView navigationView = this.a;
        if (view == navigationView) {
            Y1.c cVar = navigationView.f9767N;
            p109l3.c cVar2 = (p109l3.c) cVar.f5670t;
            if (cVar2 != null) {
                cVar2.c((View) cVar.f5672v);
            }
            if (!navigationView.f9763J || navigationView.f9762I == 0) {
                return;
            }
            navigationView.f9762I = 0;
            navigationView.g(navigationView.getWidth(), navigationView.getHeight());
        }
    }

    @Override // p088j0.c
    public final void a(float f10) {
    }
}
