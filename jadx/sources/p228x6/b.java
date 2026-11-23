package p228x6;

/* JADX INFO: loaded from: classes.dex */
public interface b extends e {
    void addObserver(c cVar);

    @Override // p228x6.e
    /* synthetic */ String getId();

    boolean getOptedIn();

    String getToken();

    void optIn();

    void optOut();

    void removeObserver(c cVar);
}
