.class public interface abstract Lcom/rollbar/notifier/sender/json/JsonSerializer;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract resultFrom(Ljava/lang/String;)Lcom/rollbar/notifier/sender/result/Result;
.end method

.method public abstract toJson(Lcom/rollbar/api/payload/Payload;)Ljava/lang/String;
.end method
