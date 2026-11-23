package p106l0;

import K3.b;
import R.a;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p212w.f;
import xa.d;
import za.c;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final Object j = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile g f12850k;
    public final ReentrantReadWriteLock a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f12851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f12852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f12853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f12854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f12855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f12856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f12857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f12858i;

    public g(n nVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.f12852c = 3;
        f fVar = (f) nVar.f2347b;
        this.f12855f = fVar;
        int i10 = nVar.a;
        this.f12857h = i10;
        this.f12858i = (c) nVar.f2348c;
        this.f12853d = new Handler(Looper.getMainLooper());
        this.f12851b = new f(0);
        this.f12856g = new c(22);
        b bVar = new b(this);
        this.f12854e = bVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f12852c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            try {
                fVar.a(new d(bVar));
            } catch (Throwable th2) {
                d(th2);
            }
        }
    }

    public static g a() {
        g gVar;
        synchronized (j) {
            try {
                gVar = f12850k;
                if (!(gVar != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gVar;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.f12852c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        if (!(this.f12857h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.f12852c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.f12852c = 0;
            this.a.writeLock().unlock();
            b bVar = this.f12854e;
            g gVar = (g) bVar.a;
            try {
                gVar.f12855f.a(new d(bVar));
            } catch (Throwable th) {
                gVar.d(th);
            }
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.f12852c = 2;
            arrayList.addAll(this.f12851b);
            this.f12851b.clear();
            this.a.writeLock().unlock();
            this.f12853d.post(new a(arrayList, this.f12852c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:94:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2 A[Catch: all -> 0x0085, TryCatch #0 {all -> 0x0085, blocks: (B:32:0x005d, B:35:0x0062, B:37:0x0066, B:39:0x0073, B:46:0x0092, B:48:0x009c, B:50:0x009f, B:52:0x00a2, B:54:0x00b2, B:55:0x00b5), top: B:94:0x005d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:85:0x0108  */
    public final CharSequence e(CharSequence charSequence, int i10, int i11) throws Throwable {
        Throwable th;
        CharSequence charSequence2;
        int i12;
        int i13;
        s[] sVarArr;
        int spanStart;
        if (!(b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        d.b("start should be <= than end", i10 <= i11);
        u uVar = null;
        if (charSequence == null) {
            return null;
        }
        d.b("start should be < than charSequence length", i10 <= charSequence.length());
        d.b("end should be < than charSequence length", i11 <= charSequence.length());
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        Y1.c cVar = (Y1.c) this.f12854e.f2577b;
        cVar.getClass();
        boolean z6 = charSequence instanceof q;
        if (z6) {
            ((q) charSequence).a();
        }
        if (z6) {
            uVar = new u((Spannable) charSequence);
            if (uVar != null) {
                for (s sVar : sVarArr) {
                    spanStart = uVar.f12890t.getSpanStart(sVar);
                    int spanEnd = uVar.f12890t.getSpanEnd(sVar);
                    if (spanStart != i11) {
                        uVar.removeSpan(sVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd, i11);
                }
            }
            i12 = i10;
            i13 = i11;
            if (i12 != i13) {
                charSequence2 = charSequence;
                if (!z6) {
                    return charSequence2;
                }
            } else {
                charSequence2 = charSequence;
                if (!z6) {
                    return charSequence2;
                }
            }
            ((q) charSequence2).b();
            return charSequence2;
        }
        try {
            if (charSequence instanceof Spannable) {
                try {
                    uVar = new u((Spannable) charSequence);
                } catch (Throwable th2) {
                    th = th2;
                    charSequence2 = charSequence;
                    th = th;
                    if (!z6) {
                        throw th;
                    }
                    ((q) charSequence2).b();
                    throw th;
                }
            } else if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i10 - 1, i11 + 1, s.class) <= i11) {
                uVar = new u();
                uVar.f12889s = false;
                uVar.f12890t = new SpannableString(charSequence);
            }
            if (uVar != null && (sVarArr = (s[]) uVar.f12890t.getSpans(i10, i11, s.class)) != null && sVarArr.length > 0) {
                while (i < r5) {
                    spanStart = uVar.f12890t.getSpanStart(sVar);
                    int spanEnd2 = uVar.f12890t.getSpanEnd(sVar);
                    if (spanStart != i11) {
                        uVar.removeSpan(sVar);
                    }
                    i10 = Math.min(spanStart, i10);
                    i11 = Math.max(spanEnd2, i11);
                }
            }
            i12 = i10;
            i13 = i11;
            if (i12 != i13 || i12 >= charSequence.length()) {
                charSequence2 = charSequence;
                if (!z6) {
                    return charSequence2;
                }
            } else {
                try {
                    charSequence2 = charSequence;
                    try {
                        u uVar2 = (u) cVar.I(charSequence2, i12, i13, Integer.MAX_VALUE, false, new o1.c(uVar, 16, (c) cVar.f5670t));
                        if (uVar2 != null) {
                            Spannable spannable = uVar2.f12890t;
                            if (z6) {
                                ((q) charSequence2).b();
                            }
                            return spannable;
                        }
                        if (!z6) {
                            return charSequence2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (!z6) {
                            throw th;
                        }
                        ((q) charSequence2).b();
                        throw th;
                    }
                } catch (Throwable th4) {
                    charSequence2 = charSequence;
                    th = th4;
                }
            }
            ((q) charSequence2).b();
            return charSequence2;
        } catch (Throwable th5) {
            th = th5;
            charSequence2 = charSequence;
        }
        if (!z6) {
            throw th;
        }
        ((q) charSequence2).b();
        throw th;
    }

    public final void f(e eVar) {
        d.d(eVar, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.f12852c == 1 || this.f12852c == 2) {
                this.f12853d.post(new a(Arrays.asList(eVar), this.f12852c, (Throwable) null));
            } else {
                this.f12851b.add(eVar);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
