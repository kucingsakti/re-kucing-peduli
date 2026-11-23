.class public final synthetic Lo2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq2/a;


# instance fields
.field public final synthetic s:Lo2/h;

.field public final synthetic t:Li2/i;

.field public final synthetic u:I


# direct methods
.method public synthetic constructor <init>(Lo2/h;Li2/i;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo2/f;->s:Lo2/h;

    iput-object p2, p0, Lo2/f;->t:Li2/i;

    iput p3, p0, Lo2/f;->u:I

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lo2/f;->u:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iget-object v1, p0, Lo2/f;->s:Lo2/h;

    .line 6
    .line 7
    iget-object v1, v1, Lo2/h;->d:Lo2/c;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iget-object v3, p0, Lo2/f;->t:Li2/i;

    .line 11
    .line 12
    invoke-virtual {v1, v3, v0, v2}, Lo2/c;->a(Li2/i;IZ)V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    return-object v0
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
