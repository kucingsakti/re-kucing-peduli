package C;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f822d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f825g;
    public o a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f820b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f821c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f823e = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f826h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g f827i = null;
    public boolean j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f828k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f829l = new ArrayList();

    public f(o oVar) {
        this.f822d = oVar;
    }

    @Override // C.d
    public final void a(d dVar) {
        ArrayList<f> arrayList = this.f829l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).j) {
                return;
            }
        }
        this.f821c = true;
        o oVar = this.a;
        if (oVar != null) {
            oVar.a(this);
        }
        if (this.f820b) {
            this.f822d.a(this);
            return;
        }
        f fVar = null;
        int i10 = 0;
        for (f fVar2 : arrayList) {
            if (!(fVar2 instanceof g)) {
                i10++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i10 == 1 && fVar.j) {
            g gVar = this.f827i;
            if (gVar != null) {
                if (!gVar.j) {
                    return;
                } else {
                    this.f824f = this.f826h * gVar.f825g;
                }
            }
            d(fVar.f825g + this.f824f);
        }
        o oVar2 = this.a;
        if (oVar2 != null) {
            oVar2.a(this);
        }
    }

    public final void b(o oVar) {
        this.f828k.add(oVar);
        if (this.j) {
            oVar.a(oVar);
        }
    }

    public final void c() {
        this.f829l.clear();
        this.f828k.clear();
        this.j = false;
        this.f825g = 0;
        this.f821c = false;
        this.f820b = false;
    }

    public void d(int i10) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.f825g = i10;
        for (d dVar : this.f828k) {
            dVar.a(dVar);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f822d.f840b.f466h0);
        sb.append(":");
        switch (this.f823e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.f825g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f829l.size());
        sb.append(":d=");
        sb.append(this.f828k.size());
        sb.append(">");
        return sb.toString();
    }
}
