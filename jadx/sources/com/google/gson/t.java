package com.google.gson;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final p f10160s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q f10161t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ t[] f10162u;

    static {
        p pVar = new p();
        f10160s = pVar;
        q qVar = new q();
        f10161t = qVar;
        f10162u = new t[]{pVar, qVar, new t() { // from class: com.google.gson.r
            @Override // com.google.gson.t
            public final Number f(A4.a aVar) throws IOException {
                String strT = aVar.T();
                try {
                    return Long.valueOf(Long.parseLong(strT));
                } catch (NumberFormatException unused) {
                    try {
                        Double dValueOf = Double.valueOf(strT);
                        if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                            if (!aVar.f301t) {
                                throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.l(true));
                            }
                        }
                        return dValueOf;
                    } catch (NumberFormatException e10) {
                        StringBuilder sbM = AbstractC0487g.m("Cannot parse ", strT, "; at path ");
                        sbM.append(aVar.l(true));
                        throw new JsonParseException(sbM.toString(), e10);
                    }
                }
            }
        }, new t() { // from class: com.google.gson.s
            @Override // com.google.gson.t
            public final Number f(A4.a aVar) throws IOException {
                String strT = aVar.T();
                try {
                    return new BigDecimal(strT);
                } catch (NumberFormatException e10) {
                    StringBuilder sbM = AbstractC0487g.m("Cannot parse ", strT, "; at path ");
                    sbM.append(aVar.l(true));
                    throw new JsonParseException(sbM.toString(), e10);
                }
            }
        }};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f10162u.clone();
    }

    public abstract Number f(A4.a aVar);
}
