.class public final Lc2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LE1/l;


# direct methods
.method public constructor <init>(LE1/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lc2/f;->a:LE1/l;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, LE1/l;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v1}, LE1/l;-><init>(Landroid/content/Context;I)V

    .line 5
    iput-object v0, p0, Lc2/f;->a:LE1/l;

    return-void
.end method
