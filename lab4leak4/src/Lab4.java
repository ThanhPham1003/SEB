// var. 273223
public class Lab4 {
    public static void main(String[] args) {
        A a = new A();
        A b = new D();
        D c = new D();
        c.y36();
        c.y25();
        a.y48();
        b.y45();
        b.y30();
        b.y43();
        c.y7();
        b.y34();
        b.y21();
        a.y27();
        c.y20(a);
        b.y20(b);
        c.y20(c);
        c.y42();
        c.y40();
        c.y22();
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        D d = new D();
                        d.y2();
                        Thread.sleep(7);
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
}
class A {
    int y4;
    int y31;
    int y41;
    int y49;
    int y37;
    long y47;
    long y10;
    long y5;
    java.io.ObjectOutputStream testStream;
    java.io.ObjectOutputStream fileWriter;
    java.io.ObjectOutputStream stringsWrtr;
    int[] y6 = {0, 1, 0, -3};
    int[] y44 = {3, 3, 3, 0, 2};
    int[] y11 = {-3, 2, 0, 1};
    static java.util.Map<java.net.URL,byte[]> cache = new java.util.HashMap<>();
    static int y8;
    static int y46;
    static int y19;
    static int y18;
    static int y3;
    java.util.List<String> y17 = new java.util.ArrayList<>();
    java.util.List<String> y50 = new java.util.ArrayList<>();
    java.util.List<String> y35 = new java.util.ArrayList<>();
    public A() {
        y4 = 5;
        y31 = 7;
        y41 = 2;
        y49 = 2;
        y37 = 1;
        y47 = 6L;
        y10 = 0L;
        y5 = 9L;
        try {
            testStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream("testStream.txt"));
            fileWriter = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileWriter.txt"));
            stringsWrtr = new java.io.ObjectOutputStream(new java.io.FileOutputStream("stringsWrtr.txt"));
        } catch (java.lang.Exception e) {
            // Do nothing
        }
    }
    public void init() {
        try {
            if (testStream == null) testStream = new java.io.ObjectOutputStream(new java.io.FileOutputStream("testStream.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", testStream = " + testStream);
        } catch(Exception e) {
            // Ignore it
        }
        try {
            if (fileWriter == null) fileWriter = new java.io.ObjectOutputStream(new java.io.FileOutputStream("fileWriter.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", fileWriter = " + fileWriter);
        } catch(Exception e) {
            // Ignore it
        }
        try {
            if (stringsWrtr == null) stringsWrtr = new java.io.ObjectOutputStream(new java.io.FileOutputStream("stringsWrtr.txt"));
            System.out.println("Thread : " + Thread.currentThread() + ", stringsWrtr = " + stringsWrtr);
        } catch(Exception e) {
            // Ignore it
        }
    }
    public byte[] getValueFromCache(String s) {
        try {
            java.net.URL url = new java.net.URL(s);
            if(!cache.containsKey(url)) {
                cache.put(url, new byte[1310720]);
            }
            return cache.get(url);
        } catch (Exception e) {
            System.out.println("Error: invalid URL!");
            return null;
        }
    }
    public void y36() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileWriter) {
                            fileWriter.writeObject("метод y36 в классе A (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            fileWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y25() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileWriter) {
                            fileWriter.writeObject("метод y25 в классе A (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            fileWriter.flush();
                            fileWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y48() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(testStream) {
                            testStream.writeObject("метод y48 в классе A (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            testStream.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y45() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileWriter) {
                            fileWriter.writeObject("метод y45 в классе A (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            fileWriter.flush();
                            fileWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y30() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(testStream) {
                            testStream.writeObject("метод y30 в классе A (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            testStream.flush();
                            testStream.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y43() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(stringsWrtr) {
                            stringsWrtr.writeObject("метод y43 в классе A (#" + String.valueOf(i) + ")");
                            Thread.sleep(5);
                            stringsWrtr.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void y7() {
        System.out.println("метод y7 в классе A");
        System.out.println(y8);
    }
    public static void y34() {
        System.out.println("метод y34 в классе A");
        System.out.println((y8 - 1));
    }
    public static void y21() {
        System.out.println("метод y21 в классе A");
        System.out.println(y46);
    }
    public static void y27() {
        System.out.println("метод y27 в классе A");
        System.out.println((y46 - 3));
    }
    public void y20(A r) {
        r.y36();
    }
    public void y20(D r) {
        r.y25();
    }
}
class D extends A {
    public D() {
        y31 = 0;
        y49 = 6;
    }
    public void y36() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(testStream) {
                            testStream.writeObject("метод y36 в классе D (#" + String.valueOf(i) + ")");
                            Thread.sleep(6);
                            testStream.flush();
                            testStream.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y48() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileWriter) {
                            fileWriter.writeObject("метод y48 в классе D (#" + String.valueOf(i) + ")");
                            Thread.sleep(10);
                            fileWriter.flush();
                            fileWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y30() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                init();
                int i = 0;
                while(true) {
                    i++;
                    try {
                        synchronized(fileWriter) {
                            fileWriter.writeObject("метод y30 в классе D (#" + String.valueOf(i) + ")");
                            Thread.sleep(13);
                            fileWriter.reset();
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y42() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(9);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y40() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(7);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public void y22() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                while(true) {
                    try {
                        synchronized(cache) {
                            getValueFromCache("https://www.google.com");
                            Thread.sleep(14);
                        }
                    } catch(Exception e) {
                        // Do nothing
                    }
                }
            }
        });
        t.start();
    }
    public static void y7() {
        System.out.println("метод y7 в классе D");
        System.out.println(--y8);
    }
    public static void y34() {
        System.out.println("метод y34 в классе D");
        System.out.println(y46);
    }
    public static void y21() {
        System.out.println("метод y21 в классе D");
        System.out.println((y46 - 1));
    }
    public static void y27() {
        System.out.println("метод y27 в классе D");
        System.out.println(y46);
    }
    public void y2() {
        for(int i = 0; i < 5; i++) {
            this.y50.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.y50.size());
        }
    }
    public void y23() {
        for(int i = 0; i < 7; i++) {
            this.y17.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.y17.size());
        }
    }
    public void y32() {
        for(int i = 0; i < 5; i++) {
            this.y17.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.y17.size());
        }
    }
    public void y24() {
        for(int i = 0; i < 7; i++) {
            this.y17.add(String.valueOf(System.nanoTime()));
            // System.out.println(this.y17.size());
        }
    }
    public void y20(A r) {
        r.y48();
    }
    public void y20(D r) {
        r.y45();
    }
}