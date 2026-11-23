package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Hex;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;
import p205v2.b;
import p205v2.d;
import p205v2.f;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zze implements Callable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f8271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f8272t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ d f8273u;

    public /* synthetic */ zze(boolean z6, String str, d dVar) {
        this.f8271s = z6;
        this.f8272t = str;
        this.f8273u = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0039 A[LOOP:1: B:17:0x0036->B:19:0x0039, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x001f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0028 A[EDGE_INSN: B:26:0x0028->B:16:0x0028 BREAK  A[LOOP:0: B:10:0x001c->B:14:0x0025], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0025 A[SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10;
        MessageDigest messageDigest;
        byte[] bArrDigest;
        char[] cArr;
        int i11;
        d dVar = this.f8273u;
        boolean z6 = this.f8271s;
        String str = this.f8272t;
        if (!z6) {
            String str2 = f.b(str, dVar, true, false).a ? "debug cert rejected" : "not allowed";
            i10 = 0;
            while (true) {
                if (i10 < 2) {
                    messageDigest = null;
                    break;
                }
                try {
                    messageDigest = MessageDigest.getInstance("SHA-256");
                    if (messageDigest == null) {
                        break;
                    }
                    i10++;
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            Preconditions.i(messageDigest);
            bArrDigest = messageDigest.digest(dVar.f15413d);
            int length = bArrDigest.length;
            cArr = new char[length + length];
            i11 = 0;
            for (byte b3 : bArrDigest) {
                char[] cArr2 = Hex.f8260b;
                cArr[i11] = cArr2[(b3 & 255) >>> 4];
                cArr[i11 + 1] = cArr2[b3 & 15];
                i11 += 2;
            }
            return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z6 + ", ver=12451000.false";
        }
        b bVar = f.a;
        i10 = 0;
        while (true) {
            if (i10 < 2) {
                messageDigest = null;
                break;
            }
            messageDigest = MessageDigest.getInstance("SHA-256");
            if (messageDigest == null) {
                break;
                break;
            }
            i10++;
        }
        Preconditions.i(messageDigest);
        bArrDigest = messageDigest.digest(dVar.f15413d);
        int length2 = bArrDigest.length;
        cArr = new char[length2 + length2];
        i11 = 0;
        while (i < bArrDigest.length) {
            char[] cArr3 = Hex.f8260b;
            cArr[i11] = cArr3[(b3 & 255) >>> 4];
            cArr[i11 + 1] = cArr3[b3 & 15];
            i11 += 2;
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z6 + ", ver=12451000.false";
    }
}
