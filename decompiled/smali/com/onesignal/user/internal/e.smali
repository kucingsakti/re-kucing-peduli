.class public final Lcom/onesignal/user/internal/e;
.super Lcom/onesignal/user/internal/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/onesignal/user/internal/e$a;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/onesignal/user/internal/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/onesignal/user/internal/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/onesignal/user/internal/e$a;-><init>(Lv8/e;)V

    sput-object v0, Lcom/onesignal/user/internal/e;->Companion:Lcom/onesignal/user/internal/e$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/onesignal/user/internal/e;->Companion:Lcom/onesignal/user/internal/e$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/onesignal/user/internal/e$a;->createFakePushSub()Lv6/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Lcom/onesignal/user/internal/b;-><init>(Lv6/d;)V

    .line 8
    .line 9
    .line 10
    return-void
    .line 11
    .line 12
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
