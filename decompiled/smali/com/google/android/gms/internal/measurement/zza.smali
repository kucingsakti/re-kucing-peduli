.class public final synthetic Lcom/google/android/gms/internal/measurement/zza;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public synthetic s:Lcom/google/android/gms/internal/measurement/zzb;


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zza;->s:Lcom/google/android/gms/internal/measurement/zzb;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, Lcom/google/android/gms/internal/measurement/zzw;

    .line 7
    .line 8
    const-string v2, "internal.registerCallback"

    .line 9
    .line 10
    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/measurement/zzal;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, v0, Lcom/google/android/gms/internal/measurement/zzb;->d:Lcom/google/android/gms/internal/measurement/zzaa;

    .line 14
    .line 15
    iput-object v0, v1, Lcom/google/android/gms/internal/measurement/zzw;->u:Lcom/google/android/gms/internal/measurement/zzaa;

    .line 16
    .line 17
    return-object v1
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
