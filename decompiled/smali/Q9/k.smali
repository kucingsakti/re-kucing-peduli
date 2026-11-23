.class public final LQ9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LQ9/c;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LQ9/k;->s:I

    iput-object p1, p0, LQ9/k;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lm8/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LQ9/k;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ls4/n;

    .line 7
    .line 8
    iget-object p2, p0, LQ9/k;->t:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Ls4/D;

    .line 11
    .line 12
    iget-object p2, p2, Ls4/D;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    sget-object p1, Lh8/m;->a:Lh8/m;

    .line 18
    .line 19
    return-object p1

    .line 20
    :pswitch_0
    instance-of v0, p2, Le0/p;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move-object v0, p2

    .line 25
    check-cast v0, Le0/p;

    .line 26
    .line 27
    iget v1, v0, Le0/p;->t:I

    .line 28
    .line 29
    const/high16 v2, -0x80000000

    .line 30
    .line 31
    and-int v3, v1, v2

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    sub-int/2addr v1, v2

    .line 36
    iput v1, v0, Le0/p;->t:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v0, Le0/p;

    .line 40
    .line 41
    invoke-direct {v0, p0, p2}, Le0/p;-><init>(LQ9/k;Lm8/d;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object p2, v0, Le0/p;->s:Ljava/lang/Object;

    .line 45
    .line 46
    sget-object v1, Ln8/a;->s:Ln8/a;

    .line 47
    .line 48
    iget v2, v0, Le0/p;->t:I

    .line 49
    .line 50
    const/4 v3, 0x1

    .line 51
    if-eqz v2, :cond_2

    .line 52
    .line 53
    if-ne v2, v3, :cond_1

    .line 54
    .line 55
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw p1

    .line 67
    :cond_2
    invoke-static {p2}, LJ7/a;->v(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    check-cast p1, Le0/D;

    .line 71
    .line 72
    instance-of p2, p1, Le0/h;

    .line 73
    .line 74
    if-nez p2, :cond_7

    .line 75
    .line 76
    instance-of p2, p1, Le0/g;

    .line 77
    .line 78
    if-nez p2, :cond_6

    .line 79
    .line 80
    instance-of p2, p1, Le0/a;

    .line 81
    .line 82
    if-eqz p2, :cond_4

    .line 83
    .line 84
    check-cast p1, Le0/a;

    .line 85
    .line 86
    iget-object p1, p1, Le0/a;->a:Ljava/lang/Object;

    .line 87
    .line 88
    iput v3, v0, Le0/p;->t:I

    .line 89
    .line 90
    iget-object p2, p0, LQ9/k;->t:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p2, LQ9/c;

    .line 93
    .line 94
    invoke-interface {p2, p1, v0}, LQ9/c;->a(Ljava/lang/Object;Lm8/d;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    if-ne p1, v1, :cond_3

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    :goto_1
    sget-object v1, Lh8/m;->a:Lh8/m;

    .line 102
    .line 103
    :goto_2
    return-object v1

    .line 104
    :cond_4
    instance-of p1, p1, Le0/E;

    .line 105
    .line 106
    if-eqz p1, :cond_5

    .line 107
    .line 108
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 109
    .line 110
    const-string p2, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 111
    .line 112
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw p1

    .line 116
    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 117
    .line 118
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 119
    .line 120
    .line 121
    throw p1

    .line 122
    :cond_6
    check-cast p1, Le0/g;

    .line 123
    .line 124
    iget-object p1, p1, Le0/g;->a:Ljava/lang/Throwable;

    .line 125
    .line 126
    throw p1

    .line 127
    :cond_7
    check-cast p1, Le0/h;

    .line 128
    .line 129
    iget-object p1, p1, Le0/h;->a:Ljava/lang/Throwable;

    .line 130
    .line 131
    throw p1

    .line 132
    :pswitch_1
    iget-object p2, p0, LQ9/k;->t:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast p2, Lv8/t;

    .line 135
    .line 136
    iput-object p1, p2, Lv8/t;->s:Ljava/lang/Object;

    .line 137
    .line 138
    new-instance p1, Lkotlinx/coroutines/flow/internal/AbortFlowException;

    .line 139
    .line 140
    invoke-direct {p1, p0}, Lkotlinx/coroutines/flow/internal/AbortFlowException;-><init>(LQ9/k;)V

    .line 141
    .line 142
    .line 143
    throw p1

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
