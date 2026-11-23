package H4;

import Ba.f;
import Ba.t;
import com.kcstream.cing.model.All;
import com.kcstream.cing.model.DisqusComments;
import com.kcstream.cing.model.GetList;
import com.kcstream.cing.model.NewRelease;
import com.kcstream.cing.model.Posts;
import com.kcstream.cing.model.Recent;
import com.kcstream.cing.model.Search;
import com.kcstream.cing.model.SearchByGenre;
import com.kcstream.cing.model.SearchListGenres;
import com.kcstream.cing.model.Series;
import com.kcstream.cing.model.Updater;
import com.onesignal.inAppMessages.internal.display.impl.k;
import java.util.List;
import kotlin.Metadata;
import p123m8.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\u0006J$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\u0010\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0016\u001a\u00020\u00152\b\b\u0001\u0010\u0014\u001a\u00020\n2\b\b\u0001\u0010\t\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u00020\u001a2\u000e\b\u0001\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H§@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u001d\u001a\u00020\n2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!H§@¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$H§@¢\u0006\u0004\b%\u0010#J\u0010\u0010'\u001a\u00020&H§@¢\u0006\u0004\b'\u0010#J\u0010\u0010)\u001a\u00020(H§@¢\u0006\u0004\b)\u0010#¨\u0006*"}, d2 = {"LH4/a;", "", "", "id", "Lcom/kcstream/cing/model/Series;", "g", "(ILm8/d;)Ljava/lang/Object;", "Lcom/kcstream/cing/model/Posts;", "k", "page", "", "category", "Lcom/kcstream/cing/model/All;", "c", "(ILjava/lang/String;Lm8/d;)Ljava/lang/Object;", "letter", k.EVENT_TYPE_KEY, "Lcom/kcstream/cing/model/GetList;", "j", "(Ljava/lang/String;Ljava/lang/String;ILm8/d;)Ljava/lang/Object;", "q", "Lcom/kcstream/cing/model/Search;", "b", "(Ljava/lang/String;ILm8/d;)Ljava/lang/Object;", "", "term", "Lcom/kcstream/cing/model/SearchByGenre;", "f", "(Ljava/util/List;Lm8/d;)Ljava/lang/Object;", "slug", "Lcom/kcstream/cing/model/DisqusComments;", "e", "(Ljava/lang/String;Ljava/lang/Integer;Lm8/d;)Ljava/lang/Object;", "Lcom/kcstream/cing/model/Recent;", "i", "(Lm8/d;)Ljava/lang/Object;", "Lcom/kcstream/cing/model/SearchListGenres;", R5.a.PUSH_ADDITIONAL_DATA_KEY, "Lcom/kcstream/cing/model/NewRelease;", "d", "Lcom/kcstream/cing/model/Updater;", "h", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface a {
    @f("genre")
    Object a(d<? super SearchListGenres> dVar);

    @f("search")
    Object b(@t("q") String str, @t("page") int i10, d<? super Search> dVar);

    @f("all")
    Object c(@t("page") int i10, @t("category") String str, d<? super All> dVar);

    @f("comingsoon")
    Object d(d<? super NewRelease> dVar);

    @f("service/disqus/post")
    Object e(@t("slug") String str, @t("page") Integer num, d<? super DisqusComments> dVar);

    @f("searchByGenre")
    Object f(@t("term") List<Integer> list, d<? super SearchByGenre> dVar);

    @f("series")
    Object g(@t("id") int i10, d<? super Series> dVar);

    @f("/71b8acf33b508c7543592acd9d9eb70d/updateApp")
    Object h(d<? super Updater> dVar);

    @f("recent")
    Object i(d<? super Recent> dVar);

    @f("listall")
    Object j(@t("letter") String str, @t(k.EVENT_TYPE_KEY) String str2, @t("page") int i10, d<? super GetList> dVar);

    @f("post")
    Object k(@t("id") int i10, d<? super Posts> dVar);
}
