.class public final LG9/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lj9/f;

.field public final b:LL9/e;

.field public final c:Ljava/util/Collection;

.field public final d:Lu8/b;

.field public final e:[LG9/e;


# direct methods
.method public varargs constructor <init>(Lj9/f;LL9/e;Ljava/util/Collection;Lu8/b;[LG9/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LG9/i;->a:Lj9/f;

    .line 3
    iput-object p2, p0, LG9/i;->b:LL9/e;

    .line 4
    iput-object p3, p0, LG9/i;->c:Ljava/util/Collection;

    .line 5
    iput-object p4, p0, LG9/i;->d:Lu8/b;

    .line 6
    iput-object p5, p0, LG9/i;->e:[LG9/e;

    return-void
.end method

.method public synthetic constructor <init>(Lj9/f;[LG9/e;)V
    .locals 1

    .line 7
    sget-object v0, LG9/h;->t:LG9/h;

    invoke-direct {p0, p1, p2, v0}, LG9/i;-><init>(Lj9/f;[LG9/e;Lu8/b;)V

    return-void
.end method

.method public constructor <init>(Lj9/f;[LG9/e;Lu8/b;)V
    .locals 6

    const-string v0, "name"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [LG9/e;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, LG9/i;-><init>(Lj9/f;LL9/e;Ljava/util/Collection;Lu8/b;[LG9/e;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;[LG9/e;Lu8/b;)V
    .locals 6

    const-string v0, "nameList"

    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [LG9/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, LG9/i;-><init>(Lj9/f;LL9/e;Ljava/util/Collection;Lu8/b;[LG9/e;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Set;[LG9/e;)V
    .locals 1

    .line 9
    sget-object v0, LG9/h;->v:LG9/h;

    invoke-direct {p0, p1, p2, v0}, LG9/i;-><init>(Ljava/util/Collection;[LG9/e;Lu8/b;)V

    return-void
.end method
