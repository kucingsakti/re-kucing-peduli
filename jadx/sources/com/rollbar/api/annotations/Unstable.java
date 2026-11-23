package com.rollbar.api.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface Unstable {
    public static final String reason = "This class or method is not part of the SDK's public API, and will likely change in ways that will break backwards compatibility, both at source and binary level.";
}
