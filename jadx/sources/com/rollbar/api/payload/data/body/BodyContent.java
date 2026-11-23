package com.rollbar.api.payload.data.body;

import com.rollbar.api.truncation.StringTruncatable;

/* JADX INFO: loaded from: classes.dex */
public interface BodyContent extends StringTruncatable<BodyContent> {
    String getKeyName();
}
