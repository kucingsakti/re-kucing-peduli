.class public final LX9/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final A:LX9/L;

.field public final B:LX9/L;

.field public final C:J

.field public final D:J

.field public final E:Lo4/r;

.field public F:LX9/h;

.field public final s:LX9/G;

.field public final t:LX9/F;

.field public final u:Ljava/lang/String;

.field public final v:I

.field public final w:LX9/v;

.field public final x:LX9/w;

.field public final y:LX9/O;

.field public final z:LX9/L;


# direct methods
.method public constructor <init>(LX9/G;LX9/F;Ljava/lang/String;ILX9/v;LX9/w;LX9/O;LX9/L;LX9/L;LX9/L;JJLo4/r;)V
    .locals 1

    .line 1
    const-string v0, "request"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "protocol"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "message"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LX9/L;->s:LX9/G;

    .line 20
    .line 21
    iput-object p2, p0, LX9/L;->t:LX9/F;

    .line 22
    .line 23
    iput-object p3, p0, LX9/L;->u:Ljava/lang/String;

    .line 24
    .line 25
    iput p4, p0, LX9/L;->v:I

    .line 26
    .line 27
    iput-object p5, p0, LX9/L;->w:LX9/v;

    .line 28
    .line 29
    iput-object p6, p0, LX9/L;->x:LX9/w;

    .line 30
    .line 31
    iput-object p7, p0, LX9/L;->y:LX9/O;

    .line 32
    .line 33
    iput-object p8, p0, LX9/L;->z:LX9/L;

    .line 34
    .line 35
    iput-object p9, p0, LX9/L;->A:LX9/L;

    .line 36
    .line 37
    iput-object p10, p0, LX9/L;->B:LX9/L;

    .line 38
    .line 39
    iput-wide p11, p0, LX9/L;->C:J

    .line 40
    .line 41
    iput-wide p13, p0, LX9/L;->D:J

    .line 42
    .line 43
    move-object/from16 p1, p15

    .line 44
    .line 45
    iput-object p1, p0, LX9/L;->E:Lo4/r;

    .line 46
    .line 47
    return-void
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
    .line 87
    .line 88
.end method

.method public static b(LX9/L;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, LX9/L;->x:LX9/w;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, LX9/w;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    :cond_0
    return-object p0
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
.method public final a()LX9/h;
    .locals 1

    .line 1
    iget-object v0, p0, LX9/L;->F:LX9/h;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget v0, LX9/h;->n:I

    .line 6
    .line 7
    iget-object v0, p0, LX9/L;->x:LX9/w;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/bumptech/glide/c;->j(LX9/w;)LX9/h;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, LX9/L;->F:LX9/h;

    .line 14
    .line 15
    :cond_0
    return-object v0
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

.method public final c()Z
    .locals 3

    .line 1
    const/16 v0, 0xc8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, LX9/L;->v:I

    .line 5
    .line 6
    if-gt v0, v2, :cond_0

    .line 7
    .line 8
    const/16 v0, 0x12c

    .line 9
    .line 10
    if-ge v2, v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_0
    return v1
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

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, LX9/L;->y:LX9/O;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LX9/O;->close()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v1, "response is not eligible for a body and must not be closed"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
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

.method public final g()LX9/K;
    .locals 3

    .line 1
    new-instance v0, LX9/K;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LX9/L;->s:LX9/G;

    .line 7
    .line 8
    iput-object v1, v0, LX9/K;->a:LX9/G;

    .line 9
    .line 10
    iget-object v1, p0, LX9/L;->t:LX9/F;

    .line 11
    .line 12
    iput-object v1, v0, LX9/K;->b:LX9/F;

    .line 13
    .line 14
    iget v1, p0, LX9/L;->v:I

    .line 15
    .line 16
    iput v1, v0, LX9/K;->c:I

    .line 17
    .line 18
    iget-object v1, p0, LX9/L;->u:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v1, v0, LX9/K;->d:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v1, p0, LX9/L;->w:LX9/v;

    .line 23
    .line 24
    iput-object v1, v0, LX9/K;->e:LX9/v;

    .line 25
    .line 26
    iget-object v1, p0, LX9/L;->x:LX9/w;

    .line 27
    .line 28
    invoke-virtual {v1}, LX9/w;->g()LM1/c;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, v0, LX9/K;->f:LM1/c;

    .line 33
    .line 34
    iget-object v1, p0, LX9/L;->y:LX9/O;

    .line 35
    .line 36
    iput-object v1, v0, LX9/K;->g:LX9/O;

    .line 37
    .line 38
    iget-object v1, p0, LX9/L;->z:LX9/L;

    .line 39
    .line 40
    iput-object v1, v0, LX9/K;->h:LX9/L;

    .line 41
    .line 42
    iget-object v1, p0, LX9/L;->A:LX9/L;

    .line 43
    .line 44
    iput-object v1, v0, LX9/K;->i:LX9/L;

    .line 45
    .line 46
    iget-object v1, p0, LX9/L;->B:LX9/L;

    .line 47
    .line 48
    iput-object v1, v0, LX9/K;->j:LX9/L;

    .line 49
    .line 50
    iget-wide v1, p0, LX9/L;->C:J

    .line 51
    .line 52
    iput-wide v1, v0, LX9/K;->k:J

    .line 53
    .line 54
    iget-wide v1, p0, LX9/L;->D:J

    .line 55
    .line 56
    iput-wide v1, v0, LX9/K;->l:J

    .line 57
    .line 58
    iget-object v1, p0, LX9/L;->E:Lo4/r;

    .line 59
    .line 60
    iput-object v1, v0, LX9/K;->m:Lo4/r;

    .line 61
    .line 62
    return-object v0
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Response{protocol="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LX9/L;->t:LX9/F;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", code="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, LX9/L;->v:I

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", message="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, LX9/L;->u:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", url="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, LX9/L;->s:LX9/G;

    .line 39
    .line 40
    iget-object v1, v1, LX9/G;->a:LX9/y;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const/16 v1, 0x7d

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0
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
