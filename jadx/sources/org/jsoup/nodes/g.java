package org.jsoup.nodes;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Cloneable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13869v;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l f13866s = l.base;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Charset f13867t = qa.a.a;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ThreadLocal f13868u = new ThreadLocal();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f13870w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f13871x = 1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f13872y = 30;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f13873z = 1;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final g clone() {
        try {
            g gVar = (g) super.clone();
            String strName = this.f13867t.name();
            gVar.getClass();
            gVar.f13867t = Charset.forName(strName);
            gVar.f13866s = l.valueOf(this.f13866s.name());
            return gVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final CharsetEncoder c() {
        int i10;
        CharsetEncoder charsetEncoderNewEncoder = this.f13867t.newEncoder();
        this.f13868u.set(charsetEncoderNewEncoder);
        String strName = charsetEncoderNewEncoder.charset().name();
        if (strName.equals("US-ASCII")) {
            i10 = 1;
        } else {
            i10 = strName.startsWith("UTF-") ? 2 : 3;
        }
        this.f13869v = i10;
        return charsetEncoderNewEncoder;
    }
}
