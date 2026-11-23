.class public final Lq0/g;
.super Lq0/T;
.source "SourceFile"


# instance fields
.field public final c:Lq0/e;

.field public d:Landroid/animation/AnimatorSet;


# direct methods
.method public constructor <init>(Lq0/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq0/g;->c:Lq0/e;

    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final a(Landroid/view/ViewGroup;)V
    .locals 3

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lq0/g;->d:Landroid/animation/AnimatorSet;

    .line 7
    .line 8
    iget-object v0, p0, Lq0/g;->c:Lq0/e;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    iget-object p1, v0, LB1/a;->s:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p1, Lq0/U;

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lq0/U;->c(Lq0/T;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, v0, LB1/a;->s:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lq0/U;

    .line 23
    .line 24
    iget-boolean v1, v0, Lq0/U;->g:Z

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v2, 0x1a

    .line 31
    .line 32
    if-lt v1, v2, :cond_2

    .line 33
    .line 34
    sget-object v1, Lq0/i;->a:Lq0/i;

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Lq0/i;->a(Landroid/animation/AnimatorSet;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {p1}, Landroid/animation/AnimatorSet;->end()V

    .line 41
    .line 42
    .line 43
    :cond_2
    :goto_0
    const/4 p1, 0x2

    .line 44
    invoke-static {p1}, Landroidx/fragment/app/e;->K(I)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_3

    .line 49
    .line 50
    invoke-virtual {v0}, Lq0/U;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
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

.method public final b(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lq0/g;->c:Lq0/e;

    .line 7
    .line 8
    iget-object p1, p1, LB1/a;->s:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lq0/U;

    .line 11
    .line 12
    iget-object v0, p0, Lq0/g;->d:Landroid/animation/AnimatorSet;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1, p0}, Lq0/U;->c(Lq0/T;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    invoke-virtual {v0}, Landroid/animation/AnimatorSet;->start()V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    invoke-static {v0}, Landroidx/fragment/app/e;->K(I)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final c(Ld/b;Landroid/view/ViewGroup;)V
    .locals 8

    .line 1
    const-string v0, "backEvent"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "container"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p2, p0, Lq0/g;->c:Lq0/e;

    .line 12
    .line 13
    iget-object v0, p0, Lq0/g;->d:Landroid/animation/AnimatorSet;

    .line 14
    .line 15
    iget-object p2, p2, LB1/a;->s:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p2, Lq0/U;

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p2, p0}, Lq0/U;->c(Lq0/T;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v2, 0x22

    .line 28
    .line 29
    if-lt v1, v2, :cond_5

    .line 30
    .line 31
    iget-object v1, p2, Lq0/U;->c:Landroidx/fragment/app/b;

    .line 32
    .line 33
    iget-boolean v1, v1, Landroidx/fragment/app/b;->F:Z

    .line 34
    .line 35
    if-eqz v1, :cond_5

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    invoke-static {v1}, Landroidx/fragment/app/e;->K(I)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {p2}, Lq0/U;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    :cond_1
    sget-object v2, Lq0/h;->a:Lq0/h;

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Lq0/h;->a(Landroid/animation/AnimatorSet;)J

    .line 50
    .line 51
    .line 52
    move-result-wide v2

    .line 53
    long-to-float v4, v2

    .line 54
    iget p1, p1, Ld/b;->c:F

    .line 55
    .line 56
    mul-float/2addr p1, v4

    .line 57
    float-to-long v4, p1

    .line 58
    const-wide/16 v6, 0x0

    .line 59
    .line 60
    cmp-long p1, v4, v6

    .line 61
    .line 62
    const-wide/16 v6, 0x1

    .line 63
    .line 64
    if-nez p1, :cond_2

    .line 65
    .line 66
    move-wide v4, v6

    .line 67
    :cond_2
    cmp-long p1, v4, v2

    .line 68
    .line 69
    if-nez p1, :cond_3

    .line 70
    .line 71
    sub-long v4, v2, v6

    .line 72
    .line 73
    :cond_3
    invoke-static {v1}, Landroidx/fragment/app/e;->K(I)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_4

    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Lq0/U;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    :cond_4
    sget-object p1, Lq0/i;->a:Lq0/i;

    .line 86
    .line 87
    invoke-virtual {p1, v0, v4, v5}, Lq0/i;->b(Landroid/animation/AnimatorSet;J)V

    .line 88
    .line 89
    .line 90
    :cond_5
    return-void
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
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
.end method

.method public final d(Landroid/view/ViewGroup;)V
    .locals 7

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq0/g;->c:Lq0/e;

    .line 7
    .line 8
    invoke-virtual {v0}, LB1/a;->Q0()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    move-object v6, p0

    .line 15
    goto :goto_4

    .line 16
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "context"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lq0/e;->X0(Landroid/content/Context;)Lo1/c;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, v1, Lo1/c;->u:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Landroid/animation/AnimatorSet;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    :goto_0
    iput-object v1, p0, Lq0/g;->d:Landroid/animation/AnimatorSet;

    .line 38
    .line 39
    iget-object v0, v0, LB1/a;->s:Ljava/lang/Object;

    .line 40
    .line 41
    move-object v5, v0

    .line 42
    check-cast v5, Lq0/U;

    .line 43
    .line 44
    iget-object v0, v5, Lq0/U;->c:Landroidx/fragment/app/b;

    .line 45
    .line 46
    iget v1, v5, Lq0/U;->a:I

    .line 47
    .line 48
    const/4 v2, 0x3

    .line 49
    if-ne v1, v2, :cond_2

    .line 50
    .line 51
    const/4 v1, 0x1

    .line 52
    :goto_1
    move v4, v1

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/4 v1, 0x0

    .line 55
    goto :goto_1

    .line 56
    :goto_2
    iget-object v3, v0, Landroidx/fragment/app/b;->c0:Landroid/view/View;

    .line 57
    .line 58
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, Lq0/g;->d:Landroid/animation/AnimatorSet;

    .line 62
    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    new-instance v1, Lq0/f;

    .line 66
    .line 67
    move-object v6, p0

    .line 68
    move-object v2, p1

    .line 69
    invoke-direct/range {v1 .. v6}, Lq0/f;-><init>(Landroid/view/ViewGroup;Landroid/view/View;ZLq0/U;Lq0/g;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    move-object v6, p0

    .line 77
    :goto_3
    iget-object p1, v6, Lq0/g;->d:Landroid/animation/AnimatorSet;

    .line 78
    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    invoke-virtual {p1, v3}, Landroid/animation/AnimatorSet;->setTarget(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    :cond_4
    :goto_4
    return-void
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
