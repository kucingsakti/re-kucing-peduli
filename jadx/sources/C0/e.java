package C0;

import android.os.Bundle;
import androidx.preference.ListPreference;
import p078i.C0650g;

/* JADX INFO: loaded from: classes.dex */
public class e extends o {

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public int f855R0;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public CharSequence[] f856S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public CharSequence[] f857T0;

    @Override // C0.o, p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public final void C(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.C(bundle);
        if (bundle != null) {
            this.f855R0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f856S0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f857T0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) o0();
        if (listPreference.f6793l0 == null || (charSequenceArr = listPreference.f6794m0) == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f855R0 = listPreference.C(listPreference.f6795n0);
        this.f856S0 = listPreference.f6793l0;
        this.f857T0 = charSequenceArr;
    }

    @Override // C0.o, p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public final void O(Bundle bundle) {
        super.O(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f855R0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f856S0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f857T0);
    }

    @Override // C0.o
    public final void q0(boolean z6) {
        int i10;
        if (!z6 || (i10 = this.f855R0) < 0) {
            return;
        }
        String string = this.f857T0[i10].toString();
        ListPreference listPreference = (ListPreference) o0();
        listPreference.f(string);
        listPreference.D(string);
    }

    @Override // C0.o
    public final void r0(A1.l lVar) {
        CharSequence[] charSequenceArr = this.f856S0;
        int i10 = this.f855R0;
        B4.A a = new B4.A(this, 1);
        C0650g c0650g = (C0650g) lVar.f123t;
        c0650g.f12052o = charSequenceArr;
        c0650g.f12054q = a;
        c0650g.f12060w = i10;
        c0650g.f12059v = true;
        lVar.f(null, null);
    }
}
