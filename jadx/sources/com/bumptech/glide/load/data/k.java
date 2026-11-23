package com.bumptech.glide.load.data;

import E1.C0185g;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C0185g f7658s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f7659t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public HttpURLConnection f7660u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public InputStream f7661v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f7662w;

    public k(C0185g c0185g, int i10) {
        this.f7658s = c0185g;
        this.f7659t = i10;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        InputStream inputStream = this.f7661v;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f7660u;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f7660u = null;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        return 2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f7662w = true;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.g gVar, d dVar) {
        C0185g c0185g = this.f7658s;
        int i10 = U1.h.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            dVar.g(e(c0185g.d(), 0, null, c0185g.f1308b.b()));
        } catch (IOException e10) {
            Log.isLoggable("HttpUrlFetcher", 3);
            dVar.f(e10);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }

    public final InputStream e(URL url, int i10, URL url2, Map map) throws HttpException {
        int responseCode;
        int responseCode2 = -1;
        if (i10 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1, null);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1, null);
                }
            } catch (URISyntaxException unused) {
            }
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            int i11 = this.f7659t;
            httpURLConnection.setConnectTimeout(i11);
            httpURLConnection.setReadTimeout(i11);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setInstanceFollowRedirects(false);
            this.f7660u = httpURLConnection;
            try {
                httpURLConnection.connect();
                this.f7661v = this.f7660u.getInputStream();
                if (this.f7662w) {
                    return null;
                }
                try {
                    responseCode = this.f7660u.getResponseCode();
                } catch (IOException unused2) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                    responseCode = -1;
                }
                int i12 = responseCode / 100;
                if (i12 == 2) {
                    HttpURLConnection httpURLConnection2 = this.f7660u;
                    try {
                        if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                            this.f7661v = new U1.d(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                        } else {
                            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                                httpURLConnection2.getContentEncoding();
                            }
                            this.f7661v = httpURLConnection2.getInputStream();
                        }
                        return this.f7661v;
                    } catch (IOException e10) {
                        try {
                            responseCode2 = httpURLConnection2.getResponseCode();
                        } catch (IOException unused3) {
                            Log.isLoggable("HttpUrlFetcher", 3);
                        }
                        throw new HttpException("Failed to obtain InputStream", responseCode2, e10);
                    }
                }
                if (i12 != 3) {
                    if (responseCode == -1) {
                        throw new HttpException("Http request failed", responseCode, null);
                    }
                    try {
                        throw new HttpException(this.f7660u.getResponseMessage(), responseCode, null);
                    } catch (IOException e11) {
                        throw new HttpException("Failed to get a response message", responseCode, e11);
                    }
                }
                String headerField = this.f7660u.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new HttpException("Received empty or null redirect url", responseCode, null);
                }
                try {
                    URL url3 = new URL(url, headerField);
                    b();
                    return e(url3, i10 + 1, url, map);
                } catch (MalformedURLException e12) {
                    throw new HttpException(E0.a.h("Bad redirect url: ", headerField), responseCode, e12);
                }
            } catch (IOException e13) {
                try {
                    responseCode2 = this.f7660u.getResponseCode();
                } catch (IOException unused4) {
                    Log.isLoggable("HttpUrlFetcher", 3);
                }
                throw new HttpException("Failed to connect or obtain data", responseCode2, e13);
            }
        } catch (IOException e14) {
            throw new HttpException("URL.openConnection threw", 0, e14);
        }
    }
}
