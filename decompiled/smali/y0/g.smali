.class public final Ly0/g;
.super Landroidx/lifecycle/U;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/T;


# instance fields
.field public s:LN0/e;

.field public t:Landroidx/lifecycle/u;


# virtual methods
.method public final a(Landroidx/lifecycle/Q;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ly0/g;->s:LN0/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Ly0/g;->t:Landroidx/lifecycle/u;

    .line 6
    .line 7
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0, v1}, Landroidx/lifecycle/L;->a(Landroidx/lifecycle/Q;LN0/e;Landroidx/lifecycle/u;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
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

.method public final e(Ljava/lang/Class;)Landroidx/lifecycle/Q;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Ly0/g;->t:Landroidx/lifecycle/u;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Ly0/g;->s:LN0/e;

    .line 12
    .line 13
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Ly0/g;->t:Landroidx/lifecycle/u;

    .line 17
    .line 18
    invoke-static {v1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    invoke-static {v0, v1, p1, v2}, Landroidx/lifecycle/L;->b(LN0/e;Landroidx/lifecycle/u;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/K;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object v0, p1, Landroidx/lifecycle/K;->t:Landroidx/lifecycle/J;

    .line 27
    .line 28
    new-instance v1, Ly0/h;

    .line 29
    .line 30
    invoke-direct {v1, v0}, Ly0/h;-><init>(Landroidx/lifecycle/J;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Landroidx/lifecycle/Q;->a(Landroidx/lifecycle/K;)V

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 38
    .line 39
    const-string v0, "AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras)."

    .line 40
    .line 41
    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    const-string v0, "Local and anonymous classes can not be ViewModels"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
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

.method public final g(LC8/c;Lu0/b;)Landroidx/lifecycle/Q;
    .locals 0

    .line 1
    invoke-static {p1}, Lga/d;->o(LC8/c;)Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, Ly0/g;->i(Ljava/lang/Class;Lu0/b;)Landroidx/lifecycle/Q;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
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

.method public final i(Ljava/lang/Class;Lu0/b;)Landroidx/lifecycle/Q;
    .locals 2

    .line 1
    sget-object p1, Lv0/b;->a:Lv0/b;

    .line 2
    .line 3
    iget-object v0, p2, LB1/a;->s:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    iget-object v0, p0, Ly0/g;->s:LN0/e;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-static {v0}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p2, p0, Ly0/g;->t:Landroidx/lifecycle/u;

    .line 23
    .line 24
    invoke-static {p2}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-static {v0, p2, p1, v1}, Landroidx/lifecycle/L;->b(LN0/e;Landroidx/lifecycle/u;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/lifecycle/K;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iget-object p2, p1, Landroidx/lifecycle/K;->t:Landroidx/lifecycle/J;

    .line 33
    .line 34
    new-instance v0, Ly0/h;

    .line 35
    .line 36
    invoke-direct {v0, p2}, Ly0/h;-><init>(Landroidx/lifecycle/J;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Landroidx/lifecycle/Q;->a(Landroidx/lifecycle/K;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_0
    invoke-static {p2}, Landroidx/lifecycle/L;->d(Lu0/b;)Landroidx/lifecycle/J;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance p2, Ly0/h;

    .line 48
    .line 49
    invoke-direct {p2, p1}, Ly0/h;-><init>(Landroidx/lifecycle/J;)V

    .line 50
    .line 51
    .line 52
    return-object p2

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-string p2, "VIEW_MODEL_KEY must always be provided by ViewModelProvider"

    .line 56
    .line 57
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p1
.end method
