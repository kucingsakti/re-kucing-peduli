package p195u1;

import J7.j;
import Q1.c;
import U1.g;
import android.os.Trace;
import android.util.Base64;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
import p031d.d;
import p031d.l;
import p086i8.C;
import va.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements g, ILoggerFactory {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f15288s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f15289t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f15290u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Serializable f15291v;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Serializable, java.lang.String[]] */
    public b(p081i3.b bVar) {
        this.f15288s = 0;
        ?? r10 = (String[]) bVar.f12212t;
        String str = r10[0];
        try {
            if (Base64.decode(str, 2).length == 32) {
                this.f15290u = "com.kcstream.cing";
                this.f15291v = r10;
                this.f15289t = true;
            } else {
                throw new IllegalArgumentException(C.a(C.c("257AA4CC09F1C0A3C644060F95447A3383EAABF247DF341459E3B1317FCD384F0867A78909EACBB3877E014892436235CFC0AAA056D8260F43ACE51131F12B45403E")) + str + C.a(C.c("5E22BDDA4AEBCAB3C6442729D61F216283DBABF041D3211854F6A42036EA371C0F64F4DD02E085B48F700101954A3437C6DBBAE955DF311C4EE7E53D31A51B5D1367E29D44")));
            }
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(C.a(C.c("257AA4CC09F1C0A3C644060F95447A3383EAABF247DF341459E3B1317FCD384F0867A78909EACBB3877E014892436235CFC0AAA056D8260F43ACE51131F12B45403E")) + str + C.a(C.c("5E22BDDA4AEBCAB3C67E0148B94C6731959DEEE65CC43F53")), e10);
        }
    }

    @Override // org.slf4j.ILoggerFactory
    public synchronized a a(String str) {
        xa.b bVar;
        bVar = (xa.b) ((HashMap) this.f15290u).get(str);
        if (bVar == null) {
            bVar = new xa.b(str, (LinkedBlockingQueue) this.f15291v, this.f15289t);
            ((HashMap) this.f15290u).put(str, bVar);
        }
        return bVar;
    }

    public boolean b(c cVar) {
        boolean z6 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = ((Set) this.f15290u).remove(cVar);
        if (!((HashSet) this.f15291v).remove(cVar) && !zRemove) {
            z6 = false;
        }
        if (z6) {
            cVar.clear();
        }
        return z6;
    }

    @Override // U1.g
    public Object get() {
        if (this.f15289t) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        this.f15289t = true;
        Trace.beginSection("Glide registry");
        try {
            return C3.b.i((com.bumptech.glide.b) this.f15290u, (ArrayList) this.f15291v);
        } finally {
            Trace.endSection();
        }
    }

    public String toString() {
        switch (this.f15288s) {
            case 1:
                return super.toString() + "{numRequests=" + ((Set) this.f15290u).size() + ", isPaused=" + this.f15289t + "}";
            default:
                return super.toString();
        }
    }

    public b(int i10) {
        this.f15288s = i10;
        switch (i10) {
            case 4:
                this.f15289t = false;
                this.f15290u = new HashMap();
                this.f15291v = new LinkedBlockingQueue();
                break;
            default:
                this.f15290u = Collections.newSetFromMap(new WeakHashMap());
                this.f15291v = new HashSet();
                break;
        }
    }

    public b(l lVar, d dVar) {
        this.f15288s = 3;
        this.f15290u = new Object();
        this.f15291v = new ArrayList();
    }

    public b(com.bumptech.glide.b bVar, ArrayList arrayList, j jVar) {
        this.f15288s = 2;
        this.f15290u = bVar;
        this.f15291v = arrayList;
    }
}
