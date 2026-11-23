.class public abstract Lp7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh7/d;

.field public static final b:Lq7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh7/e;

    .line 2
    .line 3
    invoke-direct {v0}, Lh7/e;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lh7/d;

    .line 7
    .line 8
    invoke-direct {v0}, Lh7/d;-><init>()V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lp7/a;->a:Lh7/d;

    .line 12
    .line 13
    new-instance v0, Lq7/f;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "fetch2"

    .line 19
    .line 20
    iput-object v1, v0, Lq7/f;->a:Ljava/lang/String;

    .line 21
    .line 22
    sput-object v0, Lp7/a;->b:Lq7/f;

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
.end method
