package p224x2;

import com.google.android.gms.common.api.internal.zaaw;
import com.google.android.gms.signin.internal.zac;
import com.google.android.gms.signin.internal.zak;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class f extends zac {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f15760b;

    public f(zaaw zaawVar) {
        this.f15760b = new WeakReference(zaawVar);
    }

    @Override // com.google.android.gms.signin.internal.zac, com.google.android.gms.signin.internal.zae
    public final void K(zak zakVar) {
        zaaw zaawVar = (zaaw) this.f15760b.get();
        if (zaawVar == null) {
            return;
        }
        b bVar = new b(zaawVar, zaawVar, zakVar);
        h hVar = zaawVar.a.f7982f;
        hVar.sendMessage(hVar.obtainMessage(1, bVar));
    }
}
