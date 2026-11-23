.class public final LU7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LJ7/i;
.implements LL7/b;
.implements LJ7/k;


# instance fields
.field public final synthetic s:I

.field public final t:Ljava/util/concurrent/atomic/AtomicReference;

.field public u:LL7/b;


# direct methods
.method public constructor <init>(LJ7/b;I)V
    .locals 0

    .line 1
    iput p2, p0, LU7/e;->s:I

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 10
    .line 11
    iput-object p1, p0, LU7/e;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 18
    .line 19
    iput-object p1, p0, LU7/e;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget v0, p0, LU7/e;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU7/e;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-interface {v0}, LJ7/b;->a()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    sget-object v0, LO7/b;->s:LO7/b;

    .line 13
    .line 14
    iput-object v0, p0, LU7/e;->u:LL7/b;

    .line 15
    .line 16
    iget-object v0, p0, LU7/e;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    invoke-interface {v0}, LJ7/b;->a()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 24
    .line 25
    .line 26
.end method

.method public final b(LL7/b;)V
    .locals 1

    .line 1
    iget v0, p0, LU7/e;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LU7/e;->u:LL7/b;

    .line 7
    .line 8
    iget-object p1, p0, LU7/e;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    .line 10
    invoke-interface {p1, p0}, LJ7/b;->b(LL7/b;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object v0, p0, LU7/e;->u:LL7/b;

    .line 15
    .line 16
    invoke-static {v0, p1}, LO7/b;->k(LL7/b;LL7/b;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iput-object p1, p0, LU7/e;->u:LL7/b;

    .line 23
    .line 24
    iget-object p1, p0, LU7/e;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    invoke-interface {p1, p0}, LJ7/b;->b(LL7/b;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 32
    .line 33
.end method

.method public c(Ljava/lang/Object;)V
    .locals 0

    .line 1
    sget-object p1, LO7/b;->s:LO7/b;

    .line 2
    .line 3
    iput-object p1, p0, LU7/e;->u:LL7/b;

    .line 4
    .line 5
    iget-object p1, p0, LU7/e;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-interface {p1}, LJ7/b;->a()V

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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public d(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final f()V
    .locals 1

    .line 1
    iget v0, p0, LU7/e;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU7/e;->u:LL7/b;

    .line 7
    .line 8
    invoke-interface {v0}, LL7/b;->f()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object v0, p0, LU7/e;->u:LL7/b;

    .line 13
    .line 14
    invoke-interface {v0}, LL7/b;->f()V

    .line 15
    .line 16
    .line 17
    sget-object v0, LO7/b;->s:LO7/b;

    .line 18
    .line 19
    iput-object v0, p0, LU7/e;->u:LL7/b;

    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 24
    .line 25
    .line 26
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget v0, p0, LU7/e;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LU7/e;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    invoke-interface {v0, p1}, LJ7/b;->onError(Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    sget-object v0, LO7/b;->s:LO7/b;

    .line 13
    .line 14
    iput-object v0, p0, LU7/e;->u:LL7/b;

    .line 15
    .line 16
    iget-object v0, p0, LU7/e;->t:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    invoke-interface {v0, p1}, LJ7/b;->onError(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
