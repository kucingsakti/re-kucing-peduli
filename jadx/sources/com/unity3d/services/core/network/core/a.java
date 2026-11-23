package com.unity3d.services.core.network.core;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import i2.i;
import p051f2.d;
import p148p2.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements OnCompleteListener, e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f10429s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f10430t;

    public /* synthetic */ a(long j, i iVar) {
        this.f10429s = j;
        this.f10430t = iVar;
    }

    @Override // p148p2.e
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f10429s));
        i iVar = (i) this.f10430t;
        String str = iVar.a;
        d dVar = iVar.f12182c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(p180s2.a.a(dVar))}) < 1) {
            contentValues.put("backend_name", iVar.a);
            contentValues.put("priority", Integer.valueOf(p180s2.a.a(dVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void d(Task task) {
        CronetInitializer.create$lambda$0((CronetInitializer) this.f10430t, this.f10429s, task);
    }

    public /* synthetic */ a(CronetInitializer cronetInitializer, long j) {
        this.f10430t = cronetInitializer;
        this.f10429s = j;
    }
}
