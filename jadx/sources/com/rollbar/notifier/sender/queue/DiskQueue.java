package com.rollbar.notifier.sender.queue;

import com.rollbar.api.payload.Payload;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import va.a;
import va.b;

/* JADX INFO: loaded from: classes.dex */
public class DiskQueue extends AbstractQueue<Payload> {
    private static final String FILENAME_NAME_FORMAT = "%s.%s";
    private static final String FILENAME_SUFFIX = "payload";
    private static a LOGGER = b.e(DiskQueue.class);
    private static final String QUEUE_FOLDER = ".rollbar-queue";
    private static final int UNBOUNDED_QUEUE = 0;
    private final int maxSize;
    private final File queueFolder;

    public static final class Builder {
        private int maxSize = 0;
        private File queueFolder;

        public DiskQueue build() {
            if (this.queueFolder == null) {
                this.queueFolder = new File(DiskQueue.QUEUE_FOLDER);
            }
            return new DiskQueue(this);
        }

        public Builder maxSize(int i10) {
            this.maxSize = i10;
            return this;
        }

        public Builder queueFolder(File file) {
            this.queueFolder = file;
            return this;
        }
    }

    public static final class PayloadIterator implements Iterator<Payload> {
        private final Iterator<File> it;

        public PayloadIterator(Iterator<File> it) {
            this.it = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.it.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.it.remove();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Payload next() {
            return DiskQueue.read(this.it.next(), false);
        }
    }

    private static String createFilename(Payload payload) {
        return p231y.a.c((payload.getData() == null || payload.getData().getUuid() == null) ? UUID.randomUUID().toString() : payload.getData().getUuid(), ".payload");
    }

    private List<File> getFiles() {
        File[] fileArrListFiles = this.queueFolder.listFiles();
        if (fileArrListFiles == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.getName().endsWith(FILENAME_SUFFIX)) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    private boolean isFull() {
        return this.maxSize > 0 && size() >= this.maxSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Payload read(File file, boolean z6) throws Throwable {
        ObjectInputStream objectInputStream;
        Throwable th;
        Exception e10;
        boolean z10 = false;
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
            try {
                try {
                    Payload payload = (Payload) objectInputStream.readObject();
                    if (z6 && !file.delete()) {
                        LOGGER.a(file.getPath());
                    }
                    L6.b.a(objectInputStream);
                    return payload;
                } catch (Exception e11) {
                    e10 = e11;
                    z10 = true;
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                th = th2;
                if ((z6 || z10) && !file.delete()) {
                    LOGGER.a(file.getPath());
                }
                L6.b.a(objectInputStream);
                throw th;
            }
        } catch (Exception e12) {
            objectInputStream = null;
            e10 = e12;
        } catch (Throwable th3) {
            objectInputStream = null;
            th = th3;
            if (z6) {
                LOGGER.a(file.getPath());
            } else {
                LOGGER.a(file.getPath());
            }
            L6.b.a(objectInputStream);
            throw th;
        }
    }

    private Payload readFromFile(boolean z6) {
        if (getFiles().size() > 0) {
            return read(getFiles().get(0), z6);
        }
        return null;
    }

    private void writeToFile(Payload payload) throws Throwable {
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new FileOutputStream(new File(this.queueFolder.getAbsolutePath(), createFilename(payload))));
                try {
                    objectOutputStream2.writeObject(payload);
                    L6.b.a(objectOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    objectOutputStream = objectOutputStream2;
                    throw new RuntimeException(e);
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    L6.b.a(objectOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<Payload> iterator() {
        return new PayloadIterator(getFiles().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return getFiles().size();
    }

    private DiskQueue(Builder builder) {
        this.maxSize = builder.maxSize;
        File file = builder.queueFolder;
        this.queueFolder = file;
        if (!file.exists() && !file.mkdirs()) {
            throw new RuntimeException("Could not create folder: " + file);
        }
        if (file.canRead() && file.canWrite()) {
            return;
        }
        throw new RuntimeException("Not enough permissions folder: " + file);
    }

    @Override // java.util.Queue
    public boolean offer(Payload payload) throws Throwable {
        if (isFull()) {
            return false;
        }
        writeToFile(payload);
        return true;
    }

    @Override // java.util.Queue
    public Payload peek() {
        return readFromFile(false);
    }

    @Override // java.util.Queue
    public Payload poll() {
        return readFromFile(true);
    }
}
