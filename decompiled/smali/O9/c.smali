.class public final synthetic LO9/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN9/K;


# instance fields
.field public final synthetic s:LO9/d;

.field public final synthetic t:LN9/u0;


# direct methods
.method public synthetic constructor <init>(LO9/d;LN9/u0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LO9/c;->s:LO9/d;

    iput-object p2, p0, LO9/c;->t:LN9/u0;

    return-void
.end method


# virtual methods
.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, LO9/c;->s:LO9/d;

    .line 2
    .line 3
    iget-object v0, v0, LO9/d;->t:Landroid/os/Handler;

    .line 4
    .line 5
    iget-object v1, p0, LO9/c;->t:LN9/u0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

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
