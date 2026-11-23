package com.google.android.gms.internal.measurement;

import android.os.Build;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzfn {

    public static final class zza extends zzjk<zza, C0008zza> implements zzkv {
        private static final zza zzc;
        private static volatile zzlc<zza> zzd;
        private int zze;
        private long zzi;
        private long zzm;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private String zzj = "";
        private String zzk = "";
        private String zzl = "";

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfn$zza$zza, reason: collision with other inner class name */
        public static final class C0008zza extends zzjk.zzb<zza, C0008zza> implements zzkv {
            private C0008zza() {
                super(zza.zzc);
            }

            public /* synthetic */ C0008zza(int i10) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjk.s(zza.class, zzaVar);
        }

        private zza() {
        }

        public static void A(zza zzaVar) {
            zzaVar.zze &= -2;
            zzaVar.zzf = zzc.zzf;
        }

        public static void B(zza zzaVar, long j) {
            zzaVar.zze |= 8;
            zzaVar.zzi = j;
        }

        public static void C(zza zzaVar, String str) {
            zzaVar.getClass();
            zzaVar.zze |= 1;
            zzaVar.zzf = str;
        }

        public static void E(zza zzaVar) {
            zzaVar.zze &= -3;
            zzaVar.zzg = zzc.zzg;
        }

        public static void F(zza zzaVar, long j) {
            zzaVar.zze |= 128;
            zzaVar.zzm = j;
        }

        public static void G(zza zzaVar, String str) {
            zzaVar.getClass();
            zzaVar.zze |= 2;
            zzaVar.zzg = str;
        }

        public static void H(zza zzaVar) {
            zzaVar.zze &= -5;
            zzaVar.zzh = zzc.zzh;
        }

        public static void I(zza zzaVar, String str) {
            zzaVar.getClass();
            zzaVar.zze |= 4;
            zzaVar.zzh = str;
        }

        public static C0008zza J() {
            return (C0008zza) zzc.u();
        }

        public static void L(zza zzaVar) {
            zzaVar.zze &= -17;
            zzaVar.zzj = zzc.zzj;
        }

        public static void M(zza zzaVar, String str) {
            zzaVar.getClass();
            zzaVar.zze |= 16;
            zzaVar.zzj = str;
        }

        public static zza N() {
            return zzc;
        }

        public static void O(zza zzaVar) {
            zzaVar.zze &= -33;
            zzaVar.zzk = zzc.zzk;
        }

        public static void P(zza zzaVar, String str) {
            zzaVar.getClass();
            zzaVar.zze |= 32;
            zzaVar.zzk = str;
        }

        public static void R(zza zzaVar) {
            zzaVar.zze &= -65;
            zzaVar.zzl = zzc.zzl;
        }

        public static void S(zza zzaVar, String str) {
            zzaVar.getClass();
            zzaVar.zze |= 64;
            zzaVar.zzl = str;
        }

        public final long D() {
            return this.zzm;
        }

        public final String Q() {
            return this.zzh;
        }

        public final String T() {
            return this.zzg;
        }

        public final String U() {
            return this.zzf;
        }

        public final String V() {
            return this.zzl;
        }

        public final String W() {
            return this.zzk;
        }

        public final String X() {
            return this.zzj;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0008zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zza> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zza.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final long z() {
            return this.zzi;
        }
    }

    public static final class zzb extends zzjk<zzb, zza> implements zzkv {
        private static final zzb zzc;
        private static volatile zzlc<zzb> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";
        private String zzk = "";
        private String zzl = "";

        public static final class zza extends zzjk.zzb<zzb, zza> implements zzkv {
            private zza() {
                super(zzb.zzc);
            }

            public /* synthetic */ zza(int i10) {
                this();
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzjk.s(zzb.class, zzbVar);
        }

        private zzb() {
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzb> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zzb.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzc extends zzjk<zzc, zza> implements zzkv {
        private static final zzc zzc;
        private static volatile zzlc<zzc> zzd;
        private int zze;
        private boolean zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;
        private boolean zzl;

        public static final class zza extends zzjk.zzb<zzc, zza> implements zzkv {
            private zza() {
                super(zzc.zzc);
            }

            public final void r(boolean z6) {
                m();
                zzc.J((zzc) this.f8681t, z6);
            }

            public final void s(boolean z6) {
                m();
                zzc.H((zzc) this.f8681t, z6);
            }

            public final void t(boolean z6) {
                m();
                zzc.A((zzc) this.f8681t, z6);
            }

            public final void u(boolean z6) {
                m();
                zzc.L((zzc) this.f8681t, z6);
            }

            public final void v(boolean z6) {
                m();
                zzc.C((zzc) this.f8681t, z6);
            }

            public final void w(boolean z6) {
                m();
                zzc.E((zzc) this.f8681t, z6);
            }

            public final void x(boolean z6) {
                m();
                zzc.F((zzc) this.f8681t, z6);
            }

            public /* synthetic */ zza(int i10) {
                this();
            }
        }

        static {
            zzc zzcVar = new zzc();
            zzc = zzcVar;
            zzjk.s(zzc.class, zzcVar);
        }

        private zzc() {
        }

        public static void A(zzc zzcVar, boolean z6) {
            zzcVar.zze |= 1;
            zzcVar.zzf = z6;
        }

        public static void C(zzc zzcVar, boolean z6) {
            zzcVar.zze |= 2;
            zzcVar.zzg = z6;
        }

        public static zzc D() {
            return zzc;
        }

        public static void E(zzc zzcVar, boolean z6) {
            zzcVar.zze |= 4;
            zzcVar.zzh = z6;
        }

        public static void F(zzc zzcVar, boolean z6) {
            zzcVar.zze |= 8;
            zzcVar.zzi = z6;
        }

        public static void H(zzc zzcVar, boolean z6) {
            zzcVar.zze |= 16;
            zzcVar.zzj = z6;
        }

        public static void J(zzc zzcVar, boolean z6) {
            zzcVar.zze |= 32;
            zzcVar.zzk = z6;
        }

        public static void L(zzc zzcVar, boolean z6) {
            zzcVar.zze |= 64;
            zzcVar.zzl = z6;
        }

        public static zza z() {
            return (zza) zzc.u();
        }

        public final boolean G() {
            return this.zzk;
        }

        public final boolean I() {
            return this.zzj;
        }

        public final boolean K() {
            return this.zzf;
        }

        public final boolean M() {
            return this.zzl;
        }

        public final boolean N() {
            return this.zzg;
        }

        public final boolean O() {
            return this.zzh;
        }

        public final boolean P() {
            return this.zzi;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzc> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zzc.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzd extends zzjk<zzd, zza> implements zzkv {
        private static final zzd zzc;
        private static volatile zzlc<zzd> zzd;
        private int zze;
        private int zzf;
        private zzm zzg;
        private zzm zzh;
        private boolean zzi;

        public static final class zza extends zzjk.zzb<zzd, zza> implements zzkv {
            private zza() {
                super(zzd.zzc);
            }

            public /* synthetic */ zza(int i10) {
                this();
            }
        }

        static {
            zzd zzdVar = new zzd();
            zzc = zzdVar;
            zzjk.s(zzd.class, zzdVar);
        }

        private zzd() {
        }

        public static void A(zzd zzdVar, int i10) {
            zzdVar.zze |= 1;
            zzdVar.zzf = i10;
        }

        public static void B(zzd zzdVar, zzm zzmVar) {
            zzdVar.getClass();
            zzdVar.zzg = zzmVar;
            zzdVar.zze |= 2;
        }

        public static void C(zzd zzdVar, boolean z6) {
            zzdVar.zze |= 8;
            zzdVar.zzi = z6;
        }

        public static zza D() {
            return (zza) zzc.u();
        }

        public static void E(zzd zzdVar, zzm zzmVar) {
            zzdVar.getClass();
            zzmVar.getClass();
            zzdVar.zzh = zzmVar;
            zzdVar.zze |= 4;
        }

        public final zzm G() {
            zzm zzmVar = this.zzg;
            return zzmVar == null ? zzm.N() : zzmVar;
        }

        public final zzm H() {
            zzm zzmVar = this.zzh;
            return zzmVar == null ? zzm.N() : zzmVar;
        }

        public final boolean I() {
            return this.zzi;
        }

        public final boolean J() {
            return (this.zze & 1) != 0;
        }

        public final boolean K() {
            return (this.zze & 8) != 0;
        }

        public final boolean L() {
            return (this.zze & 4) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzd> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zzd.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int z() {
            return this.zzf;
        }
    }

    public static final class zze extends zzjk<zze, zza> implements zzkv {
        private static final zze zzc;
        private static volatile zzlc<zze> zzd;
        private int zze;
        private int zzf;
        private long zzg;

        public static final class zza extends zzjk.zzb<zze, zza> implements zzkv {
            private zza() {
                super(zze.zzc);
            }

            public /* synthetic */ zza(int i10) {
                this();
            }
        }

        static {
            zze zzeVar = new zze();
            zzc = zzeVar;
            zzjk.s(zze.class, zzeVar);
        }

        private zze() {
        }

        public static void A(zze zzeVar, int i10) {
            zzeVar.zze |= 1;
            zzeVar.zzf = i10;
        }

        public static void B(zze zzeVar, long j) {
            zzeVar.zze |= 2;
            zzeVar.zzg = j;
        }

        public static zza D() {
            return (zza) zzc.u();
        }

        public final long C() {
            return this.zzg;
        }

        public final boolean F() {
            return (this.zze & 2) != 0;
        }

        public final boolean G() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zze> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zze.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int z() {
            return this.zzf;
        }
    }

    public static final class zzf extends zzjk<zzf, zza> implements zzkv {
        private static final zzf zzc;
        private static volatile zzlc<zzf> zzd;
        private int zze;
        private zzjt<zzh> zzf = A0.f8327v;
        private String zzg = "";
        private long zzh;
        private long zzi;
        private int zzj;

        public static final class zza extends zzjk.zzb<zzf, zza> implements zzkv {
            private zza() {
                super(zzf.zzc);
            }

            public final void r(zzh.zza zzaVar) {
                m();
                zzf.F((zzf) this.f8681t, (zzh) zzaVar.o());
            }

            public final void s(zzh zzhVar) {
                m();
                zzf.F((zzf) this.f8681t, zzhVar);
            }

            public final long t() {
                return ((zzf) this.f8681t).K();
            }

            public final zzh u(int i10) {
                return ((zzf) this.f8681t).A(i10);
            }

            public final void v(long j) {
                m();
                zzf.C(j, (zzf) this.f8681t);
            }

            public final long w() {
                return ((zzf) this.f8681t).L();
            }

            public final String x() {
                return ((zzf) this.f8681t).O();
            }

            public final List y() {
                return Collections.unmodifiableList(((zzf) this.f8681t).P());
            }

            public /* synthetic */ zza(int i10) {
                this();
            }
        }

        static {
            zzf zzfVar = new zzf();
            zzc = zzfVar;
            zzjk.s(zzf.class, zzfVar);
        }

        private zzf() {
        }

        public static void B(int i10, zzf zzfVar) {
            zzfVar.T();
            zzfVar.zzf.remove(i10);
        }

        public static void C(long j, zzf zzfVar) {
            zzfVar.zze |= 2;
            zzfVar.zzh = j;
        }

        public static void D(zzf zzfVar) {
            zzfVar.getClass();
            zzfVar.zzf = A0.f8327v;
        }

        public static void E(zzf zzfVar, int i10, zzh zzhVar) {
            zzfVar.getClass();
            zzfVar.T();
            zzfVar.zzf.set(i10, zzhVar);
        }

        public static void F(zzf zzfVar, zzh zzhVar) {
            zzfVar.getClass();
            zzhVar.getClass();
            zzfVar.T();
            zzfVar.zzf.add(zzhVar);
        }

        public static void G(zzf zzfVar, Iterable iterable) {
            zzfVar.T();
            zzhq.j(iterable, zzfVar.zzf);
        }

        public static void H(zzf zzfVar, String str) {
            zzfVar.getClass();
            str.getClass();
            zzfVar.zze |= 1;
            zzfVar.zzg = str;
        }

        public static void J(long j, zzf zzfVar) {
            zzfVar.zze |= 4;
            zzfVar.zzi = j;
        }

        public static zza M() {
            return (zza) zzc.u();
        }

        public final zzh A(int i10) {
            return this.zzf.get(i10);
        }

        public final int I() {
            return this.zzf.size();
        }

        public final long K() {
            return this.zzi;
        }

        public final long L() {
            return this.zzh;
        }

        public final String O() {
            return this.zzg;
        }

        public final zzjt P() {
            return this.zzf;
        }

        public final boolean Q() {
            return (this.zze & 8) != 0;
        }

        public final boolean R() {
            return (this.zze & 4) != 0;
        }

        public final boolean S() {
            return (this.zze & 2) != 0;
        }

        public final void T() {
            zzjt<zzh> zzjtVar = this.zzf;
            if (zzjtVar.c()) {
                return;
            }
            this.zzf = zzjk.p(zzjtVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zze", "zzf", zzh.class, "zzg", "zzh", "zzi", "zzj"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzf> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zzf.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int z() {
            return this.zzj;
        }
    }

    public static final class zzg extends zzjk<zzg, zza> implements zzkv {
        private static final zzg zzc;
        private static volatile zzlc<zzg> zzd;
        private int zze;
        private String zzf = "";
        private long zzg;

        public static final class zza extends zzjk.zzb<zzg, zza> implements zzkv {
            private zza() {
                super(zzg.zzc);
            }

            public /* synthetic */ zza(int i10) {
                this();
            }
        }

        static {
            zzg zzgVar = new zzg();
            zzc = zzgVar;
            zzjk.s(zzg.class, zzgVar);
        }

        private zzg() {
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzg> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zzg.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzh extends zzjk<zzh, zza> implements zzkv {
        private static final zzh zzc;
        private static volatile zzlc<zzh> zzd;
        private int zze;
        private long zzh;
        private float zzi;
        private double zzj;
        private String zzf = "";
        private String zzg = "";
        private zzjt<zzh> zzk = A0.f8327v;

        public static final class zza extends zzjk.zzb<zzh, zza> implements zzkv {
            private zza() {
                super(zzh.zzc);
            }

            public final void r(long j) {
                m();
                zzh.B((zzh) this.f8681t, j);
            }

            public final void s(String str) {
                m();
                zzh.D((zzh) this.f8681t, str);
            }

            public final void t(String str) {
                m();
                zzh.I((zzh) this.f8681t, str);
            }

            public /* synthetic */ zza(int i10) {
                this();
            }
        }

        static {
            zzh zzhVar = new zzh();
            zzc = zzhVar;
            zzjk.s(zzh.class, zzhVar);
        }

        private zzh() {
        }

        public static void A(zzh zzhVar, double d3) {
            zzhVar.zze |= 16;
            zzhVar.zzj = d3;
        }

        public static void B(zzh zzhVar, long j) {
            zzhVar.zze |= 4;
            zzhVar.zzh = j;
        }

        public static void C(zzh zzhVar, zzh zzhVar2) {
            zzhVar.getClass();
            zzjt<zzh> zzjtVar = zzhVar.zzk;
            if (!zzjtVar.c()) {
                zzhVar.zzk = zzjk.p(zzjtVar);
            }
            zzhVar.zzk.add(zzhVar2);
        }

        public static void D(zzh zzhVar, String str) {
            zzhVar.getClass();
            str.getClass();
            zzhVar.zze |= 1;
            zzhVar.zzf = str;
        }

        public static void E(zzh zzhVar, ArrayList arrayList) {
            zzjt<zzh> zzjtVar = zzhVar.zzk;
            if (!zzjtVar.c()) {
                zzhVar.zzk = zzjk.p(zzjtVar);
            }
            zzhq.j(arrayList, zzhVar.zzk);
        }

        public static void F(zzh zzhVar) {
            zzhVar.zze &= -3;
            zzhVar.zzg = zzc.zzg;
        }

        public static void H(zzh zzhVar) {
            zzhVar.zze &= -5;
            zzhVar.zzh = 0L;
        }

        public static void I(zzh zzhVar, String str) {
            zzhVar.getClass();
            str.getClass();
            zzhVar.zze |= 2;
            zzhVar.zzg = str;
        }

        public static void K(zzh zzhVar) {
            zzhVar.zze &= -17;
            zzhVar.zzj = 0.0d;
        }

        public static void M(zzh zzhVar) {
            zzhVar.getClass();
            zzhVar.zzk = A0.f8327v;
        }

        public static zza N() {
            return (zza) zzc.u();
        }

        public final float G() {
            return this.zzi;
        }

        public final int J() {
            return this.zzk.size();
        }

        public final long L() {
            return this.zzh;
        }

        public final String P() {
            return this.zzf;
        }

        public final String Q() {
            return this.zzg;
        }

        public final List R() {
            return this.zzk;
        }

        public final boolean S() {
            return (this.zze & 16) != 0;
        }

        public final boolean T() {
            return (this.zze & 8) != 0;
        }

        public final boolean U() {
            return (this.zze & 4) != 0;
        }

        public final boolean V() {
            return (this.zze & 1) != 0;
        }

        public final boolean W() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzh.class});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzh> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zzh.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final double z() {
            return this.zzj;
        }
    }

    public static final class zzi extends zzjk<zzi, zza> implements zzkv {
        private static final zzi zzc;
        private static volatile zzlc<zzi> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";
        private zzb zzh;

        public static final class zza extends zzjk.zzb<zzi, zza> implements zzkv {
            private zza() {
                super(zzi.zzc);
            }

            public /* synthetic */ zza(int i10) {
                this();
            }
        }

        static {
            zzi zziVar = new zzi();
            zzc = zziVar;
            zzjk.s(zzi.class, zziVar);
        }

        private zzi() {
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zzi();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzi> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zzi.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzj extends zzjk<zzj, zzb> implements zzkv {
        private static final zzj zzc;
        private static volatile zzlc<zzj> zzd;
        private int zze;
        private zzjt<zzk> zzf = A0.f8327v;
        private String zzg = "";
        private String zzh = "";
        private int zzi;

        public enum zza implements zzjp {
            SDK(0),
            SGTM(1);


            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final int f8607s;

            zza(int i10) {
                this.f8607s = i10;
            }

            @Override // com.google.android.gms.internal.measurement.zzjp
            public final int b() {
                return this.f8607s;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8607s + " name=" + name() + '>';
            }
        }

        public static final class zzb extends zzjk.zzb<zzj, zzb> implements zzkv {
            private zzb() {
                super(zzj.zzc);
            }

            public /* synthetic */ zzb(int i10) {
                this();
            }
        }

        static {
            zzj zzjVar = new zzj();
            zzc = zzjVar;
            zzjk.s(zzj.class, zzjVar);
        }

        private zzj() {
        }

        public static void B(zzj zzjVar, zzk zzkVar) {
            zzjVar.getClass();
            zzjt<zzk> zzjtVar = zzjVar.zzf;
            if (!zzjtVar.c()) {
                zzjVar.zzf = zzjk.p(zzjtVar);
            }
            zzjVar.zzf.add(zzkVar);
        }

        public static void C(zzj zzjVar, String str) {
            zzjVar.getClass();
            str.getClass();
            zzjVar.zze |= 2;
            zzjVar.zzh = str;
        }

        public static zzb D() {
            return (zzb) zzc.u();
        }

        public final zzk A() {
            return this.zzf.get(0);
        }

        public final String F() {
            return this.zzh;
        }

        public final List G() {
            return this.zzf;
        }

        public final boolean H() {
            return (this.zze & 2) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zzj();
                case 2:
                    return new zzb(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zze", "zzf", zzk.class, "zzg", "zzh", "zzi", K.a});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzj> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zzj.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int z() {
            return this.zzf.size();
        }
    }

    public static final class zzk extends zzjk<zzk, zza> implements zzkv {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final /* synthetic */ int f8608s = 0;
        private static final zzk zzc;
        private static volatile zzlc<zzk> zzd;
        private String zzaa;
        private long zzab;
        private int zzac;
        private String zzad;
        private String zzae;
        private boolean zzaf;
        private zzjt<zzd> zzag;
        private String zzah;
        private int zzai;
        private int zzaj;
        private int zzak;
        private String zzal;
        private long zzam;
        private long zzan;
        private String zzao;
        private String zzap;
        private int zzaq;
        private String zzar;
        private zzl zzas;
        private zzjr zzat;
        private long zzau;
        private long zzav;
        private String zzaw;
        private String zzax;
        private int zzay;
        private boolean zzaz;
        private String zzba;
        private boolean zzbb;
        private zzi zzbc;
        private String zzbd;
        private zzjt<String> zzbe;
        private String zzbf;
        private long zzbg;
        private boolean zzbh;
        private String zzbi;
        private boolean zzbj;
        private String zzbk;
        private int zzbl;
        private String zzbm;
        private zzc zzbn;
        private int zzbo;
        private zza zzbp;
        private int zze;
        private int zzf;
        private int zzg;
        private zzjt<zzf> zzh;
        private zzjt<zzo> zzi;
        private long zzj;
        private long zzk;
        private long zzl;
        private long zzm;
        private long zzn;
        private String zzo;
        private String zzp;
        private String zzq;
        private String zzr;
        private int zzs;
        private String zzt;
        private String zzu;
        private String zzv;
        private long zzw;
        private long zzx;
        private String zzy;
        private boolean zzz;

        public static final class zza extends zzjk.zzb<zzk, zza> implements zzkv {
            private zza() {
                super(zzk.zzc);
            }

            public final void A(String str) {
                m();
                zzk.T1((zzk) this.f8681t, str);
            }

            public final int B() {
                return ((zzk) this.f8681t).g1();
            }

            public final void C(long j) {
                m();
                zzk.Q1((zzk) this.f8681t, j);
            }

            public final void D(String str) {
                m();
                zzk.Z1((zzk) this.f8681t, str);
            }

            public final void E(ArrayList arrayList) {
                m();
                zzk.J((zzk) this.f8681t, arrayList);
            }

            public final void F(boolean z6) {
                m();
                zzk.X0((zzk) this.f8681t, z6);
            }

            public final void G(int i10) {
                m();
                zzk.T0((zzk) this.f8681t, i10);
            }

            public final void H(long j) {
                m();
                zzk.p0((zzk) this.f8681t, j);
            }

            public final void I(String str) {
                m();
                zzk.R1((zzk) this.f8681t, str);
            }

            public final void J(int i10) {
                m();
                zzk.D1((zzk) this.f8681t, i10);
            }

            public final void L(String str) {
                m();
                zzk.V1((zzk) this.f8681t, str);
            }

            public final void M(int i10) {
                m();
                zzk.y1((zzk) this.f8681t, i10);
            }

            public final void N(long j) {
                m();
                zzk.I1((zzk) this.f8681t, j);
            }

            public final void O(int i10) {
                m();
                zzk.a1((zzk) this.f8681t, i10);
            }

            public final void P(long j) {
                m();
                zzk.E1((zzk) this.f8681t, j);
            }

            public final void Q(String str) {
                m();
                zzk.V0((zzk) this.f8681t, str);
            }

            public final void R(long j) {
                m();
                zzk.z1((zzk) this.f8681t, j);
            }

            public final void S() {
                m();
                zzk.t0((zzk) this.f8681t);
            }

            public final void U() {
                String str = Build.MODEL;
                m();
                zzk.H1((zzk) this.f8681t);
            }

            public final void V() {
                m();
                zzk zzkVar = (zzk) this.f8681t;
                int i10 = zzk.f8608s;
                zzkVar.getClass();
                throw null;
            }

            public final void W(int i10) {
                m();
                zzk.t1((zzk) this.f8681t, i10);
            }

            public final void X(long j) {
                m();
                zzk.b1((zzk) this.f8681t, j);
            }

            public final void Y(String str) {
                m();
                zzk.f2((zzk) this.f8681t, str);
            }

            public final void Z() {
                m();
                zzk.N1((zzk) this.f8681t);
            }

            public final void a0(String str) {
                m();
                zzk.d2((zzk) this.f8681t, str);
            }

            public final void b0(String str) {
                m();
                zzk.b2((zzk) this.f8681t, str);
            }

            public final void c0() {
                m();
                zzk.n1((zzk) this.f8681t);
            }

            public final void d0() {
                m();
                zzk.h1((zzk) this.f8681t);
            }

            public final void e0() {
                m();
                zzk.x1((zzk) this.f8681t);
            }

            public final void f0(String str) {
                m();
                zzk.X1((zzk) this.f8681t, str);
            }

            public final void g0(String str) {
                m();
                zzk.c1((zzk) this.f8681t, str);
            }

            public final void h0(String str) {
                m();
                zzk.M1((zzk) this.f8681t, str);
            }

            public final void i0() {
                m();
                zzk.L((zzk) this.f8681t);
            }

            public final String j0() {
                return ((zzk) this.f8681t).m2();
            }

            public final void r(int i10, zzf.zza zzaVar) {
                m();
                zzk.C((zzk) this.f8681t, i10, (zzf) zzaVar.o());
            }

            public final void s(int i10, zzf zzfVar) {
                m();
                zzk.C((zzk) this.f8681t, i10, zzfVar);
            }

            public final void t(zzc zzcVar) {
                m();
                zzk.G((zzk) this.f8681t, zzcVar);
            }

            public final void u(zzf.zza zzaVar) {
                m();
                zzk.H((zzk) this.f8681t, (zzf) zzaVar.o());
            }

            public final void v(zzo.zza zzaVar) {
                m();
                zzk.I((zzk) this.f8681t, (zzo) zzaVar.o());
            }

            public final void w(boolean z6) {
                m();
                zzk.K((zzk) this.f8681t, z6);
            }

            public final void x(String str) {
                m();
                zzk.q0((zzk) this.f8681t, str);
            }

            public final List y() {
                return Collections.unmodifiableList(((zzk) this.f8681t).d0());
            }

            public final void z(int i10) {
                m();
                zzk.i1((zzk) this.f8681t, i10);
            }

            public /* synthetic */ zza(int i10) {
                this();
            }
        }

        static {
            zzk zzkVar = new zzk();
            zzc = zzkVar;
            zzjk.s(zzk.class, zzkVar);
        }

        private zzk() {
            A0 a10 = A0.f8327v;
            this.zzh = a10;
            this.zzi = a10;
            this.zzo = "";
            this.zzp = "";
            this.zzq = "";
            this.zzr = "";
            this.zzt = "";
            this.zzu = "";
            this.zzv = "";
            this.zzy = "";
            this.zzaa = "";
            this.zzad = "";
            this.zzae = "";
            this.zzag = a10;
            this.zzah = "";
            this.zzal = "";
            this.zzao = "";
            this.zzap = "";
            this.zzar = "";
            this.zzat = C0589p0.f8399v;
            this.zzaw = "";
            this.zzax = "";
            this.zzba = "";
            this.zzbd = "";
            this.zzbe = a10;
            this.zzbf = "";
            this.zzbi = "";
            this.zzbk = "";
            this.zzbm = "";
        }

        public static void A1(zzk zzkVar) {
            zzkVar.zze &= -65537;
            zzkVar.zzy = zzc.zzy;
        }

        public static void B(zzk zzkVar, int i10) {
            zzkVar.zzf |= 2;
            zzkVar.zzaq = i10;
        }

        public static void C(zzk zzkVar, int i10, zzf zzfVar) {
            zzkVar.getClass();
            zzkVar.e1();
            zzkVar.zzh.set(i10, zzfVar);
        }

        public static void C1(zzk zzkVar) {
            zzkVar.zze &= -131073;
            zzkVar.zzz = false;
        }

        public static void D(zzk zzkVar, int i10, zzo zzoVar) {
            zzkVar.getClass();
            zzkVar.f1();
            zzkVar.zzi.set(i10, zzoVar);
        }

        public static void D1(zzk zzkVar, int i10) {
            zzkVar.zze |= 33554432;
            zzkVar.zzai = i10;
        }

        public static void E(zzk zzkVar, long j) {
            zzkVar.zze |= 536870912;
            zzkVar.zzam = j;
        }

        public static void E1(zzk zzkVar, long j) {
            zzkVar.zze |= 32;
            zzkVar.zzn = j;
        }

        public static void F(zzk zzkVar, zza zzaVar) {
            zzkVar.getClass();
            zzkVar.zzbp = zzaVar;
            zzkVar.zzf |= 16777216;
        }

        public static void F1(zzk zzkVar, String str) {
            zzkVar.getClass();
            str.getClass();
            zzkVar.zze |= 128;
            zzkVar.zzp = str;
        }

        public static void G(zzk zzkVar, zzc zzcVar) {
            zzkVar.getClass();
            zzkVar.zzbn = zzcVar;
            zzkVar.zzf |= 4194304;
        }

        public static void H(zzk zzkVar, zzf zzfVar) {
            zzkVar.getClass();
            zzkVar.e1();
            zzkVar.zzh.add(zzfVar);
        }

        public static void H1(zzk zzkVar) {
            String str = Build.MODEL;
            zzkVar.getClass();
            str.getClass();
            zzkVar.zze |= 256;
            zzkVar.zzq = str;
        }

        public static void I(zzk zzkVar, zzo zzoVar) {
            zzkVar.getClass();
            zzkVar.f1();
            zzkVar.zzi.add(zzoVar);
        }

        public static void I1(zzk zzkVar, long j) {
            zzkVar.zze |= 16384;
            zzkVar.zzw = j;
        }

        public static void J(zzk zzkVar, ArrayList arrayList) {
            zzjr zzjrVar = zzkVar.zzat;
            if (!zzjrVar.c()) {
                int size = zzjrVar.size();
                zzkVar.zzat = zzjrVar.h(size == 0 ? 10 : size << 1);
            }
            zzhq.j(arrayList, zzkVar.zzat);
        }

        public static void J1(zzk zzkVar) {
            zzkVar.zze &= -262145;
            zzkVar.zzaa = zzc.zzaa;
        }

        public static void K(zzk zzkVar, boolean z6) {
            zzkVar.zzf |= 65536;
            zzkVar.zzbh = z6;
        }

        public static void L(zzk zzkVar) {
            zzkVar.zze &= -268435457;
            zzkVar.zzal = zzc.zzal;
        }

        public static void L1(zzk zzkVar) {
            zzkVar.zze |= 32768;
            zzkVar.zzx = 97001L;
        }

        public static void M1(zzk zzkVar, String str) {
            zzkVar.getClass();
            str.getClass();
            zzkVar.zze |= 512;
            zzkVar.zzr = str;
        }

        public static void N1(zzk zzkVar) {
            zzkVar.zze &= -2097153;
            zzkVar.zzad = zzc.zzad;
        }

        public static void P1(zzk zzkVar) {
            zzkVar.getClass();
            zzkVar.zzag = A0.f8327v;
        }

        public static void Q1(zzk zzkVar, long j) {
            zzkVar.zze |= 524288;
            zzkVar.zzab = j;
        }

        public static void R1(zzk zzkVar, String str) {
            zzkVar.getClass();
            str.getClass();
            zzkVar.zze |= 2048;
            zzkVar.zzt = str;
        }

        public static void S0(zzk zzkVar) {
            zzkVar.zzf &= -8193;
            zzkVar.zzbd = zzc.zzbd;
        }

        public static void T0(zzk zzkVar, int i10) {
            zzkVar.zzf |= 1048576;
            zzkVar.zzbl = i10;
        }

        public static void T1(zzk zzkVar, String str) {
            zzkVar.getClass();
            str.getClass();
            zzkVar.zze |= 4096;
            zzkVar.zzu = str;
        }

        public static void U0(zzk zzkVar, long j) {
            zzkVar.zzf |= 32;
            zzkVar.zzav = j;
        }

        public static void V0(zzk zzkVar, String str) {
            zzkVar.getClass();
            str.getClass();
            zzkVar.zzf |= 128;
            zzkVar.zzax = str;
        }

        public static void V1(zzk zzkVar, String str) {
            zzkVar.getClass();
            str.getClass();
            zzkVar.zze |= 8192;
            zzkVar.zzv = str;
        }

        public static void W0(zzk zzkVar, ArrayList arrayList) {
            zzkVar.e1();
            zzhq.j(arrayList, zzkVar.zzh);
        }

        public static void X0(zzk zzkVar, boolean z6) {
            zzkVar.zze |= 131072;
            zzkVar.zzz = z6;
        }

        public static void X1(zzk zzkVar, String str) {
            zzkVar.getClass();
            str.getClass();
            zzkVar.zze |= 65536;
            zzkVar.zzy = str;
        }

        public static void Z0(zzk zzkVar) {
            zzkVar.getClass();
            zzkVar.zzh = A0.f8327v;
        }

        public static void Z1(zzk zzkVar, String str) {
            zzkVar.getClass();
            zzkVar.zze |= 262144;
            zzkVar.zzaa = str;
        }

        public static void a1(zzk zzkVar, int i10) {
            zzkVar.zzf |= 8388608;
            zzkVar.zzbo = i10;
        }

        public static void b1(zzk zzkVar, long j) {
            zzkVar.zzf |= 32768;
            zzkVar.zzbg = j;
        }

        public static void b2(zzk zzkVar, String str) {
            zzkVar.getClass();
            zzkVar.zze |= 2097152;
            zzkVar.zzad = str;
        }

        public static void c1(zzk zzkVar, String str) {
            zzkVar.getClass();
            str.getClass();
            zzkVar.zzf |= 8192;
            zzkVar.zzbd = str;
        }

        public static void d1(zzk zzkVar) {
            zzkVar.zze |= 8388608;
            zzkVar.zzaf = false;
        }

        public static void d2(zzk zzkVar, String str) {
            zzkVar.getClass();
            str.getClass();
            zzkVar.zze |= 4194304;
            zzkVar.zzae = str;
        }

        public static void f2(zzk zzkVar, String str) {
            zzkVar.getClass();
            zzkVar.zze |= 16777216;
            zzkVar.zzah = str;
        }

        public static void h1(zzk zzkVar) {
            zzkVar.zze &= -17;
            zzkVar.zzm = 0L;
        }

        public static void i1(zzk zzkVar, int i10) {
            zzkVar.e1();
            zzkVar.zzh.remove(i10);
        }

        public static void j1(zzk zzkVar, long j) {
            zzkVar.zze |= 2;
            zzkVar.zzj = j;
        }

        public static zza j2() {
            return (zza) zzc.u();
        }

        public static void k1(zzk zzkVar, String str) {
            zzkVar.getClass();
            str.getClass();
            zzkVar.zzf |= 16384;
            zzkVar.zzbf = str;
        }

        public static void l1(zzk zzkVar, ArrayList arrayList) {
            zzjt<zzd> zzjtVar = zzkVar.zzag;
            if (!zzjtVar.c()) {
                zzkVar.zzag = zzjk.p(zzjtVar);
            }
            zzhq.j(arrayList, zzkVar.zzag);
        }

        public static void n1(zzk zzkVar) {
            zzkVar.zze &= -33;
            zzkVar.zzn = 0L;
        }

        public static void o0(zzk zzkVar) {
            zzkVar.zze &= Integer.MAX_VALUE;
            zzkVar.zzao = zzc.zzao;
        }

        public static void o1(zzk zzkVar, int i10) {
            zzkVar.f1();
            zzkVar.zzi.remove(i10);
        }

        public static void p0(zzk zzkVar, long j) {
            zzkVar.zzf |= 16;
            zzkVar.zzau = j;
        }

        public static void p1(zzk zzkVar, long j) {
            zzkVar.zze |= 4;
            zzkVar.zzk = j;
        }

        public static void q0(zzk zzkVar, String str) {
            zzkVar.getClass();
            str.getClass();
            zzkVar.zzf |= 4;
            zzkVar.zzar = str;
        }

        public static void q1(zzk zzkVar, String str) {
            zzkVar.getClass();
            str.getClass();
            zzkVar.zzf |= 131072;
            zzkVar.zzbi = str;
        }

        public static void r0(zzk zzkVar, Set set) {
            zzjt<String> zzjtVar = zzkVar.zzbe;
            if (!zzjtVar.c()) {
                zzkVar.zzbe = zzjk.p(zzjtVar);
            }
            zzhq.j(set, zzkVar.zzbe);
        }

        public static void s0(zzk zzkVar, boolean z6) {
            zzkVar.zzf |= 262144;
            zzkVar.zzbj = z6;
        }

        public static void s1(zzk zzkVar) {
            zzkVar.zze &= -257;
            zzkVar.zzq = zzc.zzq;
        }

        public static void t0(zzk zzkVar) {
            zzkVar.zze |= 1;
            zzkVar.zzg = 1;
        }

        public static void t1(zzk zzkVar, int i10) {
            zzkVar.zze |= 1024;
            zzkVar.zzs = i10;
        }

        public static void u1(zzk zzkVar, long j) {
            zzkVar.zze |= 8;
            zzkVar.zzl = j;
        }

        public static void v1(zzk zzkVar, String str) {
            zzkVar.getClass();
            str.getClass();
            zzkVar.zzf |= 524288;
            zzkVar.zzbk = str;
        }

        public static void x1(zzk zzkVar) {
            zzkVar.getClass();
            zzkVar.zze |= 64;
            zzkVar.zzo = MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID;
        }

        public static void y1(zzk zzkVar, int i10) {
            zzkVar.zze |= 1048576;
            zzkVar.zzac = i10;
        }

        public static void z1(zzk zzkVar, long j) {
            zzkVar.zze |= 16;
            zzkVar.zzm = j;
        }

        public final zzf A(int i10) {
            return this.zzh.get(i10);
        }

        public final boolean A0() {
            return (this.zze & 524288) != 0;
        }

        public final boolean B0() {
            return (this.zzf & 16) != 0;
        }

        public final int B1() {
            return this.zzi.size();
        }

        public final boolean C0() {
            return (this.zze & 8) != 0;
        }

        public final boolean D0() {
            return (this.zze & 16384) != 0;
        }

        public final boolean E0() {
            return (this.zzf & 262144) != 0;
        }

        public final boolean F0() {
            return (this.zze & 131072) != 0;
        }

        public final boolean G0() {
            return (this.zze & 32) != 0;
        }

        public final long G1() {
            return this.zzam;
        }

        public final boolean H0() {
            return (this.zze & 16) != 0;
        }

        public final boolean I0() {
            return (this.zze & 1) != 0;
        }

        public final boolean J0() {
            return (this.zzf & 2) != 0;
        }

        public final boolean K0() {
            return (this.zze & 8388608) != 0;
        }

        public final long K1() {
            return this.zzab;
        }

        public final boolean L0() {
            return (this.zzf & 8192) != 0;
        }

        public final String M() {
            return this.zzaa;
        }

        public final boolean M0() {
            return (this.zze & 4) != 0;
        }

        public final String N() {
            return this.zzt;
        }

        public final boolean N0() {
            return (this.zzf & 32768) != 0;
        }

        public final String O() {
            return this.zzv;
        }

        public final boolean O0() {
            return (this.zze & 1024) != 0;
        }

        public final long O1() {
            return this.zzau;
        }

        public final String P() {
            return this.zzbi;
        }

        public final boolean P0() {
            return (this.zze & 2) != 0;
        }

        public final String Q() {
            return this.zzax;
        }

        public final boolean Q0() {
            return (this.zze & 32768) != 0;
        }

        public final String R() {
            return this.zzbk;
        }

        public final int R0() {
            return this.zzac;
        }

        public final String S() {
            return this.zzq;
        }

        public final long S1() {
            return this.zzl;
        }

        public final String T() {
            return this.zzao;
        }

        public final String U() {
            return this.zzah;
        }

        public final long U1() {
            return this.zzw;
        }

        public final String V() {
            return this.zzae;
        }

        public final String W() {
            return this.zzad;
        }

        public final long W1() {
            return this.zzn;
        }

        public final String X() {
            return this.zzp;
        }

        public final String Y() {
            return this.zzo;
        }

        public final int Y0() {
            return this.zzbo;
        }

        public final long Y1() {
            return this.zzm;
        }

        public final String Z() {
            return this.zzy;
        }

        public final String a0() {
            return this.zzbd;
        }

        public final long a2() {
            return this.zzk;
        }

        public final String b0() {
            return this.zzr;
        }

        public final zzjt c0() {
            return this.zzag;
        }

        public final long c2() {
            return this.zzbg;
        }

        public final zzjt d0() {
            return this.zzh;
        }

        public final zzjt e0() {
            return this.zzi;
        }

        public final void e1() {
            zzjt<zzf> zzjtVar = this.zzh;
            if (zzjtVar.c()) {
                return;
            }
            this.zzh = zzjk.p(zzjtVar);
        }

        public final long e2() {
            return this.zzj;
        }

        public final boolean f0() {
            return this.zzbh;
        }

        public final void f1() {
            zzjt<zzo> zzjtVar = this.zzi;
            if (zzjtVar.c()) {
                return;
            }
            this.zzi = zzjk.p(zzjtVar);
        }

        public final boolean g0() {
            return this.zzbj;
        }

        public final int g1() {
            return this.zzh.size();
        }

        public final long g2() {
            return this.zzx;
        }

        public final boolean h0() {
            return this.zzz;
        }

        public final zza h2() {
            zza zzaVar = this.zzbp;
            return zzaVar == null ? zza.N() : zzaVar;
        }

        public final boolean i0() {
            return this.zzaf;
        }

        public final zzc i2() {
            zzc zzcVar = this.zzbn;
            return zzcVar == null ? zzc.D() : zzcVar;
        }

        public final boolean j0() {
            return (this.zzf & 16777216) != 0;
        }

        public final boolean k0() {
            return (this.zze & 33554432) != 0;
        }

        public final boolean l0() {
            return (this.zzf & 4194304) != 0;
        }

        public final String l2() {
            return this.zzar;
        }

        public final int m0() {
            return this.zzai;
        }

        public final int m1() {
            return this.zzg;
        }

        public final String m2() {
            return this.zzu;
        }

        public final zzo n0(int i10) {
            return this.zzi.get(i10);
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zzk();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001>\u0000\u0002\u0001O>\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8", new Object[]{"zze", "zzf", "zzg", "zzh", zzf.class, "zzi", zzo.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzm", "zzaf", "zzag", zzd.class, "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", J.a, "zzaz", "zzba", "zzbb", "zzbc", "zzbd", "zzbe", "zzbf", "zzbg", "zzbh", "zzbi", "zzbj", "zzbk", "zzbl", "zzbm", "zzbn", "zzbo", "zzbp"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzk> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zzk.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int r1() {
            return this.zzaq;
        }

        public final boolean u0() {
            return (this.zze & 1048576) != 0;
        }

        public final boolean v0() {
            return (this.zze & 536870912) != 0;
        }

        public final boolean w0() {
            return (this.zzf & 131072) != 0;
        }

        public final int w1() {
            return this.zzs;
        }

        public final boolean x0() {
            return (this.zzf & 128) != 0;
        }

        public final boolean y0() {
            return (this.zzf & 524288) != 0;
        }

        public final int z() {
            return this.zzbl;
        }

        public final boolean z0() {
            return (this.zzf & 8388608) != 0;
        }
    }

    public static final class zzl extends zzjk<zzl, zzb> implements zzkv {
        private static final zzl zzc;
        private static volatile zzlc<zzl> zzd;
        private int zze;
        private int zzf = 1;
        private zzjt<zzg> zzg = A0.f8327v;

        public enum zza implements zzjp {
            RADS(1),
            PROVISIONING(2);


            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final int f8612s;

            zza(int i10) {
                this.f8612s = i10;
            }

            @Override // com.google.android.gms.internal.measurement.zzjp
            public final int b() {
                return this.f8612s;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8612s + " name=" + name() + '>';
            }
        }

        public static final class zzb extends zzjk.zzb<zzl, zzb> implements zzkv {
            private zzb() {
                super(zzl.zzc);
            }

            public /* synthetic */ zzb(int i10) {
                this();
            }
        }

        static {
            zzl zzlVar = new zzl();
            zzc = zzlVar;
            zzjk.s(zzl.class, zzlVar);
        }

        private zzl() {
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zzl();
                case 2:
                    return new zzb(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zze", "zzf", L.a, "zzg", zzg.class});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzl> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zzl.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzm extends zzjk<zzm, zza> implements zzkv {
        private static final zzm zzc;
        private static volatile zzlc<zzm> zzd;
        private zzjq zze;
        private zzjq zzf;
        private zzjt<zze> zzg;
        private zzjt<zzn> zzh;

        public static final class zza extends zzjk.zzb<zzm, zza> implements zzkv {
            private zza() {
                super(zzm.zzc);
            }

            public /* synthetic */ zza(int i10) {
                this();
            }
        }

        static {
            zzm zzmVar = new zzm();
            zzc = zzmVar;
            zzjk.s(zzm.class, zzmVar);
        }

        private zzm() {
            C0594s0 c0594s0 = C0594s0.f8413v;
            this.zze = c0594s0;
            this.zzf = c0594s0;
            A0 a10 = A0.f8327v;
            this.zzg = a10;
            this.zzh = a10;
        }

        public static void A(zzm zzmVar, List list) {
            zzjq zzjqVar = zzmVar.zze;
            if (!zzjqVar.c()) {
                int size = zzjqVar.size();
                zzmVar.zze = zzjqVar.h(size == 0 ? 10 : size << 1);
            }
            zzhq.j(list, zzmVar.zze);
        }

        public static void B(zzm zzmVar) {
            zzmVar.getClass();
            zzmVar.zze = C0594s0.f8413v;
        }

        public static void D(zzm zzmVar, List list) {
            zzjq zzjqVar = zzmVar.zzf;
            if (!zzjqVar.c()) {
                int size = zzjqVar.size();
                zzmVar.zzf = zzjqVar.h(size == 0 ? 10 : size << 1);
            }
            zzhq.j(list, zzmVar.zzf);
        }

        public static void E(zzm zzmVar) {
            zzmVar.getClass();
            zzmVar.zzf = C0594s0.f8413v;
        }

        public static void G(zzm zzmVar) {
            zzmVar.getClass();
            zzmVar.zzg = A0.f8327v;
        }

        public static void H(zzm zzmVar, ArrayList arrayList) {
            zzjt<zze> zzjtVar = zzmVar.zzg;
            if (!zzjtVar.c()) {
                zzmVar.zzg = zzjk.p(zzjtVar);
            }
            zzhq.j(arrayList, zzmVar.zzg);
        }

        public static void J(zzm zzmVar) {
            zzmVar.getClass();
            zzmVar.zzh = A0.f8327v;
        }

        public static void K(zzm zzmVar, List list) {
            zzjt<zzn> zzjtVar = zzmVar.zzh;
            if (!zzjtVar.c()) {
                zzmVar.zzh = zzjk.p(zzjtVar);
            }
            zzhq.j(list, zzmVar.zzh);
        }

        public static zza L() {
            return (zza) zzc.u();
        }

        public static zzm N() {
            return zzc;
        }

        public final int C() {
            return this.zzf.size();
        }

        public final int F() {
            return this.zzh.size();
        }

        public final int I() {
            return this.zze.size();
        }

        public final zzjt O() {
            return this.zzg;
        }

        public final List P() {
            return this.zzf;
        }

        public final zzjt Q() {
            return this.zzh;
        }

        public final List R() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zzm();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzn.class});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzm> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zzm.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int z() {
            return this.zzg.size();
        }
    }

    public static final class zzn extends zzjk<zzn, zza> implements zzkv {
        private static final zzn zzc;
        private static volatile zzlc<zzn> zzd;
        private int zze;
        private int zzf;
        private zzjq zzg = C0594s0.f8413v;

        public static final class zza extends zzjk.zzb<zzn, zza> implements zzkv {
            private zza() {
                super(zzn.zzc);
            }

            public /* synthetic */ zza(int i10) {
                this();
            }
        }

        static {
            zzn zznVar = new zzn();
            zzc = zznVar;
            zzjk.s(zzn.class, zznVar);
        }

        private zzn() {
        }

        public static void B(zzn zznVar, int i10) {
            zznVar.zze |= 1;
            zznVar.zzf = i10;
        }

        public static void C(zzn zznVar, List list) {
            zzjq zzjqVar = zznVar.zzg;
            if (!zzjqVar.c()) {
                int size = zzjqVar.size();
                zznVar.zzg = zzjqVar.h(size == 0 ? 10 : size << 1);
            }
            zzhq.j(list, zznVar.zzg);
        }

        public static zza E() {
            return (zza) zzc.u();
        }

        public final long A(int i10) {
            return this.zzg.G(i10);
        }

        public final int D() {
            return this.zzf;
        }

        public final List G() {
            return this.zzg;
        }

        public final boolean H() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zzn();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzn> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zzn.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final int z() {
            return this.zzg.size();
        }
    }

    public static final class zzo extends zzjk<zzo, zza> implements zzkv {
        private static final zzo zzc;
        private static volatile zzlc<zzo> zzd;
        private int zze;
        private long zzf;
        private String zzg = "";
        private String zzh = "";
        private long zzi;
        private float zzj;
        private double zzk;

        public static final class zza extends zzjk.zzb<zzo, zza> implements zzkv {
            private zza() {
                super(zzo.zzc);
            }

            public /* synthetic */ zza(int i10) {
                this();
            }
        }

        static {
            zzo zzoVar = new zzo();
            zzc = zzoVar;
            zzjk.s(zzo.class, zzoVar);
        }

        private zzo() {
        }

        public static void A(zzo zzoVar, double d3) {
            zzoVar.zze |= 32;
            zzoVar.zzk = d3;
        }

        public static void B(zzo zzoVar, long j) {
            zzoVar.zze |= 1;
            zzoVar.zzf = j;
        }

        public static void C(zzo zzoVar, String str) {
            zzoVar.getClass();
            str.getClass();
            zzoVar.zze |= 2;
            zzoVar.zzg = str;
        }

        public static void D(zzo zzoVar) {
            zzoVar.zze &= -5;
            zzoVar.zzh = zzc.zzh;
        }

        public static void F(zzo zzoVar) {
            zzoVar.zze &= -9;
            zzoVar.zzi = 0L;
        }

        public static void G(zzo zzoVar, long j) {
            zzoVar.zze |= 8;
            zzoVar.zzi = j;
        }

        public static void H(zzo zzoVar, String str) {
            zzoVar.getClass();
            str.getClass();
            zzoVar.zze |= 4;
            zzoVar.zzh = str;
        }

        public static void J(zzo zzoVar) {
            zzoVar.zze &= -33;
            zzoVar.zzk = 0.0d;
        }

        public static zza L() {
            return (zza) zzc.u();
        }

        public final float E() {
            return this.zzj;
        }

        public final long I() {
            return this.zzi;
        }

        public final long K() {
            return this.zzf;
        }

        public final String N() {
            return this.zzg;
        }

        public final String O() {
            return this.zzh;
        }

        public final boolean P() {
            return (this.zze & 32) != 0;
        }

        public final boolean Q() {
            return (this.zze & 16) != 0;
        }

        public final boolean R() {
            return (this.zze & 8) != 0;
        }

        public final boolean S() {
            return (this.zze & 1) != 0;
        }

        public final boolean T() {
            return (this.zze & 4) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (I.a[i10 - 1]) {
                case 1:
                    return new zzo();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzc;
                case 5:
                    zzlc<zzo> zzlcVar = zzd;
                    if (zzlcVar != null) {
                        return zzlcVar;
                    }
                    synchronized (zzo.class) {
                        try {
                            zzaVar = zzd;
                            if (zzaVar == null) {
                                zzaVar = new zzjk.zza();
                                zzd = zzaVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    return zzaVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public final double z() {
            return this.zzk;
        }
    }
}
