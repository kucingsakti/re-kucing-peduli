package p197u4;

import org.json.JSONObject;
import p076h8.m;
import p123m8.d;
import p144o8.g;
import p200u8.c;
import p210v8.t;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public t f15307s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f15308t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15309u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f15310v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f15311w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, d dVar2) {
        super(2, dVar2);
        this.f15311w = dVar;
    }

    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        b bVar = new b(this.f15311w, dVar);
        bVar.f15310v = obj;
        return bVar;
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((JSONObject) obj, (d) obj2)).invokeSuspend(m.a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd A[PHI: r0 r1
      0x00fd: PHI (r0v8 v8.t) = (r0v5 v8.t), (r0v5 v8.t), (r0v9 v8.t) binds: [B:43:0x00dc, B:48:0x00f9, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r1v10 v8.t) = (r1v6 v8.t), (r1v6 v8.t), (r1v14 v8.t) binds: [B:43:0x00dc, B:48:0x00f9, B:11:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x011d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0122 A[PHI: r0
      0x0122: PHI (r0v10 v8.t) = (r0v8 v8.t), (r0v8 v8.t), (r0v14 v8.t) binds: [B:51:0x0101, B:56:0x011e, B:10:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x0128  */
    /* JADX WARN: Code duplicated, block: B:63:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0146  */
    /* JADX WARN: Code duplicated, block: B:69:0x0149  */
    /* JADX WARN: Code duplicated, block: B:72:0x0165  */
    /* JADX WARN: Code duplicated, block: B:75:0x0169  */
    /* JADX WARN: Code duplicated, block: B:78:0x0188  */
    /* JADX WARN: Code duplicated, block: B:81:0x018c A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0141, code lost:
    
        if (r15 == r4) goto L80;
     */
    @Override // p144o8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p197u4.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
