package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.common.exceptions.BackendException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h implements p064g5.d {
    public static final a Companion = new a(null);
    public static final String REFRESH_USER = "refresh-user";
    private final p142o6.a _buildUserService;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final p162q6.b _identityModelStore;
    private final p193t6.a _newRecordState;
    private final com.onesignal.user.internal.properties.b _propertiesModelStore;
    private final p208v6.e _subscriptionsModelStore;
    private final p132n6.d _userBackend;

    public static final class a {
        public /* synthetic */ a(p210v8.e eVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends p144o8.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public b(p123m8.d<? super b> dVar) {
            super(dVar);
        }

        @Override // p144o8.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return h.this.getUser(null, this);
        }
    }

    public h(p132n6.d dVar, p162q6.b bVar, com.onesignal.user.internal.properties.b bVar2, p208v6.e eVar, com.onesignal.core.internal.config.b bVar3, p142o6.a aVar, p193t6.a aVar2) {
        p210v8.i.f(dVar, "_userBackend");
        p210v8.i.f(bVar, "_identityModelStore");
        p210v8.i.f(bVar2, "_propertiesModelStore");
        p210v8.i.f(eVar, "_subscriptionsModelStore");
        p210v8.i.f(bVar3, "_configModelStore");
        p210v8.i.f(aVar, "_buildUserService");
        p210v8.i.f(aVar2, "_newRecordState");
        this._userBackend = dVar;
        this._identityModelStore = bVar;
        this._propertiesModelStore = bVar2;
        this._subscriptionsModelStore = eVar;
        this._configModelStore = bVar3;
        this._buildUserService = aVar;
        this._newRecordState = aVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:106:0x0274 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0276  */
    /* JADX WARN: Code duplicated, block: B:109:0x0279  */
    /* JADX WARN: Code duplicated, block: B:110:0x0288  */
    /* JADX WARN: Code duplicated, block: B:118:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:121:0x02da  */
    /* JADX WARN: Code duplicated, block: B:122:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:131:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0128 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x016f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0090 A[Catch: BackendException -> 0x0038, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a0 A[Catch: BackendException -> 0x0038, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[Catch: BackendException -> 0x0038, LOOP:0: B:31:0x00b1->B:33:0x00b7, LOOP_END, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ee A[Catch: BackendException -> 0x0038, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0103 A[Catch: BackendException -> 0x0038, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0118 A[Catch: BackendException -> 0x0038, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x012e A[Catch: BackendException -> 0x0038, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0157 A[Catch: BackendException -> 0x0038, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0175 A[Catch: BackendException -> 0x0038, TRY_LEAVE, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0192  */
    /* JADX WARN: Code duplicated, block: B:60:0x019e A[Catch: BackendException -> 0x0038, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01a3 A[Catch: BackendException -> 0x0038, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x01af A[Catch: BackendException -> 0x0038, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01c7 A[Catch: BackendException -> 0x0038, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01ca A[Catch: BackendException -> 0x0038, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x01cd A[Catch: BackendException -> 0x0038, TryCatch #1 {BackendException -> 0x0038, blocks: (B:13:0x0034, B:26:0x0078, B:28:0x0090, B:30:0x00a0, B:31:0x00b1, B:33:0x00b7, B:34:0x00c9, B:36:0x00ee, B:37:0x00f9, B:39:0x0103, B:40:0x010e, B:42:0x0118, B:43:0x0128, B:45:0x012e, B:47:0x013a, B:48:0x014d, B:50:0x0157, B:51:0x0162, B:52:0x016f, B:54:0x0175, B:58:0x0193, B:60:0x019e, B:62:0x01a9, B:64:0x01af, B:65:0x01b1, B:68:0x01c7, B:71:0x01cf, B:73:0x01da, B:77:0x01e5, B:80:0x01ef, B:83:0x01f9, B:86:0x0203, B:90:0x020e, B:92:0x0219, B:69:0x01ca, B:70:0x01cd, B:61:0x01a3, B:93:0x021e, B:95:0x022c, B:97:0x0236, B:98:0x0239), top: B:126:0x0034 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:85:0x0202  */
    /* JADX WARN: Code duplicated, block: B:88:0x020c  */
    /* JADX WARN: Code duplicated, block: B:89:0x020d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object getUser(p173r6.h hVar, p123m8.d<? super p064g5.a> dVar) {
        b bVar;
        p173r6.h hVar2;
        h hVar3;
        p173r6.h hVar4;
        int i10;
        p132n6.a aVar;
        p162q6.a aVar2;
        com.onesignal.user.internal.properties.a aVar3;
        ArrayList arrayList;
        String pushSubscriptionId;
        p208v6.d dVar2;
        p208v6.d dVar3;
        String token;
        String str;
        Integer notificationTypes;
        int value;
        p208v6.f fVarFromInt;
        int i11;
        p208v6.g gVar;
        boolean z6;
        String sdk;
        String deviceOS;
        String carrier;
        String appVersion;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i12 = bVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.label = i12 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        b bVar2 = bVar;
        Object user = bVar2.result;
        p134n8.a aVar4 = p134n8.a.f13404s;
        int i13 = bVar2.label;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar4 = (p173r6.h) bVar2.L$1;
            hVar3 = (h) bVar2.L$0;
            try {
                J7.a.v(user);
                aVar = (p132n6.a) user;
                if (!p210v8.i.a(hVar4.getOnesignalId(), ((p162q6.a) hVar3._identityModelStore.getModel()).getOnesignalId())) {
                    return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
                }
                aVar2 = new p162q6.a();
                for (Map.Entry<String, String> entry : aVar.getIdentities().entrySet()) {
                    aVar2.put(entry.getKey(), entry.getValue());
                }
                aVar2.setJwtToken(((p162q6.a) hVar3._identityModelStore.getModel()).getJwtToken());
                aVar3 = new com.onesignal.user.internal.properties.a();
                aVar3.setOnesignalId(hVar4.getOnesignalId());
                if (aVar.getProperties().getCountry() != null) {
                    aVar3.setCountry(aVar.getProperties().getCountry());
                }
                if (aVar.getProperties().getLanguage() != null) {
                    aVar3.setLanguage(aVar.getProperties().getLanguage());
                }
                if (aVar.getProperties().getTags() != null) {
                    for (Map.Entry<String, String> entry2 : aVar.getProperties().getTags().entrySet()) {
                        if (entry2.getValue() != null) {
                            com.onesignal.common.modeling.h tags = aVar3.getTags();
                            String key = entry2.getKey();
                            String value2 = entry2.getValue();
                            p210v8.i.c(value2);
                            tags.put(key, value2);
                        }
                    }
                }
                if (aVar.getProperties().getTimezoneId() != null) {
                    aVar3.setTimezone(aVar.getProperties().getTimezoneId());
                }
                arrayList = new ArrayList();
                for (p132n6.h hVar5 : aVar.getSubscriptions()) {
                    dVar3 = new p208v6.d();
                    String id = hVar5.getId();
                    p210v8.i.c(id);
                    dVar3.setId(id);
                    token = hVar5.getToken();
                    str = "";
                    if (token == null) {
                        token = "";
                    }
                    dVar3.setAddress(token);
                    v6.f.a aVar5 = p208v6.f.Companion;
                    notificationTypes = hVar5.getNotificationTypes();
                    if (notificationTypes != null) {
                        value = notificationTypes.intValue();
                    } else {
                        value = p208v6.f.SUBSCRIBED.getValue();
                    }
                    fVarFromInt = aVar5.fromInt(value);
                    if (fVarFromInt == null) {
                        fVarFromInt = p208v6.f.SUBSCRIBED;
                    }
                    dVar3.setStatus(fVarFromInt);
                    p132n6.j type = hVar5.getType();
                    p210v8.i.c(type);
                    i11 = i.$EnumSwitchMapping$0[type.ordinal()];
                    if (i11 != 1) {
                        gVar = p208v6.g.EMAIL;
                    } else if (i11 != 2) {
                        gVar = p208v6.g.PUSH;
                    } else {
                        gVar = p208v6.g.SMS;
                    }
                    dVar3.setType(gVar);
                    if (dVar3.getStatus() != p208v6.f.UNSUBSCRIBE || dVar3.getStatus() == p208v6.f.DISABLED_FROM_REST_API_DEFAULT_REASON) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    dVar3.setOptedIn(z6);
                    sdk = hVar5.getSdk();
                    if (sdk == null) {
                        sdk = "";
                    }
                    dVar3.setSdk(sdk);
                    deviceOS = hVar5.getDeviceOS();
                    if (deviceOS == null) {
                        deviceOS = "";
                    }
                    dVar3.setDeviceOS(deviceOS);
                    carrier = hVar5.getCarrier();
                    if (carrier == null) {
                        carrier = "";
                    }
                    dVar3.setCarrier(carrier);
                    appVersion = hVar5.getAppVersion();
                    if (appVersion == null) {
                        str = appVersion;
                    }
                    dVar3.setAppVersion(str);
                    if (dVar3.getType() != p208v6.g.PUSH) {
                        arrayList.add(dVar3);
                    }
                }
                pushSubscriptionId = ((com.onesignal.core.internal.config.a) hVar3._configModelStore.getModel()).getPushSubscriptionId();
                if (pushSubscriptionId != null && (dVar2 = (p208v6.d) hVar3._subscriptionsModelStore.get(pushSubscriptionId)) != null) {
                    arrayList.add(dVar2);
                }
                hVar3._identityModelStore.replace(aVar2, "HYDRATE");
                hVar3._propertiesModelStore.replace(aVar3, "HYDRATE");
                hVar3._subscriptionsModelStore.replaceAll(arrayList, "HYDRATE");
                return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
            } catch (BackendException e10) {
                e = e10;
                i10 = i.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i10 != 1) {
                    return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i10 != 2) {
                    return new p064g5.a(p064g5.b.FAIL_UNAUTHORIZED, null, null, null, 14, null);
                }
                if (i10 != 3) {
                    return new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (e.getStatusCode() != 404) {
                }
                List<p064g5.g> rebuildOperationsIfCurrentUser = hVar3._buildUserService.getRebuildOperationsIfCurrentUser(hVar4.getAppId(), hVar4.getOnesignalId());
                return rebuildOperationsIfCurrentUser == null ? new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null) : new p064g5.a(p064g5.b.FAIL_RETRY, null, rebuildOperationsIfCurrentUser, e.getRetryAfterSeconds(), 2, null);
            }
        }
        J7.a.v(user);
        try {
            p076h8.f identityAlias = this._identityModelStore.getIdentityAlias();
            p132n6.d dVar4 = this._userBackend;
            String appId = hVar.getAppId();
            String str2 = (String) identityAlias.f11789s;
            String str3 = (String) identityAlias.f11790t;
            String jwtToken = ((p162q6.a) this._identityModelStore.getModel()).getJwtToken();
            bVar2.L$0 = this;
            hVar2 = hVar;
            try {
                bVar2.L$1 = hVar2;
                bVar2.label = 1;
                user = dVar4.getUser(appId, str2, str3, jwtToken, bVar2);
                if (user == aVar4) {
                    return aVar4;
                }
                hVar3 = this;
                hVar4 = hVar2;
                aVar = (p132n6.a) user;
                if (!p210v8.i.a(hVar4.getOnesignalId(), ((p162q6.a) hVar3._identityModelStore.getModel()).getOnesignalId())) {
                    return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
                }
                aVar2 = new p162q6.a();
                while (r6.hasNext()) {
                    aVar2.put(entry.getKey(), entry.getValue());
                }
                aVar2.setJwtToken(((p162q6.a) hVar3._identityModelStore.getModel()).getJwtToken());
                aVar3 = new com.onesignal.user.internal.properties.a();
                aVar3.setOnesignalId(hVar4.getOnesignalId());
                if (aVar.getProperties().getCountry() != null) {
                    aVar3.setCountry(aVar.getProperties().getCountry());
                }
                if (aVar.getProperties().getLanguage() != null) {
                    aVar3.setLanguage(aVar.getProperties().getLanguage());
                }
                if (aVar.getProperties().getTags() != null) {
                    while (r7.hasNext()) {
                        if (entry2.getValue() != null) {
                            com.onesignal.common.modeling.h tags2 = aVar3.getTags();
                            String key2 = entry2.getKey();
                            String value3 = entry2.getValue();
                            p210v8.i.c(value3);
                            tags2.put(key2, value3);
                        }
                    }
                }
                if (aVar.getProperties().getTimezoneId() != null) {
                    aVar3.setTimezone(aVar.getProperties().getTimezoneId());
                }
                arrayList = new ArrayList();
                while (r0.hasNext()) {
                    dVar3 = new p208v6.d();
                    String id2 = hVar5.getId();
                    p210v8.i.c(id2);
                    dVar3.setId(id2);
                    token = hVar5.getToken();
                    str = "";
                    if (token == null) {
                        token = "";
                    }
                    dVar3.setAddress(token);
                    v6.f.a aVar6 = p208v6.f.Companion;
                    notificationTypes = hVar5.getNotificationTypes();
                    if (notificationTypes != null) {
                        value = notificationTypes.intValue();
                    } else {
                        value = p208v6.f.SUBSCRIBED.getValue();
                    }
                    fVarFromInt = aVar6.fromInt(value);
                    if (fVarFromInt == null) {
                        fVarFromInt = p208v6.f.SUBSCRIBED;
                    }
                    dVar3.setStatus(fVarFromInt);
                    p132n6.j type2 = hVar5.getType();
                    p210v8.i.c(type2);
                    i11 = i.$EnumSwitchMapping$0[type2.ordinal()];
                    if (i11 != 1) {
                        gVar = p208v6.g.EMAIL;
                    } else if (i11 != 2) {
                        gVar = p208v6.g.PUSH;
                    } else {
                        gVar = p208v6.g.SMS;
                    }
                    dVar3.setType(gVar);
                    if (dVar3.getStatus() != p208v6.f.UNSUBSCRIBE) {
                        z6 = false;
                    } else {
                        z6 = false;
                    }
                    dVar3.setOptedIn(z6);
                    sdk = hVar5.getSdk();
                    if (sdk == null) {
                        sdk = "";
                    }
                    dVar3.setSdk(sdk);
                    deviceOS = hVar5.getDeviceOS();
                    if (deviceOS == null) {
                        deviceOS = "";
                    }
                    dVar3.setDeviceOS(deviceOS);
                    carrier = hVar5.getCarrier();
                    if (carrier == null) {
                        carrier = "";
                    }
                    dVar3.setCarrier(carrier);
                    appVersion = hVar5.getAppVersion();
                    if (appVersion == null) {
                        str = appVersion;
                    }
                    dVar3.setAppVersion(str);
                    if (dVar3.getType() != p208v6.g.PUSH) {
                        arrayList.add(dVar3);
                    }
                }
                pushSubscriptionId = ((com.onesignal.core.internal.config.a) hVar3._configModelStore.getModel()).getPushSubscriptionId();
                if (pushSubscriptionId != null) {
                    arrayList.add(dVar2);
                }
                hVar3._identityModelStore.replace(aVar2, "HYDRATE");
                hVar3._propertiesModelStore.replace(aVar3, "HYDRATE");
                hVar3._subscriptionsModelStore.replaceAll(arrayList, "HYDRATE");
                return new p064g5.a(p064g5.b.SUCCESS, null, null, null, 14, null);
            } catch (BackendException e11) {
                e = e11;
                hVar3 = this;
                hVar4 = hVar2;
                i10 = i.$EnumSwitchMapping$1[com.onesignal.common.g.INSTANCE.getResponseStatusType(e.getStatusCode()).ordinal()];
                if (i10 != 1) {
                    return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                if (i10 != 2) {
                    return new p064g5.a(p064g5.b.FAIL_UNAUTHORIZED, null, null, null, 14, null);
                }
                if (i10 != 3) {
                    return new p064g5.a(p064g5.b.FAIL_NORETRY, null, null, null, 14, null);
                }
                if (e.getStatusCode() != 404 && hVar3._newRecordState.isInMissingRetryWindow(hVar4.getOnesignalId())) {
                    return new p064g5.a(p064g5.b.FAIL_RETRY, null, null, e.getRetryAfterSeconds(), 6, null);
                }
                List<p064g5.g> rebuildOperationsIfCurrentUser2 = hVar3._buildUserService.getRebuildOperationsIfCurrentUser(hVar4.getAppId(), hVar4.getOnesignalId());
                if (rebuildOperationsIfCurrentUser2 == null) {
                }
            }
        } catch (BackendException e12) {
            e = e12;
            hVar2 = hVar;
        }
    }

    @Override // p064g5.d
    public Object execute(List<? extends p064g5.g> list, p123m8.d<? super p064g5.a> dVar) throws Exception {
        com.onesignal.debug.internal.logging.b.log(p131n5.b.DEBUG, "RefreshUserOperationExecutor(operation: " + list + ')');
        List<? extends p064g5.g> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                if (!(((p064g5.g) it.next()) instanceof p173r6.h)) {
                    throw new Exception("Unrecognized operation(s)! Attempted operations:\n" + list);
                }
            }
        }
        p064g5.g gVar = (p064g5.g) p086i8.k.T(list);
        if (gVar instanceof p173r6.h) {
            return getUser((p173r6.h) gVar, dVar);
        }
        throw new Exception("Unrecognized operation: " + gVar);
    }

    @Override // p064g5.d
    public List<String> getOperations() {
        return com.bumptech.glide.d.u(REFRESH_USER);
    }
}
