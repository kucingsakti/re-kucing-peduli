package p024c4;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;
import p004a4.c;
import p004a4.d;
import p034d4.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements c {
    public final /* synthetic */ int a;

    @Override // p004a4.a
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                d dVar = (d) obj2;
                dVar.a(f.f10539g, entry.getKey());
                dVar.a(f.f10540h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
