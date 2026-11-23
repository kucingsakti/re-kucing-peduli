package p215w3;

import D3.b;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes.dex */
public final class d extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f15551e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(l lVar, int i10) {
        super(lVar);
        this.f15551e = i10;
    }

    @Override // p215w3.m
    public void r() {
        switch (this.f15551e) {
            case 0:
                l lVar = this.f15592b;
                lVar.f15576G = null;
                CheckableImageButton checkableImageButton = lVar.f15590y;
                checkableImageButton.setOnLongClickListener(null);
                b.D(checkableImageButton, null);
                break;
        }
    }
}
