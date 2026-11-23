package p201u9;

import A9.AbstractC0151y;
import L8.InterfaceC0268b;
import L8.InterfaceC0271e;
import L8.InterfaceC0277k;
import O8.AbstractC0360p;
import p096j9.f;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class a extends B1.a implements d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f15357t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final f f15358u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final InterfaceC0277k f15359v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(InterfaceC0268b interfaceC0268b, AbstractC0151y abstractC0151y, f fVar) {
        super(abstractC0151y);
        i.f(abstractC0151y, "receiverType");
        this.f15359v = (AbstractC0360p) interfaceC0268b;
        this.f15358u = fVar;
    }

    public final f X0() {
        switch (this.f15357t) {
            case 0:
                break;
        }
        return this.f15358u;
    }

    public final String toString() {
        switch (this.f15357t) {
            case 0:
                return getType() + ": Ctx { " + ((InterfaceC0271e) this.f15359v) + " }";
            default:
                return "Cxt { " + ((AbstractC0360p) this.f15359v) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC0271e interfaceC0271e, AbstractC0151y abstractC0151y, f fVar) {
        super(abstractC0151y);
        i.f(abstractC0151y, "receiverType");
        this.f15359v = interfaceC0271e;
        this.f15358u = fVar;
    }
}
