package zlc.season.claritypotion;

import Ia.a;
import android.annotation.SuppressLint;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.TypeCastException;
import o1.r;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzlc/season/claritypotion/ClarityPotion;", "Landroid/content/ContentProvider;", "<init>", "()V", "i8/C", "claritypotion_release"}, k = 1, mv = {1, 4, 0})
@SuppressLint({"StaticFieldLeak"})
public final class ClarityPotion extends ContentProvider {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static Context f16351s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r f16352t = new r(4);

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        i.g(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        i.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        i.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            i.l();
            throw null;
        }
        f16351s = context;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Application");
        }
        r rVar = f16352t;
        rVar.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks((a) rVar.f13676u);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        i.g(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        i.g(uri, "uri");
        return 0;
    }
}
