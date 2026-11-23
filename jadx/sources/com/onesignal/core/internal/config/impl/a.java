package com.onesignal.core.internal.config.impl;

import com.onesignal.common.modeling.g;
import com.onesignal.common.modeling.j;
import p076h8.m;
import p123m8.d;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p100k5.b, g {
    public static final C0027a Companion = new C0027a(null);
    private static final int INCREASE_BETWEEN_RETRIES = 10000;
    private static final int MAX_WAIT_BETWEEN_RETRIES = 90000;
    private static final int MIN_WAIT_BETWEEN_RETRIES = 30000;
    private final com.onesignal.core.internal.config.b _configModelStore;
    private final Y4.b _paramsBackendService;
    private final p208v6.b _subscriptionManager;

    /* JADX INFO: renamed from: com.onesignal.core.internal.config.impl.a$a, reason: collision with other inner class name */
    public static final class C0027a {
        public /* synthetic */ C0027a(e eVar) {
            this();
        }

        private C0027a() {
        }
    }

    public static final class b extends p144o8.g implements p200u8.b {
        final /* synthetic */ String $appId;
        int I$0;
        int I$1;
        int label;
        final /* synthetic */ a this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, a aVar, d<? super b> dVar) {
            super(1, dVar);
            this.$appId = str;
            this.this$0 = aVar;
        }

        @Override // p144o8.a
        public final d<m> create(d<?> dVar) {
            return new b(this.$appId, this.this$0, dVar);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0063  */
        /* JADX WARN: Code duplicated, block: B:21:0x0072  */
        /* JADX WARN: Code duplicated, block: B:24:0x00d2 A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x00df A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x00ec A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00f9 A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x0106 A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x0113 A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x0120 A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x012d A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:48:0x013a A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x0147 A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x0158 A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x0169 A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:60:0x017e A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x0193 A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:66:0x01a8 A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:69:0x01bd A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:72:0x01d2 A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:75:0x01e7 A[Catch: BackendException -> 0x0029, TryCatch #1 {BackendException -> 0x0029, blocks: (B:22:0x0075, B:24:0x00d2, B:25:0x00d9, B:27:0x00df, B:28:0x00e6, B:30:0x00ec, B:31:0x00f3, B:33:0x00f9, B:34:0x0100, B:36:0x0106, B:37:0x010d, B:39:0x0113, B:40:0x011a, B:42:0x0120, B:43:0x0127, B:45:0x012d, B:46:0x0134, B:48:0x013a, B:49:0x0141, B:51:0x0147, B:52:0x0152, B:54:0x0158, B:55:0x015f, B:57:0x0169, B:58:0x0174, B:60:0x017e, B:61:0x0189, B:63:0x0193, B:64:0x019e, B:66:0x01a8, B:67:0x01b3, B:69:0x01bd, B:70:0x01c8, B:72:0x01d2, B:73:0x01dd, B:75:0x01e7, B:76:0x01f2, B:10:0x0025), top: B:95:0x0025 }] */
        /* JADX WARN: Code duplicated, block: B:92:0x0245 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x01fd -> B:91:0x0243). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x023e -> B:90:0x0241). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:36:0x0106
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p144o8.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 582
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.config.impl.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p200u8.b
        public final Object invoke(d<? super m> dVar) {
            return ((b) create(dVar)).invokeSuspend(m.a);
        }
    }

    public a(com.onesignal.core.internal.config.b bVar, Y4.b bVar2, p208v6.b bVar3) {
        i.f(bVar, "_configModelStore");
        i.f(bVar2, "_paramsBackendService");
        i.f(bVar3, "_subscriptionManager");
        this._configModelStore = bVar;
        this._paramsBackendService = bVar2;
        this._subscriptionManager = bVar3;
    }

    private final void fetchParams() {
        String appId = ((com.onesignal.core.internal.config.a) this._configModelStore.getModel()).getAppId();
        if (appId.length() == 0) {
            return;
        }
        com.onesignal.common.threading.a.suspendifyOnThread$default(0, new b(appId, this, null), 1, null);
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelUpdated(j jVar, String str) {
        i.f(jVar, "args");
        i.f(str, "tag");
        if (i.a(jVar.getProperty(), "appId")) {
            fetchParams();
        }
    }

    @Override // p100k5.b
    public void start() {
        this._configModelStore.subscribe((g) this);
        fetchParams();
    }

    @Override // com.onesignal.common.modeling.g
    public void onModelReplaced(com.onesignal.core.internal.config.a aVar, String str) {
        i.f(aVar, "model");
        i.f(str, "tag");
        if (str.equals("NORMAL")) {
            fetchParams();
        }
    }
}
