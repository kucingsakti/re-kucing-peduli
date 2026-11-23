package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.res.AssetManager;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f7642s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f7643t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Comparable f7644u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f7645v;

    public /* synthetic */ b(int i10, Comparable comparable, Object obj) {
        this.f7642s = i10;
        this.f7645v = obj;
        this.f7644u = comparable;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void b() {
        switch (this.f7642s) {
            case 0:
                Object obj = this.f7643t;
                if (obj != null) {
                    try {
                        g(obj);
                    } catch (IOException unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                Object obj2 = this.f7643t;
                if (obj2 != null) {
                    try {
                        g(obj2);
                    } catch (IOException unused2) {
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final int c() {
        switch (this.f7642s) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i10 = this.f7642s;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void d(com.bumptech.glide.g gVar, d dVar) {
        switch (this.f7642s) {
            case 0:
                try {
                    Object objH = h((AssetManager) this.f7645v, (String) this.f7644u);
                    this.f7643t = objH;
                    dVar.g(objH);
                } catch (IOException e10) {
                    Log.isLoggable("AssetPathFetcher", 3);
                    dVar.f(e10);
                }
                break;
            default:
                try {
                    Object objI = i((Uri) this.f7644u, (ContentResolver) this.f7645v);
                    this.f7643t = objI;
                    dVar.g(objI);
                } catch (FileNotFoundException e11) {
                    Log.isLoggable("LocalUriFetcher", 3);
                    dVar.f(e11);
                    return;
                }
                break;
        }
    }

    public abstract void g(Object obj);

    public abstract Object h(AssetManager assetManager, String str);

    public abstract Object i(Uri uri, ContentResolver contentResolver);

    private final void e() {
    }

    private final void f() {
    }
}
