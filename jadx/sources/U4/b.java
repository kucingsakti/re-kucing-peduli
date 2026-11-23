package U4;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    <T> List<T> getAllServices(Class<T> cls);

    <T> T getService(Class<T> cls);

    <T> T getServiceOrNull(Class<T> cls);

    <T> boolean hasService(Class<T> cls);
}
