package com.google.android.gms.common;

import J2.a;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.internal.common.zzag;
import com.google.android.gms.internal.common.zzah;
import com.google.errorprone.annotations.RestrictedInheritance;
import java.util.HashMap;
import p205v2.b;
import p205v2.f;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*javatests/com/google/android/gmscore/integ/client/common/robolectric/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GmsSignatureVerifier {
    static {
        a aVar = zzag.f8321t;
        com.google.android.gms.internal.common.a aVar2 = com.google.android.gms.internal.common.a.f8315w;
        b bVar = f.f15416d;
        Object[] objArr = {bVar.i0(), f.f15414b.i0()};
        zzah.a(2, objArr);
        zzag zzagVarQ = zzag.q(new com.google.android.gms.internal.common.a(2, objArr));
        b bVar2 = f.f15415c;
        Object[] objArr2 = {bVar2.i0(), f.a.i0()};
        zzah.a(2, objArr2);
        zzag zzagVarQ2 = zzag.q(new com.google.android.gms.internal.common.a(2, objArr2));
        if (zzagVarQ.isEmpty() && zzagVarQ2.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        Object[] objArr3 = {bVar.i0()};
        zzah.a(1, objArr3);
        zzag zzagVarQ3 = zzag.q(new com.google.android.gms.internal.common.a(1, objArr3));
        Object[] objArr4 = {bVar2.i0()};
        zzah.a(1, objArr4);
        zzag zzagVarQ4 = zzag.q(new com.google.android.gms.internal.common.a(1, objArr4));
        if (zzagVarQ3.isEmpty() && zzagVarQ4.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        new HashMap();
    }
}
