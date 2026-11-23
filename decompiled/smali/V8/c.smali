.class public abstract LV8/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj9/f;

.field public static final b:Lj9/f;

.field public static final c:Lj9/f;

.field public static final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "message"

    .line 2
    .line 3
    invoke-static {v0}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, LV8/c;->a:Lj9/f;

    .line 8
    .line 9
    const-string v0, "allowedTargets"

    .line 10
    .line 11
    invoke-static {v0}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, LV8/c;->b:Lj9/f;

    .line 16
    .line 17
    const-string v0, "value"

    .line 18
    .line 19
    invoke-static {v0}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, LV8/c;->c:Lj9/f;

    .line 24
    .line 25
    sget-object v0, LI8/n;->t:Lj9/c;

    .line 26
    .line 27
    sget-object v1, LU8/x;->c:Lj9/c;

    .line 28
    .line 29
    new-instance v2, Lh8/f;

    .line 30
    .line 31
    invoke-direct {v2, v0, v1}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, LI8/n;->w:Lj9/c;

    .line 35
    .line 36
    sget-object v1, LU8/x;->d:Lj9/c;

    .line 37
    .line 38
    new-instance v3, Lh8/f;

    .line 39
    .line 40
    invoke-direct {v3, v0, v1}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v0, LI8/n;->x:Lj9/c;

    .line 44
    .line 45
    sget-object v1, LU8/x;->f:Lj9/c;

    .line 46
    .line 47
    new-instance v4, Lh8/f;

    .line 48
    .line 49
    invoke-direct {v4, v0, v1}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 v0, 0x3

    .line 53
    new-array v0, v0, [Lh8/f;

    .line 54
    .line 55
    const/4 v1, 0x0

    .line 56
    aput-object v2, v0, v1

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    aput-object v3, v0, v1

    .line 60
    .line 61
    const/4 v1, 0x2

    .line 62
    aput-object v4, v0, v1

    .line 63
    .line 64
    invoke-static {v0}, Li8/y;->w([Lh8/f;)Ljava/util/Map;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, LV8/c;->d:Ljava/lang/Object;

    .line 69
    .line 70
    return-void
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

.method public static a(Lj9/c;La9/b;LFa/e;)LW8/h;
    .locals 2

    .line 1
    const-string v0, "kotlinName"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "annotationOwner"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "c"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, LI8/n;->m:Lj9/c;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lj9/c;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget-object v0, LU8/x;->e:Lj9/c;

    .line 25
    .line 26
    const-string v1, "DEPRECATED_ANNOTATION"

    .line 27
    .line 28
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1, v0}, La9/b;->a(Lj9/c;)LR8/d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance p0, LV8/g;

    .line 39
    .line 40
    invoke-direct {p0, v0, p2}, LV8/g;-><init>(LR8/d;LFa/e;)V

    .line 41
    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    :goto_0
    sget-object v0, LV8/c;->d:Ljava/lang/Object;

    .line 45
    .line 46
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, Lj9/c;

    .line 51
    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    invoke-interface {p1, p0}, La9/b;->a(Lj9/c;)LR8/d;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-eqz p0, :cond_2

    .line 59
    .line 60
    const/4 p1, 0x0

    .line 61
    invoke-static {p2, p0, p1}, LV8/c;->b(LFa/e;LR8/d;Z)LW8/h;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :cond_2
    const/4 p0, 0x0

    .line 67
    return-object p0
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
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
.end method

.method public static b(LFa/e;LR8/d;Z)LW8/h;
    .locals 2

    .line 1
    const-string v0, "annotation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "c"

    .line 7
    .line 8
    invoke-static {p0, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, LR8/d;->a:Ljava/lang/annotation/Annotation;

    .line 12
    .line 13
    invoke-static {v0}, Lga/d;->l(Ljava/lang/annotation/Annotation;)LC8/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lga/d;->o(LC8/c;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, LR8/c;->a(Ljava/lang/Class;)Lj9/b;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sget-object v1, LU8/x;->c:Lj9/c;

    .line 26
    .line 27
    invoke-static {v1}, Lj9/b;->j(Lj9/c;)Lj9/b;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Lj9/b;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    new-instance p2, LV8/j;

    .line 38
    .line 39
    invoke-direct {p2, p1, p0}, LV8/j;-><init>(LR8/d;LFa/e;)V

    .line 40
    .line 41
    .line 42
    return-object p2

    .line 43
    :cond_0
    sget-object v1, LU8/x;->d:Lj9/c;

    .line 44
    .line 45
    invoke-static {v1}, Lj9/b;->j(Lj9/c;)Lj9/b;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Lj9/b;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    if-eqz v1, :cond_1

    .line 54
    .line 55
    new-instance p2, LV8/i;

    .line 56
    .line 57
    invoke-direct {p2, p1, p0}, LV8/i;-><init>(LR8/d;LFa/e;)V

    .line 58
    .line 59
    .line 60
    return-object p2

    .line 61
    :cond_1
    sget-object v1, LU8/x;->f:Lj9/c;

    .line 62
    .line 63
    invoke-static {v1}, Lj9/b;->j(Lj9/c;)Lj9/b;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v0, v1}, Lj9/b;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    new-instance p2, LV8/b;

    .line 74
    .line 75
    sget-object v0, LI8/n;->x:Lj9/c;

    .line 76
    .line 77
    invoke-direct {p2, p0, p1, v0}, LV8/b;-><init>(LFa/e;LR8/d;Lj9/c;)V

    .line 78
    .line 79
    .line 80
    return-object p2

    .line 81
    :cond_2
    sget-object v1, LU8/x;->e:Lj9/c;

    .line 82
    .line 83
    invoke-static {v1}, Lj9/b;->j(Lj9/c;)Lj9/b;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {v0, v1}, Lj9/b;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    const/4 p0, 0x0

    .line 94
    return-object p0

    .line 95
    :cond_3
    new-instance v0, LY8/f;

    .line 96
    .line 97
    invoke-direct {v0, p0, p1, p2}, LY8/f;-><init>(LFa/e;LR8/d;Z)V

    .line 98
    .line 99
    .line 100
    return-object v0
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
.end method
