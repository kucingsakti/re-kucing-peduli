package p034d4;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.firebase.encoders.EncodingException;
import com.rollbar.notifier.sender.SyncSender;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p004a4.b;
import p004a4.c;
import p004a4.d;
import p004a4.e;
import p024c4.a;

/* JADX INFO: loaded from: classes.dex */
public final class f implements d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f10538f = Charset.forName(SyncSender.UTF_8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f10539g = new b("key", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(1))));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f10540h = new b("value", AbstractC0487g.o(AbstractC0487g.n(e.class, new a(2))));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f10541i = new a(1);
    public OutputStream a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f10542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f10543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f10544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f10545e = new h(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, a aVar) {
        this.a = byteArrayOutputStream;
        this.f10542b = map;
        this.f10543c = map2;
        this.f10544d = aVar;
    }

    public static int j(b bVar) {
        e eVar = (e) ((Annotation) bVar.f6005b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // p004a4.d
    public final d a(b bVar, Object obj) {
        h(bVar, obj, true);
        return this;
    }

    @Override // p004a4.d
    public final d b(b bVar, boolean z6) {
        d(bVar, z6 ? 1 : 0, true);
        return this;
    }

    public final void c(b bVar, double d3, boolean z6) throws IOException {
        if (z6 && d3 == 0.0d) {
            return;
        }
        k((j(bVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d3).array());
    }

    public final void d(b bVar, int i10, boolean z6) {
        if (z6 && i10 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) bVar.f6005b.get(e.class));
        if (eVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        k(((a) eVar).a << 3);
        k(i10);
    }

    @Override // p004a4.d
    public final d e(b bVar, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) bVar.f6005b.get(e.class));
        if (eVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        k(((a) eVar).a << 3);
        l(j);
        return this;
    }

    @Override // p004a4.d
    public final d f(b bVar, double d3) throws IOException {
        c(bVar, d3, true);
        return this;
    }

    @Override // p004a4.d
    public final d g(b bVar, int i10) {
        d(bVar, i10, true);
        return this;
    }

    public final void h(b bVar, Object obj, boolean z6) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z6 && charSequence.length() == 0) {
                return;
            }
            k((j(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f10538f);
            k(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(bVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(f10541i, bVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            c(bVar, ((Double) obj).doubleValue(), z6);
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z6 && fFloatValue == 0.0f) {
                return;
            }
            k((j(bVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z6 && jLongValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) bVar.f6005b.get(e.class));
            if (eVar == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            k(((a) eVar).a << 3);
            l(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            d(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z6);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z6 && bArr.length == 0) {
                return;
            }
            k((j(bVar) << 3) | 2);
            k(bArr.length);
            this.a.write(bArr);
            return;
        }
        c cVar = (c) this.f10542b.get(obj.getClass());
        if (cVar != null) {
            i(cVar, bVar, obj, z6);
            return;
        }
        e eVar2 = (e) this.f10543c.get(obj.getClass());
        if (eVar2 != null) {
            h hVar = this.f10545e;
            hVar.a = false;
            hVar.f10547c = bVar;
            hVar.f10546b = z6;
            eVar2.a(obj, hVar);
            return;
        }
        if (obj instanceof c) {
            d(bVar, ((c) obj).getNumber(), true);
        } else if (obj instanceof Enum) {
            d(bVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.f10544d, bVar, obj, z6);
        }
    }

    public final void i(c cVar, b bVar, Object obj, boolean z6) throws IOException {
        b bVar2 = new b();
        bVar2.f10535s = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = bVar2;
            try {
                cVar.a(obj, this);
                this.a = outputStream;
                long j = bVar2.f10535s;
                bVar2.close();
                if (z6 && j == 0) {
                    return;
                }
                k((j(bVar) << 3) | 2);
                l(j);
                cVar.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.a.write(i10 & 127);
    }

    public final void l(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
}
