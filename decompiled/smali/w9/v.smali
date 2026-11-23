.class public abstract Lw9/v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj9/c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lj9/c;

    .line 2
    .line 3
    const-string v1, "kotlin.suspend"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lj9/c;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lw9/v;->a:Lj9/c;

    .line 9
    .line 10
    new-instance v0, Lj9/a;

    .line 11
    .line 12
    sget-object v1, LI8/o;->k:Lj9/c;

    .line 13
    .line 14
    const-string v2, "suspend"

    .line 15
    .line 16
    invoke-static {v2}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-direct {v0, v1, v2}, Lj9/a;-><init>(Lj9/c;Lj9/f;)V

    .line 21
    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
.end method
