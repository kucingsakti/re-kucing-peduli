package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.RestrictedInheritance;
import p205v2.b;
import p205v2.c;
import p205v2.d;
import p205v2.e;
import p205v2.f;
import p205v2.h;

/* JADX INFO: loaded from: classes.dex */
@ShowFirstParty
@KeepForSdk
@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class GoogleSignatureVerifier {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static GoogleSignatureVerifier f7838c;
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f7839b;

    public GoogleSignatureVerifier(Context context) {
        this.a = context.getApplicationContext();
    }

    public static GoogleSignatureVerifier a(Context context) {
        Preconditions.i(context);
        synchronized (GoogleSignatureVerifier.class) {
            try {
                if (f7838c == null) {
                    f.a(context);
                    f7838c = new GoogleSignatureVerifier(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f7838c;
    }

    public static final c c(PackageInfo packageInfo, c... cVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            d dVar = new d(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < cVarArr.length; i10++) {
                if (cVarArr[i10].equals(dVar)) {
                    return cVarArr[i10];
                }
            }
        }
        return null;
    }

    public static final boolean d(PackageInfo packageInfo, boolean z6) {
        PackageInfo packageInfo2;
        if (!z6) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z6 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z6 ? c(packageInfo2, e.a) : c(packageInfo2, e.a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x013a  */
    public final boolean b(int i10) {
        h hVar;
        int length;
        boolean zH;
        ApplicationInfo applicationInfo;
        h hVar2;
        String[] packagesForUid = this.a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            hVar = new h("no pkgs", false, null);
        } else {
            hVar = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    Preconditions.i(hVar);
                    break;
                }
                String str = packagesForUid[i11];
                if (str == null) {
                    hVar = new h("null pkg", false, null);
                } else if (str.equals(this.f7839b)) {
                    hVar = h.f15421c;
                } else {
                    b bVar = f.a;
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        f.c();
                        zH = f.f15417e.h();
                    } catch (RemoteException | DynamiteModule.LoadingException unused) {
                        zH = false;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    if (zH) {
                        boolean zA = GooglePlayServicesUtilLight.a(this.a);
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                        try {
                            Preconditions.i(f.f15419g);
                            try {
                                f.c();
                                try {
                                    zzq zzqVarA0 = f.f15417e.a0(new zzo(str, zA, false, new ObjectWrapper(f.f15419g), false, true));
                                    if (zzqVarA0.f8280s) {
                                        zzd.a(zzqVarA0.f8283v);
                                        hVar = new h(null, true, null);
                                    } else {
                                        String str2 = zzqVarA0.f8281t;
                                        PackageManager.NameNotFoundException nameNotFoundException = C3.b.P(zzqVarA0.f8282u) == 4 ? new PackageManager.NameNotFoundException() : null;
                                        if (str2 == null) {
                                            str2 = "error checking package certificate";
                                        }
                                        zzd.a(zzqVarA0.f8283v);
                                        C3.b.P(zzqVarA0.f8282u);
                                        hVar = new h(str2, false, nameNotFoundException);
                                    }
                                } catch (RemoteException e10) {
                                    hVar2 = new h("module call", false, e10);
                                    hVar = hVar2;
                                }
                            } catch (DynamiteModule.LoadingException e11) {
                                hVar2 = new h("module init: ".concat(String.valueOf(e11.getMessage())), false, e11);
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads2);
                            throw th2;
                        }
                    } else {
                        try {
                            PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(str, 64);
                            boolean zA2 = GooglePlayServicesUtilLight.a(this.a);
                            if (packageInfo == null) {
                                hVar = new h("null pkg", false, null);
                            } else {
                                Signature[] signatureArr = packageInfo.signatures;
                                if (signatureArr == null || signatureArr.length != 1) {
                                    hVar = new h("single cert required", false, null);
                                } else {
                                    d dVar = new d(packageInfo.signatures[0].toByteArray());
                                    String str3 = packageInfo.packageName;
                                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                    try {
                                        h hVarB = f.b(str3, dVar, zA2, false);
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                        if (!hVarB.a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0) {
                                            hVar = hVarB;
                                        } else {
                                            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads4 = StrictMode.allowThreadDiskReads();
                                            try {
                                                h hVarB2 = f.b(str3, dVar, false, true);
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                if (hVarB2.a) {
                                                    hVar = new h("debuggable release cert app rejected", false, null);
                                                } else {
                                                    hVar = hVarB;
                                                }
                                            } catch (Throwable th3) {
                                                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads4);
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads3);
                                        throw th4;
                                    }
                                }
                            }
                        } catch (PackageManager.NameNotFoundException e12) {
                            hVar = new h("no pkg ".concat(str), false, e12);
                        }
                    }
                    if (hVar.a) {
                        this.f7839b = str;
                    }
                }
                if (hVar.a) {
                    break;
                }
                i11++;
            }
        }
        if (!hVar.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (hVar.f15422b != null) {
                hVar.a();
            } else {
                hVar.a();
            }
        }
        return hVar.a;
    }
}
