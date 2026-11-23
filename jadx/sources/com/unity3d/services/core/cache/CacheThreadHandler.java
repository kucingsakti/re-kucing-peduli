package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.IWebRequestProgressListener;
import com.unity3d.services.core.request.NetworkIOException;
import com.unity3d.services.core.request.WebRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class CacheThreadHandler extends Handler {
    private WebRequest _currentRequest = null;
    private boolean _canceled = false;
    private boolean _active = false;

    /* JADX WARN: Code duplicated, block: B:131:0x031a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10, types: [com.unity3d.services.core.request.WebRequest] */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v36 */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r15v39 */
    /* JADX WARN: Type inference failed for: r15v40 */
    /* JADX WARN: Type inference failed for: r15v41 */
    /* JADX WARN: Type inference failed for: r15v42 */
    /* JADX WARN: Type inference failed for: r15v43 */
    /* JADX WARN: Type inference failed for: r15v44 */
    /* JADX WARN: Type inference failed for: r15v45 */
    /* JADX WARN: Type inference failed for: r15v46 */
    /* JADX WARN: Type inference failed for: r15v47 */
    /* JADX WARN: Type inference failed for: r15v48 */
    /* JADX WARN: Type inference failed for: r15v49 */
    /* JADX WARN: Type inference failed for: r15v50 */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v9 */
    private void downloadFile(String str, String str2, int i10, int i11, final int i12, HashMap<String, List<String>> map, boolean z6, final CacheEventSender cacheEventSender) throws Throwable {
        char c10;
        String str3;
        char c11;
        char c12;
        char c13;
        WebRequest webRequest;
        char c14;
        char c15;
        WebRequest webRequest2;
        char c16;
        char c17;
        WebRequest webRequest3;
        char c18;
        char c19;
        WebRequest webRequest4;
        char c20;
        char c21;
        WebRequest webRequest5;
        char c22;
        char c23;
        WebRequest webRequest6;
        Throwable th;
        char c24;
        char c25;
        ?? r15;
        ?? r10;
        char c26;
        FileOutputStream fileOutputStream;
        char c27;
        WebRequest webRequest7;
        char c28;
        char c29;
        WebRequest webRequest8;
        char c30;
        char c31;
        WebRequest webRequest9;
        char c32;
        char c33;
        WebRequest webRequest10;
        char c34;
        char c35;
        WebRequest webRequest11;
        char c36;
        char c37;
        WebRequest webRequest12;
        char c38;
        char c39;
        WebRequest webRequest13;
        ?? r16 = 2;
        ?? r11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        ?? r12 = 0;
        ?? r13 = 0;
        ?? r14 = 0;
        ?? r17 = 0;
        ?? r18 = 0;
        r11 = 0;
        if (this._canceled || str == null || str2 == null) {
            return;
        }
        final File file = new File(str2);
        if (z6) {
            DeviceLog.debug("Unity Ads cache: resuming download " + str + " to " + str2 + " at " + file.length() + " bytes");
        } else {
            DeviceLog.debug("Unity Ads cache: start downloading " + str + " to " + str2);
        }
        if (!Device.isActiveNetworkConnected()) {
            DeviceLog.debug("Unity Ads cache: download cancelled, no internet connection available");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.NO_INTERNET, str);
            return;
        }
        this._active = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(file, z6);
                try {
                    WebRequest webRequest14 = getWebRequest(str, i10, i11, map);
                    this._currentRequest = webRequest14;
                    webRequest14.setProgressListener(new IWebRequestProgressListener() { // from class: com.unity3d.services.core.cache.CacheThreadHandler.1
                        private long lastProgressEventTime = System.currentTimeMillis();

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestProgress(String str4, long j, long j10) {
                            if (i12 <= 0 || System.currentTimeMillis() - this.lastProgressEventTime <= i12) {
                                return;
                            }
                            this.lastProgressEventTime = System.currentTimeMillis();
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_PROGRESS, str4, Long.valueOf(j), Long.valueOf(j10));
                        }

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestStart(String str4, long j, int i13, Map<String, List<String>> map2) {
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STARTED, str4, Long.valueOf(file.length()), Long.valueOf(file.length() + j), Integer.valueOf(i13), Request.getResponseHeadersMap(map2));
                        }
                    });
                    long jMakeStreamRequest = this._currentRequest.makeStreamRequest(fileOutputStream3);
                    this._active = false;
                    str3 = "Error closing stream";
                    char c40 = 2;
                    WebRequest webRequest15 = null;
                    fileOutputStream = fileOutputStream3;
                    char c41 = 1;
                    try {
                        postProcessDownload(jElapsedRealtime, str, file, jMakeStreamRequest, this._currentRequest.getContentLength(), this._currentRequest.isCanceled(), this._currentRequest.getResponseCode(), this._currentRequest.getResponseHeaders(), cacheEventSender);
                        this._currentRequest = null;
                        try {
                            fileOutputStream.close();
                        } catch (Exception e10) {
                            DeviceLog.exception(str3, e10);
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e10.getMessage());
                        }
                    } catch (NetworkIOException e11) {
                        e = e11;
                        z10 = false;
                        webRequest13 = webRequest15;
                        c38 = c41;
                        c39 = c40;
                        fileOutputStream2 = fileOutputStream;
                        z17 = z10;
                        webRequest6 = webRequest13;
                        c22 = c38;
                        c23 = c39;
                        DeviceLog.exception("Network error", e);
                        this._active = z17;
                        CacheEvent cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                        String message = e.getMessage();
                        Object[] objArr = new Object[3];
                        objArr[z17 ? 1 : 0] = CacheError.NETWORK_ERROR;
                        objArr[c22 == true ? 1 : 0] = str;
                        objArr[c23 == true ? 1 : 0] = message;
                        cacheEventSender.sendEvent(cacheEvent, objArr);
                        this._currentRequest = webRequest6;
                        r11 = z17;
                        r16 = webRequest6;
                        c10 = c22;
                        c11 = c23;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r11 = z17;
                                r16 = webRequest6;
                                c10 = c22;
                                c11 = c23;
                            } catch (Exception e12) {
                                DeviceLog.exception(str3, e12);
                                CacheEvent cacheEvent2 = CacheEvent.DOWNLOAD_ERROR;
                                String message2 = e12.getMessage();
                                Object[] objArr2 = new Object[3];
                                objArr2[z17 ? 1 : 0] = CacheError.FILE_IO_ERROR;
                                objArr2[c22 == true ? 1 : 0] = str;
                                objArr2[c23 == true ? 1 : 0] = message2;
                                cacheEventSender.sendEvent(cacheEvent2, objArr2);
                                r11 = z17;
                                r16 = webRequest6;
                                c10 = c22;
                                c11 = c23;
                            }
                        }
                    } catch (FileNotFoundException e13) {
                        e = e13;
                        z11 = false;
                        webRequest12 = webRequest15;
                        c36 = c41;
                        c37 = c40;
                        fileOutputStream2 = fileOutputStream;
                        r12 = z11;
                        webRequest5 = webRequest12;
                        c20 = c36;
                        c21 = c37;
                        DeviceLog.exception("Couldn't create target file", e);
                        this._active = r12;
                        CacheEvent cacheEvent3 = CacheEvent.DOWNLOAD_ERROR;
                        String message3 = e.getMessage();
                        Object[] objArr3 = new Object[3];
                        objArr3[r12] = CacheError.FILE_IO_ERROR;
                        objArr3[c20] = str;
                        objArr3[c21] = message3;
                        cacheEventSender.sendEvent(cacheEvent3, objArr3);
                        this._currentRequest = webRequest5;
                        r11 = r12;
                        r16 = webRequest5;
                        c10 = c20;
                        c11 = c21;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r11 = r12;
                                r16 = webRequest5;
                                c10 = c20;
                                c11 = c21;
                            } catch (Exception e14) {
                                DeviceLog.exception(str3, e14);
                                CacheEvent cacheEvent4 = CacheEvent.DOWNLOAD_ERROR;
                                String message4 = e14.getMessage();
                                Object[] objArr4 = new Object[3];
                                objArr4[r12] = CacheError.FILE_IO_ERROR;
                                objArr4[c20] = str;
                                objArr4[c21] = message4;
                                cacheEventSender.sendEvent(cacheEvent4, objArr4);
                                r11 = r12;
                                r16 = webRequest5;
                                c10 = c20;
                                c11 = c21;
                            }
                        }
                    } catch (IOException e15) {
                        e = e15;
                        z12 = false;
                        webRequest11 = webRequest15;
                        c34 = c41;
                        c35 = c40;
                        fileOutputStream2 = fileOutputStream;
                        r14 = z12;
                        webRequest3 = webRequest11;
                        c16 = c34;
                        c17 = c35;
                        DeviceLog.exception("Couldn't request stream", e);
                        this._active = r14;
                        CacheEvent cacheEvent5 = CacheEvent.DOWNLOAD_ERROR;
                        String message5 = e.getMessage();
                        Object[] objArr5 = new Object[3];
                        objArr5[r14] = CacheError.FILE_IO_ERROR;
                        objArr5[c16] = str;
                        objArr5[c17] = message5;
                        cacheEventSender.sendEvent(cacheEvent5, objArr5);
                        this._currentRequest = webRequest3;
                        r11 = r14;
                        r16 = webRequest3;
                        c10 = c16;
                        c11 = c17;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r11 = r14;
                                r16 = webRequest3;
                                c10 = c16;
                                c11 = c17;
                            } catch (Exception e16) {
                                DeviceLog.exception(str3, e16);
                                CacheEvent cacheEvent6 = CacheEvent.DOWNLOAD_ERROR;
                                String message6 = e16.getMessage();
                                Object[] objArr6 = new Object[3];
                                objArr6[r14] = CacheError.FILE_IO_ERROR;
                                objArr6[c16] = str;
                                objArr6[c17] = message6;
                                cacheEventSender.sendEvent(cacheEvent6, objArr6);
                                r11 = r14;
                                r16 = webRequest3;
                                c10 = c16;
                                c11 = c17;
                            }
                        }
                    } catch (IllegalStateException e17) {
                        e = e17;
                        z13 = false;
                        webRequest10 = webRequest15;
                        c32 = c41;
                        c33 = c40;
                        fileOutputStream2 = fileOutputStream;
                        r17 = z13;
                        webRequest2 = webRequest10;
                        c14 = c32;
                        c15 = c33;
                        DeviceLog.exception("Illegal state", e);
                        this._active = r17;
                        CacheEvent cacheEvent7 = CacheEvent.DOWNLOAD_ERROR;
                        String message7 = e.getMessage();
                        Object[] objArr7 = new Object[3];
                        objArr7[r17] = CacheError.ILLEGAL_STATE;
                        objArr7[c14] = str;
                        objArr7[c15] = message7;
                        cacheEventSender.sendEvent(cacheEvent7, objArr7);
                        this._currentRequest = webRequest2;
                        r11 = r17;
                        r16 = webRequest2;
                        c10 = c14;
                        c11 = c15;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r11 = r17;
                                r16 = webRequest2;
                                c10 = c14;
                                c11 = c15;
                            } catch (Exception e18) {
                                DeviceLog.exception(str3, e18);
                                CacheEvent cacheEvent8 = CacheEvent.DOWNLOAD_ERROR;
                                String message8 = e18.getMessage();
                                Object[] objArr8 = new Object[3];
                                objArr8[r17] = CacheError.FILE_IO_ERROR;
                                objArr8[c14] = str;
                                objArr8[c15] = message8;
                                cacheEventSender.sendEvent(cacheEvent8, objArr8);
                                r11 = r17;
                                r16 = webRequest2;
                                c10 = c14;
                                c11 = c15;
                            }
                        }
                    } catch (MalformedURLException e19) {
                        e = e19;
                        z14 = false;
                        webRequest9 = webRequest15;
                        c30 = c41;
                        c31 = c40;
                        fileOutputStream2 = fileOutputStream;
                        r13 = z14;
                        webRequest4 = webRequest9;
                        c18 = c30;
                        c19 = c31;
                        DeviceLog.exception("Malformed URL", e);
                        this._active = r13;
                        CacheEvent cacheEvent9 = CacheEvent.DOWNLOAD_ERROR;
                        String message9 = e.getMessage();
                        Object[] objArr9 = new Object[3];
                        objArr9[r13] = CacheError.MALFORMED_URL;
                        objArr9[c18] = str;
                        objArr9[c19] = message9;
                        cacheEventSender.sendEvent(cacheEvent9, objArr9);
                        this._currentRequest = webRequest4;
                        r11 = r13;
                        r16 = webRequest4;
                        c10 = c18;
                        c11 = c19;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r11 = r13;
                                r16 = webRequest4;
                                c10 = c18;
                                c11 = c19;
                            } catch (Exception e20) {
                                DeviceLog.exception(str3, e20);
                                CacheEvent cacheEvent10 = CacheEvent.DOWNLOAD_ERROR;
                                String message10 = e20.getMessage();
                                Object[] objArr10 = new Object[3];
                                objArr10[r13] = CacheError.FILE_IO_ERROR;
                                objArr10[c18] = str;
                                objArr10[c19] = message10;
                                cacheEventSender.sendEvent(cacheEvent10, objArr10);
                                r11 = r13;
                                r16 = webRequest4;
                                c10 = c18;
                                c11 = c19;
                            }
                        }
                    } catch (Exception e21) {
                        e = e21;
                        z15 = false;
                        webRequest8 = webRequest15;
                        c28 = c41;
                        c29 = c40;
                        fileOutputStream2 = fileOutputStream;
                        r18 = z15;
                        webRequest = webRequest8;
                        c12 = c28;
                        c13 = c29;
                        DeviceLog.exception("Unknown error", e);
                        this._active = r18;
                        CacheEvent cacheEvent11 = CacheEvent.DOWNLOAD_ERROR;
                        String message11 = e.getMessage();
                        Object[] objArr11 = new Object[3];
                        objArr11[r18] = CacheError.UNKNOWN_ERROR;
                        objArr11[c12] = str;
                        objArr11[c13] = message11;
                        cacheEventSender.sendEvent(cacheEvent11, objArr11);
                        this._currentRequest = webRequest;
                        r11 = r18;
                        r16 = webRequest;
                        c10 = c12;
                        c11 = c13;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                                r11 = r18;
                                r16 = webRequest;
                                c10 = c12;
                                c11 = c13;
                            } catch (Exception e22) {
                                DeviceLog.exception(str3, e22);
                                CacheEvent cacheEvent12 = CacheEvent.DOWNLOAD_ERROR;
                                String message12 = e22.getMessage();
                                Object[] objArr12 = new Object[3];
                                objArr12[r18] = CacheError.FILE_IO_ERROR;
                                objArr12[c12] = str;
                                objArr12[c13] = message12;
                                cacheEventSender.sendEvent(cacheEvent12, objArr12);
                                r11 = r18;
                                r16 = webRequest;
                                c10 = c12;
                                c11 = c13;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z16 = false;
                        webRequest7 = webRequest15;
                        c26 = c41;
                        c27 = c40;
                        th = th;
                        fileOutputStream2 = fileOutputStream;
                        r10 = z16;
                        r15 = webRequest7;
                        c25 = c26;
                        c24 = c27;
                        this._currentRequest = r15;
                        if (fileOutputStream2 == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream2.close();
                            throw th;
                        } catch (Exception e23) {
                            DeviceLog.exception(str3, e23);
                            CacheEvent cacheEvent13 = CacheEvent.DOWNLOAD_ERROR;
                            String message13 = e23.getMessage();
                            Object[] objArr13 = new Object[3];
                            objArr13[r10] = CacheError.FILE_IO_ERROR;
                            objArr13[c25] = str;
                            objArr13[c24] = message13;
                            cacheEventSender.sendEvent(cacheEvent13, objArr13);
                            throw th;
                        }
                    }
                } catch (NetworkIOException e24) {
                    e = e24;
                    c38 = 1;
                    str3 = "Error closing stream";
                    fileOutputStream = fileOutputStream3;
                    c39 = 2;
                    webRequest13 = null;
                } catch (FileNotFoundException e25) {
                    e = e25;
                    c36 = 1;
                    str3 = "Error closing stream";
                    fileOutputStream = fileOutputStream3;
                    c37 = 2;
                    webRequest12 = null;
                } catch (IOException e26) {
                    e = e26;
                    c34 = 1;
                    str3 = "Error closing stream";
                    fileOutputStream = fileOutputStream3;
                    c35 = 2;
                    webRequest11 = null;
                } catch (IllegalStateException e27) {
                    e = e27;
                    c32 = 1;
                    str3 = "Error closing stream";
                    fileOutputStream = fileOutputStream3;
                    c33 = 2;
                    webRequest10 = null;
                } catch (MalformedURLException e28) {
                    e = e28;
                    c30 = 1;
                    str3 = "Error closing stream";
                    fileOutputStream = fileOutputStream3;
                    c31 = 2;
                    webRequest9 = null;
                } catch (Exception e29) {
                    e = e29;
                    c28 = 1;
                    str3 = "Error closing stream";
                    fileOutputStream = fileOutputStream3;
                    c29 = 2;
                    webRequest8 = null;
                } catch (Throwable th3) {
                    th = th3;
                    c26 = 1;
                    str3 = "Error closing stream";
                    fileOutputStream = fileOutputStream3;
                    c27 = 2;
                    webRequest7 = null;
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                r10 = r11;
                r15 = r16;
                c25 = c10;
                c24 = c11;
                this._currentRequest = r15;
                if (fileOutputStream2 == null) {
                    throw th;
                }
                fileOutputStream2.close();
                throw th;
            }
        } catch (NetworkIOException e30) {
            e = e30;
            c22 = 1;
            str3 = "Error closing stream";
            c23 = 2;
            webRequest6 = null;
        } catch (FileNotFoundException e31) {
            e = e31;
            c20 = 1;
            str3 = "Error closing stream";
            c21 = 2;
            webRequest5 = null;
        } catch (MalformedURLException e32) {
            e = e32;
            c18 = 1;
            str3 = "Error closing stream";
            c19 = 2;
            webRequest4 = null;
        } catch (IOException e33) {
            e = e33;
            c16 = 1;
            str3 = "Error closing stream";
            c17 = 2;
            webRequest3 = null;
        } catch (IllegalStateException e34) {
            e = e34;
            c14 = 1;
            str3 = "Error closing stream";
            c15 = 2;
            webRequest2 = null;
        } catch (Exception e35) {
            e = e35;
            c12 = 1;
            str3 = "Error closing stream";
            c13 = 2;
            webRequest = null;
        } catch (Throwable th5) {
            th = th5;
            c10 = 1;
            str3 = "Error closing stream";
            c11 = 2;
            r16 = 0;
            th = th;
            r10 = r11;
            r15 = r16;
            c25 = c10;
            c24 = c11;
            this._currentRequest = r15;
            if (fileOutputStream2 == null) {
                throw th;
            }
            fileOutputStream2.close();
            throw th;
        }
    }

    private WebRequest getWebRequest(String str, int i10, int i11, HashMap<String, List<String>> map) throws MalformedURLException {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        return new WebRequest(str, "GET", map2, i10, i11);
    }

    private void postProcessDownload(long j, String str, File file, long j10, long j11, boolean z6, int i10, Map<String, List<String>> map, CacheEventSender cacheEventSender) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (z6) {
            DeviceLog.debug("Unity Ads cache: downloading of " + str + " stopped");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STOPPED, str, Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(jElapsedRealtime), Integer.valueOf(i10), Request.getResponseHeadersMap(map));
            return;
        }
        DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j10 + " bytes downloaded in " + jElapsedRealtime + "ms");
        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_END, str, Long.valueOf(j10), Long.valueOf(j11), Long.valueOf(jElapsedRealtime), Integer.valueOf(i10), Request.getResponseHeadersMap(map));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        HashMap<String, List<String>> map;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i10 = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i11 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i12 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z6 = data.getBoolean("append", false);
        data.remove("append");
        CacheEventSender cacheEventSender = (CacheEventSender) data.getSerializable("cacheEventSender");
        data.remove("cacheEventSender");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            map = new HashMap<>();
            for (String str : data.keySet()) {
                map.put(str, Arrays.asList(data.getStringArray(str)));
            }
        } else {
            map = null;
        }
        HashMap<String, List<String>> map2 = map;
        File file = new File(string2);
        if ((z6 && !file.exists()) || (!z6 && file.exists())) {
            this._active = false;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z6), Boolean.valueOf(file.exists()));
        } else {
            if (message.what != 1) {
                return;
            }
            downloadFile(string, string2, i10, i11, i12, map2, z6, cacheEventSender);
        }
    }

    public boolean isActive() {
        return this._active;
    }

    public void setCancelStatus(boolean z6) {
        WebRequest webRequest;
        this._canceled = z6;
        if (!z6 || (webRequest = this._currentRequest) == null) {
            return;
        }
        this._active = false;
        webRequest.cancel();
    }
}
