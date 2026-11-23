package androidx.preference;

import C0.C0172b;
import C0.y;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.kcstream.cing.R;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayAdapter f6788q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Spinner f6789r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final C0172b f6790s0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.f6790s0 = new C0172b(this, 0);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f6788q0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f6793l0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void m() {
        super.m();
        ArrayAdapter arrayAdapter = this.f6788q0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void q(y yVar) {
        int length;
        CharSequence[] charSequenceArr;
        Spinner spinner = (Spinner) yVar.f7003s.findViewById(R.id.spinner);
        this.f6789r0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f6788q0);
        this.f6789r0.setOnItemSelectedListener(this.f6790s0);
        Spinner spinner2 = this.f6789r0;
        String str = this.f6795n0;
        if (str == null || (charSequenceArr = this.f6794m0) == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (!TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.q(yVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void r() {
        this.f6789r0.performClick();
    }
}
