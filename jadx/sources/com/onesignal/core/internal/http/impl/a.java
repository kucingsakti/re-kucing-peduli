package com.onesignal.core.internal.http.impl;

import N9.AbstractC0317a;
import N9.AbstractC0342z;
import N9.I;
import N9.InterfaceC0341y;
import N9.p0;
import android.net.TrafficStats;
import android.os.Build;
import com.onesignal.common.f;
import com.onesignal.common.i;
import com.rollbar.notifier.sender.SyncSender;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;
import kotlinx.coroutines.TimeoutCancellationException;
import org.json.JSONObject;
import p076h8.m;
import p086i8.k;
import p123m8.j;
import p144o8.g;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p035d5.c {
    public static final C0029a Companion = new C0029a(null);
    private static final String OS_ACCEPT_HEADER = "application/vnd.onesignal.v1+json";
    private static final String OS_API_VERSION = "1";
    private static final int THREAD_ID = 10000;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final com.onesignal.core.internal.http.impl.c _connectionFactory;
    private final p025c5.d _installIdService;
    private final p093j5.b _prefs;
    private final p110l5.a _time;
    private long delayNewRequestsUntil;

    /* JADX INFO: renamed from: com.onesignal.core.internal.http.impl.a$a, reason: collision with other inner class name */
    public static final class C0029a {
        public /* synthetic */ C0029a(p210v8.e eVar) {
            this();
        }

        private C0029a() {
        }
    }

    public static final class b extends p144o8.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequest(null, null, null, 0, null, this);
        }
    }

    public static final class c extends g implements p200u8.c {
        final /* synthetic */ com.onesignal.core.internal.http.impl.d $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, JSONObject jSONObject, int i10, com.onesignal.core.internal.http.impl.d dVar, p123m8.d<? super c> dVar2) {
            super(2, dVar2);
            this.$url = str;
            this.$method = str2;
            this.$jsonBody = jSONObject;
            this.$timeout = i10;
            this.$headers = dVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return a.this.new c(this.$url, this.$method, this.$jsonBody, this.$timeout, this.$headers, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super p035d5.a> dVar) {
            return ((c) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            p134n8.a aVar = p134n8.a.f13404s;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
                return obj;
            }
            J7.a.v(obj);
            a aVar2 = a.this;
            String str = this.$url;
            String str2 = this.$method;
            JSONObject jSONObject = this.$jsonBody;
            int i11 = this.$timeout;
            com.onesignal.core.internal.http.impl.d dVar = this.$headers;
            this.label = 1;
            Object objMakeRequestIODispatcher = aVar2.makeRequestIODispatcher(str, str2, jSONObject, i11, dVar, this);
            return objMakeRequestIODispatcher == aVar ? aVar : objMakeRequestIODispatcher;
        }
    }

    public static final class d extends p144o8.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public d(p123m8.d<? super d> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.makeRequestIODispatcher(null, null, null, 0, null, this);
        }
    }

    public static final class e extends g implements p200u8.c {
        final /* synthetic */ com.onesignal.core.internal.http.impl.d $headers;
        final /* synthetic */ JSONObject $jsonBody;
        final /* synthetic */ String $method;
        final /* synthetic */ t $retVal;
        final /* synthetic */ int $timeout;
        final /* synthetic */ String $url;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, int i10, com.onesignal.core.internal.http.impl.d dVar, JSONObject jSONObject, String str2, t tVar, p123m8.d<? super e> dVar2) {
            super(2, dVar2);
            this.$url = str;
            this.$timeout = i10;
            this.$headers = dVar;
            this.$jsonBody = jSONObject;
            this.$method = str2;
            this.$retVal = tVar;
        }

        @Override // p144o8.a
        public final p123m8.d<m> create(Object obj, p123m8.d<?> dVar) {
            return a.this.new e(this.$url, this.$timeout, this.$headers, this.$jsonBody, this.$method, this.$retVal, dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, p123m8.d<? super m> dVar) {
            return ((e) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x026f A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:81:0x020b, B:90:0x0224, B:95:0x023e, B:99:0x0249, B:101:0x026f, B:103:0x0275, B:105:0x0284, B:106:0x0289, B:108:0x02ce, B:111:0x02dd, B:107:0x02ae, B:114:0x02e6, B:116:0x02fd, B:118:0x0304, B:121:0x0312, B:123:0x033a, B:126:0x0342, B:128:0x034a, B:129:0x0396, B:132:0x03a7, B:137:0x03bd), top: B:171:0x020b }] */
        /* JADX WARN: Code duplicated, block: B:103:0x0275 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:81:0x020b, B:90:0x0224, B:95:0x023e, B:99:0x0249, B:101:0x026f, B:103:0x0275, B:105:0x0284, B:106:0x0289, B:108:0x02ce, B:111:0x02dd, B:107:0x02ae, B:114:0x02e6, B:116:0x02fd, B:118:0x0304, B:121:0x0312, B:123:0x033a, B:126:0x0342, B:128:0x034a, B:129:0x0396, B:132:0x03a7, B:137:0x03bd), top: B:171:0x020b }] */
        /* JADX WARN: Code duplicated, block: B:105:0x0284 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:81:0x020b, B:90:0x0224, B:95:0x023e, B:99:0x0249, B:101:0x026f, B:103:0x0275, B:105:0x0284, B:106:0x0289, B:108:0x02ce, B:111:0x02dd, B:107:0x02ae, B:114:0x02e6, B:116:0x02fd, B:118:0x0304, B:121:0x0312, B:123:0x033a, B:126:0x0342, B:128:0x034a, B:129:0x0396, B:132:0x03a7, B:137:0x03bd), top: B:171:0x020b }] */
        /* JADX WARN: Code duplicated, block: B:107:0x02ae A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:81:0x020b, B:90:0x0224, B:95:0x023e, B:99:0x0249, B:101:0x026f, B:103:0x0275, B:105:0x0284, B:106:0x0289, B:108:0x02ce, B:111:0x02dd, B:107:0x02ae, B:114:0x02e6, B:116:0x02fd, B:118:0x0304, B:121:0x0312, B:123:0x033a, B:126:0x0342, B:128:0x034a, B:129:0x0396, B:132:0x03a7, B:137:0x03bd), top: B:171:0x020b }] */
        /* JADX WARN: Code duplicated, block: B:114:0x02e6 A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:81:0x020b, B:90:0x0224, B:95:0x023e, B:99:0x0249, B:101:0x026f, B:103:0x0275, B:105:0x0284, B:106:0x0289, B:108:0x02ce, B:111:0x02dd, B:107:0x02ae, B:114:0x02e6, B:116:0x02fd, B:118:0x0304, B:121:0x0312, B:123:0x033a, B:126:0x0342, B:128:0x034a, B:129:0x0396, B:132:0x03a7, B:137:0x03bd), top: B:171:0x020b }] */
        /* JADX WARN: Code duplicated, block: B:116:0x02fd A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:81:0x020b, B:90:0x0224, B:95:0x023e, B:99:0x0249, B:101:0x026f, B:103:0x0275, B:105:0x0284, B:106:0x0289, B:108:0x02ce, B:111:0x02dd, B:107:0x02ae, B:114:0x02e6, B:116:0x02fd, B:118:0x0304, B:121:0x0312, B:123:0x033a, B:126:0x0342, B:128:0x034a, B:129:0x0396, B:132:0x03a7, B:137:0x03bd), top: B:171:0x020b }] */
        /* JADX WARN: Code duplicated, block: B:117:0x0302  */
        /* JADX WARN: Code duplicated, block: B:120:0x0310  */
        /* JADX WARN: Code duplicated, block: B:123:0x033a A[Catch: all -> 0x0210, TryCatch #0 {all -> 0x0210, blocks: (B:81:0x020b, B:90:0x0224, B:95:0x023e, B:99:0x0249, B:101:0x026f, B:103:0x0275, B:105:0x0284, B:106:0x0289, B:108:0x02ce, B:111:0x02dd, B:107:0x02ae, B:114:0x02e6, B:116:0x02fd, B:118:0x0304, B:121:0x0312, B:123:0x033a, B:126:0x0342, B:128:0x034a, B:129:0x0396, B:132:0x03a7, B:137:0x03bd), top: B:171:0x020b }] */
        /* JADX WARN: Code duplicated, block: B:124:0x033f  */
        /* JADX WARN: Code duplicated, block: B:134:0x03aa  */
        /* JADX WARN: Code duplicated, block: B:137:0x03bd A[Catch: all -> 0x0210, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0210, blocks: (B:81:0x020b, B:90:0x0224, B:95:0x023e, B:99:0x0249, B:101:0x026f, B:103:0x0275, B:105:0x0284, B:106:0x0289, B:108:0x02ce, B:111:0x02dd, B:107:0x02ae, B:114:0x02e6, B:116:0x02fd, B:118:0x0304, B:121:0x0312, B:123:0x033a, B:126:0x0342, B:128:0x034a, B:129:0x0396, B:132:0x03a7, B:137:0x03bd), top: B:171:0x020b }] */
        /* JADX WARN: Code duplicated, block: B:139:0x03c2  */
        /* JADX WARN: Code duplicated, block: B:142:0x03dd  */
        /* JADX WARN: Code duplicated, block: B:143:0x03e0  */
        /* JADX WARN: Code duplicated, block: B:156:0x042a A[Catch: all -> 0x0446, TryCatch #4 {all -> 0x0446, blocks: (B:154:0x0426, B:156:0x042a, B:159:0x042f, B:163:0x0459, B:162:0x0448), top: B:179:0x0426 }] */
        /* JADX WARN: Code duplicated, block: B:162:0x0448 A[Catch: all -> 0x0446, TryCatch #4 {all -> 0x0446, blocks: (B:154:0x0426, B:156:0x042a, B:159:0x042f, B:163:0x0459, B:162:0x0448), top: B:179:0x0426 }] */
        /* JADX WARN: Code duplicated, block: B:165:0x046d A[DONT_GENERATE] */
        /* JADX WARN: Code duplicated, block: B:171:0x020b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:42:0x0102 A[Catch: all -> 0x0078, TryCatch #6 {all -> 0x0078, blocks: (B:40:0x00f5, B:42:0x0102, B:43:0x0105, B:45:0x0109, B:46:0x0118, B:49:0x013b, B:50:0x015e, B:52:0x0162, B:57:0x016c, B:59:0x0192, B:60:0x019e, B:62:0x01a2, B:65:0x01aa, B:66:0x01b9, B:68:0x01bd, B:71:0x01c5, B:72:0x01d4, B:74:0x01d8, B:77:0x01e0, B:78:0x01ef, B:17:0x005b, B:19:0x0073, B:25:0x0081, B:26:0x008a, B:28:0x0090, B:30:0x0096, B:31:0x00b7, B:33:0x00d0, B:35:0x00d6, B:36:0x00db), top: B:183:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:45:0x0109 A[Catch: all -> 0x0078, TryCatch #6 {all -> 0x0078, blocks: (B:40:0x00f5, B:42:0x0102, B:43:0x0105, B:45:0x0109, B:46:0x0118, B:49:0x013b, B:50:0x015e, B:52:0x0162, B:57:0x016c, B:59:0x0192, B:60:0x019e, B:62:0x01a2, B:65:0x01aa, B:66:0x01b9, B:68:0x01bd, B:71:0x01c5, B:72:0x01d4, B:74:0x01d8, B:77:0x01e0, B:78:0x01ef, B:17:0x005b, B:19:0x0073, B:25:0x0081, B:26:0x008a, B:28:0x0090, B:30:0x0096, B:31:0x00b7, B:33:0x00d0, B:35:0x00d6, B:36:0x00db), top: B:183:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:49:0x013b A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #6 {all -> 0x0078, blocks: (B:40:0x00f5, B:42:0x0102, B:43:0x0105, B:45:0x0109, B:46:0x0118, B:49:0x013b, B:50:0x015e, B:52:0x0162, B:57:0x016c, B:59:0x0192, B:60:0x019e, B:62:0x01a2, B:65:0x01aa, B:66:0x01b9, B:68:0x01bd, B:71:0x01c5, B:72:0x01d4, B:74:0x01d8, B:77:0x01e0, B:78:0x01ef, B:17:0x005b, B:19:0x0073, B:25:0x0081, B:26:0x008a, B:28:0x0090, B:30:0x0096, B:31:0x00b7, B:33:0x00d0, B:35:0x00d6, B:36:0x00db), top: B:183:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:52:0x0162 A[Catch: all -> 0x0078, TRY_LEAVE, TryCatch #6 {all -> 0x0078, blocks: (B:40:0x00f5, B:42:0x0102, B:43:0x0105, B:45:0x0109, B:46:0x0118, B:49:0x013b, B:50:0x015e, B:52:0x0162, B:57:0x016c, B:59:0x0192, B:60:0x019e, B:62:0x01a2, B:65:0x01aa, B:66:0x01b9, B:68:0x01bd, B:71:0x01c5, B:72:0x01d4, B:74:0x01d8, B:77:0x01e0, B:78:0x01ef, B:17:0x005b, B:19:0x0073, B:25:0x0081, B:26:0x008a, B:28:0x0090, B:30:0x0096, B:31:0x00b7, B:33:0x00d0, B:35:0x00d6, B:36:0x00db), top: B:183:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:54:0x0167  */
        /* JADX WARN: Code duplicated, block: B:57:0x016c A[Catch: all -> 0x0078, TRY_ENTER, TryCatch #6 {all -> 0x0078, blocks: (B:40:0x00f5, B:42:0x0102, B:43:0x0105, B:45:0x0109, B:46:0x0118, B:49:0x013b, B:50:0x015e, B:52:0x0162, B:57:0x016c, B:59:0x0192, B:60:0x019e, B:62:0x01a2, B:65:0x01aa, B:66:0x01b9, B:68:0x01bd, B:71:0x01c5, B:72:0x01d4, B:74:0x01d8, B:77:0x01e0, B:78:0x01ef, B:17:0x005b, B:19:0x0073, B:25:0x0081, B:26:0x008a, B:28:0x0090, B:30:0x0096, B:31:0x00b7, B:33:0x00d0, B:35:0x00d6, B:36:0x00db), top: B:183:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:59:0x0192 A[Catch: all -> 0x0078, TryCatch #6 {all -> 0x0078, blocks: (B:40:0x00f5, B:42:0x0102, B:43:0x0105, B:45:0x0109, B:46:0x0118, B:49:0x013b, B:50:0x015e, B:52:0x0162, B:57:0x016c, B:59:0x0192, B:60:0x019e, B:62:0x01a2, B:65:0x01aa, B:66:0x01b9, B:68:0x01bd, B:71:0x01c5, B:72:0x01d4, B:74:0x01d8, B:77:0x01e0, B:78:0x01ef, B:17:0x005b, B:19:0x0073, B:25:0x0081, B:26:0x008a, B:28:0x0090, B:30:0x0096, B:31:0x00b7, B:33:0x00d0, B:35:0x00d6, B:36:0x00db), top: B:183:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:62:0x01a2 A[Catch: all -> 0x0078, TryCatch #6 {all -> 0x0078, blocks: (B:40:0x00f5, B:42:0x0102, B:43:0x0105, B:45:0x0109, B:46:0x0118, B:49:0x013b, B:50:0x015e, B:52:0x0162, B:57:0x016c, B:59:0x0192, B:60:0x019e, B:62:0x01a2, B:65:0x01aa, B:66:0x01b9, B:68:0x01bd, B:71:0x01c5, B:72:0x01d4, B:74:0x01d8, B:77:0x01e0, B:78:0x01ef, B:17:0x005b, B:19:0x0073, B:25:0x0081, B:26:0x008a, B:28:0x0090, B:30:0x0096, B:31:0x00b7, B:33:0x00d0, B:35:0x00d6, B:36:0x00db), top: B:183:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:63:0x01a7  */
        /* JADX WARN: Code duplicated, block: B:65:0x01aa A[Catch: all -> 0x0078, TryCatch #6 {all -> 0x0078, blocks: (B:40:0x00f5, B:42:0x0102, B:43:0x0105, B:45:0x0109, B:46:0x0118, B:49:0x013b, B:50:0x015e, B:52:0x0162, B:57:0x016c, B:59:0x0192, B:60:0x019e, B:62:0x01a2, B:65:0x01aa, B:66:0x01b9, B:68:0x01bd, B:71:0x01c5, B:72:0x01d4, B:74:0x01d8, B:77:0x01e0, B:78:0x01ef, B:17:0x005b, B:19:0x0073, B:25:0x0081, B:26:0x008a, B:28:0x0090, B:30:0x0096, B:31:0x00b7, B:33:0x00d0, B:35:0x00d6, B:36:0x00db), top: B:183:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:68:0x01bd A[Catch: all -> 0x0078, TryCatch #6 {all -> 0x0078, blocks: (B:40:0x00f5, B:42:0x0102, B:43:0x0105, B:45:0x0109, B:46:0x0118, B:49:0x013b, B:50:0x015e, B:52:0x0162, B:57:0x016c, B:59:0x0192, B:60:0x019e, B:62:0x01a2, B:65:0x01aa, B:66:0x01b9, B:68:0x01bd, B:71:0x01c5, B:72:0x01d4, B:74:0x01d8, B:77:0x01e0, B:78:0x01ef, B:17:0x005b, B:19:0x0073, B:25:0x0081, B:26:0x008a, B:28:0x0090, B:30:0x0096, B:31:0x00b7, B:33:0x00d0, B:35:0x00d6, B:36:0x00db), top: B:183:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:69:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:71:0x01c5 A[Catch: all -> 0x0078, TryCatch #6 {all -> 0x0078, blocks: (B:40:0x00f5, B:42:0x0102, B:43:0x0105, B:45:0x0109, B:46:0x0118, B:49:0x013b, B:50:0x015e, B:52:0x0162, B:57:0x016c, B:59:0x0192, B:60:0x019e, B:62:0x01a2, B:65:0x01aa, B:66:0x01b9, B:68:0x01bd, B:71:0x01c5, B:72:0x01d4, B:74:0x01d8, B:77:0x01e0, B:78:0x01ef, B:17:0x005b, B:19:0x0073, B:25:0x0081, B:26:0x008a, B:28:0x0090, B:30:0x0096, B:31:0x00b7, B:33:0x00d0, B:35:0x00d6, B:36:0x00db), top: B:183:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:74:0x01d8 A[Catch: all -> 0x0078, TryCatch #6 {all -> 0x0078, blocks: (B:40:0x00f5, B:42:0x0102, B:43:0x0105, B:45:0x0109, B:46:0x0118, B:49:0x013b, B:50:0x015e, B:52:0x0162, B:57:0x016c, B:59:0x0192, B:60:0x019e, B:62:0x01a2, B:65:0x01aa, B:66:0x01b9, B:68:0x01bd, B:71:0x01c5, B:72:0x01d4, B:74:0x01d8, B:77:0x01e0, B:78:0x01ef, B:17:0x005b, B:19:0x0073, B:25:0x0081, B:26:0x008a, B:28:0x0090, B:30:0x0096, B:31:0x00b7, B:33:0x00d0, B:35:0x00d6, B:36:0x00db), top: B:183:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:75:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:77:0x01e0 A[Catch: all -> 0x0078, TryCatch #6 {all -> 0x0078, blocks: (B:40:0x00f5, B:42:0x0102, B:43:0x0105, B:45:0x0109, B:46:0x0118, B:49:0x013b, B:50:0x015e, B:52:0x0162, B:57:0x016c, B:59:0x0192, B:60:0x019e, B:62:0x01a2, B:65:0x01aa, B:66:0x01b9, B:68:0x01bd, B:71:0x01c5, B:72:0x01d4, B:74:0x01d8, B:77:0x01e0, B:78:0x01ef, B:17:0x005b, B:19:0x0073, B:25:0x0081, B:26:0x008a, B:28:0x0090, B:30:0x0096, B:31:0x00b7, B:33:0x00d0, B:35:0x00d6, B:36:0x00db), top: B:183:0x005b }] */
        /* JADX WARN: Code duplicated, block: B:85:0x0215  */
        /* JADX WARN: Code duplicated, block: B:90:0x0224 A[Catch: all -> 0x0210, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0210, blocks: (B:81:0x020b, B:90:0x0224, B:95:0x023e, B:99:0x0249, B:101:0x026f, B:103:0x0275, B:105:0x0284, B:106:0x0289, B:108:0x02ce, B:111:0x02dd, B:107:0x02ae, B:114:0x02e6, B:116:0x02fd, B:118:0x0304, B:121:0x0312, B:123:0x033a, B:126:0x0342, B:128:0x034a, B:129:0x0396, B:132:0x03a7, B:137:0x03bd), top: B:171:0x020b }] */
        /* JADX WARN: Code duplicated, block: B:93:0x0233  */
        /* JADX WARN: Code duplicated, block: B:95:0x023e A[Catch: all -> 0x0210, TRY_ENTER, TryCatch #0 {all -> 0x0210, blocks: (B:81:0x020b, B:90:0x0224, B:95:0x023e, B:99:0x0249, B:101:0x026f, B:103:0x0275, B:105:0x0284, B:106:0x0289, B:108:0x02ce, B:111:0x02dd, B:107:0x02ae, B:114:0x02e6, B:116:0x02fd, B:118:0x0304, B:121:0x0312, B:123:0x033a, B:126:0x0342, B:128:0x034a, B:129:0x0396, B:132:0x03a7, B:137:0x03bd), top: B:171:0x020b }] */
        /* JADX WARN: Code duplicated, block: B:97:0x0247  */
        /* JADX WARN: Code duplicated, block: B:98:0x0248  */
        /* JADX WARN: Instruction removed from duplicated block: B:107:0x02ae, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:57:0x016c, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:93:0x0233, please report this as an issue */
        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            int i10;
            Throwable th;
            int i11;
            HttpURLConnection httpURLConnection;
            HttpURLConnection httpURLConnectionNewHttpURLConnection;
            String str;
            Object id;
            HttpURLConnection httpURLConnection2;
            JSONObject jSONObject;
            com.onesignal.core.internal.http.impl.d dVar;
            String cacheKey;
            com.onesignal.core.internal.http.impl.d dVar2;
            String rywToken;
            com.onesignal.core.internal.http.impl.d dVar3;
            Integer retryCount;
            com.onesignal.core.internal.http.impl.d dVar4;
            Long sessionDuration;
            int responseCode;
            int i12;
            Integer numRetryAfterFromResponse;
            Integer numRetryLimitFromResponse;
            int iIntValue;
            long j;
            String str2;
            com.onesignal.core.internal.http.impl.d dVar5;
            String cacheKey2;
            String str3;
            String str4;
            Scanner scanner;
            String next;
            String str5;
            com.onesignal.core.internal.http.impl.d dVar6;
            String cacheKey3;
            int i13;
            String headerField;
            String str6;
            InputStream errorStream;
            String str7;
            String string$default;
            p134n8.a aVar = p134n8.a.f13404s;
            int i14 = this.label;
            if (i14 == 0) {
                J7.a.v(obj);
                if (Build.VERSION.SDK_INT >= 26) {
                    TrafficStats.setThreadStatsTag(a.THREAD_ID);
                }
                i10 = -1;
                try {
                    httpURLConnectionNewHttpURLConnection = a.this._connectionFactory.newHttpURLConnection(this.$url);
                    try {
                        httpURLConnectionNewHttpURLConnection.setUseCaches(false);
                        httpURLConnectionNewHttpURLConnection.setConnectTimeout(this.$timeout);
                        httpURLConnectionNewHttpURLConnection.setReadTimeout(this.$timeout);
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("SDK-Version", "onesignal/android/050200");
                        com.onesignal.core.internal.http.impl.d dVar7 = this.$headers;
                        String jwt = dVar7 != null ? dVar7.getJwt() : null;
                        if (jwt != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("Authorization", "Bearer ".concat(jwt));
                        }
                        if (i.getSdkType() != null && i.getSdkVersion() != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("SDK-Wrapper", "onesignal/" + i.getSdkType() + '/' + i.getSdkVersion());
                        }
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("Accept", a.OS_ACCEPT_HEADER);
                        String pushSubscriptionId = ((com.onesignal.core.internal.config.a) a.this._configModelStore.getModel()).getPushSubscriptionId();
                        if (pushSubscriptionId != null && pushSubscriptionId.length() > 0) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-Subscription-Id", pushSubscriptionId);
                        }
                        str = "OneSignal-Install-Id";
                        p025c5.d dVar8 = a.this._installIdService;
                        this.L$0 = httpURLConnectionNewHttpURLConnection;
                        this.L$1 = httpURLConnectionNewHttpURLConnection;
                        this.L$2 = "OneSignal-Install-Id";
                        this.I$0 = -1;
                        this.label = 1;
                        id = dVar8.getId(this);
                        if (id == aVar) {
                            return aVar;
                        }
                        httpURLConnection2 = httpURLConnectionNewHttpURLConnection;
                        httpURLConnection2.setRequestProperty(str, ((UUID) id).toString());
                        if (this.$jsonBody != null) {
                            httpURLConnectionNewHttpURLConnection.setDoInput(true);
                        }
                        if (this.$method != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                            httpURLConnectionNewHttpURLConnection.setRequestMethod(this.$method);
                            httpURLConnectionNewHttpURLConnection.setDoOutput(true);
                        }
                        a aVar2 = a.this;
                        String requestMethod = httpURLConnectionNewHttpURLConnection.getRequestMethod();
                        URL url = httpURLConnectionNewHttpURLConnection.getURL();
                        p210v8.i.e(url, "con.url");
                        JSONObject jSONObject2 = this.$jsonBody;
                        Map<String, List<String>> requestProperties = httpURLConnectionNewHttpURLConnection.getRequestProperties();
                        p210v8.i.e(requestProperties, "con.requestProperties");
                        aVar2.logHTTPSent(requestMethod, url, jSONObject2, requestProperties);
                        jSONObject = this.$jsonBody;
                        if (jSONObject != null) {
                            String unescapedEUIDString = f.INSTANCE.toUnescapedEUIDString(jSONObject);
                            Charset charsetForName = Charset.forName(SyncSender.UTF_8);
                            p210v8.i.e(charsetForName, "forName(charsetName)");
                            byte[] bytes = unescapedEUIDString.getBytes(charsetForName);
                            p210v8.i.e(bytes, "this as java.lang.String).getBytes(charset)");
                            httpURLConnectionNewHttpURLConnection.setFixedLengthStreamingMode(bytes.length);
                            httpURLConnectionNewHttpURLConnection.getOutputStream().write(bytes);
                        }
                        dVar = this.$headers;
                        if (dVar != null) {
                            cacheKey = dVar.getCacheKey();
                        } else {
                            cacheKey = null;
                        }
                        if (cacheKey != null) {
                            string$default = p093j5.a.getString$default(a.this._prefs, "OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), null, 4, null);
                            if (string$default != null) {
                                httpURLConnectionNewHttpURLConnection.setRequestProperty("If-None-Match", string$default);
                                com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Adding header if-none-match: ".concat(string$default), null, 2, null);
                            }
                        }
                        dVar2 = this.$headers;
                        if (dVar2 != null) {
                            rywToken = dVar2.getRywToken();
                        } else {
                            rywToken = null;
                        }
                        if (rywToken != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-RYW-Token", this.$headers.getRywToken().toString());
                        }
                        dVar3 = this.$headers;
                        if (dVar3 != null) {
                            retryCount = dVar3.getRetryCount();
                        } else {
                            retryCount = null;
                        }
                        if (retryCount != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("Onesignal-Retry-Count", this.$headers.getRetryCount().toString());
                        }
                        dVar4 = this.$headers;
                        if (dVar4 != null) {
                            sessionDuration = dVar4.getSessionDuration();
                        } else {
                            sessionDuration = null;
                        }
                        if (sessionDuration != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-Session-Duration", this.$headers.getSessionDuration().toString());
                        }
                        responseCode = httpURLConnectionNewHttpURLConnection.getResponseCode();
                        numRetryAfterFromResponse = a.this.retryAfterFromResponse(httpURLConnectionNewHttpURLConnection);
                        numRetryLimitFromResponse = a.this.retryLimitFromResponse(httpURLConnectionNewHttpURLConnection);
                        long currentTimeMillis = a.this._time.getCurrentTimeMillis();
                        if (numRetryAfterFromResponse != null) {
                            iIntValue = numRetryAfterFromResponse.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        j = currentTimeMillis + ((long) (iIntValue * 1000));
                        if (j > a.this.delayNewRequestsUntil) {
                            a.this.delayNewRequestsUntil = j;
                        }
                        str2 = "GET";
                        if (responseCode != 304) {
                            switch (responseCode) {
                                case 200:
                                case 201:
                                case 202:
                                    scanner = new Scanner(httpURLConnectionNewHttpURLConnection.getInputStream(), SyncSender.UTF_8);
                                    if (scanner.useDelimiter("\\A").hasNext()) {
                                        next = scanner.next();
                                    } else {
                                        next = "";
                                    }
                                    scanner.close();
                                    StringBuilder sb = new StringBuilder("HttpClient: Got Response = ");
                                    str5 = this.$method;
                                    if (str5 == null) {
                                        str5 = "GET";
                                    }
                                    sb.append(str5);
                                    sb.append(' ');
                                    sb.append(httpURLConnectionNewHttpURLConnection.getURL());
                                    sb.append(" - STATUS: ");
                                    sb.append(responseCode);
                                    sb.append(" - Body: ");
                                    sb.append(next);
                                    com.onesignal.debug.internal.logging.b.debug$default(sb.toString(), null, 2, null);
                                    dVar6 = this.$headers;
                                    if (dVar6 != null) {
                                        cacheKey3 = dVar6.getCacheKey();
                                    } else {
                                        cacheKey3 = null;
                                    }
                                    if (cacheKey3 != null) {
                                        com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Got Response = Response has etag of " + headerField + " so caching the response.", null, 2, null);
                                        a.this._prefs.saveString("OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), headerField);
                                        a.this._prefs.saveString("OneSignal", "PREFS_OS_HTTP_CACHE_PREFIX_" + this.$headers.getCacheKey(), next);
                                    }
                                    i13 = responseCode;
                                    this.$retVal.f15466s = new p035d5.a(i13, next, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                                    break;
                                default:
                                    StringBuilder sb2 = new StringBuilder("HttpClient: Got Response = ");
                                    str6 = this.$method;
                                    if (str6 == null) {
                                        str2 = str6;
                                    }
                                    sb2.append(str2);
                                    sb2.append(' ');
                                    sb2.append(httpURLConnectionNewHttpURLConnection.getURL());
                                    sb2.append(" - FAILED STATUS: ");
                                    sb2.append(responseCode);
                                    com.onesignal.debug.internal.logging.b.debug$default(sb2.toString(), null, 2, null);
                                    errorStream = httpURLConnectionNewHttpURLConnection.getErrorStream();
                                    if (errorStream == null) {
                                        errorStream = httpURLConnectionNewHttpURLConnection.getInputStream();
                                    }
                                    if (errorStream != null) {
                                        Scanner scanner2 = new Scanner(errorStream, SyncSender.UTF_8);
                                        if (scanner2.useDelimiter("\\A").hasNext()) {
                                        }
                                        scanner2.close();
                                        com.onesignal.debug.internal.logging.b.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - Body: " + next, null, 2, null);
                                        str7 = next;
                                    } else {
                                        com.onesignal.debug.internal.logging.b.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - No response body!", null, 2, null);
                                        str7 = null;
                                    }
                                    i13 = responseCode;
                                    this.$retVal.f15466s = new p035d5.a(i13, str7, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                                    break;
                            }
                        } else {
                            p093j5.b bVar = a.this._prefs;
                            StringBuilder sb3 = new StringBuilder("PREFS_OS_HTTP_CACHE_PREFIX_");
                            dVar5 = this.$headers;
                            if (dVar5 != null) {
                                cacheKey2 = dVar5.getCacheKey();
                            } else {
                                cacheKey2 = null;
                            }
                            sb3.append(cacheKey2);
                            String string$default2 = p093j5.a.getString$default(bVar, "OneSignal", sb3.toString(), null, 4, null);
                            StringBuilder sb4 = new StringBuilder("HttpClient: Got Response = ");
                            str3 = this.$method;
                            if (str3 == null) {
                                str4 = "GET";
                            } else {
                                str4 = str3;
                            }
                            sb4.append(str4);
                            sb4.append(' ');
                            sb4.append(httpURLConnectionNewHttpURLConnection.getURL());
                            sb4.append(" - Using Cached response due to 304: ");
                            sb4.append(string$default2);
                            com.onesignal.debug.internal.logging.b.debug$default(sb4.toString(), null, 2, null);
                            i12 = responseCode;
                            this.$retVal.f15466s = new p035d5.a(i12, string$default2, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                        }
                        httpURLConnectionNewHttpURLConnection.disconnect();
                    } catch (Throwable th2) {
                        th = th2;
                        i11 = i10;
                        httpURLConnection = httpURLConnectionNewHttpURLConnection;
                        if (th instanceof ConnectException) {
                            com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        } else {
                            com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                        }
                        this.$retVal.f15466s = new p035d5.a(i11, null, th, null, null, 24, null);
                        return m.a;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i11 = -1;
                    httpURLConnection = null;
                    if (th instanceof ConnectException) {
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    } else {
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    }
                    this.$retVal.f15466s = new p035d5.a(i11, null, th, null, null, 24, null);
                    return m.a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i15 = this.I$0;
                str = (String) this.L$2;
                httpURLConnection2 = (HttpURLConnection) this.L$1;
                httpURLConnection = (HttpURLConnection) this.L$0;
                try {
                    J7.a.v(obj);
                    httpURLConnectionNewHttpURLConnection = httpURLConnection;
                    i10 = i15;
                    id = obj;
                    httpURLConnection2.setRequestProperty(str, ((UUID) id).toString());
                    if (this.$jsonBody != null) {
                        httpURLConnectionNewHttpURLConnection.setDoInput(true);
                    }
                    if (this.$method != null) {
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
                        httpURLConnectionNewHttpURLConnection.setRequestMethod(this.$method);
                        httpURLConnectionNewHttpURLConnection.setDoOutput(true);
                    }
                    a aVar3 = a.this;
                    String requestMethod2 = httpURLConnectionNewHttpURLConnection.getRequestMethod();
                    URL url2 = httpURLConnectionNewHttpURLConnection.getURL();
                    p210v8.i.e(url2, "con.url");
                    JSONObject jSONObject3 = this.$jsonBody;
                    Map<String, List<String>> requestProperties2 = httpURLConnectionNewHttpURLConnection.getRequestProperties();
                    p210v8.i.e(requestProperties2, "con.requestProperties");
                    aVar3.logHTTPSent(requestMethod2, url2, jSONObject3, requestProperties2);
                    jSONObject = this.$jsonBody;
                    if (jSONObject != null) {
                        String unescapedEUIDString2 = f.INSTANCE.toUnescapedEUIDString(jSONObject);
                        Charset charsetForName2 = Charset.forName(SyncSender.UTF_8);
                        p210v8.i.e(charsetForName2, "forName(charsetName)");
                        byte[] bytes2 = unescapedEUIDString2.getBytes(charsetForName2);
                        p210v8.i.e(bytes2, "this as java.lang.String).getBytes(charset)");
                        httpURLConnectionNewHttpURLConnection.setFixedLengthStreamingMode(bytes2.length);
                        httpURLConnectionNewHttpURLConnection.getOutputStream().write(bytes2);
                    }
                    dVar = this.$headers;
                    if (dVar != null) {
                        cacheKey = dVar.getCacheKey();
                    } else {
                        cacheKey = null;
                    }
                    if (cacheKey != null) {
                        string$default = p093j5.a.getString$default(a.this._prefs, "OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), null, 4, null);
                        if (string$default != null) {
                            httpURLConnectionNewHttpURLConnection.setRequestProperty("If-None-Match", string$default);
                            com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Adding header if-none-match: ".concat(string$default), null, 2, null);
                        }
                    }
                    dVar2 = this.$headers;
                    if (dVar2 != null) {
                        rywToken = dVar2.getRywToken();
                    } else {
                        rywToken = null;
                    }
                    if (rywToken != null) {
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-RYW-Token", this.$headers.getRywToken().toString());
                    }
                    dVar3 = this.$headers;
                    if (dVar3 != null) {
                        retryCount = dVar3.getRetryCount();
                    } else {
                        retryCount = null;
                    }
                    if (retryCount != null) {
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("Onesignal-Retry-Count", this.$headers.getRetryCount().toString());
                    }
                    dVar4 = this.$headers;
                    if (dVar4 != null) {
                        sessionDuration = dVar4.getSessionDuration();
                    } else {
                        sessionDuration = null;
                    }
                    if (sessionDuration != null) {
                        httpURLConnectionNewHttpURLConnection.setRequestProperty("OneSignal-Session-Duration", this.$headers.getSessionDuration().toString());
                    }
                    responseCode = httpURLConnectionNewHttpURLConnection.getResponseCode();
                    try {
                        numRetryAfterFromResponse = a.this.retryAfterFromResponse(httpURLConnectionNewHttpURLConnection);
                        numRetryLimitFromResponse = a.this.retryLimitFromResponse(httpURLConnectionNewHttpURLConnection);
                        long currentTimeMillis2 = a.this._time.getCurrentTimeMillis();
                        if (numRetryAfterFromResponse != null) {
                            try {
                                iIntValue = numRetryAfterFromResponse.intValue();
                            } catch (Throwable th4) {
                                th = th4;
                                th = th;
                                i11 = responseCode;
                                httpURLConnection = httpURLConnectionNewHttpURLConnection;
                                try {
                                    if ((th instanceof ConnectException) || (th instanceof UnknownHostException)) {
                                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                                    } else {
                                        com.onesignal.debug.internal.logging.b.warn("HttpClient: " + this.$method + " Error thrown from network stack. ", th);
                                    }
                                    this.$retVal.f15466s = new p035d5.a(i11, null, th, null, null, 24, null);
                                    return m.a;
                                } finally {
                                    if (httpURLConnection != null) {
                                        httpURLConnection.disconnect();
                                    }
                                }
                            }
                        } else {
                            iIntValue = 0;
                        }
                        j = currentTimeMillis2 + ((long) (iIntValue * 1000));
                        if (j > a.this.delayNewRequestsUntil) {
                            a.this.delayNewRequestsUntil = j;
                        }
                        str2 = "GET";
                        if (responseCode != 304) {
                            try {
                                switch (responseCode) {
                                    case 200:
                                    case 201:
                                    case 202:
                                        scanner = new Scanner(httpURLConnectionNewHttpURLConnection.getInputStream(), SyncSender.UTF_8);
                                        if (scanner.useDelimiter("\\A").hasNext()) {
                                            next = scanner.next();
                                        } else {
                                            next = "";
                                        }
                                        scanner.close();
                                        StringBuilder sb5 = new StringBuilder("HttpClient: Got Response = ");
                                        str5 = this.$method;
                                        if (str5 == null) {
                                            str5 = "GET";
                                        }
                                        sb5.append(str5);
                                        sb5.append(' ');
                                        sb5.append(httpURLConnectionNewHttpURLConnection.getURL());
                                        sb5.append(" - STATUS: ");
                                        sb5.append(responseCode);
                                        sb5.append(" - Body: ");
                                        sb5.append(next);
                                        com.onesignal.debug.internal.logging.b.debug$default(sb5.toString(), null, 2, null);
                                        dVar6 = this.$headers;
                                        if (dVar6 != null) {
                                            cacheKey3 = dVar6.getCacheKey();
                                        } else {
                                            cacheKey3 = null;
                                        }
                                        if (cacheKey3 != null && (headerField = httpURLConnectionNewHttpURLConnection.getHeaderField("etag")) != null) {
                                            com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Got Response = Response has etag of " + headerField + " so caching the response.", null, 2, null);
                                            a.this._prefs.saveString("OneSignal", "PREFS_OS_ETAG_PREFIX_" + this.$headers.getCacheKey(), headerField);
                                            a.this._prefs.saveString("OneSignal", "PREFS_OS_HTTP_CACHE_PREFIX_" + this.$headers.getCacheKey(), next);
                                        }
                                        i13 = responseCode;
                                        this.$retVal.f15466s = new p035d5.a(i13, next, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                                        break;
                                    default:
                                        StringBuilder sb6 = new StringBuilder("HttpClient: Got Response = ");
                                        str6 = this.$method;
                                        if (str6 == null) {
                                            str2 = str6;
                                        }
                                        sb6.append(str2);
                                        sb6.append(' ');
                                        sb6.append(httpURLConnectionNewHttpURLConnection.getURL());
                                        sb6.append(" - FAILED STATUS: ");
                                        sb6.append(responseCode);
                                        com.onesignal.debug.internal.logging.b.debug$default(sb6.toString(), null, 2, null);
                                        errorStream = httpURLConnectionNewHttpURLConnection.getErrorStream();
                                        if (errorStream == null) {
                                            errorStream = httpURLConnectionNewHttpURLConnection.getInputStream();
                                        }
                                        if (errorStream != null) {
                                            Scanner scanner3 = new Scanner(errorStream, SyncSender.UTF_8);
                                            String next2 = scanner3.useDelimiter("\\A").hasNext() ? scanner3.next() : "";
                                            scanner3.close();
                                            com.onesignal.debug.internal.logging.b.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - Body: " + next2, null, 2, null);
                                            str7 = next2;
                                        } else {
                                            com.onesignal.debug.internal.logging.b.warn$default("HttpClient: Got Response = " + this.$method + " - STATUS: " + responseCode + " - No response body!", null, 2, null);
                                            str7 = null;
                                        }
                                        i13 = responseCode;
                                        this.$retVal.f15466s = new p035d5.a(i13, str7, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                                        break;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                responseCode = i13;
                                th = th;
                                i11 = responseCode;
                                httpURLConnection = httpURLConnectionNewHttpURLConnection;
                                if (th instanceof ConnectException) {
                                    com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                                } else {
                                    com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                                }
                                this.$retVal.f15466s = new p035d5.a(i11, null, th, null, null, 24, null);
                            }
                        } else {
                            p093j5.b bVar2 = a.this._prefs;
                            StringBuilder sb7 = new StringBuilder("PREFS_OS_HTTP_CACHE_PREFIX_");
                            dVar5 = this.$headers;
                            if (dVar5 != null) {
                                cacheKey2 = dVar5.getCacheKey();
                            } else {
                                cacheKey2 = null;
                            }
                            sb7.append(cacheKey2);
                            String string$default3 = p093j5.a.getString$default(bVar2, "OneSignal", sb7.toString(), null, 4, null);
                            StringBuilder sb8 = new StringBuilder("HttpClient: Got Response = ");
                            str3 = this.$method;
                            if (str3 == null) {
                                str4 = "GET";
                            } else {
                                str4 = str3;
                            }
                            sb8.append(str4);
                            sb8.append(' ');
                            sb8.append(httpURLConnectionNewHttpURLConnection.getURL());
                            sb8.append(" - Using Cached response due to 304: ");
                            sb8.append(string$default3);
                            com.onesignal.debug.internal.logging.b.debug$default(sb8.toString(), null, 2, null);
                            i12 = responseCode;
                            try {
                                this.$retVal.f15466s = new p035d5.a(i12, string$default3, null, numRetryAfterFromResponse, numRetryLimitFromResponse, 4, null);
                            } catch (Throwable th6) {
                                th = th6;
                                th = th;
                                httpURLConnection = httpURLConnectionNewHttpURLConnection;
                                i11 = i12;
                                if (th instanceof ConnectException) {
                                    com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                                } else {
                                    com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                                }
                                this.$retVal.f15466s = new p035d5.a(i11, null, th, null, null, 24, null);
                            }
                        }
                        httpURLConnectionNewHttpURLConnection.disconnect();
                    } catch (Throwable th7) {
                        th = th7;
                        i12 = responseCode;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    i11 = i15;
                    if (th instanceof ConnectException) {
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    } else {
                        com.onesignal.debug.internal.logging.b.info$default("HttpClient: Could not send last request, device is offline. Throwable: ".concat(th.getClass().getName()), null, 2, null);
                    }
                    this.$retVal.f15466s = new p035d5.a(i11, null, th, null, null, 24, null);
                    return m.a;
                }
            }
            return m.a;
        }
    }

    public a(com.onesignal.core.internal.http.impl.c cVar, p093j5.b bVar, com.onesignal.core.internal.config.b bVar2, p110l5.a aVar, p025c5.d dVar) {
        p210v8.i.f(cVar, "_connectionFactory");
        p210v8.i.f(bVar, "_prefs");
        p210v8.i.f(bVar2, "_configModelStore");
        p210v8.i.f(aVar, "_time");
        p210v8.i.f(dVar, "_installIdService");
        this._connectionFactory = cVar;
        this._prefs = bVar;
        this._configModelStore = bVar2;
        this._time = aVar;
        this._installIdService = dVar;
    }

    private final int getThreadTimeout(int i10) {
        return i10 + 5000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logHTTPSent(String str, URL url, JSONObject jSONObject, Map<String, ? extends List<String>> map) {
        String strZ = k.Z(map.entrySet(), null, null, null, null, 63);
        if (str == null) {
            str = "GET";
        }
        com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Request Sent = " + str + ' ' + url + " - Body: " + (jSONObject != null ? f.INSTANCE.toUnescapedEUIDString(jSONObject) : null) + " - Headers: " + strZ, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object makeRequest(String str, String str2, JSONObject jSONObject, int i10, com.onesignal.core.internal.http.impl.d dVar, p123m8.d<? super p035d5.a> dVar2) {
        b bVar;
        JSONObject jSONObject2;
        int i11;
        com.onesignal.core.internal.http.impl.d dVar3;
        String str3;
        a aVar;
        String str4;
        a aVar2;
        TimeoutCancellationException timeoutCancellationException;
        String str5;
        Object objX;
        String str6 = str2;
        if (dVar2 instanceof b) {
            bVar = (b) dVar2;
            int i12 = bVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.label = i12 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar2);
            }
        } else {
            bVar = new b(dVar2);
        }
        Object obj = bVar.result;
        p134n8.a aVar3 = p134n8.a.f13404s;
        int i13 = bVar.label;
        try {
            try {
                if (i13 != 0) {
                    if (i13 == 1) {
                        int i14 = bVar.I$0;
                        com.onesignal.core.internal.http.impl.d dVar4 = (com.onesignal.core.internal.http.impl.d) bVar.L$4;
                        JSONObject jSONObject3 = (JSONObject) bVar.L$3;
                        String str7 = (String) bVar.L$2;
                        str4 = (String) bVar.L$1;
                        aVar2 = (a) bVar.L$0;
                        J7.a.v(obj);
                        i11 = i14;
                        jSONObject2 = jSONObject3;
                        dVar3 = dVar4;
                        str6 = str7;
                    } else {
                        if (i13 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str5 = (String) bVar.L$0;
                        try {
                            J7.a.v(obj);
                            return obj;
                        } catch (TimeoutCancellationException e10) {
                            timeoutCancellationException = e10;
                        }
                    }
                    com.onesignal.debug.internal.logging.b.error("HttpClient: Request timed out: " + str5, timeoutCancellationException);
                    return new p035d5.a(0, null, timeoutCancellationException, null, null, 24, null);
                }
                J7.a.v(obj);
                if (str6 != null) {
                    Boolean consentRequired = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getConsentRequired();
                    Boolean bool = Boolean.TRUE;
                    if (p210v8.i.a(consentRequired, bool) && !p210v8.i.a(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getConsentGiven(), bool)) {
                        com.onesignal.debug.internal.logging.b.warn$default(str6 + " `" + str + "` was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.privacyConsent", null, 2, null);
                        return new p035d5.a(0, null, null, null, null, 24, null);
                    }
                }
                long currentTimeMillis = this.delayNewRequestsUntil - this._time.getCurrentTimeMillis();
                if (currentTimeMillis > 0) {
                    bVar.L$0 = this;
                    bVar.L$1 = str;
                    bVar.L$2 = str6;
                    jSONObject2 = jSONObject;
                    bVar.L$3 = jSONObject2;
                    dVar3 = dVar;
                    bVar.L$4 = dVar3;
                    i11 = i10;
                    bVar.I$0 = i11;
                    bVar.label = 1;
                    if (AbstractC0342z.e(currentTimeMillis, bVar) != aVar3) {
                        str4 = str;
                        aVar2 = this;
                    }
                } else {
                    jSONObject2 = jSONObject;
                    i11 = i10;
                    dVar3 = dVar;
                    str3 = str;
                    aVar = this;
                    String str8 = str6;
                    JSONObject jSONObject4 = jSONObject2;
                    com.onesignal.core.internal.http.impl.d dVar5 = dVar3;
                    long threadTimeout = aVar.getThreadTimeout(i11);
                    c cVar = aVar.new c(str3, str8, jSONObject4, i11, dVar5, null);
                    bVar.L$0 = str3;
                    bVar.L$1 = null;
                    bVar.L$2 = null;
                    bVar.L$3 = null;
                    bVar.L$4 = null;
                    bVar.label = 2;
                    objX = AbstractC0342z.x(threadTimeout, cVar, bVar);
                    if (objX != aVar3) {
                        return objX;
                    }
                }
                return aVar3;
                long threadTimeout2 = aVar.getThreadTimeout(i11);
                c cVar2 = aVar.new c(str3, str8, jSONObject4, i11, dVar5, null);
                bVar.L$0 = str3;
                bVar.L$1 = null;
                bVar.L$2 = null;
                bVar.L$3 = null;
                bVar.L$4 = null;
                bVar.label = 2;
                objX = AbstractC0342z.x(threadTimeout2, cVar2, bVar);
                if (objX != aVar3) {
                    return aVar3;
                }
                return objX;
            } catch (TimeoutCancellationException e11) {
                timeoutCancellationException = e11;
                str5 = str3;
            }
            str3 = str4;
            aVar = aVar2;
            String str9 = str6;
            JSONObject jSONObject5 = jSONObject2;
            com.onesignal.core.internal.http.impl.d dVar6 = dVar3;
        } catch (Throwable th) {
            return new p035d5.a(0, null, th, null, null, 24, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object makeRequestIODispatcher(String str, String str2, JSONObject jSONObject, int i10, com.onesignal.core.internal.http.impl.d dVar, p123m8.d<? super p035d5.a> dVar2) {
        d dVar3;
        t tVar;
        if (dVar2 instanceof d) {
            dVar3 = (d) dVar2;
            int i11 = dVar3.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar3.label = i11 - Integer.MIN_VALUE;
            } else {
                dVar3 = new d(dVar2);
            }
        } else {
            dVar3 = new d(dVar2);
        }
        Object obj = dVar3.result;
        p134n8.a aVar = p134n8.a.f13404s;
        int i12 = dVar3.label;
        if (i12 == 0) {
            J7.a.v(obj);
            t tVar2 = new t();
            p123m8.i iVar = I.f3415c;
            e eVar = new e(str, i10, dVar, jSONObject, str2, tVar2, null);
            int i13 = 2 & 1;
            j jVar = j.f13164s;
            if (i13 != 0) {
                iVar = jVar;
            }
            p123m8.i iVarG = AbstractC0342z.g(jVar, iVar, true);
            U9.d dVar4 = I.a;
            if (iVarG != dVar4 && iVarG.get(p123m8.e.f13163s) == null) {
                iVarG = iVarG.plus(dVar4);
            }
            AbstractC0317a p0Var = new p0(iVarG, true);
            p0Var.Q(1, p0Var, eVar);
            dVar3.L$0 = tVar2;
            dVar3.label = 1;
            if (p0Var.E(dVar3) == aVar) {
                return aVar;
            }
            tVar = tVar2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = (t) dVar3.L$0;
            J7.a.v(obj);
        }
        Object obj2 = tVar.f15466s;
        p210v8.i.c(obj2);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryAfterFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        if (headerField != null) {
            com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Response Retry-After: ".concat(headerField), null, 2, null);
            Integer numZ = L9.m.z(headerField);
            return Integer.valueOf(numZ != null ? numZ.intValue() : ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpRetryAfterParseFailFallback());
        }
        if (httpURLConnection.getResponseCode() == 429) {
            return Integer.valueOf(((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpRetryAfterParseFailFallback());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer retryLimitFromResponse(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("OneSignal-Retry-Limit");
        if (headerField == null) {
            return null;
        }
        com.onesignal.debug.internal.logging.b.debug$default("HttpClient: Response OneSignal-Retry-Limit: ".concat(headerField), null, 2, null);
        return L9.m.z(headerField);
    }

    @Override // p035d5.c
    public Object delete(String str, com.onesignal.core.internal.http.impl.d dVar, p123m8.d<? super p035d5.a> dVar2) {
        return makeRequest(str, "DELETE", null, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, dVar2);
    }

    @Override // p035d5.c
    public Object get(String str, com.onesignal.core.internal.http.impl.d dVar, p123m8.d<? super p035d5.a> dVar2) {
        return makeRequest(str, null, null, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpGetTimeout(), dVar, dVar2);
    }

    @Override // p035d5.c
    public Object patch(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.d dVar, p123m8.d<? super p035d5.a> dVar2) {
        return makeRequest(str, "PATCH", jSONObject, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, dVar2);
    }

    @Override // p035d5.c
    public Object post(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.d dVar, p123m8.d<? super p035d5.a> dVar2) {
        return makeRequest(str, "POST", jSONObject, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, dVar2);
    }

    @Override // p035d5.c
    public Object put(String str, JSONObject jSONObject, com.onesignal.core.internal.http.impl.d dVar, p123m8.d<? super p035d5.a> dVar2) {
        return makeRequest(str, "PUT", jSONObject, ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getHttpTimeout(), dVar, dVar2);
    }
}
