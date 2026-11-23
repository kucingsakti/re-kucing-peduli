package com.google.gson.internal.sql;

import com.google.gson.i;
import com.google.gson.u;
import com.google.gson.v;
import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
class SqlTimestampTypeAdapter extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f10137b = new v() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.v
        public final u a(i iVar, p243z4.a aVar) {
            if (aVar.a != Timestamp.class) {
                return null;
            }
            iVar.getClass();
            return new SqlTimestampTypeAdapter(iVar.c(new p243z4.a(Date.class)));
        }
    };
    public final u a;

    public SqlTimestampTypeAdapter(u uVar) {
        this.a = uVar;
    }

    @Override // com.google.gson.u
    public final Object b(A4.a aVar) {
        Date date = (Date) this.a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.u
    public final void c(A4.b bVar, Object obj) {
        this.a.c(bVar, (Timestamp) obj);
    }
}
