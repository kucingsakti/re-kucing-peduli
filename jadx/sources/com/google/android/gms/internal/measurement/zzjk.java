package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.android.gms.internal.measurement.zzjk;
import com.google.android.gms.internal.measurement.zzjk.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzjk<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhq<MessageType, BuilderType> {
    private static Map<Object, zzjk<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzme zzb = zzme.f8702f;

    public static class zza<T extends zzjk<T, ?>> extends zzhr<T> {
    }

    public static abstract class zzb<MessageType extends zzjk<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhp<MessageType, BuilderType> {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final zzjk f8680s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public zzjk f8681t;

        public zzb(zzjk zzjkVar) {
            this.f8680s = zzjkVar;
            if (zzjkVar.y()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f8681t = (zzjk) zzjkVar.q(4);
        }

        @Override // com.google.android.gms.internal.measurement.zzhp
        public final /* synthetic */ Object clone() {
            zzb zzbVar = (zzb) this.f8680s.q(5);
            zzbVar.f8681t = l();
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.measurement.zzkv
        public final boolean h() {
            return zzjk.t(this.f8681t, false);
        }

        @Override // com.google.android.gms.internal.measurement.zzhp
        /* JADX INFO: renamed from: j */
        public final /* synthetic */ zzb clone() {
            return (zzb) clone();
        }

        public final zzb k(zzjk zzjkVar) {
            if (this.f8680s.equals(zzjkVar)) {
                return this;
            }
            if (!this.f8681t.y()) {
                p();
            }
            zzjk zzjkVar2 = this.f8681t;
            B0 b3 = B0.f8333c;
            b3.getClass();
            b3.a(zzjkVar2.getClass()).f(zzjkVar2, zzjkVar);
            return this;
        }

        public final zzjk l() {
            if (!this.f8681t.y()) {
                return this.f8681t;
            }
            this.f8681t.w();
            return this.f8681t;
        }

        public final void m() {
            if (this.f8681t.y()) {
                return;
            }
            p();
        }

        @Override // com.google.android.gms.internal.measurement.zzks
        public final zzjk o() {
            zzjk zzjkVarL = l();
            if (zzjk.t(zzjkVarL, true)) {
                return zzjkVarL;
            }
            throw new zzmc("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        }

        public final void p() {
            zzjk zzjkVar = (zzjk) this.f8680s.q(4);
            zzjk zzjkVar2 = this.f8681t;
            B0 b3 = B0.f8333c;
            b3.getClass();
            b3.a(zzjkVar.getClass()).f(zzjkVar, zzjkVar2);
            this.f8681t = zzjkVar;
        }

        public final void q(byte[] bArr, int i10, zzix zzixVar) throws zzjs {
            if (!this.f8681t.y()) {
                p();
            }
            try {
                B0 b3 = B0.f8333c;
                zzjk zzjkVar = this.f8681t;
                b3.getClass();
                b3.a(zzjkVar.getClass()).c(this.f8681t, bArr, 0, i10, new X(zzixVar));
            } catch (zzjs e10) {
                throw e10;
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            } catch (IndexOutOfBoundsException unused) {
                throw zzjs.e();
            }
        }
    }

    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzjk<MessageType, BuilderType> implements zzkv {
        protected C0581l0 zzc = C0581l0.f8391d;

        public final C0581l0 z() {
            C0581l0 c0581l0 = this.zzc;
            if (c0581l0.f8392b) {
                this.zzc = (C0581l0) c0581l0.clone();
            }
            return this.zzc;
        }
    }

    public static final enum zze {
        public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7};
    }

    public static class zzf<ContainingType extends zzkt, Type> extends zziy<ContainingType, Type> {
    }

    public static zzjk n(Class cls) {
        zzjk<?, ?> zzjkVar = zzc.get(cls);
        if (zzjkVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzjkVar = zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zzjkVar != null) {
            return zzjkVar;
        }
        zzjk<?, ?> zzjkVar2 = (zzjk) ((zzjk) J0.a(cls)).q(6);
        if (zzjkVar2 == null) {
            throw new IllegalStateException();
        }
        zzc.put(cls, zzjkVar2);
        return zzjkVar2;
    }

    public static zzjt p(zzjt zzjtVar) {
        int size = zzjtVar.size();
        return zzjtVar.h(size == 0 ? 10 : size << 1);
    }

    public static Object r(Method method, zzkt zzktVar, Object... objArr) {
        try {
            return method.invoke(zzktVar, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void s(Class cls, zzjk zzjkVar) {
        zzjkVar.x();
        zzc.put(cls, zzjkVar);
    }

    public static final boolean t(zzjk zzjkVar, boolean z6) {
        byte bByteValue = ((Byte) zzjkVar.q(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        B0 b3 = B0.f8333c;
        b3.getClass();
        boolean zE = b3.a(zzjkVar.getClass()).e(zzjkVar);
        if (z6) {
            zzjkVar.q(2);
        }
        return zE;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final int a() {
        return g(null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final /* synthetic */ zzb c() {
        zzb zzbVar = (zzb) q(5);
        zzbVar.k(this);
        return zzbVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final void d(C0569f0 c0569f0) {
        B0 b3 = B0.f8333c;
        b3.getClass();
        D0 d0A = b3.a(getClass());
        t0 t0Var = c0569f0.a;
        if (t0Var == null) {
            t0Var = new t0();
            Charset charset = zzjm.a;
            if (c0569f0 == null) {
                throw new NullPointerException("output");
            }
            t0Var.a = c0569f0;
            c0569f0.a = t0Var;
        }
        d0A.h(this, t0Var);
    }

    @Override // com.google.android.gms.internal.measurement.zzkv
    public final /* synthetic */ zzjk e() {
        return (zzjk) q(6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        B0 b3 = B0.f8333c;
        b3.getClass();
        return b3.a(getClass()).a(this, (zzjk) obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final int g(D0 d3) {
        int i10;
        int i11;
        if (y()) {
            if (d3 == null) {
                B0 b3 = B0.f8333c;
                b3.getClass();
                i11 = b3.a(getClass()).i(this);
            } else {
                i11 = d3.i(this);
            }
            if (i11 >= 0) {
                return i11;
            }
            throw new IllegalStateException(AbstractC0487g.g(i11, "serialized size must be non-negative, was "));
        }
        if (k() != Integer.MAX_VALUE) {
            return k();
        }
        if (d3 == null) {
            B0 b7 = B0.f8333c;
            b7.getClass();
            i10 = b7.a(getClass()).i(this);
        } else {
            i10 = d3.i(this);
        }
        m(i10);
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.zzkv
    public final boolean h() {
        return t(this, true);
    }

    public final int hashCode() {
        if (y()) {
            B0 b3 = B0.f8333c;
            b3.getClass();
            return b3.a(getClass()).d(this);
        }
        if (this.zza == 0) {
            B0 b7 = B0.f8333c;
            b7.getClass();
            this.zza = b7.a(getClass()).d(this);
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkt
    public final /* synthetic */ zzb i() {
        return (zzb) q(5);
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final int k() {
        return this.zzd & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzhq
    public final void m(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(AbstractC0487g.g(i10, "serialized size must be non-negative, was "));
        }
        this.zzd = (i10 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
    }

    public abstract Object q(int i10);

    public final String toString() {
        String string = super.toString();
        char[] cArr = w0.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        w0.a(this, sb, 0);
        return sb.toString();
    }

    public final zzb u() {
        return (zzb) q(5);
    }

    public final zzb v() {
        zzb zzbVar = (zzb) q(5);
        zzbVar.k(this);
        return zzbVar;
    }

    public final void w() {
        B0 b3 = B0.f8333c;
        b3.getClass();
        b3.a(getClass()).g(this);
        x();
    }

    public final void x() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean y() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
