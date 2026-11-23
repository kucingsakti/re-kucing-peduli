package p215w3;

import android.text.Editable;
import p091j3.B;

/* JADX INFO: loaded from: classes.dex */
public final class j extends B {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ l f15569s;

    public j(l lVar) {
        this.f15569s = lVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.f15569s.b().a();
    }

    @Override // p091j3.B, android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f15569s.b().b();
    }
}
