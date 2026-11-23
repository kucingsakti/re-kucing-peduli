.class public final LQ9/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ9/b;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:LQ9/b;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LQ9/b;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LQ9/e;->s:I

    iput-object p1, p0, LQ9/e;->t:LQ9/b;

    iput-object p2, p0, LQ9/e;->u:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final A(LQ9/c;Lo8/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LQ9/e;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LQ9/h;

    .line 7
    .line 8
    iget-object v1, p0, LQ9/e;->u:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, Ls4/D;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, p1, v1, v2}, LQ9/h;-><init>(LQ9/c;Ljava/lang/Object;I)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, LQ9/e;->t:LQ9/b;

    .line 17
    .line 18
    check-cast p1, LQ9/e;

    .line 19
    .line 20
    invoke-virtual {p1, v0, p2}, LQ9/e;->A(LQ9/c;Lo8/c;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    sget-object p2, Ln8/a;->s:Ln8/a;

    .line 25
    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    sget-object p1, Lh8/m;->a:Lh8/m;

    .line 30
    .line 31
    :goto_0
    return-object p1

    .line 32
    :pswitch_0
    instance-of v0, p2, LQ9/d;

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    move-object v0, p2

    .line 37
    check-cast v0, LQ9/d;

    .line 38
    .line 39
    iget v1, v0, LQ9/d;->t:I

    .line 40
    .line 41
    const/high16 v2, -0x80000000

    .line 42
    .line 43
    and-int v3, v1, v2

    .line 44
    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    sub-int/2addr v1, v2

    .line 48
    iput v1, v0, LQ9/d;->t:I

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    new-instance v0, LQ9/d;

    .line 52
    .line 53
    invoke-direct {v0, p0, p2}, LQ9/d;-><init>(LQ9/e;Lo8/c;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    iget-object p2, v0, LQ9/d;->s:Ljava/lang/Object;

    .line 57
    .line 58
    sget-object v1, Ln8/a;->s:Ln8/a;

    .line 59
    .line 60
    iget v2, v0, LQ9/d;->t:I

    .line 61
    .line 62
    const/4 v3, 0x2

    .line 63
    const/4 v4, 0x1

    .line 64
    if-eqz v2, :cond_4

    .line 65
    .line 66
    if-eq v2, v4, :cond_3

    .line 67
    .line 68
    if-ne v2, v3, :cond_2

    .line 69
    .line 70
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 75
    .line 76
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 77
    .line 78
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :cond_3
    iget-object p1, v0, LQ9/d;->w:LQ9/c;

    .line 83
    .line 84
    iget-object v2, v0, LQ9/d;->v:LQ9/e;

    .line 85
    .line 86
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    iput-object p0, v0, LQ9/d;->v:LQ9/e;

    .line 94
    .line 95
    iput-object p1, v0, LQ9/d;->w:LQ9/c;

    .line 96
    .line 97
    iput v4, v0, LQ9/d;->t:I

    .line 98
    .line 99
    iget-object p2, p0, LQ9/e;->t:LQ9/b;

    .line 100
    .line 101
    invoke-static {p2, p1, v0}, LQ9/q;->c(LQ9/b;LQ9/c;Lo8/c;)Ljava/io/Serializable;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    if-ne p2, v1, :cond_5

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_5
    move-object v2, p0

    .line 109
    :goto_2
    check-cast p2, Ljava/lang/Throwable;

    .line 110
    .line 111
    if-eqz p2, :cond_6

    .line 112
    .line 113
    iget-object v2, v2, LQ9/e;->u:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast v2, Ls4/z;

    .line 116
    .line 117
    const/4 v4, 0x0

    .line 118
    iput-object v4, v0, LQ9/d;->v:LQ9/e;

    .line 119
    .line 120
    iput-object v4, v0, LQ9/d;->w:LQ9/c;

    .line 121
    .line 122
    iput v3, v0, LQ9/d;->t:I

    .line 123
    .line 124
    invoke-virtual {v2, p1, p2, v0}, Ls4/z;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    if-ne p1, v1, :cond_6

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_6
    :goto_3
    sget-object v1, Lh8/m;->a:Lh8/m;

    .line 132
    .line 133
    :goto_4
    return-object v1

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
