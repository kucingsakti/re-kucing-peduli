package G5;

import android.location.Location;
import com.onesignal.common.events.d;
import p076h8.m;

/* JADX INFO: loaded from: classes.dex */
public interface a extends d {
    @Override // com.onesignal.common.events.d
    /* synthetic */ boolean getHasSubscribers();

    Location getLastLocation();

    Object start(p123m8.d<? super Boolean> dVar);

    Object stop(p123m8.d<? super m> dVar);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void subscribe(Object obj);

    @Override // com.onesignal.common.events.d
    /* synthetic */ void unsubscribe(Object obj);
}
