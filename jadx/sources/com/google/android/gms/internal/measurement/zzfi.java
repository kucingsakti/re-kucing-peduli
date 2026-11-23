package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzfi {

    public static final class zza extends zzjk<zza, zzb> implements zzkv {
        private static final zza zzc;
        private static volatile zzlc<zza> zzd;
        private int zze;
        private zzjt<C0004zza> zzf;
        private zzjt<zzc> zzg;
        private zzjt<zzf> zzh;
        private boolean zzi;
        private zzjt<C0004zza> zzj;

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfi$zza$zza, reason: collision with other inner class name */
        public static final class C0004zza extends zzjk<C0004zza, C0005zza> implements zzkv {
            private static final C0004zza zzc;
            private static volatile zzlc<C0004zza> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfi$zza$zza$zza, reason: collision with other inner class name */
            public static final class C0005zza extends zzjk.zzb<C0004zza, C0005zza> implements zzkv {
                private C0005zza() {
                    super(C0004zza.zzc);
                }

                public /* synthetic */ C0005zza(int i10) {
                    this();
                }
            }

            static {
                C0004zza c0004zza = new C0004zza();
                zzc = c0004zza;
                zzjk.s(C0004zza.class, c0004zza);
            }

            private C0004zza() {
            }

            public final zzd A() {
                zzd zzdVar;
                int i10 = this.zzg;
                zzd zzdVar2 = zzd.CONSENT_STATUS_UNSPECIFIED;
                if (i10 == 0) {
                    zzdVar = zzdVar2;
                } else if (i10 != 1) {
                    zzdVar = i10 != 2 ? null : zzd.DENIED;
                } else {
                    zzdVar = zzd.GRANTED;
                }
                return zzdVar == null ? zzdVar2 : zzdVar;
            }

            public final zze B() {
                zze zzeVarF = zze.f(this.zzf);
                return zzeVarF == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarF;
            }

            @Override // com.google.android.gms.internal.measurement.zzjk
            public final Object q(int i10) {
                zzlc zzaVar;
                int i11 = 0;
                switch (F.a[i10 - 1]) {
                    case 1:
                        return new C0004zza();
                    case 2:
                        return new C0005zza(i11);
                    case 3:
                        return new C0(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", H.a, "zzg", G.a});
                    case 4:
                        return zzc;
                    case 5:
                        zzlc<C0004zza> zzlcVar = zzd;
                        if (zzlcVar != null) {
                            return zzlcVar;
                        }
                        synchronized (C0004zza.class) {
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

        public static final class zzb extends zzjk.zzb<zza, zzb> implements zzkv {
            private zzb() {
                super(zza.zzc);
            }

            public /* synthetic */ zzb(int i10) {
                this();
            }
        }

        public static final class zzc extends zzjk<zzc, C0006zza> implements zzkv {
            private static final zzc zzc;
            private static volatile zzlc<zzc> zzd;
            private int zze;
            private int zzf;
            private int zzg;

            /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfi$zza$zzc$zza, reason: collision with other inner class name */
            public static final class C0006zza extends zzjk.zzb<zzc, C0006zza> implements zzkv {
                private C0006zza() {
                    super(zzc.zzc);
                }

                public /* synthetic */ C0006zza(int i10) {
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

            public final zze A() {
                zze zzeVarF = zze.f(this.zzg);
                return zzeVarF == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarF;
            }

            public final zze B() {
                zze zzeVarF = zze.f(this.zzf);
                return zzeVarF == null ? zze.CONSENT_TYPE_UNSPECIFIED : zzeVarF;
            }

            @Override // com.google.android.gms.internal.measurement.zzjk
            public final Object q(int i10) {
                zzlc zzaVar;
                int i11 = 0;
                switch (F.a[i10 - 1]) {
                    case 1:
                        return new zzc();
                    case 2:
                        return new C0006zza(i11);
                    case 3:
                        H h10 = H.a;
                        return new C0(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", h10, "zzg", h10});
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

        public enum zzd implements zzjp {
            CONSENT_STATUS_UNSPECIFIED(0),
            GRANTED(1),
            DENIED(2);


            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final int f8596s;

            zzd(int i10) {
                this.f8596s = i10;
            }

            @Override // com.google.android.gms.internal.measurement.zzjp
            public final int b() {
                return this.f8596s;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zzd.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8596s + " name=" + name() + '>';
            }
        }

        public enum zze implements zzjp {
            CONSENT_TYPE_UNSPECIFIED(0),
            AD_STORAGE(1),
            ANALYTICS_STORAGE(2),
            AD_USER_DATA(3),
            AD_PERSONALIZATION(4);


            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final int f8603s;

            zze(int i10) {
                this.f8603s = i10;
            }

            public static zze f(int i10) {
                if (i10 == 0) {
                    return CONSENT_TYPE_UNSPECIFIED;
                }
                if (i10 == 1) {
                    return AD_STORAGE;
                }
                if (i10 == 2) {
                    return ANALYTICS_STORAGE;
                }
                if (i10 == 3) {
                    return AD_USER_DATA;
                }
                if (i10 != 4) {
                    return null;
                }
                return AD_PERSONALIZATION;
            }

            @Override // com.google.android.gms.internal.measurement.zzjp
            public final int b() {
                return this.f8603s;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zze.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8603s + " name=" + name() + '>';
            }
        }

        public static final class zzf extends zzjk<zzf, C0007zza> implements zzkv {
            private static final zzf zzc;
            private static volatile zzlc<zzf> zzd;
            private int zze;
            private String zzf = "";
            private String zzg = "";

            /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzfi$zza$zzf$zza, reason: collision with other inner class name */
            public static final class C0007zza extends zzjk.zzb<zzf, C0007zza> implements zzkv {
                private C0007zza() {
                    super(zzf.zzc);
                }

                public /* synthetic */ C0007zza(int i10) {
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

            public final String A() {
                return this.zzf;
            }

            @Override // com.google.android.gms.internal.measurement.zzjk
            public final Object q(int i10) {
                zzlc zzaVar;
                int i11 = 0;
                switch (F.a[i10 - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C0007zza(i11);
                    case 3:
                        return new C0(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
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
        }

        static {
            zza zzaVar = new zza();
            zzc = zzaVar;
            zzjk.s(zza.class, zzaVar);
        }

        private zza() {
            A0 a10 = A0.f8327v;
            this.zzf = a10;
            this.zzg = a10;
            this.zzh = a10;
            this.zzj = a10;
        }

        public static zza A() {
            return zzc;
        }

        public final zzjt B() {
            return this.zzh;
        }

        public final List C() {
            return this.zzf;
        }

        public final List D() {
            return this.zzg;
        }

        public final List E() {
            return this.zzj;
        }

        public final boolean F() {
            return this.zzi;
        }

        public final boolean G() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (F.a[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new zzb(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zze", "zzf", C0004zza.class, "zzg", zzc.class, "zzh", zzf.class, "zzi", "zzj", C0004zza.class});
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
    }

    public static final class zzb extends zzjk<zzb, zza> implements zzkv {
        private static final zzb zzc;
        private static volatile zzlc<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzjt<zzf> zzg = A0.f8327v;
        private boolean zzh;

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

        public final String A() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (F.a[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zze", "zzf", "zzg", zzf.class, "zzh"});
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
        private String zzf = "";
        private boolean zzg;
        private boolean zzh;
        private int zzi;

        public static final class zza extends zzjk.zzb<zzc, zza> implements zzkv {
            private zza() {
                super(zzc.zzc);
            }

            public final String r() {
                return ((zzc) this.f8681t).C();
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
            str.getClass();
            zzcVar.zze |= 1;
            zzcVar.zzf = str;
        }

        public final String C() {
            return this.zzf;
        }

        public final boolean D() {
            return this.zzg;
        }

        public final boolean E() {
            return this.zzh;
        }

        public final boolean F() {
            return (this.zze & 2) != 0;
        }

        public final boolean G() {
            return (this.zze & 4) != 0;
        }

        public final boolean H() {
            return (this.zze & 8) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (F.a[i10 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        public final int z() {
            return this.zzi;
        }
    }

    public static final class zzd extends zzjk<zzd, zza> implements zzkv {
        private static final zzd zzc;
        private static volatile zzlc<zzd> zzd;
        private int zze;
        private long zzf;
        private String zzg = "";
        private int zzh;
        private zzjt<zzg> zzi;
        private zzjt<zzc> zzj;
        private zzjt<zzff.zza> zzk;
        private String zzl;
        private boolean zzm;
        private zzjt<zzft.zzc> zzn;
        private zzjt<zzb> zzo;
        private String zzp;
        private String zzq;
        private zza zzr;
        private zze zzs;
        private zzh zzt;
        private zzf zzu;

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
            A0 a10 = A0.f8327v;
            this.zzi = a10;
            this.zzj = a10;
            this.zzk = a10;
            this.zzl = "";
            this.zzn = a10;
            this.zzo = a10;
            this.zzp = "";
            this.zzq = "";
        }

        public static void B(zzd zzdVar) {
            zzdVar.getClass();
            zzdVar.zzk = A0.f8327v;
        }

        public static void C(zzd zzdVar, int i10, zzc zzcVar) {
            zzdVar.getClass();
            zzjt<zzc> zzjtVar = zzdVar.zzj;
            if (!zzjtVar.c()) {
                zzdVar.zzj = zzjk.p(zzjtVar);
            }
            zzdVar.zzj.set(i10, zzcVar);
        }

        public static zza G() {
            return (zza) zzc.u();
        }

        public static zzd I() {
            return zzc;
        }

        public final zzc A(int i10) {
            return this.zzj.get(i10);
        }

        public final int D() {
            return this.zzj.size();
        }

        public final long E() {
            return this.zzf;
        }

        public final zza F() {
            zza zzaVar = this.zzr;
            return zzaVar == null ? zza.A() : zzaVar;
        }

        public final zzh J() {
            zzh zzhVar = this.zzt;
            return zzhVar == null ? zzh.B() : zzhVar;
        }

        public final String K() {
            return this.zzg;
        }

        public final String L() {
            return this.zzp;
        }

        public final List M() {
            return this.zzk;
        }

        public final zzjt N() {
            return this.zzo;
        }

        public final zzjt O() {
            return this.zzn;
        }

        public final zzjt P() {
            return this.zzi;
        }

        public final boolean Q() {
            return this.zzm;
        }

        public final boolean R() {
            return (this.zze & 128) != 0;
        }

        public final boolean S() {
            return (this.zze & 2) != 0;
        }

        public final boolean T() {
            return (this.zze & 512) != 0;
        }

        public final boolean U() {
            return (this.zze & 1) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (F.a[i10 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0010\u0000\u0001\u0001\u0012\u0010\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzg.class, "zzj", zzc.class, "zzk", zzff.zza.class, "zzl", "zzm", "zzn", zzft.zzc.class, "zzo", zzb.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
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
            return this.zzn.size();
        }
    }

    public static final class zze extends zzjk<zze, zza> implements zzkv {
        private static final zze zzc;
        private static volatile zzlc<zze> zzd;
        private int zze;
        private int zzf = 14;
        private int zzg = 11;
        private int zzh = 60;

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

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (F.a[i10 - 1]) {
                case 1:
                    return new zze();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
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
    }

    public static final class zzf extends zzjk<zzf, zza> implements zzkv {
        private static final zzf zzc;
        private static volatile zzlc<zzf> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

        public static final class zza extends zzjk.zzb<zzf, zza> implements zzkv {
            private zza() {
                super(zzf.zzc);
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

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (F.a[i10 - 1]) {
                case 1:
                    return new zzf();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
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
    }

    public static final class zzg extends zzjk<zzg, zza> implements zzkv {
        private static final zzg zzc;
        private static volatile zzlc<zzg> zzd;
        private int zze;
        private String zzf = "";
        private String zzg = "";

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

        public final String A() {
            return this.zzf;
        }

        public final String B() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (F.a[i10 - 1]) {
                case 1:
                    return new zzg();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
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
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";
        private int zzi;

        public static final class zza extends zzjk.zzb<zzh, zza> implements zzkv {
            private zza() {
                super(zzh.zzc);
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

        public static zzh B() {
            return zzc;
        }

        public final String C() {
            return this.zzg;
        }

        public final String D() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (F.a[i10 - 1]) {
                case 1:
                    return new zzh();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        public final int z() {
            return this.zzi;
        }
    }
}
