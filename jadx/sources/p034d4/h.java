package p034d4;

import com.google.firebase.encoders.EncodingException;
import p004a4.b;
import p004a4.f;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f {
    public boolean a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10546b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f10547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f10548d;

    public h(f fVar) {
        this.f10548d = fVar;
    }

    @Override // p004a4.f
    public final f c(String str) {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.f10548d.h(this.f10547c, str, this.f10546b);
        return this;
    }

    @Override // p004a4.f
    public final f d(boolean z6) {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.f10548d.d(this.f10547c, z6 ? 1 : 0, this.f10546b);
        return this;
    }
}
