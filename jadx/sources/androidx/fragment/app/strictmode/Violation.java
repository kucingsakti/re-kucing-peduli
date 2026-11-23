package androidx.fragment.app.strictmode;

import androidx.fragment.app.b;
import kotlin.Metadata;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class Violation extends RuntimeException {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f6704s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(b bVar, String str) {
        super(str);
        i.f(bVar, "fragment");
        this.f6704s = bVar;
    }
}
