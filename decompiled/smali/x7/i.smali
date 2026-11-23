.class public final Lx7/i;
.super Lx7/a;
.source "SourceFile"

# interfaces
.implements Lu7/a;


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx7/a;->b:Lu7/c;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/unity3d/scar/adapter/common/a;->a(Lu7/c;)Lcom/unity3d/scar/adapter/common/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lx7/a;->e:Lcom/unity3d/scar/adapter/common/c;

    .line 8
    .line 9
    invoke-interface {v1, v0}, Lcom/unity3d/scar/adapter/common/c;->handleError(Lcom/unity3d/scar/adapter/common/e;)V

    .line 10
    .line 11
    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public final c(Lcom/google/android/gms/ads/AdRequest;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx7/a;->b:Lu7/c;

    .line 2
    .line 3
    iget-object v0, v0, Lu7/c;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p0, Lx7/a;->d:LQ3/u0;

    .line 6
    .line 7
    check-cast v1, Lx7/m;

    .line 8
    .line 9
    iget-object v1, v1, Lx7/m;->k:Lx7/j;

    .line 10
    .line 11
    iget-object v2, p0, Lx7/a;->a:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {v2, v0, p1, v1}, Lcom/google/android/gms/ads/rewarded/RewardedAd;->load(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/ads/AdRequest;Lcom/google/android/gms/ads/rewarded/RewardedAdLoadCallback;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method
