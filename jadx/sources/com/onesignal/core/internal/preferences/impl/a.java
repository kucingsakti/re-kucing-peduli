package com.onesignal.core.internal.preferences.impl;

import N9.AbstractC0342z;
import N9.C;
import N9.D;
import N9.I;
import N9.InterfaceC0341y;
import X4.f;
import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p076h8.m;
import p086i8.y;
import p123m8.d;
import p123m8.j;
import p144o8.g;
import p200u8.c;
import p210v8.e;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p093j5.b, p100k5.b {
    public static final C0032a Companion = new C0032a(null);
    private static final int WRITE_CALL_DELAY_TO_BUFFER_MS = 200;
    private final f _applicationService;
    private final p110l5.a _time;
    private final Map<String, Map<String, Object>> prefsToApply;
    private C queueJob;
    private final com.onesignal.common.threading.b waiter;

    /* JADX INFO: renamed from: com.onesignal.core.internal.preferences.impl.a$a, reason: collision with other inner class name */
    public static final class C0032a {
        public /* synthetic */ C0032a(e eVar) {
            this();
        }

        private C0032a() {
        }
    }

    public static final class b extends g implements c {
        long J$0;
        int label;

        public b(d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // p144o8.a
        public final d<m> create(Object obj, d<?> dVar) {
            return a.this.new b(dVar);
        }

        @Override // p200u8.c
        public final Object invoke(InterfaceC0341y interfaceC0341y, d<? super m> dVar) {
            return ((b) create(interfaceC0341y, dVar)).invokeSuspend(m.a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0045 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:7:0x000e, B:17:0x0031, B:18:0x003f, B:20:0x0045, B:22:0x0062, B:23:0x006c, B:24:0x0070, B:48:0x00d2, B:49:0x00d3, B:50:0x00d8, B:51:0x00d9, B:52:0x00da, B:61:0x00fe, B:14:0x001f, B:25:0x0071, B:26:0x0079, B:28:0x007f, B:30:0x008d, B:33:0x0095, B:35:0x0099, B:36:0x00a3, B:38:0x00a7, B:39:0x00b1, B:41:0x00b5, B:42:0x00bf, B:44:0x00c3, B:46:0x00cb, B:47:0x00cf), top: B:65:0x0006, inners: #1 }] */
        /* JADX WARN: Code duplicated, block: B:28:0x007f A[Catch: all -> 0x0093, TryCatch #1 {all -> 0x0093, blocks: (B:25:0x0071, B:26:0x0079, B:28:0x007f, B:30:0x008d, B:33:0x0095, B:35:0x0099, B:36:0x00a3, B:38:0x00a7, B:39:0x00b1, B:41:0x00b5, B:42:0x00bf, B:44:0x00c3, B:46:0x00cb, B:47:0x00cf), top: B:67:0x0071, outer: #0 }] */
        /* JADX WARN: Code duplicated, block: B:67:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:69:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:72:0x00fd A[EDGE_INSN: B:72:0x00fd->B:60:0x00fd BREAK  A[LOOP:0: B:17:0x0031->B:71:0x0031], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:74:? A[PHI: r4
          PHI (r4v2 long) = (r4v3 long), (r4v1 long), (r4v8 long), (r4v10 long) binds: [B:64:0x010f, B:62:0x010c, B:16:0x0024, B:7:0x000e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x006c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:77:0x0062 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x0095 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x00a3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:84:0x008d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:85:0x0099 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:86:0x00b1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:87:0x00a7 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x00bf A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x00b5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:90:0x00c9 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x00c3 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x00cb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:94:0x0079 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x010c -> B:17:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:87:0x00a7
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // p144o8.a
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 280
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.core.internal.preferences.impl.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(f fVar, p110l5.a aVar) {
        i.f(fVar, "_applicationService");
        i.f(aVar, "_time");
        this._applicationService = fVar;
        this._time = aVar;
        this.prefsToApply = y.w(new p076h8.f("OneSignal", new LinkedHashMap()), new p076h8.f("GTPlayerPurchases", new LinkedHashMap()));
        this.waiter = new com.onesignal.common.threading.b();
    }

    private final C doWorkAsync() {
        p123m8.i iVar = I.f3415c;
        c bVar = new b(null);
        int i10 = 2 & 1;
        j jVar = j.f13164s;
        if (i10 != 0) {
            iVar = jVar;
        }
        p123m8.i iVarG = AbstractC0342z.g(jVar, iVar, true);
        U9.d dVar = I.a;
        if (iVarG != dVar && iVarG.get(p123m8.e.f13163s) == null) {
            iVarG = iVarG.plus(dVar);
        }
        D d3 = new D(iVarG, true);
        d3.Q(1, d3, bVar);
        return d3;
    }

    private final Object get(String str, String str2, Class<?> cls, Object obj) throws Exception {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception(E0.a.h("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        i.c(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            Object obj2 = map2.get(str2);
            if (obj2 != null || map2.containsKey(str2)) {
                return obj2;
            }
            SharedPreferences sharedPrefsByName = getSharedPrefsByName(str);
            if (sharedPrefsByName != null) {
                try {
                    if (i.a(cls, String.class)) {
                        return sharedPrefsByName.getString(str2, (String) obj);
                    }
                    if (i.a(cls, Boolean.TYPE)) {
                        Boolean bool = (Boolean) obj;
                        return Boolean.valueOf(sharedPrefsByName.getBoolean(str2, bool != null ? bool.booleanValue() : false));
                    }
                    if (i.a(cls, Integer.TYPE)) {
                        Integer num = (Integer) obj;
                        return Integer.valueOf(sharedPrefsByName.getInt(str2, num != null ? num.intValue() : 0));
                    }
                    if (i.a(cls, Long.TYPE)) {
                        Long l4 = (Long) obj;
                        return Long.valueOf(sharedPrefsByName.getLong(str2, l4 != null ? l4.longValue() : 0L));
                    }
                    if (i.a(cls, Set.class)) {
                        return sharedPrefsByName.getStringSet(str2, (Set) obj);
                    }
                    return null;
                } catch (Exception unused) {
                }
            }
            if (i.a(cls, String.class)) {
                return (String) obj;
            }
            if (i.a(cls, Boolean.TYPE)) {
                Boolean bool2 = (Boolean) obj;
                return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
            }
            if (i.a(cls, Integer.TYPE)) {
                Integer num2 = (Integer) obj;
                return Integer.valueOf(num2 != null ? num2.intValue() : 0);
            }
            if (i.a(cls, Long.TYPE)) {
                Long l10 = (Long) obj;
                return Long.valueOf(l10 != null ? l10.longValue() : 0L);
            }
            if (i.a(cls, Set.class)) {
                return (Set) obj;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized SharedPreferences getSharedPrefsByName(String str) {
        return this._applicationService.getAppContext().getSharedPreferences(str, 0);
    }

    private final void save(String str, String str2, Object obj) throws Exception {
        if (!this.prefsToApply.containsKey(str)) {
            throw new Exception(E0.a.h("Store not found: ", str));
        }
        Map<String, Object> map = this.prefsToApply.get(str);
        i.c(map);
        Map<String, Object> map2 = map;
        synchronized (map2) {
            map2.put(str2, obj);
        }
        this.waiter.wake();
    }

    @Override // p093j5.b
    public Boolean getBool(String str, String str2, Boolean bool) {
        i.f(str, "store");
        i.f(str2, "key");
        return (Boolean) get(str, str2, Boolean.TYPE, bool);
    }

    @Override // p093j5.b
    public Integer getInt(String str, String str2, Integer num) {
        i.f(str, "store");
        i.f(str2, "key");
        return (Integer) get(str, str2, Integer.TYPE, num);
    }

    @Override // p093j5.b
    public Long getLong(String str, String str2, Long l4) {
        i.f(str, "store");
        i.f(str2, "key");
        return (Long) get(str, str2, Long.TYPE, l4);
    }

    @Override // p093j5.b
    public String getString(String str, String str2, String str3) {
        i.f(str, "store");
        i.f(str2, "key");
        return (String) get(str, str2, String.class, str3);
    }

    @Override // p093j5.b
    public Set<String> getStringSet(String str, String str2, Set<String> set) {
        i.f(str, "store");
        i.f(str2, "key");
        return (Set) get(str, str2, Set.class, set);
    }

    @Override // p093j5.b
    public void saveBool(String str, String str2, Boolean bool) throws Exception {
        i.f(str, "store");
        i.f(str2, "key");
        save(str, str2, bool);
    }

    @Override // p093j5.b
    public void saveInt(String str, String str2, Integer num) throws Exception {
        i.f(str, "store");
        i.f(str2, "key");
        save(str, str2, num);
    }

    @Override // p093j5.b
    public void saveLong(String str, String str2, Long l4) throws Exception {
        i.f(str, "store");
        i.f(str2, "key");
        save(str, str2, l4);
    }

    @Override // p093j5.b
    public void saveString(String str, String str2, String str3) throws Exception {
        i.f(str, "store");
        i.f(str2, "key");
        save(str, str2, str3);
    }

    @Override // p093j5.b
    public void saveStringSet(String str, String str2, Set<String> set) throws Exception {
        i.f(str, "store");
        i.f(str2, "key");
        save(str, str2, set);
    }

    @Override // p100k5.b
    public void start() {
        this.queueJob = doWorkAsync();
    }
}
