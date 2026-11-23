.class public final LM2/Z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Lcom/google/android/gms/measurement/internal/zzks;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/measurement/internal/zzks;I)V
    .locals 0

    .line 1
    iput p2, p0, LM2/Z;->s:I

    iput-object p1, p0, LM2/Z;->t:Lcom/google/android/gms/measurement/internal/zzks;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, LM2/Z;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    iget-object v1, p0, LM2/Z;->t:Lcom/google/android/gms/measurement/internal/zzks;

    .line 8
    .line 9
    iput-object v0, v1, Lcom/google/android/gms/measurement/internal/zzks;->B:Lcom/google/android/gms/measurement/internal/zzkp;

    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, LM2/Z;->t:Lcom/google/android/gms/measurement/internal/zzks;

    .line 13
    .line 14
    iget-object v1, v0, Lcom/google/android/gms/measurement/internal/zzks;->B:Lcom/google/android/gms/measurement/internal/zzkp;

    .line 15
    .line 16
    iput-object v1, v0, Lcom/google/android/gms/measurement/internal/zzks;->w:Lcom/google/android/gms/measurement/internal/zzkp;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method
