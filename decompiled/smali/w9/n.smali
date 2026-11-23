.class public final Lw9/n;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/a;


# instance fields
.field public final synthetic s:Lw9/q;

.field public final synthetic t:Z

.field public final synthetic u:Le9/G;


# direct methods
.method public constructor <init>(Lw9/q;ZLe9/G;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw9/n;->s:Lw9/q;

    .line 2
    .line 3
    iput-boolean p2, p0, Lw9/n;->t:Z

    .line 4
    .line 5
    iput-object p3, p0, Lw9/n;->u:Le9/G;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    .line 9
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


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lw9/n;->s:Lw9/q;

    .line 2
    .line 3
    iget-object v1, v0, Lw9/q;->a:LV3/b;

    .line 4
    .line 5
    iget-object v1, v1, LV3/b;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, LL8/j;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lw9/q;->a(LL8/j;)LK0/q;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v0, v0, Lw9/q;->a:LV3/b;

    .line 16
    .line 17
    iget-boolean v2, p0, Lw9/n;->t:Z

    .line 18
    .line 19
    iget-object v3, p0, Lw9/n;->u:Le9/G;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, LI4/c;

    .line 26
    .line 27
    iget-object v0, v0, LI4/c;->e:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v0, Lw9/a;

    .line 30
    .line 31
    invoke-interface {v0, v1, v3}, Lw9/c;->Z(LK0/q;Le9/G;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Iterable;

    .line 36
    .line 37
    invoke-static {v0}, Li8/k;->s0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    iget-object v0, v0, LV3/b;->a:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v0, LI4/c;

    .line 45
    .line 46
    iget-object v0, v0, LI4/c;->e:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lw9/a;

    .line 49
    .line 50
    invoke-interface {v0, v1, v3}, Lw9/c;->l0(LK0/q;Le9/G;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, Ljava/lang/Iterable;

    .line 55
    .line 56
    invoke-static {v0}, Li8/k;->s0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const/4 v0, 0x0

    .line 62
    :goto_0
    if-nez v0, :cond_2

    .line 63
    .line 64
    sget-object v0, Li8/s;->s:Li8/s;

    .line 65
    .line 66
    :cond_2
    return-object v0
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
