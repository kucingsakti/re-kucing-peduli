package p161q5;

import java.util.List;
import p076h8.f;
import p076h8.m;
import p123m8.d;
import p200u8.a;

/* JADX INFO: loaded from: classes.dex */
public interface b {
    Object getIAMData(String str, String str2, String str3, d<? super a> dVar);

    Object getIAMPreviewData(String str, String str2, d<? super com.onesignal.inAppMessages.internal.d> dVar);

    Object listInAppMessages(String str, String str2, Q4.b bVar, a aVar, String str3, f fVar, d<? super List<com.onesignal.inAppMessages.internal.a>> dVar);

    Object sendIAMClick(String str, String str2, String str3, String str4, String str5, boolean z6, d<? super m> dVar);

    Object sendIAMImpression(String str, String str2, String str3, String str4, d<? super m> dVar);

    Object sendIAMPageImpression(String str, String str2, String str3, String str4, String str5, d<? super m> dVar);
}
