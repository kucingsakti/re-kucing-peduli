package p136o;

import android.view.ActionProvider;
import p102k7.e;

/* JADX INFO: loaded from: classes.dex */
public final class o implements ActionProvider.VisibilityListener {
    public e a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionProvider f13546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f13547c;

    public o(s sVar, ActionProvider actionProvider) {
        this.f13547c = sVar;
        this.f13546b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z6) {
        e eVar = this.a;
        if (eVar != null) {
            l lVar = ((n) eVar.f12743s).f13523F;
            lVar.f13514z = true;
            lVar.p(true);
        }
    }
}
