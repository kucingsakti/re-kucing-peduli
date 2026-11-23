package p126n0;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;
import o1.h;
import p106l0.g;
import za.c;

/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {
    public final EditText a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f13288b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        c cVar = new c(24);
        super(inputConnection, false);
        this.a = editText;
        this.f13288b = cVar;
        if (g.f12850k != null) {
            g gVarA = g.a();
            if (gVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            K3.b bVar = gVarA.f12854e;
            bVar.getClass();
            Bundle bundle = editorInfo.extras;
            p116m0.b bVar2 = (p116m0.b) ((h) bVar.f2578c).f13632s;
            int iA = bVar2.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar2.f4778v).getInt(iA + bVar2.f4775s) : 0);
            Bundle bundle2 = editorInfo.extras;
            ((g) bVar.a).getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        Editable editableText = this.a.getEditableText();
        this.f13288b.getClass();
        return c.l(this, editableText, i10, i11, false) || super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        Editable editableText = this.a.getEditableText();
        this.f13288b.getClass();
        return c.l(this, editableText, i10, i11, true) || super.deleteSurroundingTextInCodePoints(i10, i11);
    }
}
