package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzff {

    public static final class zza extends zzjk<zza, C0003zza> implements zzkv {
        private static final zza zzc;
        private static volatile zzlc<zza> zzd;
        private int zze;
        private int zzf;
        private zzjt<zze> zzg;
        private zzjt<zzb> zzh;
        private boolean zzi;
        private boolean zzj;

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzff$zza$zza, reason: collision with other inner class name */
        public static final class C0003zza extends zzjk.zzb<zza, C0003zza> implements zzkv {
            private C0003zza() {
                super(zza.zzc);
            }

            public /* synthetic */ C0003zza(int i10) {
                this();
            }
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjk.s(zza.class, zzaVar);
        }

        private zza() {
            A0 a10 = A0.f8327v;
            this.zzg = a10;
            this.zzh = a10;
        }

        public static void B(zza zzaVar, int i10, zzb zzbVar) {
            zzaVar.getClass();
            zzjt<zzb> zzjtVar = zzaVar.zzh;
            if (!zzjtVar.c()) {
                zzaVar.zzh = zzjk.p(zzjtVar);
            }
            zzaVar.zzh.set(i10, zzbVar);
        }

        public static void C(zza zzaVar, int i10, zze zzeVar) {
            zzaVar.getClass();
            zzjt<zze> zzjtVar = zzaVar.zzg;
            if (!zzjtVar.c()) {
                zzaVar.zzg = zzjk.p(zzjtVar);
            }
            zzaVar.zzg.set(i10, zzeVar);
        }

        public final zzb A(int i10) {
            return this.zzh.get(i10);
        }

        public final int D() {
            return this.zzh.size();
        }

        public final zze E(int i10) {
            return this.zzg.get(i10);
        }

        public final int F() {
            return this.zzg.size();
        }

        public final List H() {
            return this.zzh;
        }

        public final List I() {
            return this.zzg;
        }

        public final boolean J() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (C.a[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0003zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zze.class, "zzh", zzb.class, "zzi", "zzj"});
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

        public final int z() {
            return this.zzf;
        }
    }

    public static final class zzb extends zzjk<zzb, zza> implements zzkv {
        private static final zzb zzc;
        private static volatile zzlc<zzb> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzjt<zzc> zzh = A0.f8327v;
        private boolean zzi;
        private zzd zzj;
        private boolean zzk;
        private boolean zzl;
        private boolean zzm;

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

        public static void B(zzb zzbVar, int i10, zzc zzcVar) {
            zzbVar.getClass();
            zzjt<zzc> zzjtVar = zzbVar.zzh;
            if (!zzjtVar.c()) {
                zzbVar.zzh = zzjk.p(zzjtVar);
            }
            zzbVar.zzh.set(i10, zzcVar);
        }

        public static void C(zzb zzbVar, String str) {
            zzbVar.getClass();
            zzbVar.zze |= 2;
            zzbVar.zzg = str;
        }

        public static zza E() {
            return (zza) zzc.u();
        }

        public final zzc A(int i10) {
            return this.zzh.get(i10);
        }

        public final int D() {
            return this.zzf;
        }

        public final zzd G() {
            zzd zzdVar = this.zzj;
            return zzdVar == null ? zzd.B() : zzdVar;
        }

        public final String H() {
            return this.zzg;
        }

        public final zzjt I() {
            return this.zzh;
        }

        public final boolean J() {
            return this.zzk;
        }

        public final boolean K() {
            return this.zzl;
        }

        public final boolean L() {
            return this.zzm;
        }

        public final boolean M() {
            return (this.zze & 8) != 0;
        }

        public final boolean N() {
            return (this.zze & 1) != 0;
        }

        public final boolean O() {
            return (this.zze & 64) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (C.a[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", zzc.class, "zzi", "zzj", "zzk", "zzl", "zzm"});
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

        public final int z() {
            return this.zzh.size();
        }
    }

    public static final class zzc extends zzjk<zzc, zza> implements zzkv {
        private static final zzc zzc;
        private static volatile zzlc<zzc> zzd;
        private int zze;
        private zzf zzf;
        private zzd zzg;
        private boolean zzh;
        private String zzi = "";

        public static final class zza extends zzjk.zzb<zzc, zza> implements zzkv {
            private zza() {
                super(zzc.zzc);
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

        public static void A(zzc zzcVar, String str) {
            zzcVar.getClass();
            zzcVar.zze |= 8;
            zzcVar.zzi = str;
        }

        public static zzc B() {
            return zzc;
        }

        public final zzd C() {
            zzd zzdVar = this.zzg;
            return zzdVar == null ? zzd.B() : zzdVar;
        }

        public final zzf D() {
            zzf zzfVar = this.zzf;
            return zzfVar == null ? zzf.C() : zzfVar;
        }

        public final String E() {
            return this.zzi;
        }

        public final boolean F() {
            return this.zzh;
        }

        public final boolean G() {
            return (this.zze & 4) != 0;
        }

        public final boolean H() {
            return (this.zze & 2) != 0;
        }

        public final boolean I() {
            return (this.zze & 8) != 0;
        }

        public final boolean J() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (C.a[i10 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

    public static final class zzd extends zzjk<zzd, zzb> implements zzkv {
        private static final zzd zzc;
        private static volatile zzlc<zzd> zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private String zzh = "";
        private String zzi = "";
        private String zzj = "";

        public enum zza implements zzjp {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);


            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final int f8582s;

            zza(int i10) {
                this.f8582s = i10;
            }

            public static zza f(int i10) {
                if (i10 == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i10 == 1) {
                    return LESS_THAN;
                }
                if (i10 == 2) {
                    return GREATER_THAN;
                }
                if (i10 == 3) {
                    return EQUAL;
                }
                if (i10 != 4) {
                    return null;
                }
                return BETWEEN;
            }

            @Override // com.google.android.gms.internal.measurement.zzjp
            public final int b() {
                return this.f8582s;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8582s + " name=" + name() + '>';
            }
        }

        public static final class zzb extends zzjk.zzb<zzd, zzb> implements zzkv {
            private zzb() {
                super(zzd.zzc);
            }

            public /* synthetic */ zzb(int i10) {
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

        public static zzd B() {
            return zzc;
        }

        public final String C() {
            return this.zzh;
        }

        public final String D() {
            return this.zzj;
        }

        public final String E() {
            return this.zzi;
        }

        public final boolean F() {
            return this.zzg;
        }

        public final boolean G() {
            return (this.zze & 1) != 0;
        }

        public final boolean H() {
            return (this.zze & 4) != 0;
        }

        public final boolean I() {
            return (this.zze & 2) != 0;
        }

        public final boolean J() {
            return (this.zze & 16) != 0;
        }

        public final boolean K() {
            return (this.zze & 8) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (C.a[i10 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zze", "zzf", D.a, "zzg", "zzh", "zzi", "zzj"});
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

        public final zza z() {
            zza zzaVarF = zza.f(this.zzf);
            return zzaVarF == null ? zza.UNKNOWN_COMPARISON_TYPE : zzaVarF;
        }
    }

    public static final class zze extends zzjk<zze, zza> implements zzkv {
        private static final zze zzc;
        private static volatile zzlc<zze> zzd;
        private int zze;
        private int zzf;
        private String zzg = "";
        private zzc zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

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

        public static void A(zze zzeVar, String str) {
            zzeVar.getClass();
            zzeVar.zze |= 2;
            zzeVar.zzg = str;
        }

        public static zza C() {
            return (zza) zzc.u();
        }

        public final zzc B() {
            zzc zzcVar = this.zzh;
            return zzcVar == null ? zzc.B() : zzcVar;
        }

        public final String E() {
            return this.zzg;
        }

        public final boolean F() {
            return this.zzi;
        }

        public final boolean G() {
            return this.zzj;
        }

        public final boolean H() {
            return this.zzk;
        }

        public final boolean I() {
            return (this.zze & 1) != 0;
        }

        public final boolean J() {
            return (this.zze & 32) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (C.a[i10 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
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

    public static final class zzf extends zzjk<zzf, zzb> implements zzkv {
        private static final zzf zzc;
        private static volatile zzlc<zzf> zzd;
        private int zze;
        private int zzf;
        private boolean zzh;
        private String zzg = "";
        private zzjt<String> zzi = A0.f8327v;

        public enum zza implements zzjp {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);


            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final int f8591s;

            zza(int i10) {
                this.f8591s = i10;
            }

            @Override // com.google.android.gms.internal.measurement.zzjp
            public final int b() {
                return this.f8591s;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8591s + " name=" + name() + '>';
            }
        }

        public static final class zzb extends zzjk.zzb<zzf, zzb> implements zzkv {
            private zzb() {
                super(zzf.zzc);
            }

            public /* synthetic */ zzb(int i10) {
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

        public static zzf C() {
            return zzc;
        }

        public final zza A() {
            zza zzaVar;
            int i10 = this.zzf;
            zza zzaVar2 = zza.UNKNOWN_MATCH_TYPE;
            switch (i10) {
                case 0:
                    zzaVar = zzaVar2;
                    break;
                case 1:
                    zzaVar = zza.REGEXP;
                    break;
                case 2:
                    zzaVar = zza.BEGINS_WITH;
                    break;
                case 3:
                    zzaVar = zza.ENDS_WITH;
                    break;
                case 4:
                    zzaVar = zza.PARTIAL;
                    break;
                case 5:
                    zzaVar = zza.EXACT;
                    break;
                case 6:
                    zzaVar = zza.IN_LIST;
                    break;
                default:
                    zzaVar = null;
                    break;
            }
            return zzaVar == null ? zzaVar2 : zzaVar;
        }

        public final String D() {
            return this.zzg;
        }

        public final List E() {
            return this.zzi;
        }

        public final boolean F() {
            return this.zzh;
        }

        public final boolean G() {
            return (this.zze & 4) != 0;
        }

        public final boolean H() {
            return (this.zze & 2) != 0;
        }

        public final boolean I() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (C.a[i10 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zzb(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zze", "zzf", E.a, "zzg", "zzh", "zzi"});
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
            return this.zzi.size();
        }
    }
}
