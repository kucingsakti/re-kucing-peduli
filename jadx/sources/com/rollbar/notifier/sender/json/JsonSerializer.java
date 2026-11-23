package com.rollbar.notifier.sender.json;

import com.rollbar.api.payload.Payload;
import com.rollbar.notifier.sender.result.Result;

/* JADX INFO: loaded from: classes.dex */
public interface JsonSerializer {
    Result resultFrom(String str);

    String toJson(Payload payload);
}
