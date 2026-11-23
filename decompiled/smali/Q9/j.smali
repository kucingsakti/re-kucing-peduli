.class public final LQ9/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ9/c;


# instance fields
.field public final synthetic s:Lv8/q;

.field public final synthetic t:LQ9/c;

.field public final synthetic u:Le0/o;


# direct methods
.method public constructor <init>(Lv8/q;LQ9/c;Le0/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ9/j;->s:Lv8/q;

    .line 5
    .line 6
    iput-object p2, p0, LQ9/j;->t:LQ9/c;

    .line 7
    .line 8
    iput-object p3, p0, LQ9/j;->u:Le0/o;

    .line 9
    .line 10
    return-void
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
.method public final a(Ljava/lang/Object;Lm8/d;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p2, LQ9/i;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LQ9/i;

    .line 7
    .line 8
    iget v1, v0, LQ9/i;->w:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LQ9/i;->w:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LQ9/i;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LQ9/i;-><init>(LQ9/j;Lm8/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LQ9/i;->u:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, Ln8/a;->s:Ln8/a;

    .line 28
    .line 29
    iget v2, v0, LQ9/i;->w:I

    .line 30
    .line 31
    sget-object v3, Lh8/m;->a:Lh8/m;

    .line 32
    .line 33
    const/4 v4, 0x3

    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v6, :cond_3

    .line 39
    .line 40
    if-eq v2, v5, :cond_2

    .line 41
    .line 42
    if-ne v2, v4, :cond_1

    .line 43
    .line 44
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    return-object v3

    .line 48
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p1

    .line 56
    :cond_2
    iget-object p1, v0, LQ9/i;->t:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v2, v0, LQ9/i;->s:LQ9/j;

    .line 59
    .line 60
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_3
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-object v3

    .line 68
    :cond_4
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-object p2, p0, LQ9/j;->s:Lv8/q;

    .line 72
    .line 73
    iget-boolean p2, p2, Lv8/q;->s:Z

    .line 74
    .line 75
    if-eqz p2, :cond_5

    .line 76
    .line 77
    iput v6, v0, LQ9/i;->w:I

    .line 78
    .line 79
    iget-object p2, p0, LQ9/j;->t:LQ9/c;

    .line 80
    .line 81
    invoke-interface {p2, p1, v0}, LQ9/c;->a(Ljava/lang/Object;Lm8/d;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-ne p1, v1, :cond_7

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_5
    iput-object p0, v0, LQ9/i;->s:LQ9/j;

    .line 89
    .line 90
    iput-object p1, v0, LQ9/i;->t:Ljava/lang/Object;

    .line 91
    .line 92
    iput v5, v0, LQ9/i;->w:I

    .line 93
    .line 94
    iget-object p2, p0, LQ9/j;->u:Le0/o;

    .line 95
    .line 96
    invoke-virtual {p2, p1, v0}, Le0/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    if-ne p2, v1, :cond_6

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_6
    move-object v2, p0

    .line 104
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    if-nez p2, :cond_7

    .line 111
    .line 112
    iget-object p2, v2, LQ9/j;->s:Lv8/q;

    .line 113
    .line 114
    iput-boolean v6, p2, Lv8/q;->s:Z

    .line 115
    .line 116
    const/4 p2, 0x0

    .line 117
    iput-object p2, v0, LQ9/i;->s:LQ9/j;

    .line 118
    .line 119
    iput-object p2, v0, LQ9/i;->t:Ljava/lang/Object;

    .line 120
    .line 121
    iput v4, v0, LQ9/i;->w:I

    .line 122
    .line 123
    iget-object p2, v2, LQ9/j;->t:LQ9/c;

    .line 124
    .line 125
    invoke-interface {p2, p1, v0}, LQ9/c;->a(Ljava/lang/Object;Lm8/d;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-ne p1, v1, :cond_7

    .line 130
    .line 131
    :goto_2
    return-object v1

    .line 132
    :cond_7
    return-object v3
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
