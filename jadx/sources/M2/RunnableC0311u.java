package M2;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.C0588p;
import com.google.android.gms.internal.measurement.zzcq;
import com.google.android.gms.measurement.internal.zzfw;
import com.google.android.gms.measurement.internal.zzfz;
import com.google.android.gms.measurement.internal.zzhc;
import com.google.android.gms.measurement.internal.zzhj;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: M2.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0311u implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final URL f3115s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final byte[] f3116t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC0310t f3117u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f3118v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Map f3119w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zzfz f3120x;

    public RunnableC0311u(zzfz zzfzVar, String str, URL url, byte[] bArr, Map map, InterfaceC0310t interfaceC0310t) {
        this.f3120x = zzfzVar;
        Preconditions.e(str);
        this.f3115s = url;
        this.f3116t = bArr;
        this.f3117u = interfaceC0310t;
        this.f3118v = str;
        this.f3119w = map;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x011f  */
    /* JADX WARN: Code duplicated, block: B:72:0x014b  */
    /* JADX WARN: Code duplicated, block: B:77:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0137 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v6 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        HttpURLConnection httpURLConnection;
        OutputStream outputStream;
        IOException iOException;
        Map<String, List<String>> map;
        OutputStream outputStream2;
        int responseCode;
        ?? r16;
        int i10;
        C0588p c0588p;
        String str = this.f3118v;
        zzfz zzfzVar = this.f3120x;
        zzhc zzhcVar = ((zzhj) zzfzVar.f577s).f9116B;
        zzhj.g(zzhcVar);
        zzhcVar.i1();
        OutputStream outputStream3 = null;
        try {
            URL url = this.f3115s;
            C0588p c0588p2 = zzcq.a;
            synchronized (zzcq.class) {
                c0588p = zzcq.a;
            }
            c0588p.getClass();
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                throw new IOException("Failed to obtain HTTP connection");
            }
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout(60000);
            httpURLConnection.setReadTimeout(61000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setDoInput(true);
            try {
                Map map2 = this.f3119w;
                if (map2 != null) {
                    for (Map.Entry entry : map2.entrySet()) {
                        httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                byte[] bArr = this.f3116t;
                if (bArr != null) {
                    byte[] bArrI1 = zzfzVar.X0().I1(bArr);
                    zzfzVar.i().f9052F.a(Integer.valueOf(bArrI1.length), "Uploading data. size");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
                    httpURLConnection.setFixedLengthStreamingMode(bArrI1.length);
                    httpURLConnection.connect();
                    outputStream = httpURLConnection.getOutputStream();
                    try {
                        outputStream.write(bArrI1);
                        outputStream.close();
                    } catch (IOException e10) {
                        iOException = e10;
                        map = null;
                        responseCode = 0;
                        outputStream3 = outputStream;
                        if (outputStream3 != null) {
                            try {
                                outputStream3.close();
                            } catch (IOException e11) {
                                zzfzVar.i().f9056x.c("Error closing HTTP compressed POST connection output stream. appId", zzfw.a1(str), e11);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzfzVar.l().f1(new RunnableC0308q(this.f3118v, this.f3117u, responseCode, iOException, (byte[]) null, map));
                    } catch (Throwable th) {
                        th = th;
                        outputStream2 = null;
                        i10 = 0;
                        r16 = outputStream2;
                        Throwable th2 = th;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (IOException e12) {
                                zzfzVar.i().f9056x.c("Error closing HTTP compressed POST connection output stream. appId", zzfw.a1(str), e12);
                            }
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzfzVar.l().f1(new RunnableC0308q(this.f3118v, this.f3117u, i10, (IOException) null, (byte[]) null, (Map) r16));
                        throw th2;
                    }
                }
                responseCode = httpURLConnection.getResponseCode();
                try {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    try {
                        byte[] bArrD1 = zzfz.d1(httpURLConnection);
                        httpURLConnection.disconnect();
                        zzfzVar.l().f1(new RunnableC0308q(this.f3118v, this.f3117u, responseCode, (IOException) null, bArrD1, headerFields));
                    } catch (IOException e13) {
                        e = e13;
                        map = headerFields;
                        iOException = e;
                        if (outputStream3 != null) {
                            outputStream3.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzfzVar.l().f1(new RunnableC0308q(this.f3118v, this.f3117u, responseCode, iOException, (byte[]) null, map));
                    } catch (Throwable th3) {
                        th = th3;
                        outputStream = null;
                        i10 = responseCode;
                        r16 = headerFields;
                        Throwable th4 = th;
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        zzfzVar.l().f1(new RunnableC0308q(this.f3118v, this.f3117u, i10, (IOException) null, (byte[]) null, (Map) r16));
                        throw th4;
                    }
                } catch (IOException e14) {
                    e = e14;
                    map = null;
                } catch (Throwable th5) {
                    th = th5;
                    outputStream = null;
                    r16 = 0;
                    i10 = responseCode;
                }
            } catch (IOException e15) {
                iOException = e15;
                map = null;
                responseCode = 0;
                if (outputStream3 != null) {
                    outputStream3.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzfzVar.l().f1(new RunnableC0308q(this.f3118v, this.f3117u, responseCode, iOException, (byte[]) null, map));
            } catch (Throwable th6) {
                th = th6;
                outputStream = null;
                outputStream2 = outputStream;
                i10 = 0;
                r16 = outputStream2;
                Throwable th7 = th;
                if (outputStream != null) {
                    outputStream.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                zzfzVar.l().f1(new RunnableC0308q(this.f3118v, this.f3117u, i10, (IOException) null, (byte[]) null, (Map) r16));
                throw th7;
            }
        } catch (IOException e16) {
            iOException = e16;
            httpURLConnection = null;
            map = null;
        } catch (Throwable th8) {
            th = th8;
            httpURLConnection = null;
            outputStream = null;
        }
    }
}
