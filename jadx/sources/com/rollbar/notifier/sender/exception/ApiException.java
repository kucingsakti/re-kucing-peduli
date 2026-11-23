package com.rollbar.notifier.sender.exception;

import L6.b;
import com.rollbar.notifier.sender.result.Response;
import java.util.Arrays;
import va.a;

/* JADX INFO: loaded from: classes.dex */
public class ApiException extends RuntimeException {
    private final Response response;

    public ApiException(Response response) {
        super(response.getResult().getContent());
        this.response = response;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Response response = this.response;
        Response response2 = ((ApiException) obj).response;
        a aVar = b.a;
        return response == response2 || (response != null && response.equals(response2));
    }

    public int hashCode() {
        Object[] objArr = {this.response};
        a aVar = b.a;
        return Arrays.hashCode(objArr);
    }
}
