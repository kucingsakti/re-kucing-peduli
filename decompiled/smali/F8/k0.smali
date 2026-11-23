.class public abstract LF8/k0;
.super LF8/s;
.source "SourceFile"

# interfaces
.implements LC8/u;


# static fields
.field public static final z:Ljava/lang/Object;


# instance fields
.field public final t:LF8/D;

.field public final u:Ljava/lang/String;

.field public final v:Ljava/lang/String;

.field public final w:Ljava/lang/Object;

.field public final x:Ljava/lang/Object;

.field public final y:LF8/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LF8/k0;->z:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
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

.method public constructor <init>(LF8/D;LO8/K;)V
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptor"

    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p2}, LO8/o;->getName()Lj9/f;

    move-result-object v0

    invoke-virtual {v0}, Lj9/f;->g()Ljava/lang/String;

    move-result-object v3

    const-string v0, "descriptor.name.asString()"

    invoke-static {v3, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-static {p2}, LF8/w0;->b(LL8/K;)LF8/t0;

    move-result-object v0

    invoke-virtual {v0}, LF8/t0;->d()Ljava/lang/String;

    move-result-object v4

    .line 11
    sget-object v6, Lv8/a;->s:Lv8/a;

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    .line 12
    invoke-direct/range {v1 .. v6}, LF8/k0;-><init>(LF8/D;Ljava/lang/String;Ljava/lang/String;LO8/K;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(LF8/D;Ljava/lang/String;Ljava/lang/String;LO8/K;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LF8/s;-><init>()V

    .line 2
    iput-object p1, p0, LF8/k0;->t:LF8/D;

    .line 3
    iput-object p2, p0, LF8/k0;->u:Ljava/lang/String;

    .line 4
    iput-object p3, p0, LF8/k0;->v:Ljava/lang/String;

    .line 5
    iput-object p5, p0, LF8/k0;->w:Ljava/lang/Object;

    .line 6
    sget-object p1, Lh8/e;->s:Lh8/e;

    new-instance p2, LF8/j0;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, LF8/j0;-><init>(LF8/k0;I)V

    invoke-static {p1, p2}, LD3/b;->r(Lh8/e;Lu8/a;)Lh8/d;

    move-result-object p1

    iput-object p1, p0, LF8/k0;->x:Ljava/lang/Object;

    .line 7
    new-instance p1, LF8/j0;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, LF8/j0;-><init>(LF8/k0;I)V

    invoke-static {p4, p1}, LF8/t0;->j(LL8/c;Lu8/a;)LF8/r0;

    move-result-object p1

    iput-object p1, p0, LF8/k0;->y:LF8/r0;

    return-void
.end method

.method public constructor <init>(LF8/D;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 7

    const-string v0, "container"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signature"

    invoke-static {p3, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p4

    .line 8
    invoke-direct/range {v1 .. v6}, LF8/k0;-><init>(LF8/D;Ljava/lang/String;Ljava/lang/String;LO8/K;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final c()LG8/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF8/k0;->m()LF8/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LF8/g0;->c()LG8/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
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

.method public final d()LF8/D;
    .locals 1

    .line 1
    iget-object v0, p0, LF8/k0;->t:LF8/D;

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

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    invoke-static {p1}, LF8/y0;->c(Ljava/lang/Object;)LF8/k0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v1, p0, LF8/k0;->t:LF8/D;

    .line 10
    .line 11
    iget-object v2, p1, LF8/k0;->t:LF8/D;

    .line 12
    .line 13
    invoke-static {v1, v2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    iget-object v1, p0, LF8/k0;->u:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p1, LF8/k0;->u:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v1, v2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    iget-object v1, p0, LF8/k0;->v:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v2, p1, LF8/k0;->v:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v1, v2}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    iget-object v1, p0, LF8/k0;->w:Ljava/lang/Object;

    .line 40
    .line 41
    iget-object p1, p1, LF8/k0;->w:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-static {v1, p1}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_1

    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    return p1

    .line 51
    :cond_1
    return v0
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
    .line 89
    .line 90
.end method

.method public final f()LG8/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF8/k0;->m()LF8/g0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    return-object v0
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

.method public final bridge synthetic g()LL8/c;
    .locals 1

    .line 1
    invoke-virtual {p0}, LF8/k0;->l()LL8/K;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LF8/k0;->u:Ljava/lang/String;

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

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, LF8/k0;->t:LF8/D;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, LF8/k0;->u:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Ly/a;->a(ILjava/lang/String;I)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p0, LF8/k0;->v:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/2addr v1, v0

    .line 23
    return v1
    .line 24
    .line 25
    .line 26
.end method

.method public final j()Z
    .locals 2

    .line 1
    sget-object v0, Lv8/a;->s:Lv8/a;

    .line 2
    .line 3
    iget-object v1, p0, LF8/k0;->w:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {v1, v0}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    xor-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    return v0
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

.method public final k()Ljava/lang/reflect/Member;
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0}, LF8/k0;->l()LL8/K;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-interface {v1}, LL8/K;->m0()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    sget-object v1, LF8/w0;->a:Lj9/b;

    .line 15
    .line 16
    invoke-virtual {p0}, LF8/k0;->l()LL8/K;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v1}, LF8/w0;->b(LL8/K;)LF8/t0;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    instance-of v3, v1, LF8/n;

    .line 25
    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    check-cast v1, LF8/n;

    .line 29
    .line 30
    iget-object v3, v1, LF8/n;->v:Lh9/e;

    .line 31
    .line 32
    iget v4, v3, Lh9/e;->t:I

    .line 33
    .line 34
    const/16 v5, 0x10

    .line 35
    .line 36
    and-int/2addr v4, v5

    .line 37
    if-ne v4, v5, :cond_2

    .line 38
    .line 39
    iget-object v3, v3, Lh9/e;->y:Lh9/c;

    .line 40
    .line 41
    iget v4, v3, Lh9/c;->t:I

    .line 42
    .line 43
    and-int/lit8 v5, v4, 0x1

    .line 44
    .line 45
    if-ne v5, v0, :cond_1

    .line 46
    .line 47
    const/4 v0, 0x2

    .line 48
    and-int/2addr v4, v0

    .line 49
    if-ne v4, v0, :cond_1

    .line 50
    .line 51
    iget v0, v3, Lh9/c;->u:I

    .line 52
    .line 53
    iget-object v1, v1, LF8/n;->w:Lg9/f;

    .line 54
    .line 55
    invoke-interface {v1, v0}, Lg9/f;->getString(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget v2, v3, Lh9/c;->v:I

    .line 60
    .line 61
    invoke-interface {v1, v2}, Lg9/f;->getString(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    iget-object v2, p0, LF8/k0;->t:LF8/D;

    .line 66
    .line 67
    invoke-virtual {v2, v0, v1}, LF8/D;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0

    .line 72
    :cond_1
    return-object v2

    .line 73
    :cond_2
    iget-object v0, p0, LF8/k0;->x:Ljava/lang/Object;

    .line 74
    .line 75
    invoke-interface {v0}, Lh8/d;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    check-cast v0, Ljava/lang/reflect/Field;

    .line 80
    .line 81
    return-object v0
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method

.method public final l()LL8/K;
    .locals 2

    .line 1
    iget-object v0, p0, LF8/k0;->y:LF8/r0;

    .line 2
    .line 3
    invoke-virtual {v0}, LF8/r0;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "_descriptor()"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast v0, LL8/K;

    .line 13
    .line 14
    return-object v0
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

.method public abstract m()LF8/g0;
.end method

.method public final t()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, LF8/v0;->a:Ll9/g;

    .line 2
    .line 3
    invoke-virtual {p0}, LF8/k0;->l()LL8/K;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, LF8/v0;->c(LL8/K;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
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
