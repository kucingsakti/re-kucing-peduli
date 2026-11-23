.class public final Lda/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma/v;


# instance fields
.field public final s:Lma/l;

.field public t:Z

.field public final synthetic u:LB4/e;


# direct methods
.method public constructor <init>(LB4/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "this$0"

    .line 5
    .line 6
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lda/e;->u:LB4/e;

    .line 10
    .line 11
    new-instance v0, Lma/l;

    .line 12
    .line 13
    iget-object p1, p1, LB4/e;->f:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lma/q;

    .line 16
    .line 17
    iget-object p1, p1, Lma/q;->s:Lma/v;

    .line 18
    .line 19
    invoke-interface {p1}, Lma/v;->e()Lma/y;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v0, p1}, Lma/l;-><init>(Lma/y;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lda/e;->s:Lma/l;

    .line 27
    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final C(Lma/f;J)V
    .locals 7

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lda/e;->t:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-wide v1, p1, Lma/f;->t:J

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    move-wide v5, p2

    .line 15
    invoke-static/range {v1 .. v6}, LY9/c;->c(JJJ)V

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Lda/e;->u:LB4/e;

    .line 19
    .line 20
    iget-object p2, p2, LB4/e;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p2, Lma/q;

    .line 23
    .line 24
    invoke-virtual {p2, p1, v5, v6}, Lma/q;->C(Lma/f;J)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string p2, "closed"

    .line 31
    .line 32
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw p1
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

.method public final close()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lda/e;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lda/e;->t:Z

    .line 8
    .line 9
    iget-object v0, p0, Lda/e;->u:LB4/e;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Lda/e;->s:Lma/l;

    .line 15
    .line 16
    iget-object v2, v1, Lma/l;->e:Lma/y;

    .line 17
    .line 18
    sget-object v3, Lma/y;->d:Lma/x;

    .line 19
    .line 20
    iput-object v3, v1, Lma/l;->e:Lma/y;

    .line 21
    .line 22
    invoke-virtual {v2}, Lma/y;->a()Lma/y;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Lma/y;->b()Lma/y;

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x3

    .line 29
    iput v1, v0, LB4/e;->c:I

    .line 30
    .line 31
    return-void
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
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method

.method public final e()Lma/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lda/e;->s:Lma/l;

    .line 2
    .line 3
    return-object v0
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
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lda/e;->t:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Lda/e;->u:LB4/e;

    .line 7
    .line 8
    iget-object v0, v0, LB4/e;->f:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lma/q;

    .line 11
    .line 12
    invoke-virtual {v0}, Lma/q;->flush()V

    .line 13
    .line 14
    .line 15
    return-void
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
