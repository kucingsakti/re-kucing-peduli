package p126n0;

import android.text.Editable;
import p106l0.q;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {
    public static final Object a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f13286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f13287c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f13287c;
        return cls != null ? new q(cls, charSequence) : super.newEditable(charSequence);
    }
}
