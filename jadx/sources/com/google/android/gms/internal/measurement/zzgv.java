package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class zzgv {

    public static class zza {
        public static volatile z3.b a;

        private zza() {
        }
    }

    public static zzgo a(Context context, File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                p212w.i iVar = new p212w.i(0);
                HashMap map = new HashMap();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        Log.w("HermeticFileOverrides", "Parsed " + String.valueOf(file) + " for Android package " + context.getPackageName());
                        zzgo zzgoVar = new zzgo(iVar);
                        bufferedReader.close();
                        return zzgoVar;
                    }
                    String[] strArrSplit = line.split(" ", 3);
                    if (strArrSplit.length == 3) {
                        String str = new String(strArrSplit[0]);
                        String strDecode = Uri.decode(new String(strArrSplit[1]));
                        String strDecode2 = (String) map.get(strArrSplit[2]);
                        if (strDecode2 == null) {
                            String str2 = new String(strArrSplit[2]);
                            strDecode2 = Uri.decode(str2);
                            if (strDecode2.length() < 1024 || strDecode2 == str2) {
                                map.put(str2, strDecode2);
                            }
                        }
                        p212w.i iVar2 = (p212w.i) iVar.get(str);
                        if (iVar2 == null) {
                            iVar2 = new p212w.i(0);
                            iVar.put(str, iVar2);
                        }
                        iVar2.put(strDecode, strDecode2);
                    }
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static z3.b b(Context context) {
        z3.b cVar;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            z3.b cVar2 = z3.a.f16304s;
            try {
                File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                cVar = file.exists() ? new z3.c(file) : cVar2;
            } catch (RuntimeException unused) {
            }
            if (cVar.b()) {
                cVar2 = new z3.c(a(context, (File) cVar.a()));
            }
            return cVar2;
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
