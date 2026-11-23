package com.google.gson.internal.sql;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.gson.JsonSyntaxException;
import com.google.gson.i;
import com.google.gson.u;
import com.google.gson.v;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* JADX INFO: loaded from: classes.dex */
final class SqlDateTypeAdapter extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f10135b = new v() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.v
        public final u a(i iVar, p243z4.a aVar) {
            if (aVar.a == Date.class) {
                return new SqlDateTypeAdapter(0);
            }
            return null;
        }
    };
    public final SimpleDateFormat a;

    public /* synthetic */ SqlDateTypeAdapter(int i10) {
        this();
    }

    @Override // com.google.gson.u
    public final Object b(A4.a aVar) throws IOException {
        java.util.Date date;
        if (aVar.X() == 9) {
            aVar.J();
            return null;
        }
        String strT = aVar.T();
        try {
            synchronized (this) {
                date = this.a.parse(strT);
            }
            return new Date(date.getTime());
        } catch (ParseException e10) {
            StringBuilder sbM = AbstractC0487g.m("Failed parsing '", strT, "' as SQL Date; at path ");
            sbM.append(aVar.l(true));
            throw new JsonSyntaxException(sbM.toString(), e10);
        }
    }

    @Override // com.google.gson.u
    public final void c(A4.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.n();
            return;
        }
        synchronized (this) {
            str = this.a.format((java.util.Date) date);
        }
        bVar.E(str);
    }

    private SqlDateTypeAdapter() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }
}
