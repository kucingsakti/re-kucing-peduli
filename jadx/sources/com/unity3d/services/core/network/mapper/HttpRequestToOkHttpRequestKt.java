package com.unity3d.services.core.network.mapper;

import Fa.e;
import L9.f;
import X9.A;
import X9.G;
import X9.I;
import X9.J;
import X9.w;
import Y9.c;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import p068ga.d;
import p086i8.k;
import p210v8.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "body", "LX9/J;", "generateOkHttpBody", "(Ljava/lang/Object;)LX9/J;", "Lcom/unity3d/services/core/network/model/HttpRequest;", "LX9/w;", "generateOkHttpHeaders", "(Lcom/unity3d/services/core/network/model/HttpRequest;)LX9/w;", "LX9/G;", "toOkHttpRequest", "(Lcom/unity3d/services/core/network/model/HttpRequest;)LX9/G;", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class HttpRequestToOkHttpRequestKt {
    private static final J generateOkHttpBody(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof String) {
                Pattern pattern = A.f5431d;
                return J.c(d.x("text/plain;charset=utf-8"), (String) obj);
            }
            Pattern pattern2 = A.f5431d;
            return J.c(d.x("text/plain;charset=utf-8"), "");
        }
        Pattern pattern3 = A.f5431d;
        A aX = d.x("text/plain;charset=utf-8");
        byte[] bArr = (byte[]) obj;
        i.f(bArr, "content");
        int length = bArr.length;
        c.c(bArr.length, 0, length);
        return new I(aX, length, bArr);
    }

    private static final w generateOkHttpHeaders(HttpRequest httpRequest) {
        M1.c cVar = new M1.c(3);
        for (Map.Entry<String, List<String>> entry : httpRequest.getHeaders().entrySet()) {
            cVar.a(entry.getKey(), k.Z(entry.getValue(), ",", null, null, null, 62));
        }
        return cVar.d();
    }

    public static final G toOkHttpRequest(HttpRequest httpRequest) {
        i.f(httpRequest, "<this>");
        e eVar = new e(11);
        eVar.B(f.X(f.k0(httpRequest.getBaseURL(), '/') + '/' + f.k0(httpRequest.getPath(), '/'), "/"));
        String string = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        eVar.v(string, body != null ? generateOkHttpBody(body) : null);
        w wVarGenerateOkHttpHeaders = generateOkHttpHeaders(httpRequest);
        i.f(wVarGenerateOkHttpHeaders, "headers");
        eVar.f1661v = wVarGenerateOkHttpHeaders.g();
        return eVar.j();
    }
}
