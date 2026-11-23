package p140o4;

import B4.AbstractC0158f;
import B4.B;
import B4.InterfaceC0155c;
import K9.n;
import L8.InterfaceC0271e;
import L8.InterfaceC0290y;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.webkit.PermissionRequest;
import android.widget.ProgressBar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.AbstractC0487g;
import androidx.fragment.app.b;
import androidx.fragment.app.f;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.kcstream.cing.MainApp;
import com.tonyodev.fetch2.database.DownloadDatabase_Impl;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import org.chromium.net.UrlRequest;
import p.b1;
import p014b2.A;
import p014b2.AbstractC0556u;
import p014b2.C;
import p014b2.C0537a;
import p014b2.C0538b;
import p014b2.C0539c;
import p014b2.C0540d;
import p014b2.C0541e;
import p014b2.C0543g;
import p014b2.C0544h;
import p014b2.C0545i;
import p014b2.C0546j;
import p014b2.C0547k;
import p014b2.C0548l;
import p014b2.C0550n;
import p014b2.C0551o;
import p014b2.C0552p;
import p014b2.C0553q;
import p014b2.C0554s;
import p014b2.C0555t;
import p014b2.D;
import p014b2.E;
import p014b2.F;
import p014b2.H;
import p014b2.I;
import p014b2.J;
import p014b2.K;
import p014b2.L;
import p014b2.M;
import p014b2.N;
import p014b2.O;
import p014b2.P;
import p014b2.Q;
import p014b2.S;
import p014b2.T;
import p014b2.U;
import p014b2.V;
import p014b2.y;
import p020ba.e;
import p020ba.i;
import p029c9.k;
import p029c9.l;
import p030ca.d;
import p048ea.a;
import p086i8.g;
import p086i8.h;
import y0.C0864b;
import y0.u;
import y0.x;
import y0.z;
import za.c;

/* JADX INFO: loaded from: classes.dex */
public final class r implements InterfaceC0155c, k {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static r f13778x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f13779y = new c(26);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static volatile r f13780z;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f13781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f13782t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f13783u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f13784v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f13785w;

    public r(B b3, List list, PermissionRequest permissionRequest, String[] strArr) {
        this.f13781s = 1;
        this.f13785w = b3;
        this.f13782t = list;
        this.f13783u = permissionRequest;
        this.f13784v = strArr;
    }

