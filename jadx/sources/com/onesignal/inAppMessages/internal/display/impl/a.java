package com.onesignal.inAppMessages.internal.display.impl;

import U.U;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends RelativeLayout {
    public static final C0036a Companion = new C0036a(null);
    private static final int EXTRA_PX_DISMISS;
    private static final int MARGIN_PX_SIZE;
    private boolean dismissing;
    private final boolean draggingDisabled;
    private p032d0.f mDragHelper;
    private com.onesignal.inAppMessages.internal.display.impl.b mListener;
    private b params;

    /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.display.impl.a$a, reason: collision with other inner class name */
    public static final class C0036a {
        public /* synthetic */ C0036a(p210v8.e eVar) {
            this();
        }

        private C0036a() {
        }
    }

    public static final class b {
        public static final C0037a Companion = new C0037a(null);
        public static final int DRAGGABLE_DIRECTION_DOWN = 1;
        public static final int DRAGGABLE_DIRECTION_UP = 0;
        private int dismissingYPos;
        private int dismissingYVelocity;
        private int dragDirection;
        private int dragThresholdY;
        private boolean draggingDisabled;
        private int height;
        private int maxXPos;
        private int maxYPos;
        private int messageHeight;
        private int offScreenYPos;
        private int posY;

        /* JADX INFO: renamed from: com.onesignal.inAppMessages.internal.display.impl.a$b$a, reason: collision with other inner class name */
        public static final class C0037a {
            public /* synthetic */ C0037a(p210v8.e eVar) {
                this();
            }

            private C0037a() {
            }
        }

        public final int getDismissingYPos() {
            return this.dismissingYPos;
        }

        public final int getDismissingYVelocity() {
            return this.dismissingYVelocity;
        }

        public final int getDragDirection() {
            return this.dragDirection;
        }

        public final int getDragThresholdY() {
            return this.dragThresholdY;
        }

        public final boolean getDraggingDisabled() {
            return this.draggingDisabled;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getMaxXPos() {
            return this.maxXPos;
        }

        public final int getMaxYPos() {
            return this.maxYPos;
        }

        public final int getMessageHeight() {
            return this.messageHeight;
        }

        public final int getOffScreenYPos() {
            return this.offScreenYPos;
        }

        public final int getPosY() {
            return this.posY;
        }

        public final void setDismissingYPos(int i10) {
            this.dismissingYPos = i10;
        }

        public final void setDismissingYVelocity(int i10) {
            this.dismissingYVelocity = i10;
        }

        public final void setDragDirection(int i10) {
            this.dragDirection = i10;
        }

        public final void setDragThresholdY(int i10) {
            this.dragThresholdY = i10;
        }

        public final void setDraggingDisabled(boolean z6) {
            this.draggingDisabled = z6;
        }

        public final void setHeight(int i10) {
            this.height = i10;
        }

        public final void setMaxXPos(int i10) {
            this.maxXPos = i10;
        }

        public final void setMaxYPos(int i10) {
            this.maxYPos = i10;
        }

        public final void setMessageHeight(int i10) {
            this.messageHeight = i10;
        }

        public final void setOffScreenYPos(int i10) {
            this.offScreenYPos = i10;
        }

        public final void setPosY(int i10) {
            this.posY = i10;
        }
    }

    public static final class c extends p032d0.e {
        private int lastYPos;

        public c() {
        }

        @Override // p032d0.e
        public int clampViewPositionHorizontal(View view, int i10, int i11) {
            p210v8.i.f(view, "child");
            b bVar = a.this.params;
            p210v8.i.c(bVar);
            return bVar.getMaxXPos();
        }

        @Override // p032d0.e
        public int clampViewPositionVertical(View view, int i10, int i11) {
            p210v8.i.f(view, "child");
            b bVar = a.this.params;
            p210v8.i.c(bVar);
            if (bVar.getDraggingDisabled()) {
                b bVar2 = a.this.params;
                p210v8.i.c(bVar2);
                return bVar2.getMaxYPos();
            }
            this.lastYPos = i10;
            b bVar3 = a.this.params;
            p210v8.i.c(bVar3);
            if (bVar3.getDragDirection() == 1) {
                b bVar4 = a.this.params;
                p210v8.i.c(bVar4);
                if (i10 >= bVar4.getDragThresholdY() && a.this.mListener != null) {
                    com.onesignal.inAppMessages.internal.display.impl.b bVar5 = a.this.mListener;
                    p210v8.i.c(bVar5);
                    bVar5.onDragStart();
                }
                b bVar6 = a.this.params;
                p210v8.i.c(bVar6);
                if (i10 < bVar6.getMaxYPos()) {
                    b bVar7 = a.this.params;
                    p210v8.i.c(bVar7);
                    return bVar7.getMaxYPos();
                }
            } else {
                b bVar8 = a.this.params;
                p210v8.i.c(bVar8);
                if (i10 <= bVar8.getDragThresholdY() && a.this.mListener != null) {
                    com.onesignal.inAppMessages.internal.display.impl.b bVar9 = a.this.mListener;
                    p210v8.i.c(bVar9);
                    bVar9.onDragStart();
                }
                b bVar10 = a.this.params;
                p210v8.i.c(bVar10);
                if (i10 > bVar10.getMaxYPos()) {
                    b bVar11 = a.this.params;
                    p210v8.i.c(bVar11);
                    return bVar11.getMaxYPos();
                }
            }
            return i10;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x004d  */
        /* JADX WARN: Code duplicated, block: B:12:0x0067  */
        /* JADX WARN: Code duplicated, block: B:17:0x0097  */
        /* JADX WARN: Code duplicated, block: B:19:0x00b1  */
        @Override // p032d0.e
        public void onViewReleased(View view, float f10, float f11) {
            p210v8.i.f(view, "releasedChild");
            b bVar = a.this.params;
            p210v8.i.c(bVar);
            int maxYPos = bVar.getMaxYPos();
            if (!a.this.dismissing) {
                b bVar2 = a.this.params;
                p210v8.i.c(bVar2);
                if (bVar2.getDragDirection() == 1) {
                    int i10 = this.lastYPos;
                    b bVar3 = a.this.params;
                    p210v8.i.c(bVar3);
                    if (i10 <= bVar3.getDismissingYPos()) {
                        b bVar4 = a.this.params;
                        p210v8.i.c(bVar4);
                        if (f11 > bVar4.getDismissingYVelocity()) {
                            b bVar5 = a.this.params;
                            p210v8.i.c(bVar5);
                            maxYPos = bVar5.getOffScreenYPos();
                            a.this.dismissing = true;
                            if (a.this.mListener != null) {
                                com.onesignal.inAppMessages.internal.display.impl.b bVar6 = a.this.mListener;
                                p210v8.i.c(bVar6);
                                bVar6.onDismiss();
                            }
                        }
                    } else {
                        b bVar7 = a.this.params;
                        p210v8.i.c(bVar7);
                        maxYPos = bVar7.getOffScreenYPos();
                        a.this.dismissing = true;
                        if (a.this.mListener != null) {
                            com.onesignal.inAppMessages.internal.display.impl.b bVar8 = a.this.mListener;
                            p210v8.i.c(bVar8);
                            bVar8.onDismiss();
                        }
                    }
                } else {
                    int i11 = this.lastYPos;
                    b bVar9 = a.this.params;
                    p210v8.i.c(bVar9);
                    if (i11 >= bVar9.getDismissingYPos()) {
                        b bVar10 = a.this.params;
                        p210v8.i.c(bVar10);
                        if (f11 < bVar10.getDismissingYVelocity()) {
                            b bVar11 = a.this.params;
                            p210v8.i.c(bVar11);
                            maxYPos = bVar11.getOffScreenYPos();
                            a.this.dismissing = true;
                            if (a.this.mListener != null) {
                                com.onesignal.inAppMessages.internal.display.impl.b bVar12 = a.this.mListener;
                                p210v8.i.c(bVar12);
                                bVar12.onDismiss();
                            }
                        }
                    } else {
                        b bVar13 = a.this.params;
                        p210v8.i.c(bVar13);
                        maxYPos = bVar13.getOffScreenYPos();
                        a.this.dismissing = true;
                        if (a.this.mListener != null) {
                            com.onesignal.inAppMessages.internal.display.impl.b bVar14 = a.this.mListener;
                            p210v8.i.c(bVar14);
                            bVar14.onDismiss();
                        }
                    }
                }
            }
            p032d0.f fVar = a.this.mDragHelper;
            p210v8.i.c(fVar);
            b bVar15 = a.this.params;
            p210v8.i.c(bVar15);
            if (fVar.p(bVar15.getMaxXPos(), maxYPos)) {
                a aVar = a.this;
                WeakHashMap weakHashMap = U.a;
                aVar.postInvalidateOnAnimation();
            }
        }

        @Override // p032d0.e
        public boolean tryCaptureView(View view, int i10) {
            p210v8.i.f(view, "child");
            return true;
        }
    }

    static {
        com.onesignal.common.l lVar = com.onesignal.common.l.INSTANCE;
        MARGIN_PX_SIZE = lVar.dpToPx(28);
        EXTRA_PX_DISMISS = lVar.dpToPx(64);
    }

    public a(Context context) {
        super(context);
        setClipChildren(false);
        createDragHelper();
    }

    private final void createDragHelper() {
        p032d0.f fVar = new p032d0.f(getContext(), this, new c());
        fVar.f10514b = (int) (1.0f * fVar.f10514b);
        this.mDragHelper = fVar;
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        p032d0.f fVar = this.mDragHelper;
        p210v8.i.c(fVar);
        if (fVar.g()) {
            WeakHashMap weakHashMap = U.a;
            postInvalidateOnAnimation();
        }
    }

    public final void dismiss() {
        this.dismissing = true;
        p032d0.f fVar = this.mDragHelper;
        p210v8.i.c(fVar);
        int left = getLeft();
        b bVar = this.params;
        p210v8.i.c(bVar);
        fVar.r(this, left, bVar.getOffScreenYPos());
        WeakHashMap weakHashMap = U.a;
        postInvalidateOnAnimation();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        com.onesignal.inAppMessages.internal.display.impl.b bVar;
        p210v8.i.f(motionEvent, "event");
        if (this.dismissing) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (bVar = this.mListener) != null) {
            p210v8.i.c(bVar);
            bVar.onDragEnd();
        }
        p032d0.f fVar = this.mDragHelper;
        p210v8.i.c(fVar);
        fVar.j(motionEvent);
        return false;
    }

    public final void setListener(com.onesignal.inAppMessages.internal.display.impl.b bVar) {
        this.mListener = bVar;
    }

    public final void setParams(b bVar) {
        p210v8.i.f(bVar, "params");
        this.params = bVar;
        bVar.setOffScreenYPos(((Resources.getSystem().getDisplayMetrics().heightPixels - bVar.getMessageHeight()) - bVar.getPosY()) + bVar.getPosY() + bVar.getMessageHeight() + EXTRA_PX_DISMISS);
        bVar.setDismissingYVelocity(com.onesignal.common.l.INSTANCE.dpToPx(3000));
        if (bVar.getDragDirection() != 0) {
            bVar.setDismissingYPos((bVar.getMaxYPos() * 2) + (bVar.getMessageHeight() / 3));
        } else {
            bVar.setOffScreenYPos((-bVar.getMessageHeight()) - MARGIN_PX_SIZE);
            bVar.setDismissingYVelocity(-bVar.getDismissingYVelocity());
            bVar.setDismissingYPos(bVar.getOffScreenYPos() / 3);
        }
    }
}
