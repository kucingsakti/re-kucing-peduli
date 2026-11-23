package p182s4;

/* JADX INFO: loaded from: classes.dex */
public final class X {
    public static final X a = new X();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0092, code lost:
    
        if (r10 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [i4.d] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(p082i4.d r9, p144o8.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p182s4.C0779p
            if (r0 == 0) goto L13
            r0 = r10
            s4.p r0 = (p182s4.C0779p) r0
            int r1 = r0.f14708v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14708v = r1
            goto L18
        L13:
            s4.p r0 = new s4.p
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f14706t
            n8.a r1 = p134n8.a.f13404s
            int r2 = r0.f14708v
            java.lang.String r3 = ""
            java.lang.String r4 = "InstallationId"
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L48
            if (r2 == r6) goto L3e
            if (r2 != r5) goto L36
            java.lang.Object r9 = r0.f14705s
            java.lang.String r9 = (java.lang.String) r9
            J7.a.v(r10)     // Catch: java.lang.Exception -> L33
            goto L95
        L33:
            r10 = move-exception
            goto L9e
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            java.lang.Object r9 = r0.f14705s
            i4.d r9 = (p082i4.d) r9
            J7.a.v(r10)     // Catch: java.lang.Exception -> L46
            goto L65
        L46:
            r10 = move-exception
            goto L78
        L48:
            J7.a.v(r10)
            r10 = r9
            i4.c r10 = (p082i4.c) r10     // Catch: java.lang.Exception -> L46
            P2.f r9 = r10.e()     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "firebaseInstallations.getToken(false)"
            p210v8.i.e(r9, r2)     // Catch: java.lang.Exception -> L76
            r0.f14705s = r10     // Catch: java.lang.Exception -> L76
            r0.f14708v = r6     // Catch: java.lang.Exception -> L76
            java.lang.Object r9 = C3.a.a(r9, r0)     // Catch: java.lang.Exception -> L76
            if (r9 != r1) goto L62
            goto L94
        L62:
            r7 = r10
            r10 = r9
            r9 = r7
        L65:
            i4.a r10 = (p082i4.a) r10     // Catch: java.lang.Exception -> L46
            java.lang.String r10 = r10.a     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
            p210v8.i.e(r10, r2)     // Catch: java.lang.Exception -> L46
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7f
        L72:
            r7 = r10
            r10 = r9
            r9 = r7
            goto L78
        L76:
            r9 = move-exception
            goto L72
        L78:
            java.lang.String r2 = "Error getting authentication token."
            android.util.Log.w(r4, r2, r10)
            r10 = r9
            r9 = r3
        L7f:
            i4.c r10 = (p082i4.c) r10     // Catch: java.lang.Exception -> L33
            P2.f r10 = r10.d()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "firebaseInstallations.id"
            p210v8.i.e(r10, r2)     // Catch: java.lang.Exception -> L33
            r0.f14705s = r9     // Catch: java.lang.Exception -> L33
            r0.f14708v = r5     // Catch: java.lang.Exception -> L33
            java.lang.Object r10 = C3.a.a(r10, r0)     // Catch: java.lang.Exception -> L33
            if (r10 != r1) goto L95
        L94:
            return r1
        L95:
            java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
            p210v8.i.e(r10, r0)     // Catch: java.lang.Exception -> L33
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L33
            r3 = r10
            goto La3
        L9e:
            java.lang.String r0 = "Error getting Firebase installation id ."
            android.util.Log.w(r4, r0, r10)
        La3:
            s4.q r10 = new s4.q
            r10.<init>(r3, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p182s4.X.a(i4.d, o8.c):java.lang.Object");
    }
}
