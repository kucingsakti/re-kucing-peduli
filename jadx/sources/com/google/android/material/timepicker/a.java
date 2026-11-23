package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import p091j3.B;

/* JADX INFO: loaded from: classes.dex */
public final class a extends B {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f9961s;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f9961s = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean zIsEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f9961s;
        if (zIsEmpty) {
            chipTextInputComboView.f9931s.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String strA = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f9931s;
        if (TextUtils.isEmpty(strA)) {
            strA = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(strA);
    }
}
