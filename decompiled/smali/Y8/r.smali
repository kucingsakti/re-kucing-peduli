.class public final LY8/r;
.super LO8/E;
.source "SourceFile"


# static fields
.field public static final synthetic E:[LC8/u;


# instance fields
.field public final A:Lz9/i;

.field public final B:LY8/d;

.field public final C:Lz9/c;

.field public final D:LM8/h;

.field public final y:LR8/x;

.field public final z:LFa/e;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Lv8/n;

    .line 2
    .line 3
    sget-object v1, Lv8/u;->a:Lv8/v;

    .line 4
    .line 5
    const-class v2, LY8/r;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const-string v4, "binaryClasses"

    .line 12
    .line 13
    const-string v5, "getBinaryClasses$descriptors_jvm()Ljava/util/Map;"

    .line 14
    .line 15
    invoke-direct {v0, v3, v4, v5}, Lv8/n;-><init>(LC8/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lv8/v;->f(Lv8/n;)LC8/r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v3, Lv8/n;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v4, "partToFacade"

    .line 29
    .line 30
    const-string v5, "getPartToFacade()Ljava/util/HashMap;"

    .line 31
    .line 32
    invoke-direct {v3, v2, v4, v5}, Lv8/n;-><init>(LC8/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, Lv8/v;->f(Lv8/n;)LC8/r;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    const/4 v2, 0x2

    .line 40
    new-array v2, v2, [LC8/u;

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    aput-object v0, v2, v3

    .line 44
    .line 45
    const/4 v0, 0x1

    .line 46
    aput-object v1, v2, v0

    .line 47
    .line 48
    sput-object v2, LY8/r;->E:[LC8/u;

    .line 49
    .line 50
    return-void
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
.end method

.method public constructor <init>(LFa/e;LR8/x;)V
    .locals 4

    .line 1
    const-string v0, "outerContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LFa/e;->t:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LI4/a;

    .line 9
    .line 10
    iget-object v1, p2, LR8/x;->a:Lj9/c;

    .line 11
    .line 12
    iget-object v2, v0, LI4/a;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v2, LO8/C;

    .line 15
    .line 16
    invoke-direct {p0, v2, v1}, LO8/E;-><init>(LL8/y;Lj9/c;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, LY8/r;->y:LR8/x;

    .line 20
    .line 21
    const/4 v1, 0x6

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-static {p1, p0, v2, v1}, LJ7/j;->d(LFa/e;LL8/f;LR8/n;I)LFa/e;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, LY8/r;->z:LFa/e;

    .line 28
    .line 29
    iget-object v0, v0, LI4/a;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Lc9/d;

    .line 32
    .line 33
    invoke-virtual {v0}, Lc9/d;->c()LI4/c;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v1, "<this>"

    .line 38
    .line 39
    iget-object v0, v0, LI4/c;->c:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Lw9/i;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Li9/f;->g:Li9/f;

    .line 47
    .line 48
    iget-object v0, p1, LFa/e;->t:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, LI4/a;

    .line 51
    .line 52
    iget-object v1, v0, LI4/a;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v1, Lz9/l;

    .line 55
    .line 56
    new-instance v2, LY8/q;

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-direct {v2, p0, v3}, LY8/q;-><init>(LY8/r;I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    new-instance v3, Lz9/i;

    .line 66
    .line 67
    invoke-direct {v3, v1, v2}, Lz9/h;-><init>(Lz9/l;Lu8/a;)V

    .line 68
    .line 69
    .line 70
    iput-object v3, p0, LY8/r;->A:Lz9/i;

    .line 71
    .line 72
    new-instance v2, LY8/d;

    .line 73
    .line 74
    invoke-direct {v2, p1, p2, p0}, LY8/d;-><init>(LFa/e;LR8/x;LY8/r;)V

    .line 75
    .line 76
    .line 77
    iput-object v2, p0, LY8/r;->B:LY8/d;

    .line 78
    .line 79
    new-instance v2, LY8/q;

    .line 80
    .line 81
    const/4 v3, 0x2

    .line 82
    invoke-direct {v2, p0, v3}, LY8/q;-><init>(LY8/r;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    new-instance v3, Lz9/c;

    .line 89
    .line 90
    invoke-direct {v3, v1, v2}, Lz9/i;-><init>(Lz9/l;Lu8/a;)V

    .line 91
    .line 92
    .line 93
    iput-object v3, p0, LY8/r;->C:Lz9/c;

    .line 94
    .line 95
    iget-object v0, v0, LI4/a;->v:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, LU8/t;

    .line 98
    .line 99
    iget-boolean v0, v0, LU8/t;->b:Z

    .line 100
    .line 101
    if-eqz v0, :cond_0

    .line 102
    .line 103
    sget-object p1, LM8/g;->a:LM8/f;

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    invoke-static {p1, p2}, LQ3/u0;->k(LFa/e;La9/b;)LX8/b;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    :goto_0
    iput-object p1, p0, LY8/r;->D:LM8/h;

    .line 111
    .line 112
    new-instance p1, LY8/q;

    .line 113
    .line 114
    const/4 p2, 0x1

    .line 115
    invoke-direct {p1, p0, p2}, LY8/q;-><init>(LY8/r;I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, p1}, Lz9/l;->a(Lu8/a;)Lz9/i;

    .line 119
    .line 120
    .line 121
    return-void
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


# virtual methods
.method public final E0()Lt9/n;
    .locals 1

    .line 1
    iget-object v0, p0, LY8/r;->B:LY8/d;

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

.method public final g()LL8/M;
    .locals 1

    .line 1
    new-instance v0, LP0/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LP0/d;-><init>(LY8/r;)V

    .line 4
    .line 5
    .line 6
    return-object v0
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

.method public final q()LM8/h;
    .locals 1

    .line 1
    iget-object v0, p0, LY8/r;->D:LM8/h;

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

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Lazy Java package fragment: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, LO8/E;->w:Lj9/c;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, " of module "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LY8/r;->z:LFa/e;

    .line 19
    .line 20
    iget-object v1, v1, LFa/e;->t:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, LI4/a;

    .line 23
    .line 24
    iget-object v1, v1, LI4/a;->o:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, LO8/C;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
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
.end method
