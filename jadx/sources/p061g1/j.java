package p061g1;

import android.text.TextUtils;
import com.bumptech.glide.e;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o1.r;
import p050f1.q;
import p050f1.v;
import p147p1.d;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class j extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f11485h = q.c("WorkContinuationImpl");
    public final o a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f11487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f11489e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11490f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public r f11491g;

    public j(o oVar, String str, List list) {
        this.a = oVar;
        this.f11486b = str;
        this.f11487c = list;
        this.f11488d = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            String string = ((p050f1.r) list.get(i10)).a.toString();
            i.e(string, "id.toString()");
            this.f11488d.add(string);
            this.f11489e.add(string);
        }
    }

    public static HashSet t(j jVar) {
        HashSet hashSet = new HashSet();
        jVar.getClass();
        return hashSet;
    }

    public final v s() {
        if (this.f11490f) {
            q.a().d(f11485h, "Already enqueued work ids (" + TextUtils.join(", ", this.f11488d) + ")");
        } else {
            d dVar = new d(this);
            this.a.f11500d.t(dVar);
            this.f11491g = dVar.f14172t;
        }
        return this.f11491g;
    }
}
