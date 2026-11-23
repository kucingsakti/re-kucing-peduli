.class public final Ls4/D;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls4/u;


# static fields
.field public static final e:Ls4/x;

.field public static final f:Lg0/b;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lm8/i;

.field public final c:Ljava/util/concurrent/atomic/AtomicReference;

.field public final d:LQ9/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ls4/x;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ls4/D;->e:Ls4/x;

    .line 7
    .line 8
    sget-object v0, Ls4/t;->a:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v1, LV/h;

    .line 11
    .line 12
    sget-object v2, Ls4/w;->s:Ls4/w;

    .line 13
    .line 14
    invoke-direct {v1, v2}, LV/h;-><init>(Lu8/b;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lo1/f;->m(Ljava/lang/String;LV/h;)Lg0/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Ls4/D;->f:Lg0/b;

    .line 22
    .line 23
    return-void
    .line 24
    .line 25
    .line 26
.end method

.method public constructor <init>(Landroid/content/Context;Lm8/i;)V
    .locals 5

    .line 1
    const-string v0, "context"

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
    iput-object p1, p0, Ls4/D;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, Ls4/D;->b:Lm8/i;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ls4/D;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 19
    .line 20
    sget-object v0, Ls4/D;->e:Ls4/x;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v0, Ls4/x;->a:[LC8/u;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    aget-object v0, v0, v1

    .line 29
    .line 30
    sget-object v1, Ls4/D;->f:Lg0/b;

    .line 31
    .line 32
    invoke-virtual {v1, v0, p1}, Lg0/b;->a(LC8/u;Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Le0/f;

    .line 37
    .line 38
    invoke-interface {p1}, Le0/f;->getData()LQ9/b;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance v0, Ls4/z;

    .line 43
    .line 44
    const/4 v1, 0x3

    .line 45
    const/4 v2, 0x0

    .line 46
    invoke-direct {v0, v1, v2}, Lo8/g;-><init>(ILm8/d;)V

    .line 47
    .line 48
    .line 49
    new-instance v3, LQ9/e;

    .line 50
    .line 51
    const/4 v4, 0x0

    .line 52
    invoke-direct {v3, p1, v0, v4}, LQ9/e;-><init>(LQ9/b;Ljava/lang/Object;I)V

    .line 53
    .line 54
    .line 55
    new-instance p1, LQ9/e;

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    invoke-direct {p1, v3, p0, v0}, LQ9/e;-><init>(LQ9/b;Ljava/lang/Object;I)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Ls4/D;->d:LQ9/e;

    .line 62
    .line 63
    invoke-static {p2}, LN9/z;->b(Lm8/i;)LS9/e;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    new-instance p2, Ls4/v;

    .line 68
    .line 69
    invoke-direct {p2, p0, v2}, Ls4/v;-><init>(Ls4/D;Lm8/d;)V

    .line 70
    .line 71
    .line 72
    invoke-static {p1, v2, p2, v1}, LN9/z;->n(LN9/y;Lm8/a;Lu8/c;I)LN9/p0;

    .line 73
    .line 74
    .line 75
    return-void
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
