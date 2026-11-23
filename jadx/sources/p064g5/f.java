package p064g5;

import C8.InterfaceC0175c;
import p076h8.m;
import p123m8.d;

/* JADX INFO: loaded from: classes.dex */
public interface f {
    Object awaitInitialized(d<? super m> dVar);

    <T extends g> boolean containsInstanceOf(InterfaceC0175c interfaceC0175c);

    void enqueue(g gVar, boolean z6);

    Object enqueueAndWait(g gVar, boolean z6, d<? super Boolean> dVar);

    void forceExecuteOperations();
}
