package com.google.gson.internal.sql;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.gson.JsonSyntaxException;
import com.google.gson.i;
import com.google.gson.u;
import com.google.gson.v;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
final class SqlTimeTypeAdapter extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f10136b = new v() { // from class: com.google.gson.internal.sql.SqlTimeTypeAdapter.1
        @Override // com.google.gson.v
        public final u a(i iVar, p243z4.a aVar) {
            if (aVar.a == Time.class) {
                return new SqlTimeTypeAdapter(0);
            }
            return null;
        }
    };
    public final SimpleDateFormat a;

    public /* synthetic */ SqlTimeTypeAdapter(int i10) {
        this();
    }

    @Override // com.google.gson.u
    public final Object b(A4.a aVar) throws IOException {
        Time time;
        if (aVar.X() == 9) {
            aVar.J();
            return null;
        }
        String strT = aVar.T();
        try {
            synchronized (this) {
                time = new Time(this.a.parse(strT).getTime());
            }
            return time;
        } catch (ParseException e10) {
            StringBuilder sbM = AbstractC0487g.m("Failed parsing '", strT, "' as SQL Time; at path ");
            sbM.append(aVar.l(true));
            throw new JsonSyntaxException(sbM.toString(), e10);
        }
    }

    @Override // com.google.gson.u
    public final void c(A4.b bVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.n();
            return;
        }
        synchronized (this) {
            str = this.a.format((Date) time);
        }
        bVar.E(str);
    }

    private SqlTimeTypeAdapter() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }
}
