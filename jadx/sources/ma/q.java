package ma;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class q implements g {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v f13209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f13210t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13211u;

    public q(v vVar) {
        p210v8.i.f(vVar, "sink");
        this.f13209s = vVar;
        this.f13210t = new f();
    }

    @Override // ma.v
    public final void C(f fVar, long j) {
        p210v8.i.f(fVar, "source");
        if (this.f13211u) {
            throw new IllegalStateException("closed");
        }
        this.f13210t.C(fVar, j);
        a();
    }

    @Override // ma.g
    public final g F(byte[] bArr) {
        p210v8.i.f(bArr, "source");
        if (this.f13211u) {
            throw new IllegalStateException("closed");
        }
        this.f13210t.b0(bArr, 0, bArr.length);
        a();
        return this;
    }

    @Override // ma.g
    public final g N(int i10, byte[] bArr) {
        p210v8.i.f(bArr, "source");
        if (this.f13211u) {
            throw new IllegalStateException("closed");
        }
        this.f13210t.b0(bArr, 0, i10);
        a();
        return this;
    }

    @Override // ma.g
    public final g O(i iVar) {
        p210v8.i.f(iVar, "byteString");
        if (this.f13211u) {
            throw new IllegalStateException("closed");
        }
        this.f13210t.a0(iVar);
        a();
        return this;
    }

    @Override // ma.g
    public final g Q(String str) {
        p210v8.i.f(str, "string");
        if (this.f13211u) {
            throw new IllegalStateException("closed");
        }
        this.f13210t.i0(str);
        a();
        return this;
    }

    @Override // ma.g
    public final g R(long j) {
        if (this.f13211u) {
            throw new IllegalStateException("closed");
        }
        this.f13210t.e0(j);
        a();
        return this;
    }

    public final g a() {
        if (this.f13211u) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f13210t;
        long jH = fVar.h();
        if (jH > 0) {
            this.f13209s.C(fVar, jH);
        }
        return this;
    }

    public final g b(int i10) {
        if (this.f13211u) {
            throw new IllegalStateException("closed");
        }
        this.f13210t.g0(i10);
        a();
        return this;
    }

    @Override // ma.v, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        v vVar = this.f13209s;
        if (this.f13211u) {
            return;
        }
        f fVar = this.f13210t;
        long j = fVar.f13190t;
        if (j > 0) {
            vVar.C(fVar, j);
        }
        th = null;
        try {
            vVar.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f13211u = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // ma.g
    public final f d() {
        return this.f13210t;
    }

    @Override // ma.v
    public final y e() {
        return this.f13209s.e();
    }

    @Override // ma.v, java.io.Flushable
    public final void flush() {
        if (this.f13211u) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f13210t;
        long j = fVar.f13190t;
        v vVar = this.f13209s;
        if (j > 0) {
            vVar.C(fVar, j);
        }
        vVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f13211u;
    }

    public final String toString() {
        return "buffer(" + this.f13209s + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        p210v8.i.f(byteBuffer, "source");
        if (this.f13211u) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f13210t.write(byteBuffer);
        a();
        return iWrite;
    }

    @Override // ma.g
    public final g z(int i10) {
        if (this.f13211u) {
            throw new IllegalStateException("closed");
        }
        this.f13210t.d0(i10);
        a();
        return this;
    }
}
