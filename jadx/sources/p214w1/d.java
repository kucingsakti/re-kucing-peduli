package p214w1;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ByteArrayOutputStream {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ e f15535s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, int i10) {
        super(i10);
        this.f15535s = eVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i10 = ((ByteArrayOutputStream) this).count;
        if (i10 > 0 && ((ByteArrayOutputStream) this).buf[i10 - 1] == 13) {
            i10--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i10, this.f15535s.f15537t.name());
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }
}
