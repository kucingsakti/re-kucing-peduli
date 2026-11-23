.class public final LC9/a;
.super LO8/m;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lj9/f;)V
    .locals 14

    .line 1
    sget-object v0, LC9/i;->a:LC9/i;

    .line 2
    .line 3
    sget-object v2, LC9/i;->b:LC9/c;

    .line 4
    .line 5
    sget-object v6, Li8/s;->s:Li8/s;

    .line 6
    .line 7
    sget-object v13, LL8/M;->a:LL8/N;

    .line 8
    .line 9
    sget-object v7, Lz9/l;->e:Lz9/b;

    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x1

    .line 13
    move-object v1, p0

    .line 14
    move-object v3, p1

    .line 15
    invoke-direct/range {v1 .. v7}, LO8/m;-><init>(LL8/j;Lj9/f;IILjava/util/Collection;Lz9/l;)V

    .line 16
    .line 17
    .line 18
    sget-object v10, LM8/g;->a:LM8/f;

    .line 19
    .line 20
    new-instance v7, LO8/k;

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v11, 0x1

    .line 24
    const/4 v12, 0x1

    .line 25
    move-object v8, p0

    .line 26
    invoke-direct/range {v7 .. v13}, LO8/k;-><init>(LL8/e;LL8/i;LM8/h;ZILL8/M;)V

    .line 27
    .line 28
    .line 29
    move-object p1, v7

    .line 30
    move-object v1, v8

    .line 31
    sget-object v0, LL8/o;->d:LL8/n;

    .line 32
    .line 33
    invoke-virtual {p1, v6, v0}, LO8/k;->n1(Ljava/util/List;LL8/n;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, LO8/o;->getName()Lj9/f;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iget-object v0, v0, Lj9/f;->s:Ljava/lang/String;

    .line 41
    .line 42
    const-string v2, "errorConstructor.name.toString()"

    .line 43
    .line 44
    invoke-static {v0, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v2, ""

    .line 48
    .line 49
    filled-new-array {v0, v2}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const/16 v2, 0x9

    .line 54
    .line 55
    invoke-static {v0, v2}, LC9/i;->b([Ljava/lang/String;I)LC9/e;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    new-instance v3, LC9/f;

    .line 60
    .line 61
    move-object v7, v6

    .line 62
    sget-object v6, LC9/h;->N:LC9/h;

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    new-array v2, v0, [Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v6, v2}, LC9/i;->d(LC9/h;[Ljava/lang/String;)LC9/g;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    new-array v9, v0, [Ljava/lang/String;

    .line 72
    .line 73
    const/4 v8, 0x0

    .line 74
    invoke-direct/range {v3 .. v9}, LC9/f;-><init>(LA9/O;LC9/e;LC9/h;Ljava/util/List;Z[Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iput-object v3, p1, LO8/w;->y:LA9/y;

    .line 78
    .line 79
    invoke-static {p1}, Li8/C;->w(Ljava/lang/Object;)Ljava/util/Set;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {p0, v5, v0, p1}, LO8/m;->l(Lt9/n;Ljava/util/Set;LO8/k;)V

    .line 84
    .line 85
    .line 86
    return-void
    .line 87
    .line 88
    .line 89
    .line 90
.end method


# virtual methods
.method public final a(LA9/W;LB9/f;)Lt9/n;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO8/b;->getName()Lj9/f;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object p2, p2, Lj9/f;->s:Ljava/lang/String;

    .line 6
    .line 7
    const-string v0, "name.toString()"

    .line 8
    .line 9
    invoke-static {p2, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    filled-new-array {p2, p1}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const/16 p2, 0x9

    .line 21
    .line 22
    invoke-static {p1, p2}, LC9/i;->b([Ljava/lang/String;I)LC9/e;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1
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

.method public final i(LA9/Z;)LL8/e;
    .locals 1

    .line 1
    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final j(LA9/Z;)LL8/k;
    .locals 1

    .line 1
    const-string v0, "substitutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, LO8/b;->getName()Lj9/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lj9/f;->g()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "name.asString()"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
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
