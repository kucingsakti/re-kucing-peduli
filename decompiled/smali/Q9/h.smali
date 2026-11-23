.class public final LQ9/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ9/c;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LQ9/c;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LQ9/c;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LQ9/h;->s:I

    iput-object p1, p0, LQ9/h;->t:LQ9/c;

    iput-object p2, p0, LQ9/h;->u:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm8/d;)Ljava/lang/Object;
    .locals 9

    .line 1
    sget-object v0, Lh8/m;->a:Lh8/m;

    .line 2
    .line 3
    iget-object v1, p0, LQ9/h;->t:LQ9/c;

    .line 4
    .line 5
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    sget-object v4, Ln8/a;->s:Ln8/a;

    .line 9
    .line 10
    const/high16 v5, -0x80000000

    .line 11
    .line 12
    iget v6, p0, LQ9/h;->s:I

    .line 13
    .line 14
    packed-switch v6, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    instance-of v6, p2, Ls4/A;

    .line 18
    .line 19
    if-eqz v6, :cond_0

    .line 20
    .line 21
    move-object v6, p2

    .line 22
    check-cast v6, Ls4/A;

    .line 23
    .line 24
    iget v7, v6, Ls4/A;->t:I

    .line 25
    .line 26
    and-int v8, v7, v5

    .line 27
    .line 28
    if-eqz v8, :cond_0

    .line 29
    .line 30
    sub-int/2addr v7, v5

    .line 31
    iput v7, v6, Ls4/A;->t:I

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    new-instance v6, Ls4/A;

    .line 35
    .line 36
    invoke-direct {v6, p0, p2}, Ls4/A;-><init>(LQ9/h;Lm8/d;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object p2, v6, Ls4/A;->s:Ljava/lang/Object;

    .line 40
    .line 41
    iget v5, v6, Ls4/A;->t:I

    .line 42
    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    if-ne v5, v3, :cond_1

    .line 46
    .line 47
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw p1

    .line 57
    :cond_2
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    check-cast p1, Lh0/b;

    .line 61
    .line 62
    sget-object p2, Ls4/D;->e:Ls4/x;

    .line 63
    .line 64
    iget-object p2, p0, LQ9/h;->u:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p2, Ls4/D;

    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance p2, Ls4/n;

    .line 72
    .line 73
    sget-object v2, Ls4/y;->a:Lh0/e;

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Lh0/b;->a(Lh0/e;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Ljava/lang/String;

    .line 80
    .line 81
    invoke-direct {p2, p1}, Ls4/n;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iput v3, v6, Ls4/A;->t:I

    .line 85
    .line 86
    invoke-interface {v1, p2, v6}, LQ9/c;->a(Ljava/lang/Object;Lm8/d;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    if-ne p1, v4, :cond_3

    .line 91
    .line 92
    move-object v0, v4

    .line 93
    :cond_3
    :goto_1
    return-object v0

    .line 94
    :pswitch_0
    instance-of v6, p2, LQ9/g;

    .line 95
    .line 96
    if-eqz v6, :cond_4

    .line 97
    .line 98
    move-object v6, p2

    .line 99
    check-cast v6, LQ9/g;

    .line 100
    .line 101
    iget v7, v6, LQ9/g;->v:I

    .line 102
    .line 103
    and-int v8, v7, v5

    .line 104
    .line 105
    if-eqz v8, :cond_4

    .line 106
    .line 107
    sub-int/2addr v7, v5

    .line 108
    iput v7, v6, LQ9/g;->v:I

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    new-instance v6, LQ9/g;

    .line 112
    .line 113
    invoke-direct {v6, p0, p2}, LQ9/g;-><init>(LQ9/h;Lm8/d;)V

    .line 114
    .line 115
    .line 116
    :goto_2
    iget-object p2, v6, LQ9/g;->t:Ljava/lang/Object;

    .line 117
    .line 118
    iget v5, v6, LQ9/g;->v:I

    .line 119
    .line 120
    if-eqz v5, :cond_6

    .line 121
    .line 122
    if-ne v5, v3, :cond_5

    .line 123
    .line 124
    iget-object p1, v6, LQ9/g;->s:LQ9/h;

    .line 125
    .line 126
    :try_start_0
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :catchall_0
    move-exception p2

    .line 131
    goto :goto_4

    .line 132
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 133
    .line 134
    invoke-direct {p1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw p1

    .line 138
    :cond_6
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :try_start_1
    iput-object p0, v6, LQ9/g;->s:LQ9/h;

    .line 142
    .line 143
    iput v3, v6, LQ9/g;->v:I

    .line 144
    .line 145
    invoke-interface {v1, p1, v6}, LQ9/c;->a(Ljava/lang/Object;Lm8/d;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 149
    if-ne p1, v4, :cond_7

    .line 150
    .line 151
    move-object v0, v4

    .line 152
    :cond_7
    :goto_3
    return-object v0

    .line 153
    :catchall_1
    move-exception p2

    .line 154
    move-object p1, p0

    .line 155
    :goto_4
    iget-object p1, p1, LQ9/h;->u:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast p1, Lv8/t;

    .line 158
    .line 159
    iput-object p2, p1, Lv8/t;->s:Ljava/lang/Object;

    .line 160
    .line 161
    throw p2

    .line 162
    nop

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
