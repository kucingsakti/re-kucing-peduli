package com.google.android.gms.measurement.internal;

import B4.I;
import M2.E;
import M2.F;
import M2.G;
import M2.J;
import M2.K;
import M2.s0;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.UidVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class zzhn extends zzfo {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zznc f9150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f9151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f9152d;

    public zzhn(zznc zzncVar) {
        Preconditions.i(zzncVar);
        this.f9150b = zzncVar;
        this.f9152d = null;
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void A(zzno zznoVar, zzo zzoVar) {
        Preconditions.i(zznoVar);
        j0(zzoVar);
        k0(new I(this, zznoVar, zzoVar, 4));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final byte[] C(zzbd zzbdVar, String str) {
        Preconditions.e(str);
        Preconditions.i(zzbdVar);
        i0(str, true);
        zznc zzncVar = this.f9150b;
        zzfw zzfwVarI = zzncVar.i();
        zzhj zzhjVar = zzncVar.f9283D;
        zzfr zzfrVar = zzhjVar.f9119E;
        String str2 = zzbdVar.f8923s;
        zzfwVarI.f9051E.a(zzfrVar.c(str2), "Log and bundle. event");
        ((DefaultClock) zzncVar.a()).getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) zzncVar.l().e1(new J(this, zzbdVar, str)).get();
            if (bArr == null) {
                zzncVar.i().f9056x.a(zzfw.a1(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ((DefaultClock) zzncVar.a()).getClass();
            zzncVar.i().f9051E.d("Log and bundle processed. event, size, time_ms", zzhjVar.f9119E.c(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e10) {
            e = e10;
            zzfw zzfwVarI2 = zzncVar.i();
            zzfwVarI2.f9056x.d("Failed to log and bundle. appId, event, error", zzfw.a1(str), zzhjVar.f9119E.c(str2), e);
            return null;
        } catch (ExecutionException e11) {
            e = e11;
            zzfw zzfwVarI3 = zzncVar.i();
            zzfwVarI3.f9056x.d("Failed to log and bundle. appId, event, error", zzfw.a1(str), zzhjVar.f9119E.c(str2), e);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final zzaj G(zzo zzoVar) {
        j0(zzoVar);
        String str = zzoVar.f9350s;
        Preconditions.e(str);
        zznc zzncVar = this.f9150b;
        try {
            return (zzaj) zzncVar.l().e1(new M2.I(this, 0, zzoVar)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzfw zzfwVarI = zzncVar.i();
            zzfwVarI.f9056x.c("Failed to get consent. appId", zzfw.a1(str), e10);
            return new zzaj(null);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List H(String str, String str2, String str3, boolean z6) {
        i0(str, true);
        zznc zzncVar = this.f9150b;
        try {
            List<s0> list = (List) zzncVar.l().a1(new G(this, str, str2, str3, 2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (s0 s0Var : list) {
                if (z6 || !zznp.c2(s0Var.f3112c)) {
                    arrayList.add(new zzno(s0Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            Object obj = e;
            zzfw zzfwVarI = zzncVar.i();
            zzfwVarI.f9056x.c("Failed to get user properties as. appId", zzfw.a1(str), obj);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            Object obj2 = e;
            zzfw zzfwVarI2 = zzncVar.i();
            zzfwVarI2.f9056x.c("Failed to get user properties as. appId", zzfw.a1(str), obj2);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void I(zzo zzoVar) {
        Preconditions.e(zzoVar.f9350s);
        Preconditions.i(zzoVar.f9340N);
        h0(new E(this, zzoVar, 3));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void J(zzo zzoVar) {
        Preconditions.e(zzoVar.f9350s);
        Preconditions.i(zzoVar.f9340N);
        zzhp zzhpVar = new zzhp();
        zzhpVar.f9156s = this;
        zzhpVar.f9157t = zzoVar;
        h0(zzhpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List O(String str, String str2, boolean z6, zzo zzoVar) {
        j0(zzoVar);
        String str3 = zzoVar.f9350s;
        Preconditions.i(str3);
        zznc zzncVar = this.f9150b;
        try {
            List<s0> list = (List) zzncVar.l().a1(new G(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (s0 s0Var : list) {
                if (z6 || !zznp.c2(s0Var.f3112c)) {
                    arrayList.add(new zzno(s0Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e10) {
            e = e10;
            Object obj = e;
            zzfw zzfwVarI = zzncVar.i();
            zzfwVarI.f9056x.c("Failed to query user properties. appId", zzfw.a1(str3), obj);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e11) {
            e = e11;
            Object obj2 = e;
            zzfw zzfwVarI2 = zzncVar.i();
            zzfwVarI2.f9056x.c("Failed to query user properties. appId", zzfw.a1(str3), obj2);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void P(zzbd zzbdVar, zzo zzoVar) {
        Preconditions.i(zzbdVar);
        j0(zzoVar);
        k0(new I(this, zzbdVar, zzoVar, 3));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final String T(zzo zzoVar) {
        j0(zzoVar);
        zznc zzncVar = this.f9150b;
        try {
            return (String) zzncVar.l().a1(new M2.I(zzncVar, 2, zzoVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e10) {
            zzfw zzfwVarI = zzncVar.i();
            zzfwVarI.f9056x.c("Failed to get app instance id. appId", zzfw.a1(zzoVar.f9350s), e10);
            return null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void W(zzo zzoVar) {
        j0(zzoVar);
        k0(new E(this, zzoVar, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void X(zzae zzaeVar, zzo zzoVar) {
        Preconditions.i(zzaeVar);
        Preconditions.i(zzaeVar.f8888u);
        j0(zzoVar);
        zzae zzaeVar2 = new zzae(zzaeVar);
        zzaeVar2.f8886s = zzoVar.f9350s;
        k0(new I(this, zzaeVar2, zzoVar, 1));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void Z(long j, String str, String str2, String str3) {
        k0(new F(this, str2, str3, str, j, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void b0(zzo zzoVar) {
        j0(zzoVar);
        k0(new E(this, zzoVar, 0));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List c0(String str, String str2, String str3) {
        i0(str, true);
        zznc zzncVar = this.f9150b;
        try {
            return (List) zzncVar.l().a1(new G(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e10) {
            zzncVar.i().f9056x.a(e10, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void d0(zzo zzoVar) {
        Preconditions.e(zzoVar.f9350s);
        Preconditions.i(zzoVar.f9340N);
        zzhm zzhmVar = new zzhm();
        zzhmVar.f9148s = this;
        zzhmVar.f9149t = zzoVar;
        h0(zzhmVar);
    }

    public final void h0(Runnable runnable) {
        zznc zzncVar = this.f9150b;
        if (zzncVar.l().h1()) {
            runnable.run();
        } else {
            zzncVar.l().g1(runnable);
        }
    }

    public final void i0(String str, boolean z6) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zznc zzncVar = this.f9150b;
        if (zIsEmpty) {
            zzncVar.i().f9056x.b("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z6) {
            try {
                if (this.f9151c == null) {
                    this.f9151c = Boolean.valueOf("com.google.android.gms".equals(this.f9152d) || UidVerifier.a(zzncVar.f9283D.f9140s, Binder.getCallingUid()) || GoogleSignatureVerifier.a(zzncVar.f9283D.f9140s).b(Binder.getCallingUid()));
                }
                if (this.f9151c.booleanValue()) {
                    return;
                }
            } catch (SecurityException e10) {
                zzncVar.i().f9056x.a(zzfw.a1(str), "Measurement Service called with invalid calling package. appId");
                throw e10;
            }
        }
        if (this.f9152d == null) {
            Context context = zzncVar.f9283D.f9140s;
            int callingUid = Binder.getCallingUid();
            AtomicBoolean atomicBoolean = GooglePlayServicesUtilLight.a;
            if (UidVerifier.b(callingUid, context, str)) {
                this.f9152d = str;
            }
        }
        if (str.equals(this.f9152d)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void j0(zzo zzoVar) {
        Preconditions.i(zzoVar);
        String str = zzoVar.f9350s;
        Preconditions.e(str);
        i0(str, false);
        this.f9150b.a0().H1(zzoVar.f9351t, zzoVar.f9335I);
    }

    public final void k0(Runnable runnable) {
        zznc zzncVar = this.f9150b;
        if (zzncVar.l().h1()) {
            runnable.run();
        } else {
            zzncVar.l().f1(runnable);
        }
    }

    public final void l0(zzbd zzbdVar, zzo zzoVar) {
        zznc zzncVar = this.f9150b;
        zzncVar.b0();
        zzncVar.u(zzbdVar, zzoVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List o(Bundle bundle, zzo zzoVar) {
        j0(zzoVar);
        String str = zzoVar.f9350s;
        Preconditions.i(str);
        zznc zzncVar = this.f9150b;
        try {
            return (List) zzncVar.l().a1(new K(this, zzoVar, bundle)).get();
        } catch (InterruptedException | ExecutionException e10) {
            zzfw zzfwVarI = zzncVar.i();
            zzfwVarI.f9056x.c("Failed to get trigger URIs. appId", zzfw.a1(str), e10);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final List v(String str, String str2, zzo zzoVar) {
        j0(zzoVar);
        String str3 = zzoVar.f9350s;
        Preconditions.i(str3);
        zznc zzncVar = this.f9150b;
        try {
            return (List) zzncVar.l().a1(new G(this, str3, str, str2, 1)).get();
        } catch (InterruptedException | ExecutionException e10) {
            zzncVar.i().f9056x.a(e10, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    public final void y(zzo zzoVar) {
        Preconditions.e(zzoVar.f9350s);
        i0(zzoVar.f9350s, false);
        k0(new E(this, zzoVar, 2));
    }

    @Override // com.google.android.gms.measurement.internal.zzfl
    /* JADX INFO: renamed from: o */
    public final void mo5o(Bundle bundle, zzo zzoVar) {
        j0(zzoVar);
        String str = zzoVar.f9350s;
        Preconditions.i(str);
        zzho zzhoVar = new zzho();
        zzhoVar.f9153s = this;
        zzhoVar.f9154t = str;
        zzhoVar.f9155u = bundle;
        k0(zzhoVar);
    }
}
