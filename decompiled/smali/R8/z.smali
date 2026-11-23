.class public final LR8/z;
.super LR8/v;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "recordComponent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LR8/z;->a:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
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


# virtual methods
.method public final b()Ljava/lang/reflect/Member;
    .locals 8

    .line 1
    iget-object v0, p0, LR8/z;->a:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "recordComponent"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lo1/f;->a:Lo1/k;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :try_start_0
    new-instance v4, Lo1/k;

    .line 19
    .line 20
    const-string v5, "getType"

    .line 21
    .line 22
    new-array v6, v3, [Ljava/lang/Class;

    .line 23
    .line 24
    invoke-virtual {v1, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const-string v6, "getAccessor"

    .line 29
    .line 30
    new-array v7, v3, [Ljava/lang/Class;

    .line 31
    .line 32
    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-direct {v4, v5, v1}, Lo1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    move-object v1, v4

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    new-instance v1, Lo1/k;

    .line 42
    .line 43
    invoke-direct {v1, v2, v2}, Lo1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    sput-object v1, Lo1/f;->a:Lo1/k;

    .line 47
    .line 48
    :cond_0
    iget-object v1, v1, Lo1/k;->t:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/lang/reflect/Method;

    .line 51
    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-array v2, v3, [Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "null cannot be cast to non-null type java.lang.reflect.Method"

    .line 62
    .line 63
    invoke-static {v0, v1}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    move-object v2, v0

    .line 67
    check-cast v2, Ljava/lang/reflect/Method;

    .line 68
    .line 69
    :goto_1
    if-eqz v2, :cond_2

    .line 70
    .line 71
    return-object v2

    .line 72
    :cond_2
    new-instance v0, Ljava/lang/NoSuchMethodError;

    .line 73
    .line 74
    const-string v1, "Can\'t find `getAccessor` method"

    .line 75
    .line 76
    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodError;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v0
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method

.method public final f()La9/d;
    .locals 8

    .line 1
    iget-object v0, p0, LR8/z;->a:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "recordComponent"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sget-object v1, Lo1/f;->a:Lo1/k;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :try_start_0
    new-instance v4, Lo1/k;

    .line 19
    .line 20
    const-string v5, "getType"

    .line 21
    .line 22
    new-array v6, v3, [Ljava/lang/Class;

    .line 23
    .line 24
    invoke-virtual {v1, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    const-string v6, "getAccessor"

    .line 29
    .line 30
    new-array v7, v3, [Ljava/lang/Class;

    .line 31
    .line 32
    invoke-virtual {v1, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-direct {v4, v5, v1}, Lo1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    .line 39
    move-object v1, v4

    .line 40
    goto :goto_0

    .line 41
    :catch_0
    new-instance v1, Lo1/k;

    .line 42
    .line 43
    invoke-direct {v1, v2, v2}, Lo1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :goto_0
    sput-object v1, Lo1/f;->a:Lo1/k;

    .line 47
    .line 48
    :cond_0
    iget-object v1, v1, Lo1/k;->s:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/lang/reflect/Method;

    .line 51
    .line 52
    if-nez v1, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    new-array v2, v3, [Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    const-string v1, "null cannot be cast to non-null type java.lang.Class<*>"

    .line 62
    .line 63
    invoke-static {v0, v1}, Lv8/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    move-object v2, v0

    .line 67
    check-cast v2, Ljava/lang/Class;

    .line 68
    .line 69
    :goto_1
    if-eqz v2, :cond_2

    .line 70
    .line 71
    new-instance v0, LR8/p;

    .line 72
    .line 73
    invoke-direct {v0, v2}, LR8/p;-><init>(Ljava/lang/reflect/Type;)V

    .line 74
    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_2
    new-instance v0, Ljava/lang/NoSuchMethodError;

    .line 78
    .line 79
    const-string v1, "Can\'t find `getType` method"

    .line 80
    .line 81
    invoke-direct {v0, v1}, Ljava/lang/NoSuchMethodError;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0
    .line 85
    .line 86
.end method
