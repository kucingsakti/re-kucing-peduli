.class public final LR/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Landroid/content/Context;

.field public final synthetic v:LFa/e;

.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/content/Context;LFa/e;II)V
    .locals 0

    .line 1
    iput p5, p0, LR/d;->s:I

    iput-object p1, p0, LR/d;->t:Ljava/lang/String;

    iput-object p2, p0, LR/d;->u:Landroid/content/Context;

    iput-object p3, p0, LR/d;->v:LFa/e;

    iput p4, p0, LR/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, LR/d;->s:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, LR/d;->t:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v1, p0, LR/d;->u:Landroid/content/Context;

    .line 9
    .line 10
    iget-object v2, p0, LR/d;->v:LFa/e;

    .line 11
    .line 12
    iget v3, p0, LR/d;->w:I

    .line 13
    .line 14
    invoke-static {v0, v1, v2, v3}, LR/g;->a(Ljava/lang/String;Landroid/content/Context;LFa/e;I)LR/f;

    .line 15
    .line 16
    .line 17
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    new-instance v0, LR/f;

    .line 20
    .line 21
    const/4 v1, -0x3

    .line 22
    invoke-direct {v0, v1}, LR/f;-><init>(I)V

    .line 23
    .line 24
    .line 25
    :goto_0
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, p0, LR/d;->t:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p0, LR/d;->u:Landroid/content/Context;

    .line 29
    .line 30
    iget-object v2, p0, LR/d;->v:LFa/e;

    .line 31
    .line 32
    iget v3, p0, LR/d;->w:I

    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, LR/g;->a(Ljava/lang/String;Landroid/content/Context;LFa/e;I)LR/f;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    return-object v0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
