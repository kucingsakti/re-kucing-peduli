.class public abstract Lda/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lma/w;


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
    iput-object p1, p0, Lda/a;->u:LB4/e;

    .line 10
    .line 11
    new-instance v0, Lma/l;

    .line 12
    .line 13
    iget-object p1, p1, LB4/e;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lma/r;

    .line 16
    .line 17
    iget-object p1, p1, Lma/r;->s:Lma/w;

    .line 18
    .line 19
    invoke-interface {p1}, Lma/w;->e()Lma/y;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {v0, p1}, Lma/l;-><init>(Lma/y;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lda/a;->s:Lma/l;

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
.method public final a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lda/a;->u:LB4/e;

    .line 2
    .line 3
    iget v1, v0, LB4/e;->c:I

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    if-ne v1, v2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const/4 v3, 0x5

    .line 10
    if-ne v1, v3, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lda/a;->s:Lma/l;

    .line 13
    .line 14
    iget-object v3, v1, Lma/l;->e:Lma/y;

    .line 15
    .line 16
    sget-object v4, Lma/y;->d:Lma/x;

    .line 17
    .line 18
    iput-object v4, v1, Lma/l;->e:Lma/y;

    .line 19
    .line 20
    invoke-virtual {v3}, Lma/y;->a()Lma/y;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v3}, Lma/y;->b()Lma/y;

    .line 24
    .line 25
    .line 26
    iput v2, v0, LB4/e;->c:I

    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 30
    .line 31
    iget v0, v0, LB4/e;->c:I

    .line 32
    .line 33
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v2, "state: "

    .line 38
    .line 39
    invoke-static {v0, v2}, Lv8/i;->k(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v1
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
    iget-object v0, p0, Lda/a;->s:Lma/l;

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

.method public u(Lma/f;J)J
    .locals 2

    .line 1
    iget-object v0, p0, Lda/a;->u:LB4/e;

    .line 2
    .line 3
    const-string v1, "sink"

    .line 4
    .line 5
    invoke-static {p1, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    iget-object v1, v0, LB4/e;->e:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Lma/r;

    .line 11
    .line 12
    invoke-virtual {v1, p1, p2, p3}, Lma/r;->u(Lma/f;J)J

    .line 13
    .line 14
    .line 15
    move-result-wide p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-wide p1

    .line 17
    :catch_0
    move-exception p1

    .line 18
    iget-object p2, v0, LB4/e;->d:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p2, Lba/k;

    .line 21
    .line 22
    invoke-virtual {p2}, Lba/k;->l()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lda/a;->a()V

    .line 26
    .line 27
    .line 28
    throw p1
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
