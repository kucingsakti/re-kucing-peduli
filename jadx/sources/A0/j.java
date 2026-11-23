package A0;

import A9.AbstractC0151y;
import F8.A;
import F8.C0229x;
import F8.p0;
import F8.y0;
import L8.InterfaceC0271e;
import L8.InterfaceC0273g;
import O3.C0343a;
import X9.C0455a;
import X9.C0466l;
import X9.v;
import Y8.y;
import android.content.Intent;
import android.os.Handler;
import android.view.View;
import com.google.android.material.chip.Chip;
import com.kcstream.cing.activity.Browser2Activity;
import com.kcstream.cing.activity.ItemActivity;
import com.kcstream.cing.activity.SearchByGenreActivity;
import com.kcstream.cing.activity.SeriesActivity;
import com.kcstream.cing.model.AllListResult;
import com.kcstream.cing.model.PostsDownload;
import com.kcstream.cing.model.PostsDownloadLinks;
import com.kcstream.cing.model.SeriesInfoMetaGenre;
import com.tonyodev.fetch2.Download;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.chromium.net.UrlRequest;
import p104k9.AbstractC0673b;
import p104k9.C0678g;
import y0.C0872j;
import y0.C0874l;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p210v8.k implements p200u8.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f23s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f24t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f25u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f26v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i10) {
        super(0);
        this.f23s = i10;
        this.f24t = obj;
        this.f25u = obj2;
        this.f26v = obj3;
    }

    @Override // p200u8.a
    public final Object invoke() {
        List listC;
        switch (this.f23s) {
            case 0:
                C0874l c0874l = (C0874l) this.f24t;
                for (C0872j c0872j : (Iterable) ((Q9.t) ((Q9.m) c0874l.f15942f.f3811t)).f()) {
                    ((g) this.f25u).getClass();
                    if (g.n()) {
                        Objects.toString(c0872j);
                        Objects.toString((androidx.fragment.app.b) this.f26v);
                    }
                    c0874l.b(c0872j);
                }
                return p076h8.m.a;
            case 1:
                ItemActivity itemActivity = (ItemActivity) this.f24t;
                Intent intent = new Intent(itemActivity, (Class<?>) Browser2Activity.class);
                intent.putExtra("file", itemActivity.f10187h0 + " [" + ((PostsDownload) this.f25u).getType() + ']');
                intent.putExtra("link", ((PostsDownloadLinks) this.f26v).getLink());
                intent.putExtra("download", true);
                intent.putExtra("image", itemActivity.f10188i0);
                itemActivity.startActivity(intent);
                return p076h8.m.a;
            case 2:
                Intent intent2 = new Intent(((Chip) this.f25u).getContext(), (Class<?>) SearchByGenreActivity.class);
                SeriesInfoMetaGenre seriesInfoMetaGenre = (SeriesInfoMetaGenre) this.f26v;
                intent2.putExtra("termSingleId", seriesInfoMetaGenre.getTerm_id());
                intent2.putExtra("termSingleName", seriesInfoMetaGenre.getName());
                ((SeriesActivity) this.f24t).startActivity(intent2);
                return p076h8.m.a;
            case 3:
                InterfaceC0273g interfaceC0273gW = ((AbstractC0151y) this.f24t).D().w();
                if (!(interfaceC0273gW instanceof InterfaceC0271e)) {
                    throw new p0("Supertype not a class: " + interfaceC0273gW, 0);
                }
                Class clsJ = y0.j((InterfaceC0271e) interfaceC0273gW);
                C0229x c0229x = (C0229x) this.f25u;
                if (clsJ == null) {
                    throw new p0("Unsupported superclass of " + c0229x + ": " + interfaceC0273gW, 0);
                }
                A a = (A) this.f26v;
                boolean zA = p210v8.i.a(a.f1508t.getSuperclass(), clsJ);
                Class cls = a.f1508t;
                if (zA) {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    p210v8.i.e(genericSuperclass, "{\n                      …ass\n                    }");
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls.getInterfaces();
                p210v8.i.e(interfaces, "jClass.interfaces");
                int iY = p086i8.i.y(clsJ, interfaces);
                if (iY >= 0) {
                    Type type = cls.getGenericInterfaces()[iY];
                    p210v8.i.e(type, "{\n                      …ex]\n                    }");
                    return type;
                }
                throw new p0("No superclass of " + c0229x + " in Java reflection for " + interfaceC0273gW, 0);
            case 4:
                Intent intent3 = new Intent(((G4.e) this.f24t).f7003s.getContext(), (Class<?>) ItemActivity.class);
                AllListResult allListResult = (AllListResult) this.f25u;
                intent3.putExtra("id", allListResult.getId());
                intent3.putExtra("title", allListResult.getTitle());
                intent3.putExtra("slug", allListResult.getSlug());
                intent3.putExtra("image", allListResult.getImage());
                ((View) this.f26v).getContext().startActivity(intent3);
                return p076h8.m.a;
            case 5:
                C3.b bVar = ((C0466l) this.f24t).f5599b;
                List list = (List) this.f25u;
                List listE = bVar == null ? null : bVar.e((String) this.f26v, list);
                if (listE != null) {
                    list = listE;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(p086i8.m.H(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add((X509Certificate) ((Certificate) it.next()));
                }
                return arrayList;
            case 6:
                Y8.A a10 = (Y8.A) this.f24t;
                p247z9.l lVar = (p247z9.l) ((I4.a) a10.f5713b.f1659t).a;
                y yVar = new y(a10, (R8.t) this.f25u, (W8.g) this.f26v);
                lVar.getClass();
                return new p247z9.h(lVar, yVar);
            case 7:
                C3.b bVar2 = ((C0466l) this.f24t).f5599b;
                p210v8.i.c(bVar2);
                return bVar2.e(((C0455a) this.f26v).f5563h.f5658d, ((v) this.f25u).a());
            case 8:
                C0343a c0343a = (C0343a) this.f24t;
                try {
                    List<Download> list3 = (List) ((p112l7.c) this.f25u).invoke();
                    for (Download download : list3) {
                        ((p163q7.f) c0343a.f3515g).a("Cancelled download " + download);
                        ((J4.c) ((V3.b) c0343a.f3516h).f5177g).a(download);
                    }
                    ((Handler) c0343a.f3513e).post(new P2.g(this, 12, list3));
                    break;
                } catch (Exception e10) {
                    ((p163q7.f) c0343a.f3515g).b("Fetch with namespace LibGlobalFetchLib error", e10);
                    C4.a.s(e10.getMessage());
                }
                return p076h8.m.a;
            case 9:
                C0343a c0343a2 = (C0343a) this.f24t;
                try {
                    List<Download> list4 = (List) ((p112l7.c) this.f25u).invoke();
                    for (Download download2 : list4) {
                        ((p163q7.f) c0343a2.f3515g).a("Deleted download " + download2);
                        ((J4.c) ((V3.b) c0343a2.f3516h).f5177g).c(download2);
                    }
                    ((Handler) c0343a2.f3513e).post(new P2.g(this, 13, list4));
                    break;
                } catch (Exception e11) {
                    ((p163q7.f) c0343a2.f3515g).b("Fetch with namespace LibGlobalFetchLib error", e11);
                    C4.a.s(e11.getMessage());
                }
                return p076h8.m.a;
            case 10:
                C0343a c0343a3 = (C0343a) this.f24t;
                p112l7.a aVar = (p112l7.a) c0343a3.f3514f;
                aVar.getClass();
                List list5 = (List) this.f25u;
                p085i7.g gVar = aVar.f12932v;
                synchronized (gVar.f12301s) {
                    listC = gVar.f12302t.c(list5);
                }
                ((Handler) c0343a3.f3513e).post(new P2.g(this, 14, listC));
                return p076h8.m.a;
            case 11:
                C0343a c0343a4 = (C0343a) this.f24t;
                try {
                    List list6 = (List) this.f25u;
                    p112l7.a aVar2 = (p112l7.a) c0343a4.f3514f;
                    aVar2.getClass();
                    ArrayList<Download> arrayListC = aVar2.c(p086i8.k.R(aVar2.f12932v.a(list6)));
                    for (Download download3 : arrayListC) {
                        ((p163q7.f) c0343a4.f3515g).a("Paused download " + download3);
                        ((J4.c) ((V3.b) c0343a4.f3516h).f5177g).f(download3);
                    }
                    ((Handler) c0343a4.f3513e).post(new P2.g(this, 15, arrayListC));
                    break;
                } catch (Exception e12) {
                    ((p163q7.f) c0343a4.f3515g).b("Fetch with namespace LibGlobalFetchLib error", e12);
                    C4.a.s(e12.getMessage());
                }
                return p076h8.m.a;
            case UrlRequest.Status.SENDING_REQUEST /* 12 */:
                C0343a c0343a5 = (C0343a) this.f24t;
                try {
                    List list7 = (List) this.f25u;
                    p112l7.a aVar3 = (p112l7.a) c0343a5.f3514f;
                    aVar3.getClass();
                    ArrayList<Download> arrayListG = aVar3.g(list7);
                    for (Download download4 : arrayListG) {
                        p163q7.f fVar = (p163q7.f) c0343a5.f3515g;
                        J4.c cVar = (J4.c) ((V3.b) c0343a5.f3516h).f5177g;
                        fVar.a("Queued download " + download4);
                        cVar.h(download4, false);
                        ((p163q7.f) c0343a5.f3515g).a("Resumed download " + download4);
                        cVar.i(download4);
                    }
                    ((Handler) c0343a5.f3513e).post(new P2.g(this, 16, arrayListG));
                    break;
                } catch (Exception e13) {
                    ((p163q7.f) c0343a5.f3515g).b("Fetch with namespace LibGlobalFetchLib error", e13);
                    C4.a.s(e13.getMessage());
                }
                return p076h8.m.a;
            case UrlRequest.Status.WAITING_FOR_RESPONSE /* 13 */:
                C0343a c0343a6 = (C0343a) this.f24t;
                try {
                    ArrayList<Download> arrayListH = ((p112l7.a) c0343a6.f3514f).h((List) this.f25u);
                    for (Download download5 : arrayListH) {
                        ((p163q7.f) c0343a6.f3515g).a("Queued " + download5 + " for download");
                        ((J4.c) ((V3.b) c0343a6.f3516h).f5177g).h(download5, false);
                    }
                    ((Handler) c0343a6.f3513e).post(new P2.g(this, 17, arrayListH));
                    break;
                } catch (Exception e14) {
                    ((p163q7.f) c0343a6.f3515g).b("Fetch with namespace LibGlobalFetchLib error", e14);
                    C4.a.s(e14.getMessage());
                }
                return p076h8.m.a;
            default:
                return ((AbstractC0673b) this.f24t).b((ByteArrayInputStream) this.f25u, (C0678g) ((I4.c) ((p238y9.m) this.f26v).f16097b.a).f2092p);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0872j c0872j, C0874l c0874l, g gVar, androidx.fragment.app.b bVar) {
        super(0);
        this.f23s = 0;
        this.f24t = c0874l;
        this.f25u = gVar;
        this.f26v = bVar;
    }
}
