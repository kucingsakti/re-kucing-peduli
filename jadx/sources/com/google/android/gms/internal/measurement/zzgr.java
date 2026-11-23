package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.content.Context;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zzgr implements zzgp {
    public /* synthetic */ S a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ String f8649b;

    /* JADX WARN: Code duplicated, block: B:45:0x00fa A[Catch: all -> 0x003a, DONT_GENERATE, TryCatch #3 {all -> 0x003a, blocks: (B:5:0x0011, B:7:0x0017, B:13:0x0067, B:15:0x0072, B:18:0x007d, B:20:0x007f, B:22:0x0084, B:24:0x008c, B:26:0x0090, B:27:0x0092, B:28:0x009f, B:30:0x00a5, B:31:0x00cd, B:33:0x00d3, B:35:0x00db, B:36:0x00de, B:37:0x00e3, B:38:0x00e5, B:40:0x00ed, B:43:0x00f8, B:45:0x00fa, B:47:0x00fc, B:48:0x00ff, B:10:0x003d, B:12:0x0045), top: B:78:0x0011 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.gms.internal.measurement.zzgc] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final Object a() {
        ContentResolver contentResolver = ((Context) this.a.f8359t).getContentResolver();
        zzfz zzfzVar = zzfv.a;
        String str = this.f8649b;
        if (contentResolver == null) {
            zzfzVar.getClass();
            throw new IllegalStateException("ContentResolver needed with GservicesDelegateSupplier.init()");
        }
        synchronized (zzfzVar) {
            try {
                if (zzfzVar.f8631b == null) {
                    zzfzVar.a.set(false);
                    zzfzVar.f8631b = new HashMap(16, 1.0f);
                    zzfzVar.f8636g = new Object();
                    contentResolver.registerContentObserver(zzfy.a, true, new O(zzfzVar, 0));
                } else if (zzfzVar.a.getAndSet(false)) {
                    zzfzVar.f8631b.clear();
                    zzfzVar.f8632c.clear();
                    zzfzVar.f8633d.clear();
                    zzfzVar.f8634e.clear();
                    zzfzVar.f8635f.clear();
                    zzfzVar.f8636g = new Object();
                    zzfzVar.f8637h = false;
                }
                Object obj = zzfzVar.f8636g;
                String str2 = null;
                if (zzfzVar.f8631b.containsKey(str)) {
                    String str3 = (String) zzfzVar.f8631b.get(str);
                    return str3 != null ? str3 : null;
                }
                try {
                    for (String str4 : zzfzVar.f8638i) {
                        if (str.startsWith(str4)) {
                            if (!zzfzVar.f8637h) {
                                try {
                                    HashMap map = (HashMap) zzfzVar.j.b(contentResolver, zzfzVar.f8638i, new zzgd() { // from class: com.google.android.gms.internal.measurement.zzgc
                                    });
                                    if (!map.isEmpty()) {
                                        Set setKeySet = map.keySet();
                                        setKeySet.removeAll(zzfzVar.f8632c.keySet());
                                        setKeySet.removeAll(zzfzVar.f8633d.keySet());
                                        setKeySet.removeAll(zzfzVar.f8634e.keySet());
                                        setKeySet.removeAll(zzfzVar.f8635f.keySet());
                                    }
                                    if (!map.isEmpty()) {
                                        if (zzfzVar.f8631b.isEmpty()) {
                                            zzfzVar.f8631b = map;
                                        } else {
                                            zzfzVar.f8631b.putAll(map);
                                        }
                                    }
                                    zzfzVar.f8637h = true;
                                } catch (zzgf unused) {
                                }
                                if (zzfzVar.f8631b.containsKey(str)) {
                                    String str5 = (String) zzfzVar.f8631b.get(str);
                                    str2 = str5 != null ? str5 : null;
                                }
                            }
                        }
                    }
                    String strA = zzfzVar.j.a(contentResolver, str);
                    if (strA != null && strA.equals(null)) {
                        strA = null;
                    }
                    synchronized (zzfzVar) {
                        try {
                            if (obj == zzfzVar.f8636g) {
                                zzfzVar.f8631b.put(str, strA);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return strA != null ? strA : str2;
                } catch (zzgf unused2) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
