package p197u4;

import N9.InterfaceC0341y;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;
import p076h8.m;
import p123m8.d;
import p134n8.a;
import p144o8.g;
import p200u8.c;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g implements c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15316s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y1.c f15317t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f15318u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f15319v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c f15320w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Y1.c cVar, Map map, b bVar, c cVar2, d dVar) {
        super(2, dVar);
        this.f15317t = cVar;
        this.f15318u = map;
        this.f15319v = bVar;
        this.f15320w = cVar2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // p144o8.a
    public final d create(Object obj, d dVar) {
        return new e(this.f15317t, this.f15318u, this.f15319v, this.f15320w, dVar);
    }

    @Override // p200u8.c
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((InterfaceC0341y) obj, (d) obj2)).invokeSuspend(m.a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d7 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, java.util.Map] */
    @Override // p144o8.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f13404s;
        int i10 = this.f15316s;
        c cVar = this.f15320w;
        m mVar = m.a;
        try {
            if (i10 == 0) {
                J7.a.v(obj);
                URLConnection uRLConnectionOpenConnection = Y1.c.g(this.f15317t).openConnection();
                i.d(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry entry : this.f15318u.entrySet()) {
                    httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb.toString());
                    b bVar = this.f15319v;
                    this.f15316s = 1;
                    if (bVar.invoke(jSONObject, this) == aVar) {
                        return aVar;
                    }
                } else {
                    this.f15316s = 2;
                    cVar.invoke("Bad response code: " + responseCode, this);
                    if (mVar == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                J7.a.v(obj);
            }
        } catch (Exception e10) {
            String message = e10.getMessage();
            if (message == null) {
                message = e10.toString();
            }
            this.f15316s = 3;
            cVar.invoke(message, this);
            if (mVar == aVar) {
                return aVar;
            }
        }
        return mVar;
    }
}
