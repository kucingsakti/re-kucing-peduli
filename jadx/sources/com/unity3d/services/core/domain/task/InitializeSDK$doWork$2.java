package com.unity3d.services.core.domain.task;

import N9.InterfaceC0341y;
import kotlin.Metadata;
import p076h8.h;
import p076h8.m;
import p123m8.d;
import p144o8.e;
import p144o8.g;
import p200u8.c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LN9/y;", "Lh8/h;", "Lh8/m;", "<anonymous>", "(LN9/y;)Lh8/h;"}, k = 3, mv = {1, 8, 0})
@e(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", l = {43, 48, 50, 55, 57, 62, 66, 69, 74, 77, 92, 95, 103, 106, 109}, m = "invokeSuspend")
public final class InitializeSDK$doWork$2 extends g implements c {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializeSDK$doWork$2(InitializeSDK initializeSDK, d<? super InitializeSDK$doWork$2> dVar) {
        super(2, dVar);
        this.this$0 = initializeSDK;
    }

    @Override // p144o8.a
    public final d<m> create(Object obj, d<?> dVar) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, dVar);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    @Override // p200u8.c
    public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super h> dVar) {
        return ((InitializeSDK$doWork$2) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x027a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0280 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0298  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a0 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02ac A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02b7 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x02c1 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:121:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:124:0x0303 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0317  */
    /* JADX WARN: Code duplicated, block: B:128:0x0323 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x034a  */
    /* JADX WARN: Code duplicated, block: B:133:0x034b  */
    /* JADX WARN: Code duplicated, block: B:136:0x0351 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0363  */
    /* JADX WARN: Code duplicated, block: B:139:0x0364 A[Catch: all -> 0x001c, CancellationException -> 0x001f, PHI: r0 r2
      0x0364: PHI (r0v53 java.lang.Object) = (r0v51 java.lang.Object), (r0v51 java.lang.Object), (r0v56 java.lang.Object) binds: [B:135:0x034f, B:137:0x0361, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0364: PHI (r2v35 com.unity3d.services.core.domain.task.InitializeSDK) = 
      (r2v32 com.unity3d.services.core.domain.task.InitializeSDK)
      (r2v32 com.unity3d.services.core.domain.task.InitializeSDK)
      (r2v38 com.unity3d.services.core.domain.task.InitializeSDK)
     binds: [B:135:0x034f, B:137:0x0361, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0387 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0398  */
    /* JADX WARN: Code duplicated, block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x007c A[PHI: r0 r2 r5 r6 r11
      0x007c: PHI (r0v33 com.unity3d.services.core.configuration.Configuration) = 
      (r0v30 com.unity3d.services.core.configuration.Configuration)
      (r0v39 com.unity3d.services.core.configuration.Configuration)
     binds: [B:100:0x0278, B:29:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r2v21 java.lang.Object) = (r2v19 java.lang.Object), (r2v23 java.lang.Object) binds: [B:100:0x0278, B:29:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r5v26 com.unity3d.services.core.domain.task.InitializeSDK) = 
      (r5v23 com.unity3d.services.core.domain.task.InitializeSDK)
      (r5v28 com.unity3d.services.core.domain.task.InitializeSDK)
     binds: [B:100:0x0278, B:29:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r6v18 N9.y) = (r6v15 N9.y), (r6v20 N9.y) binds: [B:100:0x0278, B:29:0x0075] A[DONT_GENERATE, DONT_INLINE]
      0x007c: PHI (r11v46 java.lang.Object) = (r11v45 java.lang.Object), (r11v59 java.lang.Object) binds: [B:100:0x0278, B:29:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fe A[PHI: r0 r2 r5 r11
      0x00fe: PHI (r0v9 com.unity3d.services.core.configuration.Configuration) = 
      (r0v6 com.unity3d.services.core.configuration.Configuration)
      (r0v15 com.unity3d.services.core.configuration.Configuration)
     binds: [B:65:0x0181, B:48:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r2v5 com.unity3d.services.core.domain.task.InitializeSDK) = (r2v2 com.unity3d.services.core.domain.task.InitializeSDK), (r2v8 com.unity3d.services.core.domain.task.InitializeSDK) binds: [B:65:0x0181, B:48:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r5v8 N9.y) = (r5v5 N9.y), (r5v12 N9.y) binds: [B:65:0x0181, B:48:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00fe: PHI (r11v17 java.lang.Object) = (r11v13 java.lang.Object), (r11v21 java.lang.Object) binds: [B:65:0x0181, B:48:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x014c A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0168  */
    /* JADX WARN: Code duplicated, block: B:66:0x0183  */
    /* JADX WARN: Code duplicated, block: B:69:0x0189 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x019e  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a6 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b2 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d4 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x01eb A[Catch: all -> 0x001c, CancellationException -> 0x001f, PHI: r0 r2 r5 r6
      0x01eb: PHI (r0v23 com.unity3d.services.core.configuration.Configuration) = 
      (r0v20 com.unity3d.services.core.configuration.Configuration)
      (r0v20 com.unity3d.services.core.configuration.Configuration)
      (r0v25 com.unity3d.services.core.configuration.Configuration)
     binds: [B:81:0x01d2, B:83:0x01e7, B:39:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r2v13 java.lang.Object) = (r2v9 java.lang.Object), (r2v9 java.lang.Object), (r2v14 java.lang.Object) binds: [B:81:0x01d2, B:83:0x01e7, B:39:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r5v17 com.unity3d.services.core.domain.task.InitializeSDK) = 
      (r5v13 com.unity3d.services.core.domain.task.InitializeSDK)
      (r5v13 com.unity3d.services.core.domain.task.InitializeSDK)
      (r5v19 com.unity3d.services.core.domain.task.InitializeSDK)
     binds: [B:81:0x01d2, B:83:0x01e7, B:39:0x00c2] A[DONT_GENERATE, DONT_INLINE]
      0x01eb: PHI (r6v9 N9.y) = (r6v7 N9.y), (r6v7 N9.y), (r6v11 N9.y) binds: [B:81:0x01d2, B:83:0x01e7, B:39:0x00c2] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x01f5 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0215  */
    /* JADX WARN: Code duplicated, block: B:90:0x0217 A[Catch: all -> 0x001c, CancellationException -> 0x001f, PHI: r0 r2 r5 r6 r11
      0x0217: PHI (r0v26 com.unity3d.services.core.configuration.Configuration) = 
      (r0v23 com.unity3d.services.core.configuration.Configuration)
      (r0v29 com.unity3d.services.core.configuration.Configuration)
     binds: [B:88:0x0213, B:36:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r2v15 java.lang.Object) = (r2v13 java.lang.Object), (r2v18 java.lang.Object) binds: [B:88:0x0213, B:36:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r5v20 com.unity3d.services.core.domain.task.InitializeSDK) = 
      (r5v17 com.unity3d.services.core.domain.task.InitializeSDK)
      (r5v22 com.unity3d.services.core.domain.task.InitializeSDK)
     binds: [B:88:0x0213, B:36:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r6v12 N9.y) = (r6v9 N9.y), (r6v14 N9.y) binds: [B:88:0x0213, B:36:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0217: PHI (r11v34 java.lang.Object) = (r11v33 java.lang.Object), (r11v40 java.lang.Object) binds: [B:88:0x0213, B:36:0x00ab] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x021b A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x023a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0241 A[Catch: all -> 0x001c, CancellationException -> 0x001f, TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0257  */
    /* JADX WARN: Code duplicated, block: B:99:0x0259 A[Catch: all -> 0x001c, CancellationException -> 0x001f, PHI: r0 r2 r5 r6
      0x0259: PHI (r0v30 com.unity3d.services.core.configuration.Configuration) = 
      (r0v23 com.unity3d.services.core.configuration.Configuration)
      (r0v26 com.unity3d.services.core.configuration.Configuration)
      (r0v32 com.unity3d.services.core.configuration.Configuration)
     binds: [B:86:0x01f3, B:97:0x0255, B:32:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r2v19 java.lang.Object) = (r2v13 java.lang.Object), (r2v15 java.lang.Object), (r2v20 java.lang.Object) binds: [B:86:0x01f3, B:97:0x0255, B:32:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r5v23 com.unity3d.services.core.domain.task.InitializeSDK) = 
      (r5v17 com.unity3d.services.core.domain.task.InitializeSDK)
      (r5v20 com.unity3d.services.core.domain.task.InitializeSDK)
      (r5v25 com.unity3d.services.core.domain.task.InitializeSDK)
     binds: [B:86:0x01f3, B:97:0x0255, B:32:0x008f] A[DONT_GENERATE, DONT_INLINE]
      0x0259: PHI (r6v15 N9.y) = (r6v9 N9.y), (r6v12 N9.y), (r6v17 N9.y) binds: [B:86:0x01f3, B:97:0x0255, B:32:0x008f] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {CancellationException -> 0x001f, all -> 0x001c, blocks: (B:6:0x0013, B:142:0x0381, B:143:0x0384, B:13:0x0028, B:139:0x0364, B:16:0x0033, B:134:0x034d, B:136:0x0351, B:19:0x0044, B:127:0x0318, B:130:0x0329, B:22:0x004f, B:122:0x02ff, B:124:0x0303, B:26:0x005d, B:107:0x029a, B:109:0x02a0, B:110:0x02ab, B:29:0x0075, B:102:0x027c, B:104:0x0280, B:111:0x02ac, B:113:0x02b7, B:115:0x02c1, B:117:0x02c7, B:118:0x02d9, B:128:0x0323, B:144:0x0387, B:145:0x038e, B:32:0x008f, B:99:0x0259, B:33:0x0094, B:95:0x023c, B:36:0x00ab, B:90:0x0217, B:92:0x021b, B:96:0x0241, B:39:0x00c2, B:85:0x01eb, B:87:0x01f5, B:42:0x00d3, B:80:0x01d0, B:82:0x01d4, B:45:0x00e1, B:72:0x01a0, B:74:0x01a6, B:75:0x01b1, B:48:0x00f7, B:67:0x0185, B:69:0x0189, B:76:0x01b2, B:51:0x010b, B:58:0x0146, B:60:0x014c, B:61:0x015f, B:64:0x0169, B:54:0x011c), top: B:156:0x0008 }] */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x037e, code lost:
    
        if (r11 == r1) goto L141;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x014c, please report this as an issue */
    @Override // p144o8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeSDK$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
