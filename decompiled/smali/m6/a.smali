.class public interface abstract Lm6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract addAlias(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract addAliases(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract addEmail(Ljava/lang/String;)V
.end method

.method public abstract addObserver(Lw6/a;)V
.end method

.method public abstract addSms(Ljava/lang/String;)V
.end method

.method public abstract addTag(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public abstract addTags(Ljava/util/Map;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract addUserJwtInvalidatedListener(LP4/b;)V
.end method

.method public abstract getExternalId()Ljava/lang/String;
.end method

.method public abstract getOnesignalId()Ljava/lang/String;
.end method

.method public abstract getPushSubscription()Lx6/b;
.end method

.method public abstract getTags()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract removeAlias(Ljava/lang/String;)V
.end method

.method public abstract removeAliases(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract removeEmail(Ljava/lang/String;)V
.end method

.method public abstract removeObserver(Lw6/a;)V
.end method

.method public abstract removeSms(Ljava/lang/String;)V
.end method

.method public abstract removeTag(Ljava/lang/String;)V
.end method

.method public abstract removeTags(Ljava/util/Collection;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract removeUserJwtInvalidatedListener(LP4/b;)V
.end method

.method public abstract setLanguage(Ljava/lang/String;)V
.end method
