.class public final Lcom/onesignal/core/CoreModule;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT4/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/onesignal/core/CoreModule;",
        "LT4/a;",
        "<init>",
        "()V",
        "LU4/c;",
        "builder",
        "Lh8/m;",
        "register",
        "(LU4/c;)V",
        "com.onesignal.core"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
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


# virtual methods
.method public register(LU4/c;)V
    .locals 5

    .line 1
    const-string v0, "builder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-class v0, Lcom/onesignal/core/internal/preferences/impl/a;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-class v1, Lj5/b;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-class v1, Lk5/b;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 21
    .line 22
    .line 23
    const-class v0, Lcom/onesignal/core/internal/http/impl/b;

    .line 24
    .line 25
    const-class v2, Lcom/onesignal/core/internal/http/impl/c;

    .line 26
    .line 27
    const-class v3, Lcom/onesignal/core/internal/http/impl/a;

    .line 28
    .line 29
    const-class v4, Ld5/c;

    .line 30
    .line 31
    invoke-static {p1, v0, v2, v3, v4}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 32
    .line 33
    .line 34
    const-class v0, Lcom/onesignal/core/internal/application/impl/a;

    .line 35
    .line 36
    const-class v2, LX4/f;

    .line 37
    .line 38
    const-class v3, Lcom/onesignal/core/internal/device/impl/a;

    .line 39
    .line 40
    const-class v4, Lc5/c;

    .line 41
    .line 42
    invoke-static {p1, v0, v2, v3, v4}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 43
    .line 44
    .line 45
    const-class v0, Lm5/a;

    .line 46
    .line 47
    const-class v2, Ll5/a;

    .line 48
    .line 49
    const-class v3, Lb5/b;

    .line 50
    .line 51
    const-class v4, La5/d;

    .line 52
    .line 53
    invoke-static {p1, v0, v2, v3, v4}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 54
    .line 55
    .line 56
    const-class v0, Lcom/onesignal/core/internal/device/impl/b;

    .line 57
    .line 58
    const-class v2, Lc5/d;

    .line 59
    .line 60
    const-class v3, Lcom/onesignal/core/internal/config/b;

    .line 61
    .line 62
    invoke-static {p1, v0, v2, v3, v3}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 63
    .line 64
    .line 65
    const-class v0, Lcom/onesignal/core/internal/backend/impl/a;

    .line 66
    .line 67
    const-class v2, LY4/b;

    .line 68
    .line 69
    const-class v3, Lcom/onesignal/core/internal/config/impl/a;

    .line 70
    .line 71
    invoke-static {p1, v0, v2, v3, v1}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 72
    .line 73
    .line 74
    const-class v0, Lu6/a;

    .line 75
    .line 76
    const-class v2, Lk5/a;

    .line 77
    .line 78
    const-class v3, Lcom/onesignal/core/internal/operations/impl/a;

    .line 79
    .line 80
    invoke-static {p1, v0, v2, v3, v3}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 81
    .line 82
    .line 83
    const-class v0, Lcom/onesignal/core/internal/operations/impl/b;

    .line 84
    .line 85
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-class v2, Lg5/f;

    .line 90
    .line 91
    invoke-virtual {v0, v2}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {v0, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 96
    .line 97
    .line 98
    const-class v0, Lcom/onesignal/core/internal/permissions/impl/a;

    .line 99
    .line 100
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-virtual {v2, v0}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    const-class v2, Li5/f;

    .line 109
    .line 110
    invoke-virtual {v0, v2}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 111
    .line 112
    .line 113
    const-class v0, Lf5/a;

    .line 114
    .line 115
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const-class v2, Le5/a;

    .line 120
    .line 121
    invoke-virtual {v0, v2}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 122
    .line 123
    .line 124
    const-class v0, Lcom/onesignal/core/internal/background/impl/a;

    .line 125
    .line 126
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    const-class v2, LZ4/a;

    .line 131
    .line 132
    invoke-virtual {v0, v2}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-virtual {v0, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 137
    .line 138
    .line 139
    const-class v0, Lcom/onesignal/core/internal/purchases/impl/a;

    .line 140
    .line 141
    invoke-virtual {p1, v0}, LU4/c;->register(Ljava/lang/Class;)LU4/e;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0, v1}, LU4/e;->provides(Ljava/lang/Class;)LU4/e;

    .line 146
    .line 147
    .line 148
    const-class v0, Lcom/onesignal/core/internal/purchases/impl/c;

    .line 149
    .line 150
    const-class v2, Lcom/onesignal/notifications/internal/b;

    .line 151
    .line 152
    const-class v3, LJ5/n;

    .line 153
    .line 154
    invoke-static {p1, v0, v1, v2, v3}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 155
    .line 156
    .line 157
    const-class v0, Lcom/onesignal/inAppMessages/internal/k;

    .line 158
    .line 159
    const-class v1, Lp5/j;

    .line 160
    .line 161
    const-class v2, Lcom/onesignal/location/internal/b;

    .line 162
    .line 163
    const-class v3, LB5/a;

    .line 164
    .line 165
    invoke-static {p1, v0, v1, v2, v3}, LE0/a;->n(LU4/c;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V

    .line 166
    .line 167
    .line 168
    return-void
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
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
.end method
