package p045e7;

import N7.a;
import N7.b;
import android.os.Bundle;
import android.widget.TextView;
import com.kcstream.cing.R;
import d7.c;
import d7.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b, a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f10715s;

    public /* synthetic */ d(h hVar) {
        this.f10715s = hVar;
    }

    @Override // N7.b
    public void accept(Object obj) {
        CharSequence charSequence;
        e eVar = (e) obj;
        boolean z6 = eVar instanceof d7.a;
        h hVar = this.f10715s;
        if (z6) {
            h.p0(hVar, ((d7.a) eVar).f10549b);
            return;
        }
        if (eVar instanceof c) {
            h.p0(hVar, ((c) eVar).f10550b);
            return;
        }
        if (!(eVar instanceof d7.b)) {
            boolean z10 = eVar instanceof d7.d;
            return;
        }
        Bundle bundle = hVar.f6656y;
        if (bundle == null || (charSequence = bundle.getCharSequence("not_recognized")) == null) {
            charSequence = "Not recognized";
        }
        h.p0(hVar, charSequence);
    }

    @Override // N7.a
    /* JADX INFO: renamed from: run */
    public void mo0run() {
        CharSequence charSequence;
        h hVar = this.f10715s;
        TextView textView = hVar.f10727O0;
        if (textView == null) {
            i.n("iconTextView");
            throw null;
        }
        Bundle bundle = hVar.f6656y;
        if (bundle == null || (charSequence = bundle.getCharSequence("prompt")) == null) {
            charSequence = "Touch the fingerprint sensor";
        }
        textView.setText(charSequence);
        TextView textView2 = hVar.f10727O0;
        if (textView2 == null) {
            i.n("iconTextView");
            throw null;
        }
        if (textView2 == null) {
            i.n("iconTextView");
            throw null;
        }
        textView2.setTextColor(J.b.a(textView2.getContext(), R.color.biometric_icon_text_color));
        hVar.s0(true);
    }
}
