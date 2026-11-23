package p232y1;

import com.rollbar.notifier.sender.SyncSender;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public interface e {
    public static final Charset a = Charset.forName(SyncSender.UTF_8);

    void b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
