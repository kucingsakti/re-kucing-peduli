package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.i;
import com.google.gson.t;
import com.google.gson.u;
import com.google.gson.v;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class NumberTypeAdapter extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f10036b = d(t.f10161t);
    public final t a;

    public NumberTypeAdapter(t tVar) {
        this.a = tVar;
    }

    public static v d(t tVar) {
        return new v() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.v
            public final u a(i iVar, p243z4.a aVar) {
                if (aVar.a == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.u
    public final Object b(A4.a aVar) throws IOException {
        int iX = aVar.X();
        int iD = p239z.e.d(iX);
        if (iD == 5 || iD == 6) {
            return this.a.f(aVar);
        }
        if (iD == 8) {
            aVar.J();
            return null;
        }
        throw new JsonSyntaxException("Expecting number, got: " + E0.a.q(iX) + "; at path " + aVar.l(false));
    }

    @Override // com.google.gson.u
    public final void c(A4.b bVar, Object obj) throws IOException {
        bVar.B((Number) obj);
    }
}
