.class public final synthetic LH0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic s:LH0/b;

.field public final synthetic t:I

.field public final synthetic u:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(LH0/b;ILjava/io/Serializable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH0/a;->s:LH0/b;

    iput p2, p0, LH0/a;->t:I

    iput-object p3, p0, LH0/a;->u:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LH0/a;->s:LH0/b;

    .line 2
    .line 3
    iget-object v0, v0, LH0/b;->b:LH0/d;

    .line 4
    .line 5
    iget v1, p0, LH0/a;->t:I

    .line 6
    .line 7
    iget-object v2, p0, LH0/a;->u:Ljava/io/Serializable;

    .line 8
    .line 9
    invoke-interface {v0, v1, v2}, LH0/d;->d(ILjava/io/Serializable;)V

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
