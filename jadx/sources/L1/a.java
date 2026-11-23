package L1;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import o1.r;
import p188t1.Y;
import p232y1.j;

/* JADX INFO: loaded from: classes.dex */
public final class a implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p230x9.d f2733f = new p230x9.d(7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1.c f2734g = new C1.c(1);
    public final Context a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1.c f2736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p230x9.d f2737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f2738e;

    public a(Context context, ArrayList arrayList, B1.b bVar, B1.g gVar) {
        p230x9.d dVar = f2733f;
        this.a = context.getApplicationContext();
        this.f2735b = arrayList;
        this.f2737d = dVar;
        this.f2738e = new r(bVar, 5, gVar);
        this.f2736c = f2734g;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:25:0x0059
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // p232y1.j
    public final A1.F a(java.lang.Object r8, int r9, int r10, p232y1.h r11) {
        /*
            r7 = this;
            r2 = r8
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            C1.c r8 = r7.f2736c
            monitor-enter(r8)
            java.util.ArrayDeque r0 = r8.a     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L54
            x1.c r0 = (p223x1.c) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L15
            x1.c r0 = new x1.c     // Catch: java.lang.Throwable -> L17
            r0.<init>()     // Catch: java.lang.Throwable -> L17
        L15:
            r5 = r0
            goto L1b
        L17:
            r0 = move-exception
            r9 = r0
            r1 = r7
            goto L57
        L1b:
            r0 = 0
            r5.f15729b = r0     // Catch: java.lang.Throwable -> L54
            byte[] r0 = r5.a     // Catch: java.lang.Throwable -> L54
            r1 = 0
            java.util.Arrays.fill(r0, r1)     // Catch: java.lang.Throwable -> L54
            x1.b r0 = new x1.b     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            r5.f15730c = r0     // Catch: java.lang.Throwable -> L54
            r5.f15731d = r1     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r2.asReadOnlyBuffer()     // Catch: java.lang.Throwable -> L54
            r5.f15729b = r0     // Catch: java.lang.Throwable -> L54
            r0.position(r1)     // Catch: java.lang.Throwable -> L54
            java.nio.ByteBuffer r0 = r5.f15729b     // Catch: java.lang.Throwable -> L54
            java.nio.ByteOrder r1 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L54
            r0.order(r1)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r6 = r11
            J1.c r8 = r1.c(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L4c
            C1.c r9 = r1.f2736c
            r9.c(r5)
            return r8
        L4c:
            r0 = move-exception
            r8 = r0
            C1.c r9 = r1.f2736c
            r9.c(r5)
            throw r8
        L54:
            r0 = move-exception
            r1 = r7
        L56:
            r9 = r0
        L57:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L59
            throw r9
        L59:
            r0 = move-exception
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: L1.a.a(java.lang.Object, int, int, y1.h):A1.F");
    }

    @Override // p232y1.j
    public final boolean b(Object obj, p232y1.h hVar) {
        return !((Boolean) hVar.c(h.f2772b)).booleanValue() && Y.o(this.f2735b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    public final J1.c c(ByteBuffer byteBuffer, int i10, int i11, p223x1.c cVar, p232y1.h hVar) {
        boolean zIsLoggable;
        int i12 = U1.h.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            p223x1.b bVarB = cVar.b();
            if (bVarB.f15721c > 0 && bVarB.f15720b == 0) {
                Bitmap.Config config = hVar.c(h.a) == p232y1.a.f16011t ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(bVarB.f15725g / i11, bVarB.f15724f / i10);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                Log.isLoggable("BufferGifDecoder", 2);
                p230x9.d dVar = this.f2737d;
                r rVar = this.f2738e;
                dVar.getClass();
                p223x1.d dVar2 = new p223x1.d(rVar, bVarB, byteBuffer, iMax);
                dVar2.c(config);
                dVar2.f15740k = (dVar2.f15740k + 1) % dVar2.f15741l.f15721c;
                Bitmap bitmapB = dVar2.b();
                if (bitmapB != null) {
                    return new J1.c(new c(new b(new g(com.bumptech.glide.b.b(this.a), dVar2, i10, i11, bitmapB), 0)), 1);
                }
                if (zIsLoggable) {
                    return null;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
