.class public abstract LHa/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lza/c;

.field public static volatile b:[Lza/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lza/c;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lza/c;-><init>(I)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ljava/lang/ThreadLocal;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, LHa/a;->a:Lza/c;

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    new-array v0, v0, [Lza/c;

    .line 21
    .line 22
    sput-object v0, LHa/a;->b:[Lza/c;

    .line 23
    .line 24
    return-void
    .line 25
    .line 26
.end method
