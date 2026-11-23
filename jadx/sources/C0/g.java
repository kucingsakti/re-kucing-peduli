package C0;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import p078i.C0650g;

/* JADX INFO: loaded from: classes.dex */
public class g extends o {

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public final HashSet f858R0 = new HashSet();

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public boolean f859S0;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public CharSequence[] f860T0;
    public CharSequence[] U0;

    @Override // C0.o, p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public final void C(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.C(bundle);
        HashSet hashSet = this.f858R0;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f859S0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f860T0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.U0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) o0();
        if (multiSelectListPreference.f6799l0 == null || (charSequenceArr = multiSelectListPreference.f6800m0) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.f6801n0);
        this.f859S0 = false;
        this.f860T0 = multiSelectListPreference.f6799l0;
        this.U0 = charSequenceArr;
    }

    @Override // C0.o, p156q0.DialogInterfaceOnCancelListenerC0756o, androidx.fragment.app.b
    public final void O(Bundle bundle) {
        super.O(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f858R0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f859S0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f860T0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.U0);
    }

    @Override // C0.o
    public final void q0(boolean z6) {
        if (z6 && this.f859S0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) o0();
            HashSet hashSet = this.f858R0;
            multiSelectListPreference.f(hashSet);
            multiSelectListPreference.C(hashSet);
        }
        this.f859S0 = false;
    }

    @Override // C0.o
    public final void r0(A1.l lVar) {
        int length = this.U0.length;
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            zArr[i10] = this.f858R0.contains(this.U0[i10].toString());
        }
        CharSequence[] charSequenceArr = this.f860T0;
        f fVar = new f(this);
        C0650g c0650g = (C0650g) lVar.f123t;
        c0650g.f12052o = charSequenceArr;
        c0650g.f12061x = fVar;
        c0650g.f12057t = zArr;
        c0650g.f12058u = true;
    }
}
