package com.google.gson.internal.bind;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.gson.JsonSyntaxException;
import com.google.gson.i;
import com.google.gson.internal.f;
import com.google.gson.u;
import com.google.gson.v;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class DateTypeAdapter extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f10029b = new v() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.v
        public final u a(i iVar, p243z4.a aVar) {
            if (aVar.a == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };
    public final ArrayList a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (f.a >= 9) {
            arrayList.add(com.google.gson.internal.d.h(2, 2));
        }
    }

    @Override // com.google.gson.u
    public final Object b(A4.a aVar) throws IOException {
        if (aVar.X() == 9) {
            aVar.J();
            return null;
        }
        String strT = aVar.T();
        synchronized (this.a) {
            try {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(strT);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return p226x4.a.b(strT, new ParsePosition(0));
                } catch (ParseException e10) {
                    StringBuilder sbM = AbstractC0487g.m("Failed parsing '", strT, "' as Date; at path ");
                    sbM.append(aVar.l(true));
                    throw new JsonSyntaxException(sbM.toString(), e10);
                }
            } catch (Throwable th) {
                throw th;
            }
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
        DateFormat dateFormat = (DateFormat) this.a.get(0);
        synchronized (this.a) {
            str = dateFormat.format(date);
        }
        bVar.E(str);
    }
}
