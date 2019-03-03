//Seguridad informatica
//Proyecto 1
//Arturo Borbolla Galván A01701833
//Daniel Zavalza Valentín A01365099
//Alonso Vladimir Salvador Camacho A01700709


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int opt;
        int iters = 1000;

        do {
            System.out.println("Select an option:");
            System.out.println("\n");
            System.out.println("1. Block ciphers: DES,AES, AES256, AESCTR");
            System.out.println("2. Hash algorithms: MD5, Sha-1 & SHA-2");
            System.out.println("3. Async encryption: RSA-OAEP, RSA-PSS");
            System.out.println("0. EXIT.");
            opt = stdin.nextInt();

            switch (opt) {
                case 1:
                    String keyBC, plt, keyA2, pltA2, keyAC,pltAC;
                    keyA2 = "8000000000000000000000000000000000000000000000000000000000000000";
                    pltA2 = "0000000000000000000000000000000000000000000000000000000000000000";
                    keyBC = "8000000000000000";
                    plt = "0000000000000000";
                    keyAC ="2b7e151628aed2a6abf7158809cf4f3c";
                    pltAC="6bc1bee22e409f96e93d7e117393172a";

                    long totalTimeDes = 0;
                    long totalTimeAes = 0;
                    long totalTimeAes256 = 0;
                    long totalTimeAesCTR = 0;

                    System.out.println("\n                                          DES             AES           AES256         AESCTR\n");

                    for (int i = 0; i < iters; i++) {
                        long timeDes = BlockCiphers.getDES(plt,keyBC);
                        long timeAes = BlockCiphers.getAES(plt,keyBC);
                        long timeAes256 = BlockCiphers.getAES256(pltA2,keyA2);
                        long timeAesCTR = BlockCiphers.getAESCTR(pltAC,keyAC);

                        totalTimeDes += timeDes;
                        totalTimeAes += timeAes;
                        totalTimeAes256 += timeAes256;
                        totalTimeAesCTR += timeAesCTR;

                       // System.out.println("Vector 1         " + timeDes + "           " + timeAes + "        " + timeAes256+"      "+timeAesCTR);
                    }

                    System.out.println("\nAverage of 1000 iterations :  Vector 1   " + totalTimeDes / iters + "ns         " + totalTimeAes / iters + "ns        " + totalTimeAes256 / iters + "ns       "+totalTimeAesCTR/iters+ "ns\n");

                    keyA2 = "4000000000000000000000000000000000000000000000000000000000000000";
                    pltA2 = "0000000000000000000000000000000000000000000000000000000000000000";
                    keyBC = "4000000000000000";
                    plt = "0000000000000000";
                    keyAC ="2b7e151628aed2a6abf7158809cf4f3c";
                    pltAC="ae2d8a571e03ac9c9eb76fac45af8e51";

                    totalTimeDes = 0;
                    totalTimeAes = 0;
                    totalTimeAes256 = 0;
                    totalTimeAesCTR = 0;

                    for (int i = 0; i < iters; i++) {
                        long timeDes = BlockCiphers.getDES(plt,keyBC);
                        long timeAes = BlockCiphers.getAES(plt,keyBC);
                        long timeAes256 = BlockCiphers.getAES256(pltA2,keyA2);
                        long timeAesCTR = BlockCiphers.getAESCTR(pltAC,keyAC);

                        totalTimeDes += timeDes;
                        totalTimeAes += timeAes;
                        totalTimeAes256 += timeAes256;
                        totalTimeAesCTR += timeAesCTR;

                       // System.out.println("Vector 1         " + timeDes + "           " + timeAes + "        " + timeAes256+"      "+timeAesCTR);
                    }

                    System.out.println("\nAverage of 1000 iterations :  Vector 2   " + totalTimeDes / iters + "ns         " + totalTimeAes / iters + "ns        " + totalTimeAes256 / iters + "ns       "+totalTimeAesCTR/iters+ "ns\n");

                    keyA2 = "2000000000000000000000000000000000000000000000000000000000000000";
                    pltA2 = "0000000000000000000000000000000000000000000000000000000000000000";
                    keyBC = "2000000000000000";
                    plt = "0000000000000000";
                    keyAC ="2b7e151628aed2a6abf7158809cf4f3c";
                    pltAC="30c81c46a35ce411e5fbc1191a0a52ef";

                    totalTimeDes = 0;
                    totalTimeAes = 0;
                    totalTimeAes256 = 0;
                    totalTimeAesCTR = 0;

                    for (int i = 0; i < iters; i++) {
                        long timeDes = BlockCiphers.getDES(plt,keyBC);
                        long timeAes = BlockCiphers.getAES(plt,keyBC);
                        long timeAes256 = BlockCiphers.getAES256(pltA2,keyA2);
                        long timeAesCTR = BlockCiphers.getAESCTR(pltAC,keyAC);

                        totalTimeDes += timeDes;
                        totalTimeAes += timeAes;
                        totalTimeAes256 += timeAes256;
                        totalTimeAesCTR += timeAesCTR;

                       // System.out.println("Vector 1         " + timeDes + "           " + timeAes + "        " + timeAes256+"      "+timeAesCTR);
                    }

                    System.out.println("\nAverage of 1000 iterations :  Vector 3   " + totalTimeDes / iters + "ns         " + totalTimeAes / iters + "ns        " + totalTimeAes256 / iters + "ns       "+totalTimeAesCTR/iters+ "ns\n");

                    keyA2 = "1000000000000000000000000000000000000000000000000000000000000000";
                    pltA2 = "0000000000000000000000000000000000000000000000000000000000000000";
                    keyBC = "1000000000000000";
                    plt = "0000000000000000";
                    keyAC ="2b7e151628aed2a6abf7158809cf4f3c";
                    pltAC="f69f2445df4f9b17ad2b417be66c3710";

                    totalTimeDes = 0;
                    totalTimeAes = 0;
                    totalTimeAes256 = 0;
                    totalTimeAesCTR = 0;

                    for (int i = 0; i < iters; i++) {
                        long timeDes = BlockCiphers.getDES(plt,keyBC);
                        long timeAes = BlockCiphers.getAES(plt,keyBC);
                        long timeAes256 = BlockCiphers.getAES256(pltA2,keyA2);
                        long timeAesCTR = BlockCiphers.getAESCTR(pltAC,keyAC);

                        totalTimeDes += timeDes;
                        totalTimeAes += timeAes;
                        totalTimeAes256 += timeAes256;
                        totalTimeAesCTR += timeAesCTR;

                       // System.out.println("Vector 1         " + timeDes + "           " + timeAes + "        " + timeAes256+"      "+timeAesCTR);
                    }

                    System.out.println("\nAverage of 1000 iterations :  Vector 4   " + totalTimeDes / iters + "ns         " + totalTimeAes / iters + "ns        " + totalTimeAes256 / iters + "ns       "+totalTimeAesCTR/iters+ "ns\n");

                    keyA2 = "0800000000000000000000000000000000000000000000000000000000000000";
                    pltA2 = "0000000000000000000000000000000000000000000000000000000000000000";
                    keyBC = "0800000000000000";
                    plt = "0000000000000000";
                    keyAC ="8e73b0f7da0e6452c810f32b809079e562f8ead2522c6b7b";
                    pltAC="6bc1bee22e409f96e93d7e117393172a";

                    totalTimeDes = 0;
                    totalTimeAes = 0;
                    totalTimeAes256 = 0;
                    totalTimeAesCTR = 0;

                    for (int i = 0; i < iters; i++) {
                        long timeDes = BlockCiphers.getDES(plt,keyBC);
                        long timeAes = BlockCiphers.getAES(plt,keyBC);
                        long timeAes256 = BlockCiphers.getAES256(pltA2,keyA2);
                        long timeAesCTR = BlockCiphers.getAESCTR(pltAC,keyAC);

                        totalTimeDes += timeDes;
                        totalTimeAes += timeAes;
                        totalTimeAes256 += timeAes256;
                        totalTimeAesCTR += timeAesCTR;

                       // System.out.println("Vector 1         " + timeDes + "           " + timeAes + "        " + timeAes256+"      "+timeAesCTR);
                    }

                    System.out.println("\nAverage of 1000 iterations :  Vector 5   " + totalTimeDes / iters + "ns         " + totalTimeAes / iters + "ns        " + totalTimeAes256 / iters + "ns       "+totalTimeAesCTR/iters+ "ns\n");

                    keyA2 = "0400000000000000000000000000000000000000000000000000000000000000";
                    pltA2 = "0000000000000000000000000000000000000000000000000000000000000000";
                    keyBC = "0400000000000000";
                    plt = "0000000000000000";
                    keyAC ="8e73b0f7da0e6452c810f32b809079e562f8ead2522c6b7b";
                    pltAC="ae2d8a571e03ac9c9eb76fac45af8e51";

                    totalTimeDes = 0;
                    totalTimeAes = 0;
                    totalTimeAes256 = 0;
                    totalTimeAesCTR = 0;

                    for (int i = 0; i < iters; i++) {
                        long timeDes = BlockCiphers.getDES(plt,keyBC);
                        long timeAes = BlockCiphers.getAES(plt,keyBC);
                        long timeAes256 = BlockCiphers.getAES256(pltA2,keyA2);
                        long timeAesCTR = BlockCiphers.getAESCTR(pltAC,keyAC);

                        totalTimeDes += timeDes;
                        totalTimeAes += timeAes;
                        totalTimeAes256 += timeAes256;
                        totalTimeAesCTR += timeAesCTR;

                       // System.out.println("Vector 1         " + timeDes + "           " + timeAes + "        " + timeAes256+"      "+timeAesCTR);
                    }

                    System.out.println("\nAverage of 1000 iterations :  Vector 6   " + totalTimeDes / iters + "ns         " + totalTimeAes / iters + "ns        " + totalTimeAes256 / iters + "ns       "+totalTimeAesCTR/iters+ "ns\n");

                    keyA2 = "0200000000000000000000000000000000000000000000000000000000000000";
                    pltA2 = "0000000000000000000000000000000000000000000000000000000000000000";
                    keyBC = "0200000000000000";
                    plt = "0000000000000000";
                    keyAC ="8e73b0f7da0e6452c810f32b809079e562f8ead2522c6b7b";
                    pltAC="30c81c46a35ce411e5fbc1191a0a52ef";

                    totalTimeDes = 0;
                    totalTimeAes = 0;
                    totalTimeAes256 = 0;
                    totalTimeAesCTR = 0;

                    for (int i = 0; i < iters; i++) {
                        long timeDes = BlockCiphers.getDES(plt,keyBC);
                        long timeAes = BlockCiphers.getAES(plt,keyBC);
                        long timeAes256 = BlockCiphers.getAES256(pltA2,keyA2);
                        long timeAesCTR = BlockCiphers.getAESCTR(pltAC,keyAC);

                        totalTimeDes += timeDes;
                        totalTimeAes += timeAes;
                        totalTimeAes256 += timeAes256;
                        totalTimeAesCTR += timeAesCTR;

                       // System.out.println("Vector 1         " + timeDes + "           " + timeAes + "        " + timeAes256+"      "+timeAesCTR);
                    }

                    System.out.println("\nAverage of 1000 iterations :  Vector 7   " + totalTimeDes / iters + "ns         " + totalTimeAes / iters + "ns        " + totalTimeAes256 / iters + "ns       "+totalTimeAesCTR/iters+ "ns\n");

                    keyA2 = "0100000000000000000000000000000000000000000000000000000000000000";
                    pltA2 = "0000000000000000000000000000000000000000000000000000000000000000";
                    keyBC = "0100000000000000";
                    plt = "0000000000000000";
                    keyAC ="8e73b0f7da0e6452c810f32b809079e562f8ead2522c6b7b";
                    pltAC="f69f2445df4f9b17ad2b417be66c3710";

                    totalTimeDes = 0;
                    totalTimeAes = 0;
                    totalTimeAes256 = 0;
                    totalTimeAesCTR = 0;

                    for (int i = 0; i < iters; i++) {
                        long timeDes = BlockCiphers.getDES(plt,keyBC);
                        long timeAes = BlockCiphers.getAES(plt,keyBC);
                        long timeAes256 = BlockCiphers.getAES256(pltA2,keyA2);
                        long timeAesCTR = BlockCiphers.getAESCTR(pltAC,keyAC);

                        totalTimeDes += timeDes;
                        totalTimeAes += timeAes;
                        totalTimeAes256 += timeAes256;
                        totalTimeAesCTR += timeAesCTR;

                       // System.out.println("Vector 1         " + timeDes + "           " + timeAes + "        " + timeAes256+"      "+timeAesCTR);
                    }

                    System.out.println("\nAverage of 1000 iterations :  Vector 8   " + totalTimeDes / iters + "ns         " + totalTimeAes / iters + "ns        " + totalTimeAes256 / iters + "ns       "+totalTimeAesCTR/iters+ "ns\n");

                    keyA2 = "0080000000000000000000000000000000000000000000000000000000000000";
                    pltA2 = "0000000000000000000000000000000000000000000000000000000000000000";
                    keyBC = "0080000000000000";
                    plt = "0000000000000000";
                    keyAC ="603deb1015ca71be2b73aef0857d77811f352c073b6108d72d9810a30914dff4";
                    pltAC="6bc1bee22e409f96e93d7e117393172a";

                    totalTimeDes = 0;
                    totalTimeAes = 0;
                    totalTimeAes256 = 0;
                    totalTimeAesCTR = 0;

                    for (int i = 0; i < iters; i++) {
                        long timeDes = BlockCiphers.getDES(plt,keyBC);
                        long timeAes = BlockCiphers.getAES(plt,keyBC);
                        long timeAes256 = BlockCiphers.getAES256(pltA2,keyA2);
                        long timeAesCTR = BlockCiphers.getAESCTR(pltAC,keyAC);

                        totalTimeDes += timeDes;
                        totalTimeAes += timeAes;
                        totalTimeAes256 += timeAes256;
                        totalTimeAesCTR += timeAesCTR;

                       // System.out.println("Vector 1         " + timeDes + "           " + timeAes + "        " + timeAes256+"      "+timeAesCTR);
                    }

                    System.out.println("\nAverage of 1000 iterations :  Vector 9   " + totalTimeDes / iters + "ns         " + totalTimeAes / iters + "ns        " + totalTimeAes256 / iters + "ns       "+totalTimeAesCTR/iters+ "ns\n");

                    keyA2 = "0040000000000000000000000000000000000000000000000000000000000000";
                    pltA2 = "0000000000000000000000000000000000000000000000000000000000000000";
                    keyBC = "0040000000000000";
                    plt = "0000000000000000";
                    keyAC ="603deb1015ca71be2b73aef0857d77811f352c073b6108d72d9810a30914dff4";
                    pltAC="ae2d8a571e03ac9c9eb76fac45af8e51";

                    totalTimeDes = 0;
                    totalTimeAes = 0;
                    totalTimeAes256 = 0;
                    totalTimeAesCTR = 0;

                    for (int i = 0; i < iters; i++) {
                        long timeDes = BlockCiphers.getDES(plt,keyBC);
                        long timeAes = BlockCiphers.getAES(plt,keyBC);
                        long timeAes256 = BlockCiphers.getAES256(pltA2,keyA2);
                        long timeAesCTR = BlockCiphers.getAESCTR(pltAC,keyAC);

                        totalTimeDes += timeDes;
                        totalTimeAes += timeAes;
                        totalTimeAes256 += timeAes256;
                        totalTimeAesCTR += timeAesCTR;

                       // System.out.println("Vector 1         " + timeDes + "           " + timeAes + "        " + timeAes256+"      "+timeAesCTR);
                    }

                    System.out.println("\nAverage of 1000 iterations :  Vector 10  " + totalTimeDes / iters + "ns         " + totalTimeAes / iters + "ns        " + totalTimeAes256 / iters + "ns       "+totalTimeAesCTR/iters+ "ns\n");

                    break;
                case 2:
                    String text = "";

                    long totalTimeMd5 = 0;
                    long totalTimeSha1 = 0;
                    long totalTimeSha2 = 0;

                    System.out.println("\n                        MD5                SHA-1             SHA-2 \n");

                    for (int i = 0; i < iters; i++) {
                        long timeMd5 = HashAlgorithms.getMd5(text);
                        long timeSha1 = HashAlgorithms.getSHA1(text);
                        long timeSha2 = HashAlgorithms.getSHA2(text);

                        totalTimeMd5 += timeMd5;
                        totalTimeSha1 += timeSha1;
                        totalTimeSha2 += timeSha2;

                       // System.out.println("Vector" + i + "   " + text + "       " + timeMd5 + "          " + timeSha1 + "               " + timeSha2 + "\n");
                    }

                    System.out.println("\nAverage:   Vector 1    " + totalTimeMd5 / iters + "ns         " + totalTimeSha1 / iters + "ns               " + totalTimeSha2 / iters + "ns\n");

                    text = "a";

                    totalTimeMd5 = 0;
                    totalTimeSha1 = 0;
                    totalTimeSha2 = 0;

                
                    for (int i = 0; i < iters; i++) {
                        long timeMd5 = HashAlgorithms.getMd5(text);
                        long timeSha1 = HashAlgorithms.getSHA1(text);
                        long timeSha2 = HashAlgorithms.getSHA2(text);

                        totalTimeMd5 += timeMd5;
                        totalTimeSha1 += timeSha1;
                        totalTimeSha2 += timeSha2;

                       // System.out.println("Vector" + i + "   " + text + "       " + timeMd5 + "          " + timeSha1 + "               " + timeSha2 + "\n");
                    }

                    System.out.println("\nAverage:   Vector 2    " + totalTimeMd5 / iters + "ns         " + totalTimeSha1 / iters + "ns               " + totalTimeSha2 / iters + "ns\n");
                    
                    text = "abc";

                    totalTimeMd5 = 0;
                    totalTimeSha1 = 0;
                    totalTimeSha2 = 0;

              
                    for (int i = 0; i < iters; i++) {
                        long timeMd5 = HashAlgorithms.getMd5(text);
                        long timeSha1 = HashAlgorithms.getSHA1(text);
                        long timeSha2 = HashAlgorithms.getSHA2(text);

                        totalTimeMd5 += timeMd5;
                        totalTimeSha1 += timeSha1;
                        totalTimeSha2 += timeSha2;

                       // System.out.println("Vector" + i + "   " + text + "       " + timeMd5 + "          " + timeSha1 + "               " + timeSha2 + "\n");
                    }

                    System.out.println("\nAverage:   Vector 3    " + totalTimeMd5 / iters + "ns         " + totalTimeSha1 / iters + "ns               " + totalTimeSha2 / iters + "ns\n");
                    
                    text = "message digest";

                    totalTimeMd5 = 0;
                    totalTimeSha1 = 0;
                    totalTimeSha2 = 0;

                    for (int i = 0; i < iters; i++) {
                        long timeMd5 = HashAlgorithms.getMd5(text);
                        long timeSha1 = HashAlgorithms.getSHA1(text);
                        long timeSha2 = HashAlgorithms.getSHA2(text);

                        totalTimeMd5 += timeMd5;
                        totalTimeSha1 += timeSha1;
                        totalTimeSha2 += timeSha2;

                       // System.out.println("Vector" + i + "   " + text + "       " + timeMd5 + "          " + timeSha1 + "               " + timeSha2 + "\n");
                    }

                    System.out.println("\nAverage:   Vector 4    " + totalTimeMd5 / iters + "ns         " + totalTimeSha1 / iters + "ns               " + totalTimeSha2 / iters + "ns\n");
                    
                    text = "abcdefghijklmnopqrstuvwxyz";

                    totalTimeMd5 = 0;
                    totalTimeSha1 = 0;
                    totalTimeSha2 = 0;

            
                    for (int i = 0; i < iters; i++) {
                        long timeMd5 = HashAlgorithms.getMd5(text);
                        long timeSha1 = HashAlgorithms.getSHA1(text);
                        long timeSha2 = HashAlgorithms.getSHA2(text);

                        totalTimeMd5 += timeMd5;
                        totalTimeSha1 += timeSha1;
                        totalTimeSha2 += timeSha2;

                       // System.out.println("Vector" + i + "   " + text + "       " + timeMd5 + "          " + timeSha1 + "               " + timeSha2 + "\n");
                    }

                    System.out.println("\nAverage:   Vector 5    " + totalTimeMd5 / iters + "ns         " + totalTimeSha1 / iters + "ns               " + totalTimeSha2 / iters + "ns\n");
                    
                    text = "abcdbcdecdefdefgefghfghighijhijkijkljklmklmnlmnomnopnopq";

                    totalTimeMd5 = 0;
                    totalTimeSha1 = 0;
                    totalTimeSha2 = 0;

                
                    for (int i = 0; i < iters; i++) {
                        long timeMd5 = HashAlgorithms.getMd5(text);
                        long timeSha1 = HashAlgorithms.getSHA1(text);
                        long timeSha2 = HashAlgorithms.getSHA2(text);

                        totalTimeMd5 += timeMd5;
                        totalTimeSha1 += timeSha1;
                        totalTimeSha2 += timeSha2;

                       // System.out.println("Vector" + i + "   " + text + "       " + timeMd5 + "          " + timeSha1 + "               " + timeSha2 + "\n");
                    }

                    System.out.println("\nAverage:   Vector 6    " + totalTimeMd5 / iters + "ns         " + totalTimeSha1 / iters + "ns               " + totalTimeSha2 / iters + "ns\n");
                    
                    text = "A...Za...z0...9";

                    totalTimeMd5 = 0;
                    totalTimeSha1 = 0;
                    totalTimeSha2 = 0;

                    for (int i = 0; i < iters; i++) {
                        long timeMd5 = HashAlgorithms.getMd5(text);
                        long timeSha1 = HashAlgorithms.getSHA1(text);
                        long timeSha2 = HashAlgorithms.getSHA2(text);

                        totalTimeMd5 += timeMd5;
                        totalTimeSha1 += timeSha1;
                        totalTimeSha2 += timeSha2;

                       // System.out.println("Vector" + i + "   " + text + "       " + timeMd5 + "          " + timeSha1 + "               " + timeSha2 + "\n");
                    }

                    System.out.println("\nAverage:   Vector 7    " + totalTimeMd5 / iters + "ns         " + totalTimeSha1 / iters + "ns               " + totalTimeSha2 / iters + "ns\n");
                    
                    text = "1234567890";

                    totalTimeMd5 = 0;
                    totalTimeSha1 = 0;
                    totalTimeSha2 = 0;

         
                    for (int i = 0; i < iters; i++) {
                        long timeMd5 = HashAlgorithms.getMd5(text);
                        long timeSha1 = HashAlgorithms.getSHA1(text);
                        long timeSha2 = HashAlgorithms.getSHA2(text);

                        totalTimeMd5 += timeMd5;
                        totalTimeSha1 += timeSha1;
                        totalTimeSha2 += timeSha2;

                       // System.out.println("Vector" + i + "   " + text + "       " + timeMd5 + "          " + timeSha1 + "               " + timeSha2 + "\n");
                    }

                    System.out.println("\nAverage:   Vector 8    " + totalTimeMd5 / iters + "ns         " + totalTimeSha1 / iters + "ns               " + totalTimeSha2 / iters + "ns\n");
                    
                    text = "a";

                    totalTimeMd5 = 0;
                    totalTimeSha1 = 0;
                    totalTimeSha2 = 0;

         
                    for (int i = 0; i < iters; i++) {
                        long timeMd5 = HashAlgorithms.getMd5(text);
                        long timeSha1 = HashAlgorithms.getSHA1(text);
                        long timeSha2 = HashAlgorithms.getSHA2(text);

                        totalTimeMd5 += timeMd5;
                        totalTimeSha1 += timeSha1;
                        totalTimeSha2 += timeSha2;

                       // System.out.println("Vector" + i + "   " + text + "       " + timeMd5 + "          " + timeSha1 + "               " + timeSha2 + "\n");
                    }

                    System.out.println("\nAverage:   Vector 9    " + totalTimeMd5 / iters + "ns         " + totalTimeSha1 / iters + "ns               " + totalTimeSha2 / iters + "ns\n");
                    
                    text = "";

                    totalTimeMd5 = 0;
                    totalTimeSha1 = 0;
                    totalTimeSha2 = 0;

         
                    for (int i = 0; i < iters; i++) {
                        long timeMd5 = HashAlgorithms.getMd5(text);
                        long timeSha1 = HashAlgorithms.getSHA1(text);
                        long timeSha2 = HashAlgorithms.getSHA2(text);

                        totalTimeMd5 += timeMd5;
                        totalTimeSha1 += timeSha1;
                        totalTimeSha2 += timeSha2;

                       // System.out.println("Vector" + i + "   " + text + "       " + timeMd5 + "          " + timeSha1 + "               " + timeSha2 + "\n");
                    }

                    System.out.println("\nAverage:   Vector 10   " + totalTimeMd5 / iters + "ns         " + totalTimeSha1 / iters + "ns               " + totalTimeSha2 / iters + "ns\n");
                    
                    
                    break;

                case 3:
                    String keyAs = "9195E9854FA04A1433D4E22048951426A0ACFC6FE446730579D742CAEA5FDF6590FAEC7F71F3EBF0C6408564987D07E19EC07BC0F601B5E6ADB28D9AA6148FCC51CFF393178983790CC616C0EF34AB50DC8444F44E24117B46A47FA3630BF7E696865BFC245F7C3A314CD48C583D7B2223AF06881158557E37B3CC370AE6C8D5";
                    String message = "0000000000000000000000000000000000000000";

                    long totalTimeRSAPSS = 0;
                    long totalTimeRSAOAEP = 0;

                    System.out.println("\n              RSA-PSS        RSA-OAEP \n");

                    for (int i = 0; i < iters; i++) {
                        long timeRSAPSS = AsyncAlgorithms.getRSA_PSS(message, keyAs);
                        long timeRSAOAEP = AsyncAlgorithms.getRSA_OAEP(message, keyAs);

                        totalTimeRSAPSS += timeRSAPSS;
                        totalTimeRSAOAEP += timeRSAOAEP;

                        System.out.println("Vector" + i + "      " + timeRSAPSS + "ns        " + timeRSAOAEP + "ns\n");
                    }

                    System.out.println("\nAverage:      " + totalTimeRSAPSS / iters + "ns      " + totalTimeRSAOAEP / iters + "ns\n");
                    break;

                    default: break;
            }
        } while (opt != 0);
    }
}