    public static synchronized r n() {
        try {
            if (f13778x == null) {
                f13778x = new r(0);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13778x;
    }

    public Bundle A(String str, Bundle bundle) {
        HashMap map = (HashMap) this.f13784v;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void B(IOException iOException) {
        ((e) this.f13783u).c(iOException);
        p020ba.k kVarH = ((d) this.f13784v).h();
        i iVar = (i) this.f13782t;
        synchronized (kVarH) {
            try {
                p210v8.i.f(iVar, "call");
                if (!(iOException instanceof StreamResetException)) {
                    if (!(kVarH.f7400g != null) || (iOException instanceof ConnectionShutdownException)) {
                        kVarH.j = true;
                        if (kVarH.f7405m == 0) {
                            p020ba.k.d(iVar.f7387s, kVarH.f7395b, iOException);
                            kVarH.f7404l++;
                        }
                    }
                } else if (((StreamResetException) iOException).f13841s == a.REFUSED_STREAM) {
                    int i10 = kVarH.f7406n + 1;
                    kVarH.f7406n = i10;
                    if (i10 > 1) {
                        kVarH.j = true;
                        kVarH.f7404l++;
                    }
                } else if (((StreamResetException) iOException).f13841s != a.CANCEL || !iVar.f7384E) {
                    kVarH.j = true;
                    kVarH.f7404l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void C() {
        Iterator it = ((ArrayList) this.f13785w).iterator();
        while (it.hasNext()) {
            int i10 = ((u) it.next()).a;
            if (h(i10) == null) {
                int i11 = x.f15993B;
                StringBuilder sbM = AbstractC0487g.m("Navigation destination ", p068ga.d.m((Context) this.f13782t, i10), " cannot be found in the navigation graph ");
                sbM.append((z) this.f13784v);
                throw new IllegalArgumentException(sbM.toString());
            }
        }
    }

    public String a() {
        if (((Y1.a) this.f13783u) == null) {
            ((CountDownLatch) this.f13784v).await();
        }
        Y1.a aVar = (Y1.a) this.f13783u;
        if (aVar != null) {
            return aVar.f5665c;
        }
        return null;
    }

    public void b(b bVar) {
        if (((ArrayList) this.f13782t).contains(bVar)) {
            throw new IllegalStateException("Fragment already added: " + bVar);
        }
        synchronized (((ArrayList) this.f13782t)) {
            ((ArrayList) this.f13782t).add(bVar);
        }
        bVar.f6612D = true;
    }

    public String c() throws InterruptedException {
        if (((Y1.a) this.f13783u) == null) {
            ((CountDownLatch) this.f13784v).await();
        }
        Y1.a aVar = (Y1.a) this.f13783u;
        if (aVar != null) {
            return aVar.f5666d;
        }
        return null;
    }

    public void d(Y1.c cVar) {
        long j;
        long j10;
        long j11;
        byte b3;
        long j12;
        byte b7;
        long j13;
        p014b2.x xVar = (p014b2.x) cVar.f5670t;
        int i10 = 33;
        int i11 = 5;
        int i12 = 27;
        int i13 = 31;
        int i14 = 16;
        ArrayList arrayList = new ArrayList(new g(new AbstractC0556u[]{(D) xVar.f7307o.getValue(), (E) xVar.f7308p.getValue(), (S) xVar.f7309q.getValue(), (Q) xVar.f7310r.getValue(), (F) xVar.f7311s.getValue(), (M) xVar.f7312t.getValue(), (A) xVar.f7313u.getValue(), (C0544h) xVar.f7315w.getValue(), (C0545i) xVar.f7314v.getValue(), (p014b2.z) xVar.f7317y.getValue(), (C0537a) xVar.f7318z.getValue(), (C0548l) xVar.f7268A.getValue(), (C0546j) xVar.f7316x.getValue(), (C0541e) xVar.f7269B.getValue(), (K) xVar.f7270C.getValue(), (C) xVar.f7271D.getValue(), (p014b2.r) xVar.f7272E.getValue(), (L) xVar.f7274G.getValue(), (C0547k) xVar.f7273F.getValue(), (C0539c) xVar.f7276I.getValue(), (C0553q) xVar.f7277J.getValue(), (U) xVar.f7278K.getValue(), (V) xVar.f7279L.getValue(), (C0538b) xVar.f7280M.getValue(), (C0551o) xVar.f7281N.getValue(), (T) xVar.f7282O.getValue(), (C0540d) xVar.P.getValue(), (C0550n) xVar.f7283Q.getValue(), (C0554s) xVar.f7284R.getValue(), (y) xVar.f7285S.getValue(), (J) xVar.f7286T.getValue(), (O) xVar.f7287U.getValue(), (p014b2.B) xVar.f7288V.getValue(), (C0555t) xVar.f7289W.getValue(), (I) xVar.f7290X.getValue(), (C0543g) xVar.f7291Y.getValue(), (H) xVar.f7292Z.getValue(), (P) xVar.f7295b0.getValue(), (C0552p) xVar.f7293a0.getValue()}, true));
        arrayList.add((N) xVar.f7275H.getValue());
        String strZ = p086i8.k.Z(arrayList, "", null, null, Y1.b.f5667s, 30);
        byte[] bytes = strZ.getBytes(L9.a.f2842b);
        p210v8.i.e(bytes, "this as java.lang.String).getBytes(charset)");
        int length = strZ.length();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bytes);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        long jRotateLeft = 0;
        long jRotateLeft2 = 0;
        while (true) {
            j = 5545529020109919103L;
            if (byteBufferWrap.remaining() < i14) {
                break;
            }
            long j14 = byteBufferWrap.getLong();
            long j15 = byteBufferWrap.getLong();
            int i15 = i12;
            long j16 = i11;
            jRotateLeft = ((Long.rotateLeft(jRotateLeft ^ (Long.rotateLeft(j14 * (-8663945395140668459L), i13) * 5545529020109919103L), i15) + jRotateLeft2) * j16) + ((long) 1390208809);
            jRotateLeft2 = ((Long.rotateLeft(jRotateLeft2 ^ (Long.rotateLeft(5545529020109919103L * j15, i10) * (-8663945395140668459L)), 31) + jRotateLeft) * j16) + ((long) 944331445);
            i12 = i15;
            i10 = 33;
            i11 = 5;
            i13 = 31;
            i14 = 16;
        }
        byteBufferWrap.compact();
        byteBufferWrap.flip();
        if (byteBufferWrap.remaining() > 0) {
            switch (byteBufferWrap.remaining()) {
                case 1:
                    jRotateLeft = jRotateLeft;
                    j = 5545529020109919103L;
                    j10 = ((long) byteBufferWrap.get(0)) & 255;
                    j13 = 0;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case 2:
                    j11 = (((long) byteBufferWrap.get(1)) & 255) << 8;
                    b3 = byteBufferWrap.get(0);
                    j10 = j11 ^ (((long) b3) & 255);
                    j13 = 0;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case 3:
                    j11 = ((((long) byteBufferWrap.get(2)) & 255) << 16) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b3 = byteBufferWrap.get(0);
                    j10 = j11 ^ (((long) b3) & 255);
                    j13 = 0;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case 4:
                    j12 = (((((long) byteBufferWrap.get(3)) & 255) << 24) ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b7 = byteBufferWrap.get(0);
                    j10 = (((long) b7) & 255) ^ j12;
                    j = 5545529020109919103L;
                    j13 = 0;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case 5:
                    j12 = ((((((long) byteBufferWrap.get(4)) & 255) << 32) ^ ((((long) byteBufferWrap.get(3)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b7 = byteBufferWrap.get(0);
                    j10 = (((long) b7) & 255) ^ j12;
                    j = 5545529020109919103L;
                    j13 = 0;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case 6:
                    j12 = (((((((long) byteBufferWrap.get(5)) & 255) << 40) ^ ((((long) byteBufferWrap.get(4)) & 255) << 32)) ^ ((((long) byteBufferWrap.get(3)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b7 = byteBufferWrap.get(0);
                    j10 = (((long) b7) & 255) ^ j12;
                    j = 5545529020109919103L;
                    j13 = 0;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case 7:
                    j12 = ((((((((long) byteBufferWrap.get(6)) & 255) << 48) ^ ((((long) byteBufferWrap.get(5)) & 255) << 40)) ^ ((((long) byteBufferWrap.get(4)) & 255) << 32)) ^ ((((long) byteBufferWrap.get(3)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(2)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(1)) & 255) << 8);
                    b7 = byteBufferWrap.get(0);
                    j10 = (((long) b7) & 255) ^ j12;
                    j = 5545529020109919103L;
                    j13 = 0;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case 8:
                    jRotateLeft = jRotateLeft;
                    j10 = byteBufferWrap.getLong();
                    j = 5545529020109919103L;
                    j13 = 0;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case 9:
                    j13 = ((long) byteBufferWrap.get(8)) & 255;
                    j10 = byteBufferWrap.getLong();
                    j = 5545529020109919103L;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case 10:
                    j13 = ((((long) byteBufferWrap.get(9)) & 255) << 8) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j10 = byteBufferWrap.getLong();
                    j = 5545529020109919103L;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case 11:
                    j13 = (((((long) byteBufferWrap.get(10)) & 255) << 16) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j10 = byteBufferWrap.getLong();
                    j = 5545529020109919103L;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                    j13 = ((((((long) byteBufferWrap.get(11)) & 255) << 24) ^ ((((long) byteBufferWrap.get(10)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j10 = byteBufferWrap.getLong();
                    j = 5545529020109919103L;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                    j13 = (((((((long) byteBufferWrap.get(12)) & 255) << 32) ^ ((((long) byteBufferWrap.get(11)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(10)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j10 = byteBufferWrap.getLong();
                    j = 5545529020109919103L;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    j13 = ((((((((long) byteBufferWrap.get(13)) & 255) << 40) ^ ((((long) byteBufferWrap.get(12)) & 255) << 32)) ^ ((((long) byteBufferWrap.get(11)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(10)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j10 = byteBufferWrap.getLong();
                    j = 5545529020109919103L;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                case 15:
                    j13 = (((((((((long) byteBufferWrap.get(14)) & 255) << 48) ^ ((((long) byteBufferWrap.get(13)) & 255) << 40)) ^ ((((long) byteBufferWrap.get(12)) & 255) << 32)) ^ ((((long) byteBufferWrap.get(11)) & 255) << 24)) ^ ((((long) byteBufferWrap.get(10)) & 255) << 16)) ^ ((((long) byteBufferWrap.get(9)) & 255) << 8)) ^ (((long) byteBufferWrap.get(8)) & 255);
                    j10 = byteBufferWrap.getLong();
                    j = 5545529020109919103L;
                    jRotateLeft ^= Long.rotateLeft(j10 * (-8663945395140668459L), 31) * j;
                    jRotateLeft2 ^= Long.rotateLeft(j13 * j, 33) * (-8663945395140668459L);
                    break;
                default:
                    throw new AssertionError("Code should not reach here!");
            }
        }
        long j17 = length;
        long j18 = jRotateLeft ^ j17;
        long j19 = j17 ^ jRotateLeft2;
        long j20 = j18 + j19;
        long j21 = j19 + j20;
        long j22 = (j20 ^ (j20 >>> 33)) * (-49064778989728563L);
        long j23 = (j22 ^ (j22 >>> 33)) * (-4265267296055464877L);
        long j24 = (j21 ^ (j21 >>> 33)) * (-49064778989728563L);
        long j25 = (j24 ^ (j24 >>> 33)) * (-4265267296055464877L);
        long j26 = j25 ^ (j25 >>> 33);
        long j27 = (j23 ^ (j23 >>> 33)) + j26;
        long[] jArr = {j27, j26 + j27};
        StringBuilder sb = new StringBuilder();
        for (int i16 = 0; i16 < 2; i16++) {
            sb.append(Long.toHexString(jArr[i16]));
        }
        String string = sb.toString();
        p210v8.i.e(string, "hashSb.toString()");
        this.f13782t = string;
        ((CountDownLatch) this.f13784v).countDown();
    }

    public IOException e(boolean z6, boolean z10, IOException iOException) {
        if (iOException != null) {
            B(iOException);
        }
        i iVar = (i) this.f13782t;
        if (z10) {
            if (iOException != null) {
                p210v8.i.f(iVar, "call");
            } else {
                p210v8.i.f(iVar, "call");
            }
        }
        if (z6) {
            if (iOException != null) {
                p210v8.i.f(iVar, "call");
            } else {
                p210v8.i.f(iVar, "call");
            }
        }
        return iVar.j(this, z10, z6, iOException);
    }

    public I.N f() {
        z zVar = (z) this.f13784v;
        if (zVar == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        ArrayList arrayList = (ArrayList) this.f13785w;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        x xVar = null;
        while (true) {
            boolean zHasNext = it.hasNext();
            Context context = (Context) this.f13782t;
            int i10 = 0;
            if (!zHasNext) {
                int[] iArrR0 = p086i8.k.r0(arrayList2);
                Intent intent = (Intent) this.f13783u;
                intent.putExtra("android-support-nav:controller:deepLinkIds", iArrR0);
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                I.N n10 = new I.N(context);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(n10.f1959t.getPackageManager());
                }
                if (component != null) {
                    n10.d(component);
                }
                ArrayList arrayList4 = n10.f1958s;
                arrayList4.add(intent2);
                int size = arrayList4.size();
                while (i10 < size) {
                    Intent intent3 = (Intent) arrayList4.get(i10);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                    i10++;
                }
                return n10;
            }
            u uVar = (u) it.next();
            int i11 = uVar.a;
            x xVarH = h(i11);
            if (xVarH == null) {
                int i12 = x.f15993B;
                throw new IllegalArgumentException("Navigation destination " + p068ga.d.m(context, i11) + " cannot be found in the navigation graph " + zVar);
            }
            int[] iArrF = xVarH.f(xVar);
            int length = iArrF.length;
            while (i10 < length) {
                arrayList2.add(Integer.valueOf(iArrF[i10]));
                arrayList3.add(uVar.f15984b);
                i10++;
            }
            xVar = xVarH;
        }
    }

    public b g(String str) {
        f fVar = (f) ((HashMap) this.f13783u).get(str);
        if (fVar != null) {
            return fVar.f6701c;
        }
        return null;
    }

    public x h(int i10) {
        h hVar = new h();
        z zVar = (z) this.f13784v;
        p210v8.i.c(zVar);
        hVar.k(zVar);
        while (!hVar.isEmpty()) {
            x xVar = (x) hVar.v();
            if (xVar.f16002z == i10) {
                return xVar;
            }
            if (xVar instanceof z) {
                y0.y yVar = new y0.y((z) xVar);
                while (yVar.hasNext()) {
                    hVar.k((x) yVar.next());
                }
            }
        }
        return null;
    }

    public b i(String str) {
        for (f fVar : ((HashMap) this.f13783u).values()) {
            if (fVar != null) {
                b bVarI = fVar.f6701c;
                if (!str.equals(bVarI.f6655x)) {
                    bVarI = bVarI.P.f6677c.i(str);
                }
                if (bVarI != null) {
                    return bVarI;
                }
            }
        }
        return null;
    }

    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : ((HashMap) this.f13783u).values()) {
            if (fVar != null) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    public ArrayList k() {
        ArrayList arrayList = new ArrayList();
        for (f fVar : ((HashMap) this.f13783u).values()) {
            if (fVar != null) {
                arrayList.add(fVar.f6701c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public InterfaceC0271e l(p096j9.b bVar, List list) {
        p210v8.i.f(bVar, "classId");
        return (InterfaceC0271e) ((p247z9.e) this.f13785w).invoke(new L8.A(bVar, list));
    }

    public List m() {
        ArrayList arrayList;
        if (((ArrayList) this.f13782t).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f13782t)) {
            arrayList = new ArrayList((ArrayList) this.f13782t);
        }
        return arrayList;
    }

    @Override // p029c9.k
    public void o() {
        ((b1) this.f13783u).o();
        ((ArrayList) ((o1.h) this.f13784v).f13632s).add(new p145o9.a((M8.b) p086i8.k.k0((ArrayList) this.f13785w)));
    }

    @Override // p029c9.k
    public void p(p096j9.f fVar, Object obj) {
        ((b1) this.f13782t).p(fVar, obj);
    }

    @Override // p029c9.k
    public l q(p096j9.f fVar) {
        return ((b1) this.f13782t).q(fVar);
    }

    @Override // p029c9.k
    public void r(p096j9.f fVar, p145o9.f fVar2) {
        ((b1) this.f13782t).r(fVar, fVar2);
    }

    @Override // p029c9.k
    public void s(p096j9.f fVar, p096j9.b bVar, p096j9.f fVar2) {
        ((b1) this.f13782t).s(fVar, bVar, fVar2);
    }

    @Override // p029c9.k
    public k t(p096j9.b bVar, p096j9.f fVar) {
        return ((b1) this.f13782t).t(bVar, fVar);
    }

    public String toString() throws InterruptedException {
        String strA;
        switch (this.f13781s) {
            case 10:
                StringBuilder sb = new StringBuilder();
                sb.append(p086i8.C.a(p086i8.C.c("4266B1DF03E6C08E82355513F10D34748389EEA252D8360F55EBA11D3BA7631E")));
                sb.append(a() == null ? p086i8.C.a(p086i8.C.c("4D")) : a());
                sb.append(p086i8.C.a(p086i8.C.c("422EDE894AA585E7C635020D9F447510D1C4ECBA11")));
                sb.append(c() == null ? p086i8.C.a(p086i8.C.c("4D")) : c());
                sb.append(p086i8.C.a(p086i8.C.c("422EDE894AA585E7C6350901954A7126D3DBA7EE47E0615F00A0")));
                String str = (String) this.f13782t;
                CountDownLatch countDownLatch = (CountDownLatch) this.f13784v;
                if (str == null) {
                    countDownLatch.await();
                }
                String str2 = (String) this.f13782t;
                if (str2 == null) {
                    strA = p086i8.C.a(p086i8.C.c("4D"));
                } else {
                    if (str2 == null) {
                        countDownLatch.await();
                    }
                    strA = (String) this.f13782t;
                }
                sb.append(strA);
                sb.append(p086i8.C.a(p086i8.C.c("4208")));
                String string = sb.toString();
                p210v8.i.e(string, p086i8.C.a(p086i8.C.c("0277BDC50EE0D7E992783C1C89447A338B80")));
                return string;
            default:
                return super.toString();
        }
    }

    @Override // B4.InterfaceC0155c
    public void u(String[] strArr, Bundle bundle) {
        boolean zIsEmpty = AbstractC0158f.d(((B) this.f13785w).f610h, (String[]) ((List) this.f13782t).toArray(new String[0])).isEmpty();
        PermissionRequest permissionRequest = (PermissionRequest) this.f13783u;
        if (zIsEmpty) {
            permissionRequest.grant((String[]) this.f13784v);
        } else {
            permissionRequest.deny();
        }
    }

    public boolean v(Context context) {
        if (((Boolean) this.f13784v) == null) {
            this.f13784v = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!((Boolean) this.f13783u).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.f13784v).booleanValue();
    }

    public boolean w(Context context) {
        if (((Boolean) this.f13783u) == null) {
            this.f13783u = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!((Boolean) this.f13783u).booleanValue()) {
            Log.isLoggable("FirebaseMessaging", 3);
        }
        return ((Boolean) this.f13783u).booleanValue();
    }

    public void x(f fVar) {
        b bVar = fVar.f6701c;
        String str = bVar.f6655x;
        HashMap map = (HashMap) this.f13783u;
        if (map.get(str) != null) {
            return;
        }
        map.put(bVar.f6655x, fVar);
        if (bVar.f6631X) {
            if (bVar.f6630W) {
                ((p156q0.N) this.f13785w).d(bVar);
            } else {
                ((p156q0.N) this.f13785w).f(bVar);
            }
            bVar.f6631X = false;
        }
        if (androidx.fragment.app.e.K(2)) {
            bVar.toString();
        }
    }

    public void y(f fVar) {
        b bVar = fVar.f6701c;
        if (bVar.f6630W) {
            ((p156q0.N) this.f13785w).f(bVar);
        }
        HashMap map = (HashMap) this.f13783u;
        if (map.get(bVar.f6655x) == fVar && ((f) map.put(bVar.f6655x, null)) != null && androidx.fragment.app.e.K(2)) {
            bVar.toString();
        }
    }

    public X9.K z(boolean z6) throws IOException {
        try {
            X9.K kE = ((d) this.f13784v).e(z6);
            if (kE == null) {
                return kE;
            }
            kE.f5524m = this;
            return kE;
        } catch (IOException e10) {
            p210v8.i.f((i) this.f13782t, "call");
            B(e10);
            throw e10;
        }
    }

    public r(y0.B b3) {
        Intent launchIntentForPackage;
        this.f13781s = 11;
        Context context = b3.a;
        this.f13782t = context;
        Activity activity = (Activity) n.v(n.A(n.x(context, C0864b.f15909y), C0864b.f15910z));
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f13783u = launchIntentForPackage;
        this.f13785w = new ArrayList();
        this.f13784v = b3.h();
    }

    public r(MainApp mainApp) {
        this.f13781s = 10;
        this.f13784v = new CountDownLatch(2);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f13785w = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new D4.a(mainApp, this));
    }

    public r(p247z9.l lVar, InterfaceC0290y interfaceC0290y) {
        this.f13781s = 3;
        p210v8.i.f(interfaceC0290y, "module");
        this.f13782t = lVar;
        this.f13783u = interfaceC0290y;
        this.f13784v = lVar.b(new L8.C(this, 1));
        this.f13785w = lVar.b(new L8.C(this, 0));
    }

    public r(Context context, Y1.c cVar) {
        Object iVar;
        this.f13781s = 8;
        p210v8.i.f(context, "context");
        Context applicationContext = context.getApplicationContext();
        p210v8.i.e(applicationContext, "context.applicationContext");
        p117m1.a aVar = new p117m1.a(applicationContext, cVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        p210v8.i.e(applicationContext2, "context.applicationContext");
        p117m1.a aVar2 = new p117m1.a(applicationContext2, cVar, 1);
        Context applicationContext3 = context.getApplicationContext();
        p210v8.i.e(applicationContext3, "context.applicationContext");
        int i10 = p117m1.h.a;
        if (Build.VERSION.SDK_INT >= 24) {
            iVar = new p117m1.g(applicationContext3, cVar);
        } else {
            iVar = new p117m1.i(applicationContext3, cVar);
        }
        Context applicationContext4 = context.getApplicationContext();
        p210v8.i.e(applicationContext4, "context.applicationContext");
        p117m1.a aVar3 = new p117m1.a(applicationContext4, cVar, 2);
        this.f13782t = aVar;
        this.f13783u = aVar2;
        this.f13784v = iVar;
        this.f13785w = aVar3;
    }

    public r(CoordinatorLayout coordinatorLayout, ProgressBar progressBar, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.f13781s = 2;
        this.f13782t = coordinatorLayout;
        this.f13783u = progressBar;
        this.f13784v = recyclerView;
        this.f13785w = materialToolbar;
    }

    public r(i iVar, e eVar, d dVar) {
        this.f13781s = 5;
        p210v8.i.f(iVar, "call");
        p210v8.i.f(eVar, "finder");
        this.f13782t = iVar;
        this.f13783u = eVar;
        this.f13784v = dVar;
        this.f13785w = dVar.h();
    }

    public r(DownloadDatabase_Impl downloadDatabase_Impl) {
        this.f13781s = 7;
        this.f13783u = new K3.d(22);
        this.f13782t = downloadDatabase_Impl;
        new p085i7.a(this, downloadDatabase_Impl);
        this.f13784v = new p085i7.b(downloadDatabase_Impl, 0);
        this.f13785w = new p085i7.c(this, downloadDatabase_Impl);
        new p085i7.d(downloadDatabase_Impl, 0);
    }

    public r(int i10) {
        this.f13781s = i10;
        switch (i10) {
            case 4:
                this.f13782t = new p212w.e(0);
                this.f13783u = new SparseArray();
                this.f13784v = new p212w.g();
                this.f13785w = new p212w.e(0);
                break;
            case 9:
                this.f13782t = new ArrayList();
                this.f13783u = new HashMap();
                this.f13784v = new HashMap();
                break;
            default:
                this.f13782t = null;
                this.f13783u = null;
                this.f13784v = null;
                this.f13785w = new ArrayDeque();
                break;
        }
    }

    public r(b1 b1Var, o1.h hVar, ArrayList arrayList) {
        this.f13781s = 6;
        this.f13783u = b1Var;
        this.f13784v = hVar;
        this.f13785w = arrayList;
        this.f13782t = b1Var;
    }
}
