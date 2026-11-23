package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzft {

    public static final class zza extends zzjk<zza, C0009zza> implements zzkv {
        private static final zza zzc;
        private static volatile zzlc<zza> zzd;
        private zzjt<zzb> zze = A0.f8327v;

        /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.zzft$zza$zza, reason: collision with other inner class name */
        public static final class C0009zza extends zzjk.zzb<zza, C0009zza> implements zzkv {
            private C0009zza() {
                super(zza.zzc);
            }

            public /* synthetic */ C0009zza(int i10) {
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

        public static zza B() {
            return zzc;
        }

        public final List C() {
            return this.zze;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (M.a[i10 - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C0009zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzb.class});
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
            return this.zze.size();
        }
    }

    public static final class zzb extends zzjk<zzb, zza> implements zzkv {
        private static final zzb zzc;
        private static volatile zzlc<zzb> zzd;
        private int zze;
        private String zzf = "";
        private zzjt<zzd> zzg = A0.f8327v;

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

        public final zzjt B() {
            return this.zzg;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (M.a[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzd.class});
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
        private zzjt<zzd> zzf = A0.f8327v;
        private zza zzg;

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

        public final zzjt B() {
            return this.zzf;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (M.a[i10 - 1]) {
                case 1:
                    return new zzc();
                case 2:
                    return new zza(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zze", "zzf", zzd.class, "zzg"});
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

        public final zza z() {
            zza zzaVar = this.zzg;
            return zzaVar == null ? zza.B() : zzaVar;
        }
    }

    public static final class zzd extends zzjk<zzd, zzb> implements zzkv {
        private static final zzd zzc;
        private static volatile zzlc<zzd> zzd;
        private int zze;
        private int zzf;
        private zzjt<zzd> zzg = A0.f8327v;
        private String zzh = "";
        private String zzi = "";
        private boolean zzj;
        private double zzk;

        public enum zza implements zzjp {
            UNKNOWN(0),
            STRING(1),
            NUMBER(2),
            BOOLEAN(3),
            STATEMENT(4);


            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final int f8627s;

            zza(int i10) {
                this.f8627s = i10;
            }

            public static zza f(int i10) {
                if (i10 == 0) {
                    return UNKNOWN;
                }
                if (i10 == 1) {
                    return STRING;
                }
                if (i10 == 2) {
                    return NUMBER;
                }
                if (i10 == 3) {
                    return BOOLEAN;
                }
                if (i10 != 4) {
                    return null;
                }
                return STATEMENT;
            }

            @Override // com.google.android.gms.internal.measurement.zzjp
            public final int b() {
                return this.f8627s;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + zza.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.f8627s + " name=" + name() + '>';
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

        public final zza A() {
            zza zzaVarF = zza.f(this.zzf);
            return zzaVarF == null ? zza.UNKNOWN : zzaVarF;
        }

        public final String C() {
            return this.zzh;
        }

        public final String D() {
            return this.zzi;
        }

        public final List E() {
            return this.zzg;
        }

        public final boolean F() {
            return this.zzj;
        }

        public final boolean G() {
            return (this.zze & 8) != 0;
        }

        public final boolean H() {
            return (this.zze & 16) != 0;
        }

        public final boolean I() {
            return (this.zze & 4) != 0;
        }

        @Override // com.google.android.gms.internal.measurement.zzjk
        public final Object q(int i10) {
            zzlc zzaVar;
            int i11 = 0;
            switch (M.a[i10 - 1]) {
                case 1:
                    return new zzd();
                case 2:
                    return new zzb(i11);
                case 3:
                    return new C0(zzc, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zze", "zzf", N.a, "zzg", zzd.class, "zzh", "zzi", "zzj", "zzk"});
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

        public final double z() {
            return this.zzk;
        }
    }
}
