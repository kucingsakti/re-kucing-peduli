package com.google.gson.internal.bind;

import androidx.datastore.preferences.protobuf.AbstractC0487g;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.f;
import com.google.gson.u;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends u {
    public final b a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f10030b;

    public DefaultDateTypeAdapter(b bVar, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f10030b = arrayList;
        Objects.requireNonNull(bVar);
        this.a = bVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (f.a >= 9) {
            arrayList.add(com.google.gson.internal.d.h(i10, i11));
        }
    }

    @Override // com.google.gson.u
    public final Object b(A4.a aVar) throws IOException {
        Date dateB;
        if (aVar.X() == 9) {
            aVar.J();
            return null;
        }
        String strT = aVar.T();
        synchronized (this.f10030b) {
            try {
                Iterator it = this.f10030b.iterator();
                while (it.hasNext()) {
                    try {
                        dateB = ((DateFormat) it.next()).parse(strT);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    dateB = p226x4.a.b(strT, new ParsePosition(0));
                } catch (ParseException e10) {
                    StringBuilder sbM = AbstractC0487g.m("Failed parsing '", strT, "' as Date; at path ");
                    sbM.append(aVar.l(true));
                    throw new JsonSyntaxException(sbM.toString(), e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.a.b(dateB);
    }

    @Override // com.google.gson.u
    public final void c(A4.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.n();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f10030b.get(0);
        synchronized (this.f10030b) {
            str = dateFormat.format(date);
        }
        bVar.E(str);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f10030b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